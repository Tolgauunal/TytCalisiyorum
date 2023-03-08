package com.tolgaunal.tytcaslisiyorum.ChipNavigation.Profil;

import static android.app.Activity.RESULT_OK;

import android.Manifest;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.InsetDrawable;
import android.net.Uri;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;

import android.provider.MediaStore;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.PopupMenu;
import android.widget.TextView;

import com.tolgaunal.tytcaslisiyorum.R;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

import de.hdodenhof.circleimageview.CircleImageView;

public class Profil extends Fragment {
    View view;
    ImageView editImage;
    CircleImageView profilImage;
    EditText degisenAd;
    TextView kayitliAd, customDialogTextView, customDialogBaslik;
    FrameLayout frameLayout;
    Button ismiKaydet, customDialogButtonClose;
    Bitmap selectedImage;
    SQLiteDatabase sqLiteDatabase;
    Button gizlilik, sartlarKosullar, oyVerin, hataBildir, iletisim;
    ImageButton customDialogClose;
    String girilenIsim;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_profil, container, false);
        editImage = view.findViewById(R.id.profil_duzenle_image);
        profilImage = view.findViewById(R.id.profil_resim_image);
        degisenAd = view.findViewById(R.id.profil_name_textview);
        kayitliAd = view.findViewById(R.id.profil_kayitliAd);
        frameLayout = view.findViewById(R.id.profil_framelayout);
        ismiKaydet = view.findViewById(R.id.profil_kaydetButton);
        gizlilik = view.findViewById(R.id.gizlilik);
        sartlarKosullar = view.findViewById(R.id.sartlar);
        oyVerin = view.findViewById(R.id.bizeoyverin);
        hataBildir = view.findViewById(R.id.hatabildir);
        iletisim = view.findViewById(R.id.contact);
        sqLiteDatabase = getContext().openOrCreateDatabase("Profil", Context.MODE_PRIVATE, null);
        editImage.setOnClickListener(view -> {
            PopupMenu popupMenu = new PopupMenu(view.getContext(), view);
            popupMenu.inflate(R.menu.profil_duzenle);
            popupMenu.setOnMenuItemClickListener(menuItem -> {
                switch (menuItem.getItemId()) {
                    case R.id.adiDeğiştir:
                        adiDegistir();
                        break;
                    case R.id.profilResminiDeğiştir:
                        profilResimGetir();
                        break;
                }
                return false;
            });
            popupMenu.show();
        });

        try {
            sqLiteDatabase = getContext().openOrCreateDatabase("Profil", Context.MODE_PRIVATE, null);
            sqLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS profil (image BLOB)");
            sqLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS ad (name VARCHAR)");
        } catch (Exception e) {
            System.out.println(e.getLocalizedMessage());
        }
        verileriCek();
        gizlilik.setOnClickListener(view -> gizlilikGoster());
        sartlarKosullar.setOnClickListener(view1 -> sartlarKosullarGoster());
        oyVerin.setOnClickListener(view1 -> googlePlay());
        hataBildir.setOnClickListener(view1 -> hataBildirGmail());
        iletisim.setOnClickListener(view1 -> contact());
        return view;
    }

    private void contact() {
        String email = "unallapps@gmail.com";
        String[] adresses = email.split(",");
        Intent intent = new Intent(Intent.ACTION_SENDTO);
        intent.setData(Uri.parse("mailto:"));
        intent.putExtra(Intent.EXTRA_EMAIL, adresses);
        startActivity(intent);
    }

    private void hataBildirGmail() {
        String email = "unallapps@gmail.com";
        String[] adresses = email.split(",");
        Intent intent = new Intent(Intent.ACTION_SENDTO);
        intent.setData(Uri.parse("mailto:"));
        intent.putExtra(Intent.EXTRA_EMAIL, adresses);
        startActivity(intent);
    }

    private void googlePlay() {
        /*
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("https://play.google.com/store/apps/details?id=com.unallapps.aktuelurunlerr&hl=tr&gl=US"));
        startActivity(intent);*/
    }

    private void dialogCagir() {
        Dialog dialog = new Dialog(getContext());
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.setCancelable(false);
        dialog.setContentView(R.layout.customdialog);
        ColorDrawable back = new ColorDrawable(Color.TRANSPARENT);
        InsetDrawable inset = new InsetDrawable(back, 100);
        Window window = dialog.getWindow();
        window.setLayout(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        dialog.getWindow().setBackgroundDrawable(inset);
        dialog.show();
        customDialogClose = dialog.findViewById(R.id.custom_close);
        customDialogButtonClose = dialog.findViewById(R.id.custom_Button_Close);
        customDialogTextView = dialog.findViewById(R.id.custom_dialog_icerik);
        customDialogBaslik = dialog.findViewById(R.id.custom_baslik);
        customDialogClose.setOnClickListener(view1 -> dialog.dismiss());
        customDialogButtonClose.setOnClickListener(view1 -> dialog.dismiss());

    }

    private void sartlarKosullarGoster() {
        dialogCagir();
        customDialogBaslik.setText("Şartlar ve Koşullar");
        customDialogTextView.setText("Uygulamayı indirerek veya kullanarak bu şartlar sizin için otomatik olarak geçerli olacaktır - bu nedenle uygulamayı kullanmadan önce bunları dikkatlice okuduğunuzdan emin olmalısınız. Uygulamayı, uygulamanın herhangi bir bölümünü veya ticari markalarımızı hiçbir şekilde kopyalamanıza veya değiştirmenize izin verilmez. Uygulamanın kaynak kodunu çıkarmaya çalışmanıza izin verilmez ve ayrıca uygulamayı başka dillere çevirmeye veya türev sürümler oluşturmaya çalışmamalısınız. Uygulamanın kendisi ve buna ilişkin tüm ticari markalar, telif hakları, veritabanı hakları ve diğer fikri mülkiyet hakları halen Tolga Ünal'a aittir.\n" +
                "\n" +
                "Tolga Ünal, uygulamanın olabildiğince kullanışlı ve verimli olmasını sağlamaya kararlıdır. Bu nedenle, herhangi bir zamanda ve herhangi bir nedenle uygulamada değişiklik yapma veya hizmetleri için ücret alma hakkını saklı tutarız. Tam olarak ne için ödeme yaptığınızı size açıkça belirtmeden, uygulama veya hizmetleri için sizden asla ücret almayacağız.\n" +
                "\n" +
                "Kpss Çalışıyorum uygulaması, Hizmetimi sağlamak için bize sağladığınız kişisel verileri saklar ve işler. Telefonunuzu ve uygulamaya erişimi güvenli tutmak sizin sorumluluğunuzdadır. Bu nedenle, cihazınızın resmi işletim sistemi tarafından dayatılan yazılım kısıtlamalarını ve sınırlamalarını kaldırma işlemi olan telefonunuzu jailbreak veya root yapmamanızı öneririz. Telefonunuzu kötü amaçlı yazılımlara/virüslere/kötü amaçlı programlara karşı savunmasız hale getirebilir, telefonunuzun güvenlik özelliklerini tehlikeye atabilir ve Kpss Çalışıyorum uygulamasının düzgün çalışmaması veya hiç çalışmaması anlamına gelebilir.\n" +
                "\n" +
                "Uygulama, Hüküm ve Koşullarını beyan eden üçüncü taraf hizmetlerini kullanır.\n" +
                "\n" +
                "Uygulama tarafından kullanılan üçüncü taraf hizmet sağlayıcıların Hüküm ve Koşullarına bağlantı" +
                "AdMob\n" +
                "Tolga Ünal'ın sorumluluk almayacağı bazı şeyler olduğunu bilmelisiniz. Uygulamanın belirli işlevleri, uygulamanın etkin bir internet bağlantısına sahip olmasını gerektirir. Bağlantı Wi-Fi olabilir veya mobil ağ sağlayıcınız tarafından sağlanabilir, ancak Wi-Fi erişiminiz yoksa ve herhangi bir bağlantınız yoksa Tolga Ünal uygulamanın tam işlevsellikte çalışmamasından sorumlu tutulamaz. veri payı kaldı.\n" +
                "\n" +
                "Uygulamayı Wi-Fi bulunan bir alanın dışında kullanıyorsanız, mobil ağ sağlayıcınızla yaptığınız sözleşmenin şartlarının yine de geçerli olacağını unutmamalısınız. Sonuç olarak, uygulamaya erişirken bağlantı süresince veri maliyeti veya diğer üçüncü taraf ücretleri için mobil sağlayıcınız tarafından sizden ücret alınabilir. Uygulamayı kullanırken, veri dolaşımını kapatmadan uygulamayı kendi ülkenizin dışında (yani bölge veya ülke) kullanırsanız, dolaşım veri ücretleri de dahil olmak üzere bu tür ücretlerin sorumluluğunu kabul etmiş olursunuz. Uygulamayı kullandığınız cihazın fatura ödeyen tarafı siz değilseniz, uygulamayı kullanmak için fatura ödeyen kişiden izin aldığınızı varsaydığımızı lütfen unutmayın.\n" +
                "\n" +
                "Aynı şekilde, Tolga Ünal, uygulamayı kullanma şekliniz konusunda her zaman sorumluluk alamaz, yani cihazınızın şarjlı kaldığından emin olmanız gerekir - pili biterse ve Hizmeti kullanmak için açamazsanız, Tolga Ünal sorumluluk kabul edemez.\n" +
                "\n" +
                "Tolga Ünal'ın uygulamayı kullanımınıza ilişkin sorumluluğu ile ilgili olarak, uygulamayı kullanırken, her zaman güncel ve doğru olmasını sağlamaya çalışmamıza rağmen, üçüncü taraflara güvendiğimizi unutmamak önemlidir. bilgileri size sunabilmemiz için bize sağlayın. Tolga Ünal, tamamen uygulamanın bu işlevine güvenmeniz sonucunda uğrayacağınız doğrudan veya dolaylı hiçbir kayıptan sorumlu tutulamaz." +
                "Bir noktada, uygulamayı güncellemek isteyebiliriz. Uygulama şu anda Android'de mevcuttur - sistem (ve uygulamanın kullanılabilirliğini genişletmeye karar verdiğimiz ek sistemler için) gereksinimleri değişebilir ve uygulamayı kullanmaya devam etmek istiyorsanız güncellemeleri indirmeniz gerekir . Tolga Ünal, uygulamayı sizinle alakalı olacak ve/veya cihazınıza yüklediğiniz Android sürümü ile çalışacak şekilde her zaman güncelleyeceğinin sözünü vermez. Ancak, size teklif edildiğinde uygulamaya ilişkin güncellemeleri her zaman kabul edeceğinize söz verirsiniz, ayrıca uygulamayı sağlamayı durdurmak isteyebiliriz ve size herhangi bir fesih bildiriminde bulunmaksızın uygulamayı herhangi bir zamanda sonlandırabiliriz. Size aksini söylemediğimiz sürece, herhangi bir fesih üzerine, (a) bu şartlarda size verilen haklar ve lisanslar sona erecektir; (b) uygulamayı kullanmayı bırakmalı ve (gerekirse) cihazınızdan silmelisiniz.\n" +
                "\n" +
                "Bu Hüküm ve Koşullardaki Değişiklikler\n" +
                "\n" +
                "Şartlar ve Koşullarımızı zaman zaman güncelleyebilirim. Bu nedenle, herhangi bir değişiklik için bu sayfayı periyodik olarak gözden geçirmeniz önerilir. Bu sayfada yeni Şartlar ve Koşullar'ı yayınlayarak herhangi bir değişiklik hakkında sizi bilgilendireceğim.\n" +
                "\n" +
                "Bu şartlar ve koşullar 2022-07-22 tarihinden itibaren geçerlidir.\n" +
                "\n" +
                "Bize Ulaşın\n" +
                "\n" +
                "Şartlar ve Koşullarım hakkında herhangi bir sorunuz veya öneriniz varsa, unallapp@gmail.com adresinden benimle iletişime geçmekten çekinmeyin.\n" +
                "\n" +
                "Bu Şartlar ve Koşullar sayfası, App Privacy Policy Generator tarafından oluşturulmuştur.");
    }


    private void gizlilikGoster() {
        dialogCagir();
        customDialogBaslik.setText("Gizlilik Politikası");
        customDialogTextView.setText("Tolga Ünal, Kpss Çalışıyorum uygulamasını Ücretsiz olarak geliştirdi. Bu HİZMET, Tolga Ünal tarafından ücretsiz olarak sağlanmaktadır ve olduğu gibi kullanılması amaçlanmıştır.\n" +
                "\n" +
                "Bu sayfa, herhangi biri Hizmetimi kullanmaya karar verirse, Kişisel Bilgilerin toplanması, kullanılması ve ifşa edilmesiyle ilgili politikalarım hakkında ziyaretçileri bilgilendirmek için kullanılır.\n" +
                "\n" +
                "Hizmetimi kullanmayı seçerseniz, bu politikayla ilgili bilgilerin toplanmasını ve kullanılmasını kabul etmiş olursunuz. Topladığım Kişisel Bilgiler, Hizmeti sağlamak ve geliştirmek için kullanılır. Bilgilerinizi bu Gizlilik Politikasında açıklananlar dışında kullanmayacağım veya kimseyle paylaşmayacağım.\n" +
                "\n" +
                "Bu Gizlilik Politikasında kullanılan terimler, bu Gizlilik Politikasında aksi belirtilmedikçe Kpss Çalışıyorum adresinden erişilebilen Şartlar ve Koşullarımızdakilerle aynı anlamlara sahiptir.\n" +
                "\n" +
                "Bilgi Toplama ve Kullanım\n" +
                "\n" +
                "Daha iyi bir deneyim için Hizmetimizi kullanırken, Tolga Ünal dahil ancak bunlarla sınırlı olmamak üzere, bize kişisel olarak tanımlanabilir belirli bilgileri vermenizi isteyebilirim. İstediğim bilgiler cihazınızda tutulacak ve hiçbir şekilde tarafımdan toplanmayacaktır.\n" +
                "\n" +
                "Uygulama, sizi tanımlamak için kullanılan bilgileri toplayabilen üçüncü taraf hizmetleri kullanır.\n" +
                "\n" +
                "Uygulama tarafından kullanılan üçüncü taraf hizmet sağlayıcıların gizlilik politikasına bağlantı" +
                "Google Play Hizmetleri\n" +
                "AdMob\n" +
                "Günlük Verileri\n" +
                "\n" +
                "Hizmetimi her kullandığınızda, uygulamada bir hata olması durumunda, telefonunuzdaki Log Data adlı veri ve bilgileri (üçüncü taraf ürünler aracılığıyla) topladığımı size bildirmek isterim. Bu Günlük Verileri, cihazınızın İnternet Protokolü (“IP”) adresi, cihaz adı, işletim sistemi sürümü, Hizmetimi kullanırken uygulamanın yapılandırması, Hizmeti kullanımınızın saati ve tarihi ve diğer istatistikler gibi bilgileri içerebilir. .\n" +
                "\n" +
                "Kurabiye\n" +
                "\n" +
                "Çerezler, genellikle anonim benzersiz tanımlayıcılar olarak kullanılan az miktarda veri içeren dosyalardır. Bunlar, ziyaret ettiğiniz web sitelerinden tarayıcınıza gönderilir ve cihazınızın dahili hafızasında saklanır.\n" +
                "\n" +
                "Bu Hizmet, bu \"çerezleri\" açıkça kullanmaz. Ancak uygulama, bilgi toplamak ve hizmetlerini iyileştirmek için üçüncü taraf kodu ve \"çerezler\" kullanan kitaplıklar kullanabilir. Bu tanımlama bilgilerini kabul etme veya reddetme seçeneğine sahipsiniz ve cihazınıza bir tanımlama bilgisinin ne zaman gönderildiğini bilirsiniz. Çerezlerimizi reddetmeyi seçerseniz, bu Hizmetin bazı kısımlarını kullanamayabilirsiniz.\n" +
                "\n" +
                "Servis sağlayıcıları\n" +
                "\n" +
                "Aşağıdaki nedenlerden dolayı üçüncü taraf şirketleri ve bireyleri istihdam edebilirim:\n" +
                "\n" +
                "Hizmetimizi kolaylaştırmak için;\n" +
                "Hizmeti bizim adımıza sağlamak için;\n" +
                "Hizmetle ilgili hizmetleri gerçekleştirmek için; veya\n" +
                "Hizmetimizin nasıl kullanıldığını analiz etmemize yardımcı olmak için.\n" +
                "Bu Hizmetin kullanıcılarını, bu üçüncü tarafların Kişisel Bilgilerine erişimi olduğu konusunda bilgilendirmek istiyorum. Sebebi ise kendilerine verilen görevleri bizim adımıza yerine getirmektir. Ancak, bilgileri başka bir amaçla açıklamamak veya kullanmamakla yükümlüdürler." +
                "Güvenlik\n" +
                "\n" +
                "Bize Kişisel Bilgilerinizi sağlama konusundaki güveninize değer veriyorum, bu nedenle ticari olarak kabul edilebilir koruma yöntemlerini kullanmaya çalışıyoruz. Ancak, internet üzerinden hiçbir aktarım yönteminin veya elektronik depolama yönteminin %100 güvenli ve güvenilir olmadığını ve mutlak güvenliğini garanti edemediğimi unutmayın.\n" +
                "\n" +
                "Diğer Sitelere Bağlantılar\n" +
                "\n" +
                "Bu Hizmet, diğer sitelere bağlantılar içerebilir. Üçüncü taraf bir bağlantıya tıklarsanız, o siteye yönlendirileceksiniz. Bu harici sitelerin benim tarafımdan işletilmediğini unutmayın. Bu nedenle, bu web sitelerinin Gizlilik Politikasını incelemenizi şiddetle tavsiye ederim. Herhangi bir üçüncü taraf site veya hizmetin içeriği, gizlilik politikaları veya uygulamaları üzerinde hiçbir kontrolüm ve sorumluluğum yoktur.\n" +
                "\n" +
                "Çocukların Gizliliği\n" +
                "\n" +
                "Bu Hizmetler 13 yaşın altındaki hiç kimseye hitap etmez. 13 yaşın altındaki çocuklardan bilerek kişisel olarak tanımlanabilir bilgiler toplamıyorum. 13 yaşından küçük bir çocuğun bana kişisel bilgiler verdiğini öğrenirsem, bunu derhal sunucularımızdan silerim. Ebeveyn veya vasi iseniz ve çocuğunuzun bize kişisel bilgiler verdiğini biliyorsanız, gerekli işlemleri yapabilmem için lütfen benimle iletişime geçin.\n" +
                "\n" +
                "Bu Gizlilik Politikasındaki Değişiklikler\n" +
                "\n" +
                "Gizlilik Politikamızı zaman zaman güncelleyebilirim. Bu nedenle, herhangi bir değişiklik için bu sayfayı periyodik olarak gözden geçirmeniz önerilir. Bu sayfada yeni Gizlilik Politikasını yayınlayarak herhangi bir değişiklik hakkında sizi bilgilendireceğim.\n" +
                "\n" +
                "Bu politika 2022-07-22 tarihinden itibaren geçerlidir.\n" +
                "\n" +
                "Bize Ulaşın\n" +
                "\n" +
                "Gizlilik Politikam hakkında herhangi bir sorunuz veya öneriniz varsa, unallapp@gmail.com adresinden benimle iletişime geçmekten çekinmeyin.\n" +
                "\n" +
                "Bu gizlilik politikası sayfası, privacypolicytemplate.net adresinde oluşturuldu ve App Privacy Policy Generator tarafından değiştirildi/oluşturuldu");
    }


    private void verileriCek() {
        try {
            Cursor cursor = sqLiteDatabase.rawQuery("SELECT * FROM profil", null);
            if (cursor.getCount() > 0) {
                int index = cursor.getColumnIndex("image");
                while (cursor.moveToNext()) {
                    byte[] bytes = cursor.getBlob(index);
                    Bitmap bitmap = BitmapFactory.decodeByteArray(bytes, 0, bytes.length);
                    profilImage.setImageBitmap(bitmap);
                }
            }
            cursor.close();
        } catch (Exception e) {
            System.out.println(e.getLocalizedMessage());
        }
        try {
            Cursor cursor1 = sqLiteDatabase.rawQuery("SELECT * FROM ad", null);
            if (cursor1.getCount() > 0) {
                int index = cursor1.getColumnIndex("name");
                while (cursor1.moveToNext()) {
                    kayitliAd.setText(cursor1.getString(index));
                }
            }
            cursor1.close();
        } catch (Exception e) {
            System.out.println(e.getLocalizedMessage());
        }
    }

    private void adiDegistir() {
        frameLayout.setVisibility(View.VISIBLE);
        kayitliAd.setVisibility(View.GONE);
        String kontrol = String.valueOf(kayitliAd.getText());
        if (kontrol.matches("Misafir Kullanıcı")) {
            degisenAd.setText("");
        } else {
            degisenAd.setText(kayitliAd.getText());
        }
        ismiKaydet.setOnClickListener(view -> {
            InputMethodManager inputManager = (InputMethodManager) getActivity().getSystemService(Context.INPUT_METHOD_SERVICE);
            inputManager.hideSoftInputFromWindow(view.getWindowToken(), InputMethodManager.HIDE_NOT_ALWAYS);
            kayitliAd.setText(degisenAd.getText());
            girilenIsim = String.valueOf(kayitliAd.getText());
            if (girilenIsim.equals("")) {
                girilenIsim = "Misafir Kullanıcı";

            }
            try {
                String sqlString = "INSERT INTO ad (name) VALUES(?)";
                SQLiteStatement sqLiteStatement = sqLiteDatabase.compileStatement(sqlString);
                sqLiteStatement.bindString(1, girilenIsim);
                sqLiteStatement.execute();
            } catch (Exception e) {
                System.out.println(e.getLocalizedMessage());
            }
            kayitliAd.setVisibility(View.VISIBLE);
            frameLayout.setVisibility(View.GONE);
            kayitliAd.setText(girilenIsim);
        });
    }

    private void profilResimGetir() {
        if (ContextCompat.checkSelfPermission(getActivity(), Manifest.permission.READ_EXTERNAL_STORAGE) != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(getActivity(), new String[]{Manifest.permission.READ_EXTERNAL_STORAGE}, 1);
        } else {
            Intent photo = new Intent(Intent.ACTION_PICK, MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
            startActivityForResult(photo, 2);
        }
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        if (requestCode == 1) {
            if (grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                Intent photo = new Intent(Intent.ACTION_PICK, MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
                startActivityForResult(photo, 2);
            }
        }
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        Uri uriImage;
        if (requestCode == 2 && resultCode == RESULT_OK && data != null) {
            uriImage = data.getData();
            try {
                selectedImage = MediaStore.Images.Media.getBitmap(getContext().getContentResolver(), uriImage);
                profilImage.setImageBitmap(selectedImage);
                Bitmap smallImage = makeSmallerImage(selectedImage, 300);
                ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
                smallImage.compress(Bitmap.CompressFormat.JPEG, 50, outputStream);
                byte[] bytes = outputStream.toByteArray();
                String sqlString = "INSERT INTO profil (image) VALUES(?)";
                SQLiteStatement sqLiteStatement = sqLiteDatabase.compileStatement(sqlString);
                sqLiteStatement.bindBlob(1, bytes);
                sqLiteStatement.execute();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
        super.onActivityResult(requestCode, resultCode, data);
    }

    public Bitmap makeSmallerImage(Bitmap image, int maximumsize) {
        int width = image.getWidth();
        int height = image.getHeight();
        float bitmapRatio = (float) width / (float) height;
        if (bitmapRatio > 1) {
            width = maximumsize;
            height = (int) (width / bitmapRatio);
        } else {
            height = maximumsize;
            width = (int) (width * height);
        }
        return Bitmap.createScaledBitmap(image, width, height, true);
    }
}