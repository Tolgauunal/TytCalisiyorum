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
                    case R.id.adiDe??i??tir:
                        adiDegistir();
                        break;
                    case R.id.profilResminiDe??i??tir:
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
        customDialogBaslik.setText("??artlar ve Ko??ullar");
        customDialogTextView.setText("Uygulamay?? indirerek veya kullanarak bu ??artlar sizin i??in otomatik olarak ge??erli olacakt??r - bu nedenle uygulamay?? kullanmadan ??nce bunlar?? dikkatlice okudu??unuzdan emin olmal??s??n??z. Uygulamay??, uygulaman??n herhangi bir b??l??m??n?? veya ticari markalar??m??z?? hi??bir ??ekilde kopyalaman??za veya de??i??tirmenize izin verilmez. Uygulaman??n kaynak kodunu ????karmaya ??al????man??za izin verilmez ve ayr??ca uygulamay?? ba??ka dillere ??evirmeye veya t??rev s??r??mler olu??turmaya ??al????mamal??s??n??z. Uygulaman??n kendisi ve buna ili??kin t??m ticari markalar, telif haklar??, veritaban?? haklar?? ve di??er fikri m??lkiyet haklar?? halen Tolga ??nal'a aittir.\n" +
                "\n" +
                "Tolga ??nal, uygulaman??n olabildi??ince kullan????l?? ve verimli olmas??n?? sa??lamaya kararl??d??r. Bu nedenle, herhangi bir zamanda ve herhangi bir nedenle uygulamada de??i??iklik yapma veya hizmetleri i??in ??cret alma hakk??n?? sakl?? tutar??z. Tam olarak ne i??in ??deme yapt??????n??z?? size a????k??a belirtmeden, uygulama veya hizmetleri i??in sizden asla ??cret almayaca????z.\n" +
                "\n" +
                "Kpss ??al??????yorum uygulamas??, Hizmetimi sa??lamak i??in bize sa??lad??????n??z ki??isel verileri saklar ve i??ler. Telefonunuzu ve uygulamaya eri??imi g??venli tutmak sizin sorumlulu??unuzdad??r. Bu nedenle, cihaz??n??z??n resmi i??letim sistemi taraf??ndan dayat??lan yaz??l??m k??s??tlamalar??n?? ve s??n??rlamalar??n?? kald??rma i??lemi olan telefonunuzu jailbreak veya root yapmaman??z?? ??neririz. Telefonunuzu k??t?? ama??l?? yaz??l??mlara/vir??slere/k??t?? ama??l?? programlara kar???? savunmas??z hale getirebilir, telefonunuzun g??venlik ??zelliklerini tehlikeye atabilir ve Kpss ??al??????yorum uygulamas??n??n d??zg??n ??al????mamas?? veya hi?? ??al????mamas?? anlam??na gelebilir.\n" +
                "\n" +
                "Uygulama, H??k??m ve Ko??ullar??n?? beyan eden ??????nc?? taraf hizmetlerini kullan??r.\n" +
                "\n" +
                "Uygulama taraf??ndan kullan??lan ??????nc?? taraf hizmet sa??lay??c??lar??n H??k??m ve Ko??ullar??na ba??lant??" +
                "AdMob\n" +
                "Tolga ??nal'??n sorumluluk almayaca???? baz?? ??eyler oldu??unu bilmelisiniz. Uygulaman??n belirli i??levleri, uygulaman??n etkin bir internet ba??lant??s??na sahip olmas??n?? gerektirir. Ba??lant?? Wi-Fi olabilir veya mobil a?? sa??lay??c??n??z taraf??ndan sa??lanabilir, ancak Wi-Fi eri??iminiz yoksa ve herhangi bir ba??lant??n??z yoksa Tolga ??nal uygulaman??n tam i??levsellikte ??al????mamas??ndan sorumlu tutulamaz. veri pay?? kald??.\n" +
                "\n" +
                "Uygulamay?? Wi-Fi bulunan bir alan??n d??????nda kullan??yorsan??z, mobil a?? sa??lay??c??n??zla yapt??????n??z s??zle??menin ??artlar??n??n yine de ge??erli olaca????n?? unutmamal??s??n??z. Sonu?? olarak, uygulamaya eri??irken ba??lant?? s??resince veri maliyeti veya di??er ??????nc?? taraf ??cretleri i??in mobil sa??lay??c??n??z taraf??ndan sizden ??cret al??nabilir. Uygulamay?? kullan??rken, veri dola????m??n?? kapatmadan uygulamay?? kendi ??lkenizin d??????nda (yani b??lge veya ??lke) kullan??rsan??z, dola????m veri ??cretleri de dahil olmak ??zere bu t??r ??cretlerin sorumlulu??unu kabul etmi?? olursunuz. Uygulamay?? kulland??????n??z cihaz??n fatura ??deyen taraf?? siz de??ilseniz, uygulamay?? kullanmak i??in fatura ??deyen ki??iden izin ald??????n??z?? varsayd??????m??z?? l??tfen unutmay??n.\n" +
                "\n" +
                "Ayn?? ??ekilde, Tolga ??nal, uygulamay?? kullanma ??ekliniz konusunda her zaman sorumluluk alamaz, yani cihaz??n??z??n ??arjl?? kald??????ndan emin olman??z gerekir - pili biterse ve Hizmeti kullanmak i??in a??amazsan??z, Tolga ??nal sorumluluk kabul edemez.\n" +
                "\n" +
                "Tolga ??nal'??n uygulamay?? kullan??m??n??za ili??kin sorumlulu??u ile ilgili olarak, uygulamay?? kullan??rken, her zaman g??ncel ve do??ru olmas??n?? sa??lamaya ??al????mam??za ra??men, ??????nc?? taraflara g??vendi??imizi unutmamak ??nemlidir. bilgileri size sunabilmemiz i??in bize sa??lay??n. Tolga ??nal, tamamen uygulaman??n bu i??levine g??venmeniz sonucunda u??rayaca????n??z do??rudan veya dolayl?? hi??bir kay??ptan sorumlu tutulamaz." +
                "Bir noktada, uygulamay?? g??ncellemek isteyebiliriz. Uygulama ??u anda Android'de mevcuttur - sistem (ve uygulaman??n kullan??labilirli??ini geni??letmeye karar verdi??imiz ek sistemler i??in) gereksinimleri de??i??ebilir ve uygulamay?? kullanmaya devam etmek istiyorsan??z g??ncellemeleri indirmeniz gerekir . Tolga ??nal, uygulamay?? sizinle alakal?? olacak ve/veya cihaz??n??za y??kledi??iniz Android s??r??m?? ile ??al????acak ??ekilde her zaman g??ncelleyece??inin s??z??n?? vermez. Ancak, size teklif edildi??inde uygulamaya ili??kin g??ncellemeleri her zaman kabul edece??inize s??z verirsiniz, ayr??ca uygulamay?? sa??lamay?? durdurmak isteyebiliriz ve size herhangi bir fesih bildiriminde bulunmaks??z??n uygulamay?? herhangi bir zamanda sonland??rabiliriz. Size aksini s??ylemedi??imiz s??rece, herhangi bir fesih ??zerine, (a) bu ??artlarda size verilen haklar ve lisanslar sona erecektir; (b) uygulamay?? kullanmay?? b??rakmal?? ve (gerekirse) cihaz??n??zdan silmelisiniz.\n" +
                "\n" +
                "Bu H??k??m ve Ko??ullardaki De??i??iklikler\n" +
                "\n" +
                "??artlar ve Ko??ullar??m??z?? zaman zaman g??ncelleyebilirim. Bu nedenle, herhangi bir de??i??iklik i??in bu sayfay?? periyodik olarak g??zden ge??irmeniz ??nerilir. Bu sayfada yeni ??artlar ve Ko??ullar'?? yay??nlayarak herhangi bir de??i??iklik hakk??nda sizi bilgilendirece??im.\n" +
                "\n" +
                "Bu ??artlar ve ko??ullar 2022-07-22 tarihinden itibaren ge??erlidir.\n" +
                "\n" +
                "Bize Ula????n\n" +
                "\n" +
                "??artlar ve Ko??ullar??m hakk??nda herhangi bir sorunuz veya ??neriniz varsa, unallapp@gmail.com adresinden benimle ileti??ime ge??mekten ??ekinmeyin.\n" +
                "\n" +
                "Bu ??artlar ve Ko??ullar sayfas??, App Privacy Policy Generator taraf??ndan olu??turulmu??tur.");
    }


    private void gizlilikGoster() {
        dialogCagir();
        customDialogBaslik.setText("Gizlilik Politikas??");
        customDialogTextView.setText("Tolga ??nal, Kpss ??al??????yorum uygulamas??n?? ??cretsiz olarak geli??tirdi. Bu H??ZMET, Tolga ??nal taraf??ndan ??cretsiz olarak sa??lanmaktad??r ve oldu??u gibi kullan??lmas?? ama??lanm????t??r.\n" +
                "\n" +
                "Bu sayfa, herhangi biri Hizmetimi kullanmaya karar verirse, Ki??isel Bilgilerin toplanmas??, kullan??lmas?? ve if??a edilmesiyle ilgili politikalar??m hakk??nda ziyaret??ileri bilgilendirmek i??in kullan??l??r.\n" +
                "\n" +
                "Hizmetimi kullanmay?? se??erseniz, bu politikayla ilgili bilgilerin toplanmas??n?? ve kullan??lmas??n?? kabul etmi?? olursunuz. Toplad??????m Ki??isel Bilgiler, Hizmeti sa??lamak ve geli??tirmek i??in kullan??l??r. Bilgilerinizi bu Gizlilik Politikas??nda a????klananlar d??????nda kullanmayaca????m veya kimseyle payla??mayaca????m.\n" +
                "\n" +
                "Bu Gizlilik Politikas??nda kullan??lan terimler, bu Gizlilik Politikas??nda aksi belirtilmedik??e Kpss ??al??????yorum adresinden eri??ilebilen ??artlar ve Ko??ullar??m??zdakilerle ayn?? anlamlara sahiptir.\n" +
                "\n" +
                "Bilgi Toplama ve Kullan??m\n" +
                "\n" +
                "Daha iyi bir deneyim i??in Hizmetimizi kullan??rken, Tolga ??nal dahil ancak bunlarla s??n??rl?? olmamak ??zere, bize ki??isel olarak tan??mlanabilir belirli bilgileri vermenizi isteyebilirim. ??stedi??im bilgiler cihaz??n??zda tutulacak ve hi??bir ??ekilde taraf??mdan toplanmayacakt??r.\n" +
                "\n" +
                "Uygulama, sizi tan??mlamak i??in kullan??lan bilgileri toplayabilen ??????nc?? taraf hizmetleri kullan??r.\n" +
                "\n" +
                "Uygulama taraf??ndan kullan??lan ??????nc?? taraf hizmet sa??lay??c??lar??n gizlilik politikas??na ba??lant??" +
                "Google Play Hizmetleri\n" +
                "AdMob\n" +
                "G??nl??k Verileri\n" +
                "\n" +
                "Hizmetimi her kulland??????n??zda, uygulamada bir hata olmas?? durumunda, telefonunuzdaki Log Data adl?? veri ve bilgileri (??????nc?? taraf ??r??nler arac??l??????yla) toplad??????m?? size bildirmek isterim. Bu G??nl??k Verileri, cihaz??n??z??n ??nternet Protokol?? (???IP???) adresi, cihaz ad??, i??letim sistemi s??r??m??, Hizmetimi kullan??rken uygulaman??n yap??land??rmas??, Hizmeti kullan??m??n??z??n saati ve tarihi ve di??er istatistikler gibi bilgileri i??erebilir. .\n" +
                "\n" +
                "Kurabiye\n" +
                "\n" +
                "??erezler, genellikle anonim benzersiz tan??mlay??c??lar olarak kullan??lan az miktarda veri i??eren dosyalard??r. Bunlar, ziyaret etti??iniz web sitelerinden taray??c??n??za g??nderilir ve cihaz??n??z??n dahili haf??zas??nda saklan??r.\n" +
                "\n" +
                "Bu Hizmet, bu \"??erezleri\" a????k??a kullanmaz. Ancak uygulama, bilgi toplamak ve hizmetlerini iyile??tirmek i??in ??????nc?? taraf kodu ve \"??erezler\" kullanan kitapl??klar kullanabilir. Bu tan??mlama bilgilerini kabul etme veya reddetme se??ene??ine sahipsiniz ve cihaz??n??za bir tan??mlama bilgisinin ne zaman g??nderildi??ini bilirsiniz. ??erezlerimizi reddetmeyi se??erseniz, bu Hizmetin baz?? k??s??mlar??n?? kullanamayabilirsiniz.\n" +
                "\n" +
                "Servis sa??lay??c??lar??\n" +
                "\n" +
                "A??a????daki nedenlerden dolay?? ??????nc?? taraf ??irketleri ve bireyleri istihdam edebilirim:\n" +
                "\n" +
                "Hizmetimizi kolayla??t??rmak i??in;\n" +
                "Hizmeti bizim ad??m??za sa??lamak i??in;\n" +
                "Hizmetle ilgili hizmetleri ger??ekle??tirmek i??in; veya\n" +
                "Hizmetimizin nas??l kullan??ld??????n?? analiz etmemize yard??mc?? olmak i??in.\n" +
                "Bu Hizmetin kullan??c??lar??n??, bu ??????nc?? taraflar??n Ki??isel Bilgilerine eri??imi oldu??u konusunda bilgilendirmek istiyorum. Sebebi ise kendilerine verilen g??revleri bizim ad??m??za yerine getirmektir. Ancak, bilgileri ba??ka bir ama??la a????klamamak veya kullanmamakla y??k??ml??d??rler." +
                "G??venlik\n" +
                "\n" +
                "Bize Ki??isel Bilgilerinizi sa??lama konusundaki g??veninize de??er veriyorum, bu nedenle ticari olarak kabul edilebilir koruma y??ntemlerini kullanmaya ??al??????yoruz. Ancak, internet ??zerinden hi??bir aktar??m y??nteminin veya elektronik depolama y??nteminin %100 g??venli ve g??venilir olmad??????n?? ve mutlak g??venli??ini garanti edemedi??imi unutmay??n.\n" +
                "\n" +
                "Di??er Sitelere Ba??lant??lar\n" +
                "\n" +
                "Bu Hizmet, di??er sitelere ba??lant??lar i??erebilir. ??????nc?? taraf bir ba??lant??ya t??klarsan??z, o siteye y??nlendirileceksiniz. Bu harici sitelerin benim taraf??mdan i??letilmedi??ini unutmay??n. Bu nedenle, bu web sitelerinin Gizlilik Politikas??n?? incelemenizi ??iddetle tavsiye ederim. Herhangi bir ??????nc?? taraf site veya hizmetin i??eri??i, gizlilik politikalar?? veya uygulamalar?? ??zerinde hi??bir kontrol??m ve sorumlulu??um yoktur.\n" +
                "\n" +
                "??ocuklar??n Gizlili??i\n" +
                "\n" +
                "Bu Hizmetler 13 ya????n alt??ndaki hi?? kimseye hitap etmez. 13 ya????n alt??ndaki ??ocuklardan bilerek ki??isel olarak tan??mlanabilir bilgiler toplam??yorum. 13 ya????ndan k??????k bir ??ocu??un bana ki??isel bilgiler verdi??ini ????renirsem, bunu derhal sunucular??m??zdan silerim. Ebeveyn veya vasi iseniz ve ??ocu??unuzun bize ki??isel bilgiler verdi??ini biliyorsan??z, gerekli i??lemleri yapabilmem i??in l??tfen benimle ileti??ime ge??in.\n" +
                "\n" +
                "Bu Gizlilik Politikas??ndaki De??i??iklikler\n" +
                "\n" +
                "Gizlilik Politikam??z?? zaman zaman g??ncelleyebilirim. Bu nedenle, herhangi bir de??i??iklik i??in bu sayfay?? periyodik olarak g??zden ge??irmeniz ??nerilir. Bu sayfada yeni Gizlilik Politikas??n?? yay??nlayarak herhangi bir de??i??iklik hakk??nda sizi bilgilendirece??im.\n" +
                "\n" +
                "Bu politika 2022-07-22 tarihinden itibaren ge??erlidir.\n" +
                "\n" +
                "Bize Ula????n\n" +
                "\n" +
                "Gizlilik Politikam hakk??nda herhangi bir sorunuz veya ??neriniz varsa, unallapp@gmail.com adresinden benimle ileti??ime ge??mekten ??ekinmeyin.\n" +
                "\n" +
                "Bu gizlilik politikas?? sayfas??, privacypolicytemplate.net adresinde olu??turuldu ve App Privacy Policy Generator taraf??ndan de??i??tirildi/olu??turuldu");
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
        if (kontrol.matches("Misafir Kullan??c??")) {
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
                girilenIsim = "Misafir Kullan??c??";

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