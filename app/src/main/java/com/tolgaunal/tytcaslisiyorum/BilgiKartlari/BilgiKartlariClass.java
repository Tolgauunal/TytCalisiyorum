package com.tolgaunal.tytcaslisiyorum.BilgiKartlari;


public class BilgiKartlariClass {
    public static String TemelKavramlar[] =
            {
                    "Sayma Sayıları Kümesi: { 1, 2, 3, 4, 5, 6, … } kümesine sayma sayıları denir ve bu kümenin her birine sayma sayısı denir. Sayma sayıları kümesi “S” sembolü ile gösterilir.",
                    "Doğal Sayılar Kümesi: {0, 1, 2, 3, 4, 5, … } kümesine doğal sayılar kümesi ve bu kümenin her bir elemanına doğal sayı denir. Doğal sayılar kümesi “N” sembolü ile gösterilir.",
                    "Tam Sayılar Kümesi: { …,-3, -2, -1, 0,1, 2, 3,… } kümesine tam sayılar kümesi denir ve bu kümenin her bir elemanına tam sayı denir. Tam sayılar kümesi “Z” sembolü ile gösterilir. Tam sayılar 3’e ayrılır.",
                    "Pozitif Tam Sayılar: Sıfırdan büyük (sıfırın sağında olan) sayıların oluşturduğu kümeye pozitif tam sayılar kümesi denir ve bu kümenin her bir elemanına pozitif tam sayı denir.Pozitif tam sayılar kümesi “Z+ sembolü ile gösterilir.\n Z+ = {1, 2, 3, …… }",
                    "Negatif Tam Sayılar: Sıfırdan küçük (sıfırın solunda olan) sayıların oluşturduğu kümeye negatif tam sayılar kümesi denir ve bu kümenin her bir elemanına negatif tam sayı denir.Negatif tam sayılar kümesi “Z-” sembolü ile gösterilir.\n" +
                            "\n" +
                            "Z– = {…,-3, -2, -1 }",
                    "Rasyonel Sayılar: a ve b birer tam sayı ve b≠0 olsun. a/b şeklinde yazılabilen sayıların oluşturduğu kümeye rasyonel sayılar kümesi bu kümenin her bir elemanına rasyonel sayı denir. Rasyonel sayılar kümesi “Q” sembolü ile gösterilir.",
                    "İrrasyonel Sayılar: Rasyonel olmayan sayılara yani iki tam sayının bölümü şeklinde yazılamayan sayıların kümesine irrasyonel sayılar denir. İrrasyonel sayılar kümesinin her bir elemanına irrasyonel sayı denir. İrrasyonel sayılar kümesi “I” sembolü ile gösterilir.",
                    "Reel (Gerçek, Gerçel) Sayılar Kümesi: Rasyonel sayılar kümesi ile irrasyonel sayılar kümesinin birleşmesiyle oluşan kümeye reel sayılar kümesi denir ve bu kümenin her bir elemanına reel sayı denir. Reel sayılar kümesi “R” sembolü ile gösterilir.",
                    "Çift Tam Sayı: Birler basamağında 0, 2, 4, 6, 8 rakamlarından herhangi biri olan sayılara çift tam sayı denir. “n” tam sayı olmak üzere çift tam sayıları “2n” ile gösterebiliriz. Çift tam sayılar kümesi",
                    "Tek Tam Sayı: Birler basamağında 1, 3, 5, 7 rakamlarından herhangi biri olan sayılara tek tam sayı denir. “n” tam sayı olmak üzere tek tam sayılar “2n-1” ile gösterebiliriz.",
                    "Sıfırdan küçük sayılara negatif sayılar denir. x negatif sayı ise “x < 0” şeklinde gösterilir.\n" +
                            "Sıfırdan büyük sayılara pozitif sayılar denir. x pozitif sayı ise “x > 0” şeklinde gösterilir.\n" +
                            "Sıfır pozitif veya negatif sayı değildir.",
                    "Aralarında bir fark olan ve art arda gelen tam sayılara ardışık tam sayılar denir. n tam sayı olmak üzere n, n+1, n+2, n+3, … şeklinde gösterilir.",
                    "Aralarında iki fark olan ve art arda gelen çift sayılara ardışık çift tam sayılar denir. n çift tam sayı olmak üzere n, n+2, n+4,… şeklinde gösterilir.",
                    "Aralarında iki fark olan ve art arda gelen tek sayılara ardışık tek tam sayılar denir. n tek tam sayı olmak üzere n, n+2, n+4, n+6,… şeklinde gösterilir.",
                    "Bir ardışık sayı dizisinde terimlerin toplamı ve terim sayısı biliniyor ise ortanca terim aşağıda verilen formül ile bulunabilir.\n Ortanca Terim= Terimlerin Toplamı%Terim Sayısı",
                    "Ardışık sayı dizisinde çift sayıda terim varsa (4 tane,6 tane,8 tane,12 tane… gibi) ortanca terim olmaz. Fakat ortanca terim varmış gibi düşünülerek işlem yapılır. Yazılacak ardışık sayılar bulunan değerden büyük ve küçük olacak biçimde eşit şekilde yazılır.",
                    "Bir ardışık sayı dizisindeki terim sayısı bulunurken;\n (Terim Sayısı= Son Terim- İlk Terim % Artış Miktarı)+1 şeklinde bulunur.",
                    "1 ve kendisinden başka pozitif böleni olmayan 1 den büyük doğal sayılara asal sayı denir. Asal sayılar; 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, … şeklinde sıralanır.",
                    "En küçük asal sayı 2 dir.",
                    "1 asal sayı değildir.",
                    "Negatif sayılar asal sayı değildir.",
                    "2 dışında çift olup aynı zamanda asal olan başka bir sayı yoktur.",
                    "1 den başka pozitif ortak böleni olmayan iki veya daha fazla sayıya aralarında asal sayı denir.",
                    "Ardışık sayılar daima aralarında asaldır.",
                    "1 bütün pozitif tam sayılarla aralarında asaldır.",
            };
    public static String Sayilar[] = {
            "Basitçe bir tanımla bir sayıyı oluşturan rakamlara o sayının sayı değeri denilmektedir.",
            "Basamak Değeri: Bir sayıyı oluşturan rakamların bulunduğu konuma o rakamın basamak değeri denilmektedir.",
            "Doğal sayılar içinde bütün rakamların basamak değerlerini yazıp toplarsak doğal sayıyı çözümlemiş oluruz. Bu bakımdan basamak değeri bize bir sayının çözümlenmesini gösterir.",
            "Sayı sistemleri içinde yer alan basamak değerleri abc tarzında sorularla da karşımıza çıkmaktadır." +
                    "abc= 100a+10b+c şeklinde çözümlenmektedir.\n" +
                    "2a8b= 2000+100a+80+b şeklinde çözümlenir.",
    };
    public static String Bölme[] = {
            "1 Her sayı bölünür.",
            "2 Son rakamı çift sayı ise bölünür. Bir tam sayı 2 ile bölünmezse kalan her zaman 1 olur.",
            "3 Rakamların değerleri toplamı 3 veya üçün katları ise bölünür.",
            "4 Bir sayının birler ve onlar basamağı 00 ya da 4'ün katı ise sayı 4 ile bölünür.",
            "5 Son rakamı 0 veya 5 ise 5'e bölünür.",
            "6 Sayı hem 2'ye hem 3'e kalansız bölünebiliyorsa 6'ya da bölünür. Örneğin: 36",
            "7 Sayının rakamlarının altına birler basamağından başlayarak (sağdan sola doğru) a b c d e f 2 3 1 2 3 1 - + sırasıyla ( 1 3 2 1 3 2 ...) yazılmalı ve şu hesap yapılmalıdır: ( 1.f + 3.e +2.d ) - ( 1.c + 3.b + 2.a ) = 7.k + m ( k, m: tam sayı) Sonuç, 7 veya 7 nin katları ( m = 0 ) olursa, bu sayı 7 ile tam olarak bölünür. Ayrıca bu sayı 10a + b olarak yazıldığında a - 2b sayısı 7'ye bölünüyorsa, asıl sayı 7'ye bölünebilir.",
            "8 Son üç basamağının oluşturduğu sayı 000 ya da 8 in katı ise bölünür.",
            "9 Rakamların sayı değerleri toplamı 9 veya dokuzun katlarıysa bölünür.",
            "10 Son rakamı 0 ise bölünür.",
            "11 Bir sayının 11 ile tam olarak bölünebilmesi için, sayının rakamlarının altına birler basamağından başlayarak sırasıyla +, -, +, -, ... işaretleri yazılır, artılı gruplar kendi arasında ve eksili gruplar kendi arasında toplanır, farkı alınır. Genel toplamın 11 e bölümünde kalan 0 ise sayı 11'e tam bölünür. Sonuç negatif çıkarsa sonuca +11 eklenir.",
            "12 Bir sayının 12'ye tam bölünmesi için, 3 ve 4'e tam olarak bölünmesi gerekir.",
            "13 Sayı x=abcdefg olsun temel basamak çarpanları ise 1,-3,-4 tür 1*(g-d+a)+(-3)*(f-c)+(-4(e-b) şeklinde daha uzun basamaklı ise bir eksili bir artılı çıkarıp ve toplayıp hepsini toplarız.\n" +
                    "Çıkan sonuç 13 ile tam bölünüyorsa sayıda bölünür eğer kalan varsa bu kalan x sayısınında 13 ile bölümünden kalanıdır.",
            "14 Sayı hem 7'ye hem 2'ye kalansız bölünebiliyorsa 14'e de bölünür",
            "15 Bir sayının 15 ile bölünebilmesi için, bu sayının hem 3 ile hem de 5 ile tam olarak bölünmesi gerekir.",
            "17 Sayıyı X=10a+b şeklinde yazdığımızda a-5b sayısı 17'ye kalansız bölünmesiyle oluşur.",
            "18 Bir sayının 18 ile bölünebilmesi için, bu sayının hem 2 ile hem de 9 ile tam olarak bölünmesi gerekir.",
            "19 Sayıyı X=10a+b şeklinde yazdığımızda a+2b sayısı 19'a kalansız bölünürse bölünebilir.",
            "23 Sayıyı X=10a+b şeklinde yazdığımızda a+7b sayısı 23'e kalansız bölünürse bölünebilir.",
            "24 Bir sayının 24 ile bölünebilmesi için, bu sayının hem 3 ile hem de 8 ile tam olarak bölünmesi gerekir.",
            "25 Son iki rakamı 25, 50, 75, veya 00 olmalıdır.",
    };
    public static String asal[] = {
            "Bir sayı verilmişse ve asal çarpanlarına ayrılması isteniyorsa verilen sayı en küçük asal çarpandan başlanarak bölünür. Sayı en küçük asal çarpana bölünmüyorsa asal çarpan büyültülerek sayının bölünmesi sağlanır. Sayı aynı asal sayıya birden fazla kez bölünmüşse üssü şeklinde yazılmaktadır",
    };
    public static String Ebob[] = {
            "EBOB, En Büyük Ortak Bölen kavramının ve EKOK ise En Küçük Ortak Kat kavramının kısaltması olarak karşımıza çıkıyor. a ve b sayısının en büyük ortak böleni kısaca EBOB(a,b) ve en küçük ortak katı EKOK(a,b) şeklinde gösterilir. ",
            "a, b, c tamsayıları için c hem a’yı hem b’yi bölüyorsa c’ye a ile b’nin bir ortak böleni denebilir. ",
            "a ve b sıfırdan farklı tamsayılar olsun. a ve b’nin en küçük pozitif ortak katına a ve b’nin en küçük ortak katı denir ve a ve b nin bir katı k ise EKOK(a, b) daima k’yı böler.",
            "a ve b pozitif tamsayılar olmak üzere; EBOB(a, b)⋅EKOK(a, b) = a⋅b’dir.",
    };
    public static String birinci[] = {
            "İçinde bilinmeyen bulunan ve bilinmeyenin bazı değerleri için doğru olan eşitsizliklere denklem denir.",
            "Denklemi sağlayan bilinmeyenin değerine o denklemin kökü ya da kökleri denir. Denklemin kökünü veya köklerini bulmak için yapılan işleme denklemi çözme; kök veya köklerin oluşturduğu kümeye ise çözüm kümesi denir. ",
            "5x – 5 = 15, y + 2 = 6 açık önermeleri bir bilinmeyenli birinci dereceden bir denklemdir.",
            "Genel olarak; a,b,c Є R ve a �* 0 olmak üzere ax + b = c şeklinde gösterilen denklemlere birinci dereceden bir bilinmeyenli denklem denir. ",
            " Bir eşitliğin her iki yanına aynı reel sayı\n" +
                    "eklenirse, eşitlik bozulmaz. Bu özeliğe; eşitliğin toplama kuralı denir.",
            "Bir eşitliğin her iki yanı da sıfırdan farklı\n" +
                    "aynı reel sayıyla çarpılırsa, eşitlik bozulmaz. Bu özeliğe; eşitliğin çarpma kuralı denir.",
            " Bir eşitliğin her iki yanı da sıfırdan farklı\n" +
                    "aynı reel sayıya bölünürse, eşitlik bozulmaz. Bu özeliğe; eşitliğin bölme kuralı denir.",
            "Bir denklemde herhangi bir terimi eşitliğin \n" +
                    "bir tarafından diğer tarafına geçirerek işlem yapmak gerekiyorsa; geçirilen terimin işareti değiştirilir.",
            "Bir denklemi pratik çözmek için ;Bilinmeyenler eşitliğin bir yanında, bilinenler eşitliğin diğer yanında toplanır. Eşitliğin bir yanından diğer yanına geçen terimin işareti değişir. Her iki yanda toplama çıkarma işlemleri yapılır ve her iki yan bilinmeyenin katsayısına bölünerek bilinmeyen yalnız bırakılır. Denklem çözülmüş olur.",
    };
    public static String rasyonel[] = {
            "Rasyonel sayı, a bir tam sayı olmak şartıyla b de 0 dan farklı bir tam sayı olmak şartıyla  a/b (a bölü b)  şeklinde yazılabilen sayılara denir.",
            "5/7 sayısı bir rasyonel sayıdır, 0/7 sayısı bir rasyonel sayıdır ,6/0 sayısı? Tanımımızı referans alarak rasyonel sayı değildir demeliyiz, -4/2 sayısı da rasyonel sayıdır,1/2 rasyonel sayı mıdır? (1 de 2 de tam sayı. ",
            "Rasyonel sayıları ondalık sayı şeklinde yazmaya bakalım. Bunun için 2 yol önerebilirim.Payı paydaya  tam olarak bölmeye çalışırız. (Yani kalan bırakmamaya çalışarak),Paydadaki sayı 10,100 gibi sayılara genişletilebiliyorsa rasyonel sayıyı genişletme işlemi yaparız",
            "Virgülden sonraki rakamlardan bazıları sonsuza kadar tekrar ediyorsa, bu durumda devirli ondalık sayılar devreye girer. Tekrar eden sayı grubunun üzerine devir çizgisi konur.",
            "Şimdi bu tür devirli ondalık sayıları nasıl rasyonel sayıya çeviririz onu gösterelim: Sayının Tamamı-Devreden Sayıya Kadar Olan Kısım / Devreden kadar 9 Devretmeyen Kadar 0",
            "14/9  ile 10/7 sayılarını karşılaştıralım. Hem pay kısımları farklı hem de payda kısımları. Gelin paydalarını eşitleyelim  14/9  rasyonel sayısını 7 ile genişletelim (çünkü diğer rasyonel sayının paydası 7) 10/7  rasyonel sayısını da 9 ile genişletelim. (çünkü diğer rasyonel sayının paydası 9.) 14/9= 98/63  oldu. Diğer rasyonel sayıyı genişletelim 10/7 = 90/63  Şimdi  98/63  >  90/63  rahatlıkla görebiliriz.",
            "Rasyonel sayılarda toplama çıkarma işlemlerinde önceliğimiz paydalar eşit değilse eşitlemek. Daha sonra da iki rasyonel sayının payları arasında gereken işlemi yapmak. ",
            "Rasyonel sayılarda çarpma işlemi yaparken paylar birbiriyle paydalar birbiriyle çarpılır.",
            "Rasyonel sayılarda bölme işlemi yaparken dikkat edilmesi gereken bir nokta var.  İlk rasyonel sayımız aynı şekilde durur, ikinci rasyonel sayımız ters çevrilir (Pay kısmı paydaya yazılır, payda kısmı paya yazılır) ve birbiriyle çarpılır.",
    };
    public static String Esitsizlikler[] = {
            ">, ≥, <, ≤ gibi sembollerle gösterilen ifadelere eşitsizlik denmektedir.",
            "a ve b reel sayılar olmak üzere a<b, a≥b, a>b, a≤b şeklindeki ifadeler bir basit eşitsizliktir.",
            "Bir eşitsizliğin her iki tarafına aynı sayı eklenip çıkartılabilir. Bu eşitsizliğin yönünü değiştirmez.",
            "Eşitsizliğin her iki tarafı da pozitif bir sayı ile çarpılırsa veya bölünürse, bu eşitsizlik yön değiştirmez.",
            "Bir eşitsizliğin her iki tarafı negatif bir sayıyla çarpılır veya bölünürse, eşitsizlik yön değiştirir.",
            "Yönü aynı olan eşitsizlikler taraf tarafa toplanabilir.",
            "0<a<b iken a<b ," + "1" + "a" + ">" + "1" + "b",
            "Zıt işaretli sayılardan oluşan eşitsizliklerin çarpma işlemine göre tersi alındığında eşitsizlik yön değiştirmez.",
            "a ve b birer pozitif reel sayı ve x pozitif tam sayı olmak üzere ;" + "0<a<b iken " + "a" + "x" + "< " + "b" + "x",
            "a ve b negatif birer sayı ve x pozitif bir tam sayı olduğunda;\n" + "a<b<0,  x tek ise," +
                    "a" +
                    "x" +
                    "<" +
                    "b" +
                    "x" +
                    "x çift ise, " +
                    "a" +
                    "x" +
                    ">" +
                    "b" +
                    "x" +
                    " olur.",
            "0 ve 1 arasındaki pozitif ve basit olan kesirlerin kuvveti arttıkça sayının değeri de azalır.",
    };
    public static String mutlak[] =
            {
                    "Bir x reel sayısının sıfıra uzaklığına bu sayının mutlak değeri denir. Ve mutlak değer " +
                            "|" +
                            "x" +
                            "|" +
                            " şeklinde gösterilmektedir.",
                    "Bir sayıyı mutlak değer ifadesinden kurtarırken, mutlak değer içerisindeki sayının önce işareti incelenir.",
                    "şaretler (+) ise mutlak değer üzerine (+) işareti, işareti (-) ise mutlak değeri üzerine (-) işareti konur. Ve bu sayı mutlak değer ifadesinde dışarı alınırken üzerine konulan işaret ile mutlak değer içinde yer alan sayı ile çarpılır ve mutlak değerden kurtarılmış olur.",
                    "|" +
                            "x" +
                            "|" +
                            "  = İçerisi pozitif ise aynen çıkar." +
                            "|" +
                            "x" +
                            "|" +
                            " = İçerisi negatif ise başına (-) alır.",
                    "Mutlak değerin içinde bilinen bir reel sayı varsa işaretine bakılmadan dışarı (+) olarak çıkarılır.\n" +
                            "\n",
                    "Mutlak değerin içindeki değer ne olursa olsun, sonuç daima ya sıfıra eşit veya sıfırdan büyük olur.",
                    "Bir mutlak değerli ifadenin sonucu asla sıfırdan küçük bir sayı olamaz. Ancak herhangi bir harf mutlak değerden kurtulduğunda önüne (-) işareti geliyorsa bu sonucun pozitif olması içindir.",
            };
    public static String uslu[] = {
            "(a) reel sayı ve (m) bir pozitif tamsayı olmak üzere; am  ifadesi, m tane (a) nın çarpımını gösterir.",
            "am = a . a . a...a şeklinde gösterilir.",
            "a bir reel sayı,   n bir pozitif tamsayı olmak üzere, n tane a sayısının çarpımı an dir." +
                    "(a ya taban,   n ye kuvvet denir.)",
    };
    public static String koklu[] = {
            "n, 1’den büyük pozitif bir tam sayı olmak üzere, " +
                    "a" +
                    "n" +
                    "=" +
                    "x" +
                    " denklemini sağlayan a sayısına x’in ‘n’ dereceden kökü denir ve bu da " +
                    "a" +
                    "=" +
                    "n" +
                    "√" +
                    "x" +
                    " şeklinde gösterilir.",
            "Köklü bir ifadede kökün derecesi yazmıyorsa 2 olarak kabul edilir.",
            "Sadeleştirme: Kök derecesi ve kök içindeki sayının derecesine bakılır. Bunları, problem içinde ihtiyaç duyacağımız ve tam olarak bölebilecek bir sayıya böleriz ve ifade sadeleştirilir.",
            "Genişletme: Bu sefer de genişletmek istediğimiz ortak sayı ile kökün derecesi ve kök içindeki sayının derecesi çarpılır.",
            "İki başlık öncesini hatırlarsak kök içindeki sayının kuvvetini köklü ifadenin derecesine bölerek, sayıyı kök dışına çıkartıyorduk. İşte bu yöntemle köklü sayı üslü sayıya dönüştürülür",
            "Köklü ifadelerde toplama veya çıkarma yapılması için 2 şart vardır. Bunlar, toplanacak veya çıkarılacak ifadelerde, kökün derecesi ve kök içindeki sayının AYNI olma şartlarıdır.",
            "Toplama ve çıkarmada kök dereceleri ve kök içindeki sayı aynı olmalıydı. Çarpma veya bölmede ise işlemin yapılabilmesi için sadece kök derecelerinin AYNI olması yeterlidir. Kök dereceleri aynı ise kök içindeki sayılar aynı köklü ifadede çarpılır veya bölünür.",

    };
    public static String carpanlar[] = {
            "Toplama veya çıkarma biçiminde verilen ifadeleri çarpım veya bölüm şeklinde yazma işlemine çarpanlara ayırma denir.",
            "3x+3y ifadesinde 3’ler ortaktır bu nedenle ifadeyi 3 parantezine alırız:",
            " ax+ay+bx+by=a.(x+y)+b.(x+y)= (x+y).(a+b)" +
                    "ax+ay+bx+by ifadesinde a’ların, b’lerin, x’lerin veya y’lerin ortaklığı kullanılarak paranteze alınabilir.",
            "İki kare farkı çarpanlara ayırmadaki en önemli özdeşliktir. Özdeşliği sözel olarak ifade edersek: iki sayının karelerinin farkı, bu sayıların farkı ile toplamının çarpımına eşittir." +
                    "a2-b2= (a-b).(a+b)" +
                    "ax2+bx+c İfadesinin Çarpanlarına Ayrılması: a=1 ise toplamları b, çarpımları c sayısını veren m ve n sayılarını bularak çarpanlarına ayırabiliriz.",
            "Tam kare açılımı benim özellikle sevdiğim bir açılımdır. İlk öğrendiğim günden beri tekerleme gibi hafızama kazınmıştır. Hala soru çözerken “birincinin karesi, birinci ile ikincinin çarpımının iki katı, ikincinin karesi” diye aklımdan geçiririm. Sen de birkaç soruda tekrarladıktan sonra benim gibi unutmayacaksın eminim.",
            "(a+b)2 = a2 + 2ab + b2\n" +
                    "(a-b)2 = a2 – 2ab + b2",
            "(a + b)3 ve (a – b)3 ifadelerinin eşitlerini binom açılım yardımı ile de bulabiliriz. Yeri gelmişken binom açılımı da hatırlayalım:\n (a + b)3 = a3 + 3a2b + 3ab2 + b3\n" +
                    "(a – b)3 = a3 − 3a2b + 3ab2 − b3",
            "İki Küp Farkı ve Toplamı:\n" +
                    "x3+y3=(x+y).(x2-xy+y2)\n" +
                    "x3-y3=(x-y). (x2+xy+y2)",
    };
    public static String oran[] = {
            "Birimleri aynı olan x ve y gibi iki reel sayının birbirine bölümüne oran denir . x ve ye reel sayı ve y sıfırdan farklı olmak üzere x in y ye oranı x/y şeklinde gösterilir.",
            "Örnek : Bir sınıfta 15 erkek 17 kız öğrenci vardır.Buna göre sınıftaki kızların tüm sınıfa oranını bulunuz?",
            "En az iki tane oranın eşitliğine orantı denir.",
            "x/y=z/t=k ikili oranında k ye orantı sabiti denir.\n" +
                    "Bütün orantılar bir orantı sabitine eşittir.\n" +
                    "x,y,z nin dördüncü orantılısı t ise x/y=z/t dir.\n" +
                    "Örnek: 4,5 ve 12 nin dördüncü orantısı kaçtır?",
            "x / y = z / t ifadesinde (x/y=z/t) içler (y ile z) çarpımı dışlar (x ile t) çarpımına eşittir.",
            "x/y=z/t=k ifadesinde x=y.k ve z=t.k dır.",
            "x/y=z/t=k ise y/x=t/z=1/k dır.",
            "x/y=z/t=k orantısında\n" +
                    "(x+z)/(y+t)=k dır\n" +
                    "a ve b sıfırdan farklı reel sayılar olmak üzere xa/ya=zb/tb=k ve (xa+zb)/(ya+tb)=k dır.",
            "x/y=z/t=k ise x^n/y^n =z^n/t^n =k^n dir.",
            "x/y=z/t=a/b=k orantısında x/y.z/t=k^2 ve x/y z/t a/b=k^3 tür.",
            "DOĞRU ORANTI\n" +
                    "a ve b büyüklükleri herhangi bir sabitle birbirine bağlı olsun.Eğer a artarken b de artıyorsa ya da a azalırken b de azalıyorsa a ile b doğru orantı lıdır ya da orantılıdır denir.",
            "k sayısı sıfırdan büyük olmak üzere a/b=k şeklinde gösterilir.\n" +
                    "x,y ve z sayıları sırasıyla a,b ve c ile doğru orantılı ise x/a=y/b=z/c=k veya x:y:z=a:b:c şeklinde gösterilir.",
            " (x-1) sayısı y ile doğru orantılıdır. X =5 iken y=4 ise x=20 iken y kaçtır?",
            "TERS ORANTI\n" +
                    "a ve b nin büyüklükleri herhangi bir sabitle birbirine bağlı olsun.Eğer a artarken b azalıyorsa ya da a zalırken b artıyorsa a ile b ters orantı lıdır denir. k>0 olmak üzere a.b=k şeklinde gösterilir.",
            "X,y,z sayıları sırasıyla a,b ve c ile ters orantı lı ise x.a=y.b=z.c şeklinde gösterilir.",
            "x,y,z sayıları sırasıyla 2,3 ve 4 ile ters orantılı ve x+y+z= 39 ise x kaçtır? Örnek : Eşit kapasiteli 10 musluk bir havuzu 30 saatte doldurabiliyorsa aynı kapasitede 15 musluk havuzu kaç saatte doldurur?",
            "BİLEŞİK ORANTI\n" +
                    "İçerisinde hem doğru hem de ters orantı olan orantılardır. x sayısı y ile doğru,z ile ters orantılı ise (x.z)/y=k dır. x,y ve z sayıları sırasıyla a ile doğru , b ve c ile ters orantılı ise x/a=y.b=z.c dir.",
            "(x+1) sayısı (y-1) ile doğru ve z ile ters orantılıdr. x=4 ve y=2 iken z=6 ise x=5 y=3 iken z=?",
    };
    public static String ort[] = {
            "Bir sayı dizisindeki sayıların toplamının sayı adedine bölünmesiyle aritmetik ortalama bulunur.\n" +
                    "\n" +
                    "a₁,a₂,a₃…..aₙ sayılarının aritmetik ortalama sı A.O=(a₁+a₂+a₃….+aₙ)/n dir.",
            "Matematik sınavı notları 70,80 ve 80 olan Ali’ye öğretmeni sözlülerden 85,85 verdiğine göreAlinin karneye düşen notu kaçtır?",
            "GEOMETRİK ORTALAMA\n" +
                    "n tane pozitif sayının çarpımının n. kuvvetten köküne geometrik ortalama denir.\n" +
                    "\n" +
                    "a₁,a₂,a₃…..aₙ sayılarının geometrik ortalaması G.O= ⁿ√ a₁,a₂,a₃…..aₙ ) dır.",
    };
    public static String problemler[] = {
            "Matematikte Problem Çözme Teknikleri\n" +
                    "Bu stratejiler;\n" +
                    "Geriye doğru ilerleyerek çalışmak.\n" +
                    " \n" +
                    "Örüntü/bağlantı bulmak.\n" +
                    " \n" +
                    "Farklı bir bakış açısı benimsemek.\n" +
                    " \n" +
                    "Benzer, daha basit bir problem çözmek.\n" +
                    " \n" +
                    "Özel/uç durumları göz önünde bulundurmak\n" +
                    " \n" +
                    "Görsel temsil kullanmak. (resim/diyagram çizmek)\n" +
                    " \n" +
                    "Akıllı tahmin ve kontrol yapmak.\n" +
                    " \n" +
                    "Tüm durumları listelemek.\n" +
                    " \n" +
                    "Verileri düzenlemek.\n" +
                    " \n" +
                    "Mantıksal akıl yürütmek.",
            "Problemler konusunda herhangi bir ipucu veremiyoruz. Bol bol soru çözmeye özen gösteriniz."
    };
    public static String Kümeler[] =

            {
                    "A ve B kümelerinin kesişimi ortak özellik yöntemi ile A ∩ B = { x | x  ∈ A ve x ∈ B } şeklinde ifade edilir.",
                    " A = { 1, 2, 3, 4 } ve B = { 3, 4, 5, 6, 7 }\n" +
                            "\n" +
                            "A ∩ B = { 3, 4 }"
            };
    public static String Per[] = {
            "Permütasyon formülü P ( n,r ) = ( {n} n-r ) = n! / ( n-r ) ! şeklinde formüle edilir.",
            "Permütasyon soruları ve örnekleri üzerinden işlemleri çok daha rahat bir şekilde yapmak adına pratik kazanmak söz konusudur. Tekrarlı ve tekrarsız permüstasyon olarak, soruya bağlı 2 formülden biri kullanılır ve bu sayede sorular çözülür. Formüllerden ilki tekrarlı permütasyon, diğeri ise tekrarsız permütasyondur.",
            "Konuyu daha net bir şekilde anlamak için çok sayıda soru çözülmesi gerekir. Örnek olarak 3 kişinin 2 kişilik bir yere kaç farklı şekilde oturabileceğini hesaplamak için formül kullanmak yeterli olur.",
            "Kombinasyon formülü C (n,r)= n!/ (( n-r)!.r !) olarak ifade edilir.",
            "Kombinasyon; grup oluşturma, seçme, 2li, 3lü gibi çeşitli gruplar oluşturmayı ifade eder. Konu daha net algılanması açısından örnek verecek olursak, 5 kişiden meydana gelebile 3lü grup sayısı 5'in 3'lü kombinasyonu şeklinde hesaplanmaktadır.",
            "N elemanlı olan bir küme içinde meydana gelen r elemanlı kombinasyon C (n,r) şeklinde gösterilmektedir. Formüllerin tabanını bu oluşturmaktadır.",
            "Örnek olarak 5 elemanlı olan kümede 3 elemanlı kombinasyon kaç olur? Sorusuna yanıt verebiliriz.\n" +
                    "\n" +
                    "C (5,3)= 5x4x3:3x2x1 ifadesinden yanıt 10 olarak hesaplanmaktadır.",
    };
    public static String olasılık[] = {
            "Toplama Kuralı\n" +
                    "Aynı anda gerçekleşmeyen(olasılıkları kesişmeyen/ayrık)(mutually exclusive) olayların toplam gerçekleşme olasılığı, her olayın gerçekleşme olasılıklarının toplamına eşittir.",
            "Örnek: Elimize bir zar olsun. Zarı attığımızda 2 veya 5 gelme olasılığı nedir?\n" +
                    "\n" +
                    "P(2) = 1/6\n" +
                    "P(5) = 1/6\n" +
                    "P(2 veya 5) = P(2) + P(5)\n" +
                    "P(2 veya 5) = 1/6 + 1/6 = 1/3 çıkar.",
            "rtaklı Toplama Kuralı\n" +
                    "Olaylar birlikte de gerçekleşebiliyorsa(olasılıkları kesişiyorsa)(non-mutually exclusive) diğer ifadeyle ortak olasılık olduğu durumlar varsa kullanılır.",
            "Örnek: Bir sınıfta 17 erkek ve 13 kız toplam 30 öğrenci olsun. Sınavda 4 erkek ve 5 kız tam not A aldı. Sınıftan rasgele bir öğrenci seçtiğimizde bunun kız öğrenci veya A alan öğrenci olma olasılığı nedir?\n" +
                    "\n" +
                    "P(Kız veya A) = P(Kız) + P(A) — P(Kız ve A)\n" +
                    "P(Kız veya A) = 13/30 + 9/30–5/30 = 17/30 sonucunu verir.",
            "Bağımsız Çarpma Kuralı\n" +
                    "Bağımsız olayların(olayın gerçekleşmesi diğerinin gerçekleşmesini etkilemiyorsa) gerçekleşme olasılığı, bu olasılıkların çarpımına eşittir.",
            "Örnek: Elimizde bir bozuk para ve bir zar olsun. İkisini de aynı anda atalım. Paranın tura gelme ve zarın 3 gelme olasılığını hesaplayalım.\n" +
                    "\n" +
                    "P(Tura) = 1/2\n" +
                    "P(3) = 1/6\n" +
                    "P(Tura ve 3) = 1/2 * 1/6 = 1/12 buluruz.",
            "Bağımlı Çarpma Kuralı\n" +
                    "Gerçekleşmesi beklenen olaylar bağımlı ise bu olayların ortak olasılığını hesaplamakta kullanılır.",
            "Örnek: Sınıfta 12 erkek ve 18 kız öğrenci var. Öğretmen sınıf listesinden rasgele iki öğrenci işaretliyor. Bu iki öğrencinin de kız olma olasılığı nedir?\n" +
                    "\n" +
                    "P(Kız1 ve Kız2) = P(Kız1) * P(Kız2|Kız1)\n" +
                    "P(Kız1 ve Kız2) = 18/30 * 17/29 = 306/870 bulunur.",
            "Koşullu Olasılık\n" +
                    "Her iki olay da birbirine bağımlı ise ve birinin gerçekleşme olasılığı diğerini de etkilemekteyse önceki konuda tanımını verdiğim koşullu olasılık formulünü kullanırız.",
            "Örnek: Bir matematik öğretmeni sınıfa iki test verdi. Sınıfın %25'i her iki testten de geçti ve sınıfın %42'si ilk testi geçti. İlk sınava girenlerin yüzde kaçı ikinci sınavı geçti?\n" +
                    "\n" +
                    "P(A) = 0.42\n" +
                    "P(A ve B) = 0.25\n" +
                    "P(B|A) = P(A ve B) / P(A) = 0.25 / 0.42 = 0.60 = %60 buluruz.",
    };

    public static String istatistik[] = {
            "Bir veri grubuyla ilgili genel eğilimi gösteren ölçülere eğilim ölçüleri denir. ",
            "Merkezi eğilim ölçüsü, bir veri grubunu oluşturan sayıların hangi sayı etrafında toplandıklarını gösterir. Dolayısıyla veri grubu hakkında kullanışlı ve etkin bilgi almamızı sağlar.",
            "Aritmetik Ortalama: Veri grubundaki tüm sayıların toplamının veri sayısına\n" +
                    "        bölümüne aritmetik ortalama denir. Kısaca, ortalama olarak da ifade edilebilir.",
            "Medyan (ortanca): Küçükten büyüğe doğru sıralanmış bir sayı dizisinde; terim\n" +
                    "        sayısı tek sayı ise bu dizinin tam ortasındaki sayıya dizinin medyanı (ortancası) denir,\n" +
                    "        terim sayısı çift sayı ise ortadaki iki terimin aritmetik ortalamasına o dizinin medyanı\n" +
                    "        (ortancası) denir.",
            "Tepe Değer (Mod): Bir veri grubunda en çok tekrar eden sayıya o veri grubunu\n" +
                    "        oluşturan sayı dizisinin tepe değeri (modu) denir.",
    };
    public static String İkinciDerece[] = {
            "a, b, c reel sayı ve a ¹ 0 olmak üzere,\n" +
                    "\n" +
                    "      ax2 + bx + c = 0\n" +
                    "\n" +
                    "ifadesine x e göre düzenlenmiş ikinci dereceden bir bilinmeyenli denklem denir. Denklemi sağlayan (varsa) x reel sayılarına denklemin kökleri, tüm köklerin oluşturduğu kümeye denklemin çözüm kümesi (doğruluk kümesi), çözüm kümesini bulmak için yapılan işleme de denklem çözme denir.",
            "Çarpanlara Ayırma Yoluyla Denklem Çözme\n" +
                    "ıkinci dereceden denklemin çözüm kümesi, kolaylıkla görülebiliyorsa, çarpanlarına ayrılarak bulunur. Bunun için,\n" +
                    "\n" +
                    " olmak üzere,\n" +
                    "\n" +
                    "a × b = 0 ise, (a = 0 veya b = 0) olduğu göz önüne alınacaktır.",
            "Köklü Denklemlerin Çözümü\n" +
                    "Bir denklemde bilinmeyen, kök içinde bulunuyorsa bu denkleme köklü denklem denir.\n" +
                    "\n" +
                    "Denklemde köklü terim bir tane ise, köklü terim eşitliğin bir tarafında yalnız bırakılır. Sonra kökün derecesine göre kuvvet alınır. Gerekli işlemler yapılarak denklem çözülür. Bulunan köklerden köklü terimi tanımsız yapmayanlar alınır.",
            "Kök içini sıfır yapan değerlere göre, inceleme yapılarak çözüme gidilir. Örneğin;\n" +
                    " |x – 1| + 2x = 5 denkleminde (x £ 1 ve x >1) alınarak çözüme gidilir.",
    };
    public static String Polinomlar[] = {
            "a0, a1, a2, a3 …, an ϵ R ve n ϵ N olmak üzere P(x) = a0+a1.x+a2.x2+a3.x3+….+an.xn biçimindeki ifadelere x değişkenine göre düzenlenmiş reel katsayılı polinom (çok terimli) denir.",
            "Burada a0, a1, a2, a3 …, an reel sayılarına polinomun katsayıları, a0, a1.x, a2.x2, a3.x3,…., an.xn ifadelerine polinomun terimleri olarak adlandırılır.",
            "an.xn terimindeki an sayısına terimin katsayısı, x’in kuvveti olan n sayısına terimin derecesi olarak adlandırılır.",
            "Derecesi en büyük olan terimin derecesine polinomun derecesi denir ve der [P(x)] ile gösterilir. Derecesi en büyük olan terimin katsayısı ise polinomun baş katsayısı olarak adlandırılır.",
            "Polinomlar katsayılarına göre isimlendirilir. Katsayılarımız reel sayı ise reel katsayılı polinomlar, rasyonel sayı ise rasyonel katsayılı polinomlar, tam sayı ise tam katsayılı polinom denir.",
            "P(x) = 8x3 – 3x2 + 4x – 9\n" +
                    "\n" +
                    "a) P(x) polinomunun katsayılarını yazınız:\n" +
                    "b) P(x) polinomunun terimlerini yazınız:\n" +
                    "c) P(x) polinomunun baş katsayısını yazınız:\n" +
                    "d) P(x) polinomunun derecesini yazınız:\n" +
                    "Çözüm 1:\n" +
                    "\n" +
                    "a) 8,-3,4,-9\n" +
                    "b) 8x3,– 3x2, 4x,- 9\n" +
                    "c) 8\n" +
                    "d) der [P(x)] = 3",
    };


    public static String tablo[] = {};
    public static String sayisalMantik[] = {};
    public static String geometri[] = {};

    public static String SözcükteAnlam[] = {
            "Gerçek Anlam\n" +
                    "Sözcüklerin herkesçe bilinen anlamına gerçek anlam denir. Herkeste buna ilişkin ortak bir anlam vardır. Gerçek anlam, akla ve mantığa aykırı değildir.",
            "Yan Anlam\n" +
                    "Gerçek anlamda olmayan bir sözcüğün somut bir kavramın ya da varlığın yerine kullanılmasıdır. Yan anlam bugüne kadarki – 1968’den beri – sınavlarda hiç yoklanmamıştır. Örnekler:\n" +
                    "Bu sabah güneşin ışıkları pencereme değiyordu.",
            "Mecaz Anlam\n" +
                    "Bir sözcüğün herkesin bildiği ve düşündüğü bir anlamın dışında, gerçekte mümkün olmayan bir anlamda kullanmaktır. Bu anlam, soyut ve görecelidir.Örnekler:\n" +
                    "\n" +
                    "Sanatçımız bugün sadece parantezler içinde yaşamaya çalışıyor.",
            "Nicel Anlam\n" +
                    "Sözcüğün algıya seslenen, somut anlamda kullanılmasıdır.\n" +
                    "Örnek: Geniş balkonlu bir evde oturuyorum.\n" +
                    "Bu cümlede geçen “geniş” sözcüğü ölçülebilir ve somut olduğu için niceldir.",
            "Nitel Anlam\n" +
                    "Sözcüğün algısal olmayan yani soyut bir anlamda kullanılmasıdır. Sözcük Düzeyinde Anlam\n" +
                    "\n" +
                    "Örnek: Hiçbir şeyi kafaya takmayan, geniş bir insandı.\n" +
                    "\n" +
                    "Yukarıdaki cümlede geçen” geniş” sözcüğü soyut bir anlam taşıdığı için nitel anlamlıdır.",
            "Terimsel Anlam\n" +
                    "Bir sözcüğün bilim, sanat ve meslek dalları için kullanılmış anlamına terimsel anlam denir.\n" +
                    "\n" +
                    "Örnekler: endemik, enlem, boylam , açı, dize, uyak, redif vb.",
            "Sanatsal / Düşsel Ögeler (Anlam Olayları)\n" +
                    "Bir ifadede gerçek anlam dışılık varsa (fantastik anlamda kullanılmışsa) o ifadede anlam olayı veya başka türlü söyleyiş vardır. Bu duruma da düşsel öge veya anlam olayı denir.",
            "Ad Aktarması\n" +
                    "Bir adın benzetme amacı olmadan başka bir ad yerine kullanılmasıdır.\n" +
                    "\n" +
                    "Örnekler:\n" +
                    "\n" +
                    "Pamuk teyze ölünce bizim ev uzun süre onu konuştu.\n" +
                    "Bizim evin önündeki portakal bu yıl çiçek açmadı.",
            "Benzetme\n" +
                    "Bir varlığı başka  bir varlık gibi düşündürme veya iki varlık arasında çeşitli yönlerden ilişki kurmadır. Örneğin bulutları, uçan kazlar gibi düşündürürsek benzetme yapmış oluruz.\n" +
                    "\n" +
                    "Örnekler:\n" +
                    "\n" +
                    "Şehir narin bir boyna takılı zarif bir gerdanlık gibi duruyordu.",
            "Kişileştirme\n" +
                    "İnsana ilişkin bir özelliği insan dışı kavramlar ve varlıklar için kullanmaya denir.\n" +
                    "\n" +
                    "Örnekler:\n" +
                    "\n" +
                    "Sesler liman sislerine boğulur",
            "Dolaylama\n" +
                    "Bir kavramı en az iki sözcükle anlatmaya denir.\n" +
                    "\n" +
                    "Örnekler:\n" +
                    "\n" +
                    "Balık = Derya kuzusu",
            "Hem Gerçek Hem Mecaz Anlamlı Kullanım(Kinaye)\n" +
                    "Bir ifadenin hem gerçek hem mecaz anlamı düşündürmesidir. Deyim ve atasözlerimizin çoğu kinayelidir. Kinayeli ifade hem gerçek hem mecazlıdır. Örneğin “Hamama giren terler.” sözünde gerçekten hamama giren kişinin terleyeceği anlamı olduğu gibi mecazen de bir işe girişen o işin zorluklarına katlanır anlamı da sezilmektedir.",
            "Kinayeli Söyleyiş\n" +
                    "Bir anlam inceliği elde etmek için sözün tersini kastederek sözü alaysamalı bir üslupla kullanmaya denir.\n" +
                    "\n" +
                    "Örnekler:\n" +
                    "\n" +
                    "Dersin bitmesine yakın sınıfa gelen bir öğrenciye, “Ne kadar erkencisin!” denilmesi kinayeli söyleyiş örneğidir.",
            "Sözcüğü İki Gerçek Anlamda Kullanma\n" +
                    "Bir sözcüğü bir kez kullanıp iki gerçek anlamı sezdirmeye denir.\n" +
                    "\n" +
                    "Örnekler.\n" +
                    "\n" +
                    "– Dedem evlenmek istemeyen kardeşime :‘’ Oğlum sarımsak da acıdır ama her evde lazım bir dişi.’’ derdi.",
            "Somut Sözcükler\n" +
                    "Algısal olan, varlığı duyularla algılanabilen sözcüklere somut sözcük denir. Yani bir kavram göz (görme), kulak (işitme), ten (dokunma), burun (koklama), dil (tatma) duyularına seslenen bir ayrıntı taşıyorsa somuttur, diyebiliriz.\n" +
                    "\n" +
                    "Örnekler: Taş, ağaç, duvar, toprak…",
            "oyut Sözcükler\n" +
                    "Algısal olmayan, varlığı duyu organlarıyla algılanmayan sözcükler soyut sözcüklerdir.\n" +
                    "\n" +
                    "Örnekler: Düşünce, dert, kin, beklenti…",
            "Somutlama\n" +
                    "Soyut bir şeyi somut bir şey gibi düşündürmeye  denir. Somutlaştırmalar, genellikle kişileştirmelerle ve benzetmelerle yapılır.\n" +
                    "\n" +
                    "Örnekler:\n" +
                    "\n" +
                    "“Her gece yalnızlığımın sesi yankılanır penceremden dışarıya.”",
            "oyutlama\n" +
                    "Somut anlamlı sözcüklerin mecazlaşıp anlamını kaybetmesine denir.\n" +
                    "\n" +
                    "Örnek: Eşyalarını da yanına alıp gidince o, içimde genişçe bir boşluk oluştu.",
            "Duyular Arası Aktarma\n" +
                    "Bir duyu alanına ilişkin bir kavramı başka bir duyu alnıyla ilişkilendirmedir.\n" +
                    "\n" +
                    "Örnekler:\n" +
                    "\n" +
                    "“Çiğ” tatma duyusu ile ilgili bir niteliktir. Ama “Evin yeni duvarları çiğ bir sarıya boyanmıştı.” cümlesinde geçen “çiğ” sözcüğü görme duyusu ile ilgili kullanıldığı için duyu aktarımı yapılmıştır.",
            "Anlamdaş Sözcükler\n" +
                    "Aynı anlamı karşılayan sözcüklere anlamdaş sözcüklere denir.\n" +
                    "\n" +
                    "Örnekler:\n" +
                    "\n" +
                    "Didik didik etmek = Ayrıntılı olarak",
            "Yakın Anlamlı Sözcükler\n" +
                    "Düşünmek = tasarlamak",
            "Karşıt Anlamlı Sözcükler\n" +
                    "Anlamca birbirine ters düşen sözcükler karşıttır.\n" +
                    "\n" +
                    "Örnekler:\n" +
                    "\n" +
                    "Yazın başı pişenin kışın aşı pişer.",
            "Sesteş Sözcükler\n" +
                    "\n" +
                    "Sözcükte Anlam Soru Çözüm Teknikleri\n" +
                    "Aralarında ses bakımından bir benzerlik, anlam bakımından bir farklılık bulunan sözcüklere sesteş sözcük denir.\n" +
                    "\n" +
                    " Örnekler:\n" +
                    "\n" +
                    "Yaz geldi bizim oralara",
            "Kapsamlarına Göre Sözcükler\n" +
                    "Kimi sözcüklerin karşıladıkları varlıkların alanı genişken kimilerininki daha sınırlı olabilir; sözcükler kapsam özelliklerine genel ve özel anlamlı olabilir.\n" +
                    "\n" +
                    "En genel anlamlı sözcük varlıktır. Çünkü her canlı  varlık içine girer.\n" +
                    "\n" +
                    "Genelden Özele Bir Sıralama Yapalım: Canlı==>hayvan==>kuş==>atmaca\n" +
                    "\n" +
                    "Özelden Genele Bir Sıralama Yapalım:\n" +
                    "\n" +
                    "Köy==>ilçe==>il==>ülke",
            "Yansıma Sözcükler\n" +
                    "Doğadaki nesnelerin ve canlıların çıkardıkları seslerin kulağa yansıyan anlamsız seslerine yansıma sözcük denir: cız, gür, fır, pat, tık, hav, mee, cik cik vb.\n" +
                    "\n" +
                    "Aşağıdaki cümlelerde geçen altı çizili sözcükler yansımalardan türemiştir:\n" +
                    "\n" +
                    "Yağın cızırtısını balkondan duydum.",
            "İkilemeler\n" +
                    "Anlatımı güçlendirmek için eş anlamlı, karşıt anlamlı sözcüklerin veya aynı sözcüğün tekrar edilmesiyle oluşan söz gruplarıdır.\n" +
                    "\n" +
                    "Oluşumları\n" +
                    "Aynı sözcüğün tekrarlanmasıyla oluşan ikilemeler: mışıl mışıl, iri iri, ağır ağır vb.",
            "Deyimler\n" +
                    "En az iki sözcükten oluşmuş ve insan topluluklarının durumlarını anlatmak için seçilen kalıplaşmış sözlere deyim denir: elden ayaktan düşmek, akla karayı seçmek, gözden düşmek, sevinçten havalara uçmak vb.",
            "Atasözleri\n" +
                    "Bir durumu, bir olayı en az sözcükle ders verici bir anlayışla özetleyen özlü ve kalıplaşmış sözlere atasözü denir.\n" +
                    "\n" +
                    "Önemli! Atasözlerinde amaç dinleyene ders vermektir. Bu nedenle her atasözünde bir ana düşünce ve iddia vardır.\n" +
                    "\n" +
                    "Ağaca çıkan keçinin dala bakan oğlağı olur."
    };
    public static String CümledeAnlam[] = {
            "Öznel Anlatım\n" +
                    "\n" +
                    "Doğruluğu ya da yanlışlığı kişiden kişiye değişen, doğruluğu tartışılan düşüncelerin anlatıldığı yargılara öznel yargı denir. Bu yargıların kullanıldığı anlatıma da öznel (subjektif) anlatım denir. Bu cümlelerde (yargılarda) bence ifadesi vardır.\n" +
                    "\n" +
                    "* İzmir, tarihi ve doğal güzellikleriyle eşsiz bir şehrimizdir.",
            "Nesnel Anlatım\n" +
                    "\n" +
                    "Doğruluğu ya da yanlışlığı kişiden kişiye değişmeyen, deney ve gözleme dayanan tarafsız yargılara nesnel yargı denir. Bu yargıların kullanıldığı anlatıma da nesnel (objektif) anlatım denir. Nesnel yargılarda duygu ve izlenimlere yer verilmez.\n" +
                    "\n" +
                    "Filmde olaylar küçük bir kasabada geçiyor.",
            "Koşula (Şarta) Bağlılık\n" +
                    "\n" +
                    "Bir olayın, durumun gerçekleşmesi için daha önceden olması gereken başka bir durumun varlığına “koşulluk” denir. Bu tip cümle anlamlarında “hangi şartla?” sorusunu temel cümleye sorduğumuzda gerçekleşmesi gereken koşulu bulabiliriz.\n" +
                    "\n" +
                    "Sanatçı yapıtında toplumu anlatırsa ölümsüzleşir.",
            "Sebep-Sonuç (Neden-Sonuç) İlişkisi\n" +
                    "\n" +
                    "Bu tür cümlelerde, yargılardan biri, diğerinin gerçekleşmesine neden olmaktadır. Bir de eylemin hangi gerekçeyle yapıldığını bildiren cümleler de neden sonuç ilişkisi vardır. Bu tür cümlelerde neden-sonuç bildiren eylemlerin her ikisi de yapılmış, tamamlanmış, bitmiştir. Bu tip yargıları bulmak için yükleme “niçin?” sorusu sorulabilir.\n" +
                    "\n" +
                    "“Salıncağın ipi kopunca çocuk yere düştü.” cümlesinde “çocuğun yere düşmesini”nin nedeni “Salıncağın ipinin kopması”na bağlanmıştır.",
            "Amaç-Sonuç İlişkisi\n" +
                    "\n" +
                    "Öznenin işi, hareketi gerçekleştirme amacı ve sonucu cümle içinde verilir. Bu tür cümlelerde “için, diye, üzere, dolayı, ötürü, maksadıyla…” ifadeleri sıkça geçer. Bu ifadelerden bazıları “sebep-sonuç” bildiren cümlelerde de geçebilir. Amaç-sonuç cümlelerinde “hangi amaçla? hangi maksatla?” soruları sorulabilir.\n" +
                    "\n" +
                    "Borçlarından kurtulmak için evini satmış.",
            "Doğrudan (Düz) Anlatımlı Cümleler\n" +
                    "\n" +
                    "Doğrudan anlatımlı cümlelerde herhangi bir konuda bir kişinin görüş ve düşünceleri hiçbir değişikliğe uğratılmadan verilir. Bu cümle genellikle tırnak içinde gösterilir.\n" +
                    "\n" +
                    "Çiçero’nun “Bir yerde yaşam varsa orada umut da vardır.” sözü çok hoşuma gider.",
            "Dolaylı Anlatımlı Cümleler\n" +
                    "\n" +
                    "Bir kişinin sözünün söylendiği biçimde değil de, bazı değişiklikler yapılarak aktarıldığı cümlelerdir.\n" +
                    "\n" +
                    "Onunla bir daha konuşmayacağını söyledi.",
            "Üslup ve İçerik (Konu) Cümlesi\n" +
                    "\n" +
                    "Yazarın yapıtında neyi anlattığı konuya (içerik) girer; bu konuyu işlerken kullandığı sözcükler ve cümleler, dili kullanma biçimi/tarzı üsluba girer.\n" +
                    "\n" +
                    "Yazar yapıtında 1.Dünya Savaşı yıllarındaki insanların çektiği acıları gözler önüne serer. (Konu)",
            "Aşamalı Durum Bildiren Cümleler\n" +
                    "\n" +
                    "Bir olayın, durumun olumlu ya da olumsuz yönde giderek değiştiğini anlatan cümlelerdir.\n" +
                    "\n" +
                    "Kadın, her geçen gün biraz daha kötüleşiyor.",
            "Kinayeli Anlatımlı Cümle\n" +
                    "\n" +
                    "Bir gerçeği ortaya koymak amacıyla sözü imalı olarak tam karşıtı gelecek biçimde kullanmaktır. Atasözlerinde, özdeyişlerde ve deyimlerde kinaye yoğun olarak bulunur.\n" +
                    "\n" +
                    "Okulunu ne kadar çok sevdiğin yirmi gün devamsızlık yapmandan belli.",
            "Atasözü: Çok önceleri söylenmiş olup dilden dile, nesilden nesile geçerek günümüze kadar gelmiş, öğüt bildiren, atalarımızın hayat tecrübelerini yansıtan ve milletin ortak malı haline gelmiş olan sözlerdir.",
            "Atasözlerin Özelliklerini Şöylece Özetleyebiliriz:\n" +
                    "\n" +
                    "Atasözleri halkın ortak malıdır. Söyleyeni belli değildir (anonimdir).\n" +
                    "Kalıplaşmış sözlerdir. Sözcüklerin sırası değiştirilemez. Bir sözcüğün yerine başka bir sözcük konulamaz.\n" +
                    "Kısa ve özlü sözlerdir. Hep insanları ilgilendiren sözlerdir.\n" +
                    "Atasözlerinde geçen sözcükler genellikle gerçek anlamları dışında kullanılmıştır. (Kaz gelen yerden tavuk esirgenmez.)  Kimi atasözlerinde geçen sözcükler ise gerçek anlamlarıyla kullanılmıştır. (Son pişmanlık fayda vermez)\n" +
                    "Sorularda çoğunlukla atasözlerinin anlamları üzerinde durulur.",
            "Özdeyişler, ünlü kişilerin, devlet adamlarının, sanatçıların söylemiş oldukları kısa fakat anlamca  zengin olan sözlerdir.\n" +
                    "\n" +
                    "“Hayatta en hakiki mürşit ilimdir.” (Atatürk)\n" +
                    "“Kargalar ötmeye başlayınca bülbüller susar.” (Hz. Mevlana)",
            " DEYİM\n" +
                    "\n" +
                    "Bazen bir olay veya durumu ifade etmek için, o olay veya durumu birebir karşılayacak kelimeler kullanmayız da; çağrışım yaptıracak söz grupları kullanırız. Bunu da ifademize sanat ve akıcılık kazandırmak için yaparız.\n" +
                    "\n" +
                    "Örneğin: Bir insanın telaşlı olduğunu anlatmak için “telaşlıdır” demeyiz de “Etekleri tutuşmuş” ifadesini kullanırız , ama herkes bu kişinin telaşlı olduğunu anlar.",
            "Deyimlerin Özellikleri:\n" +
                    "\n" +
                    "*Deyimler en az iki kelimeden oluşur. (Kalp kırmak)\n" +
                    "\n" +
                    "Birden fazla kelimeden oluşan, hatta cümle halinde olan deyimler de vardır. (Taşı gediğine koymak) (Atı alan Üsküdar’ı geçti.)",
            "Tanımlama Cümlesi\n" +
                    "\n" +
                    "Herhangi bir şeyin ne olduğunu anlatan “Bu nedir?” sorusuna cevap verebilen cümlelere “tanım cümlesi” diyoruz.\n" +
                    "\n" +
                    "“Kitap, size istediğiniz zaman ders vermeye hazır bir öğretmendir.” cümlesinde “kitap nedir?”  dediğimizde “İstediğiniz zaman ders vermeye hazır bir öğretmendir.” cevabını alabiliriz.",
            "Ön Yargı (Peşin Hüküm) Cümlesi\n" +
                    "\n" +
                    "Bir olay veya kişiyle ilgili değişik sebeplerden dolayı önceden edindiğimiz olumlu veya olumsuz yargılardır. Kısaca özetlersek ön yargı, sonuçla ilgili önceden karar vermektir.\n" +
                    "\n" +
                    "Bu takım bu sene kesin şampiyon olacak.\n" +
                    "Biliyorum, ödevin beğenilmeyecek.",
            "Öneri (Tavsiye) Cümlesi\n" +
                    "\n" +
                    " Bir konudaki eksikliğin giderilmesi için teklif getirmeye “öneri” adı veriyoruz.\n" +
                    "\n" +
                    "Hikâyede olayların yeri ve zamanı iyi tahlil edilip, yazıya aktarılmalıdır.\n" +
                    "cümlesi bir öneri cümlesidir.",
            "Varsayım Cümlesi\n" +
                    "\n" +
                    "Bir durumun sonucunun ne olduğunu bilmeden onu kendimize göre bir sonuca bağlamaya “varsayım” diyoruz.\n" +
                    "\n" +
                    "Diyelim ki bu yıl sınavı kazandın.",
            "Karşılaştırma Cümlesi\n" +
                    "\n" +
                    "Karşılaştırma, aralarında anlamca ilgi (ilişki) olan iki kavramı benzerlik ya da zıtlık yönünden kıyaslamadır.\n" +
                    "\n" +
                    "“Sütten beyaz dişleri var.” cümledeki dişlerin beyazlığı, sütün beyazlığıyla karşılaştırılmıştır.",
            "Birliktelik (Beraberlik) İlgisi İçeren Yargılar\n" +
                    "\n" +
                    "Bu ilgi, çeşitli edat ve bağlaçlarla  (ile, ve…) sağlanır.\n" +
                    "\n" +
                    "Tatile ailemle gittik.",
            "Yorum Cümlesi\n" +
                    "\n" +
                    "Özneldir. Olay veya durumu bir görüşe göre değerlendirmedir.\n" +
                    "\n" +
                    "“Şairin çok severek okunulan kitap türü hikayedir.”",
            "Üslûp (Biçem) ile ilgili Cümleler\n" +
                    "\n" +
                    "Üslup, sanatçının dili kullanma biçimi, anlatım şeklidir. Bir sanat eserinin nasıl oluşturulduğu ile ilgili bilgi içeren yargılardır. Her sanatçının kendine göre bir üslûbu vardır.\n" +
                    "\n" +
                    "“Sanatçı, eserinde gerçekleri kısa, yalın cümlelerle dile getirmiştir.”\n" +
                    "cümlesinde yazarın “dili kullanma biçimine” değinilmiştir.",
            "Değerlendirme Cümlesi\n" +
                    "\n" +
                    "Herhangi bir durumun iyi ya da kötü yönlerini ortaya koymadır. Nesnel bir yargı söz konusudur.\n" +
                    "\n" +
                    "“Sanatçı, şiirlerinde yabancı sözcüklere bolca yer vermiştir.”",
            "Aynı ya da Yakın Anlamlı Cümleler\n" +
                    "\n" +
                    "Bu konu başlığımızla ilgili olarak, bize sorulan sorularda farklı sayıdaki cümlelerin ifade ettiği, içerdiği anlamın benzeri veya hemen hemen aynısı istenir.\n" +
                    "\n" +
                    "“Yüreğim ağzıma geldi.” cümlesiyle “Çok korktum.” cümlesi aynı anlama gelir.",
            "Karışık Olarak Verilen Sözcüklerle Cümle Kurma\n" +
                    "\n" +
                    "Bu tür sorularda bir cümleyi oluşturan sözcükler karışık olarak verilir. Daha sonra bu sözcüklerle anlamlı veya kurallı bir cümle oluşturulması istenir, veya sözcüğün sırası sorulur.\n" +
                    "\n" +
                    "Dikkat! Bu tip sorularda ilk işimiz; önce yüklemi bularak cümlenin sonuna getirmek sonra da sırasıyla öznenin bulunması ve tümleçlerin önem ve görevlerine göre cümlede uygun yerlere konmasıdır.",
            "Karışık Olarak Verilen Cümle Parçacıklarının Sıraya Konması\n" +
                    "\n" +
                    "Bu tür sorularda cümleyi oluşturan tamlamalar ya da cümlecikler karışık halde verilir. Bizden istenen bu parçacıkları anlamlı ve kurallı bir cümle durumuna getirmektir. Şıklardan hareket ederek, yargı bildiren (yüklem) kelime grubunu sona yerleştirip sıralama yapabiliriz.",
            "Eksik Cümlenin Tamamlanması\n" +
                    "\n" +
                    "Bu konuyla ilgili sorularda, boş bırakılan yerlerin cümlenin anlamı ve yapısına göre uygun kelimelerle tamamlanması istenmektedir. Böyle sorularda yapacağımız ilk iş, seçeneklerdeki sözcüklerin, cümledeki boşlukları en anlamlı ve kurallı şekilde tamamlanmasına dikkat etmektir. Bunun için de cümlede boş bırakılan yerlere söz dizimi kuralına uygunluk gösteren sözcükler konulmalıdır.\n" +
                    "\n" +
                    "Kelimelerin çekim durumlarına, tamlamaları parçalamamaya, kelimenin anlam özelliğine dikkat edilmelidir ki cümle en anlamlı ve kurallı bir yapı kazansın.",
    };
    public static String ParagraftaAnlam[] = {
            "Diğer Türkçe sorularında olduğu gibi bu tip sorularda da önce soru kısmı okunur.\n" +
                    "\n" +
                    "*Soru kısmı okunurken, sorunun olumlu ya da olumsuz olmasına dikkat edilmelidir.\n" +
                    "\n" +
                    "*Soru kısmında altı çizili ya da tırnak işareti içine alınmış bölümler varsa dikkatli olunmalı; bu bölümler dikkatli okunmalıdır.\n" +
                    "\n" +
                    "*Paragraf sorularında soruyu iyi anlamak, çözümün %70’ini halletmek demektir.",
            "Paragraf sorularını, okuma alışkanlığı olanların daha iyi çözdüğü anlaşılmaktadır. Bunun için tavsiyemiz, YKS’ye kadar her gün en az 15 sayfa kitap okunmasıdır. (Seçilen eserlerin deneme veya eleştiri türünde olması önerilir.)\n" +
                    "\n" +
                    "*Paragraf bir kompozisyon gibi ele alınmalıdır. Paragrafın giriş, gelişme, sonuç bölümlerinden oluştuğu düşünülmelidir. Bu düşünce bize paragraf tamamlama sorularında yardımcı olacaktır.",
            "Paragraf sorularının çözümünde genel kültürün de büyük önemi vardır.\n" +
                    "“Göreceli, kuram, imge, dağarcık, üslup, tenkit vb.” kavramların önceden bilinmesi gerekir. Bu açığı kapatmanın en iyi yolu, bol bol paragraf sorusu çözmek ve bu paragraflarda geçen, anlayamadığımız, kelime, deyim ve atasözlerini not alıp, anlamlarını öğrenmektir.",
            "Paragraftaki cümlelerin numaralandırılmasına dikkat edilmelidir. Numaralar, bazen ilk cümleden başlar, bazen ikinci cümleden; bazen cümlenin başına konur, bazen sonuna.\n" +
                    "\n" +
                    "*Cevaplarda numaralandırma bazen A) şıkkından başlar, bazen E) ‘den başlayabilir. Cevaplardaki numaralara dikkat edilmelidir.",
            "*Unutulmamalıdır ki, paragraf soruları ÖSYM’nin görüşüne göre hazırlanmaktadır. Bu tip soruları çözerken kendi görüşlerimiz, yorumlarımız bir kenara bırakılmalıdır. Cevap “parçaya göre” verilmelidir.\n" +
                    "\n" +
                    "*Paragraf soruları, Türkçe soruları içinde en kolay çözülebilecek sorulardandır.",
            "KONU: (İÇERİK) (PARAGRAF NE ANLATILIYOR?)\n" +
                    "*İçerik; bir sanat eserinde anlatılmak istenen fikir; verilmek istenen duygu ve düşüncelerin tümü…\n" +
                    "\n" +
                    "Örnek:\n" +
                    "Sanatçıların tenkit yazılarına bakış açılarını… (anlatıyor)",
            "ANA DÜŞÜNCE (ANA FİKİR): (PARAGRAF NİÇİN ANLATIYOR?)\n" +
                    "*Paragrafta asıl vurgulanan, öne sürülen, savunulan düşüncedir.\n" +
                    "*Temel yargıdır.\n" +
                    "*En geniş anlamlı yargıdır.\n" +
                    "*Yazarın bize iletmek istediği mesajdır.\n" +
                    "*Paragrafın yazılış amacıdır.\n" +
                    "*Paragrafta cümle olarak yer alabileceği gibi, paragrafın tamamından da çıkarılabilir.",
            "YARDIMCI DÜŞÜNCELER (YARDIMCI FİKİRLER, YAN DÜŞÜNCELER)\n" +
                    "*Ana düşünceyi destekleyen, tamamlayan; ana düşüncenin açıklanmasını sağlayan, konuyu geliştiren düşüncelerdir.\n" +
                    "*Özellikle olumsuz soru tipleri yardımcı düşüncelerle ilgilidir.\n" +
                    "\n" +
                    "Örnek:\n" +
                    "Paragrafa göre yazarın yazılarında aşağıdaki niteliklerden hangisi yoktur?" +
                    "Çözüm:\n" +
                    "*Bu tip sorularda dört şık yardımcı düşünceleri içerir. 5. şık ise ana ve yardımcı düşüncelerle alakalı olmayan, çelişen, uyuşmayan şıktır.",
            "ÜSLUP: (BİÇEM) (TARZ, STİL, TEKNİK) (PARAGRAF NASIL ANLATIYOR?)\n" +
                    "*Sanatçının, sözcükleri seçiş ve kullanış tarzıdır.\n" +
                    "*Sanatçının “anlatım tarzı”dır.\n" +
                    "*Söyleyiş şeklidir.\n" +
                    "*Edebiyatta üslup, bir sanatçıya, bir çağa veya bir ülkeye özgü teknik, renk, biçimlendirme ve söyleyiş özelliği anlamını taşır.  Bir sanatçıyla ilgili olarak da üslup, sanatçının görüş, duyuş, anlayış ve anlatıştaki özelliği veya bir türün, bir çağın kendine özgü anlatış biçimidir.\n" +
                    "*Üslupla, içerik karıştırılmamalıdır.\n" +
                    "*Her sanatçının özgün bir üslubunun olması beklenir.\n" +
                    "\n" +
                    "Örnek:\n" +
                    "Sanatçının, kısa cümleler kullanması, sıfatlara çokça yer vermesi, mecaz anlamlı kelimeleri tercih etmesi “üslup” ile ilgilidir.",
            "BİÇİM:\n" +
                    "*Eserin içerik dışında kalan özellikleridir. Dış görünüş, kullanılan dil, tasarım, şekil, biçimle ilgilidir.\n" +
                    "\n" +
                    "Örnek:\n" +
                    "Eser üç bölümden oluşuyor.",
            "PARAGRAF YAPISI:\n" +
                    "\n" +
                    "*Paragraf, bir kompozisyona benzetilebilir.\n" +
                    "*Yapı olarak giriş, gelişme ve sonuç bölümlerinden oluştuğu söylenebilir.\n" +
                    "*Paragrafta “konu bütünlüğü” esastır.",
            "Giriş Cümlesi:\n" +
                    "*Genellikle paragrafın ilk cümlesidir.\n" +
                    "*İşlenecek konu aktarılır.\n" +
                    "*Bir tanım veya soru şeklinde olabilir.\n" +
                    "*Giriş cümlesi, paragrafın ana fikrini de içerebilir.\n" +
                    "*Giriş cümlesi “ve, veya, ama, fakat” gibi bağlaçlarla ve “Böylece, bu yüzden” gibi ifadelerle başlayamaz. Çünkü ilk cümle, kendinden önce başka cümleler aratmamalıdır.\n" +
                    "*Giriş ile bağlantılı olarak sorularda, parçanın başına getirilebilecek en uygun cümle sorulabilir.",
            "Gelişme Cümleleri:\n" +
                    "*Giriş cümlesini açıklayan, destekleyen, reddeden, yorumlayan yardımcı düşünceler, gelişme cümlelerinde yer alır.\n" +
                    "*Bu bölümde değişik anlatım biçimlerine ve düşünceyi geliştirme yollarına başvurulur.",
            "Sonuç Cümlesi:\n" +
                    "*Paragrafta anlatılanların bir yargıya vardırıldığı bölümdür.\n" +
                    "*Bu bölüm genelde tek cümledir.\n" +
                    "*Sanatçı bu cümlede ana fikri ortaya koyabilir.\n" +
                    "* “Özetle, kısaca, öyleyse” gibi sözler içerebilir.\n" +
                    "*Sorularda “parçanın sonuna getirilebilecek en uygun cümle” olarak ya da “parça hangi cümleyle tamamlanabilir” şeklinde sorulabilir.",
            "Paragrafta Düşüncenin Akışını Bozan Cümle:\n" +
                    "\n" +
                    "Çözüm:\n" +
                    "*Paragraf okunur ve konu ile alakasız olan, farklı bir konuyu ele alan cümle bulunur.\n" +
                    "*Bu cümle, düşüncenin akışını bozan cümledir.",
            "Paragrafın İkiye Ayrılması:\n" +
                    "\n" +
                    "Çözüm:\n" +
                    "*Paragraf okunur, hangi cümleden itibaren konu değişmişse, o cümleden itibaren yeni paragraf başlayabilir.\n" +
                    "*İkinci paragrafın başladığı cümlenin “giriş cümlesi” niteliğinde olmasına dikkat edilmelidir.",
            "Paragraftan Cümle Çıkarma (Atma):\n" +
                    "\n" +
                    "Çözüm:\n" +
                    "*Paragraf okunur ve genel konu iyi kavranır.\n" +
                    "*Anlamca yakın cümleler tespit edilip bunlardan kapsamlı olan cümlede tutulup diğeri çıkarılabilir.",
            "Paragraf Tamamlama:\n" +
                    "\n" +
                    "Çözüm-a:\n" +
                    "*Parçanın başına bir cümle getirilmesi isteniyorsa, seçilecek cümle, giriş cümlesi özellikleri taşımalıdır.\n" +
                    "\n" +
                    "Çözüm-b:\n" +
                    "*Paragrafın ortasına bir cümle getirilmesi isteniyorsa, seçilecek cümle, paragrafın iki bölümünü anlamca ve yapıca birleştirebilmelidir.\n" +
                    "\n" +
                    "Çözüm-c:\n" +
                    "*Paragrafın sonuna bir cümle getirilmesi isteniyorsa, seçilecek cümle, sonuç cümlesi özellikleri taşımalıdır.\n",
            "ANLATIM TEKNİKLERİ:\n" +
                    "AÇIKLAMA:\n" +
                    "*Okuyucuyu herhangi bir konuda bilgilendirmek için kullanılan anlatım biçimidir.\n" +
                    "*Ders kitaplarında, ansiklopedilerde bu biçim kullanılır.\n" +
                    "*Bu biçimde nesnellik ağır basar.\n" +
                    "*Konu, çeşitli yönleriyle ele alınır.\n" +
                    "*Yazar, bu biçimde değişik düşünceyi geliştirme yollarını kullanabilir. (Tanımlama, örneklendirme vs.)",
            ")TARTIŞMA:\n" +
                    "*Bu anlatım biçiminde, bir fikre karşı çıkılır.\n" +
                    "*Karşı çıkılan fikir, sanatçının fikirleriyle çürütülmeye çalışılır.\n" +
                    "*Okuyucunun konu hakkındaki fikri değiştirilmeye çalışılır.\n" +
                    "*Tutarlı ve gerçekçi ifadeler kullanılır.\n" +
                    "*Yazar, fikirleri soru-cevap şeklinde tartışabilir.\n" +
                    "*Kişisel bir anlatım özelliği gösterir.",
            "ÖYKÜLEME: (HİKÂYE ETME)\n" +
                    "*Bir olayın eylemler yardımıyla anlatılması esastır.\n" +
                    "*Kişi, yer, mekân ve zaman öykülemenin ana unsurlarıdır.\n" +
                    "*Ele alınanlar, hareket halinde yansıtılır.\n" +
                    "*Genelde öykü, roman gibi edebi türlerde kullanılır.\n" +
                    "*Sanatsal maksat dışında yapılan öykülemelere “açıklayıcı öyküleme” denir.",
            "BETİMLEME: (TASVİR ETME)\n" +
                    "*Varlıkların iç ve dış niteliklerinin, sıfatlar yardımıyla yazıya aktarılmasına dayanır.\n" +
                    "*Gözlemlerin aktarılması söz konusudur.\n" +
                    "*Betimleme yapıldığında kafamızda bir resim belirmelidir.\n" +
                    "*Benzetmeler, mecazlı ifadeler, sıfatlar bolca kullanılır.\n" +
                    "*Betimleme ve öyküleme, yazılarda genelde iç içe kullanılır.\n" +
                    "*İnsanların içyapısını (kişilik özelliklerini) anlatan “ruhi”; dış yapısını (fiziksel özelliklerini) anlatan  “fiziki” betimlemeler vardır. Bunlara “Portre” de denir.\n" +
                    "*Yazar, betimlemede anlatıma kişisel duygularını katarsa, buna öznel betimleme; gördüklerini değiştirmeden aktarırsa, buna nesnel betimleme denir.",
            "DÜŞÜNCEYİ GELİŞTİRME YOLLARI:\n" +
                    "\n" +
                    "TANIMLAMA:\n" +
                    "*Bir konu veya kavram hakkında bilgi verilmesi, özel niteliklerinin belirtilmesidir.\n" +
                    "*Genelde tanım cümleleri kullanılır. (X kimdir?, X nedir? sorularına cevap veren cümlelerin tanım cümlesi olduğunu hatırlayınız.)\n" +
                    "*Açıklama ve tartışma gibi anlatım biçimlerinde kullanılır.",
            "ÖRNEKLENDİRME:\n" +
                    "*Bir konu veya kavramın örneklerle açıklanmasıdır.\n" +
                    "*Düşünceyi somutlaştırmak, anlatımı güçlendirmek için örneklendirmeye başvurulur.\n" +
                    "*Örneklendirmeye daha çok paragrafın gelişme bölümünde yer verilir.\n" +
                    "*Verilen örneklerin somut ve inandırıcı olmasına dikkat edilir.",
            "TANIK GÖSTERME:\n" +
                    "*Anlatılmak istenen fikri güçlendirmek, inandırıcı kılabilmek için; tanınmış, otorite durumunda olan bir kişinin sözünün yazıda kullanılmasıdır.\n" +
                    "*Sıradan bir insanın söylediği söz, tam bir tanık gösterme olmaz.\n" +
                    "*Alıntı yapılan söz tırnak işareti içinde kullanılır.",
            "KARŞILAŞTIRMA:\n" +
                    "*Konu, kavram, durum veya olaylar arasındaki benzerlik ya da farkların ortaya konulmasıdır.\n" +
                    "*Yazar, düşüncesini daha inandırıcı kılabilmek için karşılaştırmalara başvurabilir.\n" +
                    "* “oysa, ise, ne var ki” gibi bağlaçlar çokça kullanılır.",
            "SAYISAL DEĞERLERİ KULLANMA:\n" +
                    "*Düşünceyi inandırıcı kılabilmek için sayısal verilerden yararlanmaktır.\n" +
                    "*Anket sonuçları, istatistiksel bilgiler parçada kullanılabilir. Bunların bilimsel ve objektif olmasına dikkat edilir.",
            "BENZETME:\n" +
                    "*Bir düşünceyi aktarırken zayıfın, az bilenin; kuvvetliye, çok bilinene benzetilmesidir.\n" +
                    "*Önemli olan anlatımı güçlendirmektir.\n" +
                    "(Zeka bakımından tilkiye, güç bakımından aslana benzetmek gibi…)",
            "İLGİ KURMA:\n" +
                    "*İki olay, iki durum ya da iki kavram arasındaki ilişkileri ortaya koymaktadır.",
            "SOMUTLAMA:\n" +
                    "*Soyut kavramların somut bir varlıkmış gibi anlatılmasıdır.\n" +
                    "*Somutlama; istiare, kişileştirme, benzetme gibi sanatlar yardımıyla sağlanır.\n" +
                    "*Somutlamada amaç, soyut kavramın zihinde canlandırılmasıdır.",
            "AÇIKLIK:\n" +
                    "*Anlatımın belirsizlik taşımaması, net olmasıdır.\n" +
                    "*Metinde yoruma göre değişmeyen ifadelere yer verilir. Metinden herkes aynı anlamı çıkarır.\n" +
                    "*Noktalama işaretleri yerli yerinde kullanılır.\n" +
                    "*Tartışmaya yol açmayacak bir anlatım söz konusudur.",
            "AKICILIK:\n" +
                    "*Bir eserin, okuru sıkmadan, bir çırpıda, kolayca kendini okutturabilmesidir.\n" +
                    "*Anlatımın ses akışına uygun olmasıdır.\n" +
                    "*Metinde okunması kolay ifadelere yer verilir.\n" +
                    "*Akıcılığı engelleyen ses ve ahenk kusurlarından kaçınılır.",
            "DURULUK:\n" +
                    "*Cümlenin gerektiği kadar sözcükle kurulmasıdır.\n" +
                    "*Anlatımda gereksiz sözlere yer vermemektir.\n" +
                    "*Bir söz cümleden çıkarıldığında cümlenin anlamında daralma veya bozulma olmuyorsa o söz gereksizdir.\n",
            "EVRENSELLİK:\n" +
                    "*Bütün insanlığı ilgilendiren konu ya da kavramların dile getirilmesidir.                                 \n" +
                    "\n" +
                    "Onun anlatımı bütün insanlığı kucaklıyor.\n" +
                    "Dünya atmosferini soluyan herkese seslenen biridir o.                        \n" +
                    "Herkesi ilgilendiren sorunları işliyor eserlerinde.",
            "İÇTENLİK:\n" +
                    "*Duyguların, düşüncelerin, samimi ve sıcak bir dille anlatılmasıdır.\n",
            "KALICILIK:\n" +
                    "*Bir eserin, yazıldığı dönemden çok sonra da okurlar ve edebiyat dünyası tarafından ilgi görmesi, adından söz ettirmesidir.",
            "ÖZGÜNLÜK:\n" +
                    "*Sanatçının kendine has bir yol oluşturmasıdır.\n" +
                    "*Başkasına benzememe, taklit olmama, kendi damgasını vurma, farklı ve yeni şeyler ortaya koyma özgünlüğün ölçütleridir.",
            "ÖZLÜLÜK: (YOĞUNLUK)\n" +
                    "*Az sözle çok şey anlatmak. Atasözleri gibi.\n" +
                    "\n" +
                    "Sanatçı, sayfalarca sürecek o konuyu, sadece bir paragrafta dile getirmiş.",
            "SÜRÜKLEYİCİLİK:\n" +
                    "*Parçanın, okuyucuyu kendine bağlayıp okumayı sürdürmesini sağlayacak kadar ustaca yazılmasıdır.\n",
            "TUTARLILIK:\n" +
                    "*Yazılanların kendi içinde çelişkiye düşmemesidi",
            "ULUSALLIK:\n" +
                    "*Kendi insanını ilgilendiren konu ya da kavramlar.\n" +
                    "\n" +
                    "Yahya Kemal'in şiirlerinde bizim insanlarımız kokuyor.\n" +
                    "Bu sanatçı yoğrulduğu toprağın özelliklerini, insanını işliyor eserlerinde.",
            "YALINLIK: (SADELİK)\n" +
                    "*Dili anlaşılır kullanmak. (Açık konuşmak.)\n" +
                    "*Anlatımda gereksiz ayrıntılardan, süslü ve sanatlı söyleyişlerden kaçınmaktır.\n" +
                    "*Uzun cümleler, imgeler, sanatlı ve süslü anlatım yalınlığı bozar.\n" +
                    "*Anlatımda kolay anlaşılır bir dil tercih edilir."
    };
    public static String AnlatimBozukluklari[] = {
            "Anlamsal Bozukluklar\n" +
                    "Gereksiz Sözcük Kullanımı: Eş anlamlı kelimelerin veya anlamca birbirini kapsayan kelimeleri bir arada kullanılması olmak üzere iki yolla olur.\n" +
                    "az kalsın, neredeyse\n" +
                    "karşılıklı, mektuplaşmak\n" +
                    "hala, henüz\n" +
                    "yaya, yürüyerek\n" +
                    "yaşanmış, deneyim",
            "Anlamca Çelişen Sözcüklerin Kullanımı: Cümlede çeşitli anlamlar meydana geliyorsa o cümlede çelişkili anlatım söz konusudur.\n" +
                    "\n" +
                    "Elbette seni seviyor olabilir.",
            "Sözcüğün Yanlış Anlamda Kullanılması: Sözcüklerin karşılaşacakları anlamlar iyi bilinmelidir. Bu olmadığı zaman, anlatmak istediğimiz düşünce ile ortaya çıkan düşünce farklı olur.\n" +
                    "\n" +
                    "Konuyu en ayrımına kadar anlattı. (Ayrım, fark demektir. Burada “ayrıntı” sözcüğü kullanılmalıydı.)\n" +
                    "ücret, fiyat\n" +
                    "kuralık, kuruma\n" +
                    "azımsamak, küçümsemek",
            "özcüğün Yanlış Yerde Kullanılması: Sözcüklerin yerinde kullanılmaması, söylenmek istenilen düşüncenin tersini ortaya çıkarır.\n" +
                    "\n" +
                    "Yeni okula geldim ki ders zili çaldı. (“Yeni” sözcüğü yer değiştirmelidir.)",
            "Deyimin Yanlış Anlamda Kullanılması: Deyimler kendi ifade ettikleri anlam dışında kullanılmamalıdırlar.\n" +
                    "\n" +
                    "Patronun geldiğini görünce etekleri zil çaldı. (“etekleri tutuştu” olmalıydı.)",
            "Anlam Belirsizliği: Kişi veya durumlardan bahsedilirken o kişilerin yerini tutan zamirleri kullanmalıyız. Aksi takdirde anlam belirsizliği meydana gelir.\n" +
                    "\n" +
                    "Kalemini kaybetmiş. (senin kalemini, onun kalemini. o mu, sen mi belli değildir.)",
            "Mantık ve Sıralama Yanlışlığı: Verilen kavramların önem sırasının karıştırılması sonucunda oluşur.\n" +
                    "\n" +
                    "Bırak soğan doğramayı yemek bile yapamaz o. (Bırak yemek yapmayı soğan bile doğrayamaz o, şeklinde olmalıdır.)",
            "Yapısal Bozukluklar\n" +
                    "Özne – Yüklem Uyumsuzluğu: Özne birinci tekil, ikinci tekil veya veya üçüncü tekil (ben, sen, o) ise yüklem birinci çoğul (biz) kişiye göre çekimlenir.\n" +
                    "Ben ve Asu buraya daha önce gelmemişti. (“gelmemiştik” şeklinde düzeltilmelidir.)",
            "Özne insan ve çoğul ise yüklem çoğul olabilir. Ancak insan dışındaki varlıkların çoğul şekilleri özne olduğunda yüklem tekil olur.\n" +
                    "\n" +
                    "Martılar uçuyorlar. (yanlış). Martılar uçuyor. (doğru)",
            "Eklerle İlgili Yanlışlar: Cümlede eklerin eksik veya fazla kullanılması anlatım bozukluğuna yol açar.\n" +
                    "\n" +
                    "O, sevmesini bilmez. (sevmeyi)",
            "Öge eksikliği: Nesne ve dolaylı tümleç üzerinde duracağım. Öge eksikliği genellikle sıralı ve bağlı cümlelerde ortaya çıkar.\n" +
                    "\n" +
                    "Ben sana inanırım ve severim. (seni severim: nesne eksikliği)",
            "Yüklem Eksikliği: Sıralı ve bağlı cümlelerde iki cümlenin bir yükleme bağlanması sonucu oluşur.\n" +
                    "\n" +
                    "Bugün ayran ve yemek yedik. (“Ayran içtik”)",
            " Tamlama Yanlışları: Ad ve sıfat tamlamalarıın aynı tamlanana bağlanması sonucu oluşur.\n" +
                    "\n" +
                    "Özel ve kamu kuruluşları (Özel kuruluşlar ve kamu kuruluşları)",
    };
    public static String SesBilgisi[] = {
            "Ses:\n" +
                    "*1-İşitme organımız tarafından algılanan titreşimlere “ses” denir.\n" +
                    "*2-Akciğerlerden gelen havanın ses yolunda oluşturduğu titreşime “ses” denir.\n" +
                    "*3-Ses, dilin işlevli en küçük birimidir.",
            "Harf:\n" +
                    "*1-Seslerin yazıdaki karşılığına “harf” denir.\n" +
                    "*2-Harfler, sesleri karşılayan işaretlerdir.",
            "Alfabe:\n" +
                    "*1-Dilde kullanılan tüm harflerin sıralanmış şekline “alfabe” denir.\n" +
                    "*2-Harflerin sistemli olarak yer aldığı tabloya “alfabe” denir.\n" +
                    "*3-Bir dildeki harflerin belirli bir sıraya dizilmiş bütününe “alfabe” denir.",
            "Türk Alfabesi:\n" +
                    "*29 harften oluşur.\n" +
                    "*Türkçede sesler, ünlüler ve ünsüzler olmak üzere iki ana gruba ayrılır.\n" +
                    "*8 sesli (ünlü) harf: a, e, ı, i, o, ö, u, ü\n" +
                    "*21 sessiz (ünsüz) harf: b, c, ç, d, f, g, ğ, h, j, k, l, m, n, p, r, s, ş, t, v, y, z",
            "Türkçede ilk heceden sonraki hecelerde “o, ö” harfleri bulunmaz.\n" +
                    "Otobüs, Operatör, Radyo",
            "Türkçede kelime kökünde iki ünlü yan yana bulunmaz.\n" +
                    "Saat, Taassup, Şair, Şiir, Fuar",
            "Türkçe kelime kökünde aynı iki ünsüz yan yana bulunmaz.\n" +
                    "Millet, Sıhhat",
            "a-Kökeni Türkçe olan kelimelerin sonunda b, c, d, g ünsüzleri bulunmaz.\n" +
                    "Ancak anlam farkını belirtmek üzere ad, od, sac gibi birkaç kelimenin yazılışında bu kurala uyulmaz: ad (isim) / at (binek hayvanı)\n" +
                    "od (ateş) / ot (bitki)\n" +
                    "sac (yassı demir) / saç (kıl)",
            "b-Hac, şad, yâd gibi birkaç örnek dışında, alıntı kelimelerin özgün biçimlerinin sonlarında bulunan yumuşak ünsüzler sertleştirilerek kullanılır:\n" +
                    "\n" +
                    "kitap (<kitab)\n" +
                    "sebep (<sebeb)\n" +
                    "bant (<band)",
            "Ses yolunda bir engele çarpmadan çıkan sese “ünlü” denir.\n" +
                    "*Dilimizde sekiz ünlü vardır: a, e, ı, i, o, ö, u, ü",
            "Dilin durumuna göre:\n" +
                    "\n" +
                    "1. Kalın ünlüler: a, ı, o, u\n" +
                    "2. İnce ünlüler: e, i, ö, ü\n" +
                    "-----------------------------------------\n" +
                    "B. Dudakların durumuna göre:\n" +
                    "\n" +
                    "1. Düz ünlüler: a, e, ı, i\n" +
                    "2. Yuvarlak ünlüler: o, ö, u, ü\n" +
                    "-----------------------------------------\n" +
                    "C. Ağzın açıklığına göre:\n" +
                    "\n" +
                    "1. Geniş ünlüler: a, e, o, ö\n" +
                    "2. Dar ünlüler: ı, i, u, ü",
            "NLÜ DARALMASI: (SESLİ DARALMASI)\n" +
                    "\n" +
                    "*Türkçede a, e ünlüleri ile biten fiillerin şimdiki zaman (-yor) çekiminde, söyleyişte de yazımda da\n" +
                    "\n" +
                    "\" a \" ünlüsü  \" ı, u \"  ünlüsüne dönüşür;\n" +
                    "\n" +
                    "\" e \" ünlüsü  \" i, ü \"  ünlüsüne dönüşür:\n" +
                    "\n" +
                    "Başla-yor / başlıyor\n" +
                    "Oyna-yor / oynuyor",
            "Ünlü Değişimi: (Sesli Değişimi)\n" +
                    "Ben ve sen kelimeleri yönelme durum eki aldıklarında ses değişikliğine uğrarlar:\n" +
                    "\n" +
                    "Ben-e > bana\n" +
                    "Sen-e > sana",
            "ÜNLÜ DÜŞMESİ:\n" +
                    "*Bazı kelimelerde, ek aldıklarında ya da bileşik kelime oluşturduklarında ünlü düşmesi görülür:\n" +
                    "Ağız / ağzı\n" +
                    "Akıl / aklı\n" +
                    "Alın / alnı\n" +
                    "Bağır / bağrım\n" +
                    "Beniz / benzi",
            "ÜNLÜ TÜREMESİ:\n" +
                    "\n" +
                    "*Bazen bir sözcükle, bir ek yan yana gelirken sözcük ve eke ait olmayan bir ünlü ortaya çıkabilir. Bu olaya ünlü türemesi denir.\n" +
                    "\n" +
                    "Az-cık / azıcık              \n" +
                    "Genç-cik / gencecik                  ",
            "ÜNSÜZLERİN NİTELİKLERİ:\n" +
                    "\n" +
                    "*Ses yolunda bir engele çarparak çıkan seslere ünsüz denir.\n" +
                    "*Dilimizde yirmi bir ünsüz vardır:\n" +
                    "b, c, ç, d, f, g, ğ, h, j, k, l, m, n, p, r, s, ş, t, v, y, z",
            "1. Ses tellerinin titreşmesiyle oluşan ünsüzlere\n" +
                    "yumuşak (ötümlü, tonlu) ün\u00ADsüzler adı verilir:\n" +
                    "b, c, d, g, ğ, j, l, m, n, r, v, y, z\n" +
                    "\n" +
                    "2. Ses telleri titreşmeden oluşan ünsüzlere\n" +
                    "sert (ötümsüz, tonsuz) ünsüzler denir:\n" +
                    "ç, f, h, k, p, s, ş, t",
            "NSÜZ (SESSİZ) UYUMU:\n" +
                    "\n" +
                    "*Dilimizde sert ünsüzle biten kelimeler sert ünsüzle başlayan ekler alır:\n" +
                    "aç-tı, aş-çı, bak-tım, bas-kı, çiçek-ten, düş-kün, geç-tim, ipek-çi, seç-kin, seç-ti, süt-çü\n" +
                    "\n" +
                    "*Yumuşak ünsüzle biten kelimeler ise yumuşak ünsüzle başlayan ekler alır:\n" +
                    "al-dı, an-dı, bil-gi, del-gi, göz-cü, ver-di, yol-da",
            "ÜNSÜZ BENZEŞMESİ:\n" +
                    "(Sessiz Benzeşmesi) (Sert Ünsüz Benzeşmesi) (Ünsüz Sertleşmesi)\n" +
                    "\n" +
                    "*Türkçe kurallara göre; sert ünsüz bir harften (fıstıkçı şahap) sonra ünsüzle başlayan bir ek gelecekse, ekin başındaki ünsüz “sert ünsüze” dönüşür.\n" +
                    "\n" +
                    "Seç-gin à seçkin\n" +
                    "Sus-gun  à suskun",
            "SERT ÜNSÜZ YUMUŞAMASI:\n" +
                    "\n" +
                    "* “p,ç,t,k” harfleri ile biten bir kelimeden sonra ünlü ile başlayan bir ek getirilirse; “p,ç,t,k”  harfleri “b,c,d,g,ğ” ye dönüşür.\n" +
                    "\n" +
                    "Yurt-u / yurdu              \n" +
                    "Kanat-ı / kanadı     ",
            "ÜNSÜZ DÜŞMESİ:\n" +
                    "\n" +
                    "* “ -k ” ile biten bazı sözcükler ek aldıklarında “ -k ” sesi düşer:\n" +
                    "\n" +
                    "Küçük-cük / küçücük            \n" +
                    "Yumuşak-cık / yumuşacık\n" +
                    "Yüksek-l-mek / yükselmek            \n" +
                    "Alçak-l-mak / alçalmak",
            "ÜNSÜZ TÜREMESİ:\n" +
                    "\n" +
                    "*Arapçadan dilimize giren ve özgün biçimlerinde sonunda ikiz ünsüz bulunan kelimeler Türkçede tek ünsüzle kullanılır. Bu kelimeler ünlüyle başlayan ek veya yardımcı fiille kullanıldıklarında sondaki ünsüz ikizleşir:\n" +
                    "\n" +
                    "Hak-ı / hakkı",
            "KAYNAŞTIRMA HARFLERİ:\n" +
                    "\n" +
                    "*Türkçede iki ünlü yan yana gelmediği için, ünlü ile biten bir sözcüğe, ünlü ile başlayan bir ek getirileceği zaman araya kaynaştırma harfleri (y,ş,s,n) getirilir.\n" +
                    "\n" +
                    "Soba-y-a               \n" +
                    "Su-y-u   ",
            "ULAMA:\n" +
                    "\n" +
                    "*Ünsüzle biten bir sözcükten sonra, ünlüyle başlayan bir sözcük gelmesiyle oluşur.\n" +
                    "\n" +
                    "Evden_acilen_ayrıldım.\n",
            "ÜNLÜ UYUMLARI:\n" +
                    "\n" +
                    "\n" +
                    "BÜYÜK ÜNLÜ UYUMU: (Kalınlık-İncelik)\n" +
                    "\n" +
                    "*1-Bir sözcükte, ilk hecedeki ünlü harf kalın ise,\n" +
                    "diğer hecelerdeki ünlüler de kalın olmalıdır.\n" +
                    "\n" +
                    "*2-Bir sözcükte, ilk hecedeki ünlü harf ince ise,\n" +
                    "diğer hecelerdeki ünlüler de ince olmalıdır.\n" +
                    "\n" +
                    "a, ı, o, u  >  a, ı, o, u   ya da    e, i, ö, ü  >  e, i, ö, ü\n" +
                    "\n" +
                    "adım, ayak, boyunduruk, burun, dalga, dudak, kırlangıç\n" +
                    "Türkiye, beşik, bilezik, gelincik, gözlük, üzengi, vergi, yüzük",
            "KÜÇÜK ÜNLÜ UYUMU: (Düzlük – Yuvarlaklık)\n" +
                    "\n" +
                    "Kural-1: Bir sözcükte, önceki hecede düz ünlü harf varsa, sonraki hecede de düz ünlü bulunmalıdır.\n" +
                    "\n" +
                    "a, e, ı, i à a, e, ı, i\n" +
                    "\n" +
                    "Kural-2: Önceki hecede yuvarlak ünlü harf varsa, sonraki hecede;\n" +
                    "\n" +
                    "ya dar-yuvarlak,\n" +
                    "\n" +
                    "ya da düz-geniş ünlü bulunmalıdır.\n" +
                    "\n" +
                    "o, ö, u, ü à ya  “a,e” ya da “u,ü”",
            "VURGU:\n" +
                    "\n" +
                    "*1-Sözcük içinde bir hecenin, cümle içinde bir sözcük ya da sözcük grubunun diğerlerine göre daha baskılı, kuvvetli söylenmesine “vurgu” denir.\n" +
                    "*2-Sözcüklerde ve sözcük öbeklerinde bazı hecelerin, cümlenin bütününde de bazı sözcüklerin diğerlerine göre daha yüksek tonda seslendirilmesine “vurgu” denir.",
            "SÖZCÜK VURGUSU:\n" +
                    "*Sözcüğü oluşturan hecelerden birinin diğerlerine göre daha baskılı söylenmesine sözcük vurgusu denir.\n" +
                    "\n" +
                    "\n" +
                    "Not: Türkçe sözcüklerde vurgu genelde son hecededir.\n" +
                    "\n" +
                    "kelebek, çocuk, büyük, yakın",
    };
    public static String YapiBilgis[] = {
            "Sözcük Kökü Nedir?\n" +
                    "Sözcükler, bir dildeki anlamlı en temel yapı birimidir. Sözcük kökü ise bir kelimenin anlamlı en küçük yapı birimidir. Tıpkı ağaç kökü nasıl ağacı toprağa bağlıyor ve ayakta tutuyorsa sözcüğün anlamını veren ve sözcüğü ayakta tutan da sözcüğün köküdür.\n" +
                    "\n" +
                    "İsim kök: Varlıkların ismi olan köklere isim kök denir; deniz, kuş, su vb.\n" +
                    "Fiil kök: Varlıkların iş, oluş ve hareketi anlatan köklere fiil kök denir; yap-, git-, düşün- vb. Dikkat ettiysen fiil kökler “-“ ile biter, çünkü fiil kökler sonuna mastar eki alır!",
            "Basit Sözcükler\n" +
                    "Yapım eki almamış, yapı olarak en basit halinde kalan sözcükler basit sözcüklerdir. Yani kök halindedirler. Sadece çekim eki alabilirler. \n" +
                    "\n" +
                    "Çekim eki derken mesela ismin hali ekleri olan -e, -i, -de ve -den eklerinin isim köke eklenmesini örnek verebiliriz. Bir cümle içinde kök halindeki ev kelimesinin “evi”, “eve”, “evde” veya “evden” hallerini görürsek buna basit sözcük deriz! Diğer örnekler ise çoğul eki olan -ler / -lar veya iyelik ekleridir.\n" +
                    "Fiillerin sonuna eklenerek fiileri yüklem yapan kip ekleri de çekim ekleridir. Mesela git- fiil kökünü bir cümle içerisinde “gitti”, “gidiyor”, “gidecek” veya “gider” hallerini görürsek buna da basit sözcük diyeceğiz! Ayrıca fiil köklerin sonuna gelip olumsuz anlam yaratan -ma / -me eki de çekim ekidir (“gitmeyecek” sözcüğü de basittir).",
            "Türemiş Sözcükler\n" +
                    "Kök halindeki sözcüklere yapım eki eklenerek oluşturulan yeni sözcüklere türemiş sözcükler denir.  \n" +
                    "\n" +
                    "Yapım eki alarak başka sözcüklere dönüşen köklere gövde de denir, gövdelerin de yeniden yapım eki alıp yeni sözcükler oluşturması mümkündür!  Yani türemiş sözcükte en az bir tane yapım eki vardır! Aşağıda türemiş sözcüklere örnek verdik ve ekleri başlarında “-“ ile gösterdik çünkü ekler sözcüklere eklenerek kullanılırlar, kendi başlarına anlamsızlardır!",
            "Gözlük: göz + -lük   \uD83E\uDC6A  yaşlı: yaş + -lı  \uD83E\uDC6A tuzlu: tuz + -lu.  \uD83E\uDC6A kalemlik: kalem+ -lik\n" +
                    "Şimdi de gövdeden türemiş bir sözcük olan düşünceli sözcüğünün yapısını inceleyelim.\n" +
                    "\n" +
                    "Düşünceli: düş + -ün + -ce + -li\n" +
                    "Düşün- fiil kökü “düş” isim kökünden türetilmiş bir fiil köküdür. Düşün- köküne gelen -ce eki ile düşünce isim kökü oluşturulmuş ve sonrasında gelen ekle son halini almıştır.\n" +
                    "\n" +
                    "Burada fark etmen gereken 2 önemli şey şuydu: \n" +
                    "\n" +
                    "Gövdelerden de ekler eklenerek yeni sözcükler türetilebilir!!!\n" +
                    "İsim kökler ek ile fiil ve fiil kökler ekler ile isim olabilmektedir!!!",
            "Birleşik Sözcükler\n" +
                    "Sözcükte yapı konusunun son alt başlığındayız. Adı üstünde birden fazla sözcüğün birleşerek yeni sözcükler oluşturmasıyla birleşik sözcükler oluşur. Çekyat, kalemtıraş, sivrisinek, hissetmek vb kelimeler birleşik sözcüklere örnek olarak verilebilir. Birleşik sözcükleri daha sistemli inceleyebilmek adına 2 başlığa ayırıyoruz:",
            "Birleşik İsim: En az iki sözcükten oluşan isimlerdir. Örnekleri aşağıdan okuyabilirsin:\n" +
                    "\n" +
                    "Sivrisinek : sivri+sinek  (Sıfat tamlaması ile oluşmuş)\n" +
                    "Kuşburnu : kuş+burnu  (İsim tamlaması ile oluşmuş)\n" +
                    "Biçerdöver : Biçer + döver (İki fiil kaynaşmasıyla oluşmuş)\n" +
                    "Bilgisayar : Bilgi + sayar (Bir isim ve bir fiilin kaynaşmasıyla oluşmuş)",
            "Birleşik Fiil: En az iki sözcükten oluşmuş fillerdir. 3 farklı türü vardır:\n" +
                    "\n" +
                    "1. Yardımcı eylem ile oluşanlar: “etmek, olmak, kılmak” vb. yardımcı fiillerin isimlerle birleşmesi ile birleşik fiiller oluşur. Sorularda şıkları okurken hemen göze çarparlar!\n" +
                    "Hissetmek: his + etmek\n" +
                    "Fark etmek : fark + etmek\n" +
                    "Kaybetmek: kayıp + etmek\n" +
                    "Yardım etmek : yardım + etmek",
            "2. Kurallı Birleşik Fiiller: Belli kurallara göre birleşmiş birleşik fiillere kurallı birleşik fiil denir. Bu türün de 4 farklı alt kategori vardır ama hepsi de bulması çok kolay ve isimleri de ipucu durumda. Hemen anlatalım:\n" +
                    "a. Yeterlilik fiili: -ebilmek ile oluşturulur, yeterlilik anlamı verir.  Yani okuduğunda hemen anlayabilirsin. “Soruyu yapabildin mi?” ve “Yarın beni arayabilir misin?” sorularındaki yüklemler birleşik fiillerdir.\n" +
                    "b. Tezlik fiili: –evermek ile oluşturulur, adı üstünde tezlik anlamı katar. Okuduğunda tıpkı yeterlilik fiili gibi hemen anlayabilirsin. “Bir koşu ekmek almaya gidiverdi.” ve “Yarım saattir çözemediğim soruyu iki dakikada çözüverdi” cümlelerinin yüklemleri de birleşik fiillerdir.\n" +
                    "c. Sürerlilik fiili: -ekalmak, -egelmek, -edurmak ile oluşturulur, süregelmişlik anlatır. \n" +
                    "“Sen bu kitabı okuyadur, ben hemen geleceğim.”\n" +
                    "d. Yaklaşma fiili: Bir olayın az kalsın olacağın ama meydana gelmediğini anlatmak için kullanılırmakla birlikte -eyazmak ile yapılır.\n" +
                    "“Matematik öğretmenimiz buzlu yolda düşeyazdı.”",
            "3. Deyimleşmiş Birleşik Fiiler: Birleşen 2 sözcüğün gerçek anlamlarını kaybedip mecaz anlam kazanmasıyla oluşmuşlardır.\n" +
                    "“Son davranışları ile göze batıyor.”\n" +
                    "“Sınava girmeden önce çıkarttığı özet notları gözden geçirdi.",
    };
    public static String SozcukTurleri[] = {
            "*Sözcüğün türü, o sözcüğün görevi ile ilgilidir.\n" +
                    "*Sözcük türleri iki ana gruba ayrılır:\n" +
                    "\n" +
                    "1- Ad ve Ad Soylular\n" +
                    "Ad (İsim)\n" +
                    "Adıl (Zamir)\n" +
                    "Önad (Sıfat)\n" +
                    "Belirteç (Zarf)\n" +
                    "İlgeç (Edat)\n" +
                    "Bağlaç\n" +
                    "Ünlem",
            "2- Fiil (Eylem)\n" +
                    "\n" +
                    "*Sözcükler cümlede kullanılışlarına göre görev (tür) değiştirebilirler.\n" +
                    "Bu elbise iyi olmuş.  (Zarf)\n" +
                    "İyi bir elbise almışsın. (Sıfat)\n" +
                    "\n" +
                    "Burada önemli bir ayrıntıyı bilmemiz gerekiyor:",
            "İsim-Fiil Farkı:\n" +
                    "a) Bir kök “-mek, -mak” eki alabiliyorsa bu kök, fiildir.\n" +
                    "b) Bir kökün olumsuzu yapılabiliyorsa bu kök, fiildir.\n" +
                    "\n" +
                    "Gelmişsin: fiil (gelmek olur)\n" +
                    "Maviymiş: İsim  (mavimek olmaz)\n" +
                    "Uçtu: fiil  (Uçmak olur)\n" +
                    "Güzeldi: isim (güzelmek olmaz)\n" +
                    "\n" +
                    "İkiz kök: Hem fiil hem isim olarak kullanılabilen köklerdir.\n" +
                    "\n" +
                    "Boya, gül, al, var\n" +
                    "\n" +
                    "Elindeki boyayla duvarı boya.\n" +
                    "          İsim                 fiil\n" +
                    "\n" +
                    "Elimde tebeşir var. (İsim)    \n" +
                    "Yarın oraya var. (Fiil)",
            "İSİM (AD):\n" +
                    "\n" +
                    "*Varlıkları, kavramları, durumları…  karşılayan sembollere, kelimelere “isim/ad” denir.",
            "A)VARLIKLARA VERİLİŞLERİNE GÖRE ADLAR:\n" +
                    "\n" +
                    "1)Cins İsim (Tür adı):\n" +
                    "*Aynı türden varlıklara verilen isimlerdir.\n" +
                    "\n" +
                    "Balık, hamsi, masa, kuş, beşik, taş",
            "2)Özel İsim:\n" +
                    "*Tek bir varlığı karşılayan isimlerdir.\n" +
                    "\n" +
                    "İstanbul, Fenerbahçe, Tercüman, Türkçe, Aksiyon\n" +
                    "\n" +
                    "Not: Özel isimlerin ilk harfi büyük olur.",
            "B)VARLIKLARIN OLUŞLARINA/NİTELİKLERİNE GÖRE ADLAR:\n" +
                    "\n" +
                    "1) Somut İsim:\n" +
                    "*Duyu organlarımızın herhangi biriyle algılayabildiğimiz kavramların isimleridir.\n" +
                    "\n" +
                    "Taş, yıldırım, su, bulut, hava, elektrik…\n" +
                    "\n" +
                    "2) Soyut İsim:\n" +
                    "*Duyu organlarımızla algılayamadığımız kavramların isimleridir.\n" +
                    "\n" +
                    "Sevgi, kin, nefret, akıl, erdem, melek, cin…\n" +
                    "\n" +
                    "Not: Eylemlere ek (-mek, -me, -iş) getirilerek “eylem adları” oluşturulabilir.\n" +
                    "\n" +
                    "Çalışma, yürüyüş, yüzmek",
            "C)VERİLDİĞİ VARLIĞIN SAYISINA GÖRE İSİMLER:\n" +
                    "\n" +
                    "1)Tekil İsim:\n" +
                    "*Sayı bakımından tek varlığı karşılayan isimlerdir.\n" +
                    "\n" +
                    "Ev, insan, çiçek",
            "2)Çoğul İsim:\n" +
                    "*Sayı bakımından birden fazla varlığı karşılayan isimlerdir.\n" +
                    "*Çoğul eki alırlar. (-ler, -lar)\n" +
                    "\n" +
                    "evler, insanlar, çiçekler",
            "3)Topluluk İsmi:\n" +
                    "*Görünüşte tekil olduğu halde, birden fazla varlığı ifade eden isimlerdir.\n" +
                    "*Çoğul eki almadan çokluk bildirirler.\n" +
                    "\n" +
                    "Halk, ordu, orman, sürü, meclis, deste\n" +
                    "\n" +
                    "Not: Topluluk ismi gibi görünen bazı isimler tekil isim olabilir.",
            "ZAMİR (ADIL):\n" +
                    "\n" +
                    "*İsim olmadıkları halde, ismin yerine kullanılan kelimelerdir.\n" +
                    "\n" +
                    "Ahmet, bakkaldan ekmek aldı.\n" +
                    "O, oradan onu aldı.\n" +
                    "\n" +
                    "Not: Adların aldıkları çekim eklerini alabilirler.\n" +
                    "\n" +
                    "Not: Tamlama kurabilirler.\n" +
                    "\n" +
                    "Benim kalemim, öğrencilerin çoğu\n" +
                    "\n" +
                    "Not: Zamirler, daha önce sözü edilen şeylerin yerini de tutabilirler.\n" +
                    "\n" +
                    "Ali, eve yeni geldi.        Buraya yeni geldi.",
            "A) SÖZCÜK BİÇİMİNDEKİ ZAMİRLER:\n" +
                    "\n" +
                    "1)Kişi (Şahıs) Zamiri:\n" +
                    "*Kişi adlarının yerini tutan zamirlerdir.\n" +
                    "Ben, Sen, O, Biz, Siz, Onlar",
            "Dönüşlülük Zamiri:\n" +
                    "*“Kendi” kelimesi, dönüşlülük zamiri olarak kabul edilmektedir.\n" +
                    "*Kişi zamiriyle benzeşir. Farkı, iyelik eki alabilmesidir.\n" +
                    "\n" +
                    "Arabayı kendi sürüyordu.\n" +
                    "Bu tabloyu kendin mi yaptın?",
            "2)İşaret Zamiri:\n" +
                    "*İsimlerin yerini işaret yoluyla tutan zamirlerdir.\n" +
                    "Bu, Şu, O, Bunlar, Şunlar, Onlar, Öteki, Beriki, Bura, şura, Ora\n" +
                    "\n" +
                    "Bu, bizim en büyük idealimiz.\n" +
                    "Şunu hala almadılar.\n" +
                    "Onlarda düzensizlikler var.",
            "3)Belgisiz Zamir:\n" +
                    "*Yerini tuttuğu ismin özelliklerini tam olarak karşılayamayan (belirsiz bir şekilde karşılayan) zamirlerdir.\n" +
                    "*Belirsizlik ve genelleme vardır.\n" +
                    "Herkes, Kimi, Kimse, Kimisi, Biri, Birçoğu, Tümü, Çoğu, Azı, Hepsi, Bazısı, Birazı, Başkası, Şey\n" +
                    "\n" +
                    "Herkes, onun yaptıklarına güldü.\n" +
                    "Kimisi tatlıyı sevmez.",
            "4)Soru Zamiri:\n" +
                    "*Soru yoluyla isimlerin yerini tutan sözcüklerdir.\n" +
                    "*Soru zamirleri cevap olarak isim ya da isim soylu sözcükleri buldurur.\n" +
                    "Kimi, Kim, Neye, Nerede, Nereden, Hangisi, Kaçı, Ne, Kaça…\n" +
                    "\n" +
                    "Pazardan ne aldın?\n" +
                    "Dün akşam nereye gittiniz?",
            "B) EK BİÇİMİNDEKİ ZAMİRLER:\n" +
                    "\n" +
                    "1) İyelik Ekleri (İyelik Zamirleri):\n" +
                    "*Bir varlığın ya da kavramın kime, neye, kaçıncı kişiye ait olduğunu bildiren eklere iyelik zamiri denir.\n" +
                    "*Bu ekler “benim, senin, onun, bizim, sizin, onların” kelimelerinin anlamını karşılar.\n" +
                    "\n" +
                    "Kalem-im,-in,-i,-imiz,-iniz,-leri",
            "2) İlgi Zamiri: (-ki)\n" +
                    "*Adların yerini tutan –ki ekidir.\n" +
                    "*Bu ek, isim tamlamasında, tamlanan ismin yerini tutarak, tamlayana eklenen ek durumundadır.\n" +
                    "Benim gömleğim kirli, seninkini giyebilir miyim? (-ki=gömlek)\n" +
                    "Bizim tarlamız, sizinkinden daha geniş. (-ki=tarla)",
            "SIFAT (ÖN AD):\n" +
                    "\n" +
                    "*Varlıkları niteleyen ya da belirten sözcüklere sıfat denir.\n" +
                    "*Bir isimle kullanılıp isme sorulan soruya cevap verirler.\n" +
                    "\n" +
                    "*Bir sözcüğün sıfat olabilmesi için;\n" +
                    "\n" +
                    "a)Mutlaka bir isimden önce gelmesi ve tamlama kurması gerekir.\n" +
                    "\n" +
                    "Mutlu yarınlar bizim olacak.\n" +
                    "Sıfat    İsim",
            "b)Çekim eki almaması gerekir.\n" +
                    "\n" +
                    "Soğuklar bir süre daha devam edecekmiş. (Sıfat değildir. Çekim eki almış.)\n" +
                    "Yeşiller giymiş üzerine. (Sıfat değildir. Çekim eki almış.)\n" +
                    "\n" +
                    "(Bunlara daha sonra “adlaşmış sıfat” diyeceğiz.)",
            "NİTELEME SIFATLARI:\n" +
                    "*Varlıkların renklerini, biçimlerini, durumlarını bildiren sıfatlardır.\n" +
                    "*İsme sorulan “nasıl?” sorusuna cevap verirler.\n" +
                    "\n" +
                    "Mor gözlerle etrafına bakıyordu.\n" +
                    "Uzun paragraflar zor anlaşılıyor.",
            "BELİRTME SIFATLARI:\n" +
                    "*Varlıkları çeşitli yollarla belirten sıfatlardır.\n" +
                    "\n" +
                    "1)İşaret (Gösterme) Sıfatı:\n" +
                    "*İsmin bildirdiği varlığı, işaret yoluyla belirten sıfatlardır.\n" +
                    "Bu, Şu, O, Öteki, Beriki, Öbür, Öyle, Şöyle, Böyle, Diğer…\n" +
                    "\n" +
                    "Not: “Bunlar, Şunlar, Onlar” sözcükleri sıfat olarak kullanılmaz. Çünkü çekim eki almışlardır.\n" +
                    "\n" +
                    "Bu bahaneleri çok duyduk.\n" +
                    "Şu adamı bir yerden hatırlıyorum.",
            "Sayı Sıfatı:\n" +
                    "*Varlıkları nicelik (sayısal özellikleri) yönüyle belirten sıfatlardır.\n" +
                    "*Asıl sayı sıfatı, Sıra sayı sıfatı, Kesir sayı sıfatı, Üleştirme sayı sıfatı olmak üzere dörde ayrılır.\n" +
                    "\n" +
                    "Bir elma (Asıl sayı sıfatı, varlığın kaç tane olduğunu bildirir. Doğal sayılarla ifade edilir.)",
            "Belgisiz Sıfat:\n" +
                    "*Belirttikleri ismin özelliklerini tam olarak veremeyen sıfatlardır. Belirsizlik söz konusudur.\n" +
                    "Her, bir, hiçbir, birkaç, bütün, kimi, birtakım, nice, başka, birçok, tüm, az, çok, bazı…\n" +
                    "\n" +
                    "Az zamanda, çok işler başardık.\n" +
                    "Her insan ölümlüdür.",
            "Soru Sıfatı:\n" +
                    "*Varlıkları soru yoluyla belirten sıfatlardır.\n" +
                    "Nasıl, kaç, hangi, ne kadar, kaçıncı, kaçar, ne\n" +
                    "\n" +
                    "Nasıl bir araba bakmıştınız?\n" +
                    "Kaç öğrenci ödevini yapmadı?",
            "UNVAN SIFATLARI:\n" +
                    "*İnsanların rütbesini, lakabını ya da sosyal durumunu bildiren sözcükler, isimle beraber kullanılırsa, unvan sıfatı olur.\n" +
                    "*İstisna olarak unvan sıfatları isimden önce de, sonra da gelebilir.\n" +
                    "\n" +
                    "Gazi Mustafa Kemal, Ümit Bey, Sevda Hanım, Yüzbaşı Recep, Atilla Dayı, Kel Mahmut",
            "SIFATLARDA PEKİŞTİRME:\n" +
                    "\n" +
                    "*Sıfatlarda pekiştirme, anlatımı çekici hale getirmek, anlamı kuvvetlendirmek için çeşitli yollarla yapılır:",
            "a) Pekiştirilecek sözcüğün ilk ünlüye kadar olan kısmı (ünlü dâhil) alınır. “p,r,s,m” harflerinden uygun olan biri getirilir. Daha sonra sözcüğün tamamı yazılır.\n" +
                    "Sarı >> Sa-p-sarı\n" +
                    "b) İlk maddeye ek olarak, “p,r,s,m” harflerinden sonra “e,a” harflerinin getirilmesi ile oluşur.\n" +
                    "Sağlam >> Sa-p-a-sağlam\n" +
                    "c) İkilemelerle pekiştirme yapılabilir.\n" +
                    "Kara kara bulutlar\n" +
                    "d) “mi” soru edatı ile pekiştirme yapılabilir.\n" +
                    "Güzel mi güzel araba\n" +
                    "e) Kuralsız olarak gerçekleşen pekiştirmeler vardır.\n" +
                    "Darmadağınık, Karmakarışık",
            "SIFATLARDA KÜÇÜLTME:\n" +
                    "\n" +
                    "*Sıfatlarda küçültme, -cik, -ce, -cek, -imsi, -imtrak, -su, ekleriyle yapılır.\n" +
                    "\n" +
                    "Ufacık ev\n" +
                    "Derince çukur  (Dikkat edin,  derine yakın ama derin değil!!!)",
            "SIFATLARDA ADLAŞMA (ADLAŞMIŞ SIFAT)\n" +
                    "\n" +
                    "*Sıfatlarda adlaşma birkaç şekilde oluşabilir:\n" +
                    "\n" +
                    "a) Sıfat tamlamasında isim düşürülerek oluşabilir. Böyle durumlarda sıfat ismin yerini tutar.\n" +
                    "\n" +
                    "Genç, hızla yanıma yaklaştı. (Genç adam)" +
                    "b) Sıfat durumundaki kelimeye, çekim ekleri getirilerek oluşabilir.\n" +
                    "\n" +
                    "Yoksullara yardım etmeyi severdi. (Yoksul insanlara)" +
                    "c) Sıfatla isim arasına noktalama işareti getirilerek oluşabilir.\n" +
                    "\n" +
                    "Yaşlı, hizmetçiyi yanına çağırdı.",
            "ZARF (BELİRTEÇ)\n" +
                    "\n" +
                    "*Fiilleri, fiilimsileri, sıfatları ya da kendi türünden sözcükleri anlamca etkileyen sözcüklerdir.\n" +
                    "*Çekim eki almazlar. (Zaman zarfı hariç) Alırlarsa adlaşırlar.",
            "*Zarfların Fiilleri Nitelemesi;\n" +
                    "Hızlı yürüyorsun.\n" +
                    "*Zarfların Fiilimsileri Nitelemesi;\n" +
                    "Hızlı yürürken düştü. (Yürürken zarf-fiildir. Yani fiilimsidir.)\n" +
                    "*Zarfların Sıfatların Derecesini Bildirmesi;\n" +
                    "En güzel araba. (Burada “en” kelimesi “güzel” sıfatının derecesini bildirdiği için zarf olur.)\n" +
                    "En güzel, daha güzel, pek güzel, çok güzel, gayet güzel\n" +
                    "*Zarfların yine Zarfların Derecesini Bildirmesi;\n" +
                    "Çok hızlı yürüyorsun. (Burada “çok” kelimesi “hızlı” zarfının derecesini bildirdiği için zarf olur.)\n" +
                    "En hızlı, daha hızlı, pek hızlı, çok hızlı, gayet hızlı\n",
            "ZARF ÇEŞİTLERİ:\n" +
                    "\n" +
                    "Durum (Hal) Zarfı:\n" +
                    "*Fiillerin, fiilimsilerin durumunu, niteliğini bildiren zarflardır.\n" +
                    "* Nasıl?” sorusuna cevap verirler.\n" +
                    "\n" +
                    "Ağır ağır çıkacaksın bu merdivenlerden. (Nasıl çıkacaksın?)\n" +
                    "Bebek mışıl mışıl uyuyor.  (Nasıl uyuyor?)",
            "Zaman Zarfı:\n" +
                    "*Fiilin ya da fiilimsinin gerçekleştiği zamanı bildiren zarflardır.\n" +
                    "* “Ne zaman?, Ne zamandan beri?, Ne zamana kadar?” Sorularına cevap verirler.\n" +
                    "\n" +
                    "Hemen yanıma gel.\n" +
                    "Artık sınava daha ciddi hazırlanacağım.",
            "er-Yön Zarfı:\n" +
                    "*Eylemin genellikle yönünü belirten zarflardır.\n" +
                    "* “Nereye?” sorusuna cevap veren “ileri, geri, içeri, dışarı, aşağı, yukarı, öte, beri” sözcükleri yer-yön zarfı kabul edilir.\n" +
                    "\n" +
                    "Misafirler yukarı çıktı. (Yer-yön zarfı)",
            "Azlık-Çokluk (Miktar) Zarfı:\n" +
                    "*Miktar veya derecelendirme bildiren zarflardır.\n" +
                    "* “Ne kadar?” sorusuna cevap verirler.\n" +
                    "*Bunların derece bildirenlerine “derecelendirme zarfı” da denmektedir.\n" +
                    "(daha, en, pek, epey, gayet, oldukça, böylesine vs.)\n" +
                    "\n" +
                    "Bu sınava çok çalıştık.",
            "Soru Zarfı:\n" +
                    "*Zarfları bulmak için kullandığımız “Nasıl?, Ne zaman?, Ne kadar?, Nere(ye)?, Niçin?, Niye?” gibi soru kelimeleri fiili ya da fiilimsiyi etkilediğinde soru zarfı olur.\n" +
                    "\n" +
                    "Bugünlere nasıl geldiniz?\n" +
                    "Son kitabı ne zaman çıkmıştı?",
            "DAT (İLGEÇ)\n" +
                    "\n" +
                    "*Kendi başlarına anlamı bulunmayan; başka söz ya da söz öbekleri ile birlikte kullanılarak anlam kazanan sözcüklerdir.\n" +
                    "*Farklı anlamlarda kullanılabilirler.\n" +
                    "*Cümlede belli anlam ilgileri kurmaya yararlar.\n" +
                    "*Eklendiği sözcük ile birlikte sıfat, zarf gibi görevlerde kullanılabilirler. Yani anlam ve görevi cümle içinde belirir.\n" +
                    "*Genelde kendilerinden önceki kelimeye hal eki ile bağlanırlar.\n" +
                    "*Cümleden çıkarıldıklarında, cümlenin anlamı bozulur.",
            "BAŞLICA EDATLAR:\n" +
                    "ile, yalnız, ancak, gibi, mi, için, sanki, üzere, -e göre, -e kadar, -e doğru, -e karşı, -e karşın,\n" +
                    "-e rağmen, -e dek, -e değin, -den sonra, -den önce, -den yana, -den dolayı, -den beri, -den başka,\n" +
                    "-den ötürü, sade, sadece, tek, bir, denli, değil",
            "BAĞLAÇ:\n" +
                    "\n" +
                    "*Kendi başlarına anlamı bulunmayan; sözleri, sözcük öbeklerini, bazen de cümleleri birbirine bağlayan sözcüklerdir.\n" +
                    "*Cümleden çıkarıldıklarında, cümlenin anlamı bozulmaz fakat daralabilir.\n" +
                    "*Bazen anlamlı sözcükler de kendi anlamını yitirip, bağlaç olarak kullanılabilir.",
            "BAŞLICA BAĞLAÇLAR:\n" +
                    "Ve, veya, yahut, ile, ama, fakat, oysa, lakin, dahi, ya da, ancak, çünkü, belki, meğer, yani, zira, yoksa, ayrıca, öyleyse, bile, ise, üstelik, yalnız, örneğin, nitekim, hatta, halbuki, ne var ki, mesela, ki, de, mademki, yeter ki.\n" +
                    "ya………..  ya………….  ,  ne…………… ne……………. ,\n" +
                    "hem…………. hem……….. , ister…………. İster………….. ,\n" +
                    "gerek………… gerek…………… , …………..olsun ……………olsun",
            "Son kez baktı ve ilerledi.\n" +
                    "Sen gel veya gelme, biz gideceğiz.\n" +
                    "Anahtar, Ahmet yahut Ali’de olmalı.\n" +
                    "Pazardan elma ile portakal aldık.\n" +
                    "Yemek isterim ama midem ağrıyor.\n" +
                    "Koştum, fakat yetişemedim.\n" +
                    "Beni sevmezdi, oysa ben onu çok severdim.\n" +
                    "Biraz tembeldir, lakin iyi çocuktur.\n" +
                    "Sinemaya Ahmet dahi gelmedi.\n" +
                    "Mühendisliği ya da tıbbı seçeceğim.\n" +
                    "Alırdım ancak param kalmadı.\n" +
                    "Hemen yatıp uyumalıyım; çünkü çok yorgunum.\n" +
                    "Belki yarın, belki yarından da yakın.\n" +
                    "Çok kızmıştım, meğer suçlu o değilmiş.",
            "ÜNLEM:\n" +
                    "\n" +
                    "*Kendi başına anlamı olmayan; sevinç, korku, heyecan, kızma, şaşma, acı, ürperme gibi duygular içeren ya da seslenme bildiren sözcüklerdir.\n" +
                    "\n" +
                    "Ah! Ben ne yaptım böyle. (Pişmanlık)\n" +
                    "Ah ah! (Özlem)\n" +
                    "Öf! Bu ne koku. (İğrenme)\n" +
                    "Öf be! (Kızma)",
            "BAZI ÇOK KULLANILAN EDAT VE BAĞLAÇLARIN İNCELENMESİ\n" +
                    "\n" +
                    "\n" +
                    "İLE:\n" +
                    "\n" +
                    "*Edat, Bağlaç, Zarf olarak kullanılabilir.\n" +
                    "*Kendinden önceki sözcüğe bağlanıp, “-le, -la, -yle, -yla” şeklini alabilir.\n" +
                    "\n" +
                    "İle: “ve” anlamında kullanılırsa, “BAĞLAÇ” olur.\n" +
                    "\n" +
                    "Gelmesiyle gitmesi bir oldu.\n" +
                    "Ahmet ile Hasan sinemaya gittiler.\n" +
                    "Kalemle kâğıdı al; yazmaya başla",
            "İle: “araç, vasıta” ya da “birliktelik” anlamı katarsa, “EDAT” olur.\n" +
                    "\n" +
                    "Ankara’ya uçakla gideceğiz. (vasıta)\n" +
                    "Maçı arkadaşlarla seyrettik. (birliktelik)" +
                    "İle: “durum” bildirip, “nasıl?” sorusuna cevap veriyorsa, “ZARF” olur.\n" +
                    "Topa hızla vurdu.\n" +
                    "Öfkeyle yerinden kalktı.",
            "YALNIZ:\n" +
                    "\n" +
                    "Yalnız:  “sadece” anlamında kullanılırsa, “EDAT” olur.\n" +
                    "\n" +
                    "Geride kalan yalnız sen değilsin.\n" +
                    "Bu soruyu yalnız o çözebilir.",
            "Yalnız:  “ama, fakat” anlamındaysa, “BAĞLAÇ” olur.\n" +
                    "\n" +
                    "Bu araba güzel, yalnız, çok pahalı.\n" +
                    "Bu tür eserleri okurum; yalnız pek anlayamam.",
            "Yalnız:  “ismi nitelerse” ,  “SIFAT”  olur.\n" +
                    "\n" +
                    "Ona, “Yalnız Kovboy” diyorlardı.\n" +
                    "Yalnız insanlara, sahip çıkmalıyız.\n" +
                    "Yalnız:  “fiili nitelerse” ,  “ZARF” olur.\n" +
                    "Ölüme bile yalnız gitti.\n" +
                    "Yalnız:  “Tek başına kullanılıp”, “İSİM” olabilir.\n" +
                    "Yıllardır, yalnızım.",
            "GİBİ:\n" +
                    "\n" +
                    "*Gibi, “benzetme, karşılaştırma, olasılık (tahmin), hemen” anlamları katabilir.\n" +
                    "*Sıfat, zarf, isim olarak kullanılabilir.\n" +
                    "\n" +
                    "Buz gibi havada dışarı mı çıkılır? (Benzetme, Sıfat grubunda yer almış.)\n" +
                    "Yapılan yemeği kurt gibi yedik. (Benzetme, Zarf grubunda yer almış.)",
            "ANCAK:\n" +
                    "\n" +
                    "Ancak:  “sadece”  yada  “olsa olsa”  anlamında kullanılırsa, “edat” olur.\n" +
                    "\n" +
                    "Bu yaptıklarına ancak o katlanır. (sadece)\n" +
                    "Ancak, ona inanırım. (sadece)",
            "Ancak:  “ama, fakat”  anlamında kullanılırsa,  “BAĞLAÇ”  olur.\n" +
                    "\n" +
                    "Çok anlattım, ancak anlamadı.\n" +
                    "\n" +
                    "Ancak:  “henüz, şu an”  anlamında kullanılırsa,  “ZARF”  olur.\n" +
                    "\n" +
                    "Ne bakıyorsun, ancak gelebildim.",
            "DOĞRU:\n" +
                    "Doğru:  “yönelme”  bildirirse  “EDAT”  olur.\n" +
                    "Eve doğru gidiyordu.\n" +
                    "Doğru:  “ZARF”  olarak kullanılabilir.\n" +
                    "Otobüsten inince, doğru okula git.\n" +
                    "Doğru:  “SIFAT”  olarak kullanılabilir.\n" +
                    "Doğru söze ne söylenir.\n" +
                    "Doğru: “İSİM” olarak kullanılabilir.\n" +
                    "Doğru, o da bizimle gelmişti.\n" +
                    "Buna, doğru parçası denir.",
            "BAŞKA:\n" +
                    "Başka:  “hariç”  anlamında kullanılarak “EDAT” olur.\n" +
                    "Fuzuli’den başka tüm şairler bu konuyu ele aldı.\n" +
                    "Başka:  “SIFAT”  olarak kullanılabilir.\n" +
                    "Başka insanları da düşünmek zorundayız.\n" +
                    "Başka:  “ZAMİR”  olarak kullanılabilir.\n" +
                    "Başkası, bu iyiliği yapmazdı.\n" +
                    "Başka:  “ZARF”  olarak kullanılabilir.\n" +
                    "Bıktım senin başka başka konuşmalarından.",
            "DE:\n" +
                    "*De, “gibilik, eşitlik, katılma, pekiştirme, dahi, bile, istek vb.” anlamlar katar.\n" +
                    "*Bağlaç olan “de” kelimeden ayrı olarak yazılır.\n" +
                    "Ben de güvenemez oldum. (dahi, bile)\n" +
                    "Konuş da ne olduğunu anlayalım. (istek)\n" +
                    "Hazırlanacak da, biz de gideceğiz. (İğneleme)\n" +
                    "Toplantıya Mine de geldi. (diğerleri gibi anlamı katmış.)\n" +
                    "Gitmem de gitmem diyordu. (pekiştirme.)"
    };
    public static String CumleBilgisi[] = {
            "Cümleler anlamına, yapısına, yüklemin yerine ve türüne göre dörde ayrılır.",
            "Yüklemin Yerine Göre Cümleler\n" +
                    "A - Kurallı Cümle:\n" +
                    "Yüklemin sonda yer aldığı cümlelerdir.\n" +
                    "Örnekler:\n" +
                    "1- Yarın arkadaşlarımla tiyatroya ''gideceğiz.''\n" +
                    "2- Televizyon izlemek yerine kitap okumayı tercih ''ederim.''\n" +
                    "3- Sınıf arkadaşlarımı çok ''özledim.''",
            "B- Devrik Cümle:\n" +
                    "Devrik cümlelerde yüklem, tümcenin başında ya da ortasında yer alır.\n" +
                    "Örnekler:\n" +
                    "1- Çok ''sıkıldım'' artık insanların egolu tavırlarından.\n" +
                    "2- Böyle davranmasına hiç gerek ''yoktu'' bence.",
            "C- Eksiltili Cümle:\n" +
                    "Kesik Cümle adıyla da bilinen eksiltili cümlelerde yüklem yer almaz. Bu cümlelerin sonuna nokta değil üç nokta (...) konur.\n" +
                    "Örnekler:\n" +
                    "1- Ee ne derler bilirsin...\n" +
                    "2- Keşke şimdi burada olsa da...\n" +
                    "3- İnsanın canını en çok acıtan şeyler nedir bilir misin? Özlem, aşk, memleket hasreti..",
            "Yüklemin Türüne Göre Cümleler\n" +
                    "A- Fiil Cümlesi\n" +
                    "1- Bu yaz istediğim kadar çok kitap okuyamadım.\n" +
                    "2- Basketbol oynarken bileğini burkmuş.\n" +
                    "3- Annem piknikte yememiz için kurabiye ve poğaça yapmış.\n" +
                    "B- İsim Cümlesi:\n" +
                    "1- İnsanı diğer canlılardan ayıran akıl ve iradedir.\n" +
                    "2- Bende seveceğini düşündüğüm çok güzel kitaplar var.\n" +
                    "3- Susup oturmak çözüm değil.\n" +
                    "4- Çoğu zaman insana en büyük kötülüğü yapan yine kendisidir.\n",
            "Anlamlarına Göre Cümleler\n" +
                    "\n" +
                    "A- Olumlu Cümle\n" +
                    "\n" +
                    "1- Bu sıralar polisiye romanları okuyorum.\n" +
                    "2- Yetişkin bir insan günde en az iki litre su içmeli.\n",
            "B- Olumsuz Cümle\n" +
                    "\n" +
                    "1- Onunla tekrar bir araya gelmeyi düşünmüyorum.\n" +
                    "2- O çok sevdiğim insanlar artık yanımda değil.",
            "C- Soru Cümlesi\n" +
                    "\n" +
                    "1- Ben bunları hak edecek ne yaptım?\n" +
                    "2- Yarınki sınava çalışabildin mi?\n" +
                    "3- Bugün işten geç mi çıkacaksın?",
            "D- Ünlem Cümlesi\n" +
                    "\n" +
                    "1- Ah şu zamane gençleri!\n" +
                    "2- Kendine gel artık!\n" +
                    "3- Bu kadarına da pes!"
    };
    public static String YazimKurallari[] = {
            "Büyük ve Küçük Harflerin Kullanımı\n" +
                    "\n" +
                    "Alfabemizde (Lâtin alfabesi) her harfin bir büyük, bir de küçük şekli vardır. Yazıda yaygın olarak küçük harf kullanılır. Ancak belirli yerlerde büyük harf kullanılmalıdır.\n" +
                    "\n" +
                    "Büyük harfle küçük harf arasında okunuş olarak fark olmasa da yazılış olarak büyük farklar vardır.",
            "Büyük ve küçük harflerin kullanımı ile ilgili kurallar şunlardır:\n" +
                    "\n" +
                    "Her cümlenin ilk kelimesi büyük harfle başlar. Büyük harfle başlamayan bir kelime dizisi, öncesi yazılmamış ya da silinmiş bir cümle zannedilebilir.\n" +
                    "\n" +
                    "\"Bir gün, istiklâl ve cumhuriyeti müdafaa mecburiyetine düşersen, vazifeye atılmak için, içinde bulunacağın vaziyetin imkân ve şeraitini düşünmeyeceksin!\"\n" +
                    "\"Ömür, yarınlara bağlanan ümitlerle geçip gitmekte, gafilcesine kavgalarla, gürültülerle, didinmelerle tükenip durmadadır. Sen aklını başına al da, ömrünü, şu içinde bulunduğun bugün say.\" (Mevlâna)\n" +
                    "\" Noktayla, iki noktayla, üç noktayla, soru ve ünlem işaretleriyle biten cümlelerden sonra gelen cümleler büyük harfle başlar.",
            "İki noktadan sonra cümle gelmiyorsa, örnekler sıralanıyorsa bunlar büyük harfle başlamaz:\n" +
                    "\n" +
                    "Bazı mastarlar kalıcı nesne adı olmuşlardır: yemek, çakmak, dolma, dondurma, kavurma, buluş...\n" +
                    "\"Örneklerle başlayan cümleler de büyük harfle başlar:\n" +
                    "\n" +
                    "Bilgisayar, sinema, tiyatro, internet, fotoğraf gibi hobiler, pahalılık yüzünden lüks gibi görülmektedir.\n" +
                    "\"Cümle içerisinde başkasından aktarılan ve tırnak içinde verilen cümleler de büyük harfle başlar:\n" +
                    "\n" +
                    "Atatürk gençliğe seslenirken ilk önce \"Ey Türk gençliği! Birinci vazifen, Türk istiklâlini, Türk cumhuriyetini, ilelebet, muhafaza ve müdafaa etmektir.\" demektedir.",
            "Tırnak içinde verilen söz tam bir cümle değilse veya cümlenin baş kısmı verilmemişse büyük harfle başlamaz.\n" +
                    "\n" +
                    "Nabi'nin \"......... var içinde\" redifli gazeli açıklanacak.\n" +
                    "\"İki kısa çizgi veya iki virgül arasında verilen ara sözler, ara cümleler, açıklama cümleleri büyük harfle başlamaz.\n" +
                    "\n" +
                    "Bu konuda kararlı olduktan sonra -geç karar vermiş olsan da- başarıya ulaşırsın.\n" +
                    "Başımın ağrısı yazları -sıcaklardan olmalı- daha da artar.\n" +
                    "Kalıcı konutları bu yıl sonuna kadar -geçen seneki lâf- yetiştireceklermiş.\n" +
                    "Çıkmamız gereken uygar milletler seviyesini -ki bu seviyeye hâlâ çok uzağız- Mustafa  Kemal hedef olarak göstermişti bize.",
            "Rakamla başlayan cümlelerde rakamdan sonra gelen kelime büyük harfle başlamaz.\n" +
                    "\n" +
                    "1998 yılında ortaokulu bitirdim.",
            "Bütün özel isimler (özel ismi oluşturan her kelime ve onları niteleyen, tanıtan unvanlar) büyük harfle başlar. Büyük harfle başlamazsa cins ismi zannedilebilirler:\n" +
                    "\n" +
                    "\" Kişi adları ve soyadları, takma adlar, kişi adlarından önce ve sonra gelen saygı sözleri, unvanlar ve meslek adları, tarihî kişilerin adlarından önce gelen unvan ve lâkaplar büyük harfle başlar:",
            "Ali, Meltem, Mehmet, Meral, Yasemin, Uğur, Ahmet...\n" +
                    "Binbaşı Ömer, Doktor Kenan, Mütercim Asım, Ankaralı Âşık Ömer...\n" +
                    "Mustafa Kemal Atatürk, Mehmet Akif Ersoy, Nazım Hikmet Ran, Yavuz Bülent Bakiler, Kâmuran İnan, Victor Hugo, Halil Cibran...\n" +
                    "Nedim, Fuzulî, Bakî, Muhibbî (Kanuni), Demirtaş (Ziya Gökalp), Tarhan (Ömer Seyfettin), Aka Gündüz (Hüseyin Avni, Eniz Avni), Kirpi (Refik Halit), Deli Ozan (Faruk Nafiz), Halide Salih (Halide Edip), Server Bedi (Peyami Safa), İrfan Kudret (Cahit Sıtkı), Mehmet Ali Sel (Orhan Veli)..",
            "Akrabalık adları bildiren kelimeler büyük harfle başlamaz. Ancak akrabalık kelimeleri başta gelirse büyük harfle başlar.\n" +
                    "\n" +
                    "Fahriye abla, Ayşe teyze, Numan amca...\n" +
                    "Nene Hatun, Baba Gündüz, Dayı Kemal...",
            "Resmî yazılarda saygı bildiren sözlerden sonra gelen makam mevki, unvan bildiren kelimeler büyük harfle başlar:\n" +
                    "\n" +
                    "Sayın Bakan, Sayın Başkan, Sayın Profesör, Sayın Vali...\n" +
                    "\" Kurum, kuruluş, kurul, müessese, makam, üniversite isimleri:\n" +
                    "\n" +
                    "Türkiye Büyük Millet Meclisi, Mamak Anadolu Lisesi, Yeşilay Derneği, Türk Dil Kurumu, Ege Üniversitesi, Kars Valiliği, Mamak İlçe Millî Eğitim Müdürlüğü, Bakanlar Kurulu, Emek İnşaat, Millî Kütüphane, Türk Ocağı...",
            "Kurum, merkez, bakanlık, üniversite, fakülte, bölüm vb. ifade eden kelimelerden herhangi biriyle belli ve özel bir kurum, kuruluş vb. kastedildiği zaman bu kelime büyük harfle başlatılabilir:\n" +
                    "\n" +
                    "Bu yıl Meclis yine çok çalıştı.\n" +
                    "Son yıllarda Bakanlık, destek faaliyetlerini daha da artırdı.",
            " Millet, kavim, boy, oymak, din, mezhep isimleri ve bunlara mensup olanlara verilen isimler:\n" +
                    "\n" +
                    "Türk, Türkler, Yunan, İngiliz, Çeçen, Ruslar, Alman, Arap...\n" +
                    "Oğuz, Kazak, Tatar, Özbek, Tacik...\n" +
                    "Müslüman, Musevî, Hıristiyan...\n" +
                    "Müslümanlık, İslâm, Musevîlik, Hıristiyanlık...",
            "Din ve mitoloji kavramlarını karşılayan özel adlar büyük harfle başlar. Bazı dinî kavramlar küçük harfle başlar. Tanrı kelimesi özel isim olarak kullanılmıyorsa küçük harfle başlar:\n" +
                    "\n" +
                    "Allah, Tanrı, Cebrail, Zeus, Kibele...\n" +
                    "cennet, cehennem, uçmak, tamu, sırat köprüsü...\n" +
                    "Eski Yunan tanrıları...",
            "Dil ve lehçe isimleri:\n" +
                    "\n" +
                    "Türkçe, Farsça, Fransızca, Macarca, Fince, Tibetçe, Kırgızca, Özbekçe, Tatarca, Oğuzca...\n" +
                    "\" İl, İlçe, Semt, mahalle, cadde, bulvar, sokak, pasaj, çarşı, park isimleri (bunlarda geçen tüm kelimeler) büyük harfle başlar:\n" +
                    "\n" +
                    "Sivas, Ankara, İstanbul, Mamak, Yenişehir, Şirinevler, Atatürk Bulvarı, İvedik Caddesi, Gönül Sokak, Mısır Pasajı, Kuyumcular Çarşısı, Güvenpark, Altınpark, Kuğulu Park...\n" +
                    "\"Saray, köşk, han, kale, köprü, anıt vb yapı adlarına ait bütün kelimeler büyük harfle başlar:\n" +
                    "\n" +
                    "Topkapı Sarayı, Çankaya Köşkü, Ankara Kalesi, Galata Köprüsü, Atakule...",
            " Devlet, ülke ve bölge isimleri:\n" +
                    "\n" +
                    "Türkiye, Türkiye Cumhuriyeti, Amerika Birleşik Devletleri, Afganistan, İran, Kuzey Kıbrıs Türk Cumhuriyeti...\n" +
                    "Batı Almanya, Batı Trakya, Güney Yemen, Doğu Avrupa, Doğu Anadolu Bölgesi, İç Anadolu (Bölgesi), Ege, Marmara...\n" +
                    "Not: Yön bildiren kelimeler bir bölge veya ülke adından önce gelirse büyük, sonra gelirse küçük yazılır.\n" +
                    "Geçen yaz Kuzey Kıbrıs'a tatile gittik.\n" +
                    "Kıbrıs'ın kuzeyine tatile gittik.\n" +
                    "Doğu Anadolu'nun coğrafyası...\n" +
                    "Anadolu'nun doğusundaki dağlar...",
            "Kıta isimleri:\n" +
                    "\n" +
                    "Avrasya, Asya, Avrupa, Afrika, Amerika, Antarktika, Arktika, Avustralya.\n" +
                    "\" Deniz, okyanus, göl, akar su, boğaz, geçit isimleri:\n" +
                    "\n" +
                    "Akdeniz, Karadeniz, Manş Denizi, Büyük Okyanus, Atlas Okyanusu\n" +
                    "Van Gölü, Hazar Denizi, Beyşehir Gölü, Kızılırmak, Yeşilırmak, Sakarya, Seyhan, Fırat, Nil, İstanbul Boğazı, Panama Geçidi, Süveyş Kanalı ...\n" +
                    "\" Dağ, tepe, ova, yayla isimleri:\n" +
                    "\n" +
                    "Elmadağ, Uludağ, Ağrı Dağı, Erciyes (dağı), Everest Tepesi, Çukurova, Konya Ovası...",
            "Gezegen ve yıldız adları büyük harfle başlar. Ancak dünya, güneş ve ay kelimeleri terim olarak (astronomi ve coğrafya terimi) kullanılıyorsa özel isim olduğu için büyük; diğer anlamlarında (gerçek, mecaz, yan, eş, deyim vb.) kullanılıyorsa cins ismi olduğu için küçük harfle başlar:\n" +
                    "\n" +
                    "Merih, Mars, Jüpiter, Venüs, Küçükayı, Halley...\n" +
                    "Ay'ın yakından çekilmiş fotoğrafları insanlığı pek şaşırtmıştı.\n" +
                    "Yazın Güneş ışınları Dünya'ya dik olarak gelir.",
            "Kitap, gazete, mecmua, eser, kanun, tüzük, yönetmelik, yönerge, genelge isimleri büyük harfle başlar. Bunlara dahil olmayan kelimeler küçük harfle başlar:\n" +
                    "\n" +
                    "Sabah (gazetesi), Milliyet (gazetesi); Varlık (dergisi); Türk Dili (dergisi); Yaprak Dökümü; Resimli Türk Edebiyatı Tarihi, Türk Ansiklopedisi; Halı Dokuyan Kızlar (tablosu), Düşünen Adam (heykeli), Medenî Kanun, Borçlar Hukuku...\n" +
                    "\" Hayvanlara takılan özel isimler:\n" +
                    "\n" +
                    "Düldül, Sarıkız, Fino, Tekir, Karabaş, Yumoş, Minnoş...\n" +
                    "\"Yer ve millet adlarıyla kurulan birleşik kelimelerdeki özel adlar büyük harfle başlar.\n" +
                    "\n" +
                    "Antep fıstığı, Brüksel lâhanası, Hindistan cevizi, İngiliz anahtarı, Maraş dondurması, Van kedisi...",
            "Yazı başlıkları, konu adları büyük harfle başlar:\n" +
                    "\n" +
                    "İmlâ Kuralları, Dil Bilgisinin Bölümleri, 19. Yüzyılda Türk Edebiyatının Seyri...\n" +
                    "] Gazete ve dergiler konu başlıklarında sadece ilk kelimeyi büyük harfle başlatırlar:\n" +
                    "\n" +
                    "Kamyon eve girdi, Büyük seçim yarın...\n" +
                    "] Kitap, gazete, dergi isimleriyle konu başlıklarındaki \"ile, ve, de, ya da, ki\" bağlaçlarıyla soru ekinin küçük yazılması gerekir:\n" +
                    "\n" +
                    "Başarmak ve Kazanmak, Türk Dili ve Edebiyatı, Karga ile Tilki, Ya Devlet Başa ya Kuzgun Leşe, Ben de Yazdım...",
            "Kitap, gazete, dergi isimleri ve konu başlıkları -dikkat çekmek için- bütünüyle büyük harfle yazılabilir. Bu durumda aralardaki \"ile, ve, de, ya da, ki\" bağlaçlarıyla soru ekinin küçük yazılması gerekir:\n" +
                    "\n" +
                    "Başarmak ve Kazanmak, Türk dili ve edebiyatı, karga ile tilki..",
            "Mektuplarda ve resmî yazılarda hitapların ilk kelimeleri büyük harfle başlar:\n" +
                    "Aziz kardeşim, Canın anneciğim, Sevgili kardeşim Hakan...\n" +
                    "Bu yıl 2 Eylül'de döneceğiz.\n" +
                    "15 Kasım 1999 Pazartesi günü konferans yapılacak.\n" +
                    "] Levhalar ve açıklama yazıları büyük harfle başlar. Yazı birkaç kelimeden oluşuyorsa ilk kelime büyük harfle başlar. Yazı rakamla başlamışsa ondan sonraki kelime küçük harfle başlar.\n" +
                    "\n" +
                    "Giriş, Çıkış, Müdür, Müdüriyet, Vezne, Başkan, Doktor\n" +
                    "Otobüs durağı, Şehirler arsı telefon...\n",
            "Kurultay, sempozyum, panel vb toplantıları bildiren özel adlar büyük harfle başlar:\n" +
                    "\n" +
                    "Manas Bilgi Şöleni, Uluslar Arası Türk Dili Kurultayı...\n" +
                    "] Millî ve dinî bayramlarla bayram niteliği kazanmış günler büyük harfle başlar. Ancak genel nitelik arz edenler küçük harfle başlar:\n" +
                    "\n" +
                    "Cumhuriyet Bayramı, Ramazan Bayramı, Kurban Bayramı, 23 Nisan Ulusal Egemenlik ve Çocuk Bayramı, Nevruz Bayramı, Anneler Günü, Öğretmenler Günü, Tıp Bayramı," +
                    "Çağ, dönem ve tarihî olay adları büyük harfle başlar:\n" +
                    "\n" +
                    "Cilâlı Taş Devri, İlk Çağ, Millî Mücadele, Cumhuriyet Dönemi Türk Edebiyatı...",
            "Özel isimlerden türetilen isim, sıfat ve fiiller büyük harfle başlar ve ekleri de kesme işareti ile ayrılmaz. Bu özel isimler türetilen kelimenin içinde kalıyorsa büyük harfle başlamaz:\n" +
                    "\n" +
                    "Türkleşmek, İslâmlaşmak, Türkolog, Darvinci, Sivaslı, Ankaralı, Türkçecilik, Avrupalı...\n" +
                    "\"Özel isim kendi anlamı dışında yeni bir anlam kazanmışsa küçük harfle başlar. Müzik terimleri için de bu geçerlidir:\n" +
                    "\n" +
                    "acem, acemi, hicaz, nihavent, amper, jul, allahlık, donkişotluk...\n" +
                    "Kısaltma; bir kelime, terim veya özel adın içerdiği harflerden biri veya birkaçı ile daha kısa olarak ifade edilmesi ve sembolleştirilmesidir. Yapılan kısaltmaların benimsenmesi, yaygınlaşması ve herkes tarafından anlaşılması gerekir.",
            "Kurum, kuruluş, müessese, makam, üniversite adlarının kısaltmalarında bütün harfler büyüktür. Harfler arasına nokta koymaya gerek yoktur.\n" +
                    "\n" +
                    "TRT, TBMM, İTÜ, DSİ, TDK, TTK, MEB, AÜ DTCF, DAÜ, D, B, K, G, KB, GB, KD, GD (son sekizi yön adı)",
            "Bazı kısaltmalar da kelime gibi oluşturulmuştur.\n" +
                    "\n" +
                    "ASELSAN, BOTAŞ, İLESAM, SEKA, TÖMER, TEDAŞ",
            "Kısaltması büyük harflerle yapıldığı hâlde bir kelime gibi okunan bu kısaltmalara getirilen eklerde kısaltmanın okunuşu esas alınır:\n" +
                    "\n" +
                    "ASELSAN'da, BOTAŞ'a, İLESAM'ın, SEKA'nın, TÖMER'den, TEDAŞ'ta, NATO'dan",
            "Nokta kullanılan kısaltmalar da vardır. Bunlardan sonra getirilen ekler kesmeyle ayrılmaz:\n" +
                    "\n" +
                    "K.K.K., M.Ö., M.S., P.K., T.C.",
            "Özel isim veya unvan olan bir kelime birkaç harfle kısaltılıyorsa yalnız ilk harf büyük yazılır.\n" +
                    "\n" +
                    "Prof., İst., Doç., Dr., Av., Alb., Gen.\n" +
                    "Alm. (Almanca), İng., Kocatepe Mah., Güniz Sok.",
            "Bu kısaltmalara ek getirilirken kelimenin uzun şeklinin okunuşu esas alınır; ekler kesmeyle ayrılmaz:\n" +
                    "\n" +
                    "İst.da, Alm.yı, İng.ye",
            "Özel isim olmayan kelimelerin kısaltması küçük harfle başlar.\n" +
                    "\n" +
                    "C. (cilt), s. (sayfa), bkz.(bakınız), vb. (ve benzeri), vs. (ve saire), is. (isim), sf. (sıfat), hz. (hazırlayan), çev. (çeviren), ed. (edebiyat), fiz. (fizik), kim. (kimya)",
            "Bu kısaltmalara ek getirilirken kelimenin uzun şeklinin okunuşu esas alınır; ekler kesmeyle ayrılmaz:\n" +
                    "\n" +
                    "vb.leri, vs.den, is.ler, sf.lar, hz.da, çev.e, ed.ı, fiz.le, kim.da",
            "Elementlerin ve ölçülerin kısaltmalarında nokta kullanılmaz:\n" +
                    "\n" +
                    "C, Ca, Fe, m, mm, cm, km, g, kg, l, mg ...",
            "Bu kısaltmalara ek getirilirken kelimenin uzun şeklinin okunuşu esas alınır; ekler nokta kullanılmadığı için kesmeyle ayrılır:\n" +
                    "\n" +
                    "m'ye, mm'de, cm'yi, km'ye, g'dan, kg'dan, l'de, mg'ı",
            "\"Sert sessizle biten kısaltmalara ünlüyle başlayan ek getirildiğinde okunuşta sondaki sert ünsüz yumuşamaz:\n" +
                    "\n" +
                    "AGİK'in (agiğin değil agikin), TÜBİTAK'a (tübitağa değil tübitaka)\n" +
                    "Ancak \"birlik\" kelimesiyle kurulan kısaltmalarda yumuşama görülür:\n" +
                    "\n" +
                    "ÇUKOBİRLİK'e (çukobirliğe)",
            "Ek-Fiilin Yazımı\n" +
                    "\n" +
                    "Ek-fiil isimlerin yüklem olmasını sağlayan ektir..\n" +
                    "\n" +
                    "a. Ek-fiil (imek fiili) eklendiği kelimeye bitişik de yazılabilir ondan ayrı da... Ama genellikle bitiştirilir. Ayrı yazıldığı zaman ünlü uyumlarına uyup uymadığına bakılmaz. Bitişik yazılan ek-fiil \"büyük ve küçük ünlü uyumu\" kurallarına uyar.",
            "Sessiz harfle biten kelimeye bitiştiriliyorsa, başındaki \"i\" düşer:\n" +
                    "\n" +
                    "rahatsız idim>rahatsızdım,\n" +
                    "çocuk ise>çocuksa,\n" +
                    "Serkan imiş>Serkan'mış,\n" +
                    "koşar iken>koşarken\n" +
                    "Suçlanan ben imişim>benmişim",
            "Sesli harfle biten kelimeye bitiştiriliyorsa, başındaki \"i\" düşer ve yerine \"y\" kaynaştırma harfi gelir:\n" +
                    "\n" +
                    "Bir güzelin hayranı i-di-m>hayranıydım, hayranı idik>hayranıydık\n" +
                    "Zeki idi>zekiydi\n" +
                    "Ali imiş>Ali'ymiş,\n" +
                    "Hasta ise>hastaysa,",
            "Fiillere getirildiğinde onların birleşik zamanlı çekimlerini yapmayı sağlayan ek-fiil bitişik de ayrı da yazılabilir:\n" +
                    "\n" +
                    "çalışmış i-di-k>çalışmıştık\n" +
                    "okuyor i-se>okuyorsa",
            "\"ile\" Edatının (Hem edat, hem bağlaç) Yazımı\n" +
                    "\n" +
                    "Edat ve bağlaç olarak kullanılır.\n" +
                    "Yazılışları bakımından aralarında fark yoktur.\n" +
                    "Bu kelime kendinden önceki kelimeye bitişik de yazılabilir, ondan ayrı da...\n" +
                    "\n" +
                    "Bitişik yazılan \"ile\" kelimesi \"büyük ve küçük ünlü uyumu\" kurallarına uyar. Ayrı yazıldığında ünlü uyum kuralları aranmaz:\n" +
                    "\n" +
                    "arabası ile>arabasıyla, konu ile>konuyla,\n" +
                    "annem ile babam>annemle babam",
            "Ünlüyle biten kelimelere bitiştirildiğinde, baştaki \"i\" ünlüsü düşer ve yerine \"y\" kaynaştırma harfi gelir:\n" +
                    "\n" +
                    "Bora ile>Bora'yla,\n" +
                    "sopa ile>sopayla,\n" +
                    "dava ile>davayla,",
            "Ünsüzle biten kelimelere bitiştirildiğinde, sadece baştaki \"i\" ünlüsü düşer, büyük ünlü uyumuna göre \"la\" veya \"le\" şeklinde kullanılır.\n" +
                    "\n" +
                    "Murat ile>Murat'la,\n" +
                    "cam ile>camla,",
            "mi\" Soru Ekinin Yazımı\n" +
                    "\n" +
                    "Hem isimlere hem de fiillere getirilen bir çekim ekidir.\n" +
                    "\n" +
                    "\"-mİ\", kendinden önceki kelimden her zaman ayrı (bir kelime gibi) yazılır:\n" +
                    "\n" +
                    "Gelecek miydin? (fiile)\n" +
                    "Sen misin? (isme)\n" +
                    "Geldi mi?, okuyor mu?, onlar mı?, özgün mü?...",
            "Eklendiği kelimenin son sesine, dolayısıyla büyük ve küçük sesli uyumu kurallarına uyar:\n" +
                    "\n" +
                    "Salı mı?\n" +
                    "Sen mi?\n" +
                    "O mu?",
            "Soru ekinden sonra gelen ekler kendisine bitişik yazılır.\n" +
                    "Seni çağıran bu çocuk muydu?\n" +
                    "\" Soru anlamı vermediği zamanlarda da ayrı yazılır.\n" +
                    "\n" +
                    "Yağmur yağdı mı dışarı çıkmak isterim.\n" +
                    "Güzel mi güzel bir evi var. ",
            "\"dE\" Bağlaının ve \"-dE\" Hâl Ekinin Yazımı\n" +
                    "\"de\" bağlacı ve \"de\" eki birbirinden kolayca ayırt edilebilir. Aşağıda, dikkat edilmesi gereken noktalar da verilmiştir.\n" +
                    "a. \"dE\" Bağlacı\n" +
                    "Her zaman kendinden önceki ve sonraki kelimelerden ayrı ve \"de, da\" şeklinde yazılır; bitiştirilmez, \"te, ta\" şeklinde yazılmaz. \n" +
                    "\"ya\" ile birlikte kullanıldığında da ayrı yazılır: \"ya da\" İsimlerden sonra da kullanılabilir, fiillerden sonra da.\n" +
                    "Kelimenin son hecesine kalınlık-incelik bakımından uyar. Ama ünsüz uyumuna bağlı değildir, yani -te, -ta şekilleri yoktur.\n" +
                    "Gölgende ban da bana da yer ver.\n" +
                    "Ateşten kızaran bir gül arar da\n" +
                    "Gezer bağdan bağa çoban çeşmesi.",
            "\"-dE\" Hâl Eki\n" +
                    "İsim çekim eklerindendir.\n" +
                    "İsmin bulunma hâlini yapan hâl ekidir.\n" +
                    "Yer ve zaman bildirir.\n" +
                    "Sesli uyumlarına uyar.\n" +
                    "\"dE\" bağlacının yalnız \"de\", \"da\" biçimleri varken; \"-dE\" hâl ekinin \"-de\", \"-da\", \"-te\", \"-ta\" biçimleri vardır. Bunun sebebi ekin bitişik yazılıyor olmasıdır.\n" +
                    "Yapım eki olarak da kullanılabilir:\n" +
                    "Örnekler:\n" +
                    "Eski İstanbul'da ne güzel günler yaşanmış.\n" +
                    "Saat yedide mi gelecekmiş?\n" +
                    "Her şey yerli yerinde.\n" +
                    "Suyu bir yudumda içti.",
            "ki\" Bağlacı\n" +
                    "\n" +
                    "Sadece \"ki\" biçimi vardır.\n" +
                    "Kendinden önceki ve sonraki kelimelerden ayrı yazılır.\n" +
                    "Türkçe değil, Farsça bir bağlaçtır ve Türkçe cümle yapısına aykırı olarak kullanılır.\n" +
                    "\"ki\" ile başlayan bir ara cümle asıl cümlenin içinde kısa çizgiler arasında verilebilir:\n" +
                    "Örnekler:\n" +
                    "\n" +
                    "Bu ezanlar -ki şahadetleri dinin temeli-\n" +
                    "Yağmur yağmadı ki mantarlar ortaya çıksın.\n" +
                    "Atatürk diyor ki: ...",
            "-ki\" İlgi Zamiri\n" +
                    "\n" +
                    "Ek hâlindeki tek zamirdir.\n" +
                    "Eklendiği kelimeye -ki sadece isim tamlamasında tamlayana eklenir- bitişik yazılır ve bir ismin (tamlananın) yerini tutar.\n" +
                    "Büyük ve küçük ünlü kurallarına uymaz; sadece -ki şekli vardır:" +
                    "Örnekler:\n" +
                    "\n" +
                    "senin kalemin>seninki,\n" +
                    "Ali'nin eli>Ali'ninki",
            "\"-ki\" Yapım Eki\n" +
                    "\n" +
                    "İsimlere eklenerek yer ve zaman bildiren sıfatlar türeten ektir.\n" +
                    "Zaman bildiren kelimelerin sonuna doğrudan eklenirken, yer bildiren sıfatlar türetirken",
            " Birleşik Kelimelerin Yazımı\n" +
                    "\n" +
                    "İki ya da daha fazla sözcüğün, yeni anlamda bir sözcük oluşturması için birlikte kullanılmasına \"birleşme\" denir. Birleşme sırasında sözcüklerde anlam, tür ve ses değişiklikleri olabilir:\n" +
                    "\n" +
                    "* Birleşme sırasında sözcüklerde ses aşınması ya da ses türemesi olabilir.\n" +
                    "\n" +
                    "pazar - ertesi -> Pazartesi\n" +
                    "sütlü- aş -> sütlaç",
            "Birleşme, farklı türdeki sözcüklerin farklı biçimlerde kullanılmasıyla oluşabilir:\n" +
                    "\n" +
                    "Hanımeli (belirtisiz ad tamlaması biçiminde)\n" +
                    "Atatürk (eksiz iki ad)\n" +
                    "Akciğer (sıfat tamlaması biçiminde)",
            "Birleşme sırasında sözcükler anlamlarını yitirebilir:\n" +
                    "\n" +
                    "bal arısı (iki sözcük de anlamını taşıyor)\n" +
                    "suböreği (birinci sözcük anlamını yitir\u00ADmiş)\n" +
                    "rüzgârgülü (ikinci sözcük anlamını yitir\u00ADmiş)",
            "a. Anlam kayması yoluyla kurulan bileşik sözcükler bitişik yazılır:\n" +
                    "Akbaba, suçiçeği, devetabanı ...\n" +
                    "b. Ses değişimi yoluyla oluşmuş bileşik sözcükler bitişik yazılır:\n" +
                    "Güllaç (güllü aş), Kahvaltı (kahve altı), Niçin (ne için)\n" +
                    "c. Tür değişmesi yoluyla oluşmuş bileşik sözcükler bitişik yazılır:\n" +
                    "mirasyedi, uyurgezer, sıkboğaz\n" +
                    "d. Yardımcı birleşik eylemler, bileşme sırasında ses değişikliği olmuşsa bitişik; ses değişikliği olmamışsa ayrı yazılır:\n" +
                    "hal-olmak, zan-etmek, seyir-etmek, kayıp-olmak, fark-etmek, muhtaç-olmak\n" +
                    "-> hallolmak -> zannetmek -» seyretmek\n" +
                    "e. Kurallı birleşik eylemler her zaman bitişik yazılır\n" +
                    "anlayıvermek, görebilmek, uyuyakalmak, düşeyazmak\n" +
                    "Anlamca kaynaşmış birleşik fiiller bitişik yazılır:\n" +
                    "vazgeçmek, başvurmak, hoşgörmek",
            "İkilemelerin Yazımı\n" +
                    "\n" +
                    "İkilemeler genellikle ayrı yazılır. Araya hiçbir noktalama işareti de konmaz.\n" +
                    "\n" +
                    "adım adım, ağır ağır, akın akın, allak bullak, aval aval (bakmak), cır cır (ötmek), çeşit çeşit, derin derin, gide gide, güzel güzel, karış karış, kös kös (dinlemek), kucak kucak, şıp şıp (damlamak), şıpır şıpır, tak tak (vurmak), takım takım, tıkır tıkır, yavaş yavaş.",
            "m ile yapılmış ikilemeler de ayrı yazılır:\n" +
                    "\n" +
                    "at mat, çocuk mocuk, dolap molap, kapı mapı, kitap mitap.",
            "İsim durum ekleri ve iyelik ekiyle yapılan ikilemeler de ayrı yazılır:\n" +
                    "\n" +
                    "baş başa, diz dize, el ele, göz göze, iç içe, omuz omuza, yan yana; baştan başa, daldan dala, elden ele, günden güne, içten içe, yıldan yıla; başa baş, bire bir (ölçü), dişe diş, göze göz, teke tek; ardı ardına, boşu boşuna, günü gününe, peşi peşine, ucu ucuna.\n" +
                    "Bitişik yazılan ikilemeler de vardır:\n" +
                    "cırcır (böceği), cızbız, civciv, çıtçıt, dırdır, fırfır, fısfıs, hımhım, hoşbeş, şıpşıp (terlik), yüzgöz (olmak)...\n" +
                    "darmadağınık, darmaduman, karmakarışık.",
            "Sayıların Yazımı\n" +
                    "\n" +
                    "Sayılar rakamla yazılabildikleri gibi harfle de yazılabilir.\n" +
                    "\n" +
                    "]Küçük sayılar, yüz ile bin sayıları ve daha çok edebî karakter taşıyan metinlerde geçen sayılar harfle gösterilir.\n" +
                    "\n" +
                    "İki hafta sonra, haftanın beşinci günü, üç ayda bir, dört kardeş, üçüncü sınıf, yüz yıllık tarih, bin yıldan beri...\n" +
                    "Yaş otuz beş, yolun yarısı eder.",
            "]Buna karşılık saat, para tutarı, ölçü, istatistik verilere ilişkin sayılar ile büyük sayılarda rakam kullanılır.\n" +
                    "\n" +
                    "Öğleden sonra saat 17.30'da, 1.500.000 lira, 25 kilometre, 150 kg, 15 metre kumaş, 60.000.000.000 insan...",
            "Saat ve dakikaların metin içinde harfle yazılması da mümkündür.\n" +
                    "\n" +
                    "Saat dokuzda, dokuzu beş geçe, yediye çeyrek kala, sekizi on dakika üç saniye geçe, meselâ saat onda...",
            "Sayılar daha çok Arap rakamlarıyla gösterilir:\n" +
                    "\n" +
                    "25, 150, 15.000...\n" +
                    "Romen rakamları, yüzyıllarda, hükümdar adlarında, kitap ve dergi ciltlerinde ve kitapların asıl bölümlerinden önceki sayfaların numaralandırılmasında kullanılır. Bu tür örneklerde Arap rakamlarının (harflerinin değil) kullanılması da mümkündür. Hükümdar adlarında kullanılan rakamlar hükümdarın adından önce gelir.\n" +
                    "\n" +
                    "XX. yüzyıl, III. Selim, XIV. Louis, V. Karl, I. Cilt...",
            "Rakamlardan sonra getirilen ekler kesme işareti (') ile ayrılır:\n" +
                    "\n" +
                    "Saat 10.30'da, 1972'de, 2000'den, 12'nci...\n" +
                    "] Sıra sayıları harfle de gösterilebilir, rakamla da:\n" +
                    "\n" +
                    "beşinci, yirmi ikinci...\n" +
                    "Rakamlardan sonra, sıra belirtmek üzere nokta da kullanılabilir, \"-ncİ\" eki de:\n" +
                    "\n" +
                    "16., 20., XXI.,  16'ncı, 121'inci, 110'uncu...\n" +
                    "] Üleştirme sayıları harfle gösterilir:\n" +
                    "\n" +
                    "ikişer, yedişer, dokuzar, üçer üçer, onar onar, ellişer bin lira, yüz yirmi yedişer milyon...",
            "Beş ve beşten çok rakamlı sayılar sondan sayılmak üzere üçlü gruplara ayrılarak yazılır. Gruplar arasına nokta da konabilir:\n" +
                    "\n" +
                    "22 605, 111 548 600,\n" +
                    "22.605, 111.548.600\n" +
                    "]Sayılarda kesirler virgülle ayrılır:\n" +
                    "\n" +
                    "15,2     5,26\n" +
                    "]Harflerle yazılan birden fazla sayının her biri ayrı yazılır.\n" +
                    "\n" +
                    "Yüz yirmi beş milyon, on altı, yedi yüz iki,",
            "Tarihlerin Yazımı\n" +
                    "\n" +
                    "a. Tarihler zaman birimi olarak en kısadan en uzuna doğru sıralanır: gg.aa.yyyy:\n" +
                    "30 Haziran 2016\n" +
                    "30.06.2016\n" +
                    "30/06/2016\n" +
                    "b. Gün, ay, yıl rakamlarının arasına nokta ya da eğik çizgi konur:\n" +
                    "11.12.2015 = 11/12/2015\n" +
                    "c. Tarihlerde aylar harfle de rakamla da yazılabilir. Ayların adı harfle yazılırsa gün, ay ve yıl arasına işaret konmaz:\n" +
                    "2 Eylül 2000 = 02.09.2000",
            "Pekiştirmeli Kelimelerin Yazımı\n" +
                    "\n" +
                    "Pekiştirme sıfatları ve zarfları bitişik yazılır:\n" +
                    "dümdüz, sapsarı, mosmor, kapkara, apaçık, tertemiz, çepeçevre, sapasağlam, darmadağınık, yapayalnız, çırılçıplak, çepeçevre",
            "Düzeltme İşaretinin Kullanımı\n" +
                    "\n" +
                    "Düzeltme işareti Türkçe olmayan kelimelerde kullanılan bir işarettir. Bu işaret hem uzatma hem de inceltme görevinde kullanılır. İnceltme görevi sadece \"g, k, l\" ünsüzleri için; uzatma görevi de \"a, i ve u\" ünsüzleri için söz konusudur.",
            "a. İnceltme görevi\n" +
                    "\n" +
                    "\"Bazı yabancı kelimelerde -Türkçede kalın ünlülerle birlikte kullanılmayan- ince ünsüzler (g, k, l) vardır. Bu ünsüzlerin ince olduğunu, yani ince okunmaları gerektiğini kendilerinden hemen sonra gelen kalın ünlülerin (a, u) üzerine düzeltme işreti koyarak anlarız. Bu ünsüzlerin ince okunmasının gereği asıllarının öyle oluşu; amacı da yanlış anlam çıkarılmasını engellemektir:\n" +
                    "\n" +
                    "dergâh, gâvur, ordugâh, tezgâh, yadigâr, rüzgâr, yegâne\n" +
                    "bekâr, dükkân, hikâye, kâfir, kâğıt, kâr, kâtip, mekân\n" +
                    "mahkûm, mezkûr, sükûn, sükût,",
            "b. Uzatma görevi\n" +
                    "\n" +
                    "Türkçede uzun ünlü yoktur. Arapça ve farsçadan alınan ve uzun ünlü barındıran kelimelerde uzun ünlünün üstüne gerektiğinde düzeltme işareti konur.",
            "ki Şekilde Yazılabilen Kelimeler\n" +
                    "\n" +
                    "Bazı kelimelerin söylenişinde \"ğ\"nin \"v\"ye dönüştüğü görülür. Bunları iki şekilde yazılması ve okunması doğrudur.\n" +
                    "\n" +
                    "döğmek>dövmek;\n" +
                    "göğermek>gövermek;",
            "Yabancı Kelimelerde Büyük \"i\"nin Yazımı\n" +
                    "\n" +
                    "Lâtin harflerini kullanan yabancı milletlerin yazı sistemlerinde büyük \"i harfi noktasız yazılır. Ibsen, Indiana... Türkçe metinlerde de bu isimler bu şekilde yazılır. Ancak bu isimler sözlüklerde \"i\" sırasında yer alır.",
            "Ses Değişikliği Görülen Bazı Kelimelerin Yazımı\n" +
                    "\n" +
                    "\"Ünlü daralması görülen Türkçe kelimeler:\n" +
                    "\n" +
                    "söyle-yor>söylüyor,\n" +
                    "anla-yor>anlıyor,\n" +
                    "yaşa-yor>yaşıyor,\n" +
                    "de-yor>diyor\n" +
                    "de-e>diye",
            "Birden çok heceli olan kelimelerde de sadece söyleyişte daralma vardır,\n" +
                    "\n" +
                    "atlayarak (>atlıyarak),\n" +
                    "başlayan (>başlıyan),",
            "Ünlü düşmesi olan kelimeler:\n" +
                    "\n" +
                    "ağız>ağzı,\n" +
                    "burun>burnu,\n" +
                    "koyun (bağır, döş)>koynuna,\n" +
                    "alın>alnı,\n" +
                    "oğul>oğlu,\n" +
                    "gönül>gönlüm,\n" +
                    "beniz,>benzi,\n" +
                    "ömür>ömrüm,\n" +
                    "cürüm>cürmü,\n" +
                    "hüküm>hükmü,\n" +
                    "fikir>fikri...\n" +
                    "ileri-le-mek>ilerlemek,\n" +
                    "koku-la-mak>koklamak,",
            "gönülden gönüle, ağıza, buruna, babadan oğula örneklerindeki gibi ekte geniş ünlü varsa hece düşmesi olmayabilir.\n" +
                    "\n" +
                    "oyunu, koyunu vb. hece düşmesi olmayan kelimelerdir.\n" +
                    "Özel isimlerde -hâliyle- hece düşmesi olmaz:\n" +
                    "\n" +
                    "Gönül'e, Ömür'ü...",
            "Ünsüz türemesi görülen kelimeler:\n" +
                    "\n" +
                    "aff > af >affetmek, affı\n" +
                    "hiss > his > hissetmek, hissi\n" +
                    "zann > zan > zannetmek, zannı\n" +
                    "redd > ret > reddetmek, reddi\n" +
                    "şıkk > şık > şıkkı,\n" +
                    "zemm > zem >zemmetmek,\n" +
                    "hall > hal > halli, halletmek...\n" +
                    "fiat>fiyat,",
            "Bu kelimelere benzeyip de ünsüz türemesi görülmeyen kelimeler:\n" +
                    "\n" +
                    "Duayen, fail, faiz, fuar, fuaye, kuaför, lâik, puan, suare...\n" +
                    "\" Ünsüz düşmesi görülen kelimeler:\n" +
                    "\n" +
                    "Türkçede ikiz ünsüz bulunmaz. Bu yüzden Arapçadan dilimize geçmiş olan ve sonunda ikiz ünsüz bulunduran kelimeler yalın durumunda kullanıldığında ünsüzlerden biri düşer.\n" +
                    "\n" +
                    "hakk>hak,\n" +
                    "redd>ret,\n" +
                    "hiss>his,\n" +
                    "zann>zan,\n" +
                    "zemm>zem,",
            "Hem Ayrı Hem Bitişik Yazılabilen Ekler\n" +
                    "\n" +
                    "Ek-fiilin çekimleri olan \"iken, ile, ise\" kelimeleri kendinden önceki kelimeden ayrı yazılır. Ama bunların bitişik yazılış şekilleri de vardır: -ken, -le, -se. Bitişik yazılırken araya kaynaştırma harfi de girebilir.\n" +
                    "\n" +
                    "Ama bu eklerden sadece \"-ken\", hiçbir zaman ünlü uyumlarına uymaz; her kelimeden sonra \"iken\" ya da \"-ken\" olarak yazılır.\n" +
                    "\n" +
                    "Alır iken>alırken,\n" +
                    "okulda iken>okuldayken,\n" +
                    "gelenler ile>gelenlerle,\n" +
                    "Ali ile>Ali'yle,",
            "Ünlü Uyumlarına Aykırı Olan Eklerin Yazımı\n" +
                    "-yor (şimdiki zaman eki): Sadece -yor şeklinde yazılır, ünlü uyumlarına aykırıdır.\n" +
                    "geliyor, biliyor, istiyor, gizliyor...\n" +
                    "-ken (zarf-fiil eki): Ünlü uyumlarına aykırıdır. Sadece -ken şeklinde yazılır.\n" +
                    "alırken, koşarken, bakarken...\n" +
                    "-leyin (isimden zarf yapan ek): Ünlü uyumlarına aykırıdır.\n" +
                    "sabahleyin, akşamleyin\n" +
                    "-(İ)mtırak (sıfattan sıfat yapan ek):\n" +
                    "yeşilimtırak, mavimtırak, ekşimtırak...\n" +
                    "-ki (Aitlik eki, ilgi zamiri ve sıfat yapan ek): \"bugünkü, dünkü, öbürkü\" kelimeleri hariç -ki eki ünlü uyumlarına aykırıdır; -ki şeklinde yazılır ve okunur.\n" +
                    "onunki, yukarıdaki, akşamki...\n" +
                    "-Taş (isimden isim yapan ek):\n" +
                    "meslektaş, ülküdaş...\n" +
                    "-gil (aile bildirir):\n" +
                    "halamgil, dayımgil, baklagiller...",
            "Alıntı Kelimelerde Kesme İşaretinin Kullanılması Kullanılmaması\n" +
                    "\n" +
                    "Bazı Arapça kelimeler gırtlak ünsüzü taşıdıkları, Türkçede de bu özelliği anlaşılacak şekilde telâffuz edildiği için kesme işreti barındırırlar:\n" +
                    "\n" +
                    "\"an'ane, an'anevî, bid'at, cür'et, cür'etkâr, cüz'î, iz'an, kat'î, kat'iyen, kat'iyet, kıt'a, kur'a, Kur'an, mel'un, mes'ul, mes'uliyet, mes'ut, meş'ale, sun'î, sür'at, şer'î, vak'a.",
            "Satır Sonunda Kelimelerin Bölünmesi\n" +
                    "\n" +
                    "Satır sonunda, yer kalmadığı için yarım kalan kelimelerin bölünmüş olduğunu, yani devamının altta olduğunu göstermek için satır sonunda kısa çizgi kullanılır:\n" +
                    "\n" +
                    "... O zaman gördü ki, küçük çocuk, memleketlisi, minimini yavru ağlıyor. Ses-\n" +
                    "sizce, titreye titreye ağlıyor.",
    };
    public static String NoktalamaIsaretleri[] = {
            "Nokta (.) kullanımı\n" +
                    "Saat ve dakika bildiren rakamları birbirinden ayırmak için kullanılır.\n" +
                    "Sınav 8.30’da başlayacak.\n" +
                    "\n" +
                    "2. Tarihleri belirtmek için kullanılan rakamlarda ay, gün ve yılı birbirinden ayırmak için kullanılır.\n" +
                    "\n" +
                    "29.03.1980 tarihinde doğdu.\n" +
                    "\n" +
                    "3. Birbirinden virgülle ya da çizgiyle ayrılan rakamların sonuncusuna konur.\n" +
                    "\n" +
                    "1, 3 ve 5. şıklarda hata var.\n" +
                    "\n" +
                    "19-20. yüzyıllar arasında\n" +
                    "\n" +
                    "V-VI. yüzyıllar arasında",
            "Virgül (,) kullanımı\n" +
                    "Sıralı cümleleri birbirinden ayırmak için kullanılır.\n" +
                    "Geldim, gördüm, yendim.\n" +
                    "Fakat bağlaçlarla birbirinden ayrılan cümleler arasında kullanılmadığına dikkat edilmesi gerekir.\n" +
                    "Uyandım ve hemen yüzümü yıkadım.\n" +
                    "2. Konuşma çizgisinden sonra gelen alıntılama cümlesinin sonunda kullanılır.\n" +
                    "Neden böyle davranıyorsun, diye sordu.\n" +
                    "3. Cümle içindeki ara açıklamaları ayırmak için kullanılır.\n" +
                    "Gecenin bir vakti uyandı, ki normalde derin uyur, mutfakta bir şeyler atıştırdı.",
            "Noktalı virgül (;) kullanımı\n" +
                    "Ögeleri arasında virgül bulunan sıralı cümleleri birbirinden ayırmak için kullanılır.\n" +
                    "\n" +
                    "Gezmek, seyahat etmek istiyordu; para, zaman ve vize işlerini halletmesi gerekiyordu.",
            "İki nokta (:) kullanımı\n" +
                    "Kendisinden sonra açıklama yapılacak ya da örnek verilecek cümlenin sonunda kullanılır.\n" +
                    "\n" +
                    "Toplu taşıma araçlarından bazılarını çok konforlu buluyorum: metro, tramvay…\n" +
                    "\n" +
                    "Kendimi tanıtmak isterim: Ben Yahya Usta.",
            "Soru işareti (?) kullanımı\n" +
                    "Soru ifadesi taşıyan cümlelerin sonuna konur. Eğer soru ifadesi taşıyan birden fazla cümle birbirine virgülle bağlanmışsa, soru işareti en son cümleye gelir.\n" +
                    "\n" +
                    "Bahar mı geldi, kuşlar neden bu kadar neşeli?",
            "Üç nokta (…) kullanımı\n" +
                    "Benzer örneklerin devamının olduğunu ifade etmek için kullanılır.\n" +
                    "\n" +
                    "Datça, Bodrum, Çeşme… Ege Bölgesi’nde yaz tatili yapılacak yerlerdir.",
            "Ünlem işareti (!) kullanımı\n" +
                    "Seslenme ve hitap sözlerinden hemen sonra ya da cümlenin sonuna getirilebilir.\n" +
                    "\n" +
                    "Çocuklar! Yavaş adımlarla ilerleyebilirsiniz.\n" +
                    "\n" +
                    "Çocuklar, yavaş adımlarla ilerleyebilirsiniz! ",
    };
    public static String fiilimsi[] = {"Fiilimsiler, fiillerden (eylemlerden) türeyen sözcükler olmalarına karşın fiillerin aldığı fiil “çekim eklerini” yani şahıs ekleri, haber ve dilek kiplerini alamayan, yalnızca fiillere gelen olumsuzluk eki olan “ma, me, maz, mez” eklerini alabilen sözcüklerdir. Eylemsiler anlam olarak fiillerin anlamlarını taşırlar; ancak kip olarak fiilin anlamını taşımazlar.",
            "Fiilimsiler, fiillere getirilen “fiilimsi ekleri” ile ortaya çıkarlar. Yani fiiller bazı ekler sayesinde fiilimsi olurlar. Bu ekler fiilden isim yapma ekleri olarak da bilinir ki bunlar eklendiği fiili isim soylu sözcük yaparak o sözcüğün cümlede “isim, sıfat ve zarf” görevinde kullanılmasını sağlarlar. (Fiilimsiler fiilden isim yapma eki aldıkları için türemiş bir sözcük olarak kabul edilirler.)",
            "Cümle içinde isim, sıfat zarf görevinde kullanılırlar dedik. Peki bir fiil nasıl olur da cümle içinde  isim, sıfat ve zarf görevlerinden birini üstlenebilir? Fiilimsiler; isim fiil, sıfat fiil ve zarf fiil olarak üç’e ayrılırlar her birinin kendine özel fiilimsi ekleri vardır. Bunlar;\n" +
                    "\n" +
                    "İsim Fiil Ekleri :  -ma, -ış, -mak\n" +
                    "\n" +
                    "Sıfat Fiil Ekleri :  -an, -ası, -mez, -ar, -dik, -ecek, -miş\n" +
                    "\n" +
                    "Zarf Fiil Ekleri : -ken, -alı, -madan, -ince, -ip, -arak, -dıkça, -e….-e, -r…..-maz, -casına, -meksizin, -dığında\n" +
                    "\n" +
                    "İşte bu ekler sayesinde fiilimsiler “isim, sıfat ve zarf” görevinde kullanılırlar. Bir cümlede fiile gelen isim fiil eki o sözcüğü cümlede isim, sıfat fiil eki sıfat, zarf fiil eki zarf yapar. Bu bilgi çok önemlidir.",
            "*Fiilimsiler, fiil değil; ancak fiile benzer sözcüklerdir. *Fiil gibi çekimlenemez; ancak olumsuzları yapılabilir. *İsim fiil, sıfat fiil ve zarf fiil olmak üzere üçe ayrılır. *Bunların her biri için ayrı ayrı fiilimsi ekleri vardır. *Bu ekler mutlaka fiil kök veya gövdelerine gelmek zorundadır. *Eklendikleri fiilleri cümlede “isim, sıfat, zarf” yaparlar. *Fiilimsiler cümlede doğrudan yüklem olmazlar, ek eylem alarak yüklem olurlar.",
    };
    public static String fiildecatı[] = {
            "Çatı konusunda öncelikle bilinmesi gereken çatının fiil olan cümlelerde aranabildiğidir. Adı üzerinde Fiilde Çatı fiil soylu cümlelere ait bir özelliktir. İsim soylu cümlelerde çatı aranmaz.\n" +
                    "\n" +
                    "Örnek: Çarşıdan aldığım kırmız bir kazaktı.\n" +
                    "\n" +
                    "Bu cümlede yargı bildiren sözcük yani yüklem ‘kazaktı’ sözcüğüdür. Kazaktı sözcüğü isim soylu bir sözcüktür.",
            "sim soylu sözcükler ek-fiil eklerinden birini ve kişi eki alarak çekimlenirler ve cümlenin yüklemi olurlar. Bu nedenle bu cümlede çatı aranmaz.\n" +
                    "\n" +
                    "Örnek: İçimizi acıtan ince bir sızıydın.\n" +
                    "\n" +
                    "Bu cümlede ise yüklemimiz “sızıydın” sözcüğüdür. Yine isim soylu bir sözcük ek-fiil ve kişi eki alarak çekimlenmiş ve cümlenin yüklemi olmuştur. Bu cümlede de çatı aranmaz.",
            "Cümleler yüklemlerinin yapısına göre fiil cümlesi ve isim cümlesi olmak üzere ikiye ayrılırlar. Yüklemi isim olan cümlelere isim cümlesi; yüklemi fiil olan cümlelere ise fiil cümlesi denir. Bir baka deyişle çatı aranan cümleler iş, oluş ve durum bildiren yani kökü veya gövdesi fiil olan ve kip ve kişi eki alarak çekimlenen fiillerdir.",
            "Etken Çatılı Fiiller\n" +
                    "\n" +
                    "Etken çatılı fiiller yüklemde bahsedilen iş, oluş ve durumu gerçekleştiren ögenin yani öznenin bulunduğu cümlelerdir.\n" +
                    "\n" +
                    "Etken çatılı fiillerde ya gizli özne ya da açık özne bulunur.\n" +
                    "\n" +
                    "Not: Sözde özne veya örtülü öznenin bulunduğu cümleler etken çatılı değillerdir",
            "“Düşmanlar üzerimize sağlam İngiliz kunduralarıyla yürüyorlar.”\n" +
                    "\n" +
                    "Yukarıdaki örnekte yüklemimiz “yürüyorlar” sözcüğüdür. Açık özneyi bulmak için bu cümleye “Yürüme işini yapan kim?” sorusunu sorarız ve cevap olarak “Düşmanlar” cevabını alırız. Bu bizim açık öznemiz olur. Dolayısıyla bu cümle etken çatılı bir cümledir.",
            "Yüklemde bildirilen yargıyı gerçekleştiren kişinin tam olarak bilinmediği cümlelerdir\n" +
                    "\n" +
                    "Edilgen Çatılı fiillerin örtülü öznesi ya da sözde öznesi bulunur.\n" +
                    "\n" +
                    "Edilgen Çatılı fiillerin y getirdiği kahveler bir yüklemleri -l, -n eklerinden birini alır.",
            "Örnek: Kahvecinin getirdiği kahveler bir yudumda içildi.\n" +
                    "\n" +
                    "Sözde Özne                         yüklem\n" +
                    "\n" +
                    "Yukarıdaki örnekte yüklemimiz “içildi” sözcüğüne kim tarafından sorusunu sorduğumuzda cevap alamıyoruz. Bu cümlede işi yapan belli değildir ancak işten etkilenen varlık bulunmaktadır. Buna sözde özne diyoruz.",
            "Dönüşlü fiiller konusuna geldiğimizde dönüşlülük ve edilgenliğin karıştırıldığını görüyoruz. Öznesi hem işi yapan hem de bu işten etkilenen fiillere “dönüşlü çatılı fiiller” demekteyiz. Burada kullanılan ekler “-l ve -n” ekleridir.\n" +
                    "\n" +
                    "Örnek: Banyodan çıkıp kurulandı. (Kurulanan kim? O, kurulanmadan etkilenen kim? O)",
            "İşteş Çatı\n" +
                    "\n" +
                    "Eğer eylem birden fazla özne tarafından yapılıyorsa buna işteş fiiller denir. İşteşlik yapan ek “-ş” ‘dir.\n" +
                    "\n" +
                    "Örnek: Kuşlar havadauçuştu. (Birliktelik)",
    };
    public static String ekfiiller[] = {
            "Ek-fiil (ek-eylem, imek fiili, cevher fiil), Türkçede isimlerin ve isim soylu kelimelerin sonuna gelerek onların yüklem olarak kullanılmalarını sağlayan, ayrıca basit zamanlı fiillerden birleşik zamanlı fiil yapan çekim ekleridir.",
            "Bu tanımdan hareketle, ek-fiillerin iki görevi vardır:\n" +
                    "\n" +
                    "1. İsim veya isim soylu kelimelerin sonuna gelerek, onları yüklem yapmak,\n" +
                    "2. Basit zamanlı fiilleri, birleşik zamanlı yapmak.\n" +
                    "\n" +
                    "Ek-fiiler “-idi”, “-imiş-, “-ise” ve “-dir“dir ancak sözcüklere bitişik olarak yazıldıklarında ses uyumlarına uyarak değişiklik gösterebilirler.",
            "Ek fiiller Türkçede iki görevde kullanılırlar:\n" +
                    "\n" +
                    "İsimleri ve isim soylu sözcükleri yüklem yapmak,\n" +
                    "Basit çekimli fiillere eklenerek birleşik zamanlı fiil yapmak (-dir hariç).",
            " Ek- Fiilin Dört kipe göre çekimi vardır:\n" +
                    "\n" +
                    "1) Ek-Fiilin Geniş zamanı (-ım/-im/-um/-üm; -dır/-dir/-dur/-dür)\n" +
                    "\n" +
                    "2) -di’li (görülen, bilinen) geçmiş zaman (-dı/-di/-du/-dü; -tı/-ti/-tu/-tü)\n" +
                    "\n" +
                    "3) -miş’li (duyulan, anlatılan, öğrenilen) geçmiş zaman (-mış/-miş/-muş/-müş)\n" +
                    "\n" +
                    "4) Şart kipi (-sa/-se)",
    };
    public static String fiiller[] = {
            "Varlıkların bir zaman ve mekan kapsamı dahilinde bulundukları her türlü hareket, durum, oluş ve kılışları bildiren sözcüklere fiil denir. Örneğin “başla-, otur-, tut-, bak-, fırlat-” gibi sözcükler bir eylem yani bir hareket ifade ederler. Bu nedenle bu tarzdaki sözcüklere fiil denilmektedir.",
            "Bir kelimenin fiil olup olmadığı nasıl anlaşılır?\n" +
                    "\n" +
                    "Fiilleri ayırt etmek için şu hususlara dikkat etmeniz gerekmektedir.\n" +
                    "\n" +
                    "⇒ Bir sözcüğün fiil olabilmesi için mutlaka “-mek, -mak” mastar ekini alabilmeleri gerekmektedir. Mastar eklerini üstlerine alabilen sözcükler eylem olarak tanımlanabilir.\n" +
                    "\n" +
                    "Örneğin; “Gel” sözcüğü “-mek” mastar ekini alabilir: Gel(mek)\n" +
                    "Ancak “Araba” sözcüğü “-mak” mastar ekini alamayacağından eylem olarak tanımlanamaz: Araba(mak)\n" +
                    "\n" +
                    "Git- / Git+mek\n" +
                    "Kal- / Kal+mak\n" +
                    "İzle- / İzle+mek\n" +
                    "Kapat- / Kapat+mak",
            "Bir hareketi anlatan fiillerdir. Bu hareketi (işi) yapan bir özne ve bu işten etkilenen nesne vardır\n" +
                    "\n" +
                    "\uD83D\uDC49 “Neyi, kimi” sorularına cevap verirler.\n" +
                    "\n" +
                    "\uD83D\uDC49 Fiilin önüne “Onu” sözcüğünü getirdiğimizde anlamlı olur.\n" +
                    "\n" +
                    "Şampiyonluk maçını tekrar seyretti.",
            "Durum Fiilleri:\n" +
                    "\n" +
                    "Fiilde belirtilen hareketin bir özne tarafından herhangi bir nesneyi etkilemeden yapılmasına “Durum fiili” denir. Yani nesneye ihtiyaç duymayan fiillerdir.\n" +
                    "\n" +
                    "\uD83D\uDC49 Nesne alamadıklarından geçişsizdir.\n" +
                    "\n" +
                    "\uD83D\uDC49 “Neyi, kimi” sorularına cevap vermez.\n" +
                    "\n" +
                    "\uD83D\uDC49 Fiilin önüne “Onu” sözcüğü gelmez.\n" +
                    "\n" +
                    "Onu görünce hiç durmadan ağladı.",
            "Oluş Fiilleri:\n" +
                    "\n" +
                    "Zaman içinde bir varlıkta kendiliğinden gerçekleşen değişikliği ifade eden fiillerdir.\n" +
                    "\n" +
                    "\uD83D\uDC49 Nesne alamadıklarından geçişsizdir.\n" +
                    "\n" +
                    "\uD83D\uDC49 “Neyi, kimi” sorularına cevap vermez.\n" +
                    "\n" +
                    "\uD83D\uDC49 Fiilin önüne “Onu” sözcüğü gelmez.\n" +
                    "\n" +
                    "Masada unuttuğumuz ekmekler bayatladı.",
            "Basit Fiiller\n" +
                    "\n" +
                    "Yalın halde bulunan yani herhangi bir yapım eki almamış eylemlere “Basit fiil” denir. Yapım eklerini almadıkları için bu fiiller kök halindedir diyebiliriz.\n" +
                    "\n" +
                    "Örnek:\n" +
                    "\n" +
                    "Geçen yıl yurt dışına gitmişlerdi.",
            "İsimden Türemiş Fiiller:\n" +
                    "\n" +
                    "İsim ya da isim soylu sözcüklere getirilen eklerle fiil türetilebilir.\n" +
                    "\n" +
                    "Yabancı + laş + mak\n" +
                    "Göz + le + mek",
            "Fiilden Türemiş Fiiller:\n" +
                    "\n" +
                    "Fiil kök ve gövdelerine getirilen yapım ekleriyle yeni fiiller türetilebilir.\n" +
                    "\n" +
                    "Gör + ün + mek\n" +
                    "Boğ + uş + mak",
            "Yardımcı Fiillerle Yapılan Birleşik Fiiller: Bir isime getirilen başta “et-, ol-” olmak üzere “bul-, buyur-, eyle-, kıl-, yap-, ver-” gibi yardımcı fiillerler yapılan birleşik fiiller\n" +
                    "Yardım et(mek)\n" +
                    "Pişman ol(mak)\n" +
                    "Namaz kıl(mak)",
            "nlamca Kaynaşmış Birleşik Fiiller: Bir isim ya da isim soylu sözcüğün bir fiil ile kalıplaşmasıyla ortaya çıkan fiillerdir.\n" +
                    "Göz koy(mak)\n" +
                    "Öngör(mek)\n" +
                    "Başvur(mak)\n" +
                    "Gözden düş(mek)\n" +
                    "Kanat ger(mek)",
            "Kurallı Birleşik Fiiller: Bu tipteki birleşik fiiller iki eylemin birleşmesinden ve kalıplaşmasından ortaya çıkan “yeterlik, tezlik, yaklaşma, sürerlik” anlamı katan fiillerdir.\n" +
                    "\n" +
                    "Yeterlilik Fiiller: Fiil + bilmek şeklinde kalıplaşır.\n" +
                    "Geçebilmek\n" +
                    "Açabilmek\n" +
                    "\n" +
                    "Tezlik Fiilleri: Fiil + evermek şeklinde kalıplaşır.\n" +
                    "Bırakırver+mek\n" +
                    "Kımıldayıver+mek\n" +
                    "\n" +
                    "Süreklilik Fiilleri: Fiil + edurmak, -ekalmak, -egelmek şeklinde kalıplaşır.\n" +
                    "Başlayadur+mak\n" +
                    "Bakakal+mak\n" +
                    "\n" +
                    "Yaklaşma Fiilleri: Fiil + -eyaz şeklinde kalıplaşır.\n" +
                    "Düşeyaz+mak\n" +
                    "Bayılayaz+mak",
            "Haber Kipleri\n" +
                    "\n" +
                    "Fiillere bir zaman anlamı katan kiplerdir. Haber kipleri, fiillere beş farklı zaman anlamı katmaktadır:\n" +
                    "\n" +
                    "a) Duyulan Geçmiş Zaman: “-mış, -miş, -muş, müş”\n" +
                    "Gelmiş\n" +
                    "Gülmüş\n" +
                    "\n" +
                    "b) Görülen Geçmiş Zaman: “-dı, -di, -du, -dü, -tı, -ti, -tu, -tü”\n" +
                    "Geldi\n" +
                    "Güldü\n" +
                    "\n" +
                    "c) Şimdiki Zaman: “-yor”\n" +
                    "Geliyor\n" +
                    "Gülüyor\n" +
                    "\n" +
                    "d) Gelecek Zaman: “-ecek, -acak”\n" +
                    "Gelecek\n" +
                    "Gülecek\n" +
                    "\n" +
                    "e) Geniş Zaman: (ı,i,u,ü)r, -ar, -er\n" +
                    "Gelir\n" +
                    "Güler",
            "Dilek Kipleri\n" +
                    "\n" +
                    "Geldikleri fiillere  istek, şart, emir ve gereklilik anlamları katan fiillerdir.\n" +
                    "\n" +
                    "a) İstek Kipi: “-a, -e”\n" +
                    "Geleyim\n" +
                    "Güleyim\n" +
                    "\n" +
                    "b) Dilek-Şart Kipi: “-se, -sa”\n" +
                    "Gelsem\n" +
                    "Gülsem\n" +
                    "\n" +
                    "c) Gereklilik Kipi: “-meli, -malı”\n" +
                    "Gelmeli\n" +
                    "Gülmeli\n" +
                    "\n" +
                    "d) Emir Kipi: Eylemlere yapılacak hareketin emredici bir şekilde kesin olarak yapılmasını ifade eden eklere “Emir kipi” denir.\n" +
                    "Gel / Gelsin / Gelin / Gelsinler",
    };
    public static String edatbaglac[] = {
            "datlar tek başına anlamı olmayan ve kendisinden önce gelen kelimeler ile ilgi kurarak cümle bütünü içerisinde bir anlam kazanan kelimelerdir. Türkçe'de edat olan kelimeler; gibi, kadar, dolayı, ile, ötürü, dolayı, sanki, üzere, a karşı vb.",
            "Edatların Özellikleri\n" +
                    "\n" +
                    "Tek başlarına kullanılmazlar.\n" +
                    "Genellikle kendinden önceki sözcük ile ilgi kurar.\n" +
                    "Cümle içerisinde sözcükler arasında benzerlik, nedensellik, yön vb. şekilde anlam ilgileri kurar.\n" +
                    "Başka kelimelerle birleşerek zarf veya sıfat görevi görebilirler.",
            "Bağlaçlar sözcük ve sözcük gruplarını anlamca birbirine bağlayan sözcüklerdir. Bağlaçlar da edatlar gibi tek başlarına bir anlam ifade etmezler.",
            "Bağlaçların Özellikleri\n" +
                    "\n" +
                    "Tek başlarına kullanılamazlar.\n" +
                    "Cümle içerisinde bir anlam kazanırlar.\n" +
                    "Bağlaçlar cümleden çıkarıldığında anlam bozulmaz. Eğer anlam bozulursa bu \"de\" ve \"da\" ektir.\n" +
                    "İle bağlacı hariç tüm bağlaçlar önceki ve sonraki cümleden ayrı yazılır.\n" +
                    "Bazı bağlaçların yerine noktalama işaretleri de kullanılabilmektedir.",
            "Ünlem, içerisinde seslenme, hitap ve uyarı bildiren cümle ve kelimelerden sonra kullanılır. Üzüntü, sevinç, acı, korku, hayret, heyecan, nefret, coşku vb. duyguların olduğu kelime ve cümlelerde de ünlem kullanılır.",
            "Ünlemin Özellikleri\n" +
                    "\n" +
                    "Ünlem işareti, ünlem ifade eden kelimeden sonra kullanılabileceği gibi cümle sonunda da kullanılabilmektedir.\n" +
                    "Ünlem, parantez içerisinde de kullanılabilir. Parantez içerisinde (!) kullanılan ünlem, alay eme, küçümseme, kinaye gibi anlamlar ifade eder.",
            "Edat\n" +
                    "Tek başlarına kullanılan edatlar: üzere, diye, denli, için, gibi, kadar, sadece, değil, mi\n" +
                    "\n" +
                    "\"e\" hal ekiyle kullanılan edatlar: e doğru, e karşı, e kadar, e rağmen, e dek, e değin, e dair, e karşın, e göre\n" +
                    "\n" +
                    "\"den\" hal ekiyle kullanılan edatlar: den beri, den dolayı, den önce, den sonra, den itibaren, den başka, den evvel, den ötürü, den yana",
            "Bağlaç\n" +
                    "\"da/de\" bağlacı\n" +
                    "\n" +
                    "\"ki\" bağlacı",
            "Edat ve Bağlaçlarda Dikkat Edilmesi Gerekenler\n" +
                    "Edat olarak kullanılan sözcükler cümle içerisinde sıfat, isim gibi farklı görevlerde kullanılabilir.\n" +
                    "Yalnız, ancak, tek ve bir sözcükleri \"sadece\" anlamında kullanılırsa edat olur.\n" +
                    "\"İle\" edat ve bağlacı karıştırılmamalıdır. Eğer cümle içerisinde \"ile\" yerine ve getirilebilirse bağlaçi getirilemezse edat olur.\n" +
                    "Bağlaçlardan önce ve sonra noktalama işareti kullanılmaz.\n" +
                    "Bağlaç olan de/da her zaman ayrı yazılır. Birleşik yazılan de ve da edattır.\n" +
                    "Bağlaç olan de ve da hiçbir zaman te ve ta şeklinde yazılmaz.\n" +
                    "Bağlaç olan de ve da kesme işareti ile ayrılmaz.",
            "Edat Bağlaç ve Ünlem Örnekleri\n" +
                    "Teyze ile halası geldi. (Bağlaç)\n" +
                    "Annem, babam ile birlikte geldi. (Edat)\n" +
                    "Bahçeye kiraz ve vişne ağacı ektiler.( Edat)\n" +
                    "Eyvah! Yangın çıktı. /Eyvah, yangın çıktı!\n" +
                    "Seni de aramızda görmekten mutluyuz. (Bağlaç)\n" +
                    "Elbisen bende kalabilir mi? (Ek)\n" +
                    "Senin gibi olmak en büyük hayaliydi. (Edat)",
    };
    public static String IslamiyetOncesi[] = {
            "Orta Asya’nın Tarih Öncesi Devirlere ait ilk kültür merkezleri; Anav, Kelteminar, Afanasyeva, Andronova, Karasuk ve Tagar’dır.",
            " Türk kelimesinin devlet adıyla tarihte ilk kez kullanılması 6. asrın içerisinde başlamıştır (Göktürkler). Coğrafi bir ad olarak Türkiye – Türkia şeklinde ilk defa Bizans kaynaklarında Orta Asya için kullanılmıştır.",
            "Tarihteki ilk atlı göçebe Türk topluluğu İskitler (Sakalar)’dır.",
            "Tarihte Türkler tarafından kurulduğu bilinen ilk devlet Büyük (Asya) Hun Devleti’dir.",
            "Asya Hunları’nın bilinen ilk hükümdarları Teoman’dır (Çin Seddi Teoman Dönemi’nde yapılmıştır.)",
            "Tarihte ilk defa Türkleri tek bayrak altında toplayan Türk Devleti, Asya Hun (Büyük Hun) Devleti’dir (Orta Asya’da ilk siyasi birlik sağlandı).",
            "Çin’le yapılan M.Ö. 318 tarihli antlaşma Asya Hun Devleti hakkındaki ilk antlaşmadır (Türkler hakkındaki ilk belge).",
            "Mete Han Dönemi Asya Hunları’nın en parlak dönemidir (M.Ö. 209-74).",
            "Mete Han orduda “onluk sistemi” ve yönetimde “veraset sistemi”ni getirmiştir (ilk kez).",
            "Asya Hunları’nın kolu olan Kuzey Hunları ilk kez Avrupa’ya göç ederek Kavimler göçü’nü başlatmıştır (375).",
            "Anadolu’ya ilk Türk akınları Avrupa (Batı Hun) Hunları tarafından yapılmıştır. İkinci akın Sibirler tarafından yapılmıştır.",
            "Avrupa’da kurulan ilk Türk Devleti Avrupa Hunları’dır (Kuzey Hunları).",
            "Avrupa Hunları en parlak dönemlerini Atilla Dönemi’nde yaşamışlardır (434 -453).",
            "Türklerle Bizanslılar arasında imzalanan ilk antlaşma Margus Barışıdır (Avrupa Hun Dönemi).",
            "İkili devlet teşkilatını ilk uygulayan devlet I. Göktürk Devleti’dir (Bumin Kağan – İstemi Yabgu).",
            "Tarihteki ilk Türk – Bizans İttifakı’nı I. Göktürk Devleti yapmıştır.",
            "Çin’e karşı bağımsızlık savaşını yapan ilk Türk Devleti II. Göktürk (Kutluk) Devleti’dir.",
            "Tarihte Türk adıyla kurulan ilk devlet I. Göktürk Devleti’dir.",
            "Göktürklerle ilgili ilk bilgiler Ergenekon Destanı’na dayanmaktadır. Bu nedenle ilk dönemlere ilişkin bilgiler net değildir.",
            "I. Göktürk Devleti’nde en parlak dönem Mukan Kağan Dönemi’dir.",
            "İlk Türk Alfabesi’ni yapanlar II. Göktürk Devleti’dir.",
            "II. Göktürk Devleti’nde en parlak dönem Bilge Kağan ve Kültigin kardeşler döneminde yaşanmıştır. Bu dönemde devlet en geniş sınırlarına ulaşmıştır.",
            "Türk tarihinin bilinen en eski Türkçe yazılı belgeleri Orhun Kitabeleri’dir. NOT: Kitabelerin konusu; Türklerin siyasi yaşantıları ve Türk hükümdarlarının halka karşı sorumluluklarıdır (Sosyal Devlet anlayışı). Kitabeler Yolluğ Tigin tarafından dikilmiştir. Danimarkalı W. Thomson tarafından okunmuştur..",
            "Türklerde ilk Posta teşkilatını kuran, II. Göktürk Devleti’dir.",
            "İlk ipek parayı basan II. Göktürk Devleti’dir.",
            "İl İtmiş Bilge Kağan, Türklerin şehir kuran ilk hükümdarıdır.",
            "İlk Türk şehri Ordu – Balık’tır.",
            "Uygurlar yerleşik hayata geçen ilk Türk topluluğudur. Yerleşik hayatın bir sonucu olarak ilk kez saraylar, tapınaklar gibi kalıcı mimari eserler bırakmışlardır.",
            "Din değiştiren ilk Türk devleti Uygurlardır (savaşçı özelliklerini kaybetmişlerdir).",
            "Uygur siyasi tarihinin ilk ve en önemli olayı 751 Talas Savaşı’dır.",
            "Kâğıt ve matbaayı kullanan (Hareketli harf sisteminin ilk örneği) ve Türkçe kitapları basan ilk Türk devleti Uygurlardır.",
            "Uygurlara ait buluntu merkezleri; Hotan, Bezelik, Kara Hoço, Turfan, Kızıl, Kuça’dır.",
            "Uygurların en önemli yazılı kaynakları “Karabalsagun Yazıtları”dır.",
            "Anadolu’da da örnekleri görülen “Orta Oyunu” Uygurlara ait bir özelliktir.",
            "Uygurlardan sonra ikinci olarak yerleşik yaşama geçen (Tam anlamıyla yerleşik hayata geçen ilk Türk topluluğu) ve hükümdarları adına para bastıran Türk topluluğu Türgişler’dir.",
            "Türgişler Emevilerle mücadele ederek İslamiyet’in doğuya (Orta Asya) yayılmasını geciktirmişlerdir (ilk kez).",
            "Cengiz Han’a bağlanan ilk Türk kavmi Kırgızlardır.",
            "İlk kez İstanbul’u kuşatan Türkler, Avarlardır (ikinci kez kuşatan Türk topluluğu Tuna Bulgarlarıdır.).",
            "Türk tarihinde en fazla etki bırakan Türk topluluğu Oğuzlardır.",
            "Museviliği benimseyen ilk ve tek Türk devleti Hazarlardır.",
            "Hazarlar İslamiyet’in Kafkaslara girmesini ve Rusya’da yayılmasını engellemişlerdir (ilk kez)",
            "İslamiyet’i benimseyen ilk Türk boyu Karluklardır.",
            "Hıristiyanlığı benimseyen ilk Türk devleti Avarlardır",
            "Macarlar, Hıristiyanlığın Katolik mezhebini benimseyen tek Türk boyudur. Dinlerindeki değişim devlet yapılarına yansımış, boylar birliğine dayalı siyasi yapıdan, krallık sistemine dayalı bir yapıya geçmişlerdir.",
            "Peçenekler, Bizans ordusu içerisinde paralı asker olarak görev yapmış; 1071 Malazgirt Savaşı’nda saf değiştirerek Selçuklu ordusu tarafına geçmiş ve savaşın Türkler tarafından kazanılmasında etkili olmuşlardır.",
            "Düzenli ve disiplinli ilk Türk ordusunun kurucusu Mete Han’dır.",
            "Türk Hâkimiyet anlayışını (ikili yönetim, veraset sistemi) ilk getiren hükümdar Mete Han’dır.",
            "Türklerin farklı kültürlerden en az etkilendikleri alan askerlik ve ordudur.",
            "Türklere ait bilinen en eski kurganlar Altaylar’da bulunan “Pazırık” ile Alma Ata yakınlarında bulunan “Esik” kurganlarıdır.",
            "Yazılı hukuku başlatan ilk Türk devleti Uygurlardır.",
            "Dünyanın en eski halısı Altaylarda Pazırık Kurganı’nda ortaya çıkarılmıştır",
            "Halı dokumacılığını ilk başlatanlar Asya Hunları’dır.",
            "Manas Destanı (Kırgızlar) en uzun Türk destanıdır.",
    };
    public static String IlkTurkIslamDevletleri[] = {
            "İslamiyeti toplu halde kabul eden ilk Türk boyu Karluklar‘dır. (751)",
            "İlk kez İslamiyeti kabul eden ve devletin resmi dini ilan eden devlet Karahanlılar‘dır. (840-1212)",
            "Orta Asya’da da ilk kez İslamiyeti kabul eden devlet yine Karahanlılar’dır.",
            "Müslüman Türkler’in kurduğu ilk Türk devleti “Tolunoğulları”dır. (868 – 905)",
            "Yöneten ve yönetilenleri Türk olan ilk Türk – İslam devleti Karahanlılar’dır. Bu nedenle Karahanlılarda, Gazneli ve Selçuklulardaki gibi Arap – İran etkisi yoktur.",
            "Türk – İslam Edebiyatı’nın ilk örneği olan, Yusuf Has Hacib’in yazdığı Kutadgu Bilig (Mutluluk Veren Bilgi) eseri ile Kaşgarlı Mahmut’un yazdığı Divan-ı Lügat-it Türk adlı eser Karahanlılar zamanında yazılmış ve Karahanlı hükümdarına sunulmuştur.",
            "Tarihte ilk defa “askeri hastane” ve “askeri posta teşkilatını” kuranlar tarihte birçok şeyin öncüsü olan Karahanlılardır.",
            "İkta sistemini ilk uygulayan devlet Karahanlılardır (Askeri ikta sistemini ilk uygulayan ise Büyük Selçuklulardır.).",
            "Türk – İslam mimarisinin de öncüsü olan Karahanlılar ilk defa kervansaraylar inşa etmişlerdir.",
            "Türk – İslam mimarisinin temelleri Karahanlılar Dönemi’nde atılmıştır.",
            "Yusuf Has Hacib tarafından yazılan Kutadgu Bilig ilk Türkçe Siyasetname’dir.",
            "Karahanlılar dönemi; İslamiyet öncesi Türk kültüründen Türk – İslam kültürüne geçişin birinci halkasıdır.",
            "Mısırda kurulan ilk Türk – İslam Devleti Tolunoğulları’dır.",
            "Mısır’da kurulan ikinci Türk – İslam devleti ise İhşitler (Akşitler)’dir.",
            "Hicaz Bölgesi’ne hâkim olan ilk Türk devleti İhşitler (Akşitler)’dir.",
            "Afganistan’da kurulmuş ilk Türk devleti Gazneliler’dir.",
            "İmparatorluk özelliği taşıyan ilk Türk – İslam Devleti Gazneliler’dir.",
            "Abbasi Halifesini Şii Büveyhoğullarına karşı koruyan ilk Türk – İslam Devleti de Gazneliler’dir (ikinci Türk devleti ise Büyük Selçuklulardır.).",
            "Gaznelilerin en ünlü hükümdarı Gazneli Mahmut’tur (998 – 1030).",
            "Tarihimizde Sultan ve Padişah ünvanını kullanan ilk Türk hükümdarı Gazneli Sultan Mahmut’tur.",
            "Büyük Selçuklularda parayı ilk kez Tuğrul Bey bastırmıştır (Altın para – Dinar, Gümüş para – Dirhem).",
            "Yerleşmek amaçlı olarak Anadolu’ya ilk Türk akınları Büyük Selçukluları tarafından yapılmıştır (ilk sefer Çağrı Bey tarafından 1015 – 1021 yıllları arasında yapılmıştır.).",
            "Büyük Selçuklular zamanında ilk defa İslam Dünyası’nın siyasi liderliği ve koruyuculuğu Türklerin eline geçmiştir.",
            "Büyük Selçukluların Bizans’a karşı kazandığı ilk büyük zafer 1048 Pasinler Savaşı ‘dır.",
            "Pasinler Savaşı ile Bizans’ın direnci kırılmış ve Türklerin Anadolu’ya olan seferleri yoğunluk kazanmıştır.",
            "Büyük Selçuklu Devleti’nin ilk başkenti Nişabur’dur.",
            "Büyük Selçuklu Devleti ile Bizans arasında yapılan 1071 Malazgirt Savaşı sonrasında Anadolu’nun kapıları Türklere açılmış, Anadolu’da “Türkiye Tarihi” başlamış ve ilk Türk Beylikleri kurulmuştur (Alparslan Dönemi).",
            " 1071 Malazgirt Savaşı’ndan sonra Anadolu’da kurulan ilk Türk Beylikleri şunlardır;\n" +
                    "\n" +
                    "Dilmaçoğulları\n" +
                    "Danişmentliler\n" +
                    "Saltuklar\n" +
                    "Mengücekler\n" +
                    "Artuklar\n" +
                    "Çaka Devleti",
            "İlk İslam minyatür okulu Bağdat’ta Büyük Selçuklular döneminde açılmıştır.",
            "Büyük Selçuklu Devleti, Melikşah Dönemi’nde en parlak dönemini yaşamış ve en geniş sınırlarına ulaşmıştır.",
            "Babür krallarından Şah Cihan , eşi Mümtaz Mahal için Hindistan’ın Agra şehrinde “Tac Mahal” adlı anıt mezarı yaptırmıştır.",
            "Moğolları durdurabilen ve dört savaşta da yenebilen tek devlet Memlükler’dir (1260 Ayn Calut, 1277 Elbistan, 1282 Humus ve 1303 Merc-i Suffar savaşları).",
            "Saltanatla yönetilmeyen tek devlet Memlükler’dir (Memlük sultanları komutanlar arasından seçimle belirlenirdi.).",
    };
    public static String AnadoluSelcuklu[] = {
            "Anadolu Selçuklu Devleti’nin kurcusu; Kutalmışoğlu Süleyman Şah’tır.",
            "I. Haçlı Seferi’nde İznik Haçlıların eline geçmiş , bunun üzerine başkent Konya’ya taşınmıştır.",
            "I. Mesut Dönemi’nde Avrupalılar tarafından Anadolu ilk defa “Türkiye” adıyla anılmaya başlamıştır.",
            "I. Mesut Dönemi’nde ilk Türkiye Selçuklu parası (bakır) bastırılmıştır.(Ekonomik bağımsızlı kazanılmıştır.). Yine bu dönemde Anadolu Selçuklu Devleti’nin bayındırlık ve kurumsallaşma faaliyetleri başlamıştır.",
            "II. Kılıçarslan Dönemi’nde Bizans ile Miryokefalon Savaşı (1176) yapılmıştır. Bizans ordusu ağır bir yenilgiye uğramış ve bu savaş sonucunda Anadolu’nun Türk yurdu olduğu kesinleşmiştir.",
            "II. Kılıçarslan Dönemi’nde, ilk defa altın ve gümüş para bastırılmıştır. (Ekonominin güçlendiğini gösterir. )",
            "I. Gıyaseddin Keyhüsrev Dönemi’nde Antalya fethedilerek ilk defa denizcilik faaliyetlerine başlandı. Böylece Anadolu Selçukluları ilk defa Akdeniz’e inmiş oldu.",
            "I. Gıyaseddin Keyhüsrev Dönemi’nde Venediklilerle ilk defa bir ticaret antlaşması imzalandı.",
            "I. İzzeddin Keykavus Dönemi’nde Sinop’un alınmasıyla birlikte Anadolu Selçuklu Devleti ilk defa Karadeniz’e ulaştı.",
            "I. Alaaddin Keykubat Dönemi’nde , Türkiye Selçuklu Devleti’ni en parlak dönemini yaşadı.",
            "Yine I. Alaaddin Keykubat Dönemi’nde, Anadolu Türk siyasi birliği büyük ölçüde sağlandı.",
            "I. Alaaddin Keykubat Dönemi’nde, Kırım’ın Suğdak limanına ilk defa bir deniz aşırı sefer düzenlendi.",
            "I. Alaaddin Keykubat Dönemi’nde, Harzemşahlar‘a karşı 1230 Yassıçemen Savaşı kazanıldı. Fakat bu savaştan bir süre sonra Harzemşahlar yıkıldı ve Anadolu Moğol istilasına açık hale geldi.",
            "II. Gıyaseddin Keyhüsrev Dönemi’nde ortaya çıkan Baba İshak (Babailer) İsyanı ise Türkiye Tarihi’nde çıkan ilk dini nitelikli isyandır.",
            "II. Gıyaseddin Keyhüsrev Dönemi’nde İlhanlı Devleti yapılan Kösedağ Savaşı sonucunda Anadolu Türk siyasi birliği bozuldu ve Anadolu’da yeniden birçok beylik kuruldu. (Kösedağ Savaşı bu yönüyle 1042 Ankara Savaşı’na benzerlik gösterir.).",
            "Karamanoğlu Mehmet Bey Dönemi’nde Türkçe resmi dil haline getirildi. Ayrıca Karamanoğulları Beyliği Anadolu’da Türkçeyi ilk defa resmi dil haline getiren beyliktir (13 Mayıs 1277).",
            "Karamanoğulları, Osmanlıları en fazla uğraştıran beyliktir.",
            "Karesioğulları Beyliği, Osmanlı’nın aldığı ilk beyliktir. Bu beylik Osmanlı donanmasının temelini oluşturmuştur.",
    };
    public static String KulturVeMedeniyet[] = {
            "DEVLET YÖNETİMİ:\n" +
                    "\n" +
                    "Türkler Müslüman olduktan sonra da devlet yönetimi  ile ilgili geleneklerine devam ettiler. Devlet hanedan ailesinin ortak malı sayılıyordu.\n" +
                    "\n" +
                    "Karahanlı Devleti kurulduğu coğrafya itibari ile Türk Devlet anlayışını aynen sürdüren bir devletti. Hükümdarlar da “kara” ünvanı  kullanılıyordu.\n" +
                    "\n" +
                    "Sultan ünvanını ilk kullanan Türk Hükümdarı Gazneli Mahmut (Sultan Mahmut) olmuştur.\n" +
                    "\n" +
                    "Devlet işleri Büyük Divan denilen yerde görüşülüp karara bağlanırdı. Divanın alt kademeleri vardı. Her alt kademede ayrı bir iş görülürdü. Ülkeler kolay yönetim için eyaletlere ayrılmıştı. Eyaletlerde melikler görev yapardı.",
            "ADALET İŞLERİ:\n" +
                    "\n" +
                    "Türk-İslam Devletlerinde hukuk, Şeri ve Örfi olmak üzere ikiye ayrılırdı. Şeri(Dini) hukuk ile ilgili davalara “kadı” bakardı. Örfi hukuk ile ilgili davalara bakan yüksek bir mahkeme vardı. Ordu içindeki anlaşmazlıklara “kadıasker”(kazasker) bakardı.",
            "ORDU:\n" +
                    "Türk Devletlerinde ordu sürekli olarak önemini korumuş bir kurumdu. Türk Devlet anlayışında ve Türk Milleti’nin kültüründe ordu kavramı her zaman için büyük önem taşımıştır.\n" +
                    "\n" +
                    "İslam öncesinde olduğu gibi, İslam sonrası da Türk Devletleri’nde ordu büyük önem taşımaya devam etti.\n" +
                    "\n" +
                    "Karahanlı Devleti’nde ordu çeşitli Türk boylarından oluşuyordu. (Karahanlı Devleti kuruluş itibari ile tamamen Türk özelliği taşıyan bir devlettir.)\n" +
                    "\n" +
                    "Gazne ordusu; köleler, düzenli birlikler, eyalet askerleri, ücretli askerler ve gönüllülerden oluşurdu. Gazne ordusunda başka uluslardan as\u00ADkerler de bulunurdu. Çoğunlukla atlı birliklerden oluşan Gazne ordusunda, filler de kullanılırdı.",
            "Büyük Selçuklu Devleti’nde Türk ordusu çok daha gelişmiş ve büyümüştür.  Büyük Selçuklu ordusu altı ayrı bölümden oluşuyordu. Bunlar :",
            "Gulaman-ı Saray: Çeşitli milletlerden toplanan kölelerin özel bir eğitimle saray için yetiştirilmesi ile oluşmuş\n" +
                    "Hassa Askerleri: Çeşitli Türk boylarından oluşan atlı askeri birliklerdir.\n" +
                    "Melik ve Vali askerleri: Melikler ve valilerde savaş zamanı emrindeki askerlerle Sultan’ın ordusuna katılırdı.\n" +
                    "Bağlı Devlet ve Beyliklerin Askerleri: Büyük Selçuklu Devleti’ne bağlı devlet ve beylikler de savaşa zamanı Büyük Selçuklu Devleti’ne asker verirlerdi.( Ermeni ve Gürcü krallıkları gibi)\n" +
                    "Türkmenler: Göçebe olarak yaşayan Türkmenler savaş ortamına her an hazır bulunurlar ve gönüllü olarak Sultan’ın ordusuna katılırlardı.\n" +
                    "Sipahiler: İkta (toprak sahibi)olanların, gelirlerinin bir bölümü ile beslemek zorunda oldukları askerleridir. Buna göre ülke toprakları vergi gelirlerine göre bölümlere ayrılırdı . bu bölümlere ‘ İkta’ denirdi. Bu toprakları işleyen  çiftçiler ,devlete vermeleri gereken vergiyi  “Sipahi”ye verirlerdi. Sipahi de gelirinin bir bölümü ile atlı asker yetiştirirdi.",
            "İkta sistemi ile;\n" +
                    "\n" +
                    "Devletin hazinesine yük olunmadan, dü\u00ADzenli bir ordunun kurulması sağlanmıştır.\n" +
                    "Bulundukları bölgelerin güvenlikleri, ikta sahiplerinin yetiştirdiği askerler tarafından sağ\u00ADlanmıştır.\n" +
                    "Toprağa dayalı köle sisteminin oluşması önlenmiştir.\n" +
                    "Üretimde süreklilik ve artış sağlanmıştır.\n" +
                    "Bu sisteme Osmanlı Devleti döneminde “Tımar “adı verilmiştir.",
            "DİN VE İNANIŞ:\n" +
                    "Türkler İslam dinine girdikten sonra bu dinin liderliğini  üstlenmişlerdi. İslam dinini geniş alanlara yaymak için fetih hareketlerine girişmişler ve Türkler sayesinde İslam  dini çok geniş alanlara yayılmış ve bir dünya dini haline gelmiştir.\n" +
                    "\n" +
                    "Bugün, Pakistan, Hindistan,Afganistan, Balkanlar gibi coğrafyalarda İslam dininin yayılması Türkler sayesinde olmuştur.\n" +
                    "\n" +
                    "Türkler İslam dininin daha çok Sünni- Hanefi ekolünü benimsemişlerdir. (Hanefi mezhebine Türk mezhebi de  denmektedir.) Sünni İslam anlayışı yaymak ve korumak için mücadele etmişlerdir. (Nizamül- Mülk’ün açmış olduğu Nizamiye medreselerinin amacı Sünni İslam anlayışını korumak ve geliştirmekti.)\n" +
                    "\n" +
                    "Türkler arasında  Sufilik (Tasavvuf) anlayışı da oldukça gelişmiştir. Sufilik hareketi  sonucunda birçok tarikat ortaya çıkmıştır. Bunların başlıcaları; Rifailik, Kadirilik, Kübrevilik, Yesevilik, Ekberilik tir.\n" +
                    "\n" +
                    "Bunlardan Yeseviliğin kurucusu bir  Türk –İslam alimi olan Hoca Ahmet Yesevi‘dir. Hoca Ahmet Yesevi İslam Dininin  Türkistan’da (Orta Asya) yayılmasında çok önemli bir role sahiptir. Bugün dahi Türkistan’da Hoca Ahmet Yesevi ,bütün Türk boyları tarafından kutsal kabul edilmektedir.",
            "EKONOMİK HAYAT:\n" +
                    "Türk –İslam Devletlerinde ekonomik hayat Büyük Selçuklu Devleti zamanında  büyük bir gelişme gösterdi. Ticaret yolları üzerine “Hanlar” ve “ kervansaraylar” inşa edildi.",
            "Türk –İslam Devletlerinde ülke toprakları yönetim bakımından dört ayrı bölüme  ayrılmıştı. Bunlar;\n" +
                    "\n" +
                    "a.Has Toprakları: vergi gelirleri Sultan’a ait topraklardır.\n" +
                    "\n" +
                    "b.İkta Toprakları: Gelirleri, Hizmet ve maaş karşılığı olarak kumandanlara, askerlere ve devlet adamlarına bırakılan topraklarıdır. ( İkta sahibi olan devlet adamı veya komutan belirli sayıda  devlete asker  yetiştirmek zorundaydı)",
            "İktanın Yararları:\n" +
                    "\n" +
                    "Devlete bedava asker sağlar,\n" +
                    "Üretimde sürekliliği sağlar,\n" +
                    "Güvenliğin sağlanmasına yarar",
            "Göçebeleri yerleşik yaşama geçirmede etkilidir.\n" +
                    "\n" +
                    "Mülk Toprakları: Kişilere ait topraklardır. Sahibi toprağı istediği gibi kullanma hakkına sahiptir.\n" +
                    "e.Vakıf Toprakları: Okul, hastane gibi sosyal kurumların ihtiyaçlarını karşılamak için devlet tarafından bu kurumlara verilen topraklardır.",
            "DİL VE EDEBİYAT:\n" +
                    "Karahanlı Devleti’nde resmi dil Türkçe idi. Resmi yazılar Uygur alfabesi ile yazılıyordu. Karahanlı Devleti’nin bu milli kimliği sayesinde bu dönemde Türk kültürü oldukça gelişmiş ve Türk kültürü açısından çok önemli olan  birçok eser yazılmıştır.\n" +
                    "\n" +
                    "Gaznelilerde ve Büyük Selçuklu Devleti’nde ise durum biraz daha farklı idi.  Bu devletlerde bilim dili Arapça idi. Resmi dil olarak ta Farsça kullanılıyordu. Halk ise Türkçe konuşuyordu . Bu dönemlerde Türk kültür tarihi için önem taşıyan belli başlı eserler şunlardır.\n" +
                    "\n" +
                    "Divan-ı Lügat-it Türk –Kaşgarlı Mahmut : Türkçe‘nin zengin bir dil olduğunu göstermek ve Araplara Türkçe öğretmek amacı ile yazılmış bir eserdir.\n" +
                    "Şehname- Firdevsi\n" +
                    "Divan-ı Hikmet- Hoca Ahmet Yesevi\n" +
                    "Edip Ahmet – Atabet’ül Hakayık\n" +
                    "Yusuf Has Hacip – Kutadgu Bilig",
            "BİLİM:\n" +
                    "Karahanlılar döneminde  Türkistan’da bulunan  Semerkant,  Buhara, Kaşgar gibi şehirler önemli bilim ve  sanat merkezleri olmuştu. Büyük Selçuklu Devleti döneminde açılan Nizamül- Mülk medreseleri de İslam medeniyetinde büyük öneme sahiptir.\n" +
                    "Türk- İslam Devletlerinde yetişen  önemli  bilim adamlarından bazıları  şunlardır;\n" +
                    "Farabi- Felsefe\n" +
                    "İbn-i Sina –Tıp\n" +
                    "Uluğ Bey- Astronomi\n" +
                    "Biruni – Matematik\n" +
                    "Barani- Trigonometri\n" +
                    "Ali  Kuşcu- Astronomi",
            "SANAT\n" +
                    "Türk –İslam  Devletlerinde gelişen başlıca sanat dalları, çinicilik, minyatür, tezhip, ebru, süsleme, hat, oymacılık, kakmacılık ve mimaridir.",
            "SOSYAL HAYAT\n" +
                    "İlk Müslüman Türk devletlerinde halk ge\u00ADnellikle geleneklerine bağlı bir yaşam sürüyordu. İslam dinî ile uyuşmayan âdetler kaldırıldı.\n" +
                    "\n" +
                    "Türk töresi halkın yaşamında belirleyici oldu. Türk olmayan uluslar devletin hoşgörüsü sebebiyle kendi kültürlerini devam ettirebildi.\n" +
                    "\n" +
                    "Toplum içerisinde sosyal sınıf ayrımları yoktu. Ancak meslek grupları kendi aralarında çe\u00ADşitli teşkilatlar kurmuşlardı. Lonca adı verilen bu teşkilatlarda aynı mesleği yapanlar kendi arala\u00ADrında birlik kurarak bir denetim mekanizması oluşturmuşlardır.",
    };
    public static String OsmanlıKurulus[] = {
            "Osmanlı Devleti Kuruluş Dönemi Padişahları\n" +
                    "\n" +
                    "Osman Gazi (1299 – 1326)\n" +
                    "Orhan Gazi (1326 – 1362)\n" +
                    "1. Murad (1362 – 1389)\n" +
                    "1. Bayezid – Yıldırım Bayezid (1389 – 1402)\n" +
                    "1. Mehmed – Çelebi Mehmed (1413 – 1421)\n" +
                    "2. Murad ( 1421 – 1451)",
            "Osmanlı Devleti Kuruluş Dönemi Özeti\n" +
                    "\n" +
                    "Osmanlı Devleti; 1281 yılında Ertuğrul Gazi’nin vefatı sonrası Kayıların başına geçen Osman Gazi tarafından 1299 tarihinde kurulmuştur. Şimdi gelin, Osmanlı Devleti Kuruluş Dönemi’ne birlikte göz atalım.",
            "Osman Gazi (1299 – 1326)\n" +
                    "\n" +
                    "Babasının vefatı üzerine Kayıların başına geçen Osman Gazi 1284 yılında önemli bir Bizans kalesi olan Kulacahisar’ı, 1288’de Karacahisar’ı ve 1298 yılında da Bilecik’i fethetti.",
            "Anadolu Selçukluların dağılma sürecine girmesi ve Anadolu’da yaşanan siyasi otorite boşluğundan yararlanarak 1299 yılında bağımsız Osmanlı Devleti’ni kurup, Söğüt’ü devletin ilk başkenti olarak ilan etti.",
            "1302 yılında Bizans imparatorluğu ile Osmanlı Devleti arasında gerçekleşen Koyunhisar Savaşı Osmanlı Devleti’nin üstünlüğüyle sonuçlanmıştır.",
            "1321 yılında Mudanya’yı fethetmiştir.",
            "Osman Gazi, 1326 Bursa Kuşatması sırasında hayatını kaybetmiş ve yerine oğlu Orhan Gazi geçmiştir. Bu dönemde Osmanlı toprakları Bizans sınırına doğru genişlemiş ve bu durum yeni kurulan devlete büyük bir itibar kazandırmıştır.",
            "Orhan Gazi (1326 – 1362)\n" +
                    "\n" +
                    "1326 yılında babasının ölümü üzerine tahta geçen Orhan Gazi, aynı yıl Bursa’nın fethini tamamladı.",
            "1329 yılında gerçekleşen Maltepe Savaşı’nın neticesinde Bizans İmparatorluğu’nu yenilgiye uğrattı ve Kocaeli Yarımadası’nda kontrolü sağladı.",
            "1331’de İznik ve 1337’ de İzmit’i fethederek Osmanlı Devleti’nin sınırlarını genişletti.",
            "1345 yılında Karesioğulları Beyliği’nin Osmanlı topraklarına katılmasıyla Anadolu’da siyasi birliğin ilk adımları atıldı. Ayrıca Rumeli’de kazanılan ilk toprak olan Çimpe Kalesi de yine bu dönemde alındı. (1353)",
            "Beyliğin bir devlet haline gelmesinde de büyük katkıları olan Orhan Gazi; ilk divanı toplamış ve vezirlik makamını oluşturmuştur. 1362 yılında vefat etmesi üzerine tahta oğlu I. Murad geçmiştir.",
            "1. Murad (1362 – 1389)\n" +
                    "\n" +
                    "1. Murad dönemi, Balkan topraklarındaki ilerlemenin hızlandığı bir dönem olmuştur.\n" +
                    "\n" +
                    "1363’te Bizans İmparatorluğu ile yapılan Sazlıdere Savaşı sonunda, Edirne’yi fethetmiştir.",
            "Balkanlarda gerçekleşen fetihlerden rahatsız olan Papa’nın oluşturduğu Haçlı ordusu ile Osmanlı Devleti 1364 yılında Sırpsındığı Savaşı’nda karşı karşıya geldiler. Osmanlı Devleti’nin kazandığı savaşın sonunda, Balkanlar’daki ilerleyiş daha da kolay hale geldi.",
            "Osmanlılara karşı harekete geçen Haçlı orduları, 1367 yılındaki Çirmen Savaşı’nda bir kez daha mağlup edildi ve Rumeli’deki Osmanlı üstünlüğü kabul edildi.",
            "Oğlu I. Bayezid’i , Germiyanoğulları beyinin kızıyla evlendirdi ve çeyiz yolu ile Kütahya ve Simav’ı Osmanlı topraklarına kattı.",
            "Para karşılığında Hamitoğulları’ndan da Isparta, Akşehir ve Beyşehir’i alarak devletin Anadolu’daki sınırlarını da genişletti.",
            "1389 tarihinde bir kez daha oluşturulan Haçlılar ile Osmanlı Devleti I. Kosova Savaşı’nda karşı karşıya geldiler. Yapılan savaş Osmanlı Devleti tarafından kazanıldı fakat I. Murad savaşın sonunda gerçekleşen bir suikast sonucu şehit düştü ve yerine oğlu I. Bayezid geçti.",
            "1. Bayezid – Yıldırım Bayezid (1389 – 1402)\n" +
                    "\n" +
                    "1390 yılında gerçekleştirmiş olduğu Anadolu Seferi ile Aydınoğulları, Saruhanoğulları, Menteşeoğulları, Germiyanoğulları ve Hamitoğulları’nı ortadan kaldırarak Osmanlı sınırlarını genişletti.",
            "Rumeli’deki fetihlere devam eden Yıldırım Bayezid; 1394 yılında Teselya ve Arnavutluk’a kadar ilerledi.",
            "1396 yılında Rumeli’deki Osmanlı ilerleyişini durdurmak isteyen Haçlı birliğiyle Osmanlı Devleti Niğbolu Savaşı’nda karşı karşıya geldiler. Osmanlı Devleti’nin zaferiyle sonuçlanan savaşın ardından, Haçlı ordusu tamamen dağılmak zorunda kaldı.",
            "İstanbul, Yıldırım Bayezid döneminde iki kez kuşatılmış fakat fethedilememiştir.",
            "Timur’un Anadolu içlerine doğru ilerlemesi ve Osmanlılara ait olan Sivas’ı alması iki orduyu 1402 yılında gerçekleşen Ankara Savaşı’nda karşı karşıya getirdi. Osmanlı Devleti’nin mağlup olduğu savaşta, Yıldırım Bayezid, Timur’a esir düştü.",
            "Ankara Savaşı sonrası Anadolu’da bozulan siyasi birlikle birlikte beylikler dönemi yeniden başladı. Osmanlı Devleti ise 1402 – 1413 yılları arasında süren taht kavgalarıyla Fetret Devri’ne girdi.",
            "1. Mehmed – Çelebi Mehmed (1413 – 1421)\n" +
                    "\n" +
                    "Fetret Devri sırasında çetin bir taht savaşına girişen Çelebi Mehmed bu savaştan galip ayrıldı ve 1413 yılında padişah oldu. Anadolu’daki siyasi birliği sağlamak ve Ankara Savaşı sonrası Anadolu’da kaybedilen toprakları geri kazanmak adına harekete geçmiştir.",
            "Saruhanoğulları’nı topraklarına katmıştır.",
            "Menteşe ve Aydınoğulları’nı Osmanlı Devleti’ne bağlamıştır.",
            "Karamanoğulları üzerine yürüyerek Seydişehir, Beyşehir ve Akşehir’i Osmanlı topraklarına katmıştır.",
            "1419 yılında da Cenevizlilerden Samsun’u almıştır.",
            "1420 yılında gerçekleşen ve döneminin iki büyük isyanı olan Şeyh Bedrettin ve Düzmece Mustafa isyanlarını bastırmıştır.",
            "Çelebi Mehmed 1421 yılında vefat etmiştir. Yerine oğlu II. Murad hükümdar olmuştur.",
            "2. Murad (1421 – 1451)\n" +
                    "\n" +
                    "Saltanatının ilk yıllarında, ikinci kez çıkan Düzmece Mustafa İsyanı ile uğraşmak zorunda kalmış ve bu isyanı 1423 yılında bastırmıştır.",
            "Siyasi birliği sağlamak için Anadolu üzerine harekete geçerek 1423 yılında Candaroğulları’nın büyük bir kısmını Osmanlı topraklarına kattı.",
            "Aydınoğulları, Menteşe ve Teke beyliklerine de son veren II. Murad, Batı Anadolu’ya hâkim oldu.",
            "Osmanlı Devleti’nin, Mora ve Adriyatik’e kadar ilerlemesi üzerine harekete geçen Macarlar ile gerçekleşen savaşta Osmanlı Devleti mağlup oldu. İki devlet arasında yapılan antlaşmaya göre 10 yıl süreyle birbirlerine saldırmayacaklarını taahhüt ettiler. II. Murad, bu antlaşmadan sonra tahttan çekilerek tahtı oğlu II. Mehmed’e bıraktı.",
            "Mehmed’in tahta geçmesini bir fırsat olarak gören Haçlılar Osmanlı Devleti üzerine harekete geçti. Oluşan bu tablo karşısında, yeniden devleti başına geçen II. Murad ile Haçlı orduları 1444 Varna Savaşı’nda karşı karşıya geldi ve savaşı Osmanlı Devleti büyük bir zaferle kazandı.",
            "Varna’da aldıkları yenilginin izlerini silmek ve Osmanlıları Balkanlar’dan atmak isteyen Haçlıların yeniden Osmanlı Devleti’ne saldırması sonucu 1389 yılında gerçekleşen II. Kosova Savaşı, Osmanlıların üstünlüğüyle sona erdi. Kazanılan bu zaferle beraber Balkanların artık bir Türk yurdu olduğu Batı ülkeleri tarafından da kabul edildi.",
            "Osmanlı Devleti Kuruluş Dönemi Savaşları\n" +
                    "\n" +
                    "Bu başlık altında sizler için, Osmanlı Devleti Kuruluş Dönemi’nin en önemli savaşlarını tarihleriyle birlikte listeledik. İşte, Osmanlı Devleti",
            "Kuruluş Dönemi Savaşları:\n" +
                    "\n" +
                    "Koyunhisar Savaşı (1302)\n" +
                    "Maltepe Savaşı (1329)\n" +
                    "Sazlıdere Savaşı (1361)\n" +
                    "Sırpsındığı Savaşı (1364)\n" +
                    "Çirmen Savaşı (1374)\n" +
                    "1. Kosova Savaşı (1389)\n" +
                    "Niğbolu Savaşı (1396)\n" +
                    "Ankara Savaşı (1402)\n" +
                    "Varna Savaşı (1444)\n" +
                    "2. Kosova Savaşı (1448)",
    };
    public static String OsmanlıYukselis[] = {
            "YÜKSELME DÖNEMİ PADİŞAHLARI\n" +
                    "II. Mehmet (Fatih Sultan Mehmet)\n" +
                    "II. Bayezid\n" +
                    "Yavuz Sultan Selim (I. Selim)\n" +
                    "Kanuni Sultan Süleyman\n" +
                    "II. Selim (Sarı)\n" +
                    "III. Murat",
            "Fatih Sultan Mehmet Dönemi (1451 – 1481)\n" +
                    "İstanbul’un Fethi\n" +
                    "İstanbul’un Fethinin Nedenleri\n" +
                    "Anadolu ve Rumeli toprak bütünlüğünü bozması\n" +
                    "Boğazlara ve İpek yoluna hakim olma isteği\n" +
                    "Bizans’ın Anadolu Beylikleri ile iş birliği içinde olması\n" +
                    "Bizans’ın haçlı seferlerine sebep olması, şehzadeleri koruması ve kışkırtması\n" +
                    "İstanbul’un bir bilim ve kültür merkezi olması\n" +
                    "Hz. Muhammed’in hadis-i şerifi",
            "Fetih İçin Yapılan Hazırlıklar\n" +
                    "Şahin topları döküldü.\n" +
                    "Mancınık ve hareketli kuleler inşa edildi.\n" +
                    "400 parçalık donanama hazırlandı.\n" +
                    "Avrupa devletleri ve Anadolu\n" +
                    "Beylikleriyle saldırmazlık antlaşması imzalandı.",
            "Bizans’ın Aldığı Önlemler\n" +
                    "Grejuva ateşini çoğalttı.\n" +
                    "Haliç’e zincir çekti.\n" +
                    "Avrupa’dan yardım istedi\n" +
                    "Katolik ve Ortadoks mezheplerini birleştirmeyi çalışmıştır. Bu durum Ortadoksların tepkisine neden olmuştur.",
            "Fethin Sonuçları\n" +
                    "II. Mehmet’e “fatih” unvanı verildi.\n" +
                    "Kuruluş bitti, yükselme başladı.\n" +
                    "Anadolu ve Rumeli topraklarında bütünlük sağlandı.\n" +
                    "Boğazlar ve İpek yolu bizim elimize geçince Avrupalılar 1492’de Coğrafi Keşiflere başladılar.\n" +
                    "Ortaçağ kapandı, yeniçağ başladı.\n" +
                    "Feodilite zayıflamaya başladı.\n" +
                    "İstanbul’dan kaçan bilim insanları Rönesans’ın başlamasına neden oldular.",
            "Diğer Gelişmeler\n" +
                    "Topkapı Sarayı yapıldı. Ayasofya camiye çevrildi.\n" +
                    "İlk defa altın para basıldı.\n" +
                    "İlk defa iltizam sistemi uygulandı.\n" +
                    "İlk defa müsadere sistemi uygulandı.\n" +
                    "Cülus bahşişi yasallaştı.\n" +
                    "Divana ilk defa Nişancı atandı.(örfi hukuk)\n" +
                    "Örf-i hukuk yazılı hale geldi. (Kanunname-Ali Osman)\n" +
                    "Sahn-ı Seman medreseleri ile Tetimme medreseleri açılmıştır.\n" +
                    "İlk defa kapitülasyon imtiyaz verildi.( Venedik)\n" +
                    "Kilitbahir Kalesi inşa edilmiştir.\n" +
                    "Sahn-ı Seman Medreseleri açılmıştır.",
            "Diğer Gelişmeler\n" +
                    "Kanunname-i Al-i Osman (Fatih Kanunnamesi) hazırlanmıştır.(ilk kanunnmame). böylece katil katli yasallaşmıştır.\n" +
                    "Kapalıçarşı yapılmıştır.\n" +
                    "Fatih Sultan Mehmet İtalyan sanatçı Bellini’yi İstanbul’a getirtmiş ve ilk kez portresini çizdiren hükümdar olmuştur.\n" +
                    "Sinan Bey İtalya’ya resim sanatı eğitimi için gönderilmiştir.\n" +
                    "Anadolu’da Candaroğullarından Sinop ve Samsunu, Karamanoğullarından Konya ve Karamanı, Cenevizlilerden Amasra’yı aldı. Trabzon Rum İmparatorluğu’na son vermiştir.\n" +
                    "Balkanlar’da Sırbistan(Belgrad hariç), Bosna-Hersek, Arnavutluk, Mora yarımadası, Eflak-Boğdan alınmıştır.\n" +
                    "Denizlerde; Ege adası, Yunan Adaları, Bozcaada, Gökçeada, Kırım alındı.",
            "II. Bayezid Dönemi (1481 – 1512)\n" +
                    "“Cem Sultan Olayı” döneme damgasını vurdu. İlk defa bir iç sorun dış dorun haline gelmiştir.\n" +
                    "Karamanoğullarına tamamen son verildi.\n" +
                    "1511 Şahkulu isyanı çıktı. (Safevi devletinin Anadolu’yu ele geçirmek amacıyla yaptığı şii propagandası)\n" +
                    "“Küçük Kıyamet” olarak nitelendirilen İstanbul depremi olmuştur.\n" +
                    "Edirne’de müzikle tedavi yapan darüşşifa açılmıştır.\n" +
                    "Rönesans sanatçısı Leonardo Da Vinci Haliç’i Boğaziçi’ne bağlayan bir köprü yapma isteğini mektupla 2. Bayezit’e bildirdi.\n" +
                    "Kemal Resi komutasındaki bir donanma İspanya’ya giderek zulüm gören yahudi ve müslümanları İstanbul’a getirdi.\n" +
                    "Yükselme Dönemi içinde bir duraklama dönemi olarak bilinir.",
            "I. Selim (Yavuz) Dönemi (1512 – 1520)\n" +
                    "Babasını (II. Bayezid) tahttan indirerek padişah olmuştur. Babası “kılıcın keskin, ömrün kısa olsun” demiştir.\n" +
                    "Tarihçiler tarafından “8 seneye 80 yıllık iş sığdırmış padişah” olarak bilinir.\n" +
                    "Kendisi döneminde Bozoklu Celal Ayaklanması bastırılmıştır.( Bu isyan ekonomik temellidir)\n" +
                    "Doğu siyaseti için bölgeleri tanımak amacıyla “Selimname” ve “Bleşt Behişt” adlı kitap yazarı İdris-i Bitlisi’yi okumuştur.\n" +
                    "1514’te İran (Safevi) ile “Çaldıran Savaşı” yapıldı ve bu başarıda tüfekli askerlerimiz etkili oldu.\n" +
                    "“Turnadağ Savaşı” ile Dulkadiroğullarına son verildi. Böylece Anadolu’da Türk siyasi birliği kesin olarak sağlandı.\n" +
                    "1516’da Memlük ile “Mercidabık Savaş”ı yapılıp kazanıldı, halife esir alındı.\n" +
                    "Yavuz, Şam’da “Muhyiddin Arabi’nin “ mezarını bulup külliye yaptırdı.\n" +
                    "1517’de Memlük ile “Ridaniye Savaşı” yapılıp, kazanıldı.",
            "Ridaniye Savaşının Sonuçları\n" +
                    "Halifelik Osmanlı’ya geçti.\n" +
                    "Osmanlı da teokratik devlet anlayışı güçlendi.\n" +
                    "Baharat Yolu Osmanlı’ya geçti.\n" +
                    "Kutsal Emanetler İstanbul’a getirdi.\n" +
                    "Mısır hazinesi İstanbul’a getirildi.",
            "Kanuni Sultan Süleyman Dönemi (1520 – 1566)\n" +
                    "Yavuz Sultan Selim’in tek oğlu olduğu için herhangi bir sorun olmadan tahta çıkmıştır.\n" +
                    "Kanuni Sultan Süleyman en uzun tahtta kalan padişahtır.\n" +
                    "Belgrad fethedilmiştir (1521).\n" +
                    "Rodos fethedilmiştir (1521).\n" +
                    "Macarlarla Mohaç Meydan Savaşı yapıldı.(Dünyanın en kısa süren savaşıdır)\n" +
                    "İlk defa Viyana kuşatıldı.",
            "Almanya seferine çıkıldı. Şarlken’in elindeki Fransa kralı kurtarıldı.\n" +
                    "Fransa’ya ilk kez kapitülasyon verildi.\n" +
                    "Kalenderoğlu, Baba Zünnun, Canberdi Gazali ve Ahmet Paşa isyanları bu dönemde çıkmıştır.\n" +
                    "Osmanlı sarayına ilk Fransız elçi gelmiştir.\n" +
                    "Kanuni’nin hocası Kastamonulu Hayreddin’dir.\n" +
                    "Mimar Sinan, Fuzuli, Baki, Niyazi, Pir Sultan Abdal, Arifi bu dönemde yaşamışlardır.\n" +
                    "Avusturya kralı ile (Arşidük) Osmanlı arasında İstanbul antlaşması imzalandı. Böylece Avusturya arşidükü Osmanlı sadrazamına denk sayıldı. Orta Avrupa siyasi üstünlüğü Osmanlı’ya geçmiştir.\n" +
                    "1535’te Fransa ile kapitülasyon antlaşması imzalandı. Ancak bu antlaşma her iki taraftan birinin ölmesiyle son buluyordu.\n" +
                    "1528’de Haçlılarla Preveze savaşı yapıldı. (Andre Doria ile Barbaros Hayrettin Paşa ) Böylece Akdeniz bir Türk gölü haline gelmiştir.",
            "İlk defa İran ile Amasya antlaşması imzalandı.(1555)\n" +
                    "Haçlılarla Kuzay Afrika da egemenliğimizi pekiştiren “Cerbe Deniz Savaşı” yapıldı ve kazanıldı.(1560)\n" +
                    "1566’da Zigetvar Seferi yapıldı.(Kanuni’nin son seferi)\n" +
                    "Trablusgarp, Tunus, Fas ve Cezayir alınarak Kuzay Afrika’nın fethi tamamlandı.\n" +
                    "Ayrıca Hindistan üzerine 4 sefer yapıldı.( Portekiz tehdidinden dolayı) Ancak bölgenin uzak olması, Gemilerin okyanusa dayanamaması, Gucerat Sultanlarının donanmamıza yardım etmemesinden dolayı seferler başarısız oldu.",
            "Hint Seferine Katılan Kaptanlar\n" +
                    "Hadım Süleyman\n" +
                    "Piri Reis (idam edilmiştir)\n" +
                    "Murat Reis\n" +
                    "Seydi Ali Reis (Miratül’ Memalik)",
            "Sokullu Mehmet Paşa Dönemi (1564 – 1579)\n" +
                    "Sokullu Mehmet Paşa; Kanuni, 2. Selim, 3. Murat dönemlerinde sadrazamlık (veziriazamlık)yapmıştır.\n" +
                    "Özellikle 2. Selim ve 3. Murat döneminde yönetimde çok etkili olmuştur. Bundan dolayı bu döneme Sokullu Devri denmiştir.\n" +
                    "1571’de Kıbrıs alındı. Kıbrıs’ın alınmasından rahatsız olan Haçlılar İnebahtı’da donanmamızı yaktılar.",
            "Sokullu Mehmet Paşa’nın Projeleri\n" +
                    "Don – Volga Kanalı Projesi\n" +
                    "Don Volga ırmaklarını birleştirme projesidir.\n" +
                    "Amaçları\n" +
                    "Rusların güneye inmesini engellemek\n" +
                    "Kırım’ı korumak\n" +
                    "Orta Asya Türkleri ile bağlantıyı kurmak\n" +
                    "İran’ı kontrol etmek\n" +
                    "Mimar Sinan görevlendirildi, ancak durduruldu. Ruslar tarafından tamamlanmıştır.",
            "Süveyş Kanalı Projesi\n" +
                    "Baharat Yolu’nu tekrar canlılık kazandırılmak istenmiştir.\n" +
                    "1869 yılında Fransa ve İngiltere tamamladı.\n" +
                    "Marmara – Karadeniz Projesi\n" +
                    "Amacı Karadeniz’e ikinci bir hat açmaktır.\n" +
                    "Baharat yoluna canlılık katmak da istenmiştir.\n" +
                    "Proje hayata geçirilememiştir.",
    };
    public static String DuraklamaDonemi[] = {
            "Ahmet, hanedanın en yaşlı ve en olgun üyesinin başa geçmesi kuralını getirerek şehzadelerin sancaklarda görevlendirilmesine son verdi. Böylece taht kavgalarını önledi. Fakat, bu uygulama tecrübesiz kişilerin başa geçmesine yol açtı. Padişahların çoğu başarısız oldu. Padişahlar ordunun başında sefere çıkmaz oldular. Sadrazamlar çok sık değiştirildi",
            "Devlet hizmetinde yeterlik, doğruluk, çalışkanlık yerini rüşvete, dalkavukluğa, adam kayırmaya bıraktı. Memurluklar rüşvet karşılığı satıldı. Eyaletlerin başına iltimas ve rüşvetle valiler atandı. Bunlar gittikleri yerlerde halka baskı yaptılar. Ayrıca, uzun süren savaşlardan dolayı Tımarlı Sipahiler memleketlerinden uzak kaldılar. Taşrada otorite boşluğu oluştu.",
            "Murat döneminde, devlet düzeninin temel unsuru olan askeri ocaklara, kanun-i kadim’e (geleneksel kurallara) aykırı bir biçimde asker alındı. Devşirme sistemi ve ordu disiplini bozuldu. Askeri ocaklar birer çıkar kaynağı haline geldi.",
            "Yeniçeriler, askerlik mesleği dışında bazı işlerle uğraşmaya başladılar. Devlet adamlarını, hatta padişahları değiştirir hale geldiler. Sayıları her geçen gün artarken, nitelikleri azaldı. Eskiden “ocak devlet içindir” anlayışıyla hareket eden yeniçeriler, giderek “devlet ocak içindir” anlayışıyla hareket ederek, ocağı kendi çıkarları için kullandılar.",
            "Dirlikler, askerlikle ilgisiz kişilere dağıtılmaya ya da iltizama verilmeye başlandı. Dirlik sahipleri dirliklerinin başında değil, şehirlerde oturdular; üretimle doğrudan ilgilenmediler. Bu nedenle Tımarlı Sipahiler’in eski düzeni bozuldu; sayıları her gün biraz daha azaldı. Yeniçerilerin sayısı artarken Tımarlı Sipahiler’in azalması askeri dengeyi bozdu.",
            "Üretimin düşmesi ve savaşların uzaması giderleri artırdı. Giderlerini karşılamakta zorlanan devlet yeni vergiler koymaya yöneldi. Önemli bir tarım bilgisine ve teknolojisine sahip olmayan ve bu nedenle gelirini artıramayan halk, vergileri ödemekte zorlandı. Köylü kitleler halinde toprağını terk etti. Köyden kente doğru bir göç hareketi başladı. Önemli miktarda arazi boş kalırken, şehirlerde nüfus yığılmasının oluşması işsizlik sorununu artırdı.",
            "Devlet, temel üretim faktörü olan tarımı yeniden canlandırmak ve giderlerini karşılayabilmek için, köylünün terk ettiği toprakları iltizama (kiraya) verdi. Ayrıca, maaşını ödeyemediği önemli bürokratlara da, alacakları karşılığında bu toprakları vererek bir yükün altından çıkmaya çalıştı. Fakat bu tedbir, devletin en önemli üretim faktörü olan dirlik (tımar) sistemini iyice bozdu. Toprağı kiralayan eşraf zamanla güçlendi ve ayan denilen zümre ortaya çıktı.",
            "Ayrıca, kapitülasyonlardan dolayı ticaretin azınlıkların ve yabancıların elinde olması; iç gümrük uygulamasından dolayı güçlü bir Müslüman tüccar sınıfının ortaya çıkmamış olması da Osmanlı ekonomisinin çökmesinde rol oynadı. ",
            " DURAKLAMANIN NEDENLERİ\n" +
                    "İç Nedenler:\n" +
                    "\n" +
                    "Devlet yönetimi ve merkezi otoritenin bozulması.\n" +
                    "Çocuk yaşta ve tecrübesiz kişilerin başa geçmesi. Valide sultanların ve bürokratların yönetimde etkinlik kazanmaları.\n" +
                    "Rüşvet ve iltimasın (adam kayırmanın) artması.\n" +
                    "Askeri yapının (devşirme ve tımar sistemlerinin) bozulması. Yeniçeri Ocağı’na askerlikle ilgisi olmayan kişilerin alınması. Yeniçerilerin yönetimde etkinliklerinin artması.\n" +
                    "Dirliklerin ilgisiz kişilere verilmesi. Tımarlı sipahilerin ihmal edilmesi ve sayılarının azalması.",
            "Ordunun niteliksiz yığınlara dönüşmesi ve askeri disiplinin bozulması.\n" +
                    "Yenilgi ve toprak kayıplarının artması. Savaşların bir gider kaynağı haline gelmesi.\n" +
                    "Savaşların uzaması üzerine üretken nüfusun uzun süre cepheye bağlı kalması; tarım üretiminin düşmesi, ekonomik yapının bozulması.\n" +
                    "Cülus bahşişlerinin artması; saray masrafları ve israfın çoğalması.\n" +
                    "Eğitim sisteminin bozulması. Medreselerin başına niteliksiz kişilerin getirilmesi.\n" +
                    "Ulema sınıfının Yeniçerilerle işbirliği yapması ve yeniliklere karşı çıkması.\n" +
                    "Ülkede güven ve asayişin bozulması. Eşkıyalığın yaygınlaşması. Anadolu ve uzak eyaletlerde çok sayıda isyanın çıkması. ",
            "Dış Nedenler:\n" +
                    "\n" +
                    "Devletin, bir yandan doğal sınırlara ulaşması, öte yandan güçlü devletlerle komşu olması.\n" +
                    "Coğrafi Keşifler’in Akdeniz ticaretinin önemini azaltması. Bu nedenle devletin gümrük gelirlerinin azalması.\n" +
                    "Avrupa’da altın ve gümüşün artması nedeniyle Osmanlı parasının değer yitirmesi,\n" +
                    "Batıdaki askeri ve teknik gelişmelerin takip edilmemesi. Kapitülasyonların zamanla devletin aleyhine işlemesi.\n" +
                    "Osmanlı’nın zayıflaması üzerine, Avrupa’da haçlı zihniyetinin yeniden canlanması.",
            "Ç İSYANLAR\n" +
                    " Nedenleri:\n" +
                    "\n" +
                    "Merkezi otoritenin zayıflaması,\n" +
                    "Devşirme ve tımar sistemlerinin bozulması,\n" +
                    "Rüşvet ve haksızlıkların yaygınlaşması,\n" +
                    "Haksız vergilerin alınması,\n" +
                    "Paradaki altın oranının düşürülmesi,\n" +
                    "Maaşların zamanında ödenememesi,\n" +
                    "İran ve Avusturya savaşlarının uzun sürmesi,\n" +
                    "Savaş kaçaklarının eşkıyalığa yönelmesi,\n" +
                    "Islahatların, çıkarcı çevrelerin tepkisini çekmesi. ",
            "Yeniçeri İsyanları:\n" +
                    "\n" +
                    "Askeri ve ekonomik niteliktedir. Yeniçeri, ulema ve bürokratların, çıkarlarını korumak üzere başvurdukları bir yoldur. Devlet düzenini değil, yöneticileri değiştirmeye yöneliktir.\n" +
                    "Murat döneminde, maaşların ayarı düşük akçelerle ödenmesi yeniçeri isyanına yol açtı.\n" +
                    "Osman (Genç), Yeniçeri Ocağı’nı kaldırmak istedi. Durumdan haberdar olan Yeniçeriler, isyan ederek II. Osman’ı öldürdüler. İlk kez bir padişah isyanla öldürüldü.\n" +
                    "Mehmet döneminde, maaşlarının verilmemesi ve saray ağalarının devlet işlerine karışması gerekçesiyle isyan ettiler. İstemedikleri kişilerin idamını sağladılar. (Bu olay Vak’a-i Vakvakiye (Çınar Olayı) olarak adlandırılır.) ",
            "Celali İsyanları:\n" +
                    "\n" +
                    "Tamamen ekonomik niteliklidir. Dirlik sisteminin bozulması, vergilerin artırılması ve kanuna aykırı vergilerin toplanması köylüyü topraktan kopardı. Eşkıyalık türedi. Savaşların uzaması da isyanların çıkmasını ve yaygınlaşmasını sağladı. Karayazıcı, Canbolatoğlu ve Kalenderoğlu bunların başlıca-larıdır. Ayrıca, Erzurum Valisi Abaza Mehmet ve Sivas Valisi Vardar Ali gibi yöneticiler de isyan ederek, devleti uzun süre uğraştırdılar. ",
            "Eyalet İsyanları: \n" +
                    "\n" +
                    "Merkezi otoritenin zayıflaması üzerine, bazı bağlı beylik ve eyaletlerde de isyanlar çıktı. Bazen eyaletlerin başındaki yöneticiler, bazen da yöneticilerin zulmünden dolayı halk isyan etti. Eflak, Boğdan, Erdel, Yemen, Bağdat, Basra ve Trablusgarb isyanları bunların başlıcalarıdır.",
            "ÖNEMİN SİYASİ GELİŞMELERİ\n" +
                    "OSMANLI – İRAN SAVAŞLARI:\n" +
                    "Osmanlı – İran ilişkileri, bir önceki yüzyılda meydana gelen savaşların devamı niteliğindedir. Bu süreçte İran, Celali isyanlarını ve Osmanlı – Avusturya savaşlarını bir fırsat olarak değerlendirmek istedi.\n" +
                    "\n" +
                    "a) Ferhat Paşa Antlaşması ile Azerbaycan, Dağıstan ve Gürcistan alınarak Doğu’da en geniş sınırlara ulaşıldı (1590).\n" +
                    "\n" +
                    "b) Alınan bu yerler, Nasuh Paşa Antlaşması ile geri verildi. Buna karşılık, İran’dan 200 deve yükü ipek vergi alınacaktı (1611).\n" +
                    "\n" +
                    "c) İran, vermesi gereken ipeği göndermeyince ilişkiler yeniden bozuldu. Serav Antlaşması ile İran, ipeği göndermeyi kabul etti (1618).\n" +
                    "\n" +
                    "d) İran’ın Bağdat’ı işgal etmesi üzerine IV. Murat Revan seferine çıktı. Kasr-ı Şirin Antlaşması imzalandı. Bağdat ve Musul Osmanlı’da kaldı. Yaklaşık olarak bugünkü sınırlar çizildi. Doğu sınırında uzun bir barış süreci başladı (1639). ",
            "AVRUPA SİYASETİ:\n" +
                    "\n" +
                    "1) Osmanlı – Lehistan İlişkileri:\n" +
                    "\n" +
                    "a) Lehistan’ın Boğdan’ın içişlerine karışması üzerine Osman (Genç) sefere çıktı. Lehistan yenilgiye uğratıldı. Hotin Antlaşması imzalandı. Boğdan üzerindeki egemenlik güvenceye alındı. Lehistan, Osmanlı adına Kırım’a vergi verecekti (1621).\n" +
                    "\n" +
                    "Not: Hotin kuşatması sırasında yeniçerilerin disiplinsiz davranışlarını gören Genç Osman, Yeniçeri Ocağı’nı kaldırmaya karar verdi. Fakat, bu girişim Genç Osman’ın hayatına mal oldu.\n" +
                    "\n" +
                    "b) Lehistan’ın, Osmanlı himayesindeki Ukrayna Kazaklarına saldırması üzerine, Mehmet sefere çıktı. Bucaş Antlaşması imzalandı. Podolya alınarak, batıda son kez toprak kazanıldı. Ayrıca, Lehistan her yıl vergi verecekti (1672).\n" +
                    "\n" +
                    "Not: Lehistan Diyet Meclisi, 22 bin altınlık verginin ağır olduğunu ileri sürerek antlaşmayı bozunca yeniden savaş başladı. Osmanlı Devleti vergiden vazgeçerek, sadece Podolya ile yetindi. ",
            "2) Osmanlı – Venedik İlişkileri:\n" +
                    "\n" +
                    "Doğu Akdeniz ve Kuzey Afrika’daki toprakların güvenliği açısından Girit’in alınması gerekiyordu. 25 yıllık bir kuşatmadan sonra Fazıl Ahmet Paşa Girit’i fethetti (1669). Denizlerde son başarı kazanıldı. Kuşatmanın uzun sürmesi, Osmanlı deniz gücünün ne kadar zayıfladığını açığa çıkardı. ",
            "3) Osmanlı – Avusturya İlişkileri:\n" +
                    "\n" +
                    "a) Mücadelenin ana nedeni, Orta Avrupa’da hakimiyet kurma isteğiydi. Bosna beylerbeyinin pusuya düşürülmesi üzerine, Mehmet sefere çıktı. XVI. yüzyılın son büyük zaferi olan Haçova Zaferi kazanıldı (1596). Doğu’da İran savaşları, Anadolu’da ise Celali isyanları sürdüğü için, Avusturya’nın barış teklifi kabul edildi. Zitvatoruk Antlaşması imzalandı (1606). Buna göre:\n" +
                    "\n" +
                    "Eğri, Estergon ve Kanije Osmanlı’da kaldı.\n" +
                    "Avusturya’nın her yıl ödediği vergi kaldırıldı.\n" +
                    "Avusturya, savaş tazminatı ödemeyi kabul etti.\n" +
                    "Avusturya Arşidükü Roma-Germen İmparatoru olarak tanındı ve padişaha denk sayıldı.\n" +
                    "Sonuç: Osmanlı’nın Avusturya üzerindeki siyasi üstünlüğü ve yaptırım gücü sona erdi.\n" +
                    "\n" +
                    "b) Erdel Beyi Rakoçi’nin, isyan ederek Avusturya’ya sığınması üzerine, Fazıl Ahmet Paşa sefere çıktı. Vasvar Antlaşması imzalandı Osmanlı’nın Erdel üzerindeki egemenliği kabul edildi. Uyvar ve Neograt kaleleri Osmanlı’da kaldı (1664). ",
            "II.Viyana Kuşatması / Osmanlı – Avrupa Savaşı\n" +
                    "\n" +
                    "a) Viyana Kuşatması:\n" +
                    "\n" +
                    "Orta Macaristan’da güçlenmek isteyen Katolik Avusturya, Protestan Macar halkına baskı yaparak, mezhep özgürlüğünü kaldırdı. Macarların Osmanlı’dan yardım istemesi üzerine Merzifonlu Kara Mustafa Paşa sefere çıktı. Belirlenen hedefin dışına çıkarak Viyana’yı kuşattı. Kuşatma uzun sürünce, Lehistan ve Alman kuvvetleri Viyana’nın yardımına geldiler. Kırım Hanı, bu kuvvetlerin Tuna’yı geçmesini önlemedi.",
            "Kuşatma toplarının bulunmayışı,\n" +
                    "Avusturya’nın dışarıdan yardım alması,\n" +
                    "Kırım Hanı’nın görevini yerine getirmemesi,\n" +
                    "Viyana’nın güçlü surlarla çevrili olması ve\n" +
                    "Devletteki iç çekişmelerin orduya yansıması\n" +
                    "nedeniyle Osmanlı ordusu ağır bir yenilgi aldı.\n" +
                    "\n" +
                    "Sonuç:\n" +
                    "\n" +
                    "Merzifonlu Kara Mustafa Paşa idam edildi.\n" +
                    "Avrupa’dan geri çekilme süreci başladı.\n" +
                    "Osmanlı’nın yenilgisi Avrupa’yı cesaretlendirdi.\n" +
                    "Papa’nın girişimiyle, Osmanlı’ya karşı Avusturya, Lehistan, Venedik ve Rusya kuvvetlerinden oluşan “Kutsak İttifak” kuruldu.\n",
            "b) Osmanlı – Avrupa Savaşı:\n" +
                    "\n" +
                    "Haçlı birliği tüm cephelerden Osmanlı’ya savaş açtı. Avusturya ve Macaristan Erdel’e, Lehistan Podolya ve Boğdan’a, Venedik Mora ve Dalmaçya kıyılarına, Rusya ise Azak çevresine saldırdı. Savaş 16 yıl sürdü. Tüm cephelerde yenilgi alındı. Bu arada çok sayıda padişah ve sadrazam değişti. İngiltere ve Hollanda’nın aracılığıyla barış yapıldı.",
            "Karlofça Antlaşması   (1699):\n" +
                    "\n" +
                    "a) Avusturya: Banat Yaylası ve Temeşvar hariç, Macaristan ve Erdel’i aldı.\n" +
                    "\n" +
                    "b) Venedik: Mora Yarımadası ve Dalmaçya kıyılarını aldı.\n" +
                    "\n" +
                    "c) Lehistan: Podolya ve Ukrayna’yı aldı. Her yıl ödediği vergi kaldırıldı.\n" +
                    "\n" +
                    "d) Antlaşma 25 yıl sürecek ve Avusturya’nın garantisinde olacaktı.\n" +
                    "\n" +
                    "Sonuç:\n" +
                    "\n" +
                    "İlk kez uluslararası bir antlaşmada, büyük çapta toprak kaybedildi.\n" +
                    "Orta Avrupa’da üstünlük sona erdi. Protestan Macarlar Avusturya’nın nüfuzuna geçti.\n" +
                    "Savaşların uzun sürmesi ekonomik durumu daha da zayıflattı.\n" +
                    "Batı karşısında askeri üstünlük\n" +
                    "Avrupa’dan geri çekilme süreci başladı. \n" +
                    "Rusya, daha çok toprak kazanmak ve Kırım’ı almak için bir süre daha savaşı sürdürdü. Sonuç alamayınca, anlaşmaya razı oldu:",
            "İstanbul Antlaşması   (1700):\n" +
                    "\n" +
                    "a) Azak Kalesi Rusya’ya bırakıldı.\n" +
                    "b) Rusya İstanbul’da elçi bulundurabilecek; Ruslar, Kudüs’ü serbestçe ziyaret edebileceklerdi.\n" +
                    "Sonuç:\n" +
                    "\n" +
                    "Rusya ilk kez Karadeniz’de üs kazandı.\n" +
                    "Kırım halkı Rus tehdidiyle karşı karşıya geldi.\n" +
                    "Rusya’nın, Osmanlı’nın içişlerine karışmasına ortam oluştu.",
            "DURAKLAMA DÖNEMİ ISLAHATLARI \n" +
                    "1) ıslahatların Genel Özelliği:\n" +
                    "\n" +
                    "Eski düzen ve ihtişamı geri getirmek üzere, askeri, mali ve ahlaki alanda ıslahatlar yapıldı.\n" +
                    "Batı’daki bilimsel ve teknik gelişmeler takip edilmedi.\n" +
                    "Sorunların çözümü için bazı raporlar hazırlandı.\n" +
                    "Islahatlar bir devlet politikası haline gelmedi; şahıslara bağlı kaldı.\n" +
                    "Islahatlar çıkarcıların tepkisine neden oldu. İsyanlarla kesintiye uğradı. İsyanların bastırılmasında baskı ve şiddete başvuruldu.\n" +
                    "Sorunların kökenine inilmediği için duraklama ve gerileme süreci önlenemedi.",
            "2) Islahatçı Padişahlar:\n" +
                    "\n" +
                    "II.Osman (Genç): Sarayla halk arasındaki kopukluğu gidermek istedi. Türk kökenli devlet memurlarına önem verdi. Yeniçeri Ocağı’nı kaldırmayı düşünmesi hayatına mal oldu.\n" +
                    "IV.Murat: İsyanları şiddet kullanarak bastırdı. Merkezi otoriteyi güven altına aldı. Tütün, içki ve gece sokağa çıkma yasağı getirdi. Geri kalmanın nedenleri ile ilgili raporlar hazırlattı. Bu amaçla Koçi Bey Risalesi hazırlandı.",
            "3) Islahatçı Sadrazamlar:\n" +
                    "\n" +
                    "Kuyucu Murat: Celali isyanlarını şiddetle bastırarak, merkezi otoriteyi sağlamaya çalıştı.\n" +
                    "Tarhuncu Ahmet: Maliyeyi düzeltmek için sistemli bir bütçe hazırladı. Saray masraflarını kıstı. Gelir – gider dengesini korumaya çalıştı.\n" +
                    "Köprülü Mehmet: Bağımsız olarak hareket edebilmek için, sadrazamlığı şu şartlarla kabul etti:\n" +
                    "Devlet işleriyle ilgili sunacağı her teklif kabul edilecek. Memurluklara istediği kişiyi atayacak. Hakkında şikayet olursa, önce savunması alınacak, sonra karar verilecek.\n" +
                    "Ordu ve donanmayı düzene soktu. Celali isyanlarını şiddet yoluyla bastırdı.\n" +
                    "Köprülü Fazıl Ahmet: Osmanlı tarihinin en genç sadrazamıdır. Ekonomik durgunluğu önlemeye çalıştı. Bilim ve sanat adamlarını korudu.\n" +
                    "Köprülü Fazıl Mustafa: Kanunsuz vergileri kaldırdı. Memurlukların satılmasını yasakladı.",
    };
    public static String GerilemeDonemi[] = {
            "Osmanlı Tarihinde Karlofça Antlaşması’ndan Yaş Antlaşması’na kadar geçen süreye (1699- 1792) Gerileme Devri denir. Gerileme Devrinde dış siyasette temel amaç Karlofça ve İstanbul Antlaşmaları ile kaybedilen toprakları geri almaktır. Bu amaçla Venedik, Avusturya, Rusya ile savaşmıştır. Ancak başarılı olamayınca doğuda İran ile savaşmıştır. Ayrıca Fransa ile 18.yüzyılda savaştı (VARİF ). Ancak Osmanlı Devleti 18.yüzyılda kaybedilen  topraklar geri alınamadığı gibi ,yeni topraklar kaybetti. İç siyasette ise: Devlet kurumlarındaki bozulmaları ıslahatlar yaparak yeniden düzenlemek ve devleti eski gücüne kavuşturmaktır.",
            "Kurumlardaki bozulmalar devam etmiş, İç isyanlar devam etmiş.\n" +
                    "Islahatlar devam etmiş ancak ıslahatların hedefi askeri ve teknik alanda batıyı örnek almak olmuş, bu amaçla Avrupa’dan subaylar getirilmiştir.\n" +
                    "Osmanlı yöneticileri gaza=cihat inancını yitirmiş, bunun yerine zevk ve eğlence almaya başlamıştır.",
            "Osman (1754-1757) :Devrinde önemli bir siyasi gelişme olmamıştır. \n" +
                    "\n" +
                    "Gerileme Dönemi Padişahları\n" +
                    "\n" +
                    "II. Mustafa (1695–1703)\n" +
                    "III. Ahmet (1703–1730)\n" +
                    "I. Mahmut (1730–1754)\n" +
                    "III. Osman (1754–1757)\n" +
                    "III. Mustafa (1757–1774)\n" +
                    "I.Abdülhamit (1774–1789)\n" +
                    "II.Selim (1789–1807)\n" +
                    "II. Osman (1754-1757) :Devrinde önemli bir siyasi gelişme olmamıştır.",
            "18.YÜZYIL SİYASİ OLAYLARI\n" +
                    "\n" +
                    " \n" +
                    "\n" +
                    "Edirne Olayı ve III. Ahmet’in Padişah Olması (1703): II. Mustafa Karlofça Antlaşmasından sonra Edirne’ye çekilmişti. Devlet işleri Şeyhülislam Feyzullah Efendinin eline kalmıştı.  Şeyhülislam bu durumdan yararlanarak yakınlarını önemli devlet memurluklarına getirmişti.Bu sırada padişahın Edirne’de oturması, orada saraylar yaptırması birçok kişiyi telaşa düşürmüştü. Bunun üzerine Şeyhülislamın düşmanları ve çıkarları elden gidenler harekete geçerek padişahın İstanbul’a gelmesini istediler.II. Mustafa İstanbul’a gelmemiş, bunun üzerine İstanbul’da cebecilerin etkin olduğu askeri bir isyan çıkmıştır. Şeyhülislamın düşmanları bundan yararlanarak halkı ayaklandırdı. Edirne üzerine yüründü, şeyhülislam önce hapsedildi, sonrada idam edildi.Asiler II. Mustafa’yı tahtan indirerek yerine III. Ahmet’i padişah yaptılar.(Bu olay Cebeciler Olayı olarak ta adlandırılır.)\n" +
                    "\n" +
                    "Bu isyan yönetime karşı değil kişilere karşı yapılmış bir isyandır",
            "XVII.yüzyılın sonlarına doğru tahta çıkan Çar I. Petro, Rusya’yı büyük bir devlet yapmak için şu hedefleri  (Panislavizm) belirlemiştir:\n" +
                    "\n" +
                    "1) Rusya’yı bir Avrupa devleti yapmak\n" +
                    "\n" +
                    "2) Azak denizine ve Kırım’a yerleşmek ve Karadeniz’e çıkarak etkili hale gelmek\n" +
                    "\n" +
                    "3) Boğazları ele geçirmek.\n" +
                    "\n" +
                    "4) Açık ve sıcak denizlere inmek.\n" +
                    "\n" +
                    "5) Osmanlı hakimiyetindeki Ortodoksların liderliğini ele geçirmek .\n" +
                    "\n" +
                    "6) Kapitülasyonlardan yararlanmak\n" +
                    "\n" +
                    "7) Lehistan’ı hakimiyet altına almak.\n" +
                    "\n" +
                    "8)  Orta Asya ve Kafkaslarda hakimiyet alanın genişletmek .\n" +
                    "\n" +
                    "Böylece bütün Slavları birleştirerek (Panislavizm) büyük bir Rus İmparatorluğu oluşturmak",
            "Prut Savaşı’nın Sebepleri:\n" +
                    "\n" +
                    "Rusya’nın Osmanlı üzerindeki emelleri\n" +
                    "Osmanlı Devletinin 1700 İstanbul Antlaşmasında Ruslara verdiği Azak Kalesi’ni geri almak istemesi.\n" +
                    "İsveçlileri takip eden Rus kuvvetlerinin Osmanlı topraklarına girerek tahrip etmeleri, Ruslar (Çar Deli Petro) denizlere inme politikasının sonucu olarak Baltık Denizi kıyıları için İSVEÇ ile savaşmış, Ruslara 1709 Poltova Savaşı’nda yenilen İsveç kralı “DEMİRBAŞ (XII.) ŞARL” Osmanlı Devletine sığınmıştı.\n" +
                    "Rusya’nın Osmanlı Ortodokslarını (Eflak , Boğdan , Karadağ ve Sırp) ayaklanmaya teşvik etmesi.\n" +
                    "Demirbaş Şarl’ın Osmanlı’yı savaşa teşvik etmesi.\n" +
                    "Kırım Hanı’nın Rusya’nın Osmanlı Devleti üzerindeki emellerini içeren bir rapor hazırlayarak Padişaha göndermesi.",
            "Savaş: 1711 yılında Baltacı Mehmet Paşa komutasındaki Osmanlı ordusu Rus ordusunu Prut nehri yakınlarında kuşattı. Baltacı Mehmet Paşa,  zor durumda kalan Çar I.Petro’nun isteğini kabul ederek  PRUT ANTLAŞMASI imzalandı.(1711).\n" +
                    "\n" +
                    "Antlaşma imzalanmasına  etki eden faktörler:\n" +
                    "\n" +
                    "1)Baltacı Mehmet Paşa’nın disiplinsiz davranan yeniçerilere güvenememesi.\n" +
                    "\n" +
                    "2) Osmanlı ordularının saldırılarda istenilen başarıyı gösterip sonuca ulaşamamaları.\n" +
                    "\n" +
                    "3) Rusların 1700 İstanbul Antlaşması ile aldıkları yerleri geri vermek istemeleri.\n" +
                    "\n" +
                    "4) Baltacı Mehmet Paşa’nın Avrupa’da Osmanlı’ya karşı yeniden kutsal ittifak oluşmasından çekinmesi\n" +
                    "\n" +
                    "5) Petro’nun eşi olan Katerina’nın zengin hediyelerle Baltacı’yı etkilemesi.\n" +
                    "\n" +
                    "6) Baltacı’nın ileri görüşlü olmaması ve etrafındakilerinin paraya düşkün olmaları",
            "Prut Antlaşması’nın Maddeleri:\n" +
                    "\n" +
                    "Ruslar Azak Kalesini ve çevresini geri verecek ve İstanbul’da elçi bulunduramayacak\n" +
                    "Ruslar Lehistan’dan çekilecek ve Lehistan’ın içişlerine karışmayacak\n" +
                    "Ruslar Kırım Hanlığı ve Lehistan’a bağlı Kazaklara saldırmayacak\n" +
                    "İsveç Kralı ülkesine rahatça geri dönebilecek",
            "Önemi ve Sonuçları:\n" +
                    "\n" +
                    "Kutsal İttifak ilk kez bozuldu ve ilk kez toprak alındı .\n" +
                    "1700 İstanbul Ant. İle verilen yerler ve haklar geri alındı.\n" +
                    "Azak kalesi alınarak Ruslar Karadeniz’den uzaklaştırıldı.\n" +
                    "Toprak kazanmaya yönelik politikanın ilk adımı olumlu sonuç verdi. Karlofça antlaşması ile kaybedilen yerlerin geri alınabileceği düşüncesi doğdu.\n" +
                    "Askeri üstünlüğe rağmen diplomatik kayıptır. Bu durumun so\u00ADrumlusu olarak görülen Baltacı Mehmet Paşa, Edirne’ye döndükten son\u00ADra görevden uzaklaştırıldı.\n" +
                    "Prut Savaşı, Osmanlı Devleti’nin 18. yüzyıl başlarında Rusya gibi güçlü bir devleti yenebilecek durumda olduğunu göstermektedir.",
            "1715-1718 OSMANLI -VENEDİK + AVUSTURYA SAVAŞLARI\n" +
                    "Nedenleri:\n" +
                    "\n" +
                    "Osmanlı’nın Karlofça Antlaşması ile kaybettiği yerleri geri almak istemesi\n" +
                    "Rusya’nın Prut’ta yenilmesinin ve Avusturya’nın da Avrupa’daki veraset savaşlarından yorgun çıkmasının Osmanlı’ya verdiği cesaret\n" +
                    "Katolik Venedik baskısına uğrayan Mora’daki Ortodoks Rum halkının Osmanlı’dan yardım istemesi\n" +
                    "Venediklilerin Akdeniz’deki Osmanlı gemilerine saldırmaları\n" +
                    " Venediklilerin kışkırtmasıyla Osmanlı’ya karşı Karadağ’da isyan çıkması\n" +
                    "Avusturya’nın Karlofça Antlaşmasının garantörü olarak Mora’nın ve Dalmaçya kıyılarını Venediklilere geri verilmesini istemesi\n" +
                    "Osmanlı Devletinin Avusturya’nın isteklerine karşı çıkması",
            "Savaş: Silahtar Ali Paşa Mora’yı geri aldı (1715).Korfu adası kuşatıldı. Ayrıca Dalmaçya kıyılarında yeniden toprak ka\u00ADzandı. Karlofça Antlaşması’nın bozulduğunu ileri süren Avusturya Osmanlı Devleti’ne savaş açtı. Osmanlı ordusu Macaristan’da yapılan Petervaradin Savaşını kaybetti (1716). Sadrazam Silâhtar Ali Paşa şehit oldu ve Osmanlı ordusu dağıldı. Temeşvar ve Belgrad Avusturyalıların eline geçti. Yeni Sadrazam Nev\u00ADşehirli Damat İbrahim Paşa barış yapılmasını uy\u00ADgun gördü. İngiltere ve Felemenk (Hollanda) hükümetle\u00ADrinin araya girmesiyle Venedik ve Avusturya ile PASAROFÇA ANTLAŞMASI imzalandı (1718).",
            "Maddeleri:\n" +
                    "\n" +
                    "Mora yarımadası ve Girit limanı Osmanlılarda ka\u00ADlacak\n" +
                    "Belgrat,Temeşvar,Küçük Eflak ,Banat Yaylası ve Kuzey Sırbistan Avusturya\u00AD’ya verilecek\n" +
                    "Dalmaçya ve Arnavutluk kıyılarındaki bazı limanlar Venediklilerin olacak \n" +
                    "Antlaşma 24 yıl yürürlükte kalacak",
            "Önemi ve Sonuçları:\n" +
                    "\n" +
                    "Toprak kazanma isteği toprak kaybıyla sonuçlandı.\n" +
                    "Orta Avrupa’daki Osmanlı varlığı tehlikeye düştü. Belgrat’ın elden çıkmasıyla (İlk kez) Avusturya’nın Balkanlardaki etkinliği artmıştır.\n" +
                    "Bunun üzerine Osmanlı Devleti şu önlemleri almıştır: Eflak ve Boğdan’ı Osmanlı’ya daha bağımlı hale getirmek için Fener’li Rumların ileri gelenleri yönetici olarak atanmıştır. Sınır boylarına seraskerler tayin edilmiştir. Balkan halkının vergi yükü hafifletilmiştir.Kaleler tamir edilerek sınır güvenliği sağlanmıştır.\n" +
                    "Avrupa devletlerinin yenilemeyeceği anlaşıldı. Osmanlı aydınının batıya bakışı değişti.Batının askeri ve teknik üstünlüğü kabul edilerek ilk batılılaşma hareketi (Lale Devri) başladı\n" +
                    "Arabuluculuk rollerinden dolayı Hollanda’ya bazı ticari ayrıcalıklar verildi.\n" +
                    "İlk kez Çelebi Mehmet zamanında başlayan Osmanlı-Venedik savaşları sona ermiştir. 1715 Osmanlı-Venedik Savaşı iki devlet arasındaki son savaş ve Pasarofça Antlaşması da son antlaşmadır. (Vene-dik bundan sonra çöküş sürecine girmiş 1797 Comp Formio antlaşmasıyla topraklarını Avusturya ve Fransa arasında paylaşılmıştır).\n" +
                    "Mora’nın Osm’a geçmesi ile Karlofça ilk kez aşıldı.\n" +
                    "Batı’da savunma durumuna geçildi ve batıda kaybettiği yerleri telafi etmek için fetih yönünü doğuya çevirdi. Batıda 20 yıl süren barış dönemi başladı.",
            "OSMANLI – İRAN SAVAŞLARI   (1722-1746)\n" +
                    "Nedenleri:\n" +
                    "\n" +
                    "Batı’daki toprak kayıplarının Doğu’dan telafi edilmek istenmesi.\n" +
                    "İran’da iç karışıklıkların çıkması.\n" +
                    "Şah Hüseyin’in Sünni halka baskı yapması üzerine Kafkasya ve Azerbaycan Sünnilerinin Osmanlı’dan yardım istemesi.\n" +
                    "Rusya’nın, Kafkasya’yı işgal ederek İran’ın içişlerine karışmasına engel olmak",
            "Osmanlı ve Rus kuvvetlerinin aynı anda Kafkaslarda bulunması, ayrıca Rusya’nın Hazar Denizi kıyılarını işgal ederek Şah Hüseyin’in oğlu Tahmasb’ı himayesine alması iki devlet arasındaki ilişkilerin gerginleşmesine neden oldu. Osmanlı orduları ile Rus orduları, Safevîlerin egemenliğinde olan Kafkasya’da karşı karşıya geldiler.  Fransa’nın aracılığıyla, sorun diplomatik yolla çözümlendi. Rusya ile Osmanlı arasında 1724’DE İSTANBUL ANTLAŞMASI imzalandı.",
            "Maddeleri:\n" +
                    "\n" +
                    "Dağıstan ve Hazar kıyıları Rusya’nın olacak\n" +
                    "Azerbaycan, Karabağ, Revan, Tebriz ve Gence Osmanlıların olacak.",
            "Önemi ve Sonuçları:\n" +
                    "\n" +
                    "Osmanlı-ile Rusya arasındaki ilk ittifak antlaşmasıdır.\n" +
                    "Böylece Osmanlı ile Rusya, İran’ın kuzey ve batı taraflarını kendi aralarında paylaştılar.\n" +
                    "Yeni Safevi Şahı II. Tahmasb, bu anlaşmayı tanımadı. Horasan’a giderek Afşar liderlerinden Ali Nadir Hanın yardımını sağladı. Saldırıya geçen İranlılar, Hemedan ve Tebriz’i aldılar.\n" +
                    "İran’ın kazandığı bu başarılar üzerine Osmanlı Devleti İran’a savaş ilân etti. Ancak, III. Ahmet ve Sadrazam Nevşehirli İbrahim Paşa, savaşa gitmek istemiyorlardı. İran sınırındaki yenilgiler ve ordunun İran üzerine gönderilememesi, İstanbul’da Patrona Halil Ayaklanmasının çıkmasının nedenlerinden biri oldu (1730)\n" +
                    "Patrona Halil İsyanı ile III.Ahmet baştan alına\u00ADrak yerine I. Mahmut getirilmesi ile etkisini artıran Osmanlı ordusu İran’ın eline geçen Tebriz ve Hemedan’ı geri aldı.\n" +
                    "Şah II.Tahmasb’ın barış teklifi üzerine Iran ile  1732’DE AHMET PASA ANTLAŞ\u00ADMASI imzalandı.",
            "Maddeleri:\n" +
                    "\n" +
                    "1- Osmanlı Kafkasya’yı  (Gence, Tiflis ve Dağıstan) alacak,\n" +
                    "\n" +
                    "2- Tebriz, Hemedan ve Kirmanşah İran’a verilecek\n" +
                    "\n" +
                    "Antlaşma İran’da tepkiyle karşılanmış ve Afşarların başında bulunan Nadir Han ayaklanarak II.Tahmasb’ın hükümdarlığına son vermiştir.\n" +
                    "Nadir Şah Kerkük, Musul ve Bağdat’a saldırdı. Savaşın uzaması her iki taraf için de yıpratıcı oldu.\n" +
                    "Nadir Han’ın isteği ile 1746’da, Kasr-ı Şirin’i esas alan Kerden (II.Kasr-ı Şirin) Antlaşması yapıldı. Bu antlaşma ile 1639 Kasr-ı Şirin Antlaşmasının sınırları kabul edilmiştir.",
            "Sonuçları:\n" +
                    "\n" +
                    "Osmanlı Devleti, Batı’da kaybettiği topraklan geri alamayınca, Doğu’ya yönelerek toprak kazanmaya çalışmıştı. Fakat, önemli bir başarı sağlanamadı ve doğu sınırında herhangi bir değişiklik yapılmadı.\n" +
                    "Osmanlı doğudan da toprak kazanamayacağını anladı. Doğu sınırında da savunma politikası başlatıldı. Bu tarihten itibaren İran ile önemli bir savaş yapılmadı ve günümüze kadar devam eden bir barış dönemi oluştu.\n" +
                    "Iran savaşlarının uzaması ve yöneticilerin zevk ve eğlenceye yönelmesi Osmanlı’da iç huzurun bozulmasına ve Patrona Halil İsyanı’nın çıkmasına neden oldu.\n" +
                    "İran savaşları, Osmanlı – Rus savaşlarının yeniden başlamasına da zemin hazırladı.\n" +
                    "Kafkaslarda Rus tehlikesinin artması üzerine Osmanlı ile İran Rusya’ya karşı dayanışma gereği duydular.",
            "1736-1739 OSMANLI – AVUSTURYA+RUSYA SAVAŞLARI\n" +
                    "Savaşın Nedenleri\n" +
                    "\n" +
                    "Rusya’nın, Osmanlılara İran savaşı için yardıma giden Kırım kuvvetlerini engellemesi\n" +
                    "Rusya’nın Lehistan içişlerine karışması (Bu sırada Lehistan’da Veraset Savaşları 1733-38 yaşanıyordu.)\n" +
                    "Rusya ve Avusturya’nın Osmanlı topraklarını ele geçirmek için aralarında gizli anlaşma yapmaları\n" +
                    "Balkanlardaki Ortodoks Osmanlı halkının Rusya tarafından kışkırtılması\n" +
                    "Avusturya’nın Sırbistan’ı ve Bosna ve Hersek’i almayı amaçlaması\n" +
                    "Rusya’nın Kırım’a saldırmaları ve Karadeniz’e inmek istemesi\n" +
                    "Osmanlı’nın Pasarofça ile Avusturya’ya bıraktığı toprakları geri almak istemesi",
            "Savaş:Osmanlı Rusların Kırım’a girmeleri üzerine, Rusya’ya savaş ilân etti. Osmanlı birlikleri Rusları Kırım’dan çıkar\u00ADdı\u00ADlar. Karadeniz’de bulunan Rus donanması imha edildi.  Diğer taraftan Bosna’yı almak isteyen Avusturya yenilgiye uğradı. Osmanlılar karşı taarruzla Belgrat’ı geri aldılar. Fransa’nın araya girmesiyle Avusturya ve Rusya ile Belgrat Antlaşmaları imzalandı. ",
            "AVUSTURYA İLE İMZALANAN BELGRAT  ANTLAŞMASI (1739) : Avusturya Temeşvar dışında Pasarofça antlaşması ile Osmanlılardan aldığı yerleri geri verdi.\n" +
                    "\n" +
                    "Rusya Avus\u00ADturya’nın savaştan çekilmesiyle yalnız kaldı. Bu sı\u00ADrada İsveç’te Osmanlı devletinden yana savaşa hazır\u00ADlandı. Bu durum karşısında Rusya ile Fransa’nın aracılığıyla İkinci Belgrat Antlaşması imzalandı (1739).",
            "Maddeleri :\n" +
                    "\n" +
                    "Azak kalesi yıkılacak, fakat Azak Rusya’nın ola\u00ADcak\n" +
                    "Rusya, Karadeniz’de savaş ve ticaret gemisi bu\u00ADlundurmayacak\n" +
                    "Rus çarı protokol bakımından Osmanlı padişahına , Avusturya impara\u00ADtoruna ve Fransa kralına eşit sayılacak\n" +
                    "Antlaşma 27 yıl geçerli olacak",
            "Önemi ve Sonuçları:\n" +
                    "\n" +
                    "Gerileme Dönemi’nin en karlı anlaşmasıdır .Osmanlı Devletinin Batıda imzaladığı son kazançlı antlaşmadır.\n" +
                    "Karadeniz’in Türk gölü olduğu son kez onaylandı.\n" +
                    "Rusya’nın Avrupa’nın güçlü devletlerinden biri ve kendisine denk ol\u00ADduğunu Osmanlı kabul etti.\n" +
                    "Belgrat antlaşmaları sırasında Fransa Osmanlıların lehine arabuluculuk yapmıştı. Bunun karşılığı olarak 1740 yılında I. Mahmut tarafından Fransa’ya verilen KAPİTÜLASYONLAR “sürekli” hale getirildi.\n" +
                    "Humbaracı Ahmet Paşa’nın ilk defa Avrupa’daki gelişmelerden etkilenerek yaptığı ıslahatların faydalarını görmüştür.\n" +
                    "Belgrat’ın alınması ile Osmanlı’nın Balkanlardaki güvenliği yeniden sağlanmıştır.",
            "1768 – 1774 OSMANLI – RUS SAVAŞI\n" +
                    "Nedenleri\n" +
                    "\n" +
                    "Çariçe II. Katerina’nın Petro’nun yayılmacı politi\u00ADkasını izlemesi.\n" +
                    "Rusya’nın Lehistan’ın içişlerine karışması ve ege\u00ADmenliğine almak istemesi\n" +
                    "Leh yurtseverlerinin Rusya’nın kendinden yana kral seçtirmesine karşı Rusya’ya direniş göstermeleri, Osmanlıdan yardım istemeleri.\n" +
                    "Lehli yurtseverlerin Osmanlı topraklarına sığın\u00ADma\u00ADları ve Rusların izlemek bahanesiyle Osmanlı toprak\u00ADla\u00ADrına girmesi.\n" +
                    "Rusların Osmanlılara bağlı olan Bosna ve Hersek’i Osmanlılar aleyhine kışkırtmaları",
            "Savaş:Rus kuvvetleri Kafkasya, Gürcistan, Ukrayna ve Ba\u00ADsarabya üzerine yürüdü. Hotin kalesini alarak Eflak, Boğdan’ı istila ettiler, Yaş ve Bükreş’i aldılar.Osmanlıdan yardım alamayan Kırım, Rus işgaline uğ\u00ADradı. 1771 yılında Baltık denizine de hazırlanan Rus do\u00ADnanması İngilizlerin yardımıyla Atlas Okyanusu ile Akdeniz’e gelerek Mora Rumlarını ayaklandırdı, isyan bastırılınca Ege Denizinde İzmir’in Çeşme limanına ani bir baskın düzenleyerek Osmanlı donanmasını yaktılar (Çeşme Baskını – 1771- 2. yakılış ). Ruslar Ege Denizine ege\u00ADmen oldular. Rusların bu başarılarının Avusturya’yı endişelendirmesi üzerine Avusturyalılar, Osmanlılar ile gizli bir anlaşma yaptılar. Buna göre; Avusturya, Eflâk ve Boğdan’ın kurtarılmasına yardım edecek; Osmanlılar da Avusturya lehine sınırda bazı değişiklikler yapacaktı. Prusya Kralı II. Frederik savaşa son vermek için Rusya ile görüşmelere başladı. Ancak anlaşma sağlanamayınca savaş yeniden başladı.Ruslar, Rusçuk ve Silistre’yi işgal ettiler, Akdeniz’deki donanmaları da Mısır’da isyancılara yardım etti. III. Mus\u00ADtafa üzüntüden öldü, yerine I. Abdülhamit geçti.Ruslar Şumnu yöresinde Osmanlı ordusunun üze\u00ADrine yürüdüler. Sadrazam Muhsinzade Mehmet Paşa güçlü Rus ordularına karşı konulamayacağını gördü. Barış iste\u00ADmek zorunda kaldı. Küçük Kaynarca Antlaşması imza\u00ADlandı. (1774)  ) (I.Abdülhamit Dönemi)",
            "KÜÇÜK KAYNARCA ANTLAŞMASI MADDELERİ   (1774)\n" +
                    "1-   Kırım’a bağımsızlık verilecek, Kırım sadece dini bakımdan halifeye (padişah) bağlı kalacak.\n" +
                    "√ İlk defa halkı tamamen Türk ve Müslüman olan bir toprak kaybedildi.\n" +
                    "√ Rusya Kırım’ı elde etmek için önemli bir adım attı.\n" +
                    "√ Osmanlı Devleti ilk defa devletler arası siyasi ilişkilerde halifeliğin gücünden yararlanmak istemiştir.\n" +
                    "√ Böylece Kırım ile dini ve kültürel bağını devam ettirilerek bölgedeki etkinlik sürdürülmek istenmiştir.",
            "2-Azak kalesi,Kabartay bölgesi,Yenikale,Kerç,Kılburun kaleleri Dinyeper ile Buğ ırmakları arasındaki araziler Ruslara bırakılacak\n" +
                    "√ 1. ve 2. maddelerle Osmanlı Devleti,Karadeniz kıyılarını bir daha alamamak üzere kaybetti.",
            "3-Rusya, Osmanlı yönetimindeki Ortodokslarla Eflak ve Boğdan beylerinin haklarını koruyabilecek.\n" +
                    "\n" +
                    "√ Osmanlı Devleti Ortodoksların koruyuculuğunu Ruslara bıraktı\n" +
                    "\n" +
                    "√ Rusya Osmanlı Devleti’nin içişlerine karışma hakkı elde etti.\n" +
                    "\n" +
                    "√ Rusların Panslavizm politikasına zemin hazırlandı",
            "4-Rusya Karadeniz’de donanma bulundurabilecek ve ticaret gemileri serbestçe boğazlardan Akdeniz’e geçebilecekti.\n" +
                    "\n" +
                    "√ Karadeniz Türk gölü olma özelliğini kaybetti.\n" +
                    "\n" +
                    "√ Karadeniz’in kuzey sahilleri Rus denetimine girdi.\n" +
                    "\n" +
                    "√ Ruslar ilk defa boğazlardan sıcak denizlere inme imkanı elde ettiler.\n" +
                    "\n" +
                    "√ Rusların güney yönünde genişlemesine zemin hazırladı.",
            "5-Rusya, kapitülâsyonlardan yararlanacak,\n" +
                    "\n" +
                    "√ Rusya ilk defa kapitülasyonlardan yararlanma hakkını elde etti.",
            "6-Rusya, İstanbul’da devamlı elçi bulundurabilecek ve gerekli gördüğü yerlerde konsolosluk açabilecekti.\n" +
                    "\n" +
                    "7-      Osmanlı Devleti, Rusya’ya savaş tazminatı ödeyecekti.\n" +
                    "\n" +
                    "√ Osmanlı Devleti tarihinde ilk defa savaş tazminatı ödedi.",
            "8-Rusya savaş sırasında işgal ettiği Eflak, Boğdan ,Beserebya ve Akdeniz’deki adarlı Osmanlı Devletine geri verecekti.Osmanlı Devleti de buralarda genel af ilan edecek,halktan bir süre vergi almayacak,halk istediği yere göç edebilecekti.Rus Hıristiyanları kutsal yerleri ziyaret edebilecekti.\n" +
                    "\n" +
                    "√ Rusya bununla bu bölgelerin halkını kendine bağlamayı amaçlamıştır.\n" +
                    "\n" +
                    "√ Rusların Balkanlardaki azınlıkları kışkırtmasına zemin hazırlamıştır.",
            "Önemi ve Sonuçları:\n" +
                    "\n" +
                    "Osmanlı Devleti Dünyanın sayılı devletlerinden olma özelliğini kaybetti.\n" +
                    "Yüzyılda imzalanan en ağır antlaşmadır.\n" +
                    "Diplomasi bakımından yardım ettiği için Avusturya’ya Bukovina arazisi verildi.\n" +
                    "Bu antlaşma ile Kırım, Osmanlı toprağı olmaktan çıktı ve Balkanlar, Rus tehlikesine açık bir duruma geldi.",
            "1779 AYNALIKAVAK TEHKİHNAMESİ  (I. ABDÜLHAMİT )\n" +
                    "Bağımsız kalan Kırım’ın hanını halk seçecekti.Rus taraftarları Kırım’da Devlet Giray’a karşı isyan çıkardılar.Rus ordusu Kırım’a girdi ve Rus taraftarı olan Şahin Giray’ın Kırım tahtına çıkmasını sağlamıştır. Halk Şahin Giray’a isyan etti.Osmanlı devleti, Kırım halkının yardım istedi.Osmanlı Devleti,anlaşmaya aykırı olarak Rusların faaliyetlerine seyirci kalamayacağını Ruslara bildirdi. Fransa’nın arabuluculuğu ile Aynalıkavak Tehkihnamesi ( düzenlemesi) imzalandı.",
            "Maddeleri:\n" +
                    "1- Ruslar Kırım’dan askerini üç ay içinde çekecek.\n" +
                    "2- Osmanlı devleti Şahin  Giray’ın hanlığını tanıyacak.\n" +
                    "Sonuç: Rusya Kırım meselesinde nüfuz kazanmıştır.\n" +
                    "Şahin Giray’ın Rusya ile birlikte hareket etmesi üzerine Kırım halkı isyan etti. Şahin Giray Rusya’ya sığındı. Kırım’daki isyanı bahane eden II. Katerina,Kırım’a ordu göndererek Kırım’ı Rusya’ya kattığını ilan etti (1783). Savaşacak gücü olmayan Osmanlı Devleti bu olaya ses çıkaramadı. Kırım’ın Ruslar tarafından işgal edilmesinden sonra Rus ordusu burada Türklere karşı büyük çaplı bir katliama girişti. Çok sayıda Kırım Türk’ü Rus baskısından kaçarak Türkiye’ye sığınmak zorunda kaldı. Kırım’a, Ruslar ve diğer Hıristiyan göçmenler yerleştirildiler.",
            "1787- 1792 OSMANLI – RUSYA+AVUSTURYA SAVAŞLARI\n" +
                    " Sebepleri:\n" +
                    "\n" +
                    "Osmanlı Devleti’nin Kırım’ın Ruslar tarafından işgalini unutamaması.\n" +
                    "Osmanlı’nın Rusya’nın genişlemesine engel olmak istemesi\n" +
                    "Rusların antlaşmalara uymaması ,\n" +
                    "Rusya ve Avusturya Osmanlı Devletinin Balkan topraklarını paylaşma konusunda anlaşmaları (Grek Projesi) .Buna göre ;a) Eflak ve Boğdan’da Bir Daçya devleti kurulacak , b) Sırbistan , Bosna ve Hersek Avusturya’ya bırakılacak , c) Bizans İmparatorluğu yeniden kurulacaktı\n" +
                    "Bu gelişmeler Osmanlı Devleti’nin toprak bütünlüğünden yana olan İngiltere’yi endişelendirdi. Anlaşmayı haber alan Osmanlı Devleti zaten Kırım’ın acısını unutamadığından İngiltere ve Prusya’nın da kışkırtması ile Rusya’ya savaş ilan",
            "Savaş:Rusya ile anlaşma yapmış olan Avusturya da Belgrat Antlaşması ile kaybettiği yerleri geri almak için savaşa katılınca Osmanlı Devleti her ikisine karşı savaşmak zorunda kaldı.\n" +
                    "\n" +
                    "Avusturya, Bosna’yı; Rusya, Boğdan’ı işgal etti. Rus ve Avusturya orduları, Osmanlı ordusunu yenilgiye uğrattılar. Ruslar;Yaş,Hotin ve Özi kalelerini alarak bölgedeki halkı katlettiler. Bu dürüme çok üzülen I.Abdülhamit vefat ettiYerine III. Selim geçti (1789). III.Selim yenilikler yapılması gerektiğine inanıyor idi.Bu nedenle barış ortamı sağlamak istiyordu.Bu sırada Lehistan halkı da Osmanlı Devleti’ne karşı ayaklanmıştı. Prusya’nın Osmanlı Devleti’ne yakınlaşması ve Fransa’da ihtilalin meydana gelmesi ile Avusturya’da olumsuz etkilerinin görülmesi ve Osmanlı Devleti’nin Prusya ve İsveç’le ittifak yapması üzerine Avusturya Osmanlı Devletiyle ZİŞTOVİ ANTLAŞMASI’NI imzalayarak (1791) Rusya’yı yalnız bıraktı.",
            "Maddeleri :\n" +
                    "1- Avusturya savaştan önceki sınırlarına çekilecek\n" +
                    "2- Osmanlı –Rus Savaşlarında Avusturya tarafsız kalacak\n" +
                    "NOT: Bundan sonra Avusturya ile Osmanlı Devleti arasında ciddi bir savaş olmamış, hatta I. Dünya Savaşında Osmanlı Devletiyle birlikte savaşmıştır.\n" +
                    "NOT: Fransız İhtilalinin yaydığı “Milliyetçilik” akımından en çok etkilenen iki devlet Avusturya ve Osmanlı Devleti’dir.\n" +
                    "Ziştovi Antlaşmasından sonra tek başına kalan Rusya ile savaş 1792’ye kadar sürdü. Sonuçta YAŞ ANTLAŞMASI imzalandı (1792).",
            "Maddeleri:\n" +
                    "\n" +
                    "Osmanlı Devleti Kırım’ın Rusya’ya ait olduğunu kabul etti.\n" +
                    "Dinyester nehri iki devlet arasında sınır olacak ( Akkerman ,Kili ve İsmail kaleleri Osmanlıların , Özi kalesi Rusların )\n" +
                    "Gürcistan Rusya’nın egemenliğinde olacak\n" +
                    "Eflâk ve Boğdan’ın ayrıcalıkları devam edecekti\n" +
                    "Osmanlı Devleti, Rus ticaret gemilerini Cezayir ve Tunus korsanlarına karşı koruyacaktı. Koruyamazsa ve Rus ticaret gemileri zarar görürse, Osmanlı Devleti zararı ödeyecekti.",
            "Önemi:\n" +
                    "Osmanlı Devleti Kırım’ı geri alamadığı gibi, yeni toprak kayıplarına uğradı.\n" +
                    "Böylece kaybettiği toprakları geri almak ümidini tamamen yitiren Osmanlı Devletinde Gerileme Dönemi sona erdi, Dağılma dönemi başladı.\n" +
                    "Bu atlaşma ile ortaya çıkan barış ortamı III.Selim ıslahatlarına zemin hazırlamıştır.",
            "1798-1801 OSMANLI – FRANSA SAVAŞI(NAPOLYON’UN MISIR’IN İŞGALİ)\n" +
                    "Sebepleri:\n" +
                    "Fransızların Akdeniz’i Fransız gölü haline getirmek ve İngilizlerin Hindistan’a giden sömürge yollarını kesmek istemeleri\n" +
                    "Dağılmakta olan Osmanlı Devleti’nden pay alma düşüncesi\n" +
                    "Napolyon’un merkezden uzaklaştırılmak istenmesi\n" +
                    "Fransızların Yedi Yıl Savaşları (1756-1763) sonunda Amerika ve Okyanuslarda İngiltere’ ye kaptırdığı yerleri telafi etmek istemesi\n" +
                    "Fransa’nın Mısır’ın zenginliklerinden ve ticari imkanlarından yararlanmak istemesi.\n" +
                    "Fransa Arnavutluk’taki bazı kıyıları ele geçirince Osmanlı Devleti ile komşu oldu. Fransızlar hem Osmanlı’nın Balkan Milletlerini bağımsız olmaya teşvik ediyor, hem de sömürgecilik faaliyetine başlıyorlardı.",
            "Savaş:Napolyon Bonapart yönetimindeki Fransız kuvvetleri, 1798’de İskenderiye’ye çıktı ve Osmanlı kuvvetlerini yenerek Kahire’yi işgal ettiler. Osmanlı Devleti, bu durum üzerine, İngiltere ve Rusya ile bir anlaşma yaparak Fransa’ya savaş ilân etti. Rus donanması tarihinde ilk defa Boğazlardan geçti.İngiliz ve Rus donanmaları Akdeniz’e girdi. Amiral Nelson komutasındaki İngiliz donanması, anî bir baskınla, İskenderiye limanı yakınlarındaki Ebukır denilen yerde, Fransız donanmasını yaktı (1798). Donanması yok olan Napolyon, Osmanlı Devleti’ni barışa zorlamak için Suriye üzerine yürüdü. Burada Akka Kalesi’ni kuşatan Napolyon, Cezzar Ahmet Paşa komutasındaki Nizâm-ı Cedit askerleri tarafından yenilgiye uğratıldı. Bu yenilgi üzerine Napolyon, yerine General Kleber’i bırakarak gizlice Fransa’ya gitti. Bir süre sonra Osmanlı ordusu Mısır’a girdi. 1802’de Fransa EL- ARİŞ ANTLAŞMASI’nı (1801) imzalamak zorunda kaldı.",
            "Maddeleri:\n" +
                    "1- Fransızlar Mısır’ı boşaltarak Osmanlı Devleti’ne iade edecekler\n" +
                    "2- Mısır’daki Fransa askerleri İngiliz gemileriyle Fransa’ya taşınacak",
            "Sonuçları:\n" +
                    "1)Fransa Mısır seferinden istediği sonucu alamadı\n" +
                    "2)İngiltere Hindistan sömürge yollarının güvenliğini kuvvetlendirdi.\n" +
                    "3)Rusya ilk defa boğazlardan savaş gemilerini geçirdi ve Balkan milletleri üzerinde etkinlik kazandı.\n" +
                    "4)III.Selim’in yaptığı ıslahatların başarılı olduğu görüldü.\n" +
                    "5)Topraklarını tek başına koruyamayacağını gören Osmanlı Devleti denge politikası izlemeye başlamıştır.\n" +
                    "6) Bu olaydan sonra Osmanlı Devleti Avrupa’da sürekli elçilik açmaya başladı.",
            "8. YÜZYIL ISLAHAT HAREKETLERİ\n" +
                    "LALE DEVRİ ISLAHATLARI (1718- 1730)\n" +
                    "III. Ahmet(1703-1730)\n" +
                    "1711 Prut Ant. ile Rusya’dan kaybedilen yerler geri alınmıştır.\n" +
                    "1716 Venedik’ten Mora geri alınmıştır.\n" +
                    "1718 Pasarofça Ant. ile Avusturya’ya Belgrat ve Orta Macaristan kaptırılmıştır.\n" +
                    "1722 İran ile savaşlar yeniden başlamıştır.\n" +
                    "1724 İran’a karşı Rusya ile İstanbul Antlaşması ile ittifak yapılmıştır.\n" +
                    "Nevşehirli Damat İbrahim Paşa etkili olmuş  ne padişah ne de paşalar sefer çıkmamıştır,",
            "1718 Pasarofça Antlaşmasından 1730 Patrona Halil İsyanı’na kadar geçen zamana Lâle Devri denir.\n" +
                    "Bu dönemin padişahı III. Ahmet, Sadrazamı Nevşehirli Damat İbrahim Paşa’dır.Şairi Nedim, minyatürcüsü Levni, en önemli eseri ise Sadabat Köşkü’dür.",
            "Islahatlar \n" +
                    "\n" +
                    "Haliç ve Boğaziçi kıyılarında birçok eğlence yeri ve köşk yapıldı. Bunların en önemlisi, Sâdâbât köşkü ve bahçesiydi.\n" +
                    "İlk kez Avrupa devletlerinin önemli merkezlerine geçici elçiler gönderildi. Yirmi sekiz Çelebi Mehmet de Paris’e elçi atandı. Elçilere, Avrupa’nın incelenmesi ve Türkiye’de uygulanması mümkün yeniliklerin yazılması bildirildi. Osmanlı Devleti, elçilikleri kurmakla; Avrupa’daki teknik, bilimsel ve sosyal gelişmeleri takip etmeyi ve Avrupa devletlerinin politikalarını öğrenmeyi amaçlamıştır.",
            "Avrupa’dan alınan ilk teknik araç, matbaa oldu. Yirmi sekiz Çelebi Mehmet, Paris’e giderken oğlu Sait Efendi’yi götürmüştü. Sait Efendi, orada matbaayı tanıdı. Türkiye’ye dönünce, Macar asıllı İbrahim Müteferrika ile birlikte matbaanın açılması çalışmalarına başladılar. Sadrazam Nevşehirli İbrahim Paşaya, matbaanın yararları üzerine bir rapor sundular. Böylece ilk Türk matbaası açılmış oldu (1727). Matbaada ilk olarak, Vanlı Mehmet’in Sihah-î Cevheri adındaki sözlüğü (Vankulu Sözlüğü) basıldı.İbrahim Müteferrika’nın evinde kurulan bu ilk Osmanlı matbaasında dini kitaplar hariç tarih, coğrafya ve edebiyata ait bazı kitaplar basılmıştır. Matbaada basılan ilk eser Vankulu Lügati adlı sözlüktür. Osmanlı Devleti’nde binlerce insan hattatlık yaparak geçimlerini sağlıyordu. Bu insanları mağdur etmemek amacıyla devlet önceleri matbaada dini kitapların basımını yasaklamıştır.",
            "Yeniçerilerden itfaiye bölüğü (Tulumbacılar Ocağı) kuruldu (1720) .\n" +
                    "Lâle Devrinde İstanbul’un imarına çalışıldı. Fransız mimarîsi (Barok ve Rokoko tarzı) örnek ılınarak birçok yapı inşa edildi. Bu dönemde yapılan eserlerin en özgün olanı III. Ahmet Çeşmesi’dir. Osmanlı mimarisinin Avrupa mimarisinin etkisinde kalması sonucunda sivil mimari ön plana çıkmıştır.\n" +
                    "İbrahim Paşa, çiniciliğin kaybolmakta olduğunu görerek bu sanatı geliştirmeye çalıştı. İznik ve Kütahya’dan ustalar getirilerek İstanbul’da çini imalâthanesi açıldı.",
            "Tercüme heyeti oluşturularak Doğu klâsiklerinden ve Aristo’dan tercümeler yapıldı.\n" +
                    "Dış ticaretin geliştirilmesine ve bu yolla ülkeye para girmesine çalışıldı.\n" +
                    "Yalova’da bir kâğıt fabrikası kuruldu.\n" +
                    "İlk defa çiçek hastalığı için aşı bulunmuştur.\n" +
                    "İstanbul’da yeni kütüphaneler açıldı. Bunların en önemlisi Topkapı sarayı’nda açılan Enderun Kütüphanesi ile Yeni Cami kütüphanesidir.\n" +
                    "Askeri alanda esaslı bir ıslahat görülmedi.Sınırda bazı kaleler  ve istihkamlar yaptırıldı. Ayrıca İstanbul surları onarıldı.",
            "Lale Devri Islahatlarının Önemi:\n" +
                    "1)   İlk kez bu dönemde Avrupa’nın üstünlüğü kabul edilerek  Avrupa’daki yeniliklerden faydalanılma yoluna gidilmiştir.\n" +
                    "2)  Bilim, teknik, sanat ve kültürel alanlar çoğunlukta olmak üzere yapılan ıslahatlarda ilk defa Avrupa etkisi görülmüştür.\n" +
                    "3)  Askeri alanda ıslahat yapılmamıştır.\n" +
                    "4) Bu dönemde Avrupa ile savaş yaşanmamış, barış içinde yaşamak fikri ortaya çıkmıştır. Sadece İran ile savaşılmıştır.\n" +
                    "5)  Osmanlı Devleti’nde batı tarzı mimari eserler inşa edilmesi sivil mimariyi ön plana çıkarmıştır.",
            "PATRONA HALİL İSYANI (1730)\n" +
                    "İsyanın Nedenleri\n" +
                    "1)      Zevk ve eğlenceye yönelen yöneticilerin halk tarafından hoş karşılanmaması\n" +
                    "2)      Zaraydaki lüks harcamalrın artması\n" +
                    "3)      Artan giderleri karşılamak için, halktan yeni vergiler alınması .Bu durumun, üretiminde artış olmayan halkın daha fazla yoksullaşmasına neden olması\n" +
                    "4)      Bu dönemde getirilen ticaret vergisi, esnaf ve tica\u00ADretle uğraşan yeniçeriler tarafından iyi karşılanmaması\n" +
                    "5)      Doğu’da İran ile savaşların başlaması ve yöneticilerin bu savaşa önem vermemesi\n" +
                    "6)      Sadrazam Nevşehirli Damat İbrahim Paşa’nın sefere gitmemesi\n" +
                    "7)      Nevşehirli İbrahim Paşanın; oğlunu, damatlarını ve yakınlarını yüksek görevlere getirmesi, kendini çekemeyenlerin sayısının artmasına neden olması\n" +
                    "8)      İbrahim Paşa\u00ADnın düşmanları toplumda ekonomik ve sosyal huzursuzluğu kullanarak halkı isyana teşvik etmeye başlamaları\n" +
                    "9)      Pasarofça Göçmenlerinin sorun oluşturması\n" +
                    "10)  İşşizlik sorunun artması ve genel ekonomik çöküntünün büyümesi.",
            "İsyan: Uzun süredir fırsat bekleyen Patrona Halil çevresinde topladığı ki\u00ADşilerle isyan başlattı. İbrahim Paşadan memnun olmayanların ve ekonomik sıkıntılar nedeniyle işsiz kalan, buna karşılık saray ve ulema çevre\u00ADsinin lüks içinde yaşamasına kızan halkın da katılmasıyla sayıları artan isyancılar saraya saldırdılar. İsyancıların isteği üzerine III. Ahmet, Nev\u00ADşehirli İbrahim Paşayı ve yakınlarını idam ettirmek zorunda kaldı. İsyan\u00ADcılar, bununla da yetinmedi ve III. Ahmet’i tahttan indirip yerine I. Mahmut’u padişah yaptılar (1730).",
            "Sonuçları:\n" +
                    "1)      Lale Devri sona erdi.\n" +
                    "2)      İsyancıların isteği ile Nevşehirli Damat İbrahim ve Yakınları idam edildi.\n" +
                    "3)      İsyan sırasında şehir tahrip edildi. İsyancılar Sadabad Köşkü’nü yaktılar.\n" +
                    "4)      Divan şairlerinden Nedim de isyan sırasında öldü.\n" +
                    "5)      Edirne İsyanı ile padişah olan III.Ahmet’i tahttan indirerek I.Mahmut’u padişah yaptılar.",
            "I. MAHMUT DÖNEMİ (1730-1754) ISLAHATLARI\n" +
                    "\n" +
                    "1732 İran ile Ahmet Paşa Ant. yapıldı.\n" +
                    "1736-1739 Osmanlı-Rus+Avusturya Savaşları sonucunda  Avusturya ve Rusya ile Belgrat Ant. ile Osmanlı son kez Karadeniz’İ Türk gölü yapmış ve şerefini korumuştur.\n" +
                    "1740 Yılında Fransızlara verilen Kapitülasyonlar sürekli hale getirildi.\n" +
                    "1746-İran ile II.Kasr-ı Şirin Ant. imzalanmıştır.\n" +
                    "Bu dönemde askerî daha çok alanda ıslahat yapıldı.\n" +
                    "İlk defa Avrupalı yabancı askerî uzmanlardan yararlanıldı.\n" +
                    "Bu sırada Osmanlı hizmetine giren ve aslen Fransız olan Humbaracı Ahmet Paşa (Kont Dö Boneval) Osmanlı ordusunun ıslahına çalıştı.",
            "Islahatlar\n" +
                    "\n" +
                    "Humbaracı Ahmet Paşa ,Humbaracı Ocağı’nı kurdu.\n" +
                    "Humbaracı Ahmet Paşa ,ordunun ıslahı için raporlar hazırladı. Not:Humbaracı Ahmet Paşanın hazırladığı rapor ve plânlar, 1736 yılında Osmanlı-Avusturya savaşında uygulandı ve başarı kazanıldı.\n" +
                    "Subay yetiştirmek amacıyla Hendesehane (Kara Mühendis hanesi)’ni kurdu (1734). (Avrupa tarzında ilk teknik okul).\n" +
                    " Emrindeki kıtaları Avrupa ordularının düzenine göre örgütledi. Bölük, tabur ve alay örgütlerini kurdu.\n" +
                    "Halk kütüphaneleri açılmıştır.\n" +
                    " Osmanlı Devleti’nde Avrupa tarzında ilk askeri ıslahatlar bu dönemde yapıldı.\n" +
                    "Yapılan ıslahatların olumlu etkisi 1736-39 Osmanlı-Rus+ Avusturya Savaşları’nda görüldü.",
            "III. MUSTAFA(1757-1774) DÖNEMİ ISLAHATLARI\n" +
                    "\n" +
                    "Lehistan korunmak istenmiş bu nedenle de 1768-1774 Rusya ile savaşlar yapılmıştır.\n" +
                    " 1770 Çeşme’de Ruslar Osmanlı donanmasını yakmışlardır.\n" +
                    "Savaş Osmanlı Devleti için felaketle sonuçlandı. III. Mustafa kederinden öldü.(1774)\n" +
                    "Islahatlar Sadrazam Koca Ragıp Paşa ve Macar asıllı Baron Dö Tot’un öncülüğünde yapıldı.",
            "Islahatlar\n" +
                    "1)  III.Mustafa lüzumsuz masrafları keserek maliyede ıslahatlar yaptı.\n" +
                    "2) İlk defa bu dönemde iç borçlanma sistemi (ESHAM ) uygulandı.\n" +
                    "3) Fransızca’dan matematik ve astronomiye ait kitaplar tercüme edildi.\n" +
                    "4)  Avrupa’daki gelişmeleri öğrenmek amacıyla Fransa’ya ve Almanya’ya elçiler gönderildi.\n" +
                    "5)  III. Mustafa, Baron do Tot’u, Topçu Ocağının ıslahı ile görevlendirdi. Baron do Tot, tophaneyi ıslah edip ağır toplar yerine hafif toplar döktürdü.\n" +
                    "6)  Artan top ihtiyacının karşılanması için Hasköy’de modern bir top dökümhanesi kuruldu.\n" +
                    "7)  Sürat Topçuları adında yeni bir ocak kuruldu.\n" +
                    "8)   Çeşme faciasından sonra donanma da ele alındı, gemi inşaatı hızlandırıldı.\n" +
                    "9)    Deniz Mühendishanesi (Mühendishane-i Bahrî-i Hümâyun) açıldı. (1773).",
            "I. ABDÜLHAMİT DÖNEMİ  (1774-1789)ISLAHATLARI\n" +
                    "\n" +
                    " Küçük Kaynarca Antlaşması imzalandı.(1774)\n" +
                    " 1779 Aynalıkavak Tenkihnamesi ile Rus Çariçesi II. Katerina Kırımın başına kendi istediği Şahin Giray hanı seçtirmeyi  başarmış 1783’de de Kırımı resmen işgal etmiştir.\n" +
                    "Rusya ve Avusturya birleşip *Grek Projesi* ile Osmanlıyı Avrupa’dan atmak için saldırırlar. 1787-1792 Osmanlı-Rus+Avusturya savaşı başladı. 1789’da ölümüyle yerine III.Selim geçti.\n" +
                    "√ Kara ve Deniz kuvvetlerin ıslah etmek için Avrupa’dan çok sayıda mühendis ve uzman getirildi. Bu dönemde, önceki dönemlerden farklı olarak getirilen yabancı askerî uzmanların Müslüman olma koşulu ve kıyafetleri konusundaki kısıtlamalar kaldırıldı .\n" +
                    "I. Abdülhamit’in bu dönemde yaptığı ıslahatlar, daha çok askerî alanda yoğunluk kazandı.\n" +
                    "I. Abdülhamit’e, Sadrazam Halil Hamit Paşa ve Kaptanıderya Cezayirli Gazi Hasan Paşa yardımcı oldular.Ayrıca Baron Dö Tıt da çalışmalarına devam etmekteydi.",
            "Islahatlar\n" +
                    "1-  Cezayirli Gazi Hasan Paşa, modern gemi yapımı ve çağdaş denizci yetiştirme amacına yönelik çalışmalar yapmak için Haliç, Karadeniz ve Ege kıyılarında yeni tersaneler inşa ettirdi.\n" +
                    "2-Denizcilik meslek durumuna getirildi. Levent teşkilatına son verilerek Anadolu’dan denizci asker yazımına son verilmiştir. Ege ve Akdeniz köylerinden toplanan gençler, tersane kışlasında, Sinop ve Midilli’de eğitilerek denizci yetiştirildiler.\n" +
                    "3- Sadrazam Halil Hamit Paşa, kara ordusunun ıslahına önem verdi. Rumeli’de sınır kalelerini onartıp yenilerini yaptırdı.\n" +
                    "4- Baron do Tot’un kurduğu sürat topçuları birliği canlandırıldı.\n" +
                    "5-   İstihkam Okulu açıldı.\n" +
                    "6-  Sürat Topçuları, Lağımcı ve Humbaracı ocaklarının gelişmesi sağlandı.\n" +
                    "7- Tımar sahiplerini denetlemek için, illere denetçiler gönderildi.\n" +
                    "8- Yeniçerilerin sayımı yapıldı. Eğitim ve disiplin kabul etmeyen yeniçeriler, ocaktan atıldı. Ulufe alım-satımı yasaklandı.\n" +
                    "9-  Halil Hamit Paşa tarafından ekonomiyi güçlendirmeye yönelik önlemler alındı. Fakat başarılı olunmadı.\n" +
                    "10-  Paranın değerini yükseltmek ve fiyatları dondurmak için emirler çıkarıldı.\n" +
                    "11-  Yerli mal tüketimi özendirildi.",
            "III. SELİM DÖNEMİ ISLAHATLARI (NİZAM- I CEDİT DEVRİ) (1789-1807)\n" +
                    "\n" +
                    "Başa geçtiğinde Osmanlı Devletiyle Rusya+Avusturya savaşı devam ediyordu.(1787-1792)\n" +
                    "1789’da Fransız ihtilali çıktı. Bunun üzerine Avusturya 1791’de savaştan çekilerek Ziştovi Antlaşmasını imzaladı.Tek başına kalan Rusya da 1792’de YAŞ antlaşmasını imzaladı. Kırım tamamen Rusya’ya bırakıldı.\n" +
                    "1798 Napolyon Mısır’ı işgal etti. Napolyon’a karşı İngiltere ve Rusya ile ittifak antlaşmaları yapıldı.Nizamı Cedit Fransız ordusunu AKKA’da yendi. Fransızlar Mısır’dan çekildi. 1801 Fransa ile el Ariş antlaşması imzalandı\n" +
                    "Fransız ihtilalinin etkileri Osmanlı Devletinde görülmeye başlandı. 1804’de Sırp İsyanı çıktı.1806-1812 Osmanlı Rus Savaşı başladı.\n" +
                    "1807’de Kabakçı Mustafa Olayı ile tahttan indirildi.\n" +
                    "III. Selim, 1791 Ziştovi Antlaşması’nın imzalanmasından sonra, Avrupa hakkında bilgi sahibi olmak amacıyla, dönemin bilim adamlarından Abukır Ratıp Efendiyi, elçi olarak Viyana’ya gönderdi. Ratıp Efendi, Avusturya’da görüp incelediklerini bir rapor hâlinde, III. Selim’e sundu. Bu raporda, güçlü bir devlet olabilmenin iyi bir yönetim ve yetkili bir kadroya sahip olmak, dış ülkelerle iyi ilişkiler kurmak, halkın refahının sağlanması ve dolu bir hazine ile mümkün olabileceği belirtiliyordu.\n" +
                    "En ciddi anlamda batıyı örnek alarak  ıslahat yapmıştır.",
            "Islahatlar\n" +
                    "1)   III. Selim, ilk olarak Yeniçeri Ocağı’nı ele aldı. Yeniçerilere, haftanın belirli günlerinde eğitim zorunluluğu getirildi. Yeniçerilerin sayısında azaltma yapılıp ücretleri yükseltildi.\n" +
                    "2)  Topçu, humbaracı ve lâğımcı ocakları, ordunun teknik sınıfları durumuna getirildi.\n" +
                    "3)  Mühendishane-i Berri Hümayun ve Mühendishane-i Bahri Hümayun geliştirildi.\n" +
                    "4)  Nizam-ı Cedit ordusu kuruldu. Bu orduyu eğitmek için Fransa, Prusya ve İngiltere’den danışmanlar getirildi. Yeni ordunun giderlerini karşılamak için İrâd-ı Cedit hazinesi ve İrad-ı Cedit Defterdarlığı kuruldu.Bu birliğin eğitimi için Selimiye ve Levent Kışlaları kuruldu.\n" +
                    "İlk askeri başarısını Akka savunması’nda kazandı.\n" +
                    "5) Denizciliğe önem verildi. Tersaneler yeni baştan ele alınarak, onarıldı ve çalışır duruma getirildiler.\n" +
                    "6) Resmi devlet matbaası kuruldu.",
            "7) İdarî alanda düzenlemeler yapıldı. Avrupa devletleriyle ilişkilerde, ittifaklar ve denge sisteminin önemi anlaşıldı.\n" +
                    "8)  Londra, Paris, Viyana ve Berlin’de sürekli elçilikler kuruldu.\n" +
                    "9)  Halkın yerli malı kullanması için Avrupalıların, ülke içinde ticaret yapmaları yasaklandı.\n" +
                    "10)  Osmanlı ticaret filosunun çoğaltılması için önlemler alındı.\n" +
                    "11)  İlmiye sınıfının ıslahı için çalışıldı.Yeni kitaplar tercüme edildi.\n" +
                    "12)  Fransızca devletin ilk resmi yabancı dili haline getirildi.",
            "NOT: III. Selim dönemindeki Nizan-ı Cedit Islahatları ;Yeniçerilerin tepkileri , İrad-ı Cedit Hazinesi’nin halka yeni vergiler yüklemesi ve bunun tepkiyle karşılanması , yabancı elçilerin olumsuz propagandaları sonucunda Kabakçı Mustafa Paşa isyanı ile öldürülünce bu dönem sona ermiştir.",
            "18. YÜZYIL ISLAHATLARININ GENEL ÖZELLİKLERİ\n" +
                    "1)  Osmanlı Devleti, Avrupa’nın gerisinde kaldığını anlamış ve Avrupa’yı örnek alarak yenilikler yapmıştır.\n" +
                    "2)  Islahat hareketleri padişah ve devlet adamlarının öncülüğünde yürütülmeye çalışıldı.Halkın ıslahatlar konusunda bir isteği ve desteği olmamıştır.\n" +
                    "3) Savaşların yenilgiyle sonuçlanması ve toprak kayıplarının devam etmesi, ıslahatların askeri alanda yapılmasına neden olmuştur.\n" +
                    "4) Islahatlar, gösterilen tepkiler yüzünden (özellikle yeniçerilerin) devamlı olmamıştır.\n" +
                    "5) XVII. yüzyıl ıslahatlarına göre daha esaslı ıslahatlar yapılmıştır. Ancak, ıslahatlarla amaçlanan hedefler gerçekleştirilememiş ve devlet çöküntüden kurtarılamamıştır.\n" +
                    "6)  Yenilik çalışmalarında ilk kez batılı uzmanlardan faydalanılmaya başlandı.\n" +
                    "7)  18. yüzyılın ıslahatçıları, gerilemenin nedenleri üzerinde durdular; daha köklü ve kalıcı ıslahatlar düşündüler. Bu amaçla çeşitli Avrupa ülkelerine elçiler gönderilip onlardan bu konuda raporlar hazırlamaları istendi. Özellikle askerî alanda yapılacak ıslahatlar için Avrupa ülkelerinden uzmanlar getirildi.\n" +
                    "8) Yönetim ve hukuk alanında ıslahat yapılmamıştır\n" +
                    "9)   Islahat, çoğunlukla tepeden geldiğinden, halka mal edilemediğinden ve birçok kimsenin (yeniçeriler, esnaf, bazı din adamları, illerdeki valiler) çıkarına dokunduğundan, tepkiyle karşılandı ve ayaklanmalar çıktı. Bu nedenle devleti güçlendirmeyi, toplumu geliştirmeyi amaçlayan 18. yüzyıl ıslahatlarından da istenilen sonuç alınamadı.",
    };
    public static String DagilmaDonemi[] = {
            "19. YÜZYILDA OSMANLI DEVLETİ\n" +
                    "19. yüzyılda Osmanlı Devleti hızla dağılmaya başladı. Bunda Fransız İhtilali'nin sonuçları, Sanayi İnkılâbı ve kapitülasyonlar etkili oldu.",
            "A. FRANSIZ İHTİLALİ ve OSMANLI DEVLETİ'NE ETKİLERİ\n" +
                    "1. Fransız İhtilali'nin Nedenleri\n" +
                    "İngiltere ve ABD'deki demokrasi ve insan hakları ile ilgili gelişmelerin Fransız halkını etkilemesi\n" +
                    "Fransa'da halkın sınıflara ayrılmış olması\n" +
                    "Kralın halka baskı yapması, kendisi lüks ve israf içinde yaşaması, halkın ise aşırı derecede yoksul olması\n" +
                    "Aydınlanma Çağ’ında yetişen Fransız aydınlarının insan hakları, eşitlik, adalet, demokrasi, hürriyet gibi konularda yazdıkları eserlerin halkı etkilemesi\n" +
                    "Fransa'nın 17. yüzyılda girdiği savaşlar ve gereksiz harcamalar yüzünden ekonomisinin bozulması, Kralın halktan yeni vergiler almak istemesi\n" +
                    "Bu nedenlerden dolayı 1789'da Paris'te başlayan halk ayaklanması sonunda Fransa'da krallık sona erdi; meşrutiyet yönetimi kuruldu.",
            "2. Fransız İhtilali'nin Sonuçları\n" +
                    "Fransız İhtilali tüm dünyada yaygınlaşan devletleri ve toplumları siyasi ve sosyal yönden etkileyen önemli sonuçlara yol açtı. Bu sonuçlar şunlardır:\n" +
                    "Eşitlik, hürriyet, adalet ve milliyetçilik akımları tüm dünyaya yayıldı. Devletlerin siyasi, hukuki, toplumsal yapısında önemli değişiklikler oldu.\n" +
                    "Krallıkların yerini demokrasi yönetimleri almaya başladı. İnsan Hakları Beyannamesi tüm dünyada yayıldı.\n" +
                    "Milliyetçilik akımı çok uluslu devletler için yıkım oldu.\n" +
                    "Avrupa’da büyük savaşlara neden oldu.",
            "Osmanlı Devleti çok uluslu bir yapıya sahip olduğundan milliyetçilik akımından çok etkilendi. Azınlıklar bağımsız devletler kurmak için ayaklandılar. İhtilalin Osmanlı Devleti'ne olumlu etkileri de oldu. İnsan hakları, demokrasi, eşitlik, adalet, hürriyet gibi yenilikler Osmanlı toplumunu etkiledi. Tanzimat ve Islahat Fermanı ile I. Meşrutiyet bu etkilenmenin en önemli sonuçlarıdır.",
            "B. 19. YÜZYILDA SİYASİ OLAYLAR\n" +
                    "1. Sırp ve Yunan İsyanları\n" +
                    "Sırp İsyanı (1804)\n" +
                    "Sırplar, din, dil, ticaret hürriyetine sahip olarak yüzyıllarca Osmanlı yönetiminde yaşadılar. Ancak Gerileme Dönemi’nde durum değişti:\n" +
                    "Osmanlı - Rus ve Avusturya savaşları sırasında Sırbistan'ın savaş alanı haline gelmesi\n" +
                    "Sırbistan'a tayin edilen yeniçerilerin ve bazı yöneticilerin halka kötü davranması\n" +
                    "Avusturya ve Rusya'nın kışkırtmaları\n" +
                    "Milliyetçilik akımının Sırp halkını etkilemesi nedenlerinden dolayı Sırplar 1804'te isyan etti.\n" +
                    "İsyan Ruslar tarafından desteklendi. Osmanlı Devleti 1812'de Ruslarla yaptığı Bükreş Antlaşması ile Sırplara bazı ayrıcalıklar tanıdı. Sırplar, 1829'da Ruslarla yapılan Edirne Antlaşması’yla iç işlerinde bağımsız oldular. 1878 Berlin Antlaşması’yla da tam bağımsız hale geldiler.",
            "Yunan İsyanı (1821 - 1829),\n" +
                    "Osmanlı - Rus Savaşı ve Edirne Antlaşması (1828 - 1829)\n" +
                    "Osmanlı Devleti içinde en fazla ayrıcalığa sahip toplumlardan biri olan Rumlar Atina, Mora Yarımadası ile Ege adalarında yaşıyorlardı. Rumların isyan etmelerinde; milliyetçilik akımı ile Avrupa devletleri ve Rusya'nın kışkırtmaları etkili olmuştur.\n" +
                    "Rumların, deniz ticareti sayesinde zenginleşmeleri, Avrupalılar tarafından desteklenmeleri, iyi örgütlenmeleri ve Osmanlı devlet yönetiminde görevler almaları başarıya ulaşmalarını kolaylaştırmıştır.",
            "Osmanlı Devleti, 1821’de başlayan Yunan isyanını bastıramadı. Padişah II. Mahmut Mora ve Girit valiliği karşılığında Mısır valisi Mehmet Ali Paşa’dan yardım istedi. Mehmet Ali Paşa kuvvetleri isyanı bastırdı. Ancak, Rusya ve diğer Avrupa devletleri Rumlara bağımsızlık verilmesini istediler. İstekleri kabul edilmeyince de Navarin'deki Osmanlı ve Mısır donanmasını yaktılar (1827). Rusya Osmanlı Devleti'ne savaş açtı. Yeniçeri Ocağı'nı yeni kaldırmış olan Osmanlı Devleti savaşı kaybetti. Ruslarla Edirne Antlaşması yapıldı. Buna göre;\n" +
                    "Yunanistan'a bağımsızlık verilecek, Sırbistan, iç işlerinde bağımsız olacak,\n" +
                    "Osmanlı Devleti, bazı topraklarını Rusya'ya verecekti,",
            "Mısır ve Boğazlar Sorunu (1831 - 1841)\n" +
                    "Yunan Devleti kurulunca, Mısır valisi Mehmet Ali Paşa'ya vaad edilen Mora valiliği verilemedi. Mehmet Ali Paşa Mora yerine Suriye valiliğini istedi. İsteği kabul edilmeyince de isyan etti. Mısır kuvvetleri, üzerlerine gönderilen kuvvetleri yenerek Konya'ya kadar ilerlediler. II. Mahmut Avrupa devletlerinden yardım istedi. Bu isteğe yalnızca Rusya olumlu cevap verdi. Rusların İstanbul'a gelmesinden korkan İngiltere ve Fransa'nın araya girmesiyle Kütahya Antlaşması imzalandı (1833).",
            "Buna göre; Mehmet Ali Paşaya Mısır valiliğine ek olarak Girit ve Suriye valiliği, oğlu İbrahim Paşa'ya da Cidde valiliğine ek olarak Adana valiliği verilecekti.\n" +
                    "Kütahya Antlaşması iki tarafı da memnun etmedi. II. Mahmut yeni bir savaş durumunda İngiltere ve Fransa'ya güvenemediğinden Rusya ile Hünkar İskelesi Antlaşması'nı yaptı Buna göre;\n" +
                    "Osmanlı Devleti bir savaşa girecek olursa Rusya asker göndererek yardım edecekti.\n" +
                    "Rusya bir savaşa girecek olursa Osmanlı Devleti Rusya'nın isteğine göre Boğazları kapatacaktı.\n" +
                    "Antlaşma sekiz yıl yürürlükte kalacaktı.",
            "II. Mahmut 1839'da Mehmet Ali Paşa üzerine bir ordu gönderdi. Ancak gönderilen ordu Nizip Savaşı'nda yenildi. Hünkar İskelesi Antlaşması gereği Rus donanması İstanbul'a geldi. İngiltere ve diğer Avrupa devletleri araya girdi. Bunun üzerine Londra Antlaşması ile Mısır sorunu çözüldü (1840). Buna göre;\n" +
                    "Mısır'ın yönetimi Mehmet Ali Paşa ve oğullarına bırakıldı.\n" +
                    "Mısır'ın dış işlerinde Osmanlı Devleti'ne bağlı kalması ve yıllık vergi ödemesi kabul edildi.",
            "1841'de Hünkar İskelesi Antlaşması'nın süresi bitti. İngiltere ve Fransa'nın girişimleri ile Londra'da bir konferans toplandı ve Londra Boğazlar Sözleşmesi imzalandı. Buna göre;\n" +
                    "Boğazların yönetimi Osmanlı Devleti'nde kalacak\n" +
                    "Barış zamanında Boğazlar savaş gemilerine kapalı, ticaret gemilerine açık olacaktı.",
            "Kırım Savaşı (1853 - 1856)\n" +
                    "Osmanlı Devleti Mısır sorununu çözdükten sonra Tanzimat Fermanı ile bir dizi yenilik hareketlerine girişti. Osmanlı Devleti'nin güçlenmesini istemeyen Rusya, İngiltere'ye Osmanlı topraklarını paylaşmayı teklif etti. İngiltere siyasi ve ticari çıkarlarından dolayı bu teklifi reddetti.\n" +
                    "Bunun üzerine Rusya, Osmanlı Devleti'ni tek başına parçalamaya karar vererek kabul edilemez isteklerde bulundu. Bu istekler;\n" +
                    "Kudüs'te Katoliklere verilen hakların Ortodokslara da verilmesi (Kutsal yerler sorunu)\n" +
                    "Osmanlı sınırları içinde yaşayan bütün Ortodoksların Rusya'nın himayesine verilmesi\n" +
                    "Boğazlarla ilgili olarak Hünkar İskelesi Antlaşması'na benzer yeni bir antlaşma yapılmasıydı.",
            "İngiltere ve Fransa ile anlaşan Osmanlı Devleti, Rus isteklerini reddetti. Bunun üzerine Rusya, Kafkasya ve Balkanlardan saldırıya geçti (1853). Osmanlı ordusu hem Balkanlarda hem de Kafkasya'da Rus ordusunu yendi. Ruslar Sinop limanında demirli bulunan bir Osmanlı donanmasını yaktı (1853).",
            "İngiltere ve Fransa ile İtalya'daki Piyemonte Hükümeti Osmanlı Devleti'ne destek amacıyla asker gönderdi. Müttefik kuvvetler Kırım'a çıkarma yaptılar. Zor durumda kalan Rusya barış istedi. Paris Antlaşması imzalandı. Buna göre;\n" +
                    "Osmanlı Devleti, Avrupa devleti sayılacak, Avrupa devletler hukukundan yararlanacak, toprak bütünlüğü Avrupa devletlerinin garantisi altında olacak\n" +
                    "Karadeniz'de hiçbir devlet tersane ve donanma bulundurmayacak\n" +
                    "Boğazlar 1841 Londra Boğazlar Sözleşmesi’ne göre yönetilecekti.",
            "Osmanlılar galip devlet olmasına rağmen antlaşmanın Karadeniz'le ilgili maddesinden dolayı yenik devlet durumuna düşmüştür. Rusya, elde ettiği kazançlarının çoğunu kaybetmiştir. Antlaşmanın sonuna Islahat Fermanı da eklenmiştir.",
            "877 - 1878 Osmanlı - Rus Savaşı ve Berlin Antlaşması\n" +
                    "Paris Antlaşması’na rağmen Rusya emellerinden vaz geçmedi. Avrupa'daki gelişmelerden yararlanarak Osmanlı Devleti üzerindeki emellerini gerçekleştirmek amacıyla yeniden harekete geçti. Balkanlı ulusları kışkırttı. Bosna - Hersek'te isyanlar çıktı. Avrupa devletlerinin isteği ile İstanbul ve Londra'da toplanan konferanslarda Osmanlı Devleti'nden Sırbistan, Romanya ve Karadağ'a bağımsızlık, Bosna Hersek ve Bulgaristan'a özerklik verilmesi, Hristiyanların yaşadığı yerlerde ıslahat yapılması istendi.",
            "Osmanlı Devleti, Avrupa devletlerini etkilemek ve isyanları önlemek için meşrutiyeti ilan etti. Bun rağmen Avrupa devletleri isteklerini yeniledi. Osmanlı Devleti bu istekleri kabul etmeyince de Rusya, Osmanlı Devleti'ne savaş açtı (1878).\n" +
                    "Osmanlı Devleti, Kafkasya ve Balkanlarda bazı başarılar kazandıysa da Ruslar doğuda Erzurum'a batıda ise İstanbul önlerinde Çatalca'ya kadar ilerledi.\n" +
                    "Osmanlı Devleti barış istedi. Ruslarla Ayastefanos Antlaşması yapıldı. Bu antlaşmayla Ruslar, Osmanlı Devleti'ni istediği gibi parçaladı.",
            "Ancak Avrupa devletleri bu durumu tanımayarak Berlin'de yeni bir konferans topladılar. Konferans sonunda Berlin Antlaşması imzalandı. Buna göre;\n" +
                    "Romanya, Karadağ ve Sırbistan'a tam bağımsızlık verilecek, Bulgaristan iç işlerinde bağımsız bir prenslik olacaktı.\n" +
                    "Kars, Ardahan ve Batum Ruslara bırakılacak. Teselya Yunanistan'a verilecekti.\n" +
                    "Bosna - Hersek'in yönetimi geçici olarak Avusturya'ya bırakılacaktı.",
            "Bu antlaşmadan sonra İngiltere ve Fransa Osmanlı toprak bütünlüğünü koruma politikasından vazgeçtiler. Bunun sonunda;\n" +
                    "1878'de Kıbrıs'ı üs olarak alan İngiltere 1882'de Mısır'ı da işgal ederek Hindistan yolunu güvenceye aldı.\n" +
                    "1830'da Cezayir'i işgal etmiş olan Fransa, 1881'de Tunus'u da işgal etti.\n" +
                    "Bundan sonra Osmanlı Devleti'nin dağılması hızlanarak devam etti.",
            "9. YÜZYILDA YAPILAN YENİLİKLER ve DEMOKRATİKLEŞME ÇABALARI\n" +
                    "19. yüzyılda Osmanlılar batıyı daha iyi anlamaya ve daha köklü ıslahatlar yapmaya çalıştılar. Bu ıslahatlar üzerinde özellikle Fransız İhtilali'nin sonuçları etkili oldu.",
            "I. Mahmut Döneminde Yapılan Yenilikler\n" +
                    "II. Mahmut'un ilk yıllarında Alemdar Mustafa Paşa, yeniliklere destek bulmak için âyanlarla Sened-i İttifak Antlaşması’nı yaptı (İlk kez hükümdarın yetkilerinde kısıtlama olmuştur). Nizam-ı Cedit ordusuna benzeyen Sekbanı Cedit ordusunu kurdu. Ancak bir yeniçeri isyanı sonunda Alemdar öldürüldü. Sekbanı Cedit Ocağı da kaldırıldı.\n" +
                    "II. Mahmut Eşkinci Ocağı adıyla yeni bir ordu daha kurdu. Ancak, bu ordu da yeniçerilerin tepkisi sonucu kaldırıldı.\n" +
                    "II. Mahmut yenilikler konusunda iyice hazırlandı. Yeniçerilere karşı topçu ocakları ile halkı ve ulemayı yanına çekti. 1826'da Yeniçeri Ocağı'nı kaldırarak (Vakayı Hayriye) yeniliklerin önündeki en önemli engeli ortadan kaldırdı. Bundan sonra yenilikler hızlandı.",
            "Askeri Alanda Yapılan Yenilikler\n" +
                    "Yeniçeri Ocağı kaldırıldı. Yerine Asakir-i Mansure-i Muhammediye adıyla yeni bir ocak kuruldu. Orduya subay yetiştirmek amacıyla Harp Okulu açıldı. Avrupa'dan subay ve uzmanlar getirildi.",
            "İdari ve Sosyal Alanda Yapılan Yenilikler\n" +
                    "Divan örgütü kaldırılarak yerine bakanlıklar (nazırlıklar) kuruldu. Yenilikler için askeri, adli ve idari meclisler oluşturuldu.\n" +
                    "Valiler doğrudan merkezden atandı. Köy ve mahalle için muhtarlıklar kuruldu.\n" +
                    "Memurlara rütbe ve nişan verildi, dahiliye (iç işleri), ve hariciye (dış işleri) olarak ikiye ayrılıp maaş bağlandı. Ceket, pantolon ve fes giyme zorunluluğu getirildi.\n" +
                    "Askeri ve mali amaçlı olarak ilk nüfus sayımı yapıldı.\n" +
                    "Polis teşkilatı ile posta teşkilatı kuruldu.\n" +
                    "Müsadere usûlü (devletin kişilerin mallarına el koyması) kaldırılıp özel mülkiyet güvenceye alındı.\n" +
                    "Takvim-i Vekayi adıyla ilk resmi gazete çıkarıldı.",
            "Eğitim ve Sağlık Alanında Yapılan Yenilikler\n" +
                    "İstanbul'da ilköğretim zorunlu oldu.\n" +
                    "Rüştiye (ortaokul) okulları açıldı. Ayrıca devlet memuru yetiştirmek için okul açıldı.\n" +
                    "Avrupa'ya öğrenci gönderildi. Tercüme odası kuruldu. Yabancı dil öğreten okul açıldı.\n" +
                    "Askeri tıp okulu açıldı. Karantina tedbirleri alındı.",
            "Tanzimat ve Islahat Fermanları\n" +
                    "II. Mahmut'un yerine geçen oğlu I. Abdülmecit yenilikleri devam ettirmek istiyordu. Bu amaçla Mustafa Reşit Paşa'yı sadrazamlığa getirdi.\n" +
                    "Mustafa Reşit Paşa yapılacak yeniliklerin esaslarını belirleyen Tanzimat Fermanı’nı ilan etti. Tanzimat Fermanı ile;\n" +
                    "Bütün vatandaşların can, mal, namus güvenliği devlet tarafından sağlanacak,\n" +
                    "Herkesten gelirine göre vergi alınacak,\n" +
                    "Askerlik vatan görevi olacak ve belli bir düzene konacak,\n" +
                    "Mahkemeler halka açık olacak ve hiç kimse yargılanmadan cezalandırılmayacaktı.",
            "Fermanın ilanından sonra, içeriğine uygun olarak, devlet yönetimi, maliye, adliye ve askerlikle ilgili kanunlar hazırlandı. Islahatlar yapıldı. Tanzimat Fermanı ile;\n" +
                    "Padişahın yetkileri kısıtlandı. Kanun üstünlüğü ilkesi kabul edildi. Demokratikleşme hızlandı.\n" +
                    "Toplumunda eşitliğin, birlik ve bütünlüğün sağlanması hedeflendi.\n" +
                    "Mısır sorunu ve Boğazlar konusunda Avrupa devletlerinin desteği sağlanmaya çalışıldı.\n" +
                    "Azınlık isyanlarının önlenmesi ve Avrupa devletlerinin Osmanlı iç işlerine karışması engellenmek istendi.\n" +
                    "Ancak başarılı olunmadığı gibi bu sorunları daha da arttırdı.",
            "Islahat Fermanı\n" +
                    "Tanzimat Fermanı'nın eksikliklerini gidermek amacıyla hazırlandı. Ferman Paris Konferansı sırasında yayınlandı. Buna göre;\n" +
                    "Hristiyanların devlet memuru olabilmesi, devlet okullarında okuyabilmesi kabul edildi. Azınlıklara kilise ve okul açma izni verildi.\n" +
                    "Azınlıklar askerlik görevini para (bedel) ödeyerek yapabilecekti.\n" +
                    "Islahat Fermanı ile Avrupalıların, Osmanlı iç işlerine karışması engellenmek istenmiştir. Ayrıca toplumda eşitliği sağlamak, azınlıkları devlet yönetimine ısındırmak hedeflenmiştir. Ancak istenilen sonuç alınamamış, üstelik azınlıklar Müslümanlardan daha ayrıcalıklı hale gelmiştir.",
            "I. ve II. Meşrutiyet\n" +
                    "I. Meşrutiyet;\n" +
                    "Tanzimat ve Islahat Fermanları Osmanlı Devleti'ndeki sorunları çözmeye yetmedi. Azınlıklar yeni hak talepleriyle isyan etmeye devam ettiler. Namık Kemal, Ziya Paşa gibi aydınların başını çektiği Jön Türkler (Genç Osmanlılar) ülkenin ancak meşrutiyet yönetimi ile kurtulacağına inanıyorlardı.\n" +
                    "Onlara göre; demokratik meclisler oluşturulmalı, halk seçeceği temsilciler aracılığıyla yönetime katılmalı, padişahın yetkileri kısıtlanmalı, toplumda din, dil, ırk ayrımı yapılmamalıydı.",
            "Genç Osmanlı aydınları bazı subayların da desteğini alarak Meşrutiyeti ilan edeceğine dair söz veren II. Abdülhamit'in tahta çıkmasını sağladılar (1876).\n" +
                    "II. Abdülhamit, Mithat Paşa'yı sadrazamlığa getirdi. Mithat Paşa başkanlığında oluşturulan bir kurul önce bir anayasa (Kanuni Esasi) hazırladı. Ve Meşrutiyet ilan edildi. 1876'da I. Meşrutiyet dönemi başladı. Anayasaya göre;\n" +
                    "Meclisi açma ve kapama yetkisi padişaha ait olacaktı.\n" +
                    "Halkın seçeceği vekillerden oluşacak bir Mebuslar Meclisi ile, padişahın seçeceği kişilerden oluşacak, Âyan Meclisi oluşturulacak, yasama yetkisi bu meclislerde olacaktı.\n" +
                    "Yasalar padişah tarafından onaylandıktan sonra yürürlüğe girecekti.",
            "I. Meşrutiyet’in îlanı ile;\n" +
                    "Halk ilk kez yönetime katılma hakkı elde etti. Padişahın yetkilerinde kısıtlanmalar oldu.\n" +
                    "Osmanlı Devleti ve Türk tarihinin ilk anayasası yapıldı.\n" +
                    "Buna rağmen yasaların padişah tarafından onaylanırsa yürürlüğe girecek olması, padişahın meclisi açma ve kapama yetkisinin olması, tam demokrasiye geçişi engellemiştir.",
            "II. Meşrutiyet\n" +
                    "II. Abdülhamit meşrutiyet yanlısı değildi. 1877-1878 Osmanlı - Rus Savaşı'nı bahane ederek meclisi kapattı ve baskıcı bir yönetim uygulamaya başladı.\n" +
                    "Buna rağmen genç Türk aydınları mücadelelerine devam ettiler. İttihat ve Terakki Cemiyeti'ni kurdular. Özellikle genç subaylar arasında taraftar bulan İttihat ve Terakkiciler Balkanlardaki karışıklıkların artması ve Avrupa devletlerinin yeni isteklerde bulunması üzerine Makedonya'da ayaklanma başlattılar.\n" +
                    "II. Abdülhamit Kanuni Esasi'yi yeniden yürürlüğe koydu. Böylece II. Meşrutiyet dönemi başladı. Seçimler yapıldı. Meclis çalışmalarına yeniden başladı.\n" +
                    "II. Meşrutiyet'in ilanından bir süre sonra meşrutiyet karşıtları İstanbul'da büyük bir isyan çıkardılar. 31 Mart Olayı olarak bilinen isyan, Selanik'te oluşturulan Hareket Ordusu tarafından bastırıldı. Bütün bu karışıklıklar sırasında,\n" +
                    "Bulgaristan bağımsızlığını ilan etti.\n" +
                    "Girit Yunanistan'a bağlandı.\n" +
                    "Avusturya, Bosna - Hersek'i resmen topraklarına kattığını ilan etti.",
    };
    public static String SonDonem[] = {
            "Dönemin Padişahları\n" +
                    "II. Abdülhamid\n" +
                    "V. Mehmet (Reşat)\n" +
                    "VI. Mehmet Vahdettin",
            "II.Meşrutiyet Dönemi (1909-1918)\n" +
                    "24 Temmuz 1908’de II. Meşrutiyet ilan edildi.",
            "II. Meşrutiyet’in İlanı Sırasındaki Gelişmeler\n" +
                    "Girit, Osmanlı Devleti’nden ayrılarak Yunanistan’a bağlanmıştır.\n" +
                    "Bulgaristan bağımsızlığını ilan etmiştir.\n" +
                    "Avusturya, Berlin Antlaşması’ndan beri geçici süreyle elinde tuttuğu Bosna Hersek’i tamamen almıştır.",
            "II. Meşrutiyet Dönemi Siyasi Partiler\n" +
                    "Hürriyet ve İtilaf Fırkası\n" +
                    "Osmanlı Ahrar Fırkası\n" +
                    "Fedakaran-ı Millet Cemiyeti\n" +
                    "İttihad-ı Muhammedi Fırkası\n" +
                    "Osmanlı Demokrat Fırkası\n" +
                    "Islahat-ı Esasiye-i Osmaniye Fırkası\n" +
                    "Mutedil Hürriyetperveran Fırkası\n" +
                    "Ahali Fırkası\n" +
                    "Osmanlı Sosyalist Fırkası\n" +
                    "Halaskar Zabitan Grubu\n" +
                    "Milli Meşrutiyet Fırkası",
            "31 Mart Ayaklanması\n" +
                    "II. Meşrutiyet’in ilanından sonra İstanbul’da Meşrutiyet yönetimine son vermek amacıyla çıkarılan isyandır.\n" +
                    "Taksim Kışlası’ndaki Avcı Taburu’na bağlı askerler, subaylarına karşı ayaklanarak kendilerine önderlik eden din adamlarının peşinde Heyet-i Mebusan’ın önünde toplanmışlar ve ülkenin şeriata göre yönetilmesini istemişlerdir.\n" +
                    "İsyancılar; genç subayları, gazetecileri ve bazı İttihat ve Terakki Fırkası taraftarlarını öldürmüşlerdir.\n" +
                    "Hüseyin Hilmi Paşa Hükümeti ayaklanmacılarla uzlaşma yolunu seçmiş ve hükümet üyeleri tek tek istifa etmiştir. Yeni kabineyi Tevfik Paşa kurmuştur.\n" +
                    "İstanbul’da denetimi elinden kaçıran İttihat ve Terraki Partisi, asıl güç merkezi olan Selanik’teki III. Ordu’yu harekete geçirmiş, böylece ayaklanmayı bastırmak üzere Hareket Ordusu kurulmuştur.\n" +
                    "Hareket Ordusu komutanı Mahmut Şevket Paşa’dır. Mustafa Kemal de bu orduda kurmay başkanı olarak görev yapmıştır.\n" +
                    "Ayaklanmacılar, 23 Nisan’ı 24 Nisan’a bağlayan gece, İstanbul’a girmeye başlayan Hareket Ordusu’na başarısız bir direnişten sonra teslim olmuştur.\n" +
                    "II. Abdülhamit tahttan indirilmiş ve sürgüne yollanmıştır. Yerine Mehmet Reşat (V. Mehmet) getirilmiştir." +
                    "II. Abdülhamit’i görevden alma kararını kendisine Arif Hikmet Paşa, Ermeni Katolik cemaatinden Aram Efendi, Draç mebusu Esat Paşa ile Selanik Yahudi cemaatinden Emanuel Karasu Efendi’den oluşan bir kurul bildirmiştir.",
            "Osmanlı Devleti’ni Dağılmaktan Kurtarmak Amacı İle Ortaya Çıkan Fikir Akımları\n" +
                    "Batıcılık\n" +
                    "Osmanlıcılık\n" +
                    "İslamcılık\n" +
                    "Türkçülük\n" +
                    "Ademimerkeziyetçilik",
            "Osmanlı Devletinin Son Dönem Askeri Olayları\n" +
                    "Trablusgarp Savaşı (1911-1912)\n" +
                    "Nedenleri\n" +
                    "Rusya ile İtalya arasında, İtalya’nın işgaline onay veren Racconigi Antlaşması’nın imzalanması,\n" +
                    "Bölgenin İtalya’ya daha yakın olması,\n" +
                    "Bölgenin Osmanlı Devleti açısından savunulamayacak durumda olması,\n" +
                    "İtalya’nın siyasi birliğini geç tamamlayıp sömürgecilik yarışına girmesi.",
            "Savaşa Katılan Gönüllü Subaylar\n" +
                    "Mustafa Kemal (Derne-Tobruk)————Gazeteci Şerif Bey lakabıyla.\n" +
                    "Enver Bey (Bingazi)—————–Kuyucu Hamdi lakabıyla.\n" +
                    "Nuri Conker\n" +
                    "Ali Çetinkaya\n" +
                    "Ali Fuat Cebesoy\n" +
                    "Ali Fethi Okyar",
            "Quşhy (Uşi) Antlaşması’na (1912) Göre;\n" +
                    "Trablusgarp ve Bingazi İtalya’ya bırakılacak. (Osmanlı Devleti’nin Kuzey Afrika’da toprağı kalmadı.)\n" +
                    "Trablusgarp, dini açıdan halifeye bağlıdır. (Trablusgarp halkı ile kültürel bağlar koparılmak istenmedi.)\n" +
                    "12 ada Balkan Savaşları’nın sonuna kadar İtalya’ya bırakılacak.\n" +
                    "İtalya, Osmanlı Devleti’nin kapitülasyonları kaldırması konusunda yardım edecek.",
            "I.Balkan Savaşı (1912-1913)\n" +
                    "Nedenleri\n" +
                    "Osmanlı Devleti’ni Balkanlardan atmak.\n" +
                    "Savaşa Katılan Devletler\n" +
                    "Karadağ\n" +
                    "Yunanistan\n" +
                    "Sırbistan\n" +
                    "Bulgaristan",
            "Savaşın Kaybedilme Nedenleri\n" +
                    "Ordunun içine siyasetin girmesi,\n" +
                    "65 bine yakın askerin savaş öncesi terhis edilmesi,\n" +
                    "4 cephede birden savaşılması.",
            "Kaybedilen Topraklar\n" +
                    "Doğu Trakya\n" +
                    "Batı Trakya\n" +
                    "Makedonya\n" +
                    "Selanik\n" +
                    "Ege Adaları\n" +
                    "Arnavutluk (Osmanlı Devleti’nden ayrılan son Balkan ülkesidir.)\n" +
                    "Savaşın Sonuçları\n" +
                    "Batı Trakya azınlık sorunu ortaya çıktı.\n" +
                    "Osmanlı Devleti’nin Balkanlarda toprağı kalmadı.\n" +
                    "Balkanlardan Anadolu’ya Türk göçü başladı.\n" +
                    "Yenilgiden hükümeti sorumlu tutan İttihat ve Terakki Bab-ı Ali baskınını gerçekleştirdi.\n" +
                    "1913-1918 arası üç paşalar dönemidir (Enver-Talat-Cemal).",
            "II.Balkan Savaşı (1913)\n" +
                    "Nedenleri\n" +
                    "Bulgaristan’ın I.Balkan Savaşı sırasında daha fazla toprak alması.\n" +
                    "\n" +
                    "Savaşa Katılan Devletler\n" +
                    "Sırbistan\n" +
                    "Karadağ\n" +
                    "Yunanistan\n" +
                    "Romanya (I.Balkan Savaşı’nda yoktur.)",
            "Savaşın Sonuçları\n" +
                    "Doğu Trakya alındı.\n" +
                    "Enver Paşa (Edirne Fatihi)\n" +
                    "Mustafa Kemal (Doğu Trakya’nın alınmasında etkili oldu.)\n" +
                    "Hamidiye Kahramanı Rauf Orbay’dır.\n" +
                    "Balkan ülkeleri kendi aralarında Bükreş Antlaşması’nı imzaladı.\n" +
                    "Bulgaristan elde ettiği kazanımları kaybetti.\n" +
                    "Bu zararını telafi etmek için de ileride I. Dünya Savaşı’na katılacaktır.",
            "Osmanlı Devleti ile Yapılan Antlaşmalar\n" +
                    "Atina (Osmanlı Devleti – Yunanistan)\n" +
                    "İstanbul (Osmanlı Devleti – Bulgaristan)\n" +
                    "İstanbul (Osmanlı Devleti – Sırbistan)",
            "I. Dünya Savaşı\n" +
                    "Nedenleri\n" +
                    "İtalya ve Almanya’nın siyasi birliklerini geç tamamlayıp sömürgecilik yarışına girmeleri,\n" +
                    "Devletler arası ham madde yarışı,\n" +
                    "Avusturya – Macaristan İmparatorluğu ile Rusya’nın Balkanlara nüfuz etmesi,\n" +
                    "Devletler arası bloklaşma ve silahlanma yarışı,\n" +
                    "Fransız İhtilali’nin getirdiği ulusçuluğun etkisi,\n" +
                    "Almanya ve Fransa arasındaki Alsace-Lorraine sorunu,\n" +
                    "Gavrilo Princip adında bir Sırp’ın Avusturya-Macaristan veliahtı Ferdinand’ı gezi sırasında öldürmesi,",
            "Bloklar\n" +
                    "İtilaf (Anlaşma) Devletleri\n" +
                    "İngiltere\n" +
                    "Fransa\n" +
                    "Çarlık Rusya\n" +
                    "ABD\n" +
                    "Japonya\n" +
                    "Hollanda\n" +
                    "İtalya\n" +
                    "Çin\n" +
                    "Yunanistan\n" +
                    "İttifak (Bağdaşma) Devletleri\n" +
                    "Almanya\n" +
                    "İtalya\n" +
                    "Avusturya-Macaristan\n" +
                    "Osmanlı Devleti\n" +
                    "Bulgaristan",
            "Önemli\n" +
                    "ABD: Savaş süresini kısalttı.\n" +
                    "Osmanlı Devleti: Savaşın süresini uzattı.\n" +
                    "İtalya: Taraf değiştirmiştir.\n" +
                    "Japonya: Savaştan çekilen ilk devlettir.\n" +
                    "Yunanistan: Savaşa katılan son devlet.",
            "Almanya’nın Osmanlı Devleti’ni Kendi Yanında Savaşa Sokma Nedenleri\n" +
                    "Kendi savaş yükünü hafifletmek.\n" +
                    "Osmanlı Devleti’nin dini gücünden faydalanmak.\n" +
                    "Osmanlı Devleti’nin demografik (nüfus) gücünden faydalanmak.\n" +
                    "Osmanlı Devleti’nin jeopolitik gücünden faydalanmak.",
            "Osmanlı Devleti’nin Almanya’nın Yanında Savaşa Girme Nedenleri\n" +
                    "Siyasi yalnızlıktan kurtulmak.\n" +
                    "Almanya ile yapılan gizli antlaşma.\n" +
                    "Kaybettiğimiz toprakları geri almak.\n" +
                    "İttihat ve Terakki’nin Alman hayranlığı.\n" +
                    "Almanya’nın Türk ve Müslüman bir sömürgeye sahip olması.\n" +
                    "Almanya’nın savaşı kazanacağına inanılması.",
            "Osmanlı Devleti’nin Savaşa Girmesi ve Sonuçları\n" +
                    "İngiltere’den kaçan iki Alman gemisinin (Geoben ve Breslov) Osmanlı Devleti’ne sığınmasıyla olaylar başladı.\n" +
                    "Osmanlı Devleti, bu iki gemiyi daha önce İngiltere’ye sipariş verdiğimiz (Genç Osman ve Reşadiye) gemilerin bize teslim edilmemesi üzerine satın aldığını açıkladı ve gemilerin isimlerini Yavuz ve Midilli olarak değiştirdi.",
            "Genel Sonuçlar\n" +
                    "Almanya’nın savaş yükü hafifledi.\n" +
                    "Kapitülasyonlar kaldırıldı.\n" +
                    "Savaş süresi uzadı.\n" +
                    "V.Mehmet Reşad cihat ilan etti.\n" +
                    "Yeni cepheler açıldı.",
            "Cepheler\n" +
                    "Taarruz\tSavunma\tYardım\n" +
                    "Kafkasya\tÇanakkale\tGaliçya\n" +
                    "Kanal\tIrak\tMakedonya\n" +
                    "–\tSuriye-Filistin\tRomanya\n" +
                    "–\tHicaz-Yemen\t–",
            "Taarruz Cepheleri\n" +
                    "Kafkasya Cephesi\n" +
                    "Nedenleri\n" +
                    "Kars, Ardahan ve Batum’u geri almak.\n" +
                    "Turancılık(Pantürkizm) fikrini gerçekleştirmek.\n" +
                    "Bakü petrollerine ulaşmak.\n" +
                    "1915- Hasan İzzet Paşayı dinlemeyen Enver Paşa Sarıkamış Harekatını başlattı.\n" +
                    "1915- Ruslar; Muş, Bitlis, Bayburt, Van, Erzincan ve Erzurum’a ilerlerdi.\n" +
                    "1915- Tehcir Kanunu ile Ermeniler Suriye, Lübnan ve Hatay’a gönderildi.\n" +
                    "1916- Bölgeye Mustafa Kemal atandı (Diyarbakır). Tuğgeneral olduktan sonra Rusların elindeki Muş ve Bitlisi geri aldı.\n" +
                    "1917- Rusya’da Ekim Devrimi yaşandı. Çarlık Rusya yıkıldı, Sovyet Rusya kuruldu.\n" +
                    "1918- Rusya savaştan Brest-Litovsk antlaşması ile geri çekildi. İşgal ettiği bölgelerden çekilirken Kars, Ardahan, Batum’u bize geri verdiler. (Osmanlı Devleti başarısız olduğu halde toprak kazandı.)",
            "Kanal Cephesi\n" +
                    "Nedenleri\n" +
                    "Kaybettiğimiz Mısır’ı geri almak.\n" +
                    "İngiltere’nin sömürge yolları ile bağlantısını kesmek.\n" +
                    "Bu cephe Almanya’nın isteği üzerine açılmıştır. Komutanı ise Cemal Paşa’dır.",
            "Savunma Cepheleri\n" +
                    "Çanakkale Cephesi\n" +
                    "Nedenleri\n" +
                    "İstanbul’u alarak Osmanlı Devleti’ne son vermek, savaşın süresini kısaltmak.\n" +
                    "Kararsız kalan Balkan ülkelerini kendi yanlarına çekmek.\n" +
                    "Rusya’ya boğazlar üzerinden yardım göndermek.\n" +
                    "Rusya’nın buğdayından yararlanmak.\n" +
                    "Osmanlı Devleti’nin Asya ve Avrupa’daki birlikleri arasında bağlantı kurmak.\n" +
                    "Nusret Mayın Gemisi ve Seyit Onbaşı bu cephede yer almıştır.\n" +
                    "Mustafa Kemal “Ben size taarruzu değil, ölmeyi emrediyorum.” tarihi sözünü bu cephede söylemiştir.\n" +
                    "Kilitbayır, Seddülbahir, Kireçtepe, Aslantepe, Zığındere, Kocaçimen, Kanlısırt, Kitre, Arıburnu, Conkbayrı ve Anafartalar bu cephedeki savunma hatlarıdır.",
            "Sonuçları\n" +
                    "Savaşın süresi en az iki yıl uzadı.\n" +
                    "Bulgaristan, Osmanlı Devleti’nin yanında savaşa girdi.\n" +
                    "Mustafa Kemal’in rütbesi albaylığa yükseldi.\n" +
                    "Mustafa Kemal Anadolu’da tanınan bir komutan haline geldi.\n" +
                    "500.000 insan hayatını kaybetti.\n" +
                    "Rusya’ya yardım gitmediği için Rusya’da ekonomik kriz derinleşti.\n" +
                    "Mustafa Kemal Çanakkale Savaşı’nın kazanılmasından sonra “Hamd olsun İstanbul’u kurtardık.” demiştir.",
            "Irak Cephesi\n" +
                    "Nedenleri\n" +
                    "Rusya’ya karadan yardım göndermek.\n" +
                    "Türklerin İran üzerinden Hindistan’a ulaşmasını engellemek.\n" +
                    "Musul ve Abadan petrollerini ele geçirmek.\n" +
                    "Cephenin komutanı Süleyman Askeri Bey’dir.\n" +
                    "Kutü’l Amare’de (Selman Paktı) 25.000 İngiliz askerini ve General Tomsheand’ı esir aldık.\n" +
                    "Kutü’l Amare fatihi Halil Paşa’dır.",
            "Hicaz-Yemen Cephesi\n" +
                    "Nedenleri\n" +
                    "İngilizlerin kutsal bölgeleri ele geçirmek istemesi.\n" +
                    "İngilizlerin bölge petrollerini ele geçirmek istemesi.\n" +
                    "Ajan: Arabistanlı Lawrance (Arapların ayaklanmasını sağladı.)\n" +
                    "Emir: Şerif Hüseyin\n" +
                    "Gizli antlaşma: Mc Mahon Antlaşması\n" +
                    "Komutan: Fahrettin Paşa – Lakabı: Çöl ortasında Plevne kahramanı Çöl aslanı/Çöl kaplan",
            "Suriye-Filistin Cephesi\n" +
                    "Nedenleri\n" +
                    "Kanal cephesinin devamıdır. Amaç Anadolu’ya güneyden girmek ve Suriye petrollerini ele geçirmektir.\n" +
                    "Kudüs’ü ele geçirmek.\n" +
                    "Mustafa Kemal bu cephede savaşmıştır.",
            "Gizli Antlaşmalar\n" +
                    "İstanbul Antlaşması (İngiltere-Fransa-Rusya)\n" +
                    "Boğazlar Rusya’ya bırakılacak.\n" +
                    "Londra Antlaşması (İngiltere-Fransa-Rusya-İtalya)\n" +
                    "İtalya taraf değiştirdi.\n" +
                    "Skyes-Picot Antlaşması (İngiltere-Fransa)\n" +
                    "Ortadoğu paylaşıldı.\n" +
                    "Petrograd Protokolü (İngiltere-Fransa-Rusya)\n" +
                    "Doğu Anadolu Rusya’ya verildi.\n" +
                    "Mc.Mahon Antlaşması (Şerif Hüseyin- İngiltere)\n" +
                    "Hicaz merkezli Arap Devleti kuracak.\n" +
                    "Saint Jean de Maurienne (İngiltere-Fransa-İtalya)\n" +
                    "Güneybatı(İzmir ve çevresi) İtalya’ya verilecek.",
            "Wilson İlkeleri\n" +
                    "Yenen devletler yenilenlerden toprak ve savaş tazminatı almayacak.\n" +
                    "Manda ve Himaye anlayışı ortaya çıktı.\n" +
                    "Gizli antlaşma yapılmayacak.\n" +
                    "Polonya Devleti kurulacak.\n" +
                    "Devletlerin kendi aralarındaki sorunların çözümü için uluslararası bir teşkilat kurulacak. (Cemiyet-i Akvam)\n" +
                    "Her millet kendi geleceğine kendisi karar verecek.\n" +
                    "Alsas Loren Fransa’ya verilecek. (Salt Determination)\n" +
                    "Osmanlı Devleti’nin içinde Türklerin çoğunlukta yaşadığı yerler Türklere, azınlıkların nüfusça çoğunlukta olduğu yerler ise azınlıklara bırakılacak.",
            "Savaşın Sonuçları\n" +
                    "En karlıları İngiltere, Fransa, Japonya’yken en zararlı çıkan Almanya’dır.\n" +
                    "İmparatorluklar parçalandı,yeni devletler kuruldu.\n" +
                    "10 milyon insan öldü.\n" +
                    "Sivil savunma teşkilatları kurulmaya başlandı.\n" +
                    "İlk defa denizaltı, tank kullanıldı.\n" +
                    "İlk defa kimyasal silah kullanıldı.\n" +
                    "Yeni rejimler ortaya çıktı.",
            "Mondros Ateşkes Antlaşması (30 Ekim 1918)\n" +
                    "Osmanlı Devleti adına Rauf Orbay, itilaf devletleri adına Amiral Calthorpe arasında Limni Adası’nda Agemennon Zırhlısı’nda imzalamıştır.\n" +
                    "Maddeleri\n" +
                    "İtilaf devletleri güvenliklerini tehdit eden bir bölgeyi karışıklık çıkması halinde işgal edecek. (7.madde) ( yorum: Anadolu işgale açık hale getirilmiştir)\n" +
                    "Vilayet-ti Sitte (Bitlis,Erzurum,Sivas,Van,Elazığ,Diyarbakır) de bir karışıklık çıkarsa buralar işgal edilecek.\n" +
                    "Toros tünelleri ve boğazlar işgal edilecek.\n" +
                    "Osmanlı Devleti elindeki esirleri derhal serbest bırakacak.\n" +
                    "Ulaşım ve haberleşme araçları İtilaf Devletleri’nin kontrolüne bırakılacak.\n" +
                    "Osmanlı Devleti’nin ihraç ettiği enerji ürünleri dışarı satılmayacak.",
            "Ateşkes Antlaşmasını İmzalayan Hükümet\n" +
                    "Ahmet İzzet Paşa Hükümeti\n" +
                    "Ateşkes İmzalayan Kişi\n" +
                    "Bahriye Nazırı Rauf Orbay\n" +
                    "Dönemin Padişahı\n" +
                    "Vahdettin (VI.Mehmet)\n" +
                    "Dönemin Partisi\n" +
                    "Hürriyet ve İtilaf Partisi\n" +
                    "Mondros’tan Sonraki İlk İşgaller\n" +
                    "Osmanlı Devleti topraklarında ilk işgal Musul’dur, (İngilizler).\n" +
                    "Anadolu da ilk işgal Hatay – Dörtyol’dur, (Fransızlar).\n" +
                    "Hatay Dörtyol’da Mehmet Çavuş (Kara) ilk kurşunu sıkmıştır.",
            "Devletlerin İşgal Ettikleri Yerler\n" +
                    "İngilizler\tFransızlar\tİtalyanlar\tYunanlılar\n" +
                    "Musul\tAdana\tAntalya\tİzmir ve çevresi\n" +
                    "Urfa\tMersin\tFethiye\tDoğu Trakya\n" +
                    "Antep\tOsmaniye\tBodrum\t–\n" +
                    "Maraş\tUrfa\tMarmaris\t–\n" +
                    "Kars\tAntep\tKuşadası\t–\n" +
                    "Batum\tMaraş\tMuğla\t–\n" +
                    "Samsun\tHalep\tBurdur\t–\n" +
                    "Merzifon\tHatay\tKonya\t–\n" +
                    "Bilecik\t–\t–\t–\n" +
                    "Çanakkale\t–\t–\t–\n" +
                    "İskenderun\t–\t–\t–\n" +
                    "İzmit\t\n" +
                    "\n",
            "Ermeniler ve Gürcüler de Mondros’tan sonra Anadolu’da işgallere Doğu’da katılmışlardır.\n" +
                    "Boğazlar Fransa ve İngiltere’nin işgaline uğraşmıştır.\n" +
                    "13 Kasım 1918 de İstanbul’u işgal ettiler. Atatürk “Geldikleri gibi giderler” tarihi sözünü söyledi. (Yaveri Cevat Abbas’a)\n" +
                    "Mustafa Kemal İstanbul da Ali Fethi Bey’le Minber gazetesini çıkardı.",
            "Paris Barış Konferansı\n" +
                    "İlk defa İtilaf devletleri arasında anlaşmazlıklar çıktı.\n" +
                    "Konferansa yenilen devletler davet edilmemiştir.\n" +
                    "Cemiyet-i Akvam (Milletler Cemiyeti) kurulmuştur.\n" +
                    "İtalya’ya verilecek yerler Yunanistan’a verildi.\n" +
                    "ABD Monroe Doktrini (Yalnızlık Politikası)ile Avrupa siyasetinden çekildi. II. Dünya savaşına kadar dünya siyasetinde İngiltere, Fransa etkin olacaktır.",
            "I. Dünya Savaşı’nı Bitiren Antlaşmalar\n" +
                    "Versay: Almanya-İtilaf Devletleri\n" +
                    "Sen Jermen: Avusturya-İtilaf Devletleri\n" +
                    "Nöyyi: Bulgaristan-İtilaf Devletleri\n" +
                    "Trianon: Macaristan-İtilaf Devletleri\n" +
                    "Sevr: Osmanlı Devleti-İtilaf Devletleri",
            "İzmir’in İşgali (15 Mayıs 1919)\n" +
                    "Paris Barış Konferansı’nda yakaladıkları fırsatı değerlendirdiler.\n" +
                    "Megola İdea’yı (Büyük Ülkü) gerçekleştirme.\n" +
                    "Vali Nurettin Paşa halkı örgütledi ancak görevden alındı.\n" +
                    "Hasan Tahsin (Osman Recep Nevres) ilk kurşunu sıktı.\n" +
                    "Redd-i İlhak Cemiyeti kuruldu.\n" +
                    "Maşatlık mitinginde Yunan işgali protesto edildi.\n" +
                    "Halide Edip Adıvar, Nakkiye Elgün, Mehmet Emin Yurdakul, Selim Sırrı Tarcan mitinglerde etkili oldular.",
            "İşgaller Sırasındaki Raporlar\n" +
                    "Amiral Bristol Raporu:\n" +
                    "Milli mücadelenin haklı olduğunu kanıtlayan ilk belge.\n" +
                    "Milne Hattı (Milne Raporu)\n" +
                    "Kuvay-i Milliye yunanlılara karşı başarılı olunca İngiliz komutan Milne, yunanlıların güvenliği sağlamak ve Yunanlılara zaman kazandırmak için bir hat oluşturdu\n" +
                    "General Harbourd Raporu\n" +
                    "Milli mücadelenin haklı olduğunu ispatlayan ikinci belgedir.\n" +
                    "Doğu Anadolu da Ermenilerin haksız olduğu görülmüştür.",
            "Cemiyetler\n" +
                    "Zararlı Cemiyetler\n" +
                    "Azınlıkların Kurduğu Cemiyetler\n" +
                    "Mavri Mira Cemiyeti\n" +
                    "Rumların kurdukları cemiyettir. Eski Bizans’ı diriltmeye çalışırlar. Yunan işgalini kolaylaştırmayı hedeflerler.\n" +
                    "Etnik-i Eterya Cemiyeti\n" +
                    "Rumlar kurmuştur.İlk kurdukları cemiyettir.\n" +
                    "Pontus Rum Cemiyeti\n" +
                    "Rumlar kurdu, Karadeniz’de Rum Devleti’ni tekrar kurmak istemektedirler.\n" +
                    "Kordos Cemiyeti\n" +
                    "Doğu Karadeniz Bölgesi’ndeki insanları göç ettirip, Rum sayısını arttırmak isterler.\n" +
                    "Taşnak Cemiyeti\n" +
                    "Doğu Anadolu’da Ermeni Devleti kurmak.\n",
            "Hınçak Cemiyeti\n" +
                    "Doğu Anadolu’da Ermeni Devleti kurmak.\n" +
                    "Makabi (Musevi)-Alyans-İsrail Cemiyeti\n" +
                    "Osmanlı Devleti’nden ayrılan Yahudilere Filistin topraklarında İsrail Devleti kurmak.\n" +
                    "Milli Varlığa Düşman Cemiyetler\n" +
                    "Sulh ve Selameti Osmaniye Cemiyeti\n" +
                    "Kurtuluş padişaha bağlı kalmaktır.\n" +
                    "Teali İslam Cemiyeti\n" +
                    "Dinin esaslarına bağlı kalmak kurtuluştur.\n" +
                    "Kürt Teali Cemiyeti\n" +
                    "Kürt devleti kurmak.\n" +
                    "İngiliz Muhipleri\n" +
                    "Kurtuluş İngiltere’nin mandasına girmektir.\n" +
                    "Wilson İlkeleri\n" +
                    "ABD mandasına girmeyi savunurlar.\n" +
                    "Hürriyet ve İtilaf Fırkası\n" +
                    "Askeri Nigahban Cemiyeti\n" +
                    "Padişaha bağlı emekli subayların kurduğu cemiyettir.",
            "Yararlı Cemiyetler\n" +
                    "Milli Varlığı Koruyan Cemiyetler\n" +
                    "Trakya Paşaeli Müdafaa-i Hukuk Cemiyeti:\n" +
                    "Cafer Tayyar kurmuştur.\n" +
                    "İlk direniş örgütüdür.\n" +
                    "Mavri Mira’ya karşıdır.\n" +
                    "Geçici devlet kurmayı amaçlar.\n" +
                    "İzmir Müdafaa-i Hukuk Cemiyeti\n" +
                    "Bu cemiyeti 14 Mayıs 1919 da Redd-i İlhak cemiyetiyle birleşti.\n" +
                    "Redd-i İlhak Cemiyeti\n" +
                    "Kuvay-i Milliye’yi örgütler.(İzmir)\n" +
                    "Balıkesir ve Alaşehir Kongrelerini düzenlemiştir.\n" +
                    "Kilikyalılar Cemiyeti\n" +
                    "Ali Fuat girişimiyle Fransız işgalini, Ermenilerin işgalini engellemek için kurulmuştur.\n" +
                    "Pozantı Kongresinde toplanmışlardır.\n" +
                    "Toplanan son kongredir.\n",
            "Trabzon Muhafaza-i Hukuk Cemiyeti\n" +
                    "Trabzon da Rum devleti kurulmasına engel olmak\n" +
                    "Erzurum Kongresine katılmışlardır.\n" +
                    "Silahlı direniş göstermişlerdir.\n" +
                    "Şark (Doğu) Vilayetleri Müdafaa-i Hukuk Cemiyeti\n" +
                    "Erzurum Kongresini toplamışlardır.\n" +
                    "Göçleri engeller.\n" +
                    "Albayrak, Hadistan, La Pays gazetelerini çıkardılar.\n" +
                    "Milli Kongre Cemiyeti\n" +
                    "Kuvay-i Milliye tabirini ilk kez kullanıldı.(Prof. Dr. Esat Işık)\n" +
                    "Silah değil, basın yoluyla direnir.\n" +
                    "Tüm cemiyetlerin birleşmesini sağladılar.\n" +
                    "Gizli Karakol Cemiyeti\n" +
                    "Lojistik destek sağlarlar.(Milli mücadeleye)\n" +
                    "İstanbul da tutsak düşen vatanseverleri kurtarmak.\n" +
                    "Anadolu Kadınları Müdafaa-i Hukuk Cemiyeti\n" +
                    "Sivas valisi Reşit Paşa’nın eşi Melek Hanım ve arkadaşları Sivas’ta kurmuştur.\n" +
                    "Mustafa Kemal’in kurulmasını istediği tek cemiyettir.\n" +
                    "Vahdet-i Milliye Cemiyeti\n" +
                    "Tüm cemiyetlerin birleşmesini istemişlerdir.\n" +
                    "Kars İslam Milli Şurası\n" +
                    "Mim Mim Grubu",
    };
    public static String Kurtulus[] = {
            "Mustafa Kemal’in Samsun’a Çıkışı\n" +
                    "\n" +
                    "Yıldırım orduları grup komutanıyken İstanbul’a geri çağrıldı.\n" +
                    "İstanbul’a geldiğinde Limana demirlenmiş itilaf devletlerini görünce geldikleri gibi giderler dedi.\n" +
                    "Şişlide arkadaşlarıyla vatanın kurtuluşu üzerine toplantılar yaptı.\n" +
                    "Samsundaki Türk-Rum çatışmalarını önlemek için 9. Ordu Müfettişliği göreviyle Samsuna çıktı. Amacı bölgedeki Türk-Rum çatışmasını önlemek.\n" +
                    "Yaptığı incelemeler sonucunda Samsun Raporunu yayınladı.\n" +
                    "Güvenlik gerekçesiyle “Havzaya” geçti. Burada Türk milletinin milli bilincini uyandırmak amacıyla Havza Genelgesini yayınladı. İlk defa İzmir’in işgali Havzada protesto edildi. Bu olay sonucunda ilk defa İstanbul’a geri çağrıldı.",
            "Havza Genelgesi\n" +
                    "\n" +
                    "Mustafa Kemal tarafından tek başına yayınlandı.\n" +
                    "Milli bilinci uyandırmak için hazırlandı.",
            "Havza Genelgesinin Maddeleri\n" +
                    "\n" +
                    "İzmir’in işgali her yerde protesto edilecek.\n" +
                    "Protestolar yapılırken masum azınlıklara zarar verilmeyecek.\n" +
                    "Haklı iken haksız duruma düşmemek.\n" +
                    "Ordular dağıtılmayacak silahlar teslim edilmeyecek.",
            "Balıkesir – Alaşehir Kongreleri\n" +
                    "\n" +
                    "Hacım Muhittin Bey toplamıştır.\n" +
                    "Batı cephesi kurulmuştur.\n" +
                    "Gerektiğinde Yunana karşı herhangi bir itilaf devletinden yardım alınabileceği kararı alınmıştır.\n" +
                    "Mustafa Kemal katılmamıştır.\n" +
                    "NOT: Ayrıca Batı Anadolu’da Galip Hoca takma adıyla Reşad-ı Sani lakabıyla Celal Bayar kongreler düzenlemiştir.",
    };
    public static String TbmmAyaklamalar[] = {
            "23 Nisan 1920 tarihinde Türkiye Büyük Millet Meclisi açıldı. Bunun amacı ülkemizde bir araya toplamak ve ülkemizi kurtarmak için mücadele etmektir. Ancak tabii hiç kolay olmamıştır ve TBMM’ye karşı bazı isyanlar yaşanmıştır. ",
            "Türkiye Büyük Millet Meclisi Ankara'da açılmıştır. Çünkü o dönem itilaf devletlerinin ulaşamadığı en önemli şehirlerden biri Ankara idi. O yüzden ülkenin birçok farklı şehrinden milletvekilleri Ankara'ya geldi ve TBMM çatısı altında birleşti. Böylece farklı şehirlerden temsil eden Milletvekilleri ülkenin kurtuluşu için meclis bünyesinde ortak karar vermeye başladı.",
            "Büyük Millet Meclisine Karşı Ayaklanmalar\n" +
                    "\n" +
                    " Türkiye Büyük Millet Meclisi açıldığı günden itibaren pek çok farklı İsyan ortaya çıktı. Bu isyanların bazıları olumlu bazıları ise olumsuz durumlar ortaya çıkardı. Olumsuz açıdan yaşanan İsyan sebebiyle Kurtuluş Savaşı daha geç başladı. Ancak Türkiye Büyük Millet Meclisi'nin otoritesi arttı ve daha güçlü hale geldi.",
            "TBMM'nin Aldığı Önlemler Nelerdir?\n" +
                    "\n" +
                    " Türkiye Büyük Millet Meclisi yaşanacak bazı isyanlara karşı o dönem önlemler aldı. Çünkü zaten bazı isyanların çıkacağı biliniyordu ve bu yüzden bir takım önlemler öne çıkarıldı.\n" +
                    "\n" +
                    " - Hıyanet-i Vataniye kanunu\n" +
                    "\n" +
                    " - İstiklal Mahkemeleri\n" +
                    "\n" +
                    " - Vatan hainleri için fetva\n" +
                    "\n" +
                    " - İstanbul hükümeti ile irtibatların kesilmesi",
            "TBMM'ye Karşı Ayaklanmalar Nelerdir?\n" +
                    "\n" +
                    " Türkiye Büyük Millet Meclisine karşı farklı ayaklanmalar yaşanmıştır. Bu ayaklanmaların başında ise farklı insanlar bulunur. Özellikle bazı ayaklanmalar TBMM'nin oldukça zorlanmasına sebep olmuştur. Şimdi bu ayaklanmaların neler olduğuna bakalım.\n" +
                    "\n" +
                    " - İstanbul Hükümeti'nin gerçekleştirdiği ayaklanmalar\n" +
                    "\n" +
                    " - Azınlıkların ayaklanmaları\n" +
                    "\n" +
                    " - İstanbul ve İtilaf devletleri ile yapılan ayaklanmalar\n" +
                    "\n" +
                    " Şimdi bu ayaklanmaları sırasıyla bakalım ve neler olduğunu öğrenmeye çalışalım.",
            " İstanbul Hükümeti'nin gerçekleştirdiği ayaklanmalar: İstanbul Hükümeti'nin gerçekleştirdiği 2 ayaklanma bulunmaktadır. Bunlar Anzavur Ayaklanması ve Kuvayi inzibatiye Ayaklanması olarak bilinmektedir.",
            " Azınlık ayaklanmaları: Osmanlı Devleti'nde yaşayan ve azınlık olarak bilinen yani yabancı vatandaşların çıkardığı ayaklanmalardır. Bu ayaklanmalar ülkenin İtilaf Devletlerinin eline geçmesi için gerçekleştiren ayaklanmalardır. ",
            "İstanbul ve İtilaf devletleri ile birlikte yapılan ayaklanmalar: Bu ayaklanmalar Türkiye Büyük Millet Meclisi'ni en çok zorlayan ayaklanmalardır. Özellikle İtilaf Devletleri bu ayaklanmaları destek verdiği için çok daha güçlüydüler.",
    };
    public static String KurtulusSavasiAnlasmalar[] = {
            "Doğu Cephesi, düzenli ordunun savaştığı ilk cephedir. Çünkü burada Osmanlı Devleti’nden kalan son askeri birlik olan 15. Kolordu bulunmaktadır. Bu Kolordu’nun komutanı olan Kazım KARABEKİR, Mondros Ateşkesi’ne uymayarak birliğini dağıtmamıştır.",
            "Doğu Cephesi’nde ERMENİLER ile mücadele edilmiştir.",
            "Mondros Ateşkes Antlaşması’ndan sonra zaten bugünkü Ermenistan Devleti kurulmuştu.",
            "Sevr Antlaşması’nın imzalanmasından sonra, bu antlaşmada kendilerine verilen Doğu Anadolu topraklarını ele geçirmek için saldırıya geçtiler.\n" +
                    "\n" +
                    "Zaten böyle bir saldırıyı uzun süredir bekleyen ve buna hazırlıklarını yapan Kazım Karabekir, TBMM tarafından Doğu Cephesi komutanlığına tayin edildi.",
            "15. Kolordu ile Ermeni saldırısını durduran Kazım Karabekir, Ermenileri Gümrü’ye kadar geri çekilmek zorunda bıraktı.\n" +
                    "\n" +
                    "Sonunda yenilgiyi kabul eden Ermenistan ile TBMM (TBMM’yi temsilen Kazım Karabekir) arasında Gümrü Antlaşması imzalandı. (3 Aralık 1920)",
            "Gümrü Antlaşması’nın Maddeleri\n" +
                    "\n" +
                    "Türkiye ile Ermenistan arasındaki sınır, Aras Nehri-Çıldır Gölü hattı olacak\n" +
                    "Ermenistan SEVR’İN geçersiz olduğunu kabul edecek.",
            "Gümrü Antlaşması’nın Önemi\n" +
                    "\n" +
                    "Gümrü Antlaşması TBMM’nin kazandığı ilk siyasi başarıdır.\n" +
                    "Bu antlaşma ile TBMM’nin varlığı ilk kez bir devlet tarafından tanınmış oldu. (Bunun için taraflarına görüşmesi yeterli)\n" +
                    "Ayrıca Ermenistan Misak-ı Milli’yi kabul eden ilk devlet oldu. Böylece Sevr’de kendilerine verilen topraklardan da vazgeçmiş oldular.\n" +
                    "Gümrü Antlaşması Doğu sınırımızı belirleyen üç antlaşmadan ilki olmuştur. (Diğerleri Moskova ve Kars antlaşmaları)\n" +
                    "Gümrü Antlaşması ile Doğu Cephesi kapanmıştır. Doğu Cephesi’ndeki birliklerimizin bir bölümü Batı Cephesi’ne kaydırıldı.",
            "Güney Cephesi, düzenli ordunun savaşmadığı tek cephedir. Burada mücadele baştan sona Kuvayi Milliye birlikleri ile yürütülmüştür.",
            "Güney Cephesi’nde Fransa ve Fransızların silahlandırdığı Ermenilerle mücadele edilmiştir.",
            "Güney Cephesi düşmana ilk kurşunun atıldığı (Hatay/Dörtyol), Kuvayi Milliye’nin ilk doğduğu yerdir.",
            "Güney Cephesi’nde bir taraftan Sütçü İmam, Tayyar Rahime, Yılanoğlu gibi yerel kahramanlar, diğer taraftan Şahin Bey, Ali Saip Bey gibi TBMM’nin gönderdiği subaylar Kuvayi Milliye hareketini örgütlemiştir.",
            "Antep Savunması\n" +
                    "\n" +
                    "Antep savunması Üsteğmen Salih Bey liderliğinde örgütlenmiştir. Antep halkının Şahin Bey adını verdiği Üsteğmen Salih Bey, bu mücadelede şehit düşmüştür.\n" +
                    "Antep halkı Fransız ve Ermeni kışkırtmaları karşısında ayaklanarak düşmanı şehirden atmış, ardından oldukça uzun süre kuşatmaya karşı direnmiştir. Bu mücadele sırasında şehir halkının 2/3’si şehit düşmüştür.\n" +
                    "Antep’e, 6 Şubat 1921’de TBMM tarafından “GAZİ” unvanı verilmiştir.",
            "Maraş Savunması\n" +
                    "\n" +
                    "Maraş’ta mücadelenin lideri Sütçü İmam olmuştur.\n" +
                    "Maraş’ta mücadele 2 Şubat 1920’ye kadar sürdü. Bu tarihte Fransızlar kenti terk etmek zorunda kaldı.\n" +
                    "Maraş’a 7 Şubat 1972’de TBMM tarafından “KAHRAMAN” unvanı verilmiştir.",
            "Urfa Savunması\n" +
                    "\n" +
                    "Urfa’da Kuvayi Milliye, TBMM’nin bölgeye gönderdiği Ali Saip Bey önderliğinde örgütlenmiştir.\n" +
                    "Urfa’ya 1984 yılında “ŞANLI” unvanı verilmiştir.",
            "1921 Ankara Antlaşması (TBMM-FRANSA) Türkiye-Suriye sınırı Hatay ve İskenderun dışında bugünkü gibi çizilmiştir. ",
            "1921 Ankara Antlaşması’nın Önemi\n" +
                    "\n" +
                    "Ankara Antlaşması ile Fransa Anadolu’yu terk etti. Böylece İtilaf Bloğu tamamen parçalandı ve İngiltere Anadolu’da yalnız kaldı. (Yunanlıları saymıyoruz)\n" +
                    "Fransa, Ankara antlaşması ile Misak-ı Milli’yi kabul eden ilk İtilaf Devleti oldu.\n" +
                    "Güney Cephesi kapandı. Bu bölgedeki birlikler de Batı Cephesi’ne kaydırılabildi.",
            "Öncelikle Batı’da Yunanlılara karşı mücadelenin İzmir’in işgalinden itibaren başladığını tekrar hatırlatalım.",
            "Yunan ordusunun Sevr’i Osmanlı’ya kabul ettirmek için yaptığı kapsamlı saldırı:\n" +
                    "\n" +
                    "Büyük miktarda toprağın kaybedilmesine,\n" +
                    "Yunanlıların Eskişehir önlerine kadar ilerlemelerine\n" +
                    "Kuvayi Milliye’nin yetersizliğinin anlaşılmasına sebep oldu.",
            "Kuvayi Milliye’nin düzenli orduya göre eksik olan yönleri\n" +
                    "\n" +
                    "Kuvayi Milliye’nin en büyük eksikliği gayri nizami harp tekniklerini kullanmasıdır. Dolayısıyla karşısında düzenli ordunun ilerleyişini durduracak ya da bu orduyu gere çekilmeye zorlayacak gücü yoktur.\n" +
                    "Kuvayi Milliye birliklerinin askeri düzen ve disiplinden yoksun oluşu\n" +
                    "Bazı Kuvayi Milliye liderlerinin emir almak istememeleri\n" +
                    "Bazı Kuvayi Milliye birliklerinin, çoğunlukla da Kuvayi Milliye’nin adını kullanan eşkıyaların ihtiyaçlarını halktan zorla karşılaması\n" +
                    "Bazı Kuvayi Milliye liderlerinin hukuk devleti anlayışına ters olarak suçlu gördüklerini kendilerince cezalandırmaları",
            "Batı Cephesi’nde Yunan ordusuna karşı beş muharebe yapıldı.\n" +
                    "\n" +
                    "İnönü Muharebesi (Savunma)(Zafer)\n" +
                    "İnönü Muharebesi (Savunma)(Kısmi Yenilgi)\n" +
                    "Kütahya-Eskişehir Muharebesi (Savunma)(Yenilgi)\n" +
                    "Sakarya Meydan Muharebesi (Savunma)(Zafer)\n" +
                    "Büyük Taarruz ve Başkomutanlık Meydan Muharebesi (Saldırı)(Zafer)",
            "İtilaf Devletleri, Londra Konferansı’nı düzenlemek ve TBMM’yi bu konferansa davet etmek zorunda kaldılar.\n" +
                    "Sovyet Rusya ile Moskova Dostluk Antlaşması imzalandı.\n" +
                    "Afganistan ile bir dostluk antlaşması imzalandı.",
            "Teşkilat-ı Esasiye’nin ve İstiklal Marşı’nın kabul edilmesi yeni Türk Devleti’nin kuruluşunu ilan anlamına gelmektedir.",
            "KARS ANTLAŞMASI (13 EKİM 1921)\n" +
                    "TBMM Hükümeti ile Sovyet Rusya’nın güdümündeki Kafkas Cumhuriyetleri (Azerbaycan, Ermenistan ve Gürcistan) arasında imzalanmıştır.\n" +
                    "Bu antlaşma Sovyet Rusya ile imzaladığımız Moskova antlaşmasının sınırlar ile ilgili olan kısmının asıl sınır komşumuz durumundaki Kafkas Cumhuriyetleri ile tekrar edilmesidir.",
            "Barış görüşmelerinden önce TBMM’nin karşısına bu konu ile ilgili bazı problemler çıkmıştır. Görüşmelere güçlü bir şekilde katılabilmek için bu problemlerin halledilmesi gerekmektedir.",
            "Rauf Orbay (Mondros’un kara lekesini temizlemek için) çok istekli olmasına rağmen, İsmet İnönü başkanlığında bir heyetin gönderilmesine karar verilmiştir. İsmet İnönü dışişleri bakanı olmuştur.",
            "İtilaf Devletleri Türk tarafını bölerek görüş ayrılıklarından yararlanmak istemektedir. Bu davet üzerine TBMM, 1 Kasım 1922’de Saltanatı kaldırmıştır. Böylece Lozan’a Türk milletinin tek temsilcisi olarak katılmıştır.",
            "Lozan’a giden heyete verilen emre göre\n" +
                    "\n" +
                    "Kapitülasyonlar\n" +
                    "Ermeni Yurdu\n" +
                    "Konularında asla taviz verilmeyecektir.",
            "LOZAN’A KATILAN DEVLETLER\n" +
                    "\n" +
                    "Türkiye (TBMM)\n" +
                    "İngiltere\n" +
                    "Fransa\n" +
                    "İtalya\n" +
                    "Yunanistan\n" +
                    "Romanya\n" +
                    "Yugoslavya\n" +
                    "Japonya\n" +
                    "Sovyet Rusya (Sadece Boğazlar konusu için)\n" +
                    "Bulgaristan (Sadece Boğazlar konusu için)\n" +
                    "ABD (Gözlemci)",
            "Lozan Konferansı’nda birinci tur görüşmeler 20 Kasım 1922’de başladı. Ancak;\n" +
                    "\n" +
                    "Dış borçlar,\n" +
                    "Kapitülasyonlar,\n" +
                    "Boğazlar,\n" +
                    "Musul,\n" +
                    "Karaağaç\n" +
                    "Konularında yaşanan anlaşmazlık nedeniyle 4 Şubat nedeniyle sonuçsuz olarak dağıldı.",
            "Batı Sınırı: Türkiye-Yunanistan sınırı, Mudanya Ateşkes’inde belirlendiği gibi Meriç Nehri olacak. Ayrıca Yunanistan Karaağaç Kasabasını savaş tazminatı olarak verecek\n" +
                    "Güney Sınırı: Fransa ile imzalanan 1921 Ankara Antlaşmasına göre olacak. Dolayısıyla Hatay ve İskenderun’un, Türkiye ile bağları devam etmek ve özel bir yönetime sahip olmak şartıyla Suriye toprağı sayılacak\n" +
                    "DİKKAT: Hatay konusunda Misak-ı Milli’den taviz verilmiştir. Ancak bu sorun 1939’da Hatay’ın anavatana katılması ile Misak-ı Milli’ye göre çözümlenmiştir.\n" +
                    "Irak Sınırı: Her iki taraf da (Türkiye ve İngiltere) Musul konusunda taviz vermediği için bu konu Türkiye ve İngiltere’nin daha sonra aralarında yapacağı görüşmelere bırakılmıştır.\n" +
                    "DİKKAT: Tam bir karar çıkmasa da Musul konusunda Misak-ı Milli’den taviz verilmiştir.",
            "Osmanlı Borçları (Dış Borçlar)\n" +
                    "\n" +
                    "Türkiye’nin tezi kabul edilmiştir. Bu teze göre Osmanlı borçları, Osmanlı Devleti’nden ayrılan topraklara bölüştürülmüştür. Türkiye üzerine düşen borcu kâğıt parayla ve taksitler halinde ödemeyi kabul etmiştir.\n" +
                    "Ayrıca Duyun-u Umumiye’nin (Genel Borçlar İdaresi) kaldırılması kararlaştırılmıştır.",
            "Kapitülasyonlar\n" +
                    "\n" +
                    "Osmanlı Devleti’nin şimdiye kadar verdiği tüm kapitülasyonlar tamamen kaldırılmıştır. Kapitülasyonların kaldırılması tam bağımsızlık, dolayısıyla milliyetçilik ilkesi ile ilişkilendirilebilir.",
            "Azınlık Hakları\n" +
                    "\n" +
                    "Azınlık diye bir şey olmadığı, Türkiye’de yaşayan herkesin Türk Vatandaşı olduğu ve aynı kanunlara tabi olacağı kabul edilmiştir.\n" +
                    "Bunun yanında Türkiye, azınlıkların uluslar arası antlaşmalardan doğan haklarını kabul etti.",
            "Nüfus Mübadelesi (Nüfus değiş-tokuşu)\n" +
                    "\n" +
                    "İstanbul’da yaşayan Rumlar ve Batı Trakya’da yaşayan Türkler dışında kalan her iki ülkedeki Türk ve Rum nüfus karşılıklı olarak yer değiştirecektir.",
            "Boğazlar\n" +
                    "\n" +
                    "Boğazların Türkiye’ye ait olduğu kabul edilse de Boğazların kontrolü, başkanı Türk olan uluslar arası bir komisyona bırakıldı.\n" +
                    "Ayrıca Türkiye’nin Boğazlar her iki yakasında 20’şer kilometrelik kısımları askerden arındırması kararlaştırıldı.\n" +
                    "Boğazlar barış zamanında tüm ticaret gemilerine açık olacak",
            "Savaş Tazminatı\n" +
                    "\n" +
                    "Osmanlı Devleti’nin Birinci Dünya Savaşı’ndaki yenilgisi nedeniyle Türkiye savaş tazminatı ödemeyecek",
            "Ege Adaları\n" +
                    "\n" +
                    "Balkan Savaşlarında kaybettiğimiz Ege Adaları geri alınamamıştır. 1913 Londra Antlaşması’nda kabul edilen karar geçerli olmuştur.\n" +
                    "İmroz (Gökçeada) ve Bozcaada dışındaki Ege Adaları Yunanistan’a aittir.\n" +
                    "Ancak Yunanistan, Türkiye’ye yakın Ege Adaları’nda silah, askeri üs bulundurmamayı kabul etmiştir.",
            "Patrikhane Sorunu\n" +
                    "\n" +
                    "İstanbul’daki Fener Rum Patrikhanesi artık Ortodoks mezhebinin merkezi olamayacak\n" +
                    "Yalnızca İstanbul Rumlarına hizmet veren sıradan bir kilise olarak İstanbul’da kalacak",
            "Yabancı Okullar\n" +
                    "\n" +
                    "Bu konunun Türkiye’nin bir iç meselesi olduğu, yabancı okulların Türkiye’nin çıkaracağı kanunlara, koyacağı kurallara uyacağı kabul edilmiştir.",
            "İstanbul’un Boşaltılması\n" +
                    "\n" +
                    "İstanbul’un Lozan Antlaşması onaylandıktan sonra, 6 hafta içerisinde boşaltılacağı kararlaştırıldı.",
            "LOZAN BARIŞ ANTLAŞMASI’NIN ÖNEMİ\n" +
                    "Lozan, Yeni Türk Devleti’nin varlığının ve bağımsızlığının tüm Dünya tarafından kabul edilmesidir.\n" +
                    "Dünya Savaşı’nı ve Kurtuluş Savaşı’nı bitiren Barış antlaşmasıdır.\n" +
                    "Dünya Savaşı sonunda imzalanan antlaşmalar içerisinde günümüze kadar geçerliliğini koruyan tek antlaşmadır. (Türkiye II. Dünya Savaşı’na girmediği için)\n" +
                    "Türk Milletinin bu başarısı, tüm Dünya’daki sömürge (Ya da Manda) altındaki mazlum milletlere örnek olmuştur.\n" +
                    "Böylece Kurtuluş Savaşı tüm yönleriyle sona ermiş, inkılâplar için gereken barış ortamı sağlanmıştır.",
    };
    public static String CumhuriyetDonemiNotlar[] = {
            "CUMHURİYET’İN İLANI (29 EKİM 1923)" +
                    "Nedeni:\n" +
                    "Milli egemenliği gerçekleştirme düşüncesi (temel neden)\n" +
                    "Hükümet (Ekim, Sonbahar, Güz) Bulanımı yani Fethi Okyar’ın istifası ile yeni bir hükümetin kurulamaması\n" +
                    "Milli mücadelenin kazanılmış olması\n" +
                    "Devletin rejim, isim ve başkanlığı tartışmaları",
            "Sonucu:\n" +
                    "Cumhuriyet oy birliğiyle kabul edilmiştir.\n" +
                    "Milli egemenlik yolunda atılan en önemli adımdır.\n" +
                    "Kabine yani karma sisteme geçilmiştir\n" +
                    "Devletin rejimi, adı, ve başkanlığı belirlenerek tartışmalar bitmiştir\n" +
                    "İlk Cumhurbaşkanı Mustafa Kemal (4 defa seçilmiş)\n" +
                    "İlk Başbakan İsmet İnönü\n" +
                    "Cumhuriyet döneminin ilk meclis başkanı Fethi Okyar (ilk meclis başkanı Mustafa Kemal)",
            "İlk Dış İşleri Bakanı: Bekir Sami Bey\n" +
                    "İlk Sağlık Bakanı:Adnan Adıvar\n" +
                    "İlk MEB Bakanı:Rıza Nur\n" +
                    "İlk Diyanet İşleri :Rıfat Börekçi\n" +
                    "İlk Adelet Bakanı:Celaleettin Arif\n" +
                    "İlk Milli Savunma :Fevzi Çakmak\n" +
                    "İlk İçişleri Bakanı:Cami Baykut\n" +
                    "İlk İktisat Bakanı:Y.Kemal Tengirşek\n" +
                    "İlk Maliye Bakanı:Hakkı Behiç\n" +
                    "İlk Bayındırlık :İsmail Fazıl\n" +
                    "ŞeriyeBakanı:Mustafa Fehmi Efendi",
            "Halifeliğin Kaldırılması (13 Mart 1924):\n" +
                    "Nedeni:\n" +
                    "Laiklik ile çelişmesi\n" +
                    "Abdülmecit Efendi’nin padişah gibi davranması\n" +
                    "Rejim karşıtlarının toplandığı bir odak noktası olması\n" +
                    "İnkılaplar önünde bir engel olması\n" +
                    "Ağahanın Pakistan’dan gönderdiği mektup",
            "Aynı Gün (Halifelik) Kanunları\n" +
                    "1) Tevhid-i Tedrisat Kanunu: Eğitim ve öğretimin birleştirilmesi kanunu\n" +
                    "2) Şeriye ve Evkaf Vekaletinin Kaldırılması: Yerine Diyanet İşleri Başkanlığı ile Vakıflar Genel Müdürlüğü kurulmuştur.\n" +
                    "3) Erkan-ı Harbiye Nezaretinin Kaldırılması: Yerine Genel Kurmay Başkanlığı ile Milli Savunma Bakanlığı kuruluyor.\n" +
                    "4) Osmanlı Hanedanının Yurtdışına Çıkarılması: Amaç rejimi korumaktır.",
            "Halifeliğin Kaldırılması Sonuçları\n" +
                    "Laiklik yolunda atılan en önemli adımdır\n" +
                    "Osmanlı devletinin siyasi izi silinmiş ve yönetimdeki ikilik tamamen sona ermiştir\n" +
                    "İnkılaplar önündeki en büyük engel ortadan kalkmıştır\n" +
                    "Milli egemenlik anlayışı güçlenmiştir. (Cumhuriyetçilik)\n" +
                    "Milli devlet anlayışı güçlenmiştir. (Milliyetçilik)",
            "CHP’NİN KURULMASI (9 EYLÜL 1923)\n" +
                    "Türkiye’nin ilk siyasi partisidir\n" +
                    "Müdafa-i Hukuk grubu CHP’ye dönüşmüştür\n" +
                    "Demokrasiyi geliştirmek için kurulur\n" +
                    "Daha düzenli, disiplinli, uyumlu inkılap yapmak için\n" +
                    "Cumhuriyetin ilanından önce kurulmuştur.\n" +
                    "Altı ilkeyi parti programına almıştır\n" +
                    "Mustafa Kemal kurucusu ve ölümüne kadar başkanıdır\n" +
                    "Ekonomide devletçilik benimsemiş",
            "Çok Partili Hayat Denemeleri\n" +
                    "1) Terakkiperver Cumhuriyet Partisi (1924):\n" +
                    "Muhalefet, denetleme ve demokrasi için kurulmuştur\n" +
                    "Kurucuları: Kazım Karabekir, Ali Fuat Cebesoy, Adnan Adıvar, Rauf Orbay, Refet Bele",
            "Özellikleri:\n" +
                    "Türkiye’nin ilk muhalefet partisidir\n" +
                    "Cumhuriyetin ilanından sonraki ilk partidir\n" +
                    "“Partimiz dini inançlara saygılıdır” ifadesine yer vermiştir\n" +
                    "Halifeliğin kaldırılmasına tepki göstermiştir\n" +
                    "Ekonomide liberalizmi savunmuştur\n" +
                    "Laiklik, devletçilik ve inkılapçılığa karşıdırlar\n" +
                    "Tek dereceli seçim sistemini savunmuşlar\n" +
                    "Cumhurbaşkanı’nın parti başkanı ve milletvekili olmasına karşı çıkmışlar\n" +
                    "Yerinden yönetimi savunmuşlar",
            "ŞEYH SAİT AYAKLANMASI (1925)\n" +
                    "Nedenleri:\n" +
                    "Rejim karşıtlarının desteği\n" +
                    "TCF’nin oluşturduğu siyasi ortam\n" +
                    "İngilizlerin desteği\n" +
                    "Halifeliğin kaldırılmasına tepki\n" +
                    "Etnik gerekçeler",
            "Gelişimi:\n" +
                    "Piran’da başlamış Doğu Anadolu’ya yayılmıştır." +
                    "Sonucu:\n" +
                    "Türkiye’de Laik Cumhuriyet rejimine karşı ilk isyandır.\n" +
                    "Fethi Okyar hükümeti isyanı bastıramadığı için istifa etmiş. Yerine İsmet İnönü hükümeti kurulmuştur.\n" +
                    "Takrir-i Sükun Kanunu çıkarılmıştır.\n" +
                    "Takrir-i Sükun dönemi 1925 – 1929 yılları arasında devam etmiştir\n" +
                    "Tekke zaviye ve türbeler kapatılmıştır\n" +
                    "Bazı basın organlarına sansür uygulanmıştır.\n" +
                    "İstiklal Mahkemeleri kurulmuştur\n" +
                    "Musul kaybedilmiştir\n" +
                    "TCF isyanda rolü vardır. Gerekçesiyle kapatılmıştır",

    };
    public static String IcveDis[] = {
            "ATATÜRK DÖNEMİ TÜRK DIŞ POLİTİKASI" +
                    "Türk dış politikası “Yurtta barış, Dünyada barış” ilkesini merkeze alarak oluşturulmuştur. " +
                    "Ancak, tam bağımsızlığa aykırı olan (ters düşen) bir adımın da atılmasına kesinlikle izin verilmeyecektir.",
            "Türk Dış Politikasının Temel Esasları\n" +
                    "\n" +
                    "Tam bağımsızlık,\n" +
                    "Karşılıklılık (mütekabiliyet)\n" +
                    "Eşitlik,\n" +
                    "Akılcılık,\n" +
                    "Gerçekçilik,\n" +
                    "Kamuoyunu dikkate almak, (toplumun istekleri dikkate alınır)\n" +
                    "Barışçılık,\n" +
                    "Millî menfaatler (Çıkarlarımız)",
            "Musul Sorunu:ozan Barış Antlaşması görüşmelerinde Musul’un hangi devlete bağlanacağı hakkında görüşülmüş ancak tarafların taviz vermemesi sonucunda Musul sorunu Lozan’da çözüme kavuşmamıştı.\n" +
                    "Çözüm olarak Türkiye ile Irak (İngiliz Mandası) hükümetleri arasında 9 ay içinde başlayacak ikili görüşmeler ile Musul’un kime verileceğinin kararlaştırılması istenmiştir.\n" +
                    "19 Mayıs 1924 tarihinde ikili görüşmeler başlamış ancak iki tarafında Lozan’daki görüşlerini sürmesi nedeniyle bu görüşmeler de sonuçsuz kalmıştır.",
            "Devletlerin İstekleri:\n" +
                    "Türkiye:\n" +
                    "Musul ve çevresinde Türkler çoğunluktadır,\n" +
                    "Musul Misak-ı Milli sınırları içindedir.\n" +
                    "İngiltere:\n" +
                    "İngilizler Musul ve çevresindeki engin petrol yataklarını bırakmak istememişlerdir.",
            "Nasıl Çözüldü?\n" +
                    "İstanbul’da toplanmış olan konferanstan da istediği sonucu alamayan İngiltere Türkiye’yi eğer isteklerini yumuşatmazsa askeri bir müdahale yapmakta tehdit etmişti.\n" +
                    "Türkiye ise bu tehdit karşısında İngiltere’ye eğer gerekirse bağımsızlığımızı ve sınır güvenliğimizi korumak için askeri bir harekat yapmaktan geri durmayacağı yönünde bir cevapla karşılık vermişti.\n" +
                    "Bu gelişme üzerine İngiltere geri adım atmak zorunda kalmıştı.\n" +
                    "Türkiye ikili görüşmelerden bir sonuç alınamaması üzerine konuyu Milletler Cemiyeti’ne taşımıştı. Türkiye Milletler Cemiyeti’nden Lozan’ın ruhuna uygun olarak Musul’un Türkiye’ye verilmesi yoluyla sorunun çözülmesini istemişti.\n" +
                    "Ancak Milletler Cemiyeti bu konuda İngiliz yanlısı davranmış ve Musul’un Irak’a bırakılması gerektiği yönünde bir görüş bildirmiştir.",
            "Nüfus Mübadelesi (Etabli Sorunu)" +
                    "Etabli: Yerleşik anlamında kullanılmaktadır.\n" +
                    "\n" +
                    "Lozan Antlaşması görüşmeleri ve sonrasında daha çok İstanbul’daki Rumlar için kullanılan bir kavramdır.\n" +
                    "Mübadele: Değiş – tokuş, takas anlamlarında kullanılan bir kavramdır.",
            "Dış Borçlar Sorunu\n" +
                    "Fransa ile yaşanmıştır,\n" +
                    "Lozan Barış Antlaşmasında dış borçlar konusunun borçlu ve alacaklı devlet arasında yapılacak olan antlaşma ile çözülmesi istenmiştir.\n" +
                    "1928 yılında Paris’te yapılan antlaşma ile Osmanlı Devleti’nden kalan borçların ödenmesi konusu netleştirilmiştir.",
            "Atatürk Dönemi Türk İç Politika:" +
                    "2. TBMM açıldı.(1923 – 1927)\n" +
                    "2. TBMM’ye Mustafa Kemal Ankara – Bağla’dan, 1. TBMM’ye Ankara – Koçhisar’dan.\n" +
                    "CHP, Anadolu ve Rumeli Müdafaa-i Hukuk cemiyetinin Halk Fırkası adında kurulmuştur.\n" +
                    "CHP,\n" +
                    "Ebedi Şef, Atatürk\n" +
                    "Milli Şef, İsmet İnönü\n" +
                    "CHP, ekonomide devletçilik modelini işlemiştir.\n" +
                    "CHP, Çift Dereceli Seçim sistemini savunmuştur.\n" +
                    "Çift Dereceli Seçim tam demokrasi değildir.",
            "Terakkiperver Cumhuriyet Fırkası\n" +
                    "Türkiye Cumhuriyet’inin ilk muhalefet partisidir.\n" +
                    "Genel Başkanı Kazım Karabekir‘dir.\n" +
                    "Önemli isimler;\n" +
                    "Rauf Orbay\n" +
                    "Ali Fuat Cebesoy\n" +
                    "Refet Bele\n" +
                    "Adnan Adıvar\n" +
                    "Muhalefet olduğu için;\n" +
                    "CHP ekonomide devletçiliği, bu parti Liberalizmi\n" +
                    "CHP çift dereceli seçim sistemini, bu parti tek dereceli seçim sistemini savunuyor.\n" +
                    "Adem-i Merkeziyetçilik ilke edinilmiştir.\n" +
                    "Cumhurbaşkanı’nın parti başkanı olmaması gerektiğini belirtmiştir.\n" +
                    "Anayasa değişikliklerinde halka danışılmasına değinilmiştir.\n" +
                    "Parti ilk şubesini Urfa’da açmıştır.",
            "Şeyh Said İsyanı\n" +
                    "Ali Fethi Okyar hükümeti istifa edip yerine İsmet İnönü hükümeti kurulmuştur.\n" +
                    "İsmet İnönü isyanı bir orduyla bastırıyor ve o bölgede Takrir-i Sükun kanunu çıkarıyor.\n" +
                    "Yargılamalar Diyarbakır ve Ankara İstiklal Mahkemeleri’nde yapılmıştır.\n" +
                    "Musul konusu aleyhimize sonuçlanmıştır.\n" +
                    "Çok partili idare için ortamın uygun olmadığı anlaşılmış ve ilk kez çok partili hayat kesintiye uğramıştır.\n" +
                    "Terakkiperver Cumhuriyet Fırkası kapatılmıştır.",
            "İzmir Suikastı\n" +
                    "İstiklal Mahkelerinin son kurulduğu olay İzmir Suikastı’dır.",
            "Bozkurt – Lotus Olayı\n" +
                    "Midilli yakınlarında Bozkurt adı verilen Türk gemimizi Lotus adında Fransız bir gemi batırıyor.Mevzu başlıyor…\n" +
                    "Fransız gemisinin komutanını biz yakalayıp kendi mahkemelerimizde yargılamak istedik.\n" +
                    "Buna karşı çıkan Fransa davayı Lahey Adalet Divanı‘na götürdü.\n" +
                    "Biz buraya Mahmut Esat Bey isminde bir avukat gönderdik.Nihayetinde Lahey Adalet Divanı Fransa komutanı kusurlu buldu ve Türk mahkemelerinde yargılanabilir dedi.Mahmut Esat Bey’in üstün avukatlığı neticesinde soyadı kanunundan sonra Bozkurt soyadı verildi.Mahmut Esat Bozkurt",
            "Razgard Olayı\n" +
                    "Bulgaristan’da bulunan Türk mezarlarının tahrip edilmesi olayıdır.",
            "Vagon-li Olayı\n" +
                    "İstanbul’da bulunan Fransız demiryolu şirketinde çalışan Naci Bey‘i şirkette Türkçe konuştuğu için işten çıkarılması olayıdır.",
            "Bursa Olayı\n" +
                    "Ezanın Türkçe okunmasıdır.\n" +
                    "İlk Türkçe ezan denemesi Yerebatan Sarnıcı‘nda okunmuştur.Okuyan Hafız Yaşar Okur‘dur.\n" +
                    "\n" +
                    "Fatih Camiin’de ki ezanı hoparlörden okuyan din adamı Hafız Rıfat Bey‘dir.",
            "Serbest Cumhuriyet Fırkasının Kurulması\n" +
                    "Mustafa Kemal isteğiyle Ali Fethi Okyar tarafından çok partili hayata geçmek için ve hükümetin denetlenmesini sağlamak için ve 1929 Dünya Ekonomik Krizine çareler üretmek için kuruldu.\n" +
                    "Kadınlara siyasi hak verilmesini talep etmiştir.",
            "Menemen(Kubilay) Olayı\n" +
                    "Derviş Mehmet ve adamları Divan-ı Harp‘te yargılandı.",

    };
    public static String AtaturkIlkeleri[] = {
            "CUMHURİYETÇİLİK:\n" +
                    "Cumhuriyetçilik: Cumhuriyeti benimseme, kabul etme, koruma ve yaşatmaya denir.",
            "Cumhuriyetçilik İle İlgili İnkılaplar:\n" +
                    "TBMM’nin açılması\n" +
                    "Saltanatın kaldırılması\n" +
                    "Cumhuriyetin ilanı\n" +
                    "Çok partili hayata geçiş denemeleri\n" +
                    "Kadınlara verilen siyasi haklar",
            "MİLLİYETÇİLİK:\n" +
                    "Milet: Geçmişte bir arada yaşayan gelecekte de yaşama kararlılığı olan aynı vatan, dil, kültür ve duygu birliği olan topluluktur.\n" +
                    "\n" +
                    "Milliyetçilik: Milleti sevme, yüceltme ve bu uğurda çalışmaya denir.",
            "Milliyetçilik İle İlgili İnkılaplar:\n" +
                    "Türk Tarih Kurumu’nun kurulması\n" +
                    "Türk Dil Kurumu’nun kurulması\n" +
                    "Kabotaj Kanunu\n" +
                    "Kapitülasyonların kaldırılması\n" +
                    "Misak-ı İktisadi kararları\n" +
                    "Tevhidi Tedrisat Kanunu",
            "HALKÇILIK:\n" +
                    "Milletin çıkarına ve yararına, eşit olarak, devletin halka hizmet etmesine denir.\n" +
                    "\n" +
                    "Halkçılık İle İlgili Anahtar Kelimeler: İnsan sevgisi, eşitlik, adalet, dayanışma, halk, eşit oy,  sosyal devlet anlayışı.",
            "Halkçılıkla İlgili İnkılaplar:\n" +
                    "Soyadı Kanunu’nun kabulü\n" +
                    "Türk Medeni Kanunu’nun kabulü\n" +
                    "Aşar vergisinin kaldırılması\n" +
                    "Kılık kıyafet İnkılabı\n" +
                    "Tekke ve zaviyelerin kapatılması\n" +
                    "Millet mekteplerinin açılması",
            "DEVLETÇİLİK\n" +
                    "Ülkenin güçlü bir ekonomiye sahip olmasını gerçekleştirmek için izlenecek yol ve yöntemlerin belirlenmesine denir.",
            "Devletçilikle İlgili İnkılaplar:\n" +
                    "Sümerbank ve Etibank’ın kurulması\n" +
                    "Birinci ve İkinci beş yıllık kalkınma planı\n" +
                    "Maden Tetkik Arama Enstitüsü (MTA)’ nün kurulması\n" +
                    "Devlet Demiryolları kurulması\n" +
                    "Merkez Bankası’nın kurulması\n" +
                    "İzmir İktisat Kongresi\n" +
                    "Teşvik i Sanayi Kanunu",
            "Devletçiliğin Ekonomik Politika Kabul Edilmesinin Nedenleri:\n" +
                    "Ekonomik Nedenler: Devletçilik, Türkiye’nin o zamanki şartlarından doğmuştur. Kişilerde para olmadığı için yatırımı devlet yapmıştır.\n" +
                    "Siyasi Nedenler: Kurtuluş Savaşı’ndaki zorluklar ve ABD’de 1929’da yaşanan ekonomik bunalım sebebiyle devletçilik ilkesi 1931 yılında doğmuştur.\n" +
                    "Sosyal-Kültürel Nedenler: Devlet toplumu sosyal ve kültürel alanda geliştirmek için okul, hastane, spor alanları yapar.\n" +
                    "Liberalizm (Karma Ekonomi): Devletçilikte kişilerin yapamayacağı büyük işleri devletin yapması, küçük işçiler için destek, kredi gibi devletin aldığı önlemlerle özel sektörü teşvik etmesine denir.",
            "LAİKLİK\n" +
                    "Hukuk kurallarının dine değil, akla, bilime dayandırılması ve kişisel vicdan hürriyetinin sağlanmasıdır. Bir diğer tanıma göre: Din ve devlet işlerinin birbirinden ayrılmasıdır.",
            "Laiklikle İlgili İnkılaplar:\n" +
                    "Saltanatın kaldırılması\n" +
                    "Halifeliğin kaldırılması\n" +
                    "Şeriyye ve Evkaf Vekaletinin kaldırılması\n" +
                    "Tevhid-i Tedrisat Kanunu\n" +
                    "1928 yılında “Devletin dini İslam’dır.” ilkesinin anayasadan çıkarılması\n" +
                    "1937’de laiklik ilkesinin anayasaya girmesi\n" +
                    "Medreselerin kapatılması\n" +
                    "Tekke ve zaviyelerin kaldırılması\n" +
                    "Kılık kıyafet İnkılabı\n" +
                    "Türk Medeni Kanunu",
            "İNKILAPÇILIK\n" +
                    "Çağın gerisinde kalmama, ilerleme, iyiye, güzele ve doğruya ulaşma kararlığıdır.",
            "İnkılapçılığın Özellikleri:\n" +
                    "İnkılapçılık Atatürk’ün tüm yaptığı inkılapları kapsar.\n" +
                    "İnkılapçılığın amacı: Türk milletini çağdaş medeniyet seviyesinin üzerine çıkarmaktır.\n" +
                    "İnkılapçılıkta sürekli bir yenilik yapma ve ilerleme vardır.\n" +
                    "Eskiyen kurumların yerine çağdaş, modern kurumlarının kurulması hedefi vardır.",
            "Atatürk ilkelerinin ortak özellikleri :\n" +
                    "Kaynağı milli kültürdür.\n" +
                    "Taklitçi değildir, kabul edilmesinde dış baskı ve zorlama yoktur.\n" +
                    "Evrensel ve barışçıdır.\n" +
                    "Türk milletinin ihtiyaçlarından doğmuştur.\n" +
                    "Hak ve hürriyetleri koruyucudur.\n" +
                    "Akılcı ve bilimseldir.\n" +
                    "Birbiriyle uyumlu, birbirini tamamlayıcıdır.\n" +
                    "Uygulamaya da yansımıştır.\n" +
                    "Laik düşünce ve hukuka dayanır.\n" +
                    "Milli egemenlik ve bağımsızlık temeline dayanır.",
            "Atatürk İlke Ve İnkılaplarını Oluşturan Temel Esaslar:\n" +
                    "Milli tarih bilinci ve Milli Dil\n" +
                    "Bağımsızlık ve özgürlük\n" +
                    "Vatan ve millet sevgisi\n" +
                    "Türk milletini çağdaş uygarlık seviyesinin üzerine çıkarma hedefi\n" +
                    "Egemenliğin millete ait olması\n" +
                    "Milli birlik beraberlik, ülke bütünlüğü",
            "Atatürk İlke Ve İnkılapları İle İlgili Kişisel Sorumluluklarımız:\n" +
                    "Atatürk 1935 yılında İstanbul’da Uluslararası Kadın Kongresini toplamıştır.\n" +
                    "Atatürk eserlerini ve geleceğe yönelik ideallerini “Türk gençliğine” emanet etmiştir.\n" +
                    "Gençliğe hitabede Türk İstiklal ve Cumhuriyeti’ni koruma görevini gençlere vermiştir.\n" +
                    "“Ey Türk istikbalinin evladı” sözü ile sadece günümüzdeki gençlere değil, gelecekteki gençlere de seslenmiştir.",
    };
    public static String CagdasDunyaTarihi[] = {
            "Milli İstiklal Ayaklanması: Yusuf Akçura ve Gaspıralı İsmail’in Kırımda Rusya’ya karşı başlattığı bağımsızlık hareketidir.",
            "Basmacı Hareketi: Türkistan Türklerindir sloganıyla Orta Asya Türklerinin bağımsızlık hareketidir. Enver Paşa bu hareketin liderliğini yapmıştır.",
            "NEP: Lenin’in Rusya’da uyguladığı ekonomik programdır.",
            "Meiji Restorasyonu: Japon imparatoru Mutsuhito’nun başlattığı ülkenin yeniden gelişmesi amacıyla batıya açılma politikasıdır. Bu süreçte batıdan alfabe alınmamıştır.",
            "1929 Krizi (Kara Perşembe): ABD’de başlayan ve bütün dünyayı etkileyen ekonomik krizdir.",
            "Krilling Sistemi: ABD’de kriz sonrası takasla alışveriş sistemidir.",
            "Locarno Sözleşmesi: Almanya ile yapılan silahsızlanma anlaşmasıdır.",
            "Briand Kellog Paktı: ABD ile Fransa öncülüğünde yapılan silahsızlanma anlaşmasıdır. Türkiye 1929’da katılmıştır.",
            "Sürrealizm: Birinci Dünya Savaşı sonrası başlayan sanat akımıdır. En önemli temsilcisi Salvador Dali’dir.",
            "Berlin – Roma Mihveri: Almanya ve İtalya ittifakıdır.",
            "Anti Komitern Pakt: Almanya ve Japonya ittifakıdır.",
            "Berlin – Roma- Tokyo Mihveri: Almanya, İtalya ve Japonya İttifakıdır.",
            "Mihver Grubu: Almanya, İtalya ve Japonyadır.",
            "Müttefik Grup: İngiltere, Fransa, SSCB ve ABD’dir.",
            "Maginot Hattı: Fransa’nın Almanya’ya karşı oluşturduğu savunma hattıdır",
            "Yıldırım Savaşları: Almanya’nın genel savaş taktiklerine denir.",
            "Barbarossa Harekatı: Almanya’nın SSCB üzerine yaptığı saldırılara denir.",
            "Stalingrad Savaşı: Almanya SSCB’ye yenilerek geri çekilmeye başlamıştır.",
            "Washington Konferansı 1943: Kuzey Afrika cephesi kapandıktan sonra toplanmıştır.",
            "Ödünç Verme Yasası: ABD müttefik devletlere borç vermiştir.",
            "Atlantik Bildirisi 1941: ABD’nin İngiltere ile yaptığı anlaşmadır. Wilson İlkelerine benzer.",
            "Pearl Harbour Baskını: Japonya’nın ABD’nin deniz üslerine saldırısıdır.",
            "Kahire Konferansı 1943: Uzak doğudaki gelişmeleri görüşmek için toplanmıştır. Türkiye’de çağrılmıştır.",
            "Kazablanka Konferansı 1943: ABD resmen savaş girmiş ve İtalya teslim olmuştur.",
            "Quebec Konferansı 1943: Fransa’yı kurtarmak için toplanmış ve Normandiya çıkarması yapılmıştır.",
            "Tahran Konferansı 1943: İran bağımsız olmuştur.",
            "Yalta Konferansı 1945: Savaş sonrası durumu görüşmek için toplanmış, en karlı devlet SSCB olmuştur. BM’nin kurulmasına karar verilmiştir",
            "San Fransisco Konferansı 1945: BM kurulmuş ve Almanya resmen teslim olmuştur",
            "Postdam Konferansı 1945: Almanya dört bölgeye ayrılmıştır.\n" +
                    "ABD, Japonya’daki Hiroşima ve Nagazaki’ye atom bombası atmıştır.",
            "II. Dünya Savaşı boyunca Cumhurbaşkanı İsmet İnönü’dür.\n" +
                    "II. Dünya Savaşı boyunca Refik Saydam ve Şükrü Saraçoğlu başbakanlık yapmıştır. Milli Korunma Kanunu çıkarılmıştır.\n" +
                    "Köy Enstitüleri kurulmuştur.\n" +
                    "Varlık Vergisi alınmaya başlanmıştır.\n" +
                    "Ekmek Karnesi uygulaması başlamıştır.\n" +
                    "Toprak Mahsulleri Ofisi Vergisi alınmıştır.",
            "Soğuk Savaş Dönemi (1945-1962)\n" +
                    "Soğuk Savaş tabirini ilk defa ABD’li Bernard Brauch kullanmıştır.\n" +
                    "ABD ve SSCB arasında gergin geçen yıllara denir.\n" +
                    "Komünizmin Arap coğrafyasına uyarlanmış şekline Baas Hareketi denir",
            "Truman Doktrini 1947:\n" +
                    "ABD’nin Türkiye ve Yunanistan’a yardım planıdır. Soğuk Savaşın başlangıcıdır.",
            "Cominform 1947:\n" +
                    "SSCB öncülüğünde kurulan komünist birliktir.",
            "Marshall Planı 1947:\n" +
                    "ABD’nin SSCB’nin yayılmasını önlemek amacıyla uyguladığı yardım planıdır.",
            "Molotof Planı 1947:\n" +
                    "SSCB’nin Marshall Planına karşı ortaya çıkan plandır.\n" +
                    "Hindistan bağımsızlık hareketinin lideri Mahatma Gandi’dir. (Yüce Ruh)****\n" +
                    "Hindistan’ın ilk başbakanı Javaharlal Nehru’dur.\n" +
                    "Pakistan’ın kurucusu Muhammed Ali Cinnah’tır.****\n" +
                    "Balfour Deklerasyonu 1917:\n" +
                    "İngiltere Siyonist Federasyonuna Filistin topraklarında İsrail kurma sözü vermiştir. COMECON 1949:\n" +
                    "SSCB öncülüğünde ABD’ye karşı kurulmuştur.",
            "NATO 1949:\n" +
                    "ABD öncülüğünde SSCB’ye karşı kurulmuş, Türkiye 1952’de üye olmuştur. Merkezi Brüksel, Genel Sekreteri şu anda Jens Staltenberg’dir.",
            "SEATO 1954:\n" +
                    "ABD’nin, Çin ve SSCB’nin yayılmasını önlemek amacıyla kurdurduğu Güneydoğu Asya birliğidir. Kuruluş amaç itibariyle NATO’ya benzer.",
            "Varşova Paktı 1955: \n" +
                    "SSCB öncülüğünde ABD ve NATO’ya karşı kurulan en güçlü birliktir.",
            "Bağlantısızlar ve Bandung Konferansı 1955: \n" +
                    "İki bloğa da katılmak istemeyen devletler tarafından kurulmuş ve Barış için birlikte yaşama sloganını benimsemişlerdir. 3. Dünya ülkeleri de denir.",
            "Eisenhoover Doktrini 1957:\n" +
                    "ABD’nin SSCB’den uzaklaşmaları için araplara para yardımı projesidir.",
            "Avrupa Ekonomik Topluluğu 1957:\n" +
                    "AB’nin temelidir. Kömür, demir ve çelik birliğidir. Türkiye 1959’da başvurmuştur. Hala üye değildir.\n" +
                    "OPEC 1960: Petrol ihraç eden ülkeler birliğidir. Merkez Viyana’dır. (ilginç değil miJ)",
            "U-2 Olayı 1960:  \n" +
                    "Türkiye’den kalkan ABD’nin U-2 casus uçakları Rusya’da düşürülünce iki ülke savaşın eşiğine gelmiş ve olay Türkiye’yi de etkilemiştir.",
            "Soğuk Savaş Döneminde Türkiye\n" +
                    "ABD bu dönemde Türkiye’yi yanında tutmak için jest olarak Büyükelçi Münir Ertegün’ün cenazesini en büyük savaş gemisi Misori Zırhlısıyla göndermiştir.\n" +
                    "Türkiye bu dönemde Avrupa Konseyi, NATO ve Balkan Antantı ve Bağdat Paktı’na katılmıştır.\n" +
                    "Bağdat Paktı Irak çekilince dağılmış Ankara’ya taşınarak adı CENTO olmuştur.\n" +
                    "II. Dünya Savaşı’ndan sonra kurulan ilk parti Nuri Demirağ’ın Milli Kalkınma Partisi’dir. Rus yanlısı Tan Gazetesi’nin bürosu basılmıştır.\n" +
                    "1950-60 arası dönem Demokrat Parti dönemidir.\n" +
                    "Demokrat Parti’nin iktidara gelmesine Beyaz Devrim denir.\n" +
                    "1950’de ezan Arapçaya çevrilmiştir.\n" +
                    "1951’de Atatürk’ü Koruma Kanunu çıkarılmıştır.\n" +
                    "10 Kasım 1953’te Atatürk’ün naaşı Etnoğrafya Müzesi’nden Anıtkabir’e taşınmıştır. Anıtkabir’in mimarları Emin Onat ve Orhan Arda’dır.\n" +
                    "1954’te Kıbrıs sorunu başlamıştır.",
            "6-7 Eylül Olayları 1955:  \n" +
                    "Atatürk’ün Selanik’teki evine bomba atıldığı haberi üzerine, İstanbul’da Rumların ev ve iş yerleri tahrip edilmiştir. Sonra bomba atılmadığı ortaya çıkmış ve Kıbrıs meselesinde özellikle hükümetin Yunanistan’a karşı elini zayıflatmıştır.\n" +
                    "1958’de İstanbul’da Kıbrıs Türk’tür mitingi yapılmıştır.\n" +
                    "27 Mayıs 1960 Darbesi ile DP kapatılmıştır.",
            "Yumuşama (Detant) Dönemi (1962-1991)\n" +
                    "Yumuşamanın göstergesi olarak ABD ile SSCB arasında nükleer silahların azaltılması amacıyla yapılan SAT I ve SALT II anlaşmaları kabul edilmektedir.",
            "Küba Krizi 1962:  \n" +
                    "SSCB’nin Küba’ya ABD’ye karşı füze yerleştirmesi ortaya çıkınca ABD- Rus gerilimi yaşanmış ve kırmızı hat denilen gergin görüşmeler yaşanmıştır.\n" +
                    "Anlaşma sağlanınca ABD Türkiye’de konuşlandırdığı Jüpiter Füzelerini sökmüş, Rusya’da Küba’daki füzelerini sökmüştür.\n" +
                    "1965’te Hindistan ve Pakistan arasında Keşmir Meselesinden dolayı gerginlik çıkınca SSCB Taşkent Deklarasyonunda araya girmiştir.",
            "İslam İşbirliği Teşkilatı (İslam Konferansı Örgütü) 1969: \n" +
                    "Avusturalyalı bir Yahudi Mescidi Aksa’yı kundaklamaya kalkışınca Fas’ın başkenti Rabat’ta 57 Müslüman ülke tarafından kurulmuştur. Merkezi Cidde’dir. Şu an ki genel sekreteri Suudi İyad Bin Emin Madani’dir.\n" +
                    "Vietnam Savaşı’na gitmeyi reddettiği için ABD’li boksör Muhammed Ali Clay hapse atılarak unvanı elinden alınmıştır.",
            "Pin Pong Diplomasisi 1972:\n" +
                    "1954’te Çin’in komünist olmasıyla ABD, Çin’i tanımayacağını söylemiş ancak 1972’te Çinli bir masa tenisi takımının ABD’ye gitmesiyle ilişkiler yeniden başlamıştır.",
            "Helsinki Konferansı 1975: \n" +
                    "Avrupa Güvenlik İşbirliği Konferansı toplanmış (AGİK), ve Avrupa Güvenlik İşbirliği Teşkilatı (AGİT) kurulmuştur. Türkiye kurucu üyedir.",
            "Arap – İsrail Savaşları ve Camp – David Anlaşması:  1948’de İsrail kurulunca ilk savaş çıkmış ve İsrail kazanmıştır.\n" +
                    "1956’da Süveyş Krizi de denilen savaşı da İsrail kazanmıştır.\n" +
                    "1967 savaşı en meşhurudur. 6 gün savaşları olarak da bilinir. İsrail topraklarını 4 katına çıkarmıştır.\n" +
                    "1973 savaşında Araplar İsrail’i destekleyen ülkelere petrol ambargosu uygulamıştır.\n" +
                    "1978’de ABD Dış işleri Bakanı Kissinger Planıyla Mekik diplomasisi uygulanmış ve Mısır İsrail’i tanıyan ilk Arap devlet olmuştur.",
            "İrangate Olayı\n" +
                    "İran – Irak Savaşı’nda İran, İsrail aracılığıyla ABD’den silah almıştır.",
            "Yumuşama Döneminde Türkiye\n" +
                    "Türkiye bu dönemde dış politikada üç önemli mesele ile uğraşmıştır:",
            "Kıbrıs Meselesi:\n" +
                    "İngiltere 1954’te Kıbrıs’tan çekildi.\n" +
                    "Rumların adayı Yunanistan’a katma fikrine ENOSİS denir.\n" +
                    "Bunun için kurdukları örgüte EOKA denir.\n" +
                    "Dr. Fazıl Küçük ve Rauf Denktaş Türk Mukavemet Teşkilatını kurdular.\n" +
                    "1960’ta Birleşik Kıbrıs Devleti kuruldu.\n" +
                    "1963’te Rumlar noeli kutlamak için Türkleri öldürdüler. (Kanlı Noel)\n" +
                    "1964’te Türkiye müdahale etti. ABD Başkanı Johnson Mektubu ile Türkiye adadan çekildi. Pilot Cengiz Topel Kıbrıs davasının ilk şehididir.\n" +
                    "1974’te Kıbrıs Barış Harekatı yapıldı.\n" +
                    "1983’te KKTC kuruldu. İlk Cumhurbaşkanı Rauf Denktaş’tır.",
            "Ege Adaları Meselesi:\n" +
                    "Yunanistan’ın Ege’de petrol aramak istemesi üzerine Bern Deklarasyonu ile iki ülkede petrol aramama garantisi verdi.",
            "Ermeni Sorunu:\n" +
                    "Ermeni ASALA terör örgütü birçok ülkede Türk Büyükelçiliklerine saldırı düzenleyip Türk diplomatları şehit etmiştir.",
            "7 Mayıs 1960 Darbesini Milli Birlik Komitesi yapmıştır.\n" +
                    "Başbakan Adnan Menderes, Dış İşleri Bakanı Fatin Rüştü Zorlu ve Maliye Bakanı Hasan Polatkan Yassıada da idam edilmişlerdir.\n" +
                    "Yassıada’nın adı Demokrasi ve Özgürlükler Adası olarak değiştirilmiştir.\n" +
                    "1960’ta Türkiye’de ilk bilgisayar Karayolları Genel Müdürlüğü’nde kullanılmıştır.",
            "1961’de ilk defa IMF ile Stand- By Anlaşması yapılmıştır.",
            "1961’de Devlet Planlama Teşkilatı kuruldu.",
            "1961’de Adalet Partisi ve CHP ilk koalisyon hükümetini kurmuştur.",
            "1962’de TÜBİTAK kuruldu.",
            "1968’de TRT kuruldu.",
            "12 Mart 1971’de muhtıra verilmiş ve partiler üstü Nihat Erim Hükümeti kurulmuştur.",
            "1971’de ilk kadın bakan Türkan Akyol atanmıştır",
            "12 Eylül 1980 Darbesini Milli Güvenlik Konseyi yapmıştır.",
            "Türkiye 13 sıkıyönetim bölgesine ayrılmıştır.",
            "1981’de ilk renkli TV yayını başladı.",
            "1983 seçimlerine Anavatan Partisi, Milliyetçi Demokrasi Partisi ve Halkçı Parti katılmıştır.** Seçimleri ANAP kazanmış ve Turgut Özal başbakan olmuştur.\n" +
                    "1989’da plaka sırası Aksaray’ın (68) il olması ile bozuldu.",
            "Küreselleşen Dünya (1991-2018)",
            "SSCB’nin dağılması ile ABD dünyada tek güç olmuş ve kutuplaşma bitmiştir.\n" +
                    "Prestroyka",
            "Rusya Devlet Başkanı Mihael Gorbaçov’un ekonomide liberalleşme politikasıdır.\n" +
                    "Glastnost",
            "Rusya Devlet Başkanı Mihael Gorbaçov’un düşüncede liberalleşme politikasıdır.",
            "Çekoslavakyanın, Çek Cumhuriyeti ve Slovakya olarak ayrılmasına Kadife Devrim denir.",
            "Azerbaycan Halk Cephesi lideri Ebulfeyz Elçibey’dir.",
            "Ermeniler Dağlık Karabağ ve Hocalı’ya saldırarak Türkleri katletmiştir",
            "Özbekistan’ın kurucu lideri İslam Kerimov’dur.",
            "Kırgızistan’ın kurucu lideri Asker Akayev’dir.",
            "Dünyaca ünlü Kırgız yazarımız Cengiz Aytmatov’un eserleri birçok dile çevrilmiştir.",
            "Türkmenistan’ın kurucu lideri Sapar Murat Niyazov’dur.",
            "Kazakistan’ın kurucu lideri Nursultan Nazarbayev’dir. Halen Cumhurbaşkanıdır.",
            "SSCB bu anlaşma ile resmen dağılmıştır. Bağımsız Devletler Topluluğu kurulmuştur.",
            "TİKA 1992\n" +
                    "Türkiye’nin özellikle Türk Cumhuriyetleri olmak üzere kurduğu yardım kuruluşudur.",
            "TÜRKSOY 1993\n" +
                    "Türkçe konuşulan ülkeler birliğidir.\n" +
                    "Türksoy 2018 yılını Kastamonu’yu Türk dünyası kültür başkenti ilan etmiştir.",
            "Almanya iki + Dört Anlaşması ile birleşmiştir.",
            "Maastricht Anlaşması 1992 ****\n" +
                    "Avrupa Birliği 12 Devlet olarak bu anlaşma ile kurulmuştur.\n" +
                    "AB’nin bugün 28 üyesi vardır. En son katılan 2013 yılında Bulgaristan’dır.*** Merkezi Brüksel, ortak para birimi Euro’dur.(2002)\n" +
                    "AB üyesi olduğu halde İngiltere, İsveç ve Danimarka’nın resmi parası Euro değildir. AB üyesi olmadığı halde Vatikan, Monaco ve San Marino’nun resmi parası Euro’dur.",
            "Türkiye 1959’da AET iken başvuru yapmıştır.\n" +
                    "1963’te başvuru kabul edilmiştir.\n" +
                    "Türkiye 1987 yılında tam üyelik için başvurmuştur.\n" +
                    "2005 yılında tam üyelik müzakereleri başlamıştır.",
            "ABD, SSCB’nin dağılmasından sonra eski Varşova üyelerini Barış için ortaklık adıyla NATO’ya davet etmiştir. NATO’ya en son katılan devlet 2017’de Karadağ’dır.",
            "Yugoslavya’dan ilk ayrılan devlet Slovenya’dır.",
            "Bosna Hersek işgal edilmiş ve Srebrenitsa Katliamı yaşanmıştır.Dayton Barış Anlaşması ile Bosna sorunu çözülmüştür.\n" +
                    "Bosna’nın milli lideri Bilge Kral Aliya İzzet Begoviç’tir.",
            "Kosova 2008’te bağımsız olmuştur, kurucu başbakanı Haşim Taci’dir.",
            "Saddam Hüseyin I. Körfez Savaşı’nda Çöl Tilkisi Kara Harekatı ile Kuveyt’ten çıkarılmıştır.",
            "Filistin Devleti’nin kurucusu 1993’te Abu Ammar lakaplı Yaser Arafat’tır.",
            "Türkiye’nin BM’ye asker gönderdiği yerler:\n" +
                    "Kore, Somali, Bosna Hersek, Arnavutluk, Kosova, Afganistan ve Lübnan’dır.",
            "1986’da SSCB’nin Ukrayna’da bulunan Çernobil nükleer santralinde patlama olmuş ve Karadeniz kıyısındaki bütün ülkeler etkilenmiştir.",
            "2005’te küresel ısınmayı önlemek amacıyla Kyoto Protokolü adıyla çevre sözleşmesi yapılmış ve 2020’ye kadar geçerlidir. ABD, Çin ve Hindistan imzalamamıştır.\n" +
                    "2008’de ABD’nin Phonex (Anka Kuşu) adlı uzay aracı Mars’ta incelemelerde bulunmuştur.",
            "Küreselleşen Dünya’da Türkiye\n" +
                    "1992’de Karadeniz İşbirliği Teşkilatı kurulmuştur. (KEİ)*** 1993’te Türkiye Bilimler Akademisi kurulmuştur. (TÜBA) 1996’da Yunanistan’la Kardak Kayalıkları Krizi yaşanmıştır.",
            "1990’da Türkiye’de ilk özel TV kurulmuştur.",
            "1992’de Naim Süleymanoğlu dünyanın en iyi sporcusu seçilmiştir.",
            "1993’te Türkiye’de ilk internet ODTÜ’de kullanılmıştır.",
            "1996’da Türkiye Gümrük Birliği’ne girmiştir.",
            "28 Şubat 1997’de post modern darbe yaşanmıştır.",
            "1999’da Düzce ve Gölcük depremleri yaşanmıştır.",
            "1 Ocak 2005’te paradan altı sıfır atılmış ve YTL’ye geçilmiştir.",
            "2007’de Türkiye’de ilk koyun Oyalı kopyalanmıştır",
            "2008’de Nuri Bilge Ceylan Üç Maymun filmiyle Cannes’de ödül almıştır.",
            "1 Ocak 2009’da TL’ye geçilmiştir.",
            "2010’da İstanbul Avrupa kültür başkenti seçilmiştir.",
            "2011 yılında UNESCO Dünya’da Evliya Çelebi yılı ilan etmiştir.",
            "2011 yılında Erzurum’da kış olimpiyatları yapılmıştır.",
            "2012’de UNESCO Dünya’da Itri yılı ilan etmiştir.",
            "2013’te NASA Ay’ın bir bölümüne Ali Kuşçu’nun adını vermiştir.  2013’te Mersin’de Akdeniz Olimpiyatları yapılmıştır.",
            "2015’te Antalya’da G-20 Zirvesi yapılmıştır.",
            "2016’da Aziz Sancar Kimya Dalında DNA’nın yapısı çalışmasıyla Nobel Ödülü almıştır.",
            "Cumhurbaşkanlığı Külliyesi’nin mimarı Şefik Birkiye’dir.",
            "2016’da yapılan Yavuz Sultan Selim Köprüsü’nün mimarı Michell Virlogevx’dir.",
            "15 Temmuz 2016 Fetö darbe girişimi sonrası Ankara’nın Kazan ilçesine Kahraman unvanı verilmiştir.",
            "2017 yılında ünlü halterci Naim Süleymanoğlu vefat etmiştir",
            "2017 Petrol Kongresi İstanbul’da yapılmıştır.",
    };
    public static String tarihBilimi[] = {
            "arih bilimi nedir sorusuna verilebilecek en iyi cevaplardan biri; geçmişte meydana gelen\n" +
                    "    olaylarda insanların tutum ve davranışlarının incelendiği ve yorumlandığı bilim dalıdır.\n" +
                    "    İnsanlar tarih bilimi ne olduğuna bir çok farklı cevap verebilirler. Çünkü geçmişten beri tarih\n" +
                    "    biliminin çok farklı tanımları yapılmıştır.",
            "arih anlatımının mitolojiden koparak bir bilim kimliği kazanması, eski Yunan’da Heredotos’la\n" +
                    "    (M.Ö. 485 – M.Ö. 395) başlar. Heredotos’un, daha önceleri yapılan anlatımlardan farklı olarak\n" +
                    "    tanrıların savaşlarından değil de Med savaşlarından, yani yakın zamanın araştırılıp\n" +
                    "    doğrulanabilir olaylarından söz etmeye girişmesi bu başlangıcın ilk adımıdır.",
            "Heredotos, tanıklardan aktarılan bilgileri, bilimsel bir yorum getirerek sorguluyordu. Tarih\n" +
                    "    yazarlığı aynı dönemde, kendi eserleriyle olmasa bile başka yazarların kitaplarından yaptıkları\n" +
                    "    alıntılarla tanıdığımız Midilli Hellanikos’la birlikte yeni bir aşamaya geçildi. günümüze ulaşan\n" +
                    "    ilk kronoloji tablosunu Hellanikos hazırlamış, ayrıca bir Atina tarihi olan Attkis’le bilimsel\n" +
                    "    çalışmanın yolunu açmıştı.",
            "Heredotos’un eserlerinde hala izleri görülen mitolojik yaklaşımın son kalıntılarını silen ise\n" +
                    "    Thukydides (M.Ö. 460 – M.Ö. 395) oldu. Tukidides’in anlatımında Peloponnesoslular ile\n" +
                    "    Atinalıların savaşı, kişilere mal edilen hayali konuşmalara rağmen, bir bilimsel inceleme ve\n" +
                    "    yöntem mode3li olarak değerini korumuştur. böylelikle tarih biliminin temeli kesin olarak\n" +
                    "    atılmıştı.",
            "Bunu bir gerileme dönemi izlemiş, ama Rönesans’ta araştırmacılık yeniden önem kazanarak git gide\n" +
                    "    yetkinleşmiş ve nihayet XVIII. yüzyılda, bugün anladığımız biçimiyle tarih bilimi doğmuştur.",
            "Tarih bilimi nedir sorusuna cevap bulabilmek için, Tarih bilimlerinin gelişmesine damgasını\n" +
                    "    vuran bilginlerin; özellikle Çin’de Sima Qian (M.Ö. 145 – M.Ö. 86) ile Du Yu’nun (732 – 812),\n" +
                    "    Arap-İslam dünyasında da Taberî (839 – 923), Cüveynî (1226 – 1283) ve İbni Haldun’un (1332 –\n" +
                    "    1406) adlarını anmak gerekir.",
    };
    public static String uygarlık[] = {
            "GENEL ÖZELLİKLERİ:\n" +
                    "Genellikle iklim ve yer şekillerinin uygun olduğu su kenarlarında kurulmuşlardır.\n" +
                    "Daha çok tarıma dayalı üretim vardır.\n" +
                    "Genellikle site (kent) devleti biçiminde oluşmuşlardır.(Polis, Nom, Site)\n" +
                    "Çok tanrılı din yaygındır.(ilk tek tanrılı din İbranilerdedir)\n" +
                    "Yönetim anlayışları tanrısal (teokratik)\n" +
                    "Bütünüyle tanrısal: Mısır (tanrı kral)\n" +
                    "Yarı tanrısal: Mezopotamya (rahip kral)",
            "Güneydoğu Toroslar’dan başlayarak Basra körfezine kadar uzanan ve Fırat ile Dicle nehirleri arasında kalan bölgeye Mezopotamya denir.",
            "Mezopotamya Uygarlığı, dünyanın bilinen ilk uygarlığıdır. Bu uygarlığın temeli Sümerler tarafından atılmış; Akadlar, Babilliler ve Asurlular tarafından geliştirilerek Ön Asya ve Anadolu’ya yayılmıştır.",
            "Mezopotamya’nın tarihi Sümerlerle başlamaktadır. Sümerler Asya kökenli bir kavim olup MÖ 4000 yıllarında Ön Asya’ya göç ederek Aşağı Mezopotamya bölgesine yerleştiler.\n" +
                    "\n" +
                    "Ziggurat denilen çok katlı tapınakların etrafına evlerin yapılmasıyla bölgede ilk köyler kurulmuştur. Köylerin büyüyerek şehirlere dönüşmesi sonucu ilk şehir devletleri ortaya çıkmıştır. En önemli şehir devletleri Ur, Uruk, Kiş, Lagaş, Eridu ve Umma’dır.",
            "Sümer şehir devletleri dünyanın ilk devlet teşkilatlarıdır.",
            "Devlet Yönetimi: Patesi veya Ensi adı verilen rahip krallar Sümer şehir devletlerini tanrı adına yönetiyor ve krallık babadan oğula geçiyordu. Krallar aynı zamanda başrahip, başyargıç ve başkomutan olarak bütün yetkileri kendilerinde toplamışlardır.\n" +
                    "\n" +
                    "Bu durum Sümerlerdeki yönetim biçiminin Teokratik Monarşi olduğunu göstermektedir.",
            "Din: Sümerler çok tanrılı (politeist) bir inanca sahiptir.\n" +
                    "\n" +
                    "Ekonomik Hayat: Mezopotamya’da ekonomi tarıma dayanmaktadır. Topraklar tanrının malı sayıldığı için topraklardan elde edilen ürünler rahipler tarafından toplanır ve tapınaklarda depolanırdı.\n" +
                    "\n" +
                    "Sosyal Hayat ve Hukuk: Halk; hürler, korunanlar ve kölelerden oluşmaktadır. Soylular, rahipler, askerler, memurlar ve tüccarlar hürler sınıfına, halk ise korunanlar sınıfına girmektedir. Kölelerin hiçbir hakları yoktur.\n" +
                    "\n" +
                    "Bir toplumda halk; soylular, hürler ve köleler diye ayrılıyorsa, bu durum o toplumda; toplumsal sınıf ayrımı olduğunu gösterir.",
            "Urukagina tarihin ilk yazılı kanunlarını yaparak; herkesin malını kanun güvencesine almış ve köle durumuna düşenler özgürlüklerine yeniden kavuşmuştur.\n" +
                    "\n" +
                    "UYARI! Bu durum Sümerlerin tarihte ilk hukuk devleti olduğunu göstermektedir.",
            "Mezopotamya uygarlıklarının temelini Sümerler oluşturmuştur. Sümerlerden sonra Mezopotamya’da kurulan diğer uygarlıklar Sümerleri örnek almışlar ve Sümer uygarlığını geliştirmişlerdir.",
            "AKADLAR\n" +
                    "Sami ırkına mensup olan Akadlar, Arabistan’dan gelerek Yukarı Mezopotamya bölgesinde Fırat boylarına yerleştiler. Tarihte İlk düzenli orduyu kuran Akadlar Sümerleri MÖ 2350’de yıktıktan sonra tüm Mezopotamya ve çevresindeki Elam, Güneydoğu Anadolu, Suriye ve Lübnan bölgelerini de ele geçirerek tarihte ilk imparatorluğu kurdular.\n" +
                    "\n" +
                    "Devletlerin sınırlarının genişlemesiyle birlikte devlet yönetimi zorlaştığı için devlet yönetimini kolaylaştırmak amacıyla memurların sayısı artırılmıştır.",
            "Akadlar, Sümer Çivi Yazısını kullanmakla birlikte yazı dili olarak Akadcayı kullanmışlardır. İlkçağda Mezopotamya, Mısır ve Anadolu arasında Akadça ortak dil, Sümer Çivi Yazısı’da ortak yazı olarak kullanılmıştır.",
            "BABİLLER\n" +
                    "Arabistan’dan Mezopotamya’ya gelen Sami asıllı Amurrular tarafından MÖ 2100’de Babil merkez olarak I. Babil Devleti kuruldu. Kendilerinden önceki Sümer ve Akad kültürlerini benimsemişler, yazı dili olarak Akadça’yı kullanmışlardır.",
            "Babil Devletinin en önemli kralı Hammurabi’dir. Hammurabi devlet yönetiminde ve hukuk sisteminde köklü değişiklikler yapmış ve ilk anayasayı hazırlamıştır. Hammurabi gücünü din yerine kanunlardan ve ordudan alan bir yönetim kurarak rahip-kral anlayışına son vermiştir. Din işleriyle devlet işlerini birbirinden ayırarak Mutlak Krallık kurmuştur.",
            "ELAMLAR\n" +
                    "Elam Uygarlığı İran’ın güneybatı bölgesinde merkezi Sus şehri olmak üzere kurulmuştur. Elam Uygarlığı, Mezopotamya uygarlıklarının etkisinde kalmıştır. Bundan dolayı Mezopotamya uygarlığına farklı bir katkıda bulunmamışlardır.",
            "ASURLULAR\n" +
                    "Arabistan’dan gelen Sami kökenli kavimlerle Hurrilerin kaynaşması sonucu  Asur toplumu oluşmuştur. Asurlular paralı askerlerden oluşan düzenli bir ordu kurarak büyük bir imparatorluk kurdular. Ticarete çok önem vermeleri ve değişik bölgelerde ticaret kolonileri kurmalarından dolayı tüccar bir kavim olarak tanınırlar.\n" +
                    "\n" +
                    "Asurlar, başkentleri Ninova şehrini bir kültür merkezi haline getirmişler, Sümerce ve Akadça olarak yazılmış eserlerden oluşan dünyanın ilk kütüphanesini kurmuşlardır",
            "İTİTLER\n" +
                    "Hititler MÖ 2000 yıllarında Kafkaslar üzerinden Orta Anadolu’ya gelerek Kızılırmak boylarına yerleşerek Hitit Devletini kurdular.\n" +
                    "\n" +
                    "Devlet Yönetimi: Hitit Devleti, başlangıçta feodal yapıda bir devlettir. Bu durum taht kavgalarına neden olduğu için merkezi otoriteyi güçlendirmek amacıyla feodal beylikler ortadan kaldırılmış ve yerine merkezden valiler atanmıştır.",
            "Kadeş Antlaşması\n" +
                    "\n" +
                    "Kadeş Antlaşması tarihteki ilk yazılı antlaşmadır. Mısırlılar ile Hititler arasında yapılmıştır.\n" +
                    "\n" +
                    "I. Ramses tahta geçince genel olarak mimari yönden ülkesini güzelleştirdi. Ancak hükümdarlığının beşinci yılında Hitit Kralı Mutavallis Mısır’a savaş açtı. Savaş Kadeş Kalesi önlerinde yapıldı.",
            " FRİGLER\n" +
                    "MÖ 1200’lerde Anadolu’ya göç eden Frigyalılar, Kızılırmak ve Sakarya nehirleri arasındaki bölgeye yerleşmişlerdir. Gordion (Polatlı) merkez olmak üzere MÖ 750’den sonra Frigyalılar Devletini kurdular.\n" +
                    "\n" +
                    "Önemli ticaret ve geçiş yolları üzerinde bulunmalarına rağmen tarım ve hayvancılığa daha çok önem vermişlerdir. Ekonominin tarım ve hayvancılığa dayanması hukuk kurallarının yapılmasında etkili olmuştur. Tarımı korumak için ağır cezalar koymuşlardır. ",
            "Frigyalılar, Fenike alfabesini Fabl denilen hayvan hikayelerinin ilk örneklerini vermişlerdir. En önemli tanrıları, bereket tanrıçası Kibele ‘dir.",
            "Frigya Uygarlığında tarım ve hayvancılığa çok önem verilmesi, tarım ve hayvancılığın; hukuk kurallarını, dini inançlarını ve edebiyat eserlerini etkilemesine ve yönlendirmesine yol açmıştır.",
            "LİDYALILAR\n" +
                    "Batı Anadolu’da Gediz ve Küçük Menderes nehirleri arasında kalan bölgeye yerleşen Lidyalılar MÖ VII yüzyılın başlarında merkez “Sard” şehri olmak Lidyalılar Devleti’ni kurdular.\n" +
                    "\n" +
                    "En önemli geçim kaynakları ticarettir. Ticaretle uğraşmaları Lidya ülkesinin dönemin en zengin ülkesi olmasını sağlamıştır. MÖ 700’lerde ticareti kolaylaştırmak amacıyla parayı icat ettiler.",
            "Değişim aracı olarak paranın kullanılması dünya uygarlık tarihine Lidyalıların en büyük katkısıdır. Böylece takas usulüyle yapılan ticaret azalmış ve ticaret hızlanmıştır.\n" +
                    "Ticareti geliştirmek amacıyla Efes’ten başlayarak Mezopotamya’ya kadar uzanan ünlü Kral Yolu’nu yapmışlardır.",
            "İYONYALILAR\n" +
                    "MÖ XII. yüzyılda meydana gelen Dor istilasından kaçan Akalar tarafından İyonya Uygarlığı kurulmuştur. Şehir devletleri halinde yaşamışlardır. İyon şehirleri krallık ve oligarşiden sonra demokratik bir yönetime kavuşmuştur.\n" +
                    "\n" +
                    "İyonya, Ön Asya ticaret yollarının bitiş noktasında olduğu için İyon şehirleri olan İzmir, Efes, Milet ve Foça kısa zamanda önemli bir kültür ve ticaret merkezi olmuştur.  Frigyalılardan aldıkları Fenike Alfabesini kullanmışlar ve bu alfabeyi Yunanlılara aktarmışlardır.\n" +
                    "\n" +
                    "Bilim: Anadolu uygarlıkları içerisinde bilim alanında en önde yer alan İyonyalılar olmuştur. Astronomi ve geometride Tales, Geometri ve matematikte Pisagor; Coğrafya’da Ksenefon, Tıp’ta Hipokrat  ve tarihin babası sayılan Heredot İyonyalıdır.",
            "URARTULAR\n" +
                    "MÖ IX. yüzyılda, Urartular, Doğu Anadolu’da merkezi Tuşpa (Van) olmak üzere Urartu Devletini kurmuşlardır.  Çok tanrılı dinlere inanmışlardır. Ölümden sonraki hayata inandıkları için mezarlarını ev ve oda biçiminde yapmışlar ve içlerine eşyalar   koymuşlardır.",
            "Mısır Uygarlığı; Nil nehri çevresinde bulunan verimli topraklar üzerinde MÖ 4000 yıllarında kurulmuştur. Mısır’ın etrafı denizler ve çöllerle çevrili olduğu için çok az göç ve istilayla karşılaşmıştır. Bu durum Mısır’da tarih öncesi devirlerin sırasıyla yaşanmasını sağlamıştır.",
            "Devlet Yönetimi: Mısır’da devlet, firavun adı verilen ve tanrının temsilcisi sayılan tanrı-krallar tarafından yönetilmiştir. Ülke eyaletlere bölünmüş ve merkezden atanan valiler tarafından yönetilmiştir. Kral bütün insanlardan üstün olup dini ve siyasi tek otoritedir.\n" +
                    "\n" +
                    "Hukuk: Firavunlar aynı zamanda kanun koyucu oldukları için, hukuk sistemi Mezopotamya ve Anadolu’daki kadar gelişmemiştir.\n" +
                    "\n" +
                    "Sosyal ve Ekonomik Hayat: Mısır’da halk; soylular, hürler ve köleler olarak sınıflara ayrılmaktadır. Mısır’da ekonomik hayatın kaynağını tarım oluşturmakta ve ülke toprakları firavun adına işlenmektedir. Bununla birlikte soyluların, memurların ve halkın toprakları olduğu da bilinmektedir.\n" +
                    "\n" +
                    "Din: Mısırlılar çok tanrılı bir inanca sahiptirler ve tanrılarını insan ve hayvan şeklinde düşünmüşlerdir. Bundan dolayı tanrılarının barınacakları tapınaklar yapmışlardır. Ölümden sonra hayatın varlığına inandıkları için ölen kişilerin vücudu mumyalanmıştır. Bu durum mumyacılık, mimari, tıp ve eczacılığın gelişmesini sağlamıştır.\n" +
                    "\n" +
                    "Bilim ve Sanat: Tarım ürünlerinden alınacak vergilerin hesaplanması matematik biliminin ortaya çıkmasını sağlamıştır. Ürünlerin cinsinin belirlenmesi için çizilen resimler 24 harflik Hiyeroglif yazısının ortaya çıkmasını sağlamıştır (MÖ 3000). İlk yazılı eserleri dini ve ahlaki eserler oluşturmuştur. Hiyeroglif yazısı Fenike Alfabesinin oluşmasına öncülük etmiştir.\n" +
                    "\n" +
                    "Nil nehrinin taşma zamanını hesaplamak için yapılan  çalışmalar astronomi biliminin, Nil nehrinin taşmasıyla bozulan sınırların belirlenmesi için yapılan çalışmalarda geometri biliminin gelişmesini sağlamıştır.\n" +
                    "\n" +
                    "Ordu: Mısır’da başlangıçta düzenli bir ordu olmamakla birlikte daha sonra düzenli bir ordu kurulmuştur. Ordu, Firavuna bağlı maaşlı askerler ve eyaletlerin gelirleriyle yetiştirilen askerlerden oluşmuştur.  Bu durum Mısır’da tımar sistemine benzer bir sistemin varlığını gösterir.\n" +
                    "\n" +
                    "Suriye ve Filistin’i ele geçirmek için Hititlerle savaştılar. On beş yıl süren savaşın sonunda MÖ 1280’de Hititlerle Mısırlılar arasında dünya tarihinin bilinen ilk yazılı antlaşması olan Kadeş Antlaşması imzalanmıştır.\n" +
                    "\n" +
                    "Mısır Uygarlığı önce Perslerin istilasına uğramış daha sonra Büyük İskender tarafından MÖ 332’de yıkılmıştır.",
            "HİNT UYGARLIĞI\n" +
                    "Hint Uygarlığı, MÖ 3000 yıllarında İndus ve Ganj nehirleri çevresinde kurulmuştur. İstilalar sonucu Hindistan’da çeşitli kavimler, diller, dinler ve kültürler ortaya çıkmıştır. Bu durum halkın birbirleriyle kaynaşmasını engellemiş ve ülkede siyasi birlik sağlanamamıştır.\n" +
                    "\n" +
                    "MÖ II. bin yıllarında Hindistan’ı istila eden Ariler, yerli halkla karışıp öz benliklerini yitirmemek için Kast Sistemini oluşturmuştur. Kast, meslekleri ve sosyal statüleri babadan oğula geçen aynı toplumsal değerlere sahip olan insanlar topluluğudur. Kast sistemi dört kısma ayrılmaktadır:\n" +
                    "\n" +
                    "Brahmanlar: Rahipler, din adamları\n" +
                    "Kşatriyalar: Soylular ve askerler\n" +
                    "Vaysiyalar: Tüccar, esnaf, zanaatkar ve çiftçiler\n" +
                    "Sudralar: İşçiler",
    };
    public static String UlkelerCografyasiBilgi[] = {
            "Avrupa, Afrika' nın kuzeyinde, Asya' nın batısında ve Atlas Okyanusu' nun doğusunda bulunan bir kıtadır.",
            "Kapladığı alan yönünden Okyanusya' dan sonra en küçük ikinci kıta olan Avrupa; batıda Atlas Okyanusu, kuzeyde Kuzey Buz denizi ve Atlas Okyanusu, güneyde Akdeniz ve doğuda Asya kıtası ile çevrilidir. Avrupa kıtası güneyde Afrika kıtasına oldukça yaklaşır (Cebelitarık Boğazı 14 km). Güneydoğuda ise Asya ile hemen hemen bitişir (İstanbul Boğazı 0,7 km., Çanakkale Boğazı 1,3 km.).",
            "Avrupa' nın doğuda kesin bir sınırı bulunmamakla beraber, kuzeyden güneye Ural dağları, Ural nehri, Maniç çukuru, Karadeniz, İstanbul ve Çanakkale Boğazları ile Ege Denizi' nden geçecek hattı sınır kabul edebilir.",
            "Avrupa' nın yüzölçümü 10.523.000 km2 dir. Bu ise yeryüzünün %5' i, karaların % 15' i Avrasya' nın 1/5' i demektir. Avrupa, yaklaşık olarak harita üzerinde 35 ile 70 kuzey paralel daireleri ile 10 ile 60 doğu meridyenlerinin çerçevelediği bir üçgene benzer. Kıtada 0-4 saat dilimleri yer alır. Avrupa' nın uç noktaları ise; kuzeyde Kuzey burnu (71° 10' kuzey enlemi), güneyde Mora' nın Matapan burnu (36° 23' kuzey enlemi), Batıda Rocca (Portekiz) burnu (9° 29' batı boylamı), doğuda Ural dağları (60° doğu boylama)' dır. Rocca burnu ile Ural Dağları arasındaki uzunluk 5500 km, Kuzey burnu ile Matapan burnu arasındaki genişlik 3800 km' dir.",
            "Öteden beri büyük krallık ve imparatorluklara beşiklik yapmış bu kıta, endüstri devriminden sonra da, gelişmişliğini korumuş ve diğer tüm kıtalara göre endüstrileşmesini kısa sürede tamamlamıştır. Avrupa' nın önemi, konumu, yüz ölçümü, doğal kaynakları, nüfusu ve fiziki özelliklerinden değil, sahip olduğu insan kaynağı ve onun niteliklerinden ileri gelmektedir. İyi eğitilmiş insanlardan oluşan nüfus, bilim ve teknolojide göstermiş olduğu ilerlemeler sayesinde, ekonomik yönden de gelişmiş ve yüksek bir hayat standardına ulaşm",
            "Doğal kaynakları az olan Avrupa, bu gelişmesini tamamen insan kaynağının yüksek niteliklerine ve sömürgecilik sisteminin nimetlerine borçludur. ",
            "Avrupa bir devrimler kıtasıdır. Özellikle demokrasi, endüstriyel ve bilimsel açıdan dünyayı etkileyen devrimleri gerçekleştirmiştir.",
            "Nüfus yoğunluğunun fazla olduğu bir kıtadır. Hayat seviyesi yüksektir. Nüfus artışı çok azdır. Hatta bazı ülkelerde nüfus azalması vardır.",
            "Avrupa, dünyada ihracat ve ithalatta önde gelen kıtadır. Dünyada üretilen endüstri ürünlerinin üçte biri bu kıtaya aittir.",
            "Endüstrileşmiş ülkelerin toplandığı bir kıtadır. Birleşik Krallık (İngiltere), Fransa, İtalya ve Almanya endüstrileşme açısından çok ileri durumdadır.",
            "Çeşitli uluslara mensup insanların yaşadığı Avrupa' da 20' den fazla devlet vardır. Komşu ülkeler arasında dil, ekonomik ve kültürel açıdan önemli farklar bulunur.",
            "Asya Kıtası: Dünyanın en büyük kıtası. Doğuda Pasifik Okyanusu, kuzeyde Kuzey Buz Denizi, güneyde Hint Okyanusu, batıda Avrupa kıtası ile çevrilidir. Avrupa kıtası ile olan sınırı kesin tespit edilmiş değildir. Eskiden Don Nehri, Asya ile Avrupa arasında sınır olarak kabul edilirdi. Daha sonra Ural Dağları sınır olarak kabul edilmeye başlandı.",
            "Asya Kıtası, Avrupa kıtası ile çevrilidir. Eskiden Avrasya olarak bilinen eski dünya kıtasının batısındaki büyük yarımada olan Avrupa, Sami dillerde Erep (yahut Irib) Güneşin Battığı taraf anlamına gelir. Fenikelilerden Yunanlılara geçen bu ad, Yunanca' da Europa olmuş ve Ege Denizi' ne göre batıda bulunan ülkelere bu ad verilmiştir.",
            "Kıtanın jeolojik yapısı üçe ayrılır: Yaşlı kayalardan meydana gelen birinci tabaka, genç kayalardan meydana gelen ikinci tabaka ve 10 ila 70 milyon yıl öncesine ait olduğu tahmin edilen üçüncü jeolojik zamana ait kıvrımlardan meydana gelen üçüncü tabaka. Yaşlı kayalar; Sibirya, Çin, Arabistan ve Hind yarımadalarını meydana getirirler. Genç kayalar; Ural Dağlarından başlayıp bir S harfi şeklinde Gobi Çölünü geçerek Malezya ve Borneo' da son bulurlar. Üçüncü jeolojik zamana ait genç kıvrımlar; Türkistan' dan başlayıp, Tibet Yaylasına ve Himalayaları meydana getirdikten sonra Sumatra adalarına kadar uzanırlar. Bu kıvrımlarda birleşen yüksek dağlar, Asya' nın yüzey şekilleri bakımından en dikkati çeken yerleridir.\n",
            "Kafkas Dağları' nın bazı tepeleri 5600 metreyi geçer. Pamirlerde, Hindikuş ve diğer dağların birbirine en çok yaklaştıkları noktada yükseklik 6100 metreyi aşar. Karakurum, Tienşan, Kunlunşan, Himalayalar belli başlı dağ silsileleridir. Himalayalar en önemli sıradağlardır. Yükseklikçe fazla olmasının yanında geniş Hint ovalarının ardından birdenbire yükselmeleri dikkati çeker. Kançencanga Dağının yüksekliği 8585 m olup, kavurucu bir iklime sahiptir. Dünyanın en yüksek tepesi olan ve 8848 metreyi bulan Everest Tepesi de bu sıradağlardadır.",
            "Üçüncü jeolojik zaman kıvrımları bulunan yerlerde sık sık depremler ve volkanik patlamalar olur. Türkiye, İran, Pakistan ve Japonya bu hat üzerinde olup, son senelerde buralarda meydana gelen depremler büyük zararlara sebep olmuştur.",
            "Dünyanın en yüksek ve en kalabalık dağ silsileleri arasında yine dünyanın en büyük yaylaları yer almaktadır. Bunlardan en meşhuru Tibet Yaylası ve Orta Sibirya Yaylası' dır. Doğu Türkeli Yaylası, Pamir Yaylası, İran Yaylası, Stannovay ve Andır yaylaları da önemli yaylalardır.",
            "Akarsular yönünden oldukça zengin olan Asya' nın belli başlı akarsuları büyük alüvyon ovalarının meydana gelmesini sağlarlar. Sibirya' da Kuzey Buz Denizi' ne dökülen İrtiş ve Yenisey ırmakları büyük bir alüvyon ovası meydana getirirler. Doğudan batıya uzanan bu düzlüğün uzunluğu 2400 kilometredir. Pakistan' daki İndus, Hindistan' daki Ganj ve Brahmaputra ırmakları, Çin' deki Hoank Ho ve Yang Çe ırmakları alüvyon ovaları meydana getiren büyük nehirlerdir.\n",
            "Yenisey, Obi ve İrtiş ile Yang Çe, İndus, Hindistan' daki Ganj ve Brahmaputra en uzun ırmaklarıdır. Asya' da uzunlukları fazla, suları bol olan nehirlerden, sulama için suların depolanması ve hidroelektrik enerjisi temininde çok istifade edilir. Ayrıca tarım ve sanayinin ilerlemesinde geniş ölçüde faydaları olmaktadır. Nehir taşımacılığı gelişmiştir.",
            "Kıtada önemli yaylaların ve ırmakların yanı sıra, önemli ovalar da mevcuttur ki, bunlardan bazıları; Batı Sibirya Ovası, Ganj Ovası, Mezopotamya, Pencap, Çin ve Turan ovalarıdır. Hazar Denizi, kıtanın tek iç denizidir. Bazı coğrafyacılar Hazar Denizini göl olarak da kabul ederler. Aral Gölü, Baykal Gölü, Balkaş Gölü, Isık ve Van gölleri kıtanın önemli göllerinin başında gelirler.",
            "Okyanusya, Büyük Okyanus' a dağılmış adaları içine alan ülkelerden ve Avustralya' dan oluşan kıtadır. Asya' nın güney ve güneydoğusunda, Antarktika' nın kuzeyinde ve Büyük Okyanus ile Hint Okyanusu' nun arasında yer alır. Dünyanın, birer kıta olan diğer parçalarından farklı olarak, bu parçaya bütünlüğü sağlayan ve adını veren okyanustur. Yüzölçümü 8.970.000 km2, nüfusu 25.000.000' dur (199",
            "Okyanusya'nın bölümleri: Okyanusya dört kısıma bölünür. Avustralya, Melanezya, Polinezya ve Mikronezya. Gerçek bir küçük kıta olan ve Büyük Okyanus ile Hint Okyanusu arasında yer alan, Avrupa' nın dörtte üçü büyüklüğündeki (7.704.000 km2) Avustralya, en kalabalık bölgeleri Büyük Okyanus' a dönük olduğu için bir Okyanusya toprağıdır.",
            "Yeni Zelanda, Yeni Gine ve Melanezya' nın bazı adaları dağlık yüzey şekillerini ve bugünkü biçimlerini toprak hareketleri sonucunda almıştır. Kıvrılmalar ve kırılmalar genellikle çok yenidir ve bu adalarda sık sık deprem olur, yanardağlar püskürür.",
            "Polinezya, Melanezya ve Mikronezya takımadalarının çoğu yüzeyden az çok uzak bir denizaltı tabanının üzerindeki volkanik akıntıların sonucudur. Bazıları etkin olan yanardağlar çok yüksektir. Hawaii takımadalarında bu yükseklik 2.400 m' yi bulmaktadır.",
            "Avustralya' nın üç önemli fiziki bölgesinin en genişi olan batı platosu kıtanın yarısından fazlasını meydana getirir. Bölgenin çoğu deniz seviyesinin üstünde 500 m civarında uzanır. Fakat bazı yerlerde küçük dağ grupları, platonun genel seviyesinin üzerine yükselerek seyreder. En önemlileri batı sahili yakınında Hammersley dizisi ve kıtanın merkezindeki Macdonnel ile Musgrave sıra dağlarıdır. Platonun çoğu kuzeydeki büyük kum çölü ile güneydeki Victoria Çölü' nden ibarettir. Bu bölgede hiç devamlı nehir yoktur ve arazinin çoğu çoraktır. Platonun kıyıları dar kıyı ovalarıdır.",
            "Antarktika, Güney Yarımkürenin en güneyinde bulunan ve Güney Kutbu'nu içeren kıta. Afrika ve Okyanusya'nın güneyinde olan ve içinde ülke bulunmayan tek kıta.",
            "Güneydeki efsanevi kıtanın bulunması 200 yıllık bir arayıştan sonra, ancak 1840’ta başarıyla sonuçlanmıştır. Yelkenlisiyle kıyılar boyunca yaklaşık 2.000 km yol alan Charles Wilkes, denizlerden oluşan Kuzey Kutbu’nun tersine, Güney Kutbu’nun olduğu yerde gerçekten büyük bir kıta bulunduğunu kanıtlamıştır. 12,4 milyon km²’lik yüzölçümüyle bu kıta neredeyse Afrika’nın yarısı büyüklüğündedir. Bu bölgenin içinde Güney Shetland, Güney Georgia gibi birkaç takımada da yer alır.",
            "Kuzey Amerika, kuzey yarım kürede bulunan, kuzeyde Arktik Okyanusu, doğuda Atlantik Okyanusu, güneyde Karayip Denizi, ve batıda kuzey Büyük Okyanus'uyla çevrili olan kıta dır. 24.230.000 km²'lik bir alan oluşturmaktadır. 2001 yılındaki ortalama nüfusu 454.225.000'dur. Asya ve Afrika'dan sonra üçüncü büyük kıtadır ve nüfus olarak da Asya, Afrika, ve Avrupa'dan sonra en kalabalık dördüncü kıtadır.",
            "Yeni Dünya olarak da adlandırılan kara kitlesinin kuzey kısmında bulunmaktadır. Kuzey Amerika'nın Güney Amerika'ya tek kara baglantısı dar Panama Kanalıdır.",
            "Dunyanin en sorunsuz bolgesi olup, en gelismis bolgesidir ayni zamanda. Asya ve Afrikadan sonraki ucuncu buyuk toprak parcasi.. o da toplamda 24 milyon 230 bin metrekarelik bir alana sahip oldugu icindir muhtemelen..",
            "Guney Amerika ile tek baglantisi panama kanalidir.. bu kanal sayesinde kuzey amerikanin 4 tarafi da aslinda deniz/okyanusla cevrilidir.. kuzeyinde arktik okyanusu guneyinde karayip denizi* dogusunda atlantik okyanusu batisinda da kuzey pasifik okyanusu vardir..",
            "Amerika'nın güney yarısını oluşturan kıta. Büyük Okyanus'un doğusunda, Atlantik Okyanusu'nun batısında, Kuzey Amerika'nın güneyinde ve Antarktika'nın kuzeyinde bulunur. Güney Amerika,Amerika ismini Amerigo Vespucci den sonra alır. Çünkü o Amerika'nın batı Hindistan olmadığını söyleyen ilk Avrupalı idi. Fakat Yeni dünya Avrupalı'larca bilinmiyordu. Güney Amerika 17.840.000 km kare lik bir alana sahiptir. Veya yaklaşık olarak Dünya yüzeyinin %3.5'i dir. 2005 yılına göre nüfusu tahminen 371.000.000 dan daha fazla idi. Güney Amerika alan sıralamasında dördüncü(Asya,Afrika ve Kuzey Amerika'dan sonra) ve nüfusta beşincidir (Asya, Arika, Avrupa ve Kuzey Amerika'dan sonra).",
            "Eski dünya karalarından birisi olan Afrika, 30 218 000 km² yüz ölçümü ile kıtalar arasında Asya ve Amerika’nın ardından üçüncü sırada gelir. Afrika adı, Kartaca’ya ilk defa ayak basan Romalılarca “Afri” veya “Africani” denilen oymakların adından esinlenerek verilmiştir. Afrika adı bu ülkeye “Pön” savaşları sırasında verilmiştir. O zamana kadar Yunanlı yazarlar bu kıtaya “Libya” yani “Lebular Diyarı” derlerdi. Fakat MS I yy sonlarında bu isim bütün kıta için kullanılmaya başlandı. Afrika terimi daha sonra Arapça’ya “İfrikaya” şeklinde geçmişti",
            "Afrika kuzeyden Akdeniz ile sınırlanırken kuzeydoğuda Süveyş kanalı ile Asya’dan ayrılır. Kıta doğuda Kızıldeniz ve Hint Okyanusu ile komşudur. Babülmendep Boğazı Arap Yarımadasına 18 km yaklaşır. Kıtanın güneyi yine Hint Okyanusu, batısı Atlas Okyanusu ile çevrilidir. Kıta kuzeybatıda Avrupa’dan 14 km genişliğindeki Cebeli Tarık Boğazı ile ayrılır.",
            "Sıcak kuşak iklimieri (Ekvatoral ve savan) etkilidir. Kuzeyde Büyük Sahra, güneyde Kalahari çöl iklimlerinin görüldüğü yerlerdir. Akdeniz kıyısında ve Güney Afrika’nın Kap Bölgesinde Akdeniz iklimi etkili olmaktadır.",
            "Kıtanın doğusunda kuzey-güney yönlü Gor çukurluğunda tektonik göller fazladır. Önemlileri Viktorya, Tanganika, Nyasa ve Rudolf gölleridir.",
            "Çöl ve sıcak kuşak iklimi nedeniyle yoğun nüfuslu değildir. Nüfus yüksek kesimlerde ve kıyılar ile Nil nehrinin aşağı çığırında kalabalıktır.\n",
    };
    public static String CografiKonumBilgi[] = {
            "Herhangi bir yerin Dünya üzerinde bulunduğu alana coğrafi konum denir.",
            "Herhangi bir yeri diğer yerlerden ayıran, sahip olduğu kendine has özelliklerin tümüne özel konum denir. Özel konum, insanları, çevreyi, ülkelerin ekonomik ve politik durumunu çok yönlü etkiler.",
            "Dünya üzerinde, özel konum etkisine şu örnekler verilebilir:\n" +
                    "·         Norveç, Japonya, İngiltere, İzlanda gibi deniz ve okyanuslara komşu ülkeler balıkçılıkta ileri gitmişlerdir.\n" +
                    "·         Kuzeybatı Avrupa kıyıları, yüksek enlemlerde bulunmasına rağmen, Gulf - Stream sıcak su akıntısının etkisiyle ılıman bir iklime sahip olmuştur.\n" +
                    "·         Orta Asya ve Orta Avrupa denizlere uzak olduğu için karasal bir iklime sahip olmuştur.\n" +
                    "·         Kanarya, Havai, Kıbrıs, vb. adalar, deniz ve hava yollarının gelişmesiyle ikmal ve uğrak yeri haline gelmişlerdir. Buna bağlı olarak bu adaların önemi artmıştır.",
            "Türkiye,Asya, Avrupa ve Afrika kıtalarının birbirine en çok yaklaştığı yerde bulunur.",
            "Türkiye,Farklı kültürlerin kurulduğu, Dünya'nın en eski kültür hazinelerine sahiptir.",
            "Türkiye,Dünya'da en fazla petrol çıkaran ülkelere komşudur.",
            "Türkiye,Üç tarafı denizlerle çevrilidir ve yeryüzü şekilleri çeşitlidir",
            "Türkiye,Karadeniz'i Akdeniz'e bağlayan İstanbul ve Çanakkale boğazlarına sahiptir.",
            "Türkiye'nin ortalama yükseltisi fazladır. (Yaklaşık 1132 m)",
            "Türkiye,Yükselti batıdan doğuya doğru gidildikçe artmaktadır.",
            "Türkiye,Zengin yeraltı kaynaklarına sahiptir.",
            "Herhangi bir yerin, Dünya üzerinde bulunduğu alanın, enlem ve boylam dereceleriyle belirtilmesine matematik konum denir.",
            "Ekvator'a paralel olarak çizildiği varsayılan hayali çemberlere paralel denir.\n" + "Paralel çemberlerinin, Başlangıç paraleline (Ekvator) olan uzaklığının açı cinsinden değerine ise enlem denir. Enlem ve paralel birbirlerinin yerine kullanılırlar.",
            "Ekvator'un 90 kuzeyinde, 90 da güneyinde olmak üzere, toplam 180 paralel bulunur.",
            "Başlangıç paraleli Ekvator'dur.",
            "En büyük paralel dairesi Ekvator'dur.",
            "Ekvator'dan kutuplara doğru gidildikçe paralellerin boyları kısalır. Buna karşılık paralel numaraları büyür.",
            "İki paralel arası uzaklığa bir enlem derecesi denir. Matematik konumu daha ayrıntılı olarak belirleyebilmek için, her paralel dairesi 60 dakikaya, her dakika 60 saniyeye bölünmüştür.",
            "90° paralelleri nokta halindedir.",
            "Paraleller birbirleriyle kesişmezler, birleşmezler.",
            "Paraleller doğu - batı doğrultusunda uzanırlar.",
            "Paraleller arası uzunluk işlemlerinde şu yol takip edilir:\n" +
                    "\n" +
                    "·         Aralarında uzaklığı sorulan noktalar arasındaki enlem farkı bulunur. İstenilen merkezlerin her ikisi de aynı yarım kürede ise, numarası büyük paralelden küçük paralel çıkarılır. Farklı yarım küredeler ise paraleller toplanır.\n" +
                    "\n" +
                    "·         Bulunan paralel farkı sabit uzaklık olan 111 ile çarpılır.",
            "Enlem; iklimi, güneş ışınlarının düşme açısını, sıcaklık dağılışını, denizlerin tuzluluk oranlarını, gece ile gündüz arasındaki zaman farkını, kalıcı kar sınırı yükseltisini, yerleşme ve tarım faaliyetlerinin sınırını, bitki örtüsü çeşitliliğini, toprak çeşidini, akarsu rejimlerini, tarım ürünleri çeşitliliğini, yerleşme biçimini, hayvanların dağılışını, vs. etkiler.",
            "Bir kutuptan diğer kutba ulaşan, paralelleri dik açıyla kesen hayali yarım çemberlere meridyen denir.\n" + "Meridyenlerin, Başlangıç meridyenine (Greenwich) olan uzaklığının açı cinsinden değerine ise boylam denir. Meridyen ve boylam birbirlerinin yerine kullanılırlar.",
            "Başlangıç meridyeninin 180 doğusunda, 180 de batısında olmak üzere, toplam 360 meridyen vardır.",
            "Başlangıç meridyeni İngiltere'nin başkentindeki Greenwich istasyonundan geçen meridyendir.",
            "İki meridyen arası uzaklığa bir boylam derecesi denir. Koordinatlarla bir yeri daha iyi belirleyebilmek için, her meridyen derecesi 60 dakikaya, her dakika 60 saniyeye bölünmüştür.",
            "Ekvator üzerinde iki meridyen arası uzaklık 111 km dir. Kutuplara doğru gidildikçe bu uzaklık azalır. Türkiye üzerinde ise iki meridyen arası uzaklık, yaklaşık olarak 85 - 86 km dir.",
            "Bütün meridyenlerin boyları birbirine eşittir.",
            "Aynı meridyen üzerinde bulunan bütün noktaların (Güneş karşısından aynı anda geçtiklerinden) yerel saatleri aynıdır.",
            "Meridyen dereceleri Greenwich'ten doğuya ve batıya gidildikçe büyür.",
            "Meridyenler kuzey - güney doğrultusunda uzanır.",
            "Bütün meridyenler kutuplarda birleşirler.",
            "Ardışık iki meridyen arasındaki yerel saat farkı 4 dakikadır.",
            "Boylamın Dünya üzerindeki en belirgin etkisi, yerel saat farklarını oluşturmaktır.",
            "Herhangi bir yerde, Güneş'in en tepede olduğu ana ya da gölge boyunun en kısa olduğu ana öğle vakti denir. Öğle vakti gün ortasıdır ve saat 12.00 olarak kabul edilir. Buna göre ayarlanan saat dilimine yerel saat denir.",
            "Çalışma hayatında, yerel saatlerin hepsini kullanmak mümkün değildir. Ticari ve ekonomik ilişkilerin kolaylaştırılması, haberleşme ve ulaşım hizmetlerinin hızlı ve düzenli bir şekilde yapılabilmesi için, yerel saatten farklı olarak, ortak saat ya da ulusal saat uygulamasına ihtiyaç duyulmuştur. Bu nedenle her ülkenin, kendisine en uygun meridyenin yerel saatini bütün ülke sınırlarında geçerli hale getirmesiyle oluşan saate ortak saat adı verilmektedir.",
            "Türkiye'de, 1978 yılına kadar, 2. saat diliminde yer alan 30° Doğu meridyeninin yerel saati ortak saat olarak kullanılmıştır. 1978 yılından sonra, güneş ışınlarından daha fazla yararlanarak enerji tasarrufu sağlamak amacıyla, ileri ve geri saat uygulamasına geçilmiştir. Şöyle ki;\n" +
                    "·         Yaz döneminde 3. saat dilimine giren 45° Doğu meridyeninin yerel saati esas alınarak ileri saat uygulamasına geçilmiştir.\n" +
                    "·         Kış döneminde ise 2. saat dilimine giren 30° Doğu meridyeninin yerel saati esas alınarak geri saat uygulamasına geçilmektedir.",
            "Bilim ve tekniğin hızla gelişmesiyle ülkeler arası ekonomik ve siyasi ilişkilerin artması, buna bağlı olarak iletişimin hızlı olması uluslararası saatin doğmasına yol açmıştır. Bu sebeple saat dilimleri oluşturulmuştur. Dünya üzerinde 24 saat dilimi vardır.",
            "Dünya'nın doğu ve batı yarım kürelerinin uç noktaları arasında bir günlük zaman farkı vardır. Bu nedenle, Başlangıç meridyeninin devamı olan 180° meridyeni, tarih değiştirme çizgisi olarak kabul edilmiştir.",
            "Türkiye, 36° - 42° Kuzey paralelleri ile 26° 45° Doğu meridyenleri arasında yer alır. Diğer bir ifadeyle, Türkiye Ekvator'un kuzeyinde ve Greenwich'in doğusunda bulunan bir ülkedir. Türkiye'nin matematik konumunun sonuçları şöylece sıralanabilir:",
            "·         Doğu - batı istikametinde 76 dakika yerel saat farkı bulunur.\n" +
                    "·Aynı anda tek ortak saat kullanılır. Çünkü doğu - batı yönünde fazla geniş değildir.\n" +
                    "·Güneş ışınları hiçbir zaman dik açıyla gelmez.\n" +
                    "·İki meridyen arası uzaklık yaklaşık olarak 85 - 86 km dir.\n" +
                    "·Orta kuşakta yer alır.\n" +
                    "·Mevsimler belirgin olarak görülür.\n" +
                    "·Kışın cephesel yağışlar fazladır.\n" +
                    "·Güneyden kuzeye gidildikçe güneş ışınlarının geliş açısı küçülür.\n" +
                    "·Güneyden kuzeye gidildikçe cisimlerin gölge boyu uzar.\n" +
                    "·Güneyden kuzeye gidildikçe gece - gündüz süreleri arasındaki fark artar.\n" +
                    "·Kuzeyden esen rüzgârlar sıcaklığı düşürürken, güneyden esen rüzgârlar sıcaklığı yükseltir.\n" +
                    "·Dağların güney yamaçları daha sıcaktır. Buna bağlı olarak güney yamaçlarda yerleşmeler fazladır.",
    };
    public static String DunyaSekliBilgi[] = {
            "Dünya tam küre olmayıp küreye yakın bir şekildir. Dünyanın kutuplardan basık ekvatordan şişkin şekline geoit denir. Dünya bu şekle ekseni etrafında dönerken oluşan merkezkaç kuvveti sonucu ulaşmıştır. Dünyanın şekli 20.yüzyılın ikinci yarısından itibaren uzaya gönderilen uydulardan çekilen fotoğraflar ile küre veya küreye yakın (Geoit) şekilde olduğu ispatlanmıştır",
            "Dünyanın Geoit Şeklinin Sonuçları\n" +
                    "Kutup noktaları, Ekvator’a göre Dünya’nın merkezine daha yakın olduğundan yer çekimi Ekvator’dan kutuplara doğru gidildikçe artar.\n" +
                    "Ekvator’un çevresi kutupların çevresinden daha geniştir.\n" +
                    "Ekvator’un yarıçapı, kutupların yarıçapından daha uzundur.",
            "Dünyanın küresel şekline bağlı olarak  Ekvator’dan kutuplara doğru gidildikçe;" +
                    "Güneş ışınlarının geliş açısı küçülür.\n" +
                    "Güneş ışınlarının atmosferde tutulma oranı artar.\n" +
                    "Cisimlerin gölge boyları uzar.\n" +
                    "Sıcaklık değerleri azalır.\n" +
                    "Deniz ve okyanuslardaki buharlaşma miktarı azalır.\n" +
                    "Deniz ve okyanusların tuzluluk oranı azalır.\n" +
                    "Bitki örtüsü değişir.\n" +
                    "Kalıcı kar sınırı, yerleşme üst sınırı ve orman üst sınırı alçalır.\n" +
                    "Meridyenler arasındaki mesafe azalır.\n" +
                    "Paralellerin boyları kısalır.",
            "Çizgisel hız azalır.\n" +
                    "Haritalarda bozulma artar.\n" +
                    "Tan ve gurup süreleri  artar.\n" +
                    "Gece-gündüz arasındaki fark artar.\n" +
                    "Aydınlık ve karanlık yarım küreler oluşur.\n" +
                    "Aydınlanma çizgisi çember şeklinde olur.\n" +
                    "Kutup yıldızı sadece kuzey yarım küreden görülür. Görülme açısı o yerin enlem derecesini verir.\n" +
                    "Ekvator’da Termik Alçak basınç, kutuplarda Termik Yüksek Basınç alanları oluşur.",
            "Tan (şafak) vakti: Güneş doğmadan az önce beliren alaca karanlık aşamasıdır.",
            "Tan (şafak) vakti: Güneş doğmadan az önce beliren alaca karanlık aşamasıdır.",
            "Alaca karanlık vakti: Güneş doğmadan önceki veya battıktan hemen sonraki aydınlık, yarı karanlık, akşam karanlığı aşamalarıdır. Alaca karanlık süresi çizgisel hıza bağlıdır. Ekvator’da çizgisel hız fazla olduğu için alaca karanlık süresi kısa iken kutuplara yaklaştıkça çizgisel hız azaldığı için bu süre uzar.",
            "Dünyanın kendi ekseni etrafındaki dönmesi batıdan doğuya doğru 24 saatte tamamlanır. Bu süre 1 gün olarak tanımlanır.",
            "Dünya’nın Kendi Ekseni Etrafındaki Dönüşünün Sonuçları:\n" +
                    "\n" +
                    "Gece ve gündüz birbirini takip edecek şekilde oluşur.\n" +
                    "Merkez kaç kuvveti meydana gelir.\n" +
                    "Güneş ışınlarının gün içinde geliş açıları değişir.\n" +
                    "Cisimlerin gün içindeki gölge uzunlukları değişir.\n" +
                    "Gün içinde sıcaklık farkları meydana gelir.\n" +
                    "Yerel saat farkları meydana gelir.",
            "Dünyamız, Güneşin çevresindeki dönüşünü 365 gün 6 saatte tamamlar. Bu dönüş sırasında geçen zaman 1 yıl olarak kabul edilir.",
            "Dünya’nın Güneş Etrafındaki Dönüşünün Sonuçları:\n" +
                    "\n" +
                    "Mevsimlerin oluşumuna ve değişimine neden olur.\n" +
                    "Gece – gündüz uzunlukları değişir.\n" +
                    "Kara ve denizler arasında sıcaklık farkları oluşur.\n" +
                    "Mevsimlik sıcaklık farkları meydana gelir.\n" +
                    "Güneş ışınlarının yeryüzüne düşme açıları değişir.",
    };
    public static String HaritaBilgisiBilgi[] = {
            "Harita ve plânın en önemli özelliğinin, kuşbakışı çizim ve ölçeğinin olmasıdır.",
            "Krokiyi harita ve plândan ayıran tek özellik kabataslak olmasıdır.",
            "Haritalarda bozulma en fazla kutuplarda, en az Ekvator'dadır.",
            "Haritalarda en fazla ayrıntı plânlarda, en az ayrıntı Atlas Haritalarındadır.",
            "Büyük Ölçekli haritaların; en olumlu özellikleri ayrıntısının çok ve bozulma oranının az olmasıdır. En olumsuz özellikleri ise, gösterdiği alanın az olması ve duvarda fazla yer kaplamasıdır.",
            "Küçük Ölçekli haritaların; en olumlu özellikleri gösterdiği alanın fazla olması ve duvarda az yer kaplamasıdır.",
            "Yeryüzü şekillerinin haritalarda gösterilme metodundan; en kullanışlısı izohips metodudur. Tapoğrafya yüzeyini (engebeleri) en iyi ifade eden metod arama metodudur. Her ikisini birden ifade eden en iyi metod kabartma yöntemidir.",
            " İzohipslerde;\n" +
                    "1. En fazla eğitim;çizgilerin sık olduğu yerde,\n" +
                    "2. En az eğitim;çizgilerin seyrek olduğu yerlerdedir.",
            "Çizgilerin en sık olduğu yerde;\n" +
                    "1. En fazla aşındırma,\n" +
                    "2. En zor tırmanma,\n" +
                    "3. En kısa uzunluk vardır.",
            "İzohipslerde;\n" +
                    "1. En yüksek noktayı en içteki çizgi,\n" +
                    "2. En alçak noktayı en dıştaki çizgi gösterir.",
            "İzobarlarda;\n" +
                    "1. En derin noktayı, en içteki eğri,\n" +
                    "2. En sığ yeri en dıştaki eğri gösterir.",
    };
    public static String İklimBilgi[] = {
            "İklim, yeryüzünün bir kesiminde veya tamamında, belli bir zamanda gelişen atmosfer olaylarının (hava şartlarının) istatistiki ortalaması. Alınan ortalama; günlük, aylık, mevsimlik, yıllık veya daha farklı devreleri kapsayabilmektedir. Halk dilinde iklim denilince bir yerin yıllık hava şartları ortalaması anlaşılmaktadır.",
            "Günlük hava şartları ortalaması ele alınınca buna iklim değil, hava durumu denilmektedir. ",
            "Isı: Isıdan kasıt, güneş ışınlarının sözkonusu bölgeye, dik mi yoksa başka bir açı altında mı tesir ettiğidir. Bunun yanında ayrıca bulutlar da ısıyı etkilerler. Denizler: Bilindiği gibi deniz kıyısındaki bölgelerde sıcaklık değişmesi fazla olmaz. Bunun sebebi denizlerin karalara nazaran daha geç ısınıp daha geç soğumasıdır. Ayrıca sıcak ve soğuk su akıntıları da iklimi etkiler.",
            "Rakım: Yüksek noktalarda havanın yoğunluğu çok azdır. Havanın yoğunluğunun az olması, güneş ışınlarının burada tutulamaması dolayısıyla sıcaklık düşmesine sebep olur.",
            "Hava akımı: Sıcak ve soğuk havaların yer değiştirmesi de iklimi önemli ölçüde etkiler.",
            "Nemlilik: Havada devamlı bulunan rutubet yükseklere çıkınca soğur ve yağmur olarak yağa",
            "Ekvator iklimi: Çok sıcaktır, bol yağış alır, yıllık sıcaklık farkı yok denecek kadar azdır. Ekvator ve çevresini etkisi altına alır, alçak basınç altındadır.",
            "Kurak iklim: Denizden uzak bölgelerde görülür, devamlı yüksek basınç altındadır. Çok az yağış görülür. Kurak iklim, step ve çöl iklimi olmak üzere ikiye ayrılır.",
            "Yazları yağışlı tropikal iklim: Ekvator iklimi ile kurak iklim arasındaki iklimdir. Sıcaklık, bazan ekvator iklimini de geçer, fakat sürekli değildir. Savan iklimi de denilmektedir.",
            "Muson iklimi: Muson rüzgarlarının tesiriyle Güneydoğu Asyada görülen bol yağışlı iklimdir. Yıllık sıcaklık farkı fazla değildir. Alcak basınç tesirindedir.",
            "Kışları yağışlı alt tropikal iklim: Bir diğer adı da Akdeniz iklimidir. En beğenilen iklimdir. 30°-40° paralelleri arasında etkilidir. Yıllık sıcaklık farkı çok değildir. En çok kış aylarında yağış alır. Sıcaklık yaz aylarında daha fazladır.",
            "Ilımlı iklimler: Bunlar ılımlı Okyanus ve ılımlı kara iklimleridir. Okyanus iklimi daha çok deniz kenarlarında etkilidir. Sıcaklık 10°-20° arasında değişir. Ilımlı kara iklimi ise iç bölgelerde görülür ve kışları çok soğuk yazları ise çok sıcak geçer.",
            "Soğuk iklimler: Yılın en sıcak ayı ortalaması 0°Cnin altındadır. Yağmur az olup yazın ve baharda kar erimeleri olur. Bir diğer şekli de kutupaltı iklimine benzeyen daha sert ve kar erimesi az, buz iklimidir.",
            "Denize yakın yerlerde mevsimler arası sıcaklık farkı daha azdır ve iklim daha yumuşaktır.",
            "Karasal bölgelerde ise mevsimler arası ve gece - gündüz sıcaklık farkları daha fazladır. Buna sebep ise havadaki nem oranıdır.",
            "Enlem derecesi arttıkça güneş ışınlarının yüzeye vurma derecesi azalır ve daha soğuk bir iklim hüküm sürer.",
            "Ekvator'dan kuzeye ya da güneye gidildikçe ortalama sıcaklık azalır.",
            "Tropikal bölgelerde genelde sadece bir ya da iki mevsim görülür. Bunlar sıcaklık farkı ile değil de yağış ve nem ile ayırt edilir.",
            "Dağlar da iklimlerin oluşmasında rol oynar. Ülkemizin Ege kıyılarında görüldüğü gibi dağlar denize dik uzanıyorsa kıyıda egemen olan iklim iç kesimlerde de egemenliği sürdürür. Eğer dağlar Karadeniz ve Akdeniz bölgelerinde de olduğu gibi kıyıya paralel uzanıyorsa kıyıda egemenlik süren iklim iç kesimleri etkileyemez. Bu nedenle İç Anadolu Bölgesi'nde karasal iklim görülür.",
            "Dünya üzerinde görülen iklim tipleri:\n" +
                    "Ekvatoral İklim\n" +
                    "Savan İklimi\n" +
                    "Kutup İklimi\n" +
                    "Çöl İklimi\n" +
                    "Okyanusal İklim\n" +
                    "Karasal İklim\n" +
                    "Tundra İklimi (Kutupaltı İklim) = Soğuk İklim\n" +
                    "Akdeniz İklimi = Ilık İklim\n" +
                    "Muson İklimi = Sıcak İklim\n" +
                    "Karadeniz iklimi",
            "Türkiye’de üç ana iklim tipi görülür:\n" +
                    "Karadeniz İklimi,\n" +
                    "Akdeniz İklimi,\n" +
                    "Karasal iklim.",
    };
    public static String IcDisKuvvetlerBilgi[] = {
            "Yeryuvarlağı, iç içe kürelerden meydana gelmiştir. Bunlara geosfer adı verilir. Geosferlerin yoğunlukları ve bileşimleri birbirinden farklıdır.",
            "YERKABUĞU: Litosfer ya da taşküre olarak da adlandırılır. Yerküre’nin en hafif ve en ince tabakasıdır. Yeryüzünden itibaren ortalama 33 km derinliğe kadar uzanır. ",
            "Granitik Kabuk (Sial): Bileşiminde silisyum ve alüminyum olduğundan bu ismi almıştır. Yoğunluğu 2,7 – 2,8 gr/cm3tür. Katı halde bulunur. Kalınlığı okyanus tabanlarında az iken, kıta tabanlarında fazladır.",
            "Bazaltik Kabuk (Sima): Bileşiminde silisyum ve mağnezyum olduğundan bu ismi almıştır. Yoğunluğu 3 gr/cm3dolayındadır. Sial’in tersine okyanus tabanlarında kalınlaşır, kıta tabanlarında incelir.",
            "MANTO: Yer çekirdeğinin örtüsü durumunda olduğundan bu ad verilmiştir. Astenosfer adı da verilir. Yerküre’nin yaklaşık 33 km ile 2900 km derinlikleri arasında yer alır. Yoğunluğu yerkabuğuna oranla daha fazladır. (5 – 6 gr/cm3) Mantonun üst kısmındaki maddeler plastik özelliği gösterir. Sıvı haldeki manto malzemesine mağma denir.",
            "ÇEKİRDEK: En kalın ve ağır olan katmandır. Barisfer adı da verilir. Mantonun altında başlar ve Dünya’nın merkezine kadar uzanır. Kalınlığı 3478 km dir. Yoğunluğu 10 gr/cm3 olan ve sıvı halde bulunan üst kısmına dış çekirdek denir",
            "Püskürük (Katılaşım) Taşlar: İç püskürük taşlar: Mağma, her zaman yeryüzüne kadar çıkamaz. Bazen yerkabuğunun belirli yerlerine sokularak katılaşır. Soğuma yavaş olduğundan iri kristalli olurlar. Bu taşlara örnek olarak granit ve siyanit \n" +
                    "Dış püskürük taşlar: Mağmanın yeryüzünde soğuyup katılaşması sonucunda oluşur. Soğuma hızlı olduğundan kristalleşme ya hiç olmaz, ya da çok az olur. Bu taşlara örnek olarak andezit ve bazalt",
            "Tortul (Sediment)Taşlar\n" +
                    "Kimyasal tortul taşlar:Sularda erimiş halde bulunan maddelerin kimyasal yollarla çökelmesi sonucunda oluşurlar. Kireçtaşı\n" +
                    "(kalker), traverten, kayatuzu, jips (alçı taşı) ve dolomit kimyasal tortul taşlardandır.\n" +
                    "Organik tortul taşlar:Canlı kalıntılarının üst üste birikerek katılaşması sonucu oluşurlar.Turba, linyit, taşkömürü, antrasit ve mercan kalkerleri organik tortul taşlardandır.\n" +
                    "Mekanik (klastik veya kırıntılı) tortul taşlar: Akarsular, rüzgârlar ve buzullar gibi dış kuvvetlerin aşındırdığı materyalleri taşıması ve çukur alanlarda biriktirmesi sonucu oluşurlar.Kiltaşı, kumtaşı\n" +
                    "(Gre), buzultaşı(moren) ve konglomera kırıntılı tortul taşlardandır.",
            "Başkalaşım (Metamorfik) Taşlar: Püskürük ve tortul taşların, aşırı sıcaklık ve basınç altında kalarak değişime uğramasıyla oluşurlar. Bu tür taşlar, eski özelliklerini kaybederek yeni özellikler kazanırlar. Mermer, killi şist, kristalli şist, gnays ve kuvars başkalaşım taşlarının en yaygın olanıdır.",
            "Kıvrılma: Akarsular, rüzgârlar ve buzullar gibi dış kuvvetlerin aşındırdığı maddeler, yer kabuğunun büyük çukurluklarında biriktirilir. Bu çukurluklara jeosenklinal adı verilir. Jeosenklinallerde biriktirilen tortul maddeler, çeşitli yan basınçlara uğrarlarsa kıvrılarak deniz yüzeyine çıkarlar. Böylece yeryüzünün büyük kıvrım dağları oluşmuş olur. Avrupa’da Alp’ler, Asya’da Himalaya’lar, Türkiye’de Toros ve Kuzey Anadolu Dağları bu tür hareketlerle meydana gelmişlerdir.",
            "Kırılma: Yer kabuğunun eskiden beri kara haline geçmiş, katılaşmış kısımları, yan basınçlara uğradığı zaman bükülüp katlanamazlar. Bu nedenle, bu gibi yerlerde kıvrılmalar yerine kırıklar meydana gelir. Kırıkların iki yanındaki kısım birbirine göre yer değiştirirse, bu özellikteki kırığa fay denir. Kırılma sonucunda yüksekte kalan kesimlere horst, alçakta kalan kesimlere de graben denir.",
            "Kuzey Anadolu Fay Hattı (KAF): Saroz Körfezi’nden başlar, Marmara Denizi, Sapanca Gölü, Adapazarı, Tosya ve Erzincan üzerinden Van Gölü kuzeyine kadar uzanır.",
            "Doğu Anadolu Fay Hattı (DAF): Hatay grabeninden başlar, K. Maraş, Adıyaman, Malatya ve Elazığ ovalarından geçerek Bingöl’e kadar sokulur.",
            "Batı Anadolu Fay Hattı (BAF): Ege Bölgesi’nde, kuzeyden güneye doğru uzanan çok sayıdaki fay hatlarından oluşur.",
            "Fay hatları, yer kabuğunun zayıf ve hareket halindeki bölgeleridir. Volkanik sahalar, genç kıvrım dağları ve deprem alanlarının uzanışı fay hatlarıyla paralellik gösterir.",
            "KITA OLUŞUMU HAREKETLERİ (EPİROJENEZ): Kara ve denizlerde düşey doğrultudaki alçalma yükselme hareketlerine epirojenez denir. Başka bir ifade ile yer kabuğunun geniş alanlı yaylanma hareketleridir.",
            "Farklı yoğunluktaki yer kabuğu parçaları manto üzerinde dengeli bir biçimde dururlar. Bu olayaizostazi, dengeye ise izostatik denge denir. ",
            "Karalar yükselince deniz seviyesi gerilemekte, deniz altındaki alanlar kara haline gelmektedir. Bu şekilde, deniz seviyesinin alçalması olayına regresyon denir.",
            "Karalardaki, lâvlar, birikmeler, buzullaşma, vb. olaylar sonucunda da karaların yükü artmakta ve ağırlaşarak ya da iç kuvvetlerin etkisiyle çökmektedir.\n" +
                    "Bu alçalma sonucunda denizler karalara doğru ilerlemekte ve kara parçaları sular altında kalmaktadır. Bu şekilde, deniz seviyesinin yükselmesi olayına da transgresyon adı verilir.",
            "VOLKANİK HAREKETLER: Yer’in derinliklerinde bulunan mağmanın, yerkabuğunun zayıf kısımlarından yeryüzüne doğru yükselmesine volkanizma denir. Püskürdüğü bilinen volkanlar etkin volkanlar, püskürdüğü bilinmeyen volkanlar da sönmüş volkanlar olarak adlandırılır.",
            "Türkiye’deki Volkanik Sahalar\n" +
                    "Doğu Anadolu Bölgesi’nde;Büyük Ağrı, Küçük Ağrı, Süphan, Tendürek ve Nemrut dağları\n" +
                    "İç Anadolu Bölgesi’nde; Erciyes, Hasandağı, Melendiz, Karadağ, Karacadağ ve Karapınar çevresi\n" +
                    "Güneydoğu Anadolu Bölgesi’nde; Karacadağ\n" +
                    "Kuzeybatı Anadolu’da; Köroğlu Dağları\n" +
                    "Akdeniz Bölgesi’nde; Hatay yakınında Hassa çevresi\n" +
                    "Ege Bölgesi’nde;Kula (Manisa) çevresi",
            "SEİZMA HAREKETLERİ: Yerkabuğundaki herhangi bir sarsıntının, çevreye doğru yayılan titreşim biçimindeki hareketine deprem denir.",
            "Deprem Türleri; Volkanik depremler, Çöküntü (Göçme) depremleri,Tektonik (Dislokasyon) depremler",
            "Kayaların Çözülmesi: Kayalar ve taşlar, dış olayların etkisi altında zamanla değişikliğe uğrayarak paslanmış, çürümüş gibi bir görünüm alır. Zamanla taşı oluşturan mineraller arasındaki bağ gevşer ve taş parçalara ayrılır, ufalanır. İşte, kayaların ve taşların uğradıkları bu değişikliklere çözülme denir.",
            "Çözülme Türleri; Fiziksel (Mekanik) Çözülme, Kimyasal çözülme olarak ikiye ayrılır.",
            "Toprak Oluşumu: Çözülmeye uğrayan kayaların yüzeyi zamanla, ayrışmış mineraller, organik maddeler ve mikroorganizmalardan oluşan bir örtüyle kaplanır. Bu örtüye toprak denir. Toprak tabakası, yerkabuğu üzerinde bulunur. Kalınlığı birkaç cm den, 2 – 3 m ye kadar olabilir. Oluşumunu tamamlayan bir toprak kesitinde; ana kaya, ayrışmış kaya, ham toprak, olgun toprak katları bulunmaktadır.",
            "Taşınmış Topraklar (Azonal Topraklar): Akarsular, rüzgârlar ve buzullar gibi dış kuvvetlerin, çeşitli sahalardan aşındırarak taşıdıkları materyalleri biriktirmeleriyle oluşan topraklardır.",
            "Tundra Toprakları\n" +
                    "Kutuplara yakın, soğuk tundra bölgelerinin topraklarıdır. Toprak genelde ya donmuş haldedir ya da bataklık halinde bulunur. Bu nedenle tarım yapmaya elverişli değildir. Türkiye’de bu tür topraklar görülmez.",
            "Podzol Topraklar\n" +
                    "İğne yapraklı ormanlarla kaplı, soğuk ve nemli iklim bölgelerinin topraklarıdır. Çok yıkanmış olduklarından üst kısımlarının rengi soluklaşmıştır. Yine aynı sebepten dolayı, topraktaki besin maddeleri de azdır. Bunun sonucunda verimsizleşmiştir. Türkiye’de, Batı Karadeniz Bölümü’nde kahverengi ve kırmızımsı sarı podzolik topraklar yaygındır.",
            "Kahverengi Orman Toprakları\n" +
                    "Nemli orta kuşağın, geniş (yayvan) yapraklı ormanlarla kaplı bölgelerinde görülür. Humus bakımından zengin oldukları için verimlidirler. Türkiye’de, bu tür topraklar, Karadeniz Bölgesi’nde yaygın olmakla birlikte, İç Anadolu’nun 1000 – 1200 m’den yüksek alanlarında da yer yer görülür. İç Anadolu’da, daha çok Kuzey Anadolu Dağları’nın güneye bakan yamaçlarında yaygındır.",
            "ırmızı Topraklar (Terra – rossa)\n" +
                    "Nemli subtropikal iklim bölgesi ile Akdeniz iklim bölgelerinde, genellikle kalkerler üzerinde görülen topraklardır. Toprağa kırmızı rengini veren bileşimindeki demiroksittir. Türkiye’de, Akdeniz Bölgesi ile Kıyı Ege ve Güney Marmara’da yaygın olarak görülür.",
            "Laterit Topraklar\n" +
                    "Dönenceler arasında yer alan, sıcak ve nemli iklim bölgelerinin karakteristik toprak tipidir. Şiddetli bir kimyasal çözülme sonucu oluşur. Rengi kiremit kırmızısıdır. Humus oranı azdır. Buna bağlı olarak verimli değildir. Türkiye’de tam olarak laterit özelliği taşıyan toprak görülmez. Ancak, Doğu Karadeniz Bölümü’nde, laterit türü (lateritleşmiş) topraklara rastlanabilmektedir.",
            "Çernezyomlar\n" +
                    "Çernezyomlar, Orta Kuşağın yarı nemli step bölgelerinde görülür. Kara topraklar adı da verilir. Fazla yıkanmadıkları için mineral ve kireç bakımından zengindir. Toprağın üst kısmında, steplerden oluşan bitki artıklarının oluşturduğu, kalın bir humus tabakası vardır. Bu nedenle Dünya’nın en verimli toprakları arasındadır.",
            "Kestane veya Kahve Renkli Step Toprakları\n" +
                    "Az yağış alan step iklimlerinde görülen topraklardır. Üzerindeki bitki örtüsü seyrek olduğu için, humus oranı azdır. Bu yüzden verimleri düşüktür. Türkiye’de, Doğu Anadolu, İç Anadolu ve Güneydoğu Anadolu plâtoları ile İçbatı Anadolu’da yaygındır.",
            "Çöl Toprakları\n" +
                    "Çöl iklim bölgelerinde görülür. Çok az yağış alıp, fazla yıkanmadıkları için, kireç ve tuz oranı oldukça fazladır. Humus, hemen hemen hiç yoktur. Bu topraklarda tarım yapılamaz.",
            "Herhangi bir yamacın, bir kısmının kayarak aşağıya doğru yer değiştirmesine yer göçmesi ya da heyelan denir. Eğer, ana kaya üzerinden yalnızca toprak örtüsü kayıyorsa, buna da yer kayması adı verilir.",
            "Yer Göçmeleri ve Yer kaymalarını oluşturan etkenler: Fazla eğim, Şiddetli yağış, Yerçekimi, Tabakaların durumu, Kayanın ve toprağın cinsi",
            "TOPRAK EROZYONU\n" +
                    "Toprak tabakasının üst kısmının, akarsu, sel ve rüzgârlar gibi dış kuvvetlerin etkisiyle taşınıp sürüklenmesi olayına erozyon denir. Kurak bölgelerde ve bitki örtüsünden yoksun arazilerde hem rüzgâr, hem de akarsu erozyonu çok fazla görülür.",
            "Akarsu kaynağı: Akarsuyun doğduğu yerdir.",
            "Akarsu ağzı:Akarsuyun herhangi bir denize veya göle döküldüğü yerdir.",
            "Akarsu yatağı: Kaynakla ağız arasında uzanan, akarsuyun içinden aktığı çukurluktur.",
            "Akarsu vadisi:Akarsuların, içinde aktıkları yatağı aşındırmalarıyla ortaya çıkan çukurluktur.",
            "Akarsu havzası: Bir akarsuyun bütün kollarıyla birlikte sularını topladığı ve faaliyet gösterdiği alanlardır.Eğer akarsular, topladıkları suyu denize ulaştırabiliyorsa, böyle akarsuların havzası açık havzadır. Ancak, akarsular topladıkları suyu denize ulaştıramıyorsa, kara içinde bir göle dökülüyorsa veya yer altına sızıyorsa, bu tür akarsuların havzası kapalı havzadır.",
            "Su bölümü çizgisi:İki akarsu havzasını birbirinden ayıran sınırdır. Genellikle dağların doruk noktalarından geçerler.",
            "Akarsu ağı (Akarsu drenajı):Akarsu havzası, içindeki kollarıyla birlikte bir ağ oluşturur. Buna akarsu ağı (drenajı) denir. Havzanın eğimi, yapıyı oluşturan taşların cinsi ve tabakaların özelliklerine göre, değişik tipte akarsu drenajları oluşur.",
            "Akarsu debisi (akımı): Akarsu yatağının, herhangi bir kesitinden geçen su miktarının m3/sn cinsinden değeridir.",
            "Akarsu rejimi: Akarsuyun yıl içerisindeki debi değişiklikleridir. Akım düzeni olarak da adlandırılır. Su seviyesinde fazla değişiklik olmayan akarsuların rejimleri düzenli Aylara ve mevsimlere göre, seviye değişikliği fazla olan akarsuların rejimleri düzensizdir.",
            "Akarsu hızı:Akarsuyun birim zamanda aldığı yoldur (m/sn). Akarsu hızı muline denilen bir araçla ölçülür.",
            "Hız çizgisi:Akarsu hızının en fazla olduğu noktaları birleştiren çizgidir.",
            "Sürekli akarsu:Yatağında her zaman su bulunduran akarsudur.",
            "Geçici akarsu: Yatağında her zaman su bulundurmayan, bazen kuruyan akarsudur.",
            "Taban seviyesi:Akarsular aşındırmalarını derine, yana ve geriye doğru yaparlar. Hiçbir akarsu yatağını deniz seviyesinin daha altına kadar ışındıramaz. Bu seviyeye taban seviyesi",
            "Yamaç gerilemesi: Özellikle nemli iklim bölgelerinde yamaçlar hem alttan, hem de sel sularıyla üstten aşınırlar. Bunun sonucunda yamaç gerilemesi olayı meydana gelir ve yamaç profili oluşur.",
            "Kimyasal aşındırma: Sıcaklığın yüksek olduğu zamanlarda veya sürekli sıcak bölgelerde, akarsuların geçtikleri yeri eritmesiyle yaptığı aşındırmadır.",
            "Fiziksel (Mekanik)aşındırma: Akarsular, eğime bağlı olarak kazandıkları güçle, yatağındaki kayaları parçalayarak aşındırır. Akarsular genelde fiziksel yolla aşındırma yaparlar.",
            "AKARSU AŞINIM ŞEKİLLERİ: Vadiler, Boğaz Vadi (Yarma Vadi), Kanyon Vadi, Çentik (Kertik) Vadi, Yatık yamaçlı vadi, Tabanlı vadi, Menderesler, Kırgıbayır, Çağlayan ve Çavlanlar, Peribacaları, Peneplen",
            "Akarsuların biriktirme yapabilmesi için;\n" +
                    "– Eğimin azalması\n" +
                    "– Suyun azalması,\n" +
                    "– Akarsu hızının azalması,\n" +
                    "– Akarsu yükünün artması,\n" +
                    "gereklidir. Bu faktörler bir arada olunca, akarsuyun gücü azalır ve biriktirme başlar.",
            "Dağ yamaçlarından düzlüğe inen akarsular, taşıdıkları materyalleri eğimin azaldığı yerlerde yarım koni şeklinde biriktirirler. Bunlara birikinti konisi denir.",
            "Dağ Eteği Ovaları\n" +
                    "Dağ eteğinde, eğimin azaldığı yerlerde meydana gelen birikinti konileri ve yelpazelerinin zamanla yanlara doğru büyüyerek birleşmeleri sonucu oluşan ovalardır.",
            "Dağ İçi Ovaları\n" +
                    "Dağ içlerinde, eğimin azaldığı yerlerde, akarsuyun taşıdığı malzemeleri biriktirmesi sonucu oluşan düzlüklerdir. Engebeli ülkelerde daha fazla oluşur.",
            "Taban Seviyesi Ovaları\n" +
                    "Akarsuların denize yaklaştıkları yerlerde taşıma gücü azdır. Böyle yerlerde akarsular, taşıdıkları malzemeleri biriktirirler ve ova yüzeyini alüvyal dolgu alanı haline getirirler. Böyle oluşan düzlüklere taban seviyesi ovası veya alüvyal taşkın ovası denir.",
            "Delta Ovaları\n" +
                    "Akarsuların taşıdıkları malzemeleri, deniz içerisinde biriktirmesi sonucu, üçgene benzeyen düzlükler meydana gelir. Bunlara delta ovası adı verilir.",
            "Taraçalar (Sekiler)\n" +
                    "Alüvyal tabanlı vadi üzerindeki akarsuların, yeniden canlanarak, yatağını kazması sonucunda oluşan yüksekte kalmış eski vadi tabanlarıdır. ",
            "Kum Adacıkları\n" +
                    "Akarsu eğiminin azaldığı ve yatağın genişlediği yerlerde, taşınan alüvyonlar ve kumlar küçük adacıklar şeklinde biriktirilir. Bunlara kum adacıkları denir.",
            "Yer altı Suları\n" +
                    "Türkiye, yer altı suları bakımından oldukça zengin sayılır. Jeolojik yapı ve yerşekilleri yer altı sularının özelliklerini belirler. Kumlu ve çakıllı yapılarda bol miktarda yer altı suyu bulunur.",
            "Artezyen Kaynaklar: Özellikle kıvrımlı yapılarda iki geçirimsiz tabaka arasında bulunan geçirimli tabakalarda basınçlı yer altı suları birikir.",
            "Karstik Kaynaklar: Kireçtaşlarının çatlaklarından sızan suların, yer altı mecralarında toplanması ve bunların vadi tabanı ile yamaçlarında bol debili akması sonucunda oluşurlar.",
            "Fay kaynakları: Fay hatlarındaki çatlaklardan yeryüzüne çıkan sıcak suların oluşturduğu kaynaklardır. Ülkemizde fay kaynakları en çok, Ege Bölgesi ve Güney Marmara Bölümü’ndeki grabenler boyunca görülür. Ayrıca Kuzey Anadolu fay hattı üzerinde de bu tür kaynaklar oluşmuştur.",
            "Yamaç kaynakları: Dağ ve vadi yamaçlarında, geçirimsiz bir tabakanın yüzeyi kestiği yerlerde oluşurlar.",
            "Termal Kaynaklar ve Kaplıcalar: Yerin derinliklerine sızan sular, yerin iç ısısının etkisiyle ısınarak yeryüzüne çıkarlar. Bu şekilde oluşan sıcak su kaynaklarına termal kaynak ve kaplıca adı verilir. Eğer bu kaynakların suyu çok sıcak ise ve basınçlı olarak yeryüzüne çıkıyorlarsa, bunlara gayzer, suları az sıcak ise, bunlara da ılıca denir.",
            "Lapyalar: Karstik arazilerde, yağışlar sonucunda yeryüzüne düşen sular, kireçtaşlarını aşındırarak oyuklar ve yarıklar oluşturur. Bunlara lapya denir.",
            "Dolinler: Lapyalar zamanla genişleyip birleşerek dolinleri oluştururlar. Derinlikleri birkaç metredir. Çapları ise birkaç yüz metreyi bulabilir.",
            "Uvala ve Polyeler: Karstik sahalarda dolinler zamanla genişleyerek uvala denilen şekilleri oluştururlar. Uvalalar da genişleyip birleşirlerse polye adı verilen şekilleri meydana getirirler.",
            "Obruklar: yer altındaki mağara ve galeri tavanlarının çökmesiyle oluşmuş derin karst kuyularıdır. Obrukların bazılarının tabanlarında sular birikmiştir ve obruk gölleri meydana gelmiştir.",
            "Mağaralar: Karstik alanlarda yer altı sularının eritmesi sonucu oluşan doğal yer altı boşluklarına mağara denir.",
            "Tüneller ve Doğal Köprüler: Karstik alanlarda yeryüzündeki sular yer altına sızarlar ve tabakaların bu sularla çözünmesi sonucu tüneller oluşur. ",
            "Travertenler: Karstik alanlardan kaynaklanan suların içerisinde eriyik halde bulunan kireç, buharlaşma ve sudaki karbondioksitin ayrışması sonucu çökelir ve travertenler meydana gelir.",
            "Sarkıt, Dikit ve Sütunlar: Mağara tavanından sarkan kalsiyum karbonat çökelti taşlarınasarkıt, mağara tabanından yükselen kalsiyum karbonat çökelti taşlarına ise dikit adı verilir.",
            "Kutuplarda ve yüksek dağlar üzerinde yağışlar genellikle kar halinde olur. Sıcaklık çok düşük olduğu için yağan karlar erimeden üst üste birikir. Biriken bu karlara toktağan (kalıcı) kardenir. Yaz ve kış karla örtülü olan böyle yerlerin alt kısımlarına ise, toktağan (kalıcı) kar sınırı adı verilir.",
            "Buzul Vadisi: Buz örtüleri altında kalmış olan bölgelerde, buzun yatağını aşındırıp derinleştirmesi sonucunda oluşan “U” şeklindeki vadilerdir.",
            "Hörgüç kaya: Anakayanın buzullar tarafından işlenmesi sonucunda oluşan kaya tepeleridir.",
            "Sirk Çanağı (Buz Yalağı): Dağ yamaçlarındaki bazı buzulların, bulundukları alanı aşındırmasıyla oluşan çanaklardır. Buzullar bazen eriyince bu çanaklar sularla dolarak sirk göllerini meydana getirirler.",
            "Türkiye’de, buzulların aşındırma şekilleri, en çok aşağıdaki dağlarımızda görülür:\n" +
                    "\n" +
                    "Toroslar’da,Bey Dağları, Sultan Dağları, Bolkar Dağları ve Aladağlar\n" +
                    "Göller Yöresi’nde,Davras ve Dedegöl Dağları\n" +
                    "Doğu Anadolu Bölgesi’nde,Mescit, Yalnızçam, Bingöl, Buzul, Süphan, Sat ve Ağrı Dağları\n" +
                    "İç Anadolu Bölgesi’nde,Erciyes Dağı\n" +
                    "Marmara Bölgesi’nde,Uludağ\n" +
                    "Karadeniz Bölgesi’nde,Kaçkar ve Giresun Dağları",
            "Moren (Buzultaş): Buzulların aşındırdıkları malzemeleri biriktirmesiyle oluşurlar. Ortalama kalınlıkları 50 – 60 m kadardır.",
            "Drumlin: Buzulların taşıyıp biriktirdiği materyallerin, buzulun alt kısmındaki erimeler sonucu meydana gelen dereler tarafından işlenmesiyle oluşan birikintilerdir.",
            "Sander Ovası: Eriyerek çekilen buzul sularının oluşturduğu düzlüklerdir.",
            "Rüzgârlar, güçleri ölçüsünde yeryüzünden kopardıkları parçacıkları veya mevcut materyalleri sürükleyerek, havalandırarak taşırlar ve önüne çıkan engellere çarptırırlar. Bunun sonucunda, kayaların yüzeyinde çizikler ve oyuklar oluşur. Aşınmaya karşı farklı dirençteki tabakalar üst üste oluşmuş ise bu oyuklar büyür ve bazı şekiller meydana gelir. Bu şekillerin en sık görülenlerişeytan masaları (mantar kayalar) ve şahit kayalardır.",
            "Rüzgâr biriktirme şekillerinden en yaygın olanları kumullardır. Kumullar, rüzgâr hızının azaldığı alanlarda kum yığınları şeklinde meydana gelirler.",
            "Dalga, deniz yüzeyindeki salınım hareketleridir.",
            "Dalgaları oluşturan nedenler;\n" +
                    "\n" +
                    "Dünya’nın dönmesi,\n" +
                    "Rüzgârlar,\n" +
                    "Depremler,\n" +
                    "Denizaltı heyelanı,\n" +
                    "Volkanizma’dır.",
            "Akıntılar\n" +
                    "Deniz yüzeylerindeki suların, bulundukları yerlerden başka alanlara doğru taşınmasına akıntı denir.",
            "Lâgünler: Koyların önünde oluşan kıyı kordonları zamanla koyun önünü tamamen kapatır ve denizle olan bağlantısını keserek deniz kenarında bir göl oluşumuna sebebiyet verir. Böyle oluşan göllere lâgün ya da deniz kulağı denir.",
            "Tombololar: Kıyı yakınındaki bir adanın bir kordonla kıyıya bağlanması sonucu oluşan yarım adalara tombolo denir.",
            "Fiyort Kıyılar: Buzul vadilerinin sular altında kalması sonucu oluşan kıyılardır. Bu kıyı tipine ait en güzel örnek, İskandinav Yarımadası’nın Atlas Okyanusu kıyılarıdır. Dünya’nın en büyük fiyordu Norveç’teki Soğne fiyordudur.",
            "Skyer Kıyılar:Buzulların aşındırdığı tepeciklerle veya buzulların biriktirdiği moren yığınlarıyla şekillenmiş kıyılar sular altında kalınca yüzlerce adacık ortaya çıkar. Bu tür kıyılara skyer kıyılar denir. Baltık Denizi’nin kuzeydoğusunda bu tür kıyılar görülür.",
            "Ria tipi kıyılar:Plâtoları yaran derin vadilerin sular altında kalmasıyla oluşan kıyılardır. Dünya’da en güzel örnekleri, Güneybatı İrlanda ve Kuzeybatı İspanya’da görülür.",
            "Liman tipi kıyılar:Alçak kıyılardaki geniş vadilerin sular altında kalması ve bunların önünün kıyı setleriyle kapatılması sonucunda oluşmuştur. ",
            "Dalmaçya tipi kıyılar: Deniz sularının, kıyıya paralel uzanan dağlar arasındaki çukurluklara dolmasıyla oluşan kıyılardır",
            "Haliç (Estuar) tipi kıyılar:Gel – git olayı sonucunda akarsu ağızlarının aşındırılmasıyla oluşan ve huniye benzeyen kıyılardır. Dünya’nın en büyük halici Hamburg halicidir.",
            "Boyuna kıyılar: Dağların denize paralel uzandığı yerlerde boyuna kıyılar görülür. Bu kıyılarda girinti ve çıkıntı son derece azdır. Karadeniz ve Akdeniz kıyıları bu tiptendir.",
            "Enine kıyılar: Dağların denize dik uzandığı yerlerde enine kıyılar görülür. Bu kıyılarda girinti – çıkıntı son derece fazladır. Ege kıyıları bu tiptendir.",
            " GÖLLER VE OLUŞUMLARI\n" +
                    "\n" +
                    "Yerli Kaya Gölleri\n" +
                    "Tektonik Göller:Yer kabuğunun çökmesi veya kırılması neticesinde meydana gelen çukurluklara suların dolmasıyla oluşurlar. Dünya’nın en derin gölü olan Baykal Gölü (1741 m), Lût Gölü, Hazar Gölü ve Çad Gölü yeryüzündeki başlıca büyük tektonik göllerdir.",
            "Ülkemizdeki başlıca tektonik göller ise şunlardır:\n" +
                    "\n" +
                    "Marmara Bölgesi’nde; Sapanca, İznik, Ulubat ve Manyas gölleri,\n" +
                    "Ege Bölgesi’nde; Simav Gölü,\n" +
                    "Göller Yöresi’nde; Beyşehir, Eğirdir, Acıgöl, Burdur, Ilgın (Çavuşçu), Akşehir, Eber, Suğla ve Kovada gölleri,\n" +
                    "İç Anadolu Bölgesi’nde; Tuz, Seyfe ve Tuzla gölleri,\n" +
                    "Doğu Anadolu Bölgesi’nde Hazar, Hozapin ve Van gölleri.",
            "Karstik Göller:Bu tür göller, kayatuzu, jips, kalker gibi çözünebilen tabakaların bulunduğu sahalarda meydana gelir. Bazı karstik göllerin oluşumunda tektonik olaylar da etkili olmuştur.",
            "Volkanik Göller:Volkanik faaliyetler esnasında oluşan patlama çukurları içerisinde meydana gelen göllerdir.",
            "Buzul (Sirk) Gölleri:Dağ doruklarında, buzulların aşındırmasıyla oluşan ve sirk adı verilen çukurluklarda meydana gelirler. Ülkemizde Sat, Ağrı, Erciyes, Kaçkar ve Bolkar dağlarıileAladağlar üzerinde yer yer bu türden göller bulunmaktadır.",
            "Alüvyal Set Gölleri:Alüvyonlarla akarsuyun önünün kapanması sonucu oluşur. Ülkemizde,Marmara, Çamiçi (Bafa), Köyceğiz, Mogan ve Eymir Gölleri ile Uzungölbu tür göllerdendir.",
            "Kıyı Set Gölleri:Dalga ve akıntıların taşıdığı malzemeleri koy ve körfezlerin ağız kısmında biriktirmesiyle oluşur. Ülkemizde, Büyük ve Küçük Çekmece gölleri, Durusu (Terkos) gölü, Çukurova deltasındaki Akyatan gölü kıyı set gölleridir.",
            "Heyelan Set Gölleri: Heyelan sonucu bir akarsuyun önünün kapanmasıyla oluşur.Tortum, Sera, Abant, Zinav ve Sülük gölleri ile Yedigöller bu tür göllerdendir.",
            "Volkanik Set Gölleri: Volkanizma sonucu vadi önlerinin kapanmasıyla meydana gelir. Van, Erçek, Nazik, Çıldır, Haçlı ve Balık gölleriülkemizdeki volkanik set gölleridir.",
            "Baraj (Yapay) Gölleri:Yapay göllerimizin en büyükleri,Atatürk, Keban, Karakaya ve Hirfanlı barajlarının gerisinde kurulan göllerdir.",
    };
    public static String BeseriBilgiler[] = {
            "Sınırları belli bir alanda yaşayan insan sayısına nüfus adı verilir. Nüfus, bir yaşam alanı ve bir sayı ile belirtilir.",
            "Nüfus sayımının amaçlarından bazıları aşağıda verilmiştir. İnceleyiniz.\n" +
                    "Ülkenin nüfus artış hızını tespit ederek nüfus planlaması yapmak\n" +
                    "Ülke kaynaklarının nüfusa göre kullanımını planlamak\n" +
                    "Okul çağındaki öğrenci sayısını belirleyerek ihtiyaç olan okul ve derslik sayısını tespit etmek\n" +
                    "İşsiz olan insan sayısını belirlemek ve yeni iş alanlarının oluşturulmasını sağlamak",

    };
    public static String EkonomikBilgi[] = {
            "Tarım: İklimin ılıman, yeryüzü şekillerinin sade ve su kaynaklarının yeterli olduğu yerlerde tarım gelişmiştir. Bu nedenle ülkemizde tarımın yapıldığı ova ve platolarda nüfus fazladır.",
            "Sanayi ve ticaret: İklim ve yeryüzü şekillerinin uygun, ulaşımın kolay olduğu yerler sanayi tesisi kurmak için uygundur. Sanayi ve ticaretin geliştiği yerlerde iş imkânları fazla olduğu için nüfus da buralarda daha fazladır.",
            "Ulaşım: Ulaşım, beşerî faaliyetleri etkilemektedir. Yeryüzü şekillerinin düz ve sade olduğu yerlerde ulaşım daha kolay gelişebilir. Ulaşımın rahat yapıldığı alanlarda nüfus daha fazladır.",
            "Turizm: Turizmin geliştiği alanlarda turistik tesisler bulunur. Bu durum iş imkânları sağladığı için nüfus da buralarda daha yoğundur.",
            "Madencilik: Madencilik faaliyetlerinin yapıldığı yerlerde iş imkânlarının fazla olması nüfusun da fazla olmasını sağlamaktadır",
            "Ülkemizde tarım, iklim ve yeryüzü şekillerinin uygun olduğu kıyı kesimlerde daha yoğun yapılmaktadır. Bu nedenle Çukurova, Bafra ve Çarşamba Ovaları nüfusun fazla olduğu yerler arasındadır. İç kesimlerde yer alan Bursa ve Konya ovaları ile Gaziantep-Şanlıurfa platosu da tarım faaliyetleri sebebiyle fazla nüfusludur. Erzurum-Kars platosunda, toprak verimli olmasına rağmen iklim ve yeryüzü şekilleri yerleşime uygun değildir. Bu nedenle burada nüfus azdır.",
            "Ülkemizde nüfusun fazla olduğu yerlerin çevresinde özellikle kümes ve büyükbaş besi hayvancılığı yapılmaktadır. İstanbul, İzmir, Ankara, Bursa vb. şehirler buna örnektir. Bu yerlerde kümes ve büyükbaş besi hayvancılığı sayesinde insanların bir kısmı iş imkânlarına kavuşarak geçimlerini sağlarlar.",
            "Turizm faaliyetlerinin geliştiği yerlerde iş olanaklarının fazla olması buraları cazip hâle getirir ve bu yerlerin nüfusunu artırır. Örneğin deniz turizminin geliştiği Antalya, Muğla, İzmir, Aydın, Mersin gibi illerimizin nüfusu yaz aylarında daha fazla olmaktadır. Özellikle yaz aylarında ülkemizin çeşitli yerlerinden insanlar yaz turizminin geliştiği yerlere giderek çalışmaktadır. Aynı şekilde kış turizmi merkezlerinden Uludağ, Palandöken ve Kartalkaya’da da kış aylarında nüfus artmaktadır. Ülkemiz tarihî eser, tarihî mekân ve doğal güzellik bakımından da oldukça zengindir. Bu yerleri görmek amacıyla ülkemize çok sayıda turist gelmektedir. Böylece bu yerlerin çevresinde iş olanakları ve nüfus artmaktadır.",
            "Ülkemizde sanayinin geliştiği şehirler nüfusun fazla olduğu yerlerdir. Örneğin otomotiv, gıda, deri ve kimya sanayisinin geliştiği İstanbul; otomotiv ve mobilya sanayisinin geliştiği Bursa; petrol sanayisinin geliştiği Kocaeli, Batman ve Kırıkkale; mobilya sanayisinin geliştiği Kayseri bu şehirlerdendir. İş olanaklarının fazla olmasından dolayı bu şehirler dışarıdan göç almakta ve buraların nüfusu daha da artmaktadır. Sanayinin yeterince gelişmediği Hakkari, Tunceli, Ardahan, Şırnak, Bayburt gibi şehirlerimizde ise nüfus azdır. Ülkemizde genellikle bu şehirlerden sanayinin geliştiği şehirlere doğru göç hareketi yaşanmaktadır. Ayrıca madenlerin bulunduğu ve çıkarılıp işlendiği yerlerde de iş olanakları daha fazladır. Zonguldak’ta taş kömürünün, Batman’da petrolün, Soma’da (Manisa) linyit kömürünün, Divriği’de (Sivas) demirin çıkarılması bu şehirlerdeki nüfusun artmasında etkili olmuştur.",
            "Ülkemiz yer üstü su kaynakları bakımından zengindir. Su kaynakları tarım alanlarının sulanması, insanların içme suyu ihtiyacının giderilmesi, enerji üretimi vb. amaçlarla kullanılır. Bu sebeple ülkemizde su kaynaklarının bulunduğu alanların çevresinde nüfus fazlalaşır. Denizler turizm, balıkçılık ve ulaşım gibi amaçlarla kullanıldığından ülkemizin kıyı kesimlerinde nüfus fazladır.",
    };
    public static String CografiBolgeleriBilgi[] = {
            "Karadeniz Bölgesi\n" +
                    "İsmini Karadeniz'den alan, Sakarya Ovasından başlayan ve Gürcistan sınırına kadar uzanan bir bölgedir. \n" +
                    "Türkiye'nin en büyük 3. bölgesidir.  \n" +
                    "8,350 kilometre kıyı şeridine sahiptir.\n" +
                    "Dağlar, kıyıya paralel olarak uzanır. \n" +
                    "3 ada bulunmaktadır\n" +
                    "Ulaşım zordur, geçitler sayesinde sağlanır. \n" +
                    "Kıyılardan iç kısma doğru gidildikçe nüfus yoğunluğu azalır.",
            "Karadeniz Bölgesinin İklimi\n" +
                    "Türkiye'nin yıllık ve güngül sıcaklık farkının en az olduğu bölgedir. \n" +
                    "Doğal iklim örtüsü ormanlardır.\n" +
                    "Her mevsim yağış alır. \n" +
                    "Orta Karadeniz kısmında: En fazla yağış kış mevsiminde gerçekleşir. Yıllık yağış miktarı 1000 - 1200 mm civarıdır. \n" +
                    "Doğu Karadeniz kısmında: En fazla yağış sonbahar mevsiminde gerçekleşir. Yıllık ortalama yağış miktarı 2000 - 2500 mm olarak bilinir. \n" +
                    "Batı Karadeniz kısmı: En fazla yağışı sonbaharda alır. Yağış ortalaması yıllık 1000 - 1500 mm arasında değişiklik göstermektedir. ",
            "Akdeniz Bölgesi\n" +
                    "Adını güneyindeki denizden alır. Anadolu'nun güneyinde Akdeniz kıyısı boyunca uzanır.\n" +
                    "1542 kilometre kıyı şeridine sahiptir. \n" +
                    "Büyük bir kısmı Toros Dağları ve yüksek platolardan oluşur. Birçok kısmı engebeli ve dağlıktır. \n" +
                    "Ulaşımı kolaydır.\n" +
                    "32 ada bulunmaktadır.\n" +
                    "Sahil kuşağı, nüfusun en yoğun olduğu yerlerdir.",
            "Akdeniz Bölgesi'nin İklimi\n" +
                    "Görülen iklim tipi akdeniz iklimidir.\n" +
                    "Yazlar kurak ve sıcak, kışlar yağışlı ve ılık geçer. \n" +
                    "En sıcak ayların sıcaklık ortalaması 28° - 30° arası, en soğuk ayların ortalaması ise 8° - 10° arasıdır. Yıllık sıcaklık ortalaması 18°dir\n" +
                    "En fazla kış aylarında yağış alır. Kış nevsiminde görülen yağışlar cephesel kökenlidir. Yıllık yağış 600 - 1000 mm arasında farklılık göstermektedir. \n" +
                    "Bitki örtüsü makidir.",
            "Ege Bölgesi \n" +
                    "İsmini Ege Denizi'nden alır.\n" +
                    "Ege ve İç Batı Anadolu olmak üzere iki bölümden oluşur.\n" +
                    "Kuzeyde Marmara, güneyde Akdeniz bölgeleriyle, doğuda İç Anadolu, batıda Ege Denizi'yle çevrilidir. \n" +
                    "Türkiye'nin en uzun kıyı şeridine sahiptir. \n" +
                    "3.000'e yakın ada ve adacık bulunmaktadır.\n" +
                    "Kolaylıkla ulaşım sağlanabilir.",
            "Ege Bölgesi'nin İklimi \n" +
                    "Akdeniz iklimi etkisindedir.\n" +
                    "Yazlar sıcak ve kurak, kışlar ılık ve yağışlı geçer. \n" +
                    "Bu bölgenin en soğuk ayı Ocak, en sıcak ayı Temmuz olarak bilinir. \n" +
                    "Yıllık yağış oranı yaklaşık 74 mm civarıdır.\n" +
                    "Bitki örtüsü makidir.",
            "İç Anadolu Bölgesi\n" +
                    "Gelişmiş bölgelerden biridir. \n" +
                    "Konumundan dolayı Orta Anadolu ismni almıştır\n" +
                    "Bölgenin yüzölçümü 151.000 km² olarak bilinir ve Türkiyenin %21'ini kaplar.\n" +
                    "13 şehre ev sahipliği yapar. \n" +
                    "Dağlık bölgede olduğu için ulaşımın zorluğu vardır.",
            "İç Anadolu Bölgesi'nin İklimi\n" +
                    "Ortalama yükselti 1000 metredir.\n" +
                    "Bazı bölgelerde ovalar ve platolar oldukça fazladır. \n" +
                    "Karasal iklim tipine sahiptir.\n" +
                    "En soğuk ay Ocak, sıcaklık 11°. En sıcak ay Temmuz'dur.\n" +
                    "Ortalama yağış miktarı 413 mm'dir. \n" +
                    "En çok yağış İlkbahar, en az yağış Yaz mevsiminde olur. ",
            "Marmara Bölgesi\n" +
                    "Marmara Bögesi'nin kuzey Ege'yi içine alır ve güney kesimine uzanır. \n" +
                    "Köprü sayesinde, Avrupa ve Asya'yı birbirine bağlar.\n" +
                    "Yüzölçümü yaklaşık 67.000 kilometredir. Türkiyenin %8.5 ini kaplar.\n" +
                    "Marmara Denizi ise yaklaşık 11.000 km² olarak hesaplanmıştır.\n" +
                    "24 milyon nüfusu vardır.\n" +
                    "Ticaret bakımından çok gelişmiştir. \n" +
                    "21 ada barındırır.\n" +
                    "927 km kıyı şeridi vardır.",
            "Marmara Bölgesi'nin İklimi \n" +
                    "Marmara, Karasal, Karadeniz ve Akdeniz iklim özelliklerine sahiptir.\n" +
                    "Bitki örtüsü bozkırdır. \n" +
                    "Yıllık yağış ortalaması 190 mm'dir \n" +
                    "Ortalama sıcaklık 22°'dir.",
            "Doğu Anadolu Bölgesi\n" +
                    "Birinci Coğrafya Kongresinde, doğuda yer alma nedeniyle bu isim verilmiştir.\n" +
                    "Türkiye'nin en büyük bölgesidir.\n" +
                    "Türkiye'nin nüfusu en az olan bölgesidir.\n" +
                    "Yüzölçümü 164.000 kilometre'dir\n" +
                    "Türkiye'nin %21'ini kaplar.\n" +
                    "5.9 milyon nüfusa sahiptir.\n" +
                    "13 tane dağa ev sahipliği yapmaktadır.",
            "Doğu Anadolu Bölgesi'nin İklimi\n" +
                    "Karasal iklime sahiptir.\n" +
                    "Yükseltisi yüksek yerlerde, ormanlar görülebilir. \n" +
                    "Yazlar serin, kışlar soğuk geçer. Kışın, çoğunlukla kar yağar. \n" +
                    "Türkiye'nin, en dağlık bölgesidir.\n" +
                    "Yıllık ortalama sıcaklık 10° civarındadır. \n" +
                    "Yağışlar, ilkbahar ve kış aylarında daha fazla görülür. \n" +
                    "Yıllık 580 mm yağış alır. ",
            "Güneydoğu Anadolu Bölgesi\n" +
                    "Torosların güneyinden, Suriye sınırına kadar uzanır.\n" +
                    "Türkiye'nin en düzlük bölgelerindendir.\n" +
                    "Nüfusu 8.8 milyondur.",
            "Güneydoğu Anadolu Bölgesi'nin İklimi\n" +
                    "Bitki örtüsü bozkırdır. \n" +
                    "Ormanlık alan azdır. \n" +
                    "Yıllık sıcaklık ortalaması 16° olarak bilinir.\n" +
                    "Ortalama yıllık yağışı 600 mm'dir.",
    };
    public static String DogalAfetler[] = {
            "Afet Nedir?\n" +
                    "En geniş anlamıyla afet insanlara zarar veren olaylardır. Doğal afet ise can ve mal kaybına yol açan doğal olaylardır. Bu doğal olayların oluşumunda insanların da etkisi olabilmektedir. Bu tür afetlere beşeri afet diyoruz. Bunlara örnek olarak, kazalar, kontrol edilmeyen nükleer etkinlikler, terör eylemleri, hava, su kirliliği, erozyon, heyelan, yangınlar, küresel ısınma verilebilir. insanların yaşamadığı alanlarda görülen olaylar can ve mal kaybına neden olmadığından afet kriterine girmemektedir.",
            "Afetlerin Genel Özellikleri\n" +
                    "– Oluşumları doğa olayları ile ilişkilidir.\n" +
                    "– Can, mal ve doğal kaynak kaybına yol açarlar.\n" +
                    "– Kısa zamanda (aniden) meydana gelmesi.\n" +
                    "– Başladıktan sonra insanlar tarafından engellenememesidir.\n" +
                    "– Bir doğal afet başka bir doğal afetin oluşmasına neden olabilir.",
            "Oluşum kökenlerine göre doğal afetleri üçe ayırabiliriz.\n" +
                    "\n" +
                    "Yer kökenli(jeolojik) doğal afetler (deprem, tusunami, volkan püskürmesi vb.)\n" +
                    "Atmosfer kökenli(meteorolojik) doğal afetler (fırtına, sel, don, dolu, aşırı kar, çığ, yıldırım düşmesi, iklim değişikliği vb.)\n" +
                    "Biyolojik kökenli doğal afetler (salgın hastalıklar, böcek istilası vb.)\n" +
                    "Afetler doğurduğu doğrudan sonuçlar  can kaybına, konut hasarına, toprak kaybına, tarımsal ürün kaybına, ulaşım yapılarının tahribine, haberleşmenin kesilmesine neden olur.\n" +
                    "\n" +
                    "Afetlerin doğurduğu dolaylı sonuçlar işsizliğe,  psikolojik etkiye (panik, korku),salgın hastalığa neden olur.",
    };
    public static String Ulasım[] = {
            "Küresel Ulaşım Hatları\n" +
                    "İlk çağlarda insanlar hayvan sırtında, tekerleğin icadından sonra ise eski tip arabalarla ve kervanlarla kara yolu üzerinden ticaret yapmaktaydı. Daha sonra denizcilikteki gelişmeler, yelkenli gemiler, pusulanın keşfi ile deniz ticareti gelişti. Yeni yollar keşfedildi. Kıtaların keşfinden sonra en büyük sıçrama Sanayi Devrimi ile ulaşım alanında da kendini gösterdi. Buharlı gemiler, buharlı trenler ve sonrası taşımacılıkta büyük bir devrim, otomobilin icadı, dıştan ve içten yanmalı motorlar ve kara yolu ticaretinde büyük sıçrama. Son yüzyılda hava yollarındaki gelişmelerle ulaşım ve iletişim zirveye ulaştı. Artık bir ulaşım hattının farklı avantajları ve dezavantajları bulunuyor.\n" +
                    "\n" +
                    "Sanayi Devrimi’yle birlikte yük ve yolcu taşımacılığında en yoğun kullanılan demir yolları oldu. 1990’lı yıllarda sanayinin yaygınlaşması sonucu ulaşımda demir yollarının tekeli (ağırlığı) kırılarak kara yolu ulaşım ve ticareti hızla artmıştır. Günümüzde ise kıtalar arasında yolcu taşımada hava yolları, ağır yüklerin kıtalar arasında taşınmasında deniz yolları ön plana çıkmıştır.",
            "Kara Yolu Ulaşımı\n" +
                    "Dünya’nın en eski ulaşım şeklidir. İlk yollar Lidya Dönemi’nde Kral Yolu (Ege’de Sard antik kentine kadar ulaşıyordu.) ile başladı. Tekerleğin icadı  ara ulaşımında hayvan gücüyle yük taşımaya yeni boyut kazandırdı",
            "Roma yolları Orta Çağ’daki “İpek Yolu” önemli kara yollarının örnekleridir. Sanayi Devrimi ile hızla gelişen deniz yolları ve sonrasında demir yollarının gelişmesi kara yollarını önemli oranda etkiledi. Ancak otomobilin icadı ile kara yolları tekrar önem kazandı. Özellikle yolcu taşımacılığında liderliği kaptı.",
            "Günümüzde insanlar en çok kara yollarını kullanıyor. Kara yollarının uzunluğu, kalitesi, kilometre kareye düşen kara yolu uzunluğu ülkelerin gelişmişlik düzeylerini belirlemede ölçü olarak kullanılıyor. ",
            "Kara yolu tek seferde az yük ve yolcu taşıdığından demir yolu ve deniz yoluna göre pahalıdır.\n" +
                    "Yol yapım masraflarının ve bakımlarının fazla olması ile dezavantajlıdır.\n" +
                    "Tek bir hatta bağlı olmadığından demir yolu ulaşımına göre avantajlıdır. En yaygın ulaşım şeklidir.\n" +
                    "Deniz ve demir yollarını bağladığı için önemlidir.\n" +
                    "ABD yol uzunluğunda ilk sırada iken km2‘ye düşen yol uzunluğunda Japonya ilk sıradadır. Ayrıca Batı Avrupa ve Orta Avrupa (Fransa, İngiltere, Almanya)’da yoğunluk fazladır.\n" +
                    "Güney Asya’da Çin, Pakistan’ın doğusu, Güney Hindistan yoğun kara yolu hattına sahiptir.\n" +
                    "Asya’da önemli kavşak noktası Asya ile Avrupa’dan gelen yolların düğümlendiği yer Türkiye’dir.\n" +
                    "Güney Amerika’da Amazon Havzası ve And Dağları’nın yüksek yerleri hariç kara yolu gelişme göstermiştir.\n",
            "Demir Yolu Ulaşımı\n" +
                    "\n" +
                    "\n" +
                    "Lokomotifin hareketi (S. Trewitch ile başladı) taş kömürünün kullanımıyla yani buhar gücü sayesinde demir yolu ulaşımını başlattı. İlk olarak İngiltere’de 1830 yılında başlayan bu ulaşım zamanla hızla gelişti. 1900’lü yılların başında hem yolcu hem de yük taşımacılığında altın çağını yaşadı. 1950’Ierden sonra kara yolları ve hava yollarının gelişmesiyle yolcu taşımacılığındaki önemini büyük ölçüde kaybetti. Kıta Avrupası ve ABD’de demir yollarının hızla yaygınlaşması özellikle ağır yüklerin taşımasındaki rolü kömür, demir — çelik bölgelerinin yani sanayi bölgelerinin faaliyetlerini arttırdı.",
            "Hava Yolu Ulaşımı\n" +
                    "Ulaşım sistemleri içinde yeni olan hava yolları özellikle II. Dünya Savaşı’ndan sonra gelişti. 1900’Iü yılların başından o vakte kadar daha çok askeri amaçlı kullanıldı. Tüm taşıma sistemleri içinde en hızlı olanı hava yoludur. Ancak taşıma maliyeti en yüksek olandır. Bu nedenle daha çok yükte hafif olup değeri yüksek ürünler hava yolu ile taşınmaktadır. En fazla da insan taşınır.",
            "Hava Yolu Taşımacılığının Özellikleri Nelerdir?\n" +
                    "\n" +
                    "Hava yolunun tercih edilmesinde hızlı olması, zaman tasarrufu yanında kaza riskinin daha düşük olması etkilidir.\n" +
                    "Hava yolu taşıma maliyeti en yüksek olan ulaşımdır. Bu nedenle yükte hafif, değeri fazla ürünler taşınır. Daha çok yolcu taşımacılığı için kullanılır.\n" +
                    "Kıymetli evrak, posta, hediyelik eşya, değerli taş ve ziynet eşyaları, özel dokumalar, çiçek ve özel kargo ürünleri hava yolu ile taşınır.\n" +
                    "Hava yolu taşımacılığı gelişmiş ülkelerde daha yaygındır. En yoğun bölgeler Batı Avrupa, ABD’nin doğusu – batısı, Japonya’dır.",
    };
    public static String Yerleşme[] = {
            "YERLEŞME\n" +
                    "Kırsal Yerleşme\n" +
                    "\n" +
                    "Büyüklüğüne göre,\n" +
                    "\n" +
                    "kasaba, köy, köyaltı yerleşmeleri (mezra, oba, ağıl, mahalle, kom, divan, dam, yayla, çiftlik, bağ evi, dalyan, yazlık site)\n" +
                    "Sürekliliğine göre,\n" +
                    "\n" +
                    "Kalıcı yerleşmeler (mahalle, mezra, divan, çiftlik, dalyan)\n" +
                    "Geçici yerleşmeler (bağ evi, yayla, dam, kom, oba, yazlık site)\n" +
                    "Kurulduğu yere göre,\n" +
                    "\n" +
                    "ova, dağ, vadi, akarsu boyu, orman içi, deniz kıyısı\n" +
                    "Dokusuna göre,\n" +
                    "\n" +
                    "Toplu yerleşmeler, dağınık yerleşmeler\n" +
                    "Kentsel Yerleşme\n" +
                    "\n" +
                    "Nüfusuna göre,\n" +
                    "\n" +
                    "Küçük kent, orta büyüklükte kent, büyük kent, metropolitan kent\n" +
                    "Fonksiyonlarına göre,\n" +
                    "\n" +
                    "Sanayi şehri, tuzim şehri, tarım şehri, ticaret şehri, maden şehri, liman şehri, idari şehir, dini şehir, teknoloji şehri",
    };
    public static String Goc[] = {
            "Göç; nüfusun, çeşitli nedenlerle bir yerden başka bir yere olan hareketidir. İç göçler ve dış göçler olmak üzere ikiye ayrılır.",
            "ç Göçler\n" +
                    "Ülke içerisinde, nüfusun yer değiştirmesine iç göç denir. İç göçlerle bir ülkenin toplam nüfusunda değişme olmaz. Sadece, bölgelerin ve illerin nüfusunda artma ya da azalma meydana gelir.",
            " Kalıcı Göçler\n" +
                    "Bu göçler genellikle, kırsal kesinden kente veya küçük şehirden büyükşehire olan göçlerdir. Kırsal alandan kentlere daha çok göç olmaktadır.",
            "Kalıcı iç göçün nedenleri\n" +
                    "\n" +
                    "– Kırsal alanlardaki hızlı nüfus artışı,\n" +
                    "– Miras yoluyla tarım alanlarının daralması ve ailelerin geçimini karşılamaması,\n" +
                    "– Tarım alanlarının yetersiz gelmesi ve erozyonun artmasıyla toprağın verimsiz hale gelmesi,\n" +
                    "– Tarımda makineleşmenin artması ve buna bağlı olarak tarımsal iş gücünün azalması,\n" +
                    "– Kırsal kesimde iş imkanlarının sınırlı olması,\n" +
                    "– Ekonomik istikrarsızlık ve sosyal problemler,\n" +
                    "– Eğitim ve sağlık hizmetlerinin yetersizliği,\n" +
                    "– iklim ve yer şekillerinin olumsuz etkileri,\n" +
                    "– Kentlerde sanayinin gelişmiş olmasından dolayı iş imkanlarının fazlalığı,\n" +
                    "– Kentlerde eğitim ve sağlık hizmetlerinin yaygınlığıdır.",
            "Kalıcı iç göçün sonuçları\n" +
                    "– Ülke genelinde nüfusun dağılışında dengesizlik görülür.\n" +
                    "– Yatırımlar dengesiz dağılır.\n" +
                    "– Kırsal kesim yatırımlarında verimsizlik meydana gelir.\n" +
                    "– Düzensiz kentleşme görülür.\n" +
                    "– Sanayi tesisleri kent içinde kalır. Kentlerde konut sıkıntısı çekilir. Kent nüfusunda aşırı artış meydana gelir.\n" +
                    "– Alt yapı hizmetlerinde (yol, su, elektrik) yetersizlik görülür.\n" +
                    "– Kentlerde işsiz insanların oranı artar.",
            "İç göçü önlemek için\n" +
                    "– Tarımda sulama imkânlarını arttırmak,\n" +
                    "– Intansif tarım metodunu geliştirmek,\n" +
                    "– Besi ve ahır hayvancılığını geliştirmek ve yaygınlaştırmak,\n" +
                    "– Kırsal kesimde eğitim ve sağlık hizmetlerini yaygınlaştırmak,\n" +
                    "– Tarım ve hayvancılığa bağlı sanayi kollarını kırsal alanlara yönlendirmek,\n" +
                    "– Kırsal kesimde küçük sanayi kollarını geliştirmek, vb. gereklidir.",
            "Mevsimlik İç Göçler\n" +
                    "Kırsal kesimdeki bazı ailelerin büyük şehirlere, tarımın yoğun olarak yapıldığı yerlere, yaz turizminin geliştiği yerlere bir müddet çalışmak üzere göç etmeleri ile gerçekleşir.\n" +
                    "\n" +
                    "Yaylaya çıkma olayı da mevsimlik göçler içerisinde yer alır. Mevsimlik göçlerle Adana, Mersin, Hatay, Aydın, Muğla, Antalya gibi merkezlerde, yaz ile kış mevsimleri arasındaki nüfus miktarlarında önemli değişmeler olmaktadır.\n" +
                    "\n" +
                    "– Kırsal kesimden göç edenlerin özellikleri\n" +
                    "– Genellikle genç nüfus göç etmektedir.\n" +
                    "– Erkek nüfus, kadından daha fazla göç etmektedir.\n" +
                    "– Göç edenlerin çoğu sanayi ve hizmet sektöründe çalışmaktadır.\n" +
                    "– Göç sonucunda kentlerde hızlı nüfus artışı meydana gelmiştir.\n" +
                    "– Sanayileşme göçü arttırmaktadır.\n" +
                    "– Kentleşme hızı sanayileşme hızından daha yüksektir.\n" +
                    "– Bölgelerin toplam nüfusu ve nüfus yoğunluğu göçlerle hızla değişmektedir.",
            "ış Göçler\n" +
                    "Bir ülkeden diğer bir ülkeye yapılan göçlere dış göç denir. Dış göçlerin başlıca nedenleri:\n" +
                    "\n" +
                    "– Ekonomik nedenlerle çalışmaya gidilmesi\n" +
                    "– Tabii afetler\n" +
                    "– Savaşlar\n" +
                    "– Etnik nedenler\n" +
                    "– Sınırların değişmesi\n" +
                    "– Uluslararası anlaşmalarla sağlanan nüfus değişimi",
            "Dış göçlerin sonuçları\n" +
                    "\n" +
                    "– Göç eden ülkede nüfus artar, göç veren ülkede ise azalır.\n" +
                    "– Ülkeler arasında ekonomik ilişkiler gelişir.\n" +
                    "– Ülkeler arası kültürel ilişkiler gelişir.",
            "Dış göçler ve Türkiye\n" +
                    "Ülkemize 1923 – 1989 yılları arasında çoğu Balkan ülkelerinden olmak üzere 2,2 milyon göç olmuştur. Bu sayı nüfusumuzun % 5’ini oluşturur.\n" +
                    "\n" +
                    "1950’den sonra, başta Almanya olmak üzere yurt dışına işçi gitmeye başlamıştır. Bugün Fransa, Belçika, Hollanda, İngiltere, İsveç, ABD, Avustralya, Libya, S. Arabistan, Kuveyt ve Orta Asya ülkelerinde işçilerimiz bulunmaktadır. Yurt dışındaki nüfusumuz 4 milyonu geçmiştir.",
            "Türkiye’den yurt dışına göç sonucunda;\n" +
                    "– Ülkemize giren işçi dövizi artmıştır.\n" +
                    "– Ülke turizminin gelişmesini sağlamıştır.\n" +
                    "– Türk ticaretinin yaklaşık % 20 sine kaynak oluşturmuştur.\n" +
                    "– Artan nüfusun işsizlik sorununa kısmen çözüm bulunmuştur.",
    };
    public static String Nufus[] = {
            "Nüfus; Sınırları belirli bir alanda, belirli zaman diliminde yaşayan insan sayısına denir.",
            "Nüfus Artış Hızı\n" +
                    "Doğum oranı ile ölüm oranı arasındaki farktır. Bu fark, doğal nüfus artış hızını verir. Göçler göz önüne alındığında ise reel nüfus artış hızı belirlenmiş olur.",
            "Nüfus Artış Hızını Artıran Nedenler\n" +
                    "\n" +
                    "– Doğum oranının ölüm oranından yüksek olması\n" +
                    "– Eğitim seviyesinin düşük olması\n" +
                    "– Bebek ölümlerinin az olması\n" +
                    "– Sağlık hizmetlerinin iyileşmesi\n" +
                    "– Ortalama yaşam süresinin artması\n" +
                    "– Gelnek ve görenekler\n" +
                    "– Dışarıdan yapılan göçler\n" +
                    "– Dini inanışlar vb.",
            "Nüfus Artış Hızını Azaltan Nedenler\n" +
                    "\n" +
                    "– Aile planlamaları\n" +
                    "– Bebek ölümlerinin fazla olması\n" +
                    "– Eğitim seviyesinin yükselmesi\n" +
                    "– Dışarıya göç vermesi\n" +
                    "– Doğal afetler ve salgın hastalıklar\n" +
                    "– Savaşlar ve etnik baskılar\n" +
                    "– Sanayileşme ve kadının iş hayatına atılması\n" +
                    "– İnsan emeğine olan ihtiyacın azalması",
            "Nüfus Artış Hızının Yüksek Olmasından Kaynaklanan Olumsuz Sonuçlar\n" +
                    "\n" +
                    "– Kişi başına düşen milli gelir azalır.\n" +
                    "– İşsizlik artar.\n" +
                    "– Beslenme ve sağlık hizmetleri aksar.\n" +
                    "– Köyden kente göç artar.\n" +
                    "– Çarpık kentleşme artar.\n" +
                    "– Doğal kaynakların tüketimi artar.\n" +
                    "– Yaşam standardı düşer.\n" +
                    "– İhracat azalır, ithalat artar.\n" +
                    "– Çevre kirliliği artar.\n" +
                    "– Kalkınma hızı yavaşlar.",
            "Nüfus Artış Hızının Yüksek Olmasından Kaynaklanan Olumlu Sonuçlar\n" +
                    "\n" +
                    "– İhtiyacın daha fazla olmasıyla birlikte üretim artar.\n" +
                    "– Ülkede insan sayısının artmasıyla birlikte daha fazla vergi toplanır.\n" +
                    "– Nüfus artışının yaşanması yeni endüstriyel alanların oluşmasını sağlar.\n" +
                    "– İhracattaki rekabet nüfus artışıyla kolaylaşır.\n" +
                    "– Mal ve hizmetlere olan rağbet artar.\n" +
                    "– Ülkenin askeri gücüne katkıda bulunur.\n" +
                    "– Üretimdeki maliyet azalmaya başlar.\n" +
                    "– Askeri savunma alanında kısa sürede güçlü ordular kurulur.\n" +
                    "– Ülke nüfusu dinamik bir yapı kazanır.",
            "Gelişmiş Ülkelerde Gelişmemiş Ülkelere Göre\n" +
                    "\n" +
                    "– Doğum oranı düşüktür.\n" +
                    "– Nüfus artış hızı azdır.\n" +
                    "– Kalkınma hızı fazladır.\n" +
                    "– Yaşam standardı yüksektir.\n" +
                    "– Kişi başına düşen milli gelir yüksektir.\n" +
                    "– Ortalama yaşam süresi uzundur.\n" +
                    "– Eğitim düzeyi yüksektir.\n" +
                    "– Bebek ölüm oranı düşüktür.\n" +
                    "– Yaşlı nüfus oranı fazladır.\n" +
                    "– Kentli nüfus oranı yüksektir.\n" +
                    "– İşsizlik oranı düşüktür.\n" +
                    "– Enerji tüketimi fazladır.",
            "ürkiye’de Nüfus Artışı ve Nüfus Sayımları\n" +
                    "Cumhuriyet Döneminin ilk nüfus sayımı 1927  yılında yapılmıştır ikinci 1935’te  yapılmış ve 1990 yılına kadar her 5 yılda bir sayım gerçekleşmiştir. 2000 yılındaki bilgisayar ortamında  yapılmıştır.\n" +
                    "\n" +
                    "Genel olarak bakıldığında ilk sayımdan 1985 yılına kadar göç, kentleşme sanayileşme, aile planlaması, eğitim seviyesinin yükselmesi ve kadının iş hayatına daha çok girmesinden dolayı ülke nüfusunun artış hızı azalmıştır.",
            "Aritmetik Nüfus Yoğunluğu\n" +
                    "Bir ülke veya bir bölgedeki toplam nüfusun, o ülkenin  ya da bölgenin yüz ölçümüne bölünmesiyle elde edilir.\n" +
                    "\n" +
                    "Aritmetik Nüfus Yoğunluğu= Toplam Nüfus/ Yüz Ölçümü",
            "Türkiye’de aritmetik nüfus yoğunluğunun en fazla olduğu bölge Marmara Bölgesidir nedeni; Marmara’nın yüz ölçümünün küçük olması toplam nüfusun çok fazla olmasıdır." +
                    "Türkiye’de aritmetik nüfus yoğunluğunun en az olduğu bölge Doğu Anadolu Bölgesidir. Nedeni; D. Anadolu’nun yüz ölçümünün fazla, toplam nüfusunun ise az olmasıdır." +
                    "– Doğal faktörler (Yeryüzü şekilleri, iklim vb..)\n" +
                    "– Beşeri ve ekonomik faktörler (Sanayi, ticaret, turizm, tarım vb..)",
            "arımsal Nüfus Yoğunluğu\n" +
                    "Tarımla uğraşan nüfusun, tarım alanlarına bölünmesiyle bulunan kavrama tarımsal nüfus yoğunluğu denir. Tarımsal nüfus yoğunluğu ile arazinin engebeli olması arasında doğru orantı kurulabilir. Engebe artarsa tarımsal nüfus yoğunluğu da artar.\n" +
                    "\n" +
                    "Tarımsal Nüfus Yoğunlu= Tarımla Uğraşan Nüfus / Tarım Alanı",
            "Türkiye’de tarımsal nüfus yoğunluğunun en fazla olduğu bölge\n" +
                    "Engebeli arazilerde tarımsal nüfus yoğunluğu fazla olur bunun nedeni ise engebeli alanlarda ;\n" +
                    "\n" +
                    "– Tarım alanı dar olur.\n" +
                    "– Diğer ekonomik faaliyetler gelişmez bu yüzden tarımla uğraşan nüfus fazla olur.\n" +
                    "– Dar tarım alanlarında tarımla uğraşan sayısı fazla olursa yoğunluk fazla olacaktır.",
            "ürkiye’de Tarımsal Nüfus Yoğunluğunun Fazla Olduğu Yerler\n" +
                    "Bu söylediklerimizden yola çıkarak Türkiye’de tarımsal nüfus yoğunluğunun fazla olduğu yerler;\n" +
                    "\n" +
                    "– Doğu Anadolu Bölgesi\n" +
                    "– Hakkâri Bölümü\n" +
                    "– Doğu Karadeniz\n" +
                    "– Batı Karadeniz\n" +
                    "– Yıldız Dağları Bölümü\n" +
                    "– Menteşe – Muğla Yöresi\n" +
                    "– Yukarı Kızılırmak Bölümü\n" +
                    "– Teke Platosu\n" +
                    "– Taşeli Platosu ‘dur.",
            "Türkiye’de tarımsal nüfus yoğunluğunun en az olduğu bölge\n" +
                    "Tarımsal nüfus yoğunluğunun az olduğu yerler ise yer şekillerinin sade tarım alanlarının geniş olduğu;\n" +
                    "\n" +
                    "– İç Anadolu Bölgesi\n" +
                    "– G. Doğu Anadolu Bölgesi\n" +
                    "– Marmara Bölgesi\n" +
                    "– Ergene Bölümü\n" +
                    "– Çukurova ‘dır.",
            "Fizyolojik Nüfus Yoğunluğu\n" +
                    "Toplam nüfusun tarım alanlarına bölünmesi ile elde edilen rakama Fizyolojik Nüfus Yoğunluğu denir.\n" +
                    "\n" +
                    "Türkiye’de fizyolojik nüfus yoğunluğunun en az olduğu bölge\n" +
                    "– İç Anadolu ve Güney Doğu Anadolu bölgelerimizdir.",
            "Türkiye’de fizyolojik nüfus yoğunluğunun en fazla olduğu bölge\n" +
                    "Tarım Alanının çok dar olması yüzünden fizyolojik nüfus yoğunluğu fazla olan yerler;\n" +
                    "\n" +
                    "– Doğu Anadolu Bölgesi\n" +
                    "– Hakkâri Bölümü\n" +
                    "– Doğu Karadeniz\n" +
                    "– Batı Karadeniz\n" +
                    "– Yıldız Dağları Bölümü\n" +
                    "– Menteşe – Muğla Yöresi\n" +
                    "– Yukarı Kızılırmak Bölümü\n" +
                    "– Teke Platosu\n" +
                    "– Taşeli Platosunda fazladır\n" +
                    "\n" +
                    "Aşırı Nüfus yüzünden fizyolojik nüfus yoğunluğu fazla olan yerler;\n" +
                    "Fizyolojik Nüfus Yoğunluğu Marmara bölgesinde en fazladır.",
            "ürkiye’de Nüfus Dağılışı ve Nüfus Dağılışını Etkileyen Faktörler\n" +
                    "Türkiye’de nüfusun dağılışını etkileyen iki faktör vardır. Bunlar;\n" +
                    "\n" +
                    "1. Doğal faktörler\n" +
                    "2. Beşeri faktörler.\n" +
                    "\n" +
                    "Doğal Faktörler\n" +
                    "Fiziki faktörler, kendi arasında 3 başlık altında incelenmektedir. Bunlar;\n" +
                    "\n" +
                    "– İklim özellikleri\n" +
                    "– Yer şekilleri\n" +
                    "– Toprak özellikleri",
    };
    public static String Bitkiler[] = {
            "En kısa sürede bilgi kartları eklenecek...",
    };
    public static String Topraklar[] = {
            "Toprak, üzerinde tüm canlıların barınıp yaşadığı, insan ve hayvan beslenmesi için gerekli ürünlerin yetiştiği yaşayan canlı bir varlıktır ve yaşamın kaynağıdır. Toprak, Fiziksel, kimyasal, organik yollarla parçalanan kayaçların arasına hava, su ve canlıların girmesiyle oluşan katmandır.",
            "ONAL TOPRAKLAR\n" +
                    "Bu topraklar genellikle düz ve az eğimli yerlerde oluşmuş topraklardır. Ana kayaların, yerinde ayrışmasıyla oluşurlar. Bu yüzden yerli topraklar da denir. Topraklar oluşum özelliklerine göre taşlı, kireçli, kumlu, humuslu, milli gibi çeşitlere ayrılırlar. Bitki artıklarının zamanla ayrışmasıyla toprağa bitkisel besin maddeleri de karışır buna humus denir. Yağışın bol olduğu, bitki örtüsünün gür olduğu alanlarda görülen topraklar, bitki örtüsü bakımından zengin olduğundan toprakta humus miktarı da fazladır. Yağışın çok olduğu ekvatoral kuşakta yağışlarla toprak çok yıkandığından topraktaki humus oranı azdır. Bu bölgelerde toprak nemli olduğundan koyu renklidir. Zonal topraklarda normal toprak profiline sahiptir. A, B, C horizonları belirgindir.",
            "Laterit Topraklar\n" +
                    "Dönenceler arasındaki sıcak-nemli tropikal iklim bölgesinin toprağıdır. Rengi kiremit kırmızısıdır. Tropikal kuşakta bitki örtüsü gür olduğu hâlde aşırı yıkanma ve humusun büyük bir kısmının çok sayıdaki mikroorganizmalar tarafından tüketilmesinden dolayı bu topraklar humus bakımından fakirdir. Tarımsal verim bu topraklarda düşüktür. Bu nedenle kimyasal çözülme yeterli olduğu hâlde verimsiz topraklardır.",
            "Kırmızı Topraklar (Terra Rossa)\n" +
                    "Akdeniz iklim bölgesinde kireç taşı (kalker) üzerinde oluşan topraklardır. Bünyesinde demir oksit oranı fazla olduğundan renkleri kırmızıdır. Sulama ve gübreleme yapılırsa tarıma elverişlidir. Kaliforniya (ABD) Orta Şili, Cape Bölgesi (Güney Afrika Cumhuriyeti), Akdeniz kıyıları ve Avustralya’nın güneyinde görülür.",
            "Kahverengi Orman Toprakları\n" +
                    "Ilıman okyanus ikliminde karışık ormanların altında yer alan humuslu topraklardır. Toprağın üst kısmı, bitki kalıntılarından dolayı koyu renklidir ve humus bakımından zengindir. Aşırı yıkanma yoktur. Bu topraklar Batı Avrupa’da ve Türkiye’de Karadeniz kıyılarında yaygındır.",
            "Podzol Topraklar\n" +
                    "Soğuk nemli bölgelerin iğne yapraklı orman sahasında oluşan topraklardır. Yıkanma fazla olduğundan mineral bakımından fakirdir ve kül renginde olan topraklardır. Sibirya, Kuzey Avrupa, İskandinavya Yarımadası (İsveç, Norveç, Finlandiya) ve Kanada’da görülür.",
            "Tundra Toprakları\n" +
                    "Tundra iklim bölgesinin kışın on ay donan, yazın iki ay çözülerek bataklık hâlini alan verimsiz topraklarıdır. Üzerinde üç aylık yaz sıcaklığında yeşeren tundra denilen yosun ve otlardan oluşan bitki örtüsü vardır ve organik maddeler uzun süre çözünmeden toprakta kalır. Humus bakımından fakir ve tarıma elverişsiz topraklardır. Tundralar, kutup altı ikliminde görülen topraklardır. Kanada, İskandinav Yarımadası ve Sibirya’da geniş yer kaplarlar.",
            "Çöl Toprakları\n" +
                    "Çöllerde (yıllık toplam 200 mm’den az yağış alan yerlerde) görülen, humus bakımından fakir, az humuslu açık renkli verimsiz topraklardır. Çöllerde nem azlığı nedeniyle kimyasal çözülme yetersizdir, toprak oluşumu yeterince gerçekleşemez. Bu nedenle A horizonu yok denecek kadar incedir. Yağış azlığı ve şiddetli buharlaşma nedeniyle toprak yüzeyinde kireç ve tuz birikerek sert bir tabaka meydana getirir ve toprakta tarım yapılamaz.",
            "Kahverengi ve Kestane Renkli Bozkır Toprakları\n" +
                    "Orta kuşakta, karaların iç kısımlarında, bozkırların görüldüğü yerlerde oluşan topraklardır. Kahverengi bozkır toprakları, 250-400 mm arası yağış alan, step bitki örtüsünün görüldüğü yerlerde oluşan humusu az, tahıl tarımına ve mera oluşmasına elverişli topraklardır.\n" +
                    "\n" +
                    "Kestane rengi bozkır toprakları ise 400-600 mm arası yağış alan, step bitki örtüsüne sahip yerlerde oluşan humus oranı daha fazla ve tahıl tarımına elverişli topraklardır.",
            "ernozyom Topraklar (Kara Topraklar)\n" +
                    "Yazları yağışlı karasal iklim koşullarında yetişen yüksek boylu çayırlar altında oluşan topraklardır. Sıcaklığın düşük olması nedeniyle çayır artıkları yeterince ayrışmadan toprak üzerinde kalır. Bu yüzden toprağın üst katı, siyah renklidir.\n" +
                    "Çernozyomlar bitki besin maddeleri bakımından zengindirler. Ot verimi yüksek olduğu için buralarda, yoğun olarak büyük baş hayvancılık yapılır. Ukrayna, Rusya ve Kanada’ da; Türkiye’de ise Kuzeydoğu Anadolu’da yaygındır.",
            "Azonal Topraklar (Taşınmış Topraklar)\n" +
                    "Bulundukları yerlerden akarsu, rüzgârlar ve buzullar tarafından taşınarak çukurluk alanlarda biriktirilen topraklardır. Çeşitli yerlerden taşınıp geldiğinden bu tur topraklar verimlidir. Bu topraklarda organik kalıntı ve humus oranı yüksektir.",
            "Alüvyal Topraklar\n" +
                    "Yeryüzündeki yüksek yerler sürekli aşınmakta, aşındırılan bu materyaller uzak mesafelere taşınmaktadır. Bu materyaller iriliğine göre; çakıl, kum, mil olarak adlandırılır. Bunların hepsine birden alüvyon denir. Alüvyonların birikmesiyle oluşan topraklar alüvyal topraklardır. Alüvyonların horizonları yoktur. Alüvyal toprakların en yaygın olduğu yerler deltalardır. Vadi tabanlarının genişlediği yerlerdeki akarsu boyu ovaları da alüvyon topraklardan oluşur. Ayrıca pek çok ovanın tabanındaki verimli tarım alanları da alüvyonlarla kaplıdır. Alüvyal topraklar derin, geçirgen, kolay işlenebilen, suyun kolay temin edilebildiği topraklar olduğundan çok verimlidir. Çoğu iklim kuşağında görülebilir. Örneğin Nil deltası, Türkiye’de Çukurova alüvyal toprakların görüldüğü yerlerdendir.",
            "Lös Topraklar\n" +
                    "Çöllerde ve yarı kurak iklimlerde rüzgârların, bitki örtüsünün cılız olduğu yüzeylerden kayaçları kopararak taşıdığı ve biriktirdiği topraklardır. Mineralce zengin kolay aşındırılabilen topraklardır.",
            "Moren\n" +
                    "Kutup bölgelerinde ve kalıcı kar sınırları çevresinde buzulların getirdiği materyallerin biriktirilmesi ile oluşan topraklardır. Mineralce zengindirler fakat sıcaklık şartlarının yetersiz olmasından tarıma elverişli değildirler.",
            "Regosoller\n" +
                    "Dağ eteklerinde biriken kum boyutundaki malzemeler ile akarsuların ve volkanlardan çıkan kum boyutundaki malzemeler üzerinde gelişen verimli topraklardır. Ülkemizde Nevşehir yöresi gibi volkanik arazilerde yaygın olan bu gözenekli topraklar, patates tarımına oldukça elverişlidir.",
            "Kolüvyal Topraklar (Yamaç Döküntüleri)\n" +
                    "Dağların yamaçlarında, çözülen malzemelerin yağmur ve sel suları tarafından taşınarak dağ eteklerinde biriktirilmesi ile oluşur. Kolüvyal topraklar verimli topraklardır. Üzüm bağları başta olmak üzere tarım için elverişlidir.",
            "Litosol Topraklar (Taşlı Topraklar)\n" +
                    "Litos, taş, litosol taşlı toprak demektir. Dağların eğimli yamaçlarında aşınma devamlı olursa ince malzemeler sürekli taşındığından geriye sadece taş ve çakıl gibi iri malzemeler kalır ve bu iri malzemenin hâkim olduğu taşlı topraklara litosol denir.",
            "ntrazonal Topraklar\n" +
                    "İntrazonal topraklar, zonal topraklar arasında adacıklar hâlinde oluşan, iklimden çok çevresel özelliklere göre biçimlenen topraklardır. İntrazonallerin oluşmasında daha çok kayaçların özelliği ve topoğrafya etkili olmaktadır. Bütün katmanlar gelişmemiş olup A ve C horizonlarına sahiptir.",
            "Halomorfik Topraklar (Tuzlu Topraklar)\n" +
                    "Kurak ve yarı kurak bölgelerde görülür. Su buharlaştığında eriyik hâldeki çeşitli tuz ve karbonatlar toprağın yüzeyinde birikir. Çorak topraklar olarak bilinen bu topraklar verimsizdir. Tuzlu topraklar ve alkali topraklar olarak ikiye ayrılır.",
            "Hidromorfik Topraklar (Bataklık Toprakları )\n" +
                    "Su oranı fazla olan topraklardır. Bataklık alanlarında veya taban suyu seviyesinin (yer altı suyu yüzeyinin) yüksek olduğu ovalarda oluşan topraklardır. Toprak yapısı ve alttaki katmanlar, suyu derinlere doğru sızdırmadığı için havalandırması az olan topraklardır. Erzurum Ovası örnek verilebilir.",
            "Kalsimorfik Topraklar\n" +
                    "Yumuşak kireç taşı ve killi kireç taşı (marn) depoları üzerinde oluşan topraklardır. Kireç yönünden zengindir. Bu topraklar ikiye ayrılır.",
            " Rendzinalar: Yumuşak kireç taşları üzerinde oluşan bu topraklar, genellikle koyu renkli olup alt kısmında kireç birikimi mevcuttur.\n" +
                    "\n" +
                    "Vertisoller Topraklarb) Vertisoller: Eski göl tabanlarındaki killi ve kireçli depolar üzerinde oluşan topraklardır. Toprak killi olduğu için kurak mevsimde çatlar ve bu çatlaklara üst kısımdan sürekli toprak ve taş dökülür. Bu döküntüler, yağışlı mevsimde ise su ile doygun hâle geldiği için şişerek tekrar yukarı itilir ve âdeta yerinde döner. Verto, Latince dönmek demektir ve bu nedenle bu topraklara, dönen toprak anlamına gelen “vertisol” ismi verilmiştir. Ayrıca Karakepir topraklar veya Taş Doğuran toprak olarak da adlandırılır. Trakya’da yaygın olup ayçiçeği üretimine elverişlidir.",
    };
    public static String SuKay[] = {
            "Dünya’daki su kaynaklarını okyanuslar, denizler, göller, akarsular, yer altı suları ile buzullar oluştur. Yeryüzündeki sular sürekli bir döngü içerisindedir.\n" +
                    "\n" +
                    "Dünya’daki su kaynakları dengeli bir dağılış göstermez.Yağışların az buharlaşmanın şiddetli olduğu yerlerde su kaynakları azalırken; yağışların fazla, buharlaşmanın az olduğu yerlerde ise su kaynakları artış gösterir.",
            "Yer yüzünde En Fazla Tatlı Suya Sahip Alanlar\n" +
                    "– Yeryüzündeki tatlı suların %87’sini göller oluşturur.\n" +
                    "– Bir gölün suları acı, tatlı, sodalı ya da tuzlu olabilir. Bunun nedenleri;\n" +
                    "•Gölün gideğeninin olup olmamasıdır.\n" +
                    "• Gölün bulunduğu arazinin özelliği\n" +
                    "• Gölün bulunduğu yerdeki iklim özellikleri\n" +
                    "• Gölün derinliği\n" +
                    "• Gölün büyüklüğü\n" +
                    "– Göl bir gideğen yardımı ile fazla suyunu gölün dışına boşaltıyorsa gölün suyu tatlı olacaktır. Fakat gölün gideğeni yok ise göldeki suda devir daim gerçekleşmediği için gölün suyu acı (sodalı, tuzlu) olacaktır.",
            "Yeryüzünde en fazla tatlı suya sahip alanlar:\n" +
                    "• Kuzey Amerika’nın Kuzeyi (Kanada)\n" +
                    "• Güney Amerika’ nın Kuzeyi (Amazon Havzası)\n" +
                    "• Avrupa’nın kuzeyi ve batı kesimleri\n" +
                    "• Asya’nın güney ve güneydoğusundaki adalar (Endonezya, Malezya,Filipinler vb.)\n" +
                    "• Sibirya\n" +
                    "• Orta Afrika (Kongo Havzası)\n" +
                    "•Birleşmiş Milletler Gıda ve Tarım örgütünün verilerine göre dünyada en fazla tatlı su kaynağı Brezilya’da ve Rusya’da bulunmaktadır.",
            "Yeryüzünde En Az Tatlı Suya Sahip Alanlar\n" +
                    "– Özellikle dönenceler çevresinde yer alan çöllerde tatlı su kaynakları azdır.\n" +
                    "– Büyük Sahra çölü (Kuzey Afrika)\n" +
                    "– Afrika’nın doğu ve güney kısımları (Kenya, Kalahari, Zimbabwe)\n" +
                    "– Arabistan çölleri\n" +
                    "– Pakistan\n" +
                    "– Polonya ve çevresi kişi başına tatlı su miktarının en az oluğu yerlerdir.\n" +
                    "– Dünyada kişi başına düşen tatlı su miktarının en az olduğu ülke kuveyttir.",
            "Doğal Göller\n" +
                    "Tektonik: Yerkabuğu hareketleri sonucunda oluşan göllerdir.\n" +
                    "– Hazar Denizi,Aral,Baykal,Çad,Balkaş,Nyasa,Victoria, Lut, Tuzgölleri\n" +
                    "\n" +
                    "Buzul: Sirk çukurlarının dolması ile oluşur.\n" +
                    "– Finlandiya, Norveç, Kanada ve Danimarka’da birçok Buzul sirk gölü bulunur.\n" +
                    "\n" +
                    "Karstik: Karstik Kayaçların (Jips, Dolomit, Kalker) erimesi sonucunda oluşan çukurlarda biriken sular ile oluşur.\n" +
                    "– Arnavutluk-Makedonya sınırında bulunan OHRİ gölü\n" +
                    "– Arnavutluk-Karadağ sınırındaki İŞKODRA gölü\n" +
                    "\n" +
                    "Volkanik\n" +
                    "Krater: Sönmüş volkan tepelerindeki kraterlerin sular ile birikmesi ile oluşan göllerdir.\n" +
                    "– ABD ‘deki KRATER gölü\n" +
                    "\n" +
                    "Kaldera: Kraterin patlaması veya çökmesi sonucunda oluşan geniş çukurlar içinde oluşan göllerdir.\n" +
                    "– Sumatra’da TOBA gölü\n" +
                    "– Türkiye’ de NEMRUT kalderası\n" +
                    "\n" +
                    "Maar: Yer kabuğunda sıkışan volkanik gazların patlaması ile açılan maar çukurlarına suların dolması ile oluşur.\n" +
                    "– Türkiye’de Meke Tuzlası ve Acıgöl\n" +
                    "\n" +
                    "Set Gölleri\n" +
                    "Alüvyal Set: Akarsuların yatak eğimlerinin azaldığı yerlerde taşıdıkları alüvyalları biriktirmesi sonucu oluşan göllerdir.\n" +
                    "Heyelan Set: Heyelanların akarsuların önlerini kapatması sonucu oluşan göllerdir.\n" +
                    "Kıyı Set: Bir koy ya da körfezin önünün dalgalarla taşınan kumlarla kapanması sonucunda oluşan göllerdir.\n" +
                    "Lav Set: Volkanik püskürmeler ile çıkan lavların bir vadinin önünü bir set şeklinde kapatması sonucunda oluşan göllerdir.\n" +
                    "Moren Set: Buzulların etkili olduğu, suların önünü moren setleriyle kapatmasıyla oluşan göllerdir. Buzulların etkili olduğu İskandinav ülkelerinde ve Kanada’da görülür.",
            "Yapay Göller (Barajlar)\n" +
                    "Akarsuların önlerinin insanlar tarafından kapatılması sonucu oluşan göllerdir. Yapay set gölleri (barajlar), elektrik enerjisi elde etme, içme suyu temimi, su baskınlarını önlemek, tarımda sulama amacıyla kullanılmaktadır",
            "Yer Altı Suları ve Kaynakları\n" +
                    "Yağışlar ve yer üzerindeki suların geçirimli tabakalardan yer altına inerek geçirimsiz tabakaların eğimi doğrultusunda birleşen sulara denir. İçinde yer altı suyu bulunduran tabakaya akifer denir. Suların yeraltına sızma miktarı;\n" +
                    "\n" +
                    "– Arazinin eğimine\n" +
                    "– Kayaçların gözeneklilik derecesine bağlıdır.\n" +
                    "\n" +
                    "Bol yağış alan, geçirimli arazilere sahip, eğimi az yerler yer altı suyu bakımından zengindir.  Akifer içinde biriken sular, çeşitli şekillerde yeryüzüne çıkarak kaynakları oluşturur. Kaynaklar oluştukları yerlere göre çeşitli isimler alır.",
            "Karstik Kaynaklar\n" +
                    "\n" +
                    "Kalkerli arazilerde yeraltına sızan sular yeraltında boşluklarda birikir. Bu boşluklarda biriken sular yer üzerine çıkarsa karstik kaynak diye adlandırılır. Karstik kaynaklara volküz adı da verilir.\n" +
                    "\n" +
                    "– Genellikle çok su çıkaran karstik kaynaklardır. Bazıları büyük bir akarsu oluşturacak kadar bol su çıkarabilir.\n" +
                    "– Suları soğuktur.\n" +
                    "– Bol miktarda kireç içerirler.\n" +
                    "– Genellikle içme suyu olarak kullanılmazlar (İstisnalar vardır.)\n" +
                    "– Debileri mevsimsel olarak değişir.\n" +
                    "– Türkiye’de en çok Akdeniz bölgesinde butarz karstik kaynaklara rastlanır",
            " Vadi (Yamaç) Kaynağı\n" +
                    "\n" +
                    "– Vadi yamaçlarından akışa geçen kaynaklardır.\n" +
                    "– Türkiye’de dağlık yerlerde yaygındır.\n" +
                    "– Suları soğuktur ve akımları yıl içerisinde değişir.\n" +
                    "– Kurak mevsimlerde akarsuların kurumasını önlerler.",
            "Artezyen Kaynağı\n" +
                    "\n" +
                    "– Yüzey sularının Geçirimsiz tabakalar arasında bulunan geçirimli tabakada birikmesi ve Sondaj atılarak insan tarafındanbu suyun yüzeye çıkarılması ile oluşan kaynaklara artezyen kaynak denir.\n" +
                    "– Suları tarımda sulama da ve içme suyu olarak kullanılır.\n" +
                    "– Artezyen kaynakların suları soğuktur.",
            "Fay Kaynağı\n" +
                    "\n" +
                    "– Yerin derinliklerinde bulunan yer altı kaynaklarının fay kırıklarından yüzeye çıkması ile oluşur.\n" +
                    "– Kırıklı yapının olduğu yerlerde sık rastlanır. Ör; Türkiye’de Ege\n" +
                    "– Türkiye’de fay kaynaklarına sık rastlanır.\n" +
                    "– Fay kaynaklarından elde edilen enerjiye Jeotermal enerji denir.\n" +
                    "– Suları ılık ya da sıcaktır.\n" +
                    "– Kaplıca ya da Ilıca olarak da adlandırılır.\n" +
                    "– İçlerinde bol miktarda eriyik mineral bulunur.",
            "Gayzer Kaynağı\n" +
                    "\n" +
                    "– Volkanizmanın etkili olduğu alanlarda yer altında sıcaklığın fazla olmasından dolayı, yer altı suları kaynar ve basınçlı bir şekilde sıcak su ya da buhar olarak belirli aralıklarla fışkırır. Bu şekilde oluşan kaynaklara gayzer ismi verilir.\n" +
                    "– Özellikle aktif volkanların görüldüğü yerlerde sık rastanır. Ör; Yeni Zellanda , İzlanda, İtalya vb.",
            "Denizlerden Gelen Su Kaynakları \n" +
                    "– Suları ılık veya sıcak olur.\n" +
                    "– Akımı (Debisi) fazla değişiklik göstermez.\n" +
                    "– İçlerinde bol miktarda eriyik mineral bulunur.\n" +
                    "– Su sıcaklığı çok değişmez.",
    };
    public static String YerSekilleri[] = {
            "Yerin Şekillenmesi\n" +
                    "Üzerinde yaşadığımız dünyamız gaz, katı ve sıvı kısımlara sahiptir. Dünyanın gaz kısmı yerküreyi saran atmosfer tabakası olarak adlandırılır. Atmosfer tabakası sıcaklık durumları ve gaz yoğunluklarına göre sırasıyla Ekzosfer, Termosfer, Mezosfer, Stratosfer ve Troposfer olarak ayrılır. Katı ve sıvı kısımlar ise bir bütün halinde yerküre olarak adlandırılır.",
            "Yerkürenin içyapısına ait bilgiler depremler vasıtasıyla elde edilmektedir. Bir kaynaktan çıkan deprem dalgaları yerküre içerisinde farklı türlerde ve farklı hızlarda yayılırlar. Bu farklılıkların sonucunda yerkürenin katmanları tanımlanmıştır. Bunlar yeryüzünden yerkürenin merkezine doğru sırayla kabuk(litosfer), manto ve çekirdek olarak adlandırılmıştır.",
            "Yer Kabuğu (litosfer)\n" +
                    "Üzerinde yaşadığımız katmandır. Yerkürenin en üst kısmında bulunan ve kalınlığı 70 km civarında olan kabuk tek bir parça halinde olmayıp, manto üzerinde yüzen birden çok levhadan oluşmaktadır. Bu parçalar yavaş bir şekilde sürekli hareket halindedirler ve bunlara tektonik levhalar ismi verilmiştir. Bu hareket; manto ile kabuk arasındaki yaklaşık 1000 C’lik sıcaklık farkından kaynaklanmaktadır. Hareket eden bu levhaların birbirleri ile kesiştikleri noktalara levha sınırları denir. Bu sınırlarda volkanik yanar dağ oluşumları, dalma batma zonları, sıra dağlar, okyanus ortası sırtlar meydana gelmektedir. Yerkabuğu kıtasal ve okyanusal olmak üzere ikiye ayrılır.\n" +
                    "\n" +
                    "Sial: Yer yüzüne yakın olan kısımdır. Bir diğer adı granit kabuktur.İsmini silisyum ve alüminyum elementlerinden alır. Kalınlığı okyanus tabanlarında az, kıta tabanlarında fazladır.\n" +
                    "\n" +
                    "Sima: Yer yüzünün daha alt katında olan kısımdır. Bir diğer adı bazaltik kabuk olan sima birleşiminde silisyum ve magnezyumdan oluşmaktadır. Okyanus tabanlarında kalın, kara tabanlarında incedir.",
            "Manto\n" +
                    "Manto tabakası dünyayı oluşturan tabakalardan biridir. Manto tabakası dünyanın kütlesinin büyük bir kısmını oluşturur. Nedeni dünyanın üst tabakası olan taşküre tabakası ile dünyanın çekirdeği arasındaki yapıların bütününü oluşturmasıdır.\n" +
                    "\n" +
                    "Mantonun yapısında silisyum, magnezyum, alüminyum, nikel, demir, kükürt, oksijen elementleri bulunur.\n" +
                    "\n" +
                    "Manto katmanı bu elementlerin karışımı ile oluşan kayaç yapıdaki bileşiklerden meydana gelir. Mantonun üst kesimi plastiki özelliğe sahiptir ve alt kesimleri de sıvı halde bulunur. Bu yüzden manto katmanın her daim alçalıcı-yükselici hareketler meydana gelir.Mantonun katmanları 3’e ayrılır. Bunlar;\n" +
                    "\n" +
                    "Üst manto veya astenosfer: 700 km derinliğe kadar olan litosferin altında kalan katmandır. Bu katmanda yoğunlu 3.3-4.3 gr/cm3 arasında değişir. Bu katmanın bileşiminde fazla miktarda alkali madde ve mineral içeren magma veya ergimiş malzeme yer alır.\n" +
                    "\n" +
                    "Orta manto: Üst ve Alt manto arasında bir geçiş zonu oluşturur. Manto yerkürenin toplam hacminin %80 den fazlasını meydana getirir ve yerkabuğu hareketleri (deniz dibi yayılması, kıtaların kayması, epirojenez, orojenez, derin depremler) ile volkanizma için gerekli enerjiyle iç kuvvetlerin kaynağım teşkil eder.\n" +
                    "\n" +
                    "Alt manto: 700-2900 km derinlikleri arasında uzanan kısmında ise alt manto başlar; bu kuşakta demir ve magnezyum silikatları egemen durumdadır. Bundan dolayı alt mantonun alt kısmında yoğunluk 5.5’e kadar çıkmakta ve P dalga hızı ise 13.6 km/sn’ye ulaşır.",
            "Çekirdek\n" +
                    "Yerkürenin merkezinde bulunan çekirdek nikel ve demirden oluşmaktadır. Kalınlığı 3400 km olan çekirdek iç ve dış çekirdek olmak üzere ikiye ayrılır. İç çekirdek katı haldeki nikel ve demirden oluşurken, onu çevreleyen dış çekirdek ise içindeki sülfür ve oksijen nedeniyle ergime noktası düştüğü için sıvı halde nikel ve demirden oluşmaktadır. Yerkürenin dış çekirdeği yaklaşık olarak 2260 km kalınlıktadır. Dış çekirdeğin içinde bulunan erimiş sıcak akıntılar dünyanın manyetik alanını oluşturmaktadır. İç çekirdek ise dünyanın en iç bölümünü oluşturur. Ortalama kalınlığı 1370 km’dir.",
            "Yerin Tektonik Yapısı\n" +
                    "İnsanlar uzun süre kıtaların hareketsiz ve sabit olduğunu düşünmüşler. Ancak  bilim insanlarının yaptığı çalışmalar sonucunda kıtaların başlangıçta tek parça ve daha sonra ayrılarak hareket ettiği anlaşılmıştır. Ve yapılan bazı çalışmalarda yüksek dağlık alanlarda deniz canlılarına ait fosillerin bulunması bu alanların bir zamanlar eniz olduğunu daha sonra kıvrılarak yükseldiğini kanıtlar niteliktedir.",
            " Levhalar\n" +
                    "Uzun süren çalışmalar sonucunda yer kabuğunun tek parça olmadığı anlaşılmış tıpkı yap boz parçaları gibi bir birine geçmiş parçalardan oluştuğu  anlaşılmıştır. Karalarda ve okyanus tabanlarında devam eden yer kabuğu parçalarına levha denilmektedir. Levhaların isimleri; Kuzey Amerika Levhası, Güney Amerika Levhası, Afrika Levhası, Avrasya Levhası,Pasifik Levhası, Nazca Levhası,Kokos, Karayip, Stokya, Antarktika Levhası, Arabistan Levhası, hindistan- Avusturalya Levhası ve Filipinler Levhası ‘dır.",
            "Levha Teknotiği\n" +
                    "Levha tektoniğine göre; kabuk, manto üzerinde hareket eden levhalardan oluşmaktadır. Bu levhaların birbirleri ile etkileşimde bulunduğu sınırlarda tektonik kuşaklar meydana gelmiştir.Yer küre üzerinde irili ufaklı bir çok levha bulunmakta olup, en büyük levhalar Pasifik Levhası, Avrasya Levhası, Kuzey Amerika Levhası, Güney Amerika Levhası, Hindistan-Avustralya Levhası, Antarktika Levhası ve Nazca Levhasıdır. Depremler genellikle bu levhaların birbirleriyle oluşturdukları sınırlarda meydana gelir. Mantodaki hareketlere konveksiyonel akımlar denir. Bu konveksiyonel akımlar sonucunda levhalar birbirinden uzaklaşır, birbirine çarpar ya da sıyrılır. Yer kabuğu hareketleri sunucunda gerçekleşen kıvrılma, kırılma,yükselme çökme gibi olayların tamamı teknotik hareketler olarak adlandırılır. Levhaların hareketlerin sonucunda;\n" +
                    "\n" +
                    "– Yeni okyanuslar oluşur.\n" +
                    "– Yeni kıtalar oluşur.\n" +
                    "– Sıradağlar oluşur.\n" +
                    "– Volkanik dağlar oluşur.\n" +
                    "– Volkanik adalar oluşur.\n" +
                    "– Depremler oluşur.",
            "Okyanusal – Okyanusal Uzaklaşması: Okyanuslarda yer alan levha sınırlarında levhalar birbirinden uzaklaşıyorsa okyanus sırtları meydana gelir. Lavlar yüzeye doğru hızla yükselecek volkanizma artacak ve volkanik adalar oluşacaktır. Ve okyanus alanları genişleyecektir.\n" +
                    "\n" +
                    "Okyanusal – Okyanusal Yaklaşması: Okyanuslarda yer alan levha sınırlarında levhalar birbirine yaklaşırsa yoğun olan tabakalar hafif  tabakaların altına dalar. Okyanus çukurları meydana gelir, volkanizma ve depremsellik artar, volkanik adalar oluşur.\n" +
                    "\n" +
                    "Okyanusal – Kıtasal  Yaklaşması: Okyanusal ve kıtasal levhalar birbirine yaklaştığında yoğunluğu fazla olan okyanusal levha, yoğunluğu az olan kıtaların altına dalma batma zonları oluşur. Bu alanlarda volkanizma ve depremsellik artar; volkanik adalar, dağlar, sıra dağlar oluşur ve okyanus hendekleri meydana gelir.\n" +
                    "\n" +
                    "Kıtasal – Kıtasal Yaklaşma : İki kıtasal levhanın karşılaştığı alanlarda büyük sıradağlar meydana gelir. Bu alanalr depremselliğin fazla olduğu alanlardır. Kıtasal levhaların yoğunluklarının az olmasından dolayı volkanizma meydana gelmez.",
            "Jeolojik Zamanlar\n" +
                    "Palezoik\n" +
                    "– Zonguldak ve çevresinde Taş Kömürü yatakları oluşmuştur.\n" +
                    "– Hersinyen ve Kalodoniyen kıvrımları oluştu.\n" +
                    "– İlk kara bitkileri ve hayvanları oluştu.\n" +
                    "– Türkiye’deki masif araziler oluştu.\n" +
                    "\n" +
                    "Mezozik\n" +
                    "– Alp Himalaya ya hazırlık dönemi\n" +
                    "– Tortullaşma dönemi ya da Peneplenleşme dönemi denir\n" +
                    "– Dev bitkiler bu dönemde görülür (350m)\n" +
                    "– Dinozorlar bu dönemde yaşamışlardır.\n" +
                    "– Pangea kıtası parçalanır.\n" +
                    "\n" +
                    "Nezoik – Tersiyer\n" +
                    "– Türkiye ana hatlarıyla bu dönemde oluşmuştur.\n" +
                    "– Türkiye’deki kıvrım,kırık ve volkanik dağlar oluşmuştur.\n" +
                    "– Bor,Linyit,Tuz,Petrol,Doğalgaz yatakları oluşmuştur.\n" +
                    "– Anadolu’da büyük fay kuşakları (BAF-DAF-KAF) oluşmuştur.\n" +
                    "– Kıtalar yavaş yavaş bugün ki görünümünü almaya başladı.\n" +
                    "\n" +
                    "Kuarterner\n" +
                    "– İstanbul ve Çanakkale Boğazları meydana gelmiştir.\n" +
                    "– Egeid karası çöküp Ege Denizi oluşmuştur.\n" +
                    "– Kıbrıs Adası Anadolu’dan ayrılmıştır.\n" +
                    "– İnsan bu dönem de ortaya çıkmıştır.",
            "İç Kuvvetler\n" +
                    "Kıta Oluşumu (Epirojenez)\n" +
                    "Denizlerde ve karalarda dikey doğrultudaki açılma ve yükselme hareketleridir.\n" +
                    "\n" +
                    "Transgresyon: Epirojenik hareketler sırasında denizin ilerlemesi.\n" +
                    "\n" +
                    "Regresyon: Epirojenik hareketler sırasında denizin gerilemesi.\n" +
                    "\n" +
                    "Dağ Oluşumu (Orojenez)\n" +
                    "Kıvrımlı Dağ Oluşumu: Kıtaların birbirine yaklaşmasıyla yer kabuğunu oluşturan kayaçlar yan basınçlerın etkisiyle sıkılaşır ve elestiki yapıda oldukları için kıvrılıp kıvrımlı sıradağlar meydana gelir.\n" +
                    "\n" +
                    "Kırık Dağ Oluşumu: Sert Olan tabaklar ise yan basıncın etkisiyle kırılırlar ve kırık dağlarını oluştururlar.\n" +
                    "\n" +
                    "Volkanizma\n" +
                    "Mağmanın yer kabuğunun zayıf kısımlarından yer yüzüne doğru yükselmesine  volkanizma denir.  Volkanik bölgelerin toprağı mineral bakımından zengin olduğu için tarıma elverişlidir. Volkanın tepe kısmının çökmesi veya  patlayarak parçalanmasıyla oluşan çukura kaldera denir.\n" +
                    "\n" +
                    "Depremler\n" +
                    "Levha hareketlerinin sonucu yer kabuğunda herhangi bir sarsıntının çevreye doğru titreşim biçimindeki hareketine denir.\n" +
                    "\n" +
                    "Tektonik Depremler: Yer kabuğunun hareketlerinin yol açtığı sarsıntılardır. Can ve mal kaybının en çok olduğu deprem çeşididir.\n" +
                    "\n" +
                    "Volkanik Depremler: Volkanik püskürme sonucu oluşurlar. (Japonya- İyalya)\n" +
                    "\n" +
                    "Çöküntü Depremler: Mağaraların tavanının çökmesi sonucu oluşurlar. Genellikle karstik sahalarda görülürler.",
            "Kayaçlar\n" +
                    "Püskürük (Magmatik Kayaçlar)\n" +
                    "Yapıları kristallidir.\n" +
                    "Tabakalanma yoktur.\n" +
                    "Kütleler halindedirler.\n" +
                    "İçlerinde fosil bulunmaz.\n" +
                    "Asitten etkilenmezler.\n" +
                    "Aşınmaya karşı sert ve dirençlidir.\n" +
                    "\n" +
                    "* İç Püskürük Kayaçlar\n" +
                    "\n" +
                    "Yer kabuğu içinde magmanın yeryüzüne çıkmadan tabakalar içinde katılaşmasıyla oluşur.\n" +
                    "Yavaş soğuma ve katılaşmadan dolayı iri kristallidir.\n" +
                    "Başlıca türleri: Granit, siyenit, diyorit ve gabrodur.\n" +
                    "\n" +
                    "* Dış Püskürük Kayaçlar\n" +
                    "\n" +
                    "Magmanın yeryüzüne çıkarak soğuması ve katılaşmasıyla oluşur.\n" +
                    "Hızlı soğuma ve katılaşmadan dolayı kristalleşme az, genelde camsı özelliktedir.\n" +
                    "Başlıca türleri: Andezit , bazalt , trakit , volkan camı (obsidyen) , süngertaşı, katran taşı ve tüfler.",
            "Tortul (Sedimenter) Kayaçlar\n" +
                    "Oluşumunda dış kuvvetler etkilidir.\n" +
                    "Yapıları kristalli taneli değildir.\n" +
                    "İçlerinde fosil bulunabilir.\n" +
                    "Tabakalı bir yapıdadırlar.\n" +
                    "Asitten etkilenirler.\n" +
                    "\n" +
                    "* Kimyasal Tortul Kayaçlar\n" +
                    "\n" +
                    "Suda erimiş halde bulunan minerallerin daha sonra, suyun eritme özelliğini yitirmesiyle çökelip tortullanan kayaçlardır.\n" +
                    "Başlıca türleri: Kalker, jips, kaya tuzu, dolomit, traverten, sarkıt, dikittir.\n" +
                    "\n" +
                    "* Fiziksel (Kırıntılı) Tortul Kayaçlar\n" +
                    "\n" +
                    "Akarsu, rüzgar, buzul ve dalga gibi dış kuvvetlerin diğer kayaçlardan kopardıkları parçacıkları çukur yerlerde birikmesi ve biriken malzemelerin doğal bir çimento ile yapışması sonucu oluşur.\n" +
                    "Başlıca türleri: Konglomera(Çakılkaya), kumtaşı(Gre), kil taşı, mil ve marndır.\n" +
                    "\n" +
                    "* Organik Tortul Kayaçlar\n" +
                    "\n" +
                    "Bitki ve hayvan kalıntılarının okyanus, deniz ya da göl tabanı gibi çukur yerlerde birikmesi ve zamanla taşlaşması sonucu oluşur.\n" +
                    "İçlerindeki fosil yoğunluğu diğer kayaçlara göre fazladır.\n" +
                    "Başlıca türleri: Taş kömürü, linyit, turba, mercanlar ve tebeşirdir.\n" +
                    "\n" +
                    "Başkalaşım (Metamorfik) Kayaçlar\n" +
                    "Önceden oluşmuş tortul ve püskürük kayaçların yüksek sıcaklık ve basınç altında kalarak eski özelliklerini kaybedip yeni bir kayaca dönüşmesiyle oluşurlar.\n" +
                    "Başlıca Türleri:\n" +
                    "Mermer (kalkerin başkalaşmasıyla), Gnays (Granitin başkalaşmasıyla ), Elmas (Kömürün başkalaşmasıyla), Şist (Kil taşının başkalaşmasıyla), Kuvarsit (Kum taşının başkalaşmasıyla) oluşur.",
            "Yer Şekillerinin Diğer Oluşum Süreçleri\n" +
                    "Taşların Ufalanması\n" +
                    "* Fiziksel (Mekanik) Parçalanma (Çözülme): Gece ve gündüz arasındaki sıcaklık farkının fazla olduğu yerlerde değişerek parçalanma , ufalanma olayıdır.Çöller, kayaların iç kısımları örnek olarak verilebilir.\n" +
                    "\n" +
                    "* Kimyasal Çözülme (Parçalanma): Yağış ve nemin fazla olduğu yerlerde taşların çözülmesidir. Buradaki temel etkenler sıcaklık ve yağıştır. Ekvatoral bölgesi ve Muson iklim bölgesi örnek verilebilir.\n" +
                    "\n" +
                    "Erozyon\n" +
                    "dış kuvvetlerin kurak ve yarı kural bölgelerdeki toprağı taşımasına erozyon denir.\n" +
                    "\n" +
                    "Etkileyen faktörler:\n" +
                    "\n" +
                    "– Yer şekillerinin engebeli olması.\n" +
                    "– Doğal bitki örtüsünün tahribi.\n" +
                    "– Meralarda aşırı otlatılma.\n" +
                    "– Tarlaların nadasa bırakılması.\n" +
                    "– Toprağın aşırı kullanılması (nüfus atışı)\n" +
                    "\n" +
                    "Heyelan\n" +
                    "Ana kaya üzerindeki kütle halindeki toprağın yer çekiminin kuvveti ile eğim doğrultusunda yer değiştirmesidir.\n" +
                    "\n" +
                    "Etkileyen Faktörler:\n" +
                    "\n" +
                    "– Yamaç eğimlerinin fazla olması.\n" +
                    "– Kar erimeleri ve yağışın fazla olması.\n" +
                    "– Maden çıkarımı, yol yapımı, inşaat yapımı.\n" +
                    "– Deprem sel gibi doğal afetler.",
    };
    public static String İklimBilgiKar[] = {
            "Geniş bir sahada, uzun yıllar boyunca (40 – 50 yıl) devam eden, atmosfer olaylarının ortalamasına iklim denir." +
                    "– Dar bir sahada, kısa süre içerisinde görülen atmosfer olaylarına hava durumu denir.\n" +
                    "– İklimi inceleyen bilim dalına klimatoloji denir.\n" +
                    "– Dar sahalarda, kısa süreli atmosfer olaylarını inceleyen bilim dalına meteoroloji denir.\n" +
                    "– Sıcak ve Soğuk hava kütlelerinin karşılaşma alanına Cephe denir.\n" +
                    "– Dünya’yı gazlardan meydana gelen bir geosfer (tabaka) kuşatır. Buna atmosfer denir.",
            "Atmosferin Katmanları:\n" +
                    "\n" +
                    "Atmosfer, yerçekimi etkisiyle iç içe kürelerden meydana gelmiştir. Bunların yoğunlukları ve bileşimleri birbirinden farklıdır." +
                    "Troposfer: Atmosferin en alt tabakasıdır. Ekvator üzerindeki kalınlığı 16 – 17 km, 45° enlemlerinde 12 km, kutuplardaki kalınlığı ise 9 – 10 km dir. Bunun nedeni, Ekvator’daki hava kütlelerinin ısınarak yükselmesi, kutuplarda ise soğuyan havanın ağırlaşarak alçalmasıdır. iklim olayları troposferin 3 – 4 km lik kısmında meydana gelir. Çünkü, iklim olaylarında çok etkili olan su buharı troposferin 3 – 4 km lik kısmında bulunur. Troposfer daha çok yerden yansıyan ışınlarla ısınır.  Atmosferdeki gazların % 75′i troposfer katında bulunmaktadır.",
            "Stratosfer: Troposferden itibaren 17 – 30 km ler arasında bulunur. Bu tabakada su buharı olmadığı için, iklim olayı görülmez. Stratosferde sıcaklık değişimi yok gibidir. Sıcaklık –45°C civarındadır. Stratosferde yerçekimi çok azaldığı için cisimler gerçek ağırlıklarını kaybederler. Üst kısımlarında ozon gazı bulunur.\n" +
                    "\n" +
                    "Şemosfer: Stratosferden sonra 30 – 90 km ler arasında bulunur. iki kısımdan oluşur.\n" +
                    "\n" +
                    " * Ozonosfer: içerisinde bulundurduğu ozon gazından dolayı bu ismi almıştır. Güneş’ten gelen ve canlı yaşamı için zararlı olan ışınları (Ultraviyole ışınları gibi) tutar. Bundan dolayı canlıların koruyucu katıdır. Dünya’nın aşırı ısınıp, soğumasını önler.\n" +
                    "\n" +
                    " * Kemosfer: Bu katmana kemosfer denilmesinin nedeni, içerisinde bazı kimyasal olayların meydana gelmesidir. Az miktarda zararlı ışınların tutulması burada da görülür.",
            "İyonosfer: Şemosferden sonra 90 – 300 km’ler arasında bulunur. Bu tabakadaki gazlar ultraviyole ışınlarının etkisi ile iyonlara ayrılmıştır. iyonlaşma sırasında açığa çıkan enerji ile sıcaklığı yükselmiştir.\n" +
                    "(250 °C) iyonlar arasında elektron alışverişi son derece fazladır. Bundan dolayı haberleşme sinyalleri, radyo dalgaları bu tabakadan yansır.\n" +
                    "\n" +
                    "Eksosfer: Atmosferin en üst ve en dış sınırını oluşturur. Eksosferde bazı gaz molekülleri yerçekimi etkisinden kurtularak uzaya kaçar. Bu nedenle dış sınırı kesin olarak tespit edilememekte, 10.000 km ye kadar çıktığı sanılmaktadır.",
            "Atmosferin Faydaları\n" +
                    "– İklim olayları meydana gelir.\n" +
                    "– Canlı yaşamı için gerekli gazları ihtiva eder.\n" +
                    "– Güneş’ten gelen zararlı ışınları tutar.\n" +
                    "– Dünya’nın aşırı ısınmasını ve soğumasını engeller.\n" +
                    "– Dünya ile birlikte dönerek sürtünmeden doğacak yanmayı engeller.\n" +
                    "\n" +
                    "– Uzaydan gelen meteorların parçalanmasına neden olur.\n" +
                    "\n" +
                    "– Güneş ışınlarının dağılmasını sağlayarak, gölgede kalan kısımların da aydınlanmasını sağlar. Bir başka ifade ile gölgelerin tam karanlık olmasını önler.\n" +
                    "– Işığı, sesi, sıcaklığı geçirir ve iletilmesini sağlar.\n" +
                    "– Hava akımları sayesinde gündüz olan kesimlerin aşırı sıcak, gece olan kesimlerin de aşırı soğuk olmasını engeller.",
            "Sıcaklık\n" +
                    "Yeryüzündeki sıcaklığın kaynağı Güneş’tir. Yeryüzünün Güneş’ten aldığı ısı miktarına sıcaklık denir. Termometre ile ölçülür. Sıcaklığın birimi santigrat derece (°C) dir. Atmosfere gelen enerji % 100 kabul edilirse;\n" +
                    "\n" +
                    "– Enerjinin % 25’i bulutların ve atmosferin etkisi ile uzaya doğru yansır.\n" +
                    "– % 25’i atmosferde dağılarak gölge yerlerin aydınlatılmasını ve gökyüzünün mavi görünmesini sağlar.\n" +
                    "– % 15’i atmosfer tarafından emilerek atmosferin ısınmasını sağlar.\n" +
                    "– % 35’i yeryüzüne ulaşır. Bu enerjinin % 27’si yeri ısıtır. % 8’i ise yeryüzüne çarptıktan sonra tekrar uzaya yansır.",
            "Sıcaklık Dağılışını Etkileyen Faktörler\n" +
                    "- Güneş ışınlarının yeryüzüne düşme açısı" +
                    "- Dünya’nın şekli ve enlem" +
                    "- Yaşanan Mevsim" +
                    "- Günün Saati" +
                    "- Bakı ve eğim",
            "Sıcaklığın Yeryüzündeki Dağılışı\n" +
                    "— İzoterm Haritaları\n" +
                    "Sıcaklık yeryüzünün her yerinde aynı değildir. Yeryüzünde sıcaklığın dağılışını gösteren haritalara izoterm haritaları denir. Aynı sıcaklık değerlerine sahip noktaların birleştirilmesiyle elde edilen eğrilere izoterm (eş sıcaklık) eğrileri denir.\n" +
                    "İzoterm haritaları ikiye ayrılır;\n" +
                    "\n" +
                    "* Gerçek İzoterm Haritaları: Yeryüzünde ölçülen gerçek sıcaklık değerlerine göre çizilir.\n" +
                    "\n" +
                    "* İndirgenmiş İzoterm Haritaları: Bütün yükseltiler deniz seviyesine indirgenerek, her yerin 0 m’de olduğu varsayılarak hazırlanan sıcaklık haritalardır. Enlem farkı daha belirgin olarak ön plana çıkar.Yerden yükseldikçe her 200 m’de sıcaklık 1°C azalır. İndirgenmiş izoterm haritaları hazırlanırken, gerçek sıcaklığına, yükseltisinden dolayı kaybettiği sıcaklık miktarı eklenerek gösterilir.",
            "Sıcaklığın Coğrafi Dağılışı\n" +
                    "\n" +
                    "Yeryüzünde sıcaklığın coğrafi dağılışı, daha çok enlemin, kara ve denizlerin dağılışı ve yükseltinin etkisi altında belirir. Diğer etmenlerin etkisi de yer yer belirgin olmakla birlikte daha çok bu üç ana etmenle şekillenir. Sıcaklığın yeryüzündeki genel dağılışı incelenirken yıllık ortalama, en soğuk ve en sıcak ay ortalama sıcaklık dağılış haritaları incelenecektir.",
            "Basınç \n" +
                    "Atmosferi oluşturan gazların yeryüzüne yaptığı etkiye basınç denir. Basınç barometre ile ölçülür. Basıncın değeri milibar (mb) denilen birimle belirtilir. Aynı basınca sahip olan noktaların birleştirilmesiyle oluşturulan iç içe kapalı eğrilere ise izobar adı verilmektedir. ",
            "Rüzgarlar\n" +
                    "Yüksek basınç (antisiklon) alanlarından alçak basınç (siklon) alanlarına doğru olan yatay hava akımlarına rüzgâr denir. Rüzgârın yönü, coğrafi yönlerle ifade edilir. Rüzgâr hızı anemometre adı verilen aletle ölçülür.",
            "üzgârın Hızını Etkileyen Faktörler\n" +
                    "* Basınç farkı: Rüzgârın hızı basınç farkıyla doğru orantılıdır. Basınç farkı çok ise rüzgâr hızlı, basınç farkı az ise rüzgâr yavaş eser. İki bölge arasındaki basınç farkının sona ermesi ile rüzgâr etkinliği kaybeder.\n" +
                    "\n" +
                    "* Basınç merkezleri arasındaki uzaklık-mesafe: Aynı basınç farklarına sahip, birbirinden farklı uzaklıktaki noktalar arasında rüzgârların hızı farklıdır. Birbirine yakın olan noktalar arasında, izobar yüzeylerinin eğimi fazladır ve rüzgâr hızlı eser. Birbirine uzak olan noktalar arasında ise, izobar yüzeylerinin eğimi azdır ve rüzgâr yavaş eser.\n" +
                    "\n" +
                    "* Dünya’nın Dönmesi (Merkezkaç Etkisi): Dünya’nın dönüşüne bağlı olarak rüzgârlar, düz çizgiler yerine saparak hareket ederler. Bu sapmalar ise onlara hız kaybettirir.\n" +
                    "\n" +
                    "* Yer Şekilleri (Sürtünme): Engebeli arazilerde rüzgârlar çok fazla engellerle karşılaştığı için hızları azalır. Bundan dolayı, rüzgârların hızı, sürtünmenin azaldığı düz ve açık alanlarda fazladır.",
            "Rüzgarın Yönünü Etkileyen Faktörler\n" +
                    "* Basınç merkezlerinin konumu-yeri: Rüzgârın yönünü belirleyen, öncelikle basınç merkezlerinin konumudur. Basınç merkezleri yer değiştirdikçe rüzgârın yönü de değişir.\n" +
                    "\n" +
                    "* Yeryüzü Şekilleri: Rüzgârlar basınç merkezleri arasında hareket ederken, yeryüzü şekillerine çarparak yön değiştirirler. Bir bölgede rüzgârın yıl içerisinde en fazla estiği yöne hakim rüzgâr yönü denir. Hakim rüzgâr yönü yer şekillerine göre ortaya çıkar.\n" +
                    "\n" +
                    "* Dünya’nın Dönmesi: Dünya’nın kendi ekseni etrafında dönmesi sonucunda, rüzgârlar basınç merkezleri arasındaki en kısa yolu izleyemezler. Rüzgârlar, Kuzey Yarım Küre’de hareket yönünün sağına, Güney Yarım Küre’de ise hareket yönünün soluna saparlar.\n" +
                    "\n" +
                    "Yüksek basınç alanlarında rüzgârlar, merkezden çevreye doğru hareket ederler.\n" +
                    "\n" +
                    "Alçak basınç alanlarında ise rüzgârlar, çevreden merkeze doğru hareket ederler.",
            "Rüzgar Çeşitleri\n" +
                    "— Sürekli (Yıllık) Rüzgârlar:\n" +
                    "\n" +
                    "Yıl boyunca alçak ve yüksek basınç rüzgarları arasında esen rüzgarlara denir. Bu rüzgarlar okyanus akıntılarına yön verir ve yeryüzünün iklimlerin (makro klima) üzerinde etkili olurlar.\n" +
                    "\n" +
                    "* Alize Rüzgârları: 30° Kuzey ve 30° Güney enlemlerindeki dinamik yüksek basınç alanlarından, Ekvator’daki termik alçak basınç alanına doğru esen rüzgârlardır. Alize rüzgarlarına ters yönde esen rüzgarlara ters alizeler denir. Tropikal Kuşak rüzgarlarıdır.\n" +
                    "\n" +
                    "– Başlangıçta sıcak ve kurudurlar. Ancak, denizler üzerinden geçerken nem kazanırlar.\n" +
                    "– Tropikal kuşaktaki karaların doğu kıyılarına bol yağış bırakırlar. Bu nedenle Doğu rüzgârları da denir.\n" +
                    "– Sürekli olmaları ve yönlerinin belli olması nedeniyle, yelkenli gemiler döneminde bu rüzgârlardan faydanılmıştır. Bu nedenle bu rüzgârlara ticaret rüzgârları (trade winds) da denilmiştir.\n" +
                    "– Ekvatoral bölgede karşılaşan Alizeler, 3 – 4 km kadar yükselerek kutuplara doğru hareket ederler. Bunlara da ters alize (üst alize) adı verilir.\n" +
                    "– Ters alizeler, dönenceler üzerinde alçalarak tropikal çöllerin oluşmasına neden olurlar. Sıcak okyanus akıntılarının oluşumuna neden olurlar.\n" +
                    "\n" +
                    "* Batı Rüzgârları: 30° enlemlerindeki dinamik yüksek basınç alanlarından, 60° enlemlerindeki dinamik alçak basınç alanlarına doğru esen rüzgârlardır. Türkiye batı rüzgarları kuşağında yer alır.\n" +
                    "\n" +
                    "– Başlangıçta sıcak ve kurudurlar. Ancak, denizler üzerinden geçerken nem kazanırlar.\n" +
                    "– Orta kuşaktaki karaların batı kıyılarına bol yağış bırakırlar. Orta kuşak rüzgarlarıdır.\n" +
                    "– 60° enlemleri civarında Kutup rüzgârları ile karşılaşarak cephe yağışlarına yol açarlar.\n" +
                    "\n" +
                    "* Kutup Rüzgârları: Kutuplardaki termik yüksek basınçlardan, 60° enlemlerindeki dinamik alçak basınç alanlarına doğru esen rüzgârlardır. Özellikleri;\n" +
                    "\n" +
                    "– Soğuk ve kuru oldukları için, etkili oldukları alanlarda sıcaklığı azaltarak kar yağışlarına neden olurlar.\n" +
                    "– 60° enlemleri civarında Batı rüzgârları ile karşılaşarak cephe yağışlarına yol açarlar.\n" +
                    "– Soğuk okyanus akıntılarının oluşumuna neden olurlar.\n" +
                    "\n" +
                    "— Devirli – Mevsimlik Rüzgârlar (Musonlar)",
            "* Yaz Musonu: Yaz mevsiminde karalar denizlere göre daha fazla ısınır. Bu nedenle buralarda alçak basınç alanları oluşur. Aynı mevsimde deniz ve okyanuslar daha serin oldukları için, yüksek basınç alanı durumundadırlar. Bunun sonucunda, deniz ve okyanuslardan kara içlerine doğru büyük bir hava akımı olur. Bu rüzgârlara yaz musonu denir. (denizden karaya doğru eser)\n" +
                    "\n" +
                    "Yaz musonları deniz ve okyanuslardan kaynaklandıkları için bol nem taşırlar. Bu yüzden etkili oldukları yerlere bol yağış bırakırlar.\n" +
                    "\n" +
                    "* Kış Musonu: Kış mevsiminde karalar, denizlere oranla daha fazla soğuyarak yüksek basınç alanı oluştururlar. Aynı mevsimde denizler ve okyanuslar üzerinde alçak basınç alanı vardır. Bunun sonucunda, karaların iç kesimlerinden deniz ve okyanuslara doğru büyük bir hava akımı olur. Bu rüzgârlara kış musonu denir.\n" +
                    "\n" +
                    "Kış musonları kara kaynaklı oldukları için soğuk ve kurudurlar. Bu nedenle başlangıçta yağış getirmezler. Ancak, denizler üzerinden geçtikten sonra bir karaya varırlarsa yamaç yağışlarına yol açarlar.\n" +
                    "\n" +
                    "— Yerel Rüzgârlar\n" +
                    "\n" +
                    "* Meltem Rüzgârları: Gün boyunca oluşan sıcaklık ve basınç farkları sonucu meydana gelirler.\n" +
                    "\n" +
                    "Deniz ve Kara Meltemleri: Gündüz, karalar daha çok ısınacağı için alçak basınç alanı, denizler ise yüksek basınç alanıdır. Bunun sonucunda denizden karaya doğru rüzgâr eser. Bu rüzgâra deniz meltemi denir.\n" +
                    "\n" +
                    "Gece ise, karalar daha fazla soğuyarak yüksek basınç alanı durumuna geçerler. Denizler daha sıcaktır ve basınç azdır. Bunun sonucunda da, karadan denize doğru rüzgâr eser. Bu rüzgâra kara meltemi denir.\n" +
                    "\n" +
                    "Vadi ve Dağ Meltemleri\n" +
                    "Gündüz, dağ dorukları vadilerden daha erken ısınır ve alçak basınç oluşur. Vadiler ise, daha serindir ve yüksek basınç alanıdır. Bunun sonucunda, vadi tabanlarından dağ yamacına ve doruklarına doğru rüzgâr eser. Bu rüzgâra vadi meltemi denir.\n" +
                    "\n" +
                    "Geceleri ise, dağ yamaçlarında ve yüksek plâtolarda hızla soğuyan hava yüksek basınç alanı oluşturur. Alçak ovalar ve vadiler ise, nem oranının daha fazla olması nedeniyle sıcaktır ve alçak basınçlar görülür. Bunun sonucunda da, dağ yamaçlarından alçak ova ve vadilere doğru rüzgâr eser. Bu rüzgâra dağ meltemi denir.",
            "* Sıcak Yerel Rüzgârlar\n" +
                    "\n" +
                    "Föhn (Fön): Hava kütleleri dağ zirvesine doğru çıkarken, sıcaklığı yaklaşık her 100 m. de 0,5 °C azalır. Belli bir yükseltiden sonra bünyesindeki nemi yağış olarak bırakır. Dağın arka yamacına geçtiğinde kuru özelliktedir ve yamaca sürtünerek alçalır. Sürtünmenin etkisiyle sıcaklığı her 100 m. de 1°C artar. Dağ zirvelerinden aşağıya doğru sıcak ve kuru olarak esen bu rüzgârlara föhn rüzgârı denir.\n" +
                    "\n" +
                    "Föhn rüzgârı, İsviçre’de Alpler’in kuzey yamaçlarında görüldüğünden bu ismi almıştır. Föhn rüzgârı Türkiye’de, Toroslar ve Kuzey Anadolu Dağları’nın denize bakan yamaçlarında kışın ve ilkbaharda görülür.\n" +
                    "\n" +
                    "Sirokko: Kuzey Afrika’da, Büyük Sahra Çölü’nden sıcak ve kuru olarak Akdeniz’e doğru esen rüzgârdır. Fas, Tunus ve Cezayir’de etkisi belirgindir. Akdeniz’i geçerken nem kazanır. İspanya, Fransa ve İtalya’nın güney kıyılarına yağış bırakır.\n" +
                    "Hamsin: Sudan’dan gelen ve Mısır’dan Akdeniz’e doğru esen rüzgârdır. Sıcak, kuru ve boğucu bir rüzgârdır.\n" +
                    "\n" +
                    "* Soğuk Yerel Rüzgârlar\n" +
                    "\n" +
                    "Bora: Dalmaçya kıyılarında, Dinar Alpleri’nden Adriya Denizi’ne doğru esen soğuk ve kuru rüzgârdır. Hızı fazladır.\n" +
                    "Mistral: Fransa’nın Rhone vadisini izleyerek Akdeniz’e doğru esen soğuk ve kuru rüzgârdır.\n" +
                    "Krivetz (Kriviç): Romanya’da, Aşağı Tuna Ovası’na doğru esen soğuk ve kuru rüzgârdır. Bükreş’te krivetz etkili olduğunda sıcaklık 10 – 15°C düşer.\n" +
                    "\n" +
                    "* Tropikal Rüzgârlar\n" +
                    "\n" +
                    "Sıcak kuşakta, ani basınç farklarından kaynaklanan ve hızları saatte 100 – 150 km.ye kadar çıkabilen rüzgârlardır. Daha çok okyanuslar üzerinde oluşurlar. Belirli yollar izleyerek karaların üzerine de sokulurlar. Sarmal hava hareketleri halinde olduklarından, genellikle hortumlara sebep olurlar. Çevrelerine büyük zarar verirler. Tropikal rüzgârlara, Asya denizlerinde ve Avustralya’nın Büyük Okyanus kıyılarında Tayfun (Çince “Büyük rüzgar” demektir), Meksika Körfezi kıyılarında Hurrican (Hariken), Afrika’nın bazı kesimlerinde ve Latin Amerika kıyılarında da Tornado (Hortum) adı verilir.",
            "* Tropikal Rüzgârlar\n" +
                    "\n" +
                    "Sıcak kuşakta, ani basınç farklarından kaynaklanan ve hızları saatte 100 – 150 km.ye kadar çıkabilen rüzgârlardır. Daha çok okyanuslar üzerinde oluşurlar. Belirli yollar izleyerek karaların üzerine de sokulurlar. Sarmal hava hareketleri halinde olduklarından, genellikle hortumlara sebep olurlar. Çevrelerine büyük zarar verirler. Tropikal rüzgârlara, Asya denizlerinde ve Avustralya’nın Büyük Okyanus kıyılarında Tayfun (Çince “Büyük rüzgar” demektir), Meksika Körfezi kıyılarında Hurrican (Hariken), Afrika’nın bazı kesimlerinde ve Latin Amerika kıyılarında da Tornado (Hortum) adı verilir.",
    };
    public static String trİklim[] = {
            "Türkiye, iklim kuşaklarından ılıman kuşak ile subtropikal kuşak arasında yer alır. Türkiye’nin coğrafî konumu ve yer şekilleri sonucunda ikliminin, farklı özellikte iklim tiplerinin oluşmasına yol açmıştır. Kıyı bölgelerinde denizlerin etkisiyle daha ılıman iklim özellikleri görülür. Dağların yüksekliği ve uzanışı deniz etkilerinin iç kesimlere ulaşmasını engeller. Bu nedenle iç kesimlerinde karasal iklim özellikleri görülür.",
            "Karasal İklim\n" +
                    "Türkiye’de en geniş alanda görülen iklim tipi karasal iklimdir. Doğu Anadolu, İç Anadolu, Güneydoğu Anadolu bölgelerinde ve Marmara Bölgesi’nin bazı kesimlerinde görülen karasal iklim, Türkiye’de görülen en kurak iklim tipidir. İklimin kurak ve sıcak geçirilen zamanı yaz aylarıdır.\n" +
                    "\n" +
                    "Kış aylarında ise soğuk bir hava ve kar yağışı hâkimdir. Genel olarak en fazla yağışı ilkbahar aylarında alan karasal iklim bölgelerinde yağış yaz aylarında yok denecek kadar azdır. Bitki örtüsü bozkırdır. Karasal iklim her bölgede farklı özelliklerle kendini gösterir.\n" +
                    "\n" +
                    "İç Anadolu Bölgesi: Ortalama yağış miktarı 300-400 mm civarında seyreden bölgede, kış sıcaklığı ortalama olarak 1-2 °C’dir. En sıcak ay 22 °C ile temmuz ayıdır.\n" +
                    "Doğu Anadolu Bölgesi: Bölgede kış sıcaklığının ortalaması -7 °C civarındadır. Yaz aylarında ise ortalama sıcaklık 19 °C’yi geçmemektedir. Genel olarak yazlar kısa ve serin, kışlar uzun ve soğuktur. Bu bölge İç Anadolu Bölgesi’ne oranla bir miktar daha fazla yağış almaktadır. Bu durumda yükseltinin de etkisi göz ardı edilemez.\n" +
                    "\n" +
                    "Güneydoğu Anadolu Bölgesi: Bölgede kış aylarında don olaylarına pek rastlanmaz. Yaz aylarında ise çok yüksek derecelerde ve sıcak esintili, sıcak hava dalgası hâkimdir. Bunun en temel nedeni güneyden gelen sıcak rüzgârlardır. Bölgenin kış sıcaklık ortalaması 15 °C’lerde seyrederken; yaz sıcaklığı ortalaması 30-35 °C’lere kadar yükselir. Yağış ortalaması bakımından Doğu Anadolu bölgesi ile benzerlik gösterir. Yağış miktarı 400-700 mm civarındadır.\n" +
                    "\n" +
                    "Trakya Bölgesi: Karasal iklim Marmara Bölgesi’nde yer alan Trakya’nın iç kesimlerinde de görülmektedir. En çok yağmuru ilkbahar ve sonbaharda alan bu bölgenin yaz mevsimi ortalama sıcaklığı 23-24 °C ‘dir.",
            "Akdeniz İklim\n" +
                    "Bu iklim tipi, Akdeniz, Ege ve güney Marmara`da görülür. Ancak Marmara’da görülen Akdeniz ikliminin özellikleri daha serttir. Yazları sıcak ve kurak, kışları ılık ve yağışlıdır. Turunçgillerin tarımı için elverişlidir. Güney enlemlerde görüldüğünden don olayı ve kar yağışı kıyı kuşağında ender görülür. Torosların yükseklerinde kışlar kar yağışlı ve soğuktur. En soğuk ay 6,4 °C ortalama ile Ocak ayı, en sıcak ay 26,8 °C ortalama ile Temmuz ayıdır. Yıllık ortalama sıcaklık 16,3 °C’dir. En yağışlı mevsim kış, yıllık yağış ortalaması 725,9 mm’dir. Sıcak olan yaz mevsimi aynı zamanda kuraktır, yağışın %5,7’si bu mevsimde düşer. Yıllık bağıl nem ortalaması %63,2’dir.\n" +
                    "\n" +
                    "Bitki örtüsü doğal alanlarda kızılçam, ormanın tahrip edildiği alanlarda makidir. Genellikle 0-800 metreler arası maki hakimdir. Yüksek alanlarda karaçam, köknar ve sedir ağaçları hakimdir.",
            "Karadeniz İklimi\n" +
                    "İsmini bulunduğu kıyılardan alan Karadeniz iklimi genellikle Kuzey Anadolu Dağları’nın Karadeniz’i gören yamaçlarında görülür. Bu iklim tipinde tüm mevsimlerde hemen her zaman yağış vardır.\n" +
                    "\n" +
                    "Doğu Karadeniz ve Batı Karadeniz Bölgeleri’nde en fazla yağış sonbahar aylarında düşerken; minimum yağış ise ilkbahar aylarında düşer. Bu bölgelerin yıllık ortalama yağış miktarı 2000 mm civarındadır ancak Doğu Karadeniz’de bu oran 2500’lere kadar çıkar. Orta Karadeniz’de ise en çok yağış kış aylarında düşerken; en az yağış yaz aylarında düşer.\n" +
                    "\n" +
                    "Orta Karadeniz’in yağış miktarı ortalama 800 mm ile diğer Karadeniz bölgelerine oranla daha azdır. Karadeniz ikliminin doğal bitki örtüsü ormanlardır. Dolayısıyla ülkemizde en çok ormana Karadeniz Bölgesi’nde rastlarız. Daha yüksek yerlerde ise Alpin çayırlarına rastlanır.",
            "Marmara(Geçiş) İklimi\n" +
                    "Marmara Bölgesi’nin Kuzey Ege’yi de içine alacak şekilde güney kesiminde görülür. Kışları Akdeniz iklimi kadar ılık, yazları Karadeniz iklimi kadar yağışlı değildir. Karasal iklim kadar kışı soğuk, yazı da kurak geçmemektedir. Bu özelliklerden dolayı Marmara iklimi, karasal Karadeniz ve Akdeniz iklimleri arasında bir geçiş özelliği göstermektedir. Buna bağlı olarak doğal bitki örtüsünü alçak kesimlerde Akdeniz kökenli bitkiler, yüksek kesimlerde kuzeye bakan yamaçlarda Karadeniz bitki topluluğu özelliğindeki nemli ormanlar oluşturmaktadır.\n" +
                    "\n" +
                    "Soğuk ay olan Ocak ayı ortalama sıcaklığı 4,9 °C, sıcak ay olan Temmuz ayı ortalama sıcaklığı 23,7 °C, yıllık ortalama sıcaklık 14,0 °C dir. Ortalama yıllık toplam yağış 595,2 mm’dir ve yağışların çoğu kış mevsiminde düşer. Yaz yağışlarının yıllık toplam içindeki payı %11.7 dir. Yıllık ortalama nispi nem %73’tür.",
    };
    public static String nemlilik[] = {
            "Su, canlı yaşamı için çok önemli bir doğal unsurdur. Doğadaki su, sıcaklık şartlarına göre katı, sıvı ya da gaz hâlinde bulunmaktadır. Su belirli sıcaklıkta buharlaşarak gaz haline geçmekte, sıcaklığın düşmesiyle de yoğunlaşarak, yağmur ya da kar ve dolu şeklinde tekrar yeryüzüne düşmektedir. Yağışlarla yeryüzüne düşen su bir süre sonra yeniden buharlaşarak atmosfere karışmaktadır. Atmosferdeki su buharına nem denir.",
            "Mutlak Nem:\n" +
                    "1m3 hava içerisinde bulunan su buharının gr olarak ağırlığına mutlak nem denir. Mutlak nem, sıcaklık ve buharlaşmanın fazla olduğu Ekvatoral bölgelerde çok, soğuk kutup bölgeleri ile yüksek dağlarda azdır.",
            "Maksimum Nem:\n" +
                    "1m3 havanın belli sıcaklıkta taşıyabileceği en fazla nem miktarına maksimum nem denir. Maksimum nem sıcaklık ile doğru orantılıdır. Sıcaklık arttıkça hava genişleyeceğinden taşıyabileceği nem miktarı artar. Sıcaklık azaldıkça hava daralır ve böylece taşıyabileceği nem miktarı azalır. Sıcaklıkla maksimum nem doğru orantılıdır.",
            "Bağıl Nem (Nisbi nem):\n" +
                    "Mutlak nemin maksimum neme oranı havanın neme doyma oranını verir. Bu orana bağıl nem denir. Yüzde (%) olarak ifade edilir. Bağıl nem ile sıcaklık ters orantılıdır. Sıcaklık düştükçe maksimum nem azalacağından, bağıl nem yükselir. Sıcaklık değerleri yükseldikçe, maksimum nem artacağından bağıl nem düşer. Bağıl nem çöl bölgelerinde ve kara içlerinde az, Ekvatoral bölge gibi yağışlı bölgelerde ve deniz kıyılarında çoktur. Formül/ Bağıl nem = mut/max * 100 veya 1000\n" +
                    "\n" +
                    "Mutlak Nem, Maksimum Nem ve Mutlak (Nisbi) Nem olayını daha kolay anlamak için bardak örneği verilir. Bu örnekte 1 bardak, 1m3 havayı içerisindeki su ise nemi temsil etmektedir. Buna göre aşağıdaki görselleri tek tek inceleyelim. Bu arada unutmadan aşağıdaki durumların tamamında sıcaklık (yaklaşık 22-23 derece) aynıdır.",
            "Havadaki su buharının, tekrar sıvı ya da katı haldeki suya dönüşmesine yoğunlaşma denir. Yoğunlaşmanın meydana gelmesi havanın nem bakımından doyma noktasını aşmasına bağlıdır. Havadaki bağıl nemin yüzde 100′e ulaştığı noktaya doyma noktası denir. Doyma noktası aşıldığı takdirde hava su buharının fazlasını taşıyamaz. Fazla olan su buharı sıvı ya da katı hale dönüşür.\n" +
                    "\n" +
                    "Yoğunlaşma sonucunda çok küçük su taneciklerinin bir araya gelmesiyle bulutlar oluşur. Bulutlar oluştukları yükseklikler dikkate alınarak üç gruba ayrılır.",
            "Nemlilik ve Yağış Konu Anlatımı\n" +
                    "By: kadirhoca\n" +
                    "In: 9. Sınıf Coğrafya Konu Anlatımları\n" +
                    "11 Mart 2013\n" +
                    "10  9\n" +
                    " \n" +
                    "   Kaydet\n" +
                    "Konu Başlıkları:\n" +
                    "1. Mutlak Nem:\n" +
                    "2. Maksimum Nem:\n" +
                    "3. Bağıl Nem (Nisbi nem):\n" +
                    "YOĞUNLAŞMA NEDİR?\n" +
                    "Yağış Türleri ve Etkileri\n" +
                    "1. Çiy Nedir?\n" +
                    "2. Kırağı Nedir?\n" +
                    "3. Kırç Nedir?\n" +
                    "4. Yağmur Nedir?\n" +
                    "5. Kar Nedir?\n" +
                    "6. Dolu Nedir?\n" +
                    "YAĞIŞLARIN OLUŞMA BİÇİMLERİ (OLUŞUM NEDENLERİNE GÖRE YAĞIŞLAR)\n" +
                    "1. Yamaç Yağışları (Orografik Yağışlar)\n" +
                    "2. Konveksiyonel Yağışlar (Yükselim Yağışları)\n" +
                    "3. Cephe Yağışları (Frontal – Depresyon(ik) Yağışlar)\n" +
                    "Yağışların Yeryüzüne Dağılışı\n" +
                    "Dünyadaki en yağışlı bölgeler;\n" +
                    "Dünyadaki en kurak bölgeler:\n" +
                    "Nemlilik ve Yağış Konu Anlatımı\n" +
                    "Su, canlı yaşamı için çok önemli bir doğal unsurdur. Doğadaki su, sıcaklık şartlarına göre katı, sıvı ya da gaz hâlinde bulunmaktadır. Su belirli sıcaklıkta buharlaşarak gaz haline geçmekte, sıcaklığın düşmesiyle de yoğunlaşarak, yağmur ya da kar ve dolu şeklinde tekrar yeryüzüne düşmektedir. Yağışlarla yeryüzüne düşen su bir süre sonra yeniden buharlaşarak atmosfere karışmaktadır. Atmosferdeki su buharına nem denir. Atmosferdeki nemin kaynağı okyanus, deniz, göl, akarsu ve bitkilerdir. Atmosferdeki nem oranı her yerde aynı değildir. Okyanus ve deniz kıyıları nem bakımından zengin, çöller, karaların iç kesimleri ve yüksek bölgeler ise nem yönünden fakir alanlardır. Nem higrometre adı verilen aletle ölçülür. Havanın nemi gram (gr) olarak ifade edilmektedir.\n" +
                    "\n" +
                    "Atmosferdeki nem şu terimlerle ifade edilir:\n" +
                    "\n" +
                    "1. Mutlak Nem:\n" +
                    "1m3 hava içerisinde bulunan su buharının gr olarak ağırlığına mutlak nem denir. Mutlak nem, sıcaklık ve buharlaşmanın fazla olduğu Ekvatoral bölgelerde çok, soğuk kutup bölgeleri ile yüksek dağlarda azdır.\n" +
                    "\n" +
                    "2. Maksimum Nem:\n" +
                    "1m3 havanın belli sıcaklıkta taşıyabileceği en fazla nem miktarına maksimum nem denir. Maksimum nem sıcaklık ile doğru orantılıdır. Sıcaklık arttıkça hava genişleyeceğinden taşıyabileceği nem miktarı artar. Sıcaklık azaldıkça hava daralır ve böylece taşıyabileceği nem miktarı azalır. Sıcaklıkla maksimum nem doğru orantılıdır.\n" +
                    "\n" +
                    "3. Bağıl Nem (Nisbi nem):\n" +
                    "Mutlak nemin maksimum neme oranı havanın neme doyma oranını verir. Bu orana bağıl nem denir. Yüzde (%) olarak ifade edilir. Bağıl nem ile sıcaklık ters orantılıdır. Sıcaklık düştükçe maksimum nem azalacağından, bağıl nem yükselir. Sıcaklık değerleri yükseldikçe, maksimum nem artacağından bağıl nem düşer. Bağıl nem çöl bölgelerinde ve kara içlerinde az, Ekvatoral bölge gibi yağışlı bölgelerde ve deniz kıyılarında çoktur. Formül/ Bağıl nem = mut/max * 100 veya 1000\n" +
                    "\n" +
                    "Mutlak Nem, Maksimum Nem ve Mutlak (Nisbi) Nem olayını daha kolay anlamak için bardak örneği verilir. Bu örnekte 1 bardak, 1m3 havayı içerisindeki su ise nemi temsil etmektedir. Buna göre aşağıdaki görselleri tek tek inceleyelim. Bu arada unutmadan aşağıdaki durumların tamamında sıcaklık (yaklaşık 22-23 derece) aynıdır.\n" +
                    "\n" +
                    "Mutlak Nem Nedir\n" +
                    "\n" +
                    "Mutlak Nem: Bardağın (1m3 havanın) içinde o anda bulunan su (nem) miktarı: 10 gramdır.\n" +
                    "Maksimum Nem: Bardağın (1m3 havanın) alabileceği en fazla su (nem) miktarı: 20 gramdır.\n" +
                    "Bağıl Nem: Mutlak Nemin / Maksimum neme oranının % (yüzde) olarak ifade edilmesidir. 10/20 * 100 = 50 %. Yukarıdaki şekle bakarsanız bardağın yarıya kadar dolu olduğunu görürsünüz bunun anlamı bardak % 50 oranında doludur. İşte bu durum Bağıl nem olarak adlandırılır. Havanın yağış bırakma ihtimali % 50, nem açığı % 50 (10 gr) dir. Yağıl % 100’de başlar. Yani bardağın taşması gerekir.\n" +
                    "\n" +
                    "Maksimum Nem Nedir\n" +
                    "\n" +
                    "Mutlak Nem: Bardağın (1m3 havanın) içinde o anda bulunan su (nem) miktarı: 15 gramdır.\n" +
                    "Maksimum Nem: Bardağın (1m3 havanın) alabileceği en fazla su (nem) miktarı: 20 gramdır.\n" +
                    "Bağıl Nem: 15/20 * 100 = 75 %. Yukarıdaki şekle bakarsanız bardağın 3/4 oranında dolu olduğunu görürsünüz bunun anlamı bardak % 75 oranında doludur. Havanın yağış bırakma ihtimali % 75, nem açığı % 25 (5 gr) dir. İlk şekle göre hava sıcaklıkları aynı, mutlak ve bağıl nem oranları daha yüksektir.\n" +
                    "\n" +
                    "Bağıl Nem Nedir\n" +
                    "\n" +
                    "Mutlak Nem: Bardağın (1m3 havanın) içinde o anda bulunan su (nem) miktarı: 20 gramdır.\n" +
                    "Maksimum Nem: Bardağın (1m3 havanın) alabileceği en fazla su (nem) miktarı: 20 gramdır.\n" +
                    "Bağıl Nem: 20/20 * 100 = 100 %. Yukarıdaki şekle bakarsanız bardağın tamamı dolu olduğunu görürsünüz bunun anlamı bardak % 100 oranında doludur. Havanın yağış bırakma ihtimali % 100, nem açığı % 0 (0 gr) dir. Bu durumda yağış başlamaması için hiç bir engel yoktur (Tabii hava aniden ısınmazsa).  Birinci ve ikinci şekle göre hava sıcaklıkları aynı, mutlak ve bağıl nem oranları daha yüksektir.\n" +
                    "\n" +
                    ">>>Nemlilik ve Yağış Konu Testini Çözmek İçin Tıkla<<<\n" +
                    "\n" +
                    "YOĞUNLAŞMA NEDİR?\n" +
                    "Havadaki su buharının, tekrar sıvı ya da katı haldeki suya dönüşmesine yoğunlaşma denir. Yoğunlaşmanın meydana gelmesi havanın nem bakımından doyma noktasını aşmasına bağlıdır. Havadaki bağıl nemin yüzde 100′e ulaştığı noktaya doyma noktası denir. Doyma noktası aşıldığı takdirde hava su buharının fazlasını taşıyamaz. Fazla olan su buharı sıvı ya da katı hale dönüşür.\n" +
                    "\n" +
                    "Yoğunlaşma sonucunda çok küçük su taneciklerinin bir araya gelmesiyle bulutlar oluşur. Bulutlar oluştukları yükseklikler dikkate alınarak üç gruba ayrılır.\n" +
                    "\n" +
                    "Yüksek bulutlar (Sirüs): Saçak, tüy, ya da ince iplikler biçimindeki bulutlardır. Yüksek bulutlar genelde yağış getirmezler. Bunlar, bir siklonun yaklaştığının ve havanın bozacağının habercisidirler.\n" +
                    "\n" +
                    "Orta yükseklikteki bulutlar (Kümülüs): Kümeler biçimindeki bulutlardır. Genelde alt kısımları düz ve siyah olur. Alt kısımlarının düz olmasının nedeni yoğunlaşmanın aynı seviyeden başlamasıdır. Siyah olmasının nedeni ise iri su taneciklerinden oluşmasıdır. Bu gruptaki bazı bulutlar yükseklere doğru büyür ve sağanak şeklinde şiddetli yağmurlar getirir.\n" +
                    "\n" +
                    "Alçak bulutlar (Stratüs): Yer’in üstünde, asılı gri bir tabaka gibi duran koyu renkli bulutlardır. Genelde yağışlara yol açarlar. Belirli bir anda gökyüzünün bulutlarla kaplı kısmının tüm gökyüzüne olan oranına bulutluluk denir.",
            "Yağış Türleri ve Etkileri\n" +
                    "Atmosferdeki su buharının yoğunlaşarak sıvı ya da katı biçimde yeryüzüne düşmesine yağış denir. Başlıca yağış türleri şunlardır:\n" +
                    "\n" +
                    "1. Çiy Nedir?\n" +
                    "Havadaki su buharının soğuk zeminler üzerinde, su tanecikleri şeklinde yoğunlaşmasıyla oluşur. Özellikle bahar aylarında görülür.\n" +
                    "2. Kırağı Nedir?\n" +
                    "Havadaki su buharının soğuk cisimler üzerinde, 0°C den düşük sıcaklıklarda kristaller şeklinde yoğunlaşmasıyla oluşur. Sonbahar aylarında ya da kış başlarında görülür.\n" +
                    "3. Kırç Nedir?\n" +
                    "Havadaki su buharının çok soğumuş ağaç dalları, tel, saçak, vb. cisimler üzerinde yoğunlaşarak buz tabakası haline gelmesidir. Kırağıdan ayrılan yönü, kristallerin üst üste yığılarak buz tabakası haline gelmesidir.\n" +
                    "4. Yağmur Nedir?\n" +
                    "Bulutu oluşturan su taneciklerinin büyümesiyle oluşan su damlalarıdır. Yoğunlaşmanın devam etmesi ile ağırlığı artan su damlaları yağış şeklinde yere düşer.\n" +
                    "5. Kar Nedir?\n" +
                    "Su buharının, yükseklerde 0°C’nin altında yavaş yavaş yoğunlaşmasıyla oluşan buz kristalleri yere düşer. Bu tür yağışlara kar denir.\n" +
                    "6. Dolu Nedir?\n" +
                    "Hava sıcaklığının birden bire ve büyük ölçüde azalması sonucu yağmur damlaları donarak buz parçacıkları halinde yere düşer. Bu yağışlara da dolu denir.\n",
            "Yamaç Yağışları (Orografik Yağışlar)\n" +
                    "Nemli hava kütlelerinin, yatay yönde hareket ederken dağ yamaçlarına çarparak yükselmesi ve soğuması sonucu oluşan yağışlardır. Dünya’da en çok, Güneydoğu Asya’da, Orta kuşaktaki karaların batı kıyılarında ve sıcak kuşaktaki karaların doğu kıyılarında görülür. Türkiye’de ise, Toroslar’ın güneybatıya, Karadeniz Dağları ile Yıldız Dağları’nın kuzeye bakan yamaçlarında fazlaca görülür.",
            "Konveksiyonel Yağışlar (Yükselim Yağışları)" +
                    "Güneşli ve rüzgârsız günlerde ısınan hava yükselerek soğur. Belli bir yükseltiden sonra nemin yoğunlaşması ile yağış meydana gelir. Dünya’da en çok, Ekvatoral bölgede rastlanır. Türkiye’de ise, İç Anadolu Bölgesi’nde İlkbahar’da görülen yağışlar konveksiyonel yağışlardır. Bu yağışlar halk arasında kırkikindi yağışları olarak bilinir.",
            "Cephe Yağışları (Frontal – Depresyon(ik) Yağışlar)" +
                    "Sıcak ve soğuk hava kütlelerinin karşılaşma alanlarında meydana gelen yağışlardır. Dünya’da en çok, Orta kuşakta ve 60° enlemleri civarında görülür. Türkiye’de, özellikle kış mevsiminde görülen yağışların çoğu cephesel kökenlidir.",
            "Yağışların Yeryüzüne Dağılışı\n" +
                    "Genel hava dolaşımı, kara ve deniz dağılışı, yer şekilleri yükselti gibi nedenlerden dolayı yeryüzünün her tarafı aynı oranda yağış almaz.\n" +
                    "\n" +
                    "Dünyadaki en yağışlı bölgeler;\n" +
                    "Ekvatoral bölge, Muson bölgeleri ve Orta kuşak karalarının batı kıyılarıdır.\n" +
                    "\n" +
                    "Dünyadaki en kurak bölgeler: \n" +
                    "Orta kuşak karalarının dağlarla çevrili iç kısımları, dönenceler civarı, çevresine göre, alçakta kalmış yerler ve kutup çevreleridir.",
    };
    public static String BasincVe[] = {
            "Rüzgarlar\n" +
                    "Yüksek basınç (antisiklon) alanlarından alçak basınç (siklon) alanlarına doğru olan yatay hava akımlarına rüzgâr denir. Rüzgârın yönü, coğrafi yönlerle ifade edilir. Rüzgâr hızı anemometre adı verilen aletle ölçülür.",
            "üzgârın Hızını Etkileyen Faktörler\n" +
                    "* Basınç farkı: Rüzgârın hızı basınç farkıyla doğru orantılıdır. Basınç farkı çok ise rüzgâr hızlı, basınç farkı az ise rüzgâr yavaş eser. İki bölge arasındaki basınç farkının sona ermesi ile rüzgâr etkinliği kaybeder.\n" +
                    "\n" +
                    "* Basınç merkezleri arasındaki uzaklık-mesafe: Aynı basınç farklarına sahip, birbirinden farklı uzaklıktaki noktalar arasında rüzgârların hızı farklıdır. Birbirine yakın olan noktalar arasında, izobar yüzeylerinin eğimi fazladır ve rüzgâr hızlı eser. Birbirine uzak olan noktalar arasında ise, izobar yüzeylerinin eğimi azdır ve rüzgâr yavaş eser.\n" +
                    "\n" +
                    "* Dünya’nın Dönmesi (Merkezkaç Etkisi): Dünya’nın dönüşüne bağlı olarak rüzgârlar, düz çizgiler yerine saparak hareket ederler. Bu sapmalar ise onlara hız kaybettirir.\n" +
                    "\n" +
                    "* Yer Şekilleri (Sürtünme): Engebeli arazilerde rüzgârlar çok fazla engellerle karşılaştığı için hızları azalır. Bundan dolayı, rüzgârların hızı, sürtünmenin azaldığı düz ve açık alanlarda fazladır.",
            "Rüzgarın Yönünü Etkileyen Faktörler\n" +
                    "* Basınç merkezlerinin konumu-yeri: Rüzgârın yönünü belirleyen, öncelikle basınç merkezlerinin konumudur. Basınç merkezleri yer değiştirdikçe rüzgârın yönü de değişir.\n" +
                    "\n" +
                    "* Yeryüzü Şekilleri: Rüzgârlar basınç merkezleri arasında hareket ederken, yeryüzü şekillerine çarparak yön değiştirirler. Bir bölgede rüzgârın yıl içerisinde en fazla estiği yöne hakim rüzgâr yönü denir. Hakim rüzgâr yönü yer şekillerine göre ortaya çıkar.\n" +
                    "\n" +
                    "* Dünya’nın Dönmesi: Dünya’nın kendi ekseni etrafında dönmesi sonucunda, rüzgârlar basınç merkezleri arasındaki en kısa yolu izleyemezler. Rüzgârlar, Kuzey Yarım Küre’de hareket yönünün sağına, Güney Yarım Küre’de ise hareket yönünün soluna saparlar.\n" +
                    "\n" +
                    "Yüksek basınç alanlarında rüzgârlar, merkezden çevreye doğru hareket ederler.\n" +
                    "\n" +
                    "Alçak basınç alanlarında ise rüzgârlar, çevreden merkeze doğru hareket ederler.",
            "Rüzgar Çeşitleri\n" +
                    "— Sürekli (Yıllık) Rüzgârlar:\n" +
                    "\n" +
                    "Yıl boyunca alçak ve yüksek basınç rüzgarları arasında esen rüzgarlara denir. Bu rüzgarlar okyanus akıntılarına yön verir ve yeryüzünün iklimlerin (makro klima) üzerinde etkili olurlar.\n" +
                    "\n" +
                    "* Alize Rüzgârları: 30° Kuzey ve 30° Güney enlemlerindeki dinamik yüksek basınç alanlarından, Ekvator’daki termik alçak basınç alanına doğru esen rüzgârlardır. Alize rüzgarlarına ters yönde esen rüzgarlara ters alizeler denir. Tropikal Kuşak rüzgarlarıdır.\n" +
                    "\n" +
                    "– Başlangıçta sıcak ve kurudurlar. Ancak, denizler üzerinden geçerken nem kazanırlar.\n" +
                    "– Tropikal kuşaktaki karaların doğu kıyılarına bol yağış bırakırlar. Bu nedenle Doğu rüzgârları da denir.\n" +
                    "– Sürekli olmaları ve yönlerinin belli olması nedeniyle, yelkenli gemiler döneminde bu rüzgârlardan faydanılmıştır. Bu nedenle bu rüzgârlara ticaret rüzgârları (trade winds) da denilmiştir.\n" +
                    "– Ekvatoral bölgede karşılaşan Alizeler, 3 – 4 km kadar yükselerek kutuplara doğru hareket ederler. Bunlara da ters alize (üst alize) adı verilir.\n" +
                    "– Ters alizeler, dönenceler üzerinde alçalarak tropikal çöllerin oluşmasına neden olurlar. Sıcak okyanus akıntılarının oluşumuna neden olurlar.\n" +
                    "\n" +
                    "* Batı Rüzgârları: 30° enlemlerindeki dinamik yüksek basınç alanlarından, 60° enlemlerindeki dinamik alçak basınç alanlarına doğru esen rüzgârlardır. Türkiye batı rüzgarları kuşağında yer alır.\n" +
                    "\n" +
                    "– Başlangıçta sıcak ve kurudurlar. Ancak, denizler üzerinden geçerken nem kazanırlar.\n" +
                    "– Orta kuşaktaki karaların batı kıyılarına bol yağış bırakırlar. Orta kuşak rüzgarlarıdır.\n" +
                    "– 60° enlemleri civarında Kutup rüzgârları ile karşılaşarak cephe yağışlarına yol açarlar.\n" +
                    "\n" +
                    "* Kutup Rüzgârları: Kutuplardaki termik yüksek basınçlardan, 60° enlemlerindeki dinamik alçak basınç alanlarına doğru esen rüzgârlardır. Özellikleri;\n" +
                    "\n" +
                    "– Soğuk ve kuru oldukları için, etkili oldukları alanlarda sıcaklığı azaltarak kar yağışlarına neden olurlar.\n" +
                    "– 60° enlemleri civarında Batı rüzgârları ile karşılaşarak cephe yağışlarına yol açarlar.\n" +
                    "– Soğuk okyanus akıntılarının oluşumuna neden olurlar.\n" +
                    "\n" +
                    "— Devirli – Mevsimlik Rüzgârlar (Musonlar)",
            "Yeryüzündeki Sürekli Basınç Alanları \n" +
                    "1. Termik Kökenli Basınç Alanları: \n" +
                    "•  Ekvatoral Alçak Basınç Alanı (Tropikal Siklon); Ekvatoral bölge üzerinde bütün Dünya’yı kuşatan sürekli bir alçak basınç alanı uzanır. Bunun nedeni buraların devamlı ısınmasıdır. Bu basınç kuşağı kışın güneye, yazın da kuzeye doğru genişler.\n" +
                    "• Kutuplar Yüksek Basınç Alanı (Polar Antisiklon); Kutuplar yıl boyunca soğuk olduklarından, buralarda sürekli bir yüksek basınç alanı oluşmuştur. Bu basınç alanı kışın genişler, yazın da daralır. \n" +
                    "2. Dinamik Kökenli Basınç Alanları:\n" +
                    "• Ekvator Üstü Yüksek Basınç Alanı (Subtropikal Antisiklon); Ekvatoral bölgede, ısınarak yükselen hava kütleleri üst alizeler halinde kutuplara doğru eserken, gerek Dünya’nın ekseni etrafında dönmesinden, gerekse yerçekimi ve soğumadan dolayı 30° enlemleri civarında alçalır. Sonuçta, bu enlemlerde yüksek basınç alanı oluşur. \n" +
                    "\n" +
                    "• Kutup Altı Alçak Basınç Alanı (Subpolar Siklon); Batı ve Kutup rüzgârları, 60° enlemleri civarında karşılaştıktan sonra yükselirler. Sonuçta bu enlemlerde alçak basınç alanı oluşur.",
            "Basınç Alanlarının Genel Özellikleri\n" +
                    "Alçak basınç alanlarının genel özellikleri: Yükselici hava hareketi vardır. Hava hareketi çevreden merkeze doğrudur. Yıllık yağışı fazla olan yerlerdir. Gökyüzü kapalı-bulutludur. Yerin ısı kaybı azdır. Sıcaklık farkı az olur. Bitki örtüsü gürdür.\n" +
                    "\n" +
                    "Yüksek Basınç alanlarının genel özellikleri: Alçalıcı hava hareketi vardır. Hava hareketi merkezden çevreye doğrudur. Az yağış alan yerlerdir. Gökyüzü açıktır. Yerin ısı kaybı fazladır. Sıcaklık farkı fazladır. Bitki örtüsü cılızdır. Kışın karasal bölgelerde, ayaz oluşumuna sebep olur.",
            "Basınç Merkezlerinin Konumu ve Özellikleri:\n" +
                    "Genel olarak Coriolis Kuvveti’ne bağlı olarak, rüzgarlar Kuzey Yarım Küre’deki yüksek basınç alanlarında saat ibresi yönünde sağa doğru saparken, alçak basınç alanlarında sola doğru sapar. Güney Yarım Küre’de bu durumun tersi görülür.",
    };
    public static String sicaklik[] = {
            "Isı ve Sıcaklık\n" +
                    "Isı ve sıcaklık farklı kavramlardır. Sıcaklık, bir sistemde rastgele hareket eden moleküllerin ortalama kinetik enerjisinin bir göstergesidir. Maddenin molekül veya atomlarının ortalama kinetik enerjisi artarsa sıcaklığı da artar. Sıcaklık, skaler bir\n" +
                    "büyüklüktür, termometre ile ölçülür. SI birim sisteminde sıcaklık birimi Kelvin’dir ancak günlük yaşantıda çoğunlukla Celcius derece (˚C )kullanılır.",
            "Termometreler\n" +
                    "Bir maddenin sıcaklığını ölçmek için kullanılan aletlere termometre denir. Sıcaklığın termometre ile ölçülmesi algılama farklılığından kaynaklanan farklı sonuçları ortadan kaldırır.\n" +
                    "\n" +
                    "Metal Termometreler: Genellikle yüksek sıcaklıkları ölçmek için tasarlanmıştır. Fabrikalarda yüksek sıcaklık ölçümlerinde, fırınlarda ve sanayide kullanılır.\n" +
                    "\n" +
                    "Sıvılı Termometreler: Sıvılı termometreler ile genellikle orta derecede sıcaklıklar ölçülür. Sıvılı termometrelerde alkol ya da cıva kullanılır. Bunun nedeni bu sıvıların sıcaklık değişimine bağlı olarak oldukça iyi genleşmeleridir. Bir sıvılı termometrenin ölçebileceği en yüksek sıcaklık değeri o termometrede kullanılan sıvının cinsine bağlıdır. Bir sıvılı termometre ile ölçüm yaparken termometre sıvısının hal değiştirmemesi gerekir.\n" +
                    "\n" +
                    "Gazlı Termometreler: Düşük sıcaklıklarda daha hassas ölçüm yapmak için gazlı termometreler kullanılır.\n" +
                    "\n" +
                    "Pirometre:Sıcaklığın yaklaşılmayacak kadar yüksek olduğu veya temas edilmeden ölçüm yapmak istediğimiz durumlarda kullanılan termometredir.",
            "Sıcaklık Ölçekleri\n" +
                    "Termometreler tasarlanırken saf suyun donma sıcaklığı ve saf suyun kaynama sıcaklığı belirlenerek, iki değer arası eşit bölmelere ayrılır.Celsius, Fahrenheit ve Kelvin termometreleri şekillerdeki gibi ölçeklendirilmiştir.\n" +
                    "\n" +
                    "Burada, dikkat edilirse; Celsius termometresinin 1 bölmesi (1 °C’lık değişime), Fahrenheit termometresinin 1,8 bölmesine (1 ,8 °F’lık değişime) ve Kelvin termometresinin 1 bölmesine (1K’lık değişime) karşılık gelmektedir.",
            "Öz Isı ve Isı Sığası\n" +
                    "Saf bir maddenin 1 gramının sıcaklığını 1˚C artırmak için gerekli ısı miktarına öz ısısı denir. Öz ısı “c” ile gösterilir birimi joule/kg veya cal/g ˚C ve maddeler için ayırt edici bir özelliktir. Öz ısı ile ilgili olarak;\n" +
                    "\n" +
                    "– Öz ısı saf maddeler için ayırt edici bir özelliktir.\n" +
                    "– Öz ısı madde miktarına bağlı olarak değişmez.\n" +
                    "– Eşit miktarda farklı cins maddelere, eşit miktarda ısı verildiğinde öz ısısı az olan sıvının sıcaklığı daha fazla artar.\n" +
                    "– Eşit miktarda farklı cins maddelerin çevreye verdikleri ısı, öz ısısı fazla olanın daha fazladır.\n" +
                    "– Denizlerin karalardan daha geç ısınıp soğumasının nedeni suyun öz ısısı diğer maddelere göre fazla olmasıdır.\n" +
                    "\n" +
                    "Bir maddenin sıcaklığını 1 ˚C artımak için gerekli ısı miktarına ısı sığası veya ısı kapasitesi denir C ile gösterilir . Matematiksel olarak;\n" +
                    "\n" +
                    "Isı sığası= Kütle. Öz ısı   \n" +
                    "\n" +
                    "C= m.c    şeklinde ifade edilir.",
            "Hal Değişimi\n" +
                    "Bir maddeye ısı verildiğinde ya da madde ile çevresi arasında ısı alış – verişi olurken maddenin sıcaklığı değişir. Ancak ısı alış – verişi sırasında maddenin sıcaklığının değişmediği durumlar da vardır. Bu durumlar maddenin katıdan sıvıya geçmesi (erime), sıvıdan gaza geçmesi (buharlaşma), gazdan sıvıya geçmesi (yoğunlaşma), sıvıdan katıya geçmesi (donma) dır. Bu olaylara hal değişimi ya da faz değişmesi denir.",
            "Hal Değiştirme Isısı\n" +
                    "1 gram maddenin hal değiştirmesi için gerekli olan ısı miktarına, hal değiştirme ısısı denir. Ayırt edici bir özelliktir. L harfi ile gösterilir. Madde eriyorsa erime ısısı, donuyorsa donma ısısı denir. Aynı cins maddelerin erime ve donma ısıları eşittir. Bu nedenle 1 gram buzun erimesi için gerekli olan ısı değeri ile 1 gram suyun donarken ortama verdiği ısı değeri aynıdır. Bu değer ise 80 kaloridir.",
            "Isıl Denge\n" +
                    "Sıcaklıkları farklı maddelerin aralarındaki ısı akışı, maddelerin sıcaklıkları eşitlenince durur. Bu sıcaklığa denge sıcaklığı denir. Denge sıcaklığı Td ile gösterilir.\n" +
                    "\n" +
                    "– Denge sıcaklığında olan maddeler ısıl (termal) dengedeki maddeler adı verilir. Isıl dengedeki maddelerin sıcaklıkları eşittir.\n" +
                    "– Maddelerin denge sıcaklığı, sıcaklığı büyük olan maddeninkinden daha büyük; sıcaklığı küçük olanından küçük olamaz.\n" +
                    "– Dış ortamdan izole edilmiş ve birbirine temas eden iki maddenin arasındaki ısı alışverişinde maddeler ısıl dengeye ulaştığında birinin verdiği ısı miktarı diğerinin aldığı ısı miktarına eşittir. Bu durumu matematiksel olarak;\n" +
                    "\n" +
                    "Qalınan=Qverilen",
            "Enerji İletim Yolları\n" +
                    "Isı enerjisi, bir maddeden başka bir maddeye bir yerden başka bir yere üç farklı yolla transfer olur: İletim yoluyla, konveksiyon (dolanım) yoluyla ve ışıma yoluyla.\n" +
                    "\n" +
                    "Isının İletim Yoluyla Yayılması: Katı maddelerin atom veya moleküllerinin enerjilerini birbirlerine aktarmasına ısının iletim yoluyla yayılması denir. Isının iletim yoluyla yayılması için mutlaka ortama ihtiyaç vardır.\n" +
                    "\n" +
                    "Isının Konveksiyon Yoluyla Yayılması: Maddenin sıcaklığının yüksek olduğu yerde yoğunluğu daha azalır, sıvı ve gaz maddelerde bu yoğunluk farkı olur. Sıvı ve gaz maddelerde bu yoğunluk farkından dolayı atom ve moleküller yer değiştirirler bu\n" +
                    "sayede enerji madde içinde taşınmasına ısının konveksiyon yoluyla yayılması denir.\n" +
                    "\n" +
                    "Isının konveksiyon yoluyla yayılması için mutlaka madesel ortama ihtiyaç vardır. Sobanın odayı ısıtması ve tenceredeki suyun kaynaması ısının konveksiyon yoluyla yayılmasına örnek verilebilir.\n" +
                    "\n" +
                    "Isının Işıma Yoluyla Yayılması: Dünyamızın en önemli enerji kaynağı olan Güneş bize enerjisini ışıma yoluyla iletmektedir. Isının maddesel ortama ihtiyaç duymadan yayılmasına ısının ışıma yoluyla yayılması denir.",
            "Katı Maddelerdeki Enerji İletim Hızı\n" +
                    "Farklı maddelerin enerji iletim hızları farklıdır. Metallerin enerji aktarım hızları diğer maddelere göre daha fazladır. Metallerin enerji aktarım hızları serbest elektron sayılarına bağlı olarak değişiklik gösterir.\n" +
                    "\n" +
                    "Maddelerin ısı iletkenliğini ısı iletim katsayısı ile ifade edilir.1 m2’lik yüzey alanına sahip maddelerin iki yüzeyi arasındaki sıcaklık farkından dolayı bir yüzeyinden diğer yüzeyine en kısa mesafede birim zamanda geçen ısı miktarına ısı iletkenlik katsayısı denir.\n" +
                    "\n" +
                    "Birimi watt/metre. kelvin’dir. Isı iletkenlik katsayısı maddeler için ayırdedici bir özelliktir. Maddelerin ısı iletim hızı;\n" +
                    "\n" +
                    "– Maddenin cinsine,\n" +
                    "– Maddenin iki ucu arasındaki sıcaklık farkına,\n" +
                    "– Maddenin kalınlığına,\n" +
                    "– Enerji iletiminin gerçekleştiği maddenin yüzey alanına bağlıdır.",
            "Enerji Tasarrufu\n" +
                    "Ülkemizde de enerji tasarrufu sağlamak için binalarda ısı yalıtımı zorunlu hâle getirilmiştir. Enerji iletim hızı düşük olan maddelere yalıtım malzemeleri denir.\n" +
                    "\n" +
                    "Binanın yalıtım malzemeleriyle kaplanarak yapılan enerji yalıtım işlemlerine “mantolama” adı verilir.",
            "Küresel Isınma ve Sera Etkisi\n" +
                    "Son yıllarda, Dünya üzerinde yapılan ölçümler, hava, kara ve deniz sıcaklıklarının ortalama değerlerinin önceki yıllara göre arttığını göstermektedir. Ortalama sıcaklıklardaki bu artışa küresel ısınma denir. Küresel ısınmanın ana sebeplerinden biri insanların doğaya verdikleri zararlardır. Kullandığımız, fosil yakıtlardan çıkan sera gazları, kişisel bakım Ürünleri, parfüm ve deodorant küresel ısınmayı tetiklemektedir. Bunların yanında güneşte meydana gelen periyodik olaylar da (patlama gibi) küresel ısınmaya sebep olmaktadır.",
            "Küresel ısınma;\n" +
                    "– Dünya üzerinde iklim değişikliğine,\n" +
                    "– Buzulların erimesine,\n" +
                    "– Canlı türlerinin yok olmasına (özellik deniz canlılarının),\n" +
                    "– Deniz seviyesinin yükselmesi sonucu içme suyu sıkıntısına,\n" +
                    "– Tarımsal kuraklığa, ve bunlar gibi, yaşamımızı doğrudan etkileyen olaylara neden olmaktadır.\n" +
                    "– Küresel ısınmayı engellemek için alınabilecek bireysel önlemlerden bazıları,\n" +
                    "\n" +
                    "Küresel Isınmayı Önlemek İçin Alınması Gereken Önlemler\n" +
                    "– Standart ampulünüzü tasarruf ampulü ile değiştirin ve bir yıldaki karbondioksit salınımını 75 kg azaltın.\n" +
                    "– Toplu taşıma araçları kullanın, yürüme mesafelerine yürüyerek gidin.\n" +
                    "– otomobillerin hava ve yakıt filtrelerini temiz tutun.\n" +
                    "– Geri dönüşüme mutlaka önem gösterin.\n" +
                    "– Daha az sıcak su kullanarak enerji kullanımını azaltın.\n" +
                    "– Elektronik cihazlarınızı (televizyon, müzik çalar gibi) tamamen kapatın (kapama düğmesinden ya da fişten çekin)\n" +
                    "– Her yıl mutlaka ağaç dikin.\n" +
                    "– Parfüm ve deodorant kullanımınızı azaltın.",
    };
    public static String dogaveinsan[] = {
            "İnsanların yaşamları boyunca ilişki içerisinde oldukları ve karşılıklı etkileşimde bulundukları fiziki, sosyal, ekonomik ve kültürel ortama doğal ortam adı verilir. Doğal ortam içerisinde yer alan, oluşumunda insanın etkisinin bulunmadığı herşeye doğal unsur adı verilir.",
            "İnsanın yaşamak amacıyla bulunduğu ortama doğal çevre adı verilir.\n" +
                    "\n" +
                    "Dünyanın değişik bölgelerinde yaşamlarını sürdüren insanların beslenme, barınma ve giyinme gibi temel yaşamsal faaliyetlerinin birbirine göre büyük farklılıklar gösterdiği görülür. Bu farklılığın temel nedeni doğal ortamın farklılık göstermesidir.",
            "İnsanın yaşadığı bu doğal ortam, atmosfer (hava küre), litosfer (taş küre), hidrosfer (su küre) ve biyosfer (canlılar küresi) olmak üzere dört temel ortamdan oluşmaktadır.\n" +
                    "\n" +
                    "Atmosfer (Hava Küre): Dünyamızı çepeçevre saran ve çeşitli gazların karışımından oluşan doğal ortamdır. Bulutluluk, nemlilik, sis ve yağış gibi tüm hava olayları atmosferde meydana gelir. Atmosfer olaylarını coğrafyanın alt dallarından klimatoloji bilimi inceler. Atmosferin %78’i azot, %21’i oksijen ve %1’i de diğer gazlardan (asal gazlar) oluşur.\n" +
                    "\n" +
                    "Hidrosfer (Su Küre): Akarsular, göller, denizler, bataklıklar ve okyanuslar ile tüm yer altı sularının hepsine birden verilen isimdir. Su küreyi coğrafyanın alt dallarından Hidrografya bilimi inceler. Gezegenimizin 4’te 3’ü denizler ve okyanuslar başta olmak üzere sulardan oluşmaktadır.\n" +
                    "\n" +
                    "Litosfer (Taş Küre): Yer kabuğunun en dış bölümüdür. Sial ve sima olarak ikiye ayrılır. Litosfere taşküre denilmesinin sebebi bileşiminin kayaçlardan oluşmasıdır. Dağlar, taşlar, vadiler ve platolar litosferi oluşturan başlıca unsurlardır. Taş küre üzerindeki yer şekillerinin oluşum özelliklerini coğrafyanın alt dallarından olan jeomorfoloji bilimi inceler.\n" +
                    "\n" +
                    "Biyosfer (Can Küre):Litosfer, atmosfer ve hidrosferden oluşan doğal ortam içerisinde canlılar yaşar. Canlılarda doğal ortamın bir parçası olduklarından ve insan yaşamını doğrudan ilgilendirdiklerinden coğrafyanın, dolayısıyla yeryüzü kavramının bir ögesini oluştururlar. Biyocoğrafya; doğayı oluşturan dört unsur (muhteşem dörtlü) içerisinde bileşke konumundadır. Canlılar küresini coğrafyanın alt dallarından biyocoğrafya bilimi inceler.",
            "İnsanın doğal ortam ile etkileşimine örnekler\n" +
                    "– Barajların yapılması\n" +
                    "– Bataklıkların kurutulması\n" +
                    "– Tüneller, köprüler ve viyadüklerin yapılması\n" +
                    "– Sulama kanallarının yapılması\n" +
                    "– Maden ocaklarının işletilmesi\n" +
                    "– Ormancılık faaliyetleri\n" +
                    "– Ormancılık faaliyetleri\n" +
                    "– Kanalların yapılması\n" +
                    "– Deniz kıyılarına setlerin yapılması",
            "Doğal ortamın insanla etkileşimine örnekler;\n" +
                    "– Soğuk iklim bölgelerinde evlerin kalın duvarlı, küçük pencereli ve dik çatılı olması\n" +
                    "– Güneydoğu Asya da yaşayan insanların temel besin kaynaklarının pirinç olması\n" +
                    "\n" +
                    "– Orta kuşakta yaşayan insanların mevsimlere göre giysi ihtiyaçlarının fazla olması\n" +
                    "\n" +
                    "– Yer şekillerinin engebeli olduğu Doğu Karadeniz kıyılarında temel geçimin balıkçılık olması\n" +
                    "– Doğu Anadolu bölgesinde kar yağışı ve don olaylarının ulaşımı olumsuz etkilemesi\n" +
                    "– Deprem, tsunami, kasırga gibi olayların can ve mal kaybına neden olması.",
            "Doğanın İnsana Etkisi\n" +
                    "Olumlu Etkileri\n" +
                    "\n" +
                    "1. Doğa mutluluk verir ve hayatı anlamlandırmamızda kolaylık sağlar!\n" +
                    "\n" +
                    "2. Şehirde yaşayanlara kıyasla doğada yaşayanlar daha az strese maruz kalır!\n" +
                    "\n" +
                    "3. Doğa en doğal antideprasandır.\n" +
                    "\n" +
                    "4. Doğada yürüyüş yapmak bağışıklık sistemimizi ve kaslarımızı güçlendirir.\n" +
                    "\n" +
                    "5. Doğada zaman geçirmek yaratıcılığımızı artırır.\n" +
                    "\n" +
                    "6. Doğayla iç içe yaşamak acılara dayanma gücümüzü artırıyor.\n" +
                    "\n" +
                    "Olumsuz Etkileri\n" +
                    "\n" +
                    "1. Doğal afetler can ve mal kaybına neden olur.\n" +
                    "\n" +
                    "2. Aşırı kar yolları kapatır.\n" +
                    "\n" +
                    "3. Sis deniz trafiğini engeller.",
            "İnsanın Doğaya Etkisi\n" +
                    "İnsan, coğrafi ortamda yaşamsal etkinliklerini gerçekleştirirken yaşadığı yerin doğal ortam özellikleri ile etkileşim hâlindedir\n" +
                    "\n" +
                    "Zaman içinde insanın bilgi birikiminin artması, bilim ve tekniğin ilerlemesi, teknolojik araçların hızla çoğalması; insanların ihtiyaçlarının artmasına ve çeşitlenmesine neden olmuştur. İnsanlar, çeşitlenen ve artan ihtiyaçlarını karşılayabilmek için doğaya birtakım müdahalelerde bulunmuştur. Bu müdahaleler, bazen doğanın işleyişiyle uyumluyken bazen de doğanın işleyişine zarar vermiştir.",
    };
    public static String FizikGiris[] = {
            "Madde enerji etkileşimini inceleyen, doğa olaylarını araştıran bilim dalına fizik denir. Doğadaki olayları incelerken deney sonuçları ile güçlendirip mantıklı bir şekilde açıklar.",
            "Fizik ise maddeyi, enerjiyi ve madde ile enerji arasındaki ilişkiyi inceleyen bilim dalıdır. Eski Yunancada “doğa” anlamına gelen “physic” aynı zamanda en temel doğa bilimi olarak adlandırılır.\n" +
                    "\n" +
                    "Evrenin yapısını ve gelişimini inceleyen bilim dalıdır. Evrenbiliminde, fizik ve gökbilimi (astronominin) bilgilerinden yararlanılmaktadır.",
            "Mekanik: Kuvvet, hareket ve enerji ilişkisini inceler. Işık hızından çok daha küçük hızlardaki cisimlerin hareketini inceler.\n" +
                    "\n" +
                    "Elektrik: Elektrik yükünü, elektrik akımını, yükün hareketsiz durumunu, potansiyelini, elektrik alan ve elektrik kuvveti inceler.\n" +
                    "\n" +
                    "Manyetizma: Mıknatıs, manyetik alan, manyetik kuvvet ve bunların etkileşimini araştırır ve bunların elektrik sistemlerindeki etkilerini araştırır.\n" +
                    "\n" +
                    "NOT: Elektrik ve manyetizma alt dalları, elektromanyetizma olarak da bilinir.",
            "Elektromanyetizma: Sabit veya hareket halindeki elektrik yüklerinin manyetik ve elektrik alanlarla etkileşimi.\n" +
                    "\n" +
                    "Optik: Işığın yapısını ve Işık olaylarını inceler. Işığın yapısı, ışıkta kırılma, yansıma, kırınım ve girişim olayları, mercek, dürbün, mikroskop ve teleskop gibi araçların yapımı.\n" +
                    "\n" +
                    "Termodinamik: Isı enerjisini, madde içinde yayılmasını inceler. Isı ve sıcaklık olaylarını ve ısının maddeyle etkileşimini inceler. Enerji, enerji değişimleri, enerji aktarımları, enerji dönüşümleri, ısı, sıcaklık, genleşme ve bunlar arasındaki ilişkiler.",
            "Atom fiziği: Atomun molekül yapısını ve etkileşimini, atom altı parçacıkları inceler. Atomların etkileşimleri, atomun, moleküllerin yapısı, enerji düzeyleri, dalga fonksiyonlar ve elektromanyetik geçişler.\n" +
                    "\n" +
                    "Nükleer fizik: Atom çekirdeğinin yapısını, kararsız çekirdeklerin nasıl ışıma yaptığını, Atom çekirdeği ve radyoaktif elementleri inceler. Çekirdekte bulunan proton ve nötronların etkileşimleri, nötron ve protonları bir arada tutan nükleer kuvvetler, çekirdeğin saldığı ışımalar ve bunların etkileri.\n" +
                    "\n" +
                    "Katıhal fiziği: Yoğun haldeki maddelerin, elektriksel, manyetik, esneklik özelliklerini ve özellikle kristal yapılarını inceler.\n" +
                    "\n" +
                    "Yüksek enerji ve plazma fiziği: Yüksek enerjili parçacıkların etkileşimini ve maddenin plazma durumunu inceleyen modern fizik dalıdır. Maddenin temel yapısı ve temel yapı taşlarının birbirleriyle etkileşimini inceler.",
            "Temel büyüklükler: Kendisinden başka hiçbir niceliğin ölçülmesine gerek olmadan ifade edilen büyüklüklere temel büyüklük denir.\n" +
                    "\n" +
                    "Türetilmiş büyüklükler: Nicel gözlem sonucu, birden fazla temel büyüklük kullanılarak ifade edilen büyüklüğe türetilmiş büyüklük denir.",
            "Fizik bilimi, herhangi bir büyüklüğü skaler ve vektörel olmak üzere iki şekilde sınıflandırır.\n" +
                    "\n" +
                    "Skaler Büyüklük: Belirtirken yön gerektirmeyen, yalnızca bir sayı ve birimle belirtilebilen büyüklüklere skaler büyüklük denir.\n" +
                    "\n" +
                    "Vektörel Büyüklük: sayı ve birimin yanında bir de yöne sahip olan büyüklüklere vektörel büyüklükler denir.",
    };
    public static String MaddeveOz[] = {
            "Kütle (m): Bir maddenin sahip olduğu madde miktarına kütle denir. Kütle “m” harfi ile gösterilir.\n" +
                    "\n" +
                    "Kütle, bir cisimdeki madde miktarının ölçüsüdür. Aynı zamanda cismin hareket etmeye karşı gösterdiği direnç olarak da adlandırılabilir. Kütle her yerde aynı değere sahiptir.\n" +
                    "\n" +
                    "Kütlenin SI birim sistemindeki birimi kilogram’dır. Bu kg. olarak kısaltılır. Kullanılan diğer birimler gram, ton ve pound’dur. Görelilik teorisine göre duran kütle m ile enerji E arasında E = mc2 bağlantısı olduğundan enerji birimi olan elektronVolt (eV) da kütle için kullanılabilir. Özellikle kütle ve enerjinin birbirine dönüşebildiği parçacık fiziğinde eV sık kullanılmaktadır. (yaklaşık 1 eV=1.783 × 10-36 kg).",
            "Hacim: Bir cismin evrende kapladığı yere hacim denir. Hacim “V” harfiyle gösterilir ve Uluslararası Birim Sistemi (SI)’de birimi m³’tür. En yaygın hacim birimleri metreküp, desimetreküp, santimetreküp, milimetreküp’tür.",
            "Özkütle (d): Bir maddenin birim hacminin kütlesine özkütle denir. Özkütle “d” harfi ile gösterilir. Maddelerin 1 cm3’ünün gram cinsinden kütlesine öz kütle denir. Öz kütle (d) ile gösterilir.\n" +
                    "\n" +
                    "Kütle (m) ve hacim (V) arasında d=m/v bağıntısı vardır. Öz kütlenin birimi g/cm3 dür.\n" +
                    "\n" +
                    "– Saf maddelerin (element ve bileşik) öz kütleleri sabittir. Karışımların öz kütleleri ise sabit değildir.\n" +
                    "– Bir maddenin öz kütlesinden söz ederken sabit bir sıcaklıktaki öz kütlesinden söz edilmelidir.\n" +
                    "– Sıcaklık değiştiğinde maddenin hacmi değişeceğinden öz kütlesi de değişir. Özellikle gazlardaki değişiklik daha belirgindir.\n" +
                    "– Öz kütle, maddenin karakteristik özelliği olmasına rağmen yalnız öz kütlesi bilinen bir maddenin hangi madde olduğu anlaşılamayabilir.\n" +
                    "– Bir maddenin hangi madde olduğunun anlaşılabilmesi için birden fazla ayırt edici özelliğinin incelenmesi gerekir.\n" +
                    "– Kütlesi artan bir maddenin hacmide artar dolayısıyla, hacimle kütle doğru orantılı değiştiği için öz kütle değişmez.",
            "Dayanıklılık\n" +
                    "Canlı ve cansız varlıkların dışarıdan kendilerine uygulanan kuvvete göstermiş oldukları dirence dayanıklılık denir. Cisimlere dayanma sınırından fazla kuvvet uygulandığında şekli bozulur, bükülme, çökme gibi etkiler görülür. Dayanıklılık cismin şekline, boyutlarına ve yapıldığı maddenin cinsine bağlıdır.",
    };
    public static String basinc[] = {
            "Bütün maddelerin ağırlığı vardır ve maddeler ağırlıklarından dolayı temas ettiği yüzeye basınç uygular. Maddenin ağırlığından dolayı birim yüzeye uyguladığı dik kuvvete basınç denir. Basınç P sembolü ile gösterilir ve değeri\n" +
                    "\n" +
                    "P = Fdik/A     eşitliği ile bulunur.\n" +
                    "\n" +
                    "– Bağıntıda; P: basınç, F: yüzeye uygulanan dik kuvvetin büyüklüğü, S : kuvvetin etki ettiği yüzey alanıdır.\n" +
                    "– Kuvvet birimi newton (N), yüzey alan birimi m2 alındığında basınç birimi N/m2 bulunur.\n" +
                    "– 1 N/m2 = 1 pascaldır.",
            "Sıvı ve gaz maddeler içerisinde bulunan maddelere kaldırma kuvveti uygular. Bir sıvı içerisine konulan ve sıvı\n" +
                    "içerisinde çözünmeyen cisme etki eden kaldırma kuvveti, cismin alt ve üst yüzeylerine sıvı tarafından uygulanan basınç farkından ortaya çıkar. Sıvı içerisinde bulunan cisme etki eden kaldırma kuvvetinin büyüklüğü\n" +
                    "\n" +
                    "Fk = Vbatan.dsıvı.g\n" +
                    "\n" +
                    "bağıntısı ile bulunur. Bu eşitlik cismin sıvı içerisinde ne kadar hafiflediğini\n" +
                    "de ifade eder. Cisim sıvı içerisine bırakıldığında hacmi kadar sıvı ile yer değiştirir.",
    };
    public static String isi[] = {
            "Isı ve sıcaklık farklı kavramlardır. Sıcaklık, bir sistemde rastgele hareket eden moleküllerin ortalama kinetik enerjisinin bir göstergesidir. Maddenin molekül veya atomlarının ortalama kinetik enerjisi artarsa sıcaklığı da artar. Sıcaklık, skaler bir\n" +
                    "büyüklüktür, termometre ile ölçülür. SI birim sisteminde sıcaklık birimi Kelvin’dir ancak günlük yaşantıda çoğunlukla Celcius derece (˚C )kullanılır.\n" +
                    "\n" +
                    "Maddeden maddeye veya aynı maddenin bölgeleri arasında aktarılan enerjiye ısı denir. Maddeye enerji aktarıldığında maddenin ortalama kinetik enerjisinin artmasına yani sıcaklığının artmasına neden olur. Isı skaler bir büyüklüktür. Birimi joule’dür. Isı enerjisini direk olarak bir aletle ölçemeyiz ancak kalorimetre kabı yardımıyla hesaplayabiliriz.",
            "Bir maddenin sıcaklığını ölçmek için kullanılan aletlere termometre denir. Sıcaklığın termometre ile ölçülmesi algılama farklılığından kaynaklanan farklı sonuçları ortadan kaldırır.\n" +
                    "\n" +
                    "Metal Termometreler: Genellikle yüksek sıcaklıkları ölçmek için tasarlanmıştır. Fabrikalarda yüksek sıcaklık ölçümlerinde, fırınlarda ve sanayide kullanılır.\n" +
                    "\n" +
                    "Sıvılı Termometreler: Sıvılı termometreler ile genellikle orta derecede sıcaklıklar ölçülür. Sıvılı termometrelerde alkol ya da cıva kullanılır. Bunun nedeni bu sıvıların sıcaklık değişimine bağlı olarak oldukça iyi genleşmeleridir. ",
            "Gazlı Termometreler: Düşük sıcaklıklarda daha hassas ölçüm yapmak için gazlı termometreler kullanılır.\n" +
                    "\n" +
                    "Pirometre:Sıcaklığın yaklaşılmayacak kadar yüksek olduğu veya temas edilmeden ölçüm yapmak istediğimiz durumlarda kullanılan termometredir.",
            "ermometreler tasarlanırken saf suyun donma sıcaklığı ve saf suyun kaynama sıcaklığı belirlenerek, iki değer arası eşit bölmelere ayrılır.\n" +
                    "\n" +
                    "Celsius, Fahrenheit ve Kelvin termometreleri şekillerdeki gibi ölçeklendirilmiştir.\n" +
                    "\n" +
                    "Burada, dikkat edilirse; Celsius termometresinin 1 bölmesi (1 °C’lık değişime), Fahrenheit termometresinin 1,8 bölmesine (1 ,8 °F’lık değişime) ve Kelvin termometresinin 1 bölmesine (1K’lık değişime) karşılık gelmektedir.",
            "Saf bir maddenin 1 gramının sıcaklığını 1˚C artırmak için gerekli ısı miktarına öz ısısı denir. Öz ısı “c” ile gösterilir birimi joule/kg veya cal/g ˚C ve maddeler için ayırt edici bir özelliktir. " +
                    "Bir maddenin sıcaklığını 1 ˚C artımak için gerekli ısı miktarına ısı sığası veya ısı kapasitesi denir C ile gösterilir . Matematiksel olarak;\n" +
                    "\n" +
                    "Isı sığası= Kütle. Öz ısı   \n" +
                    "\n" +
                    "C= m.c    şeklinde ifade edilir.",
            "Bir maddeye ısı verildiğinde ya da madde ile çevresi arasında ısı alış – verişi olurken maddenin sıcaklığı değişir. Ancak ısı alış – verişi sırasında maddenin sıcaklığının değişmediği durumlar da vardır. Bu durumlar maddenin katıdan sıvıya geçmesi (erime), sıvıdan gaza geçmesi (buharlaşma), gazdan sıvıya geçmesi (yoğunlaşma), sıvıdan katıya geçmesi (donma) dır. Bu olaylara hal değişimi ya da faz değişmesi denir.",
    };
    public static String enerji[] = {
            "Bir sistemin iş yapabilme yeteneğine enerji denir. Bir sistem enerjiye sahipse başka bir sisteme etkiyip ona iş yaptırabilir. Doğada mekanik, ısı, ışık, kimyasal, nükleer, elektrik enerjisi gibi çeşitli enerji biçimleri vardır.",
            "Bir cismin hareketinden kaynaklanan kinetik enerjisi ile konumundan kaynaklanan potansiyel enerjisinin toplamına mekanik enerji denir.\n" +
                    "\n" +
                    "Mekanik Enerji= Kinetik enerji + Potansiyel enerji\n" +
                    "ME=KE+PE",
            "Hareket halindeki cisimlerin sahip oldukları enerji kinetik enerjidir. Hareket halindeki arabaların, insanların, futbol topunun kinetik enerjileri vardır. Kinetik enerji cisimlerin kütlesine ve hızına bağlıdır.\n" +
                    "\n" +
                    "½×m×v² formülü ile hesaplanır.",
    };
    public static String elektrostatik[] = {
            "Elektrostatik, fizik biliminin durgun elektrik yüklerini ve bu yükler arasındaki etkileşmeyi inceleyen bölümüdür.",
            "Elektrik Yükü\n" +
                    "– Maddeler atomlardan oluşur. Atom da proton, nötron ve elektronlardan oluşur. Proton ve nötronlar atom çekirdeğinde bulunur.\n" +
                    "– Elektronlar ise, çekirdeğin çevresindeki yörüngelerde dolanır.\n" +
                    "– Protonun sahip olduğu elektrik yükü pozitif yük (+) olarak adlandırılır.\n" +
                    "– Elektronun sahip olduğu elektrik yükü negatif yük (-) olarak adlandırılır.\n" +
                    "– Bir proton ile bir elektronun yük miktarları birbirine eşittir.\n" +
                    "– Nötron yüksüzdür.\n" +
                    "– Elektrik yükü q ile gösterilir.",
            "Bilim insanlarının yaptıkları ölçümler doğadaki en küçük elektrik yükünün elektronun yükü olduğunu göstermiştir. Bu nedenle bir elektronun yüküne temel yük ya da elementer yük (ey) denir.\n" +
                    "\n" +
                    "Bir cismin elektron alması veya vermesi sonucu yük dengesinin bozulması olayına elektrikle yüklenme veya elektriklenme denir. Elektriklenme olayında toplam yük sayısında bir değişiklik olmaz toplam yük korunur.",
            "Sürtünme ile Elektriklenme\n" +
                    "İki maddenin birbirlerine sürtünmesi ile yüklenmelerine sürtünme ile elektriklenme denir. Sürtünme ile elektriklenen iki nötr madde eşit miktarda ve zıt cins elektrikle yüklenir.",
            "İki iletken maddenin birbirlerine dokunması ile yüklenmelerine dokunma ile elektriklenme denir.\n" +
                    "\n" +
                    "Dokunma ile elektriklenen iki madde aynı cins elektrik yükü ile yüklenir. Elektrik yüklü iletken bir madde, nötr, iletken bir maddeye dokundurulduktan sonra her iki madde de aynı cins elektrik yükü ile yüklü olur.\n" +
                    "\n" +
                    "Dokunma ile elektriklenen iki maddenin, birbirlerine dokunmadan önceki yüklerinin toplamı, birbirlerine dokunduktan sonraki yüklerinin toplamına eşittir.",
            "Nötr bir iletkenin, yakınındaki yüklü bir cismin etkisi ile elektriklenmesine etki ile elektriklenme denir.\n" +
                    "Nötr bir iletkenin bir bölgesinde tek cins yüklerin, diğer bölgesinde ise zıt cins yüklerin toplanmasına elektriksel kutuplanma denir.",
            "Bir cismin yüklü olup olmadığını, yüklü ise hangi cins yükle yüklü olduğunu anlamaya yarayan alete elektroskop denir.\n" +
                    "\n" +
                    "– Elektroskop yüklü iken yaprakları açık nötr iken yaprakları kapalıdır.\n" +
                    "– Yüklü bir elektroskobun topuzuna yüklü başka bir cisim dokundurulduğunda yapraklar daha da açılıyorsa elektroskopla cisim aynı\n" +
                    "cins elektrik yüküyle yüklüdür.\n" +
                    "– Cisim topuza dokundurulduğunda eğer elektroskobun yaprakları bir miktar kapanıyorsa cisim ve elektroskop zıt elektrik yüküyle yüklüdür.\n" +
                    "– Yapraklar tamamen kapanıyorsa cisim ve elektroskobun yük miktarlarının eşit fakat zıt elektrik yüküyle yüklüdür.",
    };
    public static String haraket[] = {
            "Hız gibi yönü ile ifade edilen büyüklüklere vektörel büyüklükler denir. Vektörel büyüklük, temsil edildiği doğrultuda, uzunluğu vektörel niceliğin şiddeti ile orantılı bir ok çizilerek gösterilir. Bu şekilde yönü ve büyüklüğü belirtilerek çizilen oka vektör denir.",
            "Vektörlerin Toplanması\n" +
                    "Vektörlerin toplanması üç yöntemle olur. Bunlar;\n" +
                    "\n" +
                    "– Paralel kenar metodu\n" +
                    "– Ucuca ekleme metodu\n" +
                    "– Bileşenlere ayırma metodu",
            "Bir hareketlinin herhangi bir referans sistemindeki gözlemciye göre hareketine bağıl hareket, hızına da bağıl hız denir. Bağıl hız, göreceli hız olarak da ifade edilebilir. Bağıl hız hesaplanırken gözlemci ve gözlenenin hız vektörleri kullanılır.\n" +
                    "\n" +
                    "Hareket hâlindeki iki cismin birine göre diğerinin hızı (vbağıl), gözlenenin hızı (vgözlenen) ile gözlemcinin hızının( vgözlemci) vektörel olarak farkına eşittir. Gözlemcinin ve gözlenenin hızları yere göre belirlenen hızlarıdır.\n" +
                    "\n" +
                    "vbağıl = vgözlenen – vgözlemci",
            "Newton’ın Hareket Yasaları\n" +
                    "1.Hareket Yasası: Bir cismin üzerine etki eden net kuvvet sıfır ise bu cisim duruyorsa durmaya devam eder, hareket hâlinde ise sabit hızla hareketine devam eder.\n" +
                    "\n" +
                    "2.Hareket Yasası (Dinamiğin Temel Prensibi): Bir cismin üzerine etki eden net kuvvet sıfırdan farklı olduğunda cismin bu kuvvetin etkisi ile hızı değişir ve ivmeli hareket yapar. Cismin ivmesinin yönü net kuvvetle aynı yönde olur. Cismin kütlesi ile\n" +
                    "ivmesinin çarpımı net kuvvete eşittir.\n" +
                    "\n" +
                    "3.Hareket Yasası: Birbirine temas eden A ve B cisimlerinden A cismi B cismine bir etki uyguladığında B cismi de A cismine eşit fakat zıt yönde bir kuvvet uygular. Bu kuvvet tepki kuvveti olarak adlandırılır.",
            "Net kuvvetin hesaplanması için sisteme etki eden kuvvetler serbest cisim diyagramı üzerinde ayrı ayrı gösterilir. Ortam sürtünmeli olduğunda sürtünme kuvvetinin de hesaplanması gerekldir.\n" +
                    "\n" +
                    "Cisim durgun hâlde iken cisimle yüzey arasındaki statik sürtünme kuvveti;\n" +
                    "\n" +
                    "Fss = ks. N\n" +
                    "\n" +
                    "ile hesaplanır ve duran cismi harekete geçirebilecek en küçük kuvvete eşittir.\n" +
                    "\n" +
                    "Cisim hareket hâlinde iken cisimle yüzey arasındaki kinetik sürtünme kuvveti ise\n" +
                    "\n" +
                    "Fks = kks . N\n" +
                    "\n" +
                    "ile hesaplanır ve cismin sabit hızla hareket etmesi için gerekli en küçük yatay kuvvete eşittir. Newton’ın 2.hareket yasasına göre;\n" +
                    "\n" +
                    "Fnet = m . a\n" +
                    "F – Fs = m . a\n" +
                    "\n" +
                    "Statik ve kinetik sürtünme katsayıları arasındaki farkın ihmal edildiği durumlarda sürtünme katsayısı tek bir katsayı (k) olarak verilir.\n" +
                    "\n" +
                    "Fnet = F – kk . N = m . a  olur.",
    };
    public static String elektrik[] = {
            "Elektrik Akımı\n" +
                    "Negatif yüklerin titreşim hareketi sonucunda yükler arasında gerçekleşen elektrik enerjisi aktarımına elektrik akımı denir.\n" +
                    "\n" +
                    "Elektrik akımı, yüklerin (elektronların) akışı anlamına gelmez. Elektrik akımı, iletken bir teldeki yüklerin titreşim hareketi sonucunda oluşur. Bir iletkenden t sürede geçen yük miktarına akım şiddeti adı verilir ve I sembolü ile gösterilir.",
            "Akım şiddeti,\n" +
                    "\n" +
                    "I = q/ t bağıntısıyla hesaplanır.\n" +
                    "\n" +
                    "Bu bağıntıda;\n" +
                    "I: Amper (A) olarak akım şiddetini,\n" +
                    "q: Coulomb (C) olarak yük miktarını,\n" +
                    "t: Saniye (s) olarak zamanı ifade eder.",
            "Direnç\n" +
                    "Elektrik yükünü kolay ileten maddelere iletken madde denir. Demir, bakır, alüminyum gibi maddeler iletkendir. Elektrik yükünü kolay iletmeyen maddelere yalıtkan madde denir. Plastik, cam, ebonit, saf su, kuru hava gibi maddeler yalıtkandır.\n" +
                    "Elektrik akımına karşı gösterilen zorluğa direnç denir ve R ile gösterilir. Direnç birimi ohm (Q) dur.\n" +
                    "\n" +
                    "Bir iletkenin direnci;\n" +
                    "\n" +
                    "R= p. L / A\n" +
                    "\n" +
                    "bağıntısı ile hesaplanır.",
            "Seri ve Paralel Bağlı Devreler" +
                    "Seri bağlama: İki ya da daha fazla direncin uç uca bağlanmasıdır. Bu tür bağlanma şeklinde dirençler\n" +
                    "üzerinden aynı akım geçer. Dirençlerin uçları arasındaki potansiyel farklarının toplamı üretecin potansiyel farkına eşittir. Seri bağlı dirençlerin eş değeri dirençlerin toplamına eşittir.\n" +
                    "\n" +
                    "Paralel bağlama: İki ya da daha fazla direnci birbirine paralel yerleştirilip uçlarını birleştirerek bir üretece bağlanmasıdır. Bu tür bağlamada dirençlerin uçları arasında oluşan gerilim eşittir. Dirençler üzerinden geçen akım şiddetinin toplamı ana koldan\n" +
                    "geçen akım şiddetine eşittir. Paralel bağlı dirençlerin eş değerinin tersi dirençlerin tersleri toplamına eşittir.",
            "Mıknatıs Nedir?\n" +
                    "Demir, nikel, kobalt gibi maddeleri çekme özelliği gösteren maddelere mıknatıs denir. Mıknatısın en fazla çekme etkisini gösterdiği uç bölgelerine mıknatısın kutbu adı verilir. Bir mıknatısın kuzey (N) ve güney (S) olmak üzere iki kutbu vardır.",
            "Manyetik Alan Nedir?\n" +
                    "Basit bir şekilde söylemek gerekirse, manyetik alan, mıknatısı çevreleyen bir bölgedir. Mıknatıslar, demiri çeken bir özelliğe sahip magnetit (ya da mıknatıstaşı) denilen madenden yapılmıştır. Bilim insanları, manyetik alanları açıklamak için manyetik alan çizgilerini kullanır.",
    };
    public static String optik[] = {
            "Optik alanının öncülerinden Huygens ve Newton, 1600'lü yıllarda ışığın doğasını açıklamak için iki model öne sürdüler. Newton'a göre ışık saydam ortamlarda çok büyük hızlarla doğrular boyunca ilerleyen taneciklerden oluşuyordu. Bu model tanecik modeli olup ışığın yansımasını ve kırılmasını açıklıyordu.\n" +
                    "\n" +
                    "Huygens’e göre ışık dar bir aralıktan geçmek zorunda kaldığında, tıpkı su dalgalarında olduğu gibi, dalga cepheleri girişim yapıyor, böylece bir girişim deseni oluşuyordu. Böylece Newton’un ışığın parçacık teorisini çürüttüğünü iddia etti, çünkü Newton’un kuramı kırınım olayını açıklayamıyordu.",
            "Işık şiddeti, birim zamanda belli bir doğrultuda yayılan ışığın yoğunluğuyla ilgilidir. Işık şiddeti I sembolüyle gösterilir. birimi (cd)kandeladır.\n" +
                    "\n" +
                    "Hem dalga hem de tanecik modeline göre ışık ışınları her yöne doğrusal yolla yayılır. Kaynağın ışık şiddeti arttıkça çizgi sayısı da artar.\n" +
                    "\n" +
                    "1 Candela neredeyse eskiden kullanılan 1 mum’a eşittir.",
            "Işık akısı\n" +
                    "Bir ışık kaynağının karşısındaki yüzeye birim zamanda düşen ışık ışınları miktarına denir. Işık akısı kaynaktan çıkan ışık ışınları sayısıyla doğru orantılıdır. Bu durumda ışık akısı ışık kaynağının şiddeti ve yüzey alanı ile doğru orantılıdır. Φ ile gösterilir. Birimi lümen (lm) dir.",
            "Işınların yüzeyi aydınlatması, yüzeye dik olarak düşen ışığa ve kaynağın yüzeye yakınlığına bağlıdır. Birim yüzeye dik olarak düşen ışık akısına aydınlanma şiddeti denir.\n" +
                    "\n" +
                    "Aydınlanma şiddeti ile ışık akısı arasındaki ilişki matematiksel olarak şöyle ifade edilir: E = Φ/A\n" +
                    "\n" +
                    "Formülden anlaşılacağı üzere aydınlanma şiddeti  ışık akısıyla doğru orantılıdır.",
            "ölge ve Yansıma\n" +
                    "Işığın doğrusal bir yol boyunca ilerlerken önüne çıkan cisimlerin ışığı arkasına geçirmemesinden dolayı oluşan karartıya gölge denir. Cisimler üç şekilde sınıflandırılabilir. Saydam cisimler, yarı saydam cisimler ve saydam olmayan (opak) cisimler.\n" +
                    "\n" +
                    "Pencere camı gibi ışığı tamamen geçiren maddelere saydam madde denir. Saydam madde arkasındaki nesneleri net olarak görebiliriz.\n" +
                    "\n" +
                    "Işığı kısmen geçiren maddelere yarı saydam madde denir. Buzlu cam yarı saydam bir maddedir. Bu tür maddeler arkasındaki nesneler bulanık görünür.\n" +
                    "\n" +
                    "Işığı hiç geçirmeyen maddelere ise saydam olmayan ya da opak maddeler denir. Demir ve tahta opak maddedir. Opak maddelerin arkasında kalan nesneler görülmez.\n" +
                    "\n" +
                    "Gölgeyi ise iki kısımda inceleriz. Tam gölge ve yarı gölge olarak ifade edilir. Tam gölge hiçbir ışık kaynağından ışık almayan bölge olarak ifade edilir. Yarı gölge ise ışık kaynaklarının yalnızca birinden ışık alan bölgeye denir.",
            "Noktasal Işık Kaynağı\n" +
                    "\n" +
                    "Noktasal ışık kaynağı önüne konulan saydam olmayan maddeye çarpan ışık engelden geçemez. Bu durumda hiç ışık almayan bölge oluşur. Buna tam gölge denir.\n" +
                    "\n" +
                    "Cisim ışık kaynağına yaklaşırsa gölge büyür.\n" +
                    "Perde cisimden uzaklaşırsa gölge büyür.\n" +
                    "Işık kaynağı cime yaklaşırsa gölge büyür",
            "Küresel Işık Kaynağı\n" +
                    "\n" +
                    "Karanlık bir ortamda küresel bir ışık kaynağının önüne ışığı geçirmeyen küresel bir cisim konulduğunda kaynağın üst ve alt noktasından cismin alt ve üst noktasına ışınlar gönderilir.",
            "Düzlem Ayna ve Küresel Aynalar\n" +
                    "Düzlem ayna ya da düz ayna üzerine düşen ışığı yansıtan pürüzsüz düz bir yüzeyi olan ayna çeşididir. Aynalar günümüzde bir camın arkası alüminyum ya da gümüş gibi bir metalle sırlanarak yapılır. Günlük hayatımızda düz aynaları sıklıkla kullanırız. Mağazalardaki boy aynaları ve evlerimizdeki banyo aynaları düz aynalardır.\n" +
                    "\n" +
                    "Yansıtıcı yüzeyi çukur ya da tümsek olan ayanaya küresel ayna, yansıtıcı yüzeyi düz olan aynaya düzlem ayna denir.",
            "Görüntü, cisimlerden yayılan ışınların bir yüzeyde yansıması ya da bir ortam değiştirirken kırılması sonucu oluşur.\n" +
                    "\n" +
                    "Cisimlerden yayılan ışınlar doğrudan göze gelirlerse cismin kendisini görürüz. Işınlar yansıma ya da kırılmaya uğrayarak göze gelirse cisimlerin görüntülerini görürüz.\n" +
                    "\n" +
                    "Düzlem aynaya baktığımızda gördüğümüz görüntüler sanaldır. Bir perde üzerine düşürülerek görülebilen görüntüler gerçektir. Projeksiyon cihazının perde üzerine düşürdüğü görüntüler gibi.",
            "Cisimlerden gelen ışığın gözde oluşturduğu etkiye renk denir. Prizmalarda beyaz ışık renklerine ayrılır.Beyaz ışık az kırılandan çok kırılana doğru; kırmızı, turuncu, sarı, yeşil, mavi, mor şeklinde renklerine ayrılır.\n" +
                    "\n" +
                    "Fizik biliminde yani ışıkta ana renkler mavi, kırmızı, yeşildir. Bu üç renk birlikte göze gelirse beyaz görülür.  Diğer bütün renkler ana renkteki ışıkların farklı şekillerde aynı bölgeye gönderilmesiyle oluşturulur.\n" +
                    "\n" +
                    "Her bir rengin farklı bir frekansı ve dalga boyu vardır. En az kırılan kırmızı ışık bu ışınlar içinde en küçük frekans, en büyük dalga boyuna sahiptir. En çok kırılmaya uğrayan mor ışık ise en büyük frekans, en küçük dalga boyuna sahiptir.\n" +
                    "\n" +
                    "Işık farklı ortamlara geçtiğinde kesinlikle rengi ve frekansı değişmez. Yani sarı ışık havada, camda, suda hep aynı renkli ve aynı frekansa sahiptir.",
    };
    public static String dalgalar[] = {
            "Titreşim hareketinin yakın taneciklere aktarılması ile dalga hareketi oluşur. Titreşim hareketinin tanecikten taneciğe aktarılması sonucunda ortam taneciklerinin düzenli olarak titreşmesine dalga ya da dalga hareketi denir.",
            "Enine dalgalar: Titreşim doğrultusu yayılma doğrultusuna dik olan  dalgalara enine dalgalar denir.\n" +
                    "Örnek: e.m.d, Yay dalgaları, Deprem dalgaları, Su dalgaları.\n" +
                    "\n" +
                    "Boyuna dalgalar: Titreşim doğrultusu yayılma doğrultusuna paralel olan bu dalgalara da boyuna dalgalar denir.\n" +
                    "Örnek: Ses dalgaları,Yay dalgaları, Deprem dalgaları, Su dalgaları.\n" +
                    "\n" +
                    "Mekanik Dalga: Yayılabilmesi için maddesel bir ortama ihtiyaç duyan dalgalara denir.\n" +
                    "Örnek: Ses, yay,su,deprem dalgaları\n" +
                    "\n" +
                    "Elektromanyetik Dalgalar: Yayılması için maddesel ortama ihtiyaç duymayan, yüklerin ivmeli hareketi ile oluşturulan, boşlukta ışık hızı ile yayılan, elektrik ve manyetik alana sahip dalgalara denir.\n" +
                    "Örnek: Radyo Dalgaları, Morötesi Dalgalar, Kızılötesi Dalgalar, X ışınları.",
            "Dalga hareketi, orta parçaların yer değişimi sıklıkla olmadan, yani çok az ya da hiç kütle taşınımı olmadan, enerjiyi bir yerden başka bir yere taşır. Dalgalar sabit konumlarda oluşan titreşimlerden oluşurlar ve zamanla nasıl ilerlediğini gösteren bir dalga denklemi ile tanımlanırlar. Bu denklemin matematiksel tanımı dalga çeşidine göre farklılık gösterir.",
            "Dalgaları iki şekilde sınıflandırabiliriz. İlki dalgaların taşıdığı enerjiye göredir. Yayılması için bir ortama ihtiyacı olan ve enerjiyi içinde bulunduğu ortamda taşıyan dalgalara mekanik dalgalar denir. Tel dalgası, yay dalgası, su dalgası ve ses dalgası mekanik dalgalardır. Hepsinin yayılabilmesi için bir maddesel ortama (tele, yaya, suya veya havaya) ihtiyacı vardır. Hepsi enerjiyi içinde bulundukları ortamda bir yerden başka bir yere taşır. Yayılması için ortama ihtiyaç bulunmayan, boşlukta yayılabilen dalgalara elektromanyetik dalgalar denir. Işık bir elektromanyetik dalgadır, enerjiyi taşımak için ortama ihtiyacı yoktur. Örneğin, Güneş’ten Dünya’ya enerjiyi taşıyan ışık boşlukta yayılır.",
            "Dalga Boyu Nedir?\n" +
                    "\n" +
                    "Ard arda gelen iki dalga tepesi veya iki dalga çukuru arasındaki mesafeye dalga boyu denir. Dalga boyu birimi metre dir. Dalga boyu kaynağa ve ortama bağlıdır. ”λ” ile gösterilir.",
            "Periyot Nedir?\n" +
                    "\n" +
                    "Bir tam dalga oluşması için geçen süreye denir. Birimi saniyedir. Periyot dalgayı oluşturan kaynağa bağlıdır. ”T” ile gösterilir.\n" +
                    "\n" +
                    "Periyot ile frekans arasında ;\n" +
                    "\n" +
                    "T.f=1 ilişkisi vardır.",
            "Frekans Nedir?\n" +
                    "\n" +
                    "Frekans bir saniyede oluşan dalga sayısıdır. Frekansın simgesi f, birimi 1/s (ya da s-1) ‘dir. Frekansın birimi olan 1/s ‘ye Hertz (Hz) de denir. Frekansla periyot birbiriyle çok yakından ilişkilidir.\n" +
                    "\n" +
                    "Matematiksel olarak:T.f = 1",
            "Dalganın Hızı Nedir?\n" +
                    "\n" +
                    "Dalganın birim zamanda aldığı yoldur. Dalganın hızı yalnızca ortama bağlıdır ” v” ile gösterilir. Dalganın hızı aşağıdaki formül ile hesaplanır.\n" +
                    "\n" +
                    "λ= v.T veya λ= v/F",
            "İşittiğimiz sesler çok şiddetli , zayıf, ince ya da kalın olabilir. Seslerdeki bu farklar, ses kaynaklarındaki sesin oluşma şekillerine bağlıdır.",
            "Sesin zayıf ya da kuvvetli olmasına şiddet (gürlük) denir. Sesin şiddeti, ses dalgalarının enerjisine ve genliğine bağlıdır. Genlik büyükse ses şiddetli, küçükse ses zayıf duyulur." +
                    "Sesin şiddetinin birimi desibel (dB) dir. İşitilebilen en hafif ses 0 dB dir ve buna işitme eşiği denir. İnsan 0 – 120 dB aralığındaki sesleri duyabilir. 30 ile 60 dB arası sesler normal şiddetteki seslerdir. 60 dB den fazla olan sesler şiddetlidir ve rahatsız eder.",
            "Sesin ince ya da kalın olmasını ayırt etmeyi sağlayan özelliktir. Sesin yüksekliği, ses kaynağının titreşim hızına (frekansına) bağlıdır. Frekans bir saniyedeki titreşim sayısıdır. Frekans arttıkça ses incelir, frekans azaldıkça ses kalınlaşır. Sesi oluşturan cismin titreşim frekansı cismin boyuna, cinsine, kalınlığına ve gerginliğine bağlıdır.",
            "Yankı Nedir?\n" +
                    "\n" +
                    "Sesin bir engele çarparak kaynağının bulunduğu yere geri dönmesi olayına yankı denir.\n" +
                    "\n" +
                    "Gürültü Nedir?\n" +
                    "\n" +
                    "Çevre ve sağlık sorunlarına neden olabilen, istenmeyen bir çok sesin kulağa yoğun olarak gelmesiyle oluşan ses kirliliğine gürültü denir. Yoğun trafik, iş makineleri, beten kırıcıları gürültüye neden olabilir.\n" +
                    "\n" +
                    "Uğultu Nedir?\n" +
                    "\n" +
                    "Sesin gürültüsü, boğuk ve anlaşılmaz olmasına uğultu denir. Kalabalığın fazla olduğu yerde  insanların kendi aralarında konuşmaları uğultuya neden olabilir.",
            "Gürültü kirliliği veya diğer adıyla ses kirliliği, insan veya hayvan yaşamını olumsuz etkileyen, dengesini bozan her türlü insan, hayvan ya da makine kaynaklı ses oluşumudur. Gürültü kirliliğinin en yaygın biçimlerinden biri, özellikle motorlu araçların neden olduğu kirliliktir.\n" +
                    "\n" +
                    "Dünya çapında en yaygın gürültü türü ulaşım sistemlerinden kaynaklanır. Motorlu araçların yanı sıra uçak ve Demiryolu araçlarının yarattığı gürültü de önemli bir yer tutar. Şehir planlamacılığında yanlışlar yapılması sanayi ve yerleşim alanlarının birbirine bitişmesine neden olabilir ve sonuç olarak sanayi alanının yarattığı gürültü kirliliği komşu yerleşim birimlerinde yaşayanların sağlığı üzerinde olumsuz etkiler yaratabilir. Gürültü kirliliği yaratan diğer etmenler arasında özellikle istirahat saatlerinde yayılan araba alarmları, acil durum sirenleri, çeşitli beyaz eşyalar ile ev âletlerinin gürültüleri, fabrika-makine sesleri, yapım ve onarım çalışmaları, ses çıkaran hayvanlar, ses sistemleri, hoparlörler, maç, eğlence, dini-sosyal faaliyetler sayılabilir.",
    };
    public static String dunyaveuzay[] = {
            "Başlangıçta insanlar basit gözlemlerle Dünya'yı, et\u00ADrafında Güneş ve Ay'ın dolandığı sabit bir gezegen olarak düşündüler. Araştırma imkânları geliştikçe, Güneş’in merkezde ol\u00ADduğunu ve diğer gezegenlerle birlikte Dünya'mızın da Güneş etrafında dolandığını fark ettiler. Bilim insanları evrenin oluşumu ile ilgili farklı görüşler ortaya atmışlardır. Ancak bu görüşler temel olarak iki farklı gruba ayrılır.",
            "1. Görüş; Newton’un 1600’lü yıllarda ortaya attığı ha\u00ADreketsiz ve bir başlangıcı olmayan evren görüşüdür. Bu görüşe göre, evren sonsuzdan beri var olmuştur ve varlığı da şu anki hâlindeki gibi sonsuza kadar devam edecektir.\n" +
                    "\n" +
                    "2. Görüş; evrenin bir başlangıcı olduğu görüşüdür. Bu görüş çoğunluk bilim insanları tarafından kabul görmüştür. Buna astronomideki birçok gelişmenin ev\u00ADrenin sürekli bir genişleme içinde olduğunu gösterme\u00ADsi sebep olmuştur.",
            "Büyük Patlama (Big Bang) Teorisi\n" +
                    "Belçikalı bilim adamı Georges Lemaitre 1927 yılında “Büyük Patlama” (Big Bang) teorisini ortaya atmıştır. Bu teoriye göre evrenin bir başlangıcı vardır ve evren sürekli genişlemektedir.\n" +
                    "\n" +
                    "Astronomideki son buluşlar evrenin sü\u00ADrekli genişlemekte ol\u00ADduğunu göstermek\u00ADtedir. 1929 da Edwin Hubble yaptığı göz\u00ADlemlerle evrendeki gök adaların birbirle\u00ADrinden sürekli uzaklaştığını tespit etmiştir.\n" +
                    "\n" +
                    "Büyük patlama (Big Bang) teorisine göre; sürekli genişleyen evrende geçmişte gök cisimlerinin birbirle\u00ADrine çok daha yakın olmaları dolayısıyla evrenin daha sıkışık olması gerekir. Hatta bu düşüncenin son nokta\u00ADsı; bütün evrenin oluşumunun bir noktadan gerçekleş\u00ADtiğidir.\n" +
                    "\n" +
                    "Evrenin genişlemesini kek hamuru pişerken kabarmasına, evrendeki gök cisimlerini ise hamur üzerindeki bazı noktalara benzetebiliriz. Evren genişledikçe nasıl gök cisimleri birbirlerinden uzaklaşıyorsa, hamur ka\u00ADbardıkça üzerinde önceden çizilmiş noktalar orantılı olarak birbirlerinden uzaklaşır.",
            "Dünya'nın Oluşumu\n" +
                    "Bir görüşe göre, Dünya, Güneş’ten kopan bir madde yığınından meydana geldi. Bu kopmaya Güneş’in sü\u00ADratli dönmesi ya da başka bir yıldızın çekim etkisi se\u00ADbep oldu. Kopan madde Güneş etrafında bir toz bulu\u00ADtu oluşturdu. Toz bulutu soğudukça “ge\u00ADzegenimsi” denilebilecek küçük ve soğuk bölgeler oluştu. Bu bölgeler dönerken ya birbirleriyle çarpı\u00ADşarak ya da önleri\u00ADne gelen cisimle\u00ADri de kendileri\u00ADne katarak bü\u00ADyüdüler ve gezegenleri oluşturdular.\n" +
                    "\n" +
                    "Başka bir görüşe gö\u00ADre; Dünya, evren oluştu\u00ADğunda kızgın bir gaz kütlesi hâlindeydi. Ev\u00ADren, büyük patla\u00ADmanın etkisi ile gitgi\u00ADde genişleyerek soğu\u00ADmaya devam etti. Bu sıra\u00ADda Dünya’nın kendi etrafında dönmesinin etkisiyle dıştan içe so\u00ADğudu. Dünya'nın iç içe geçmiş, farklı sıcaklık\u00ADtaki katmanları bu şekilde oluştu.",
    };
    public static String basitmakineler[] = {
            "İş yapma kolaylığı sağlayan araçlara basit makineler denir.\n" +
                    "\n" +
                    "Basit makineler; kuvvetin yönünü değiştirmek veya kuvvetten ya da yoldan kazanç sağlamakta kullanılabilir. Kuvvetten kazanç sağlayan bir basit makinede yoldan kayıp, yoldan kazanç sağlayan bir basit makinede kuvvetten kayıp vardır.",
            "Kaldıraçlar\n" +
                    "Destek noktası da denen sabit bir nokta etrafında dönebilen cisimlere kaldıraç denir.\n" +
                    "\n" +
                    "Kuvvet x Kuvvet Kolu = Yük x Yük Yolu\n" +
                    "\n" +
                    "Kuvvet kolunun uzunluğu, yük kolunun uzunluğundan ne kadar fazla ise kaldıracın kuvvet kazancıda o kadar büyüktür. El arabası, ceviz kırma makinesi ve kapak açacağı, bu kaldıraç çeşidine örnek olarak verilebilir.",
            "Makaralar\n" +
                    "Çevresine ip geçirilmiş, ekseni çevresinde dönerek ipin hareket etmesi sonucu çalışan araçlara “makara” denir.",
            "Palangalar\n" +
                    "Sabit ve hareketli makaraların birlikte kullanılmasıyla oluşturulmuş sisteme palanga denir. Palangada kuvvetten büyük oranda kazanç vardır. Fakat aynı oranda yoldan kayıp vardır.",
            "Eğik Düzlem\n" +
                    "Ağır yükleri belli yüksekliğe kaldırmak zor olduğu zaman eğik düzlem yardımıyla yükten daha az bir kuvvet ile cisimler istenilen yüksekliğe çıkarılabilir. Sürtünmeler önemsiz ise, eğik düzlemde iş prensibi geçerlidir.\n" +
                    "\n" +
                    "Kuvvet . Kuvvet yolu = Yük . Yük yolu\n" +
                    "\n" +
                    "F. S = S. h\n" +
                    "\n" +
                    "Kuvvet yolu, kuvvete paralel olan S yolu, yük yolu ise, yüke paralel olan h yoludur. Kuvvetten kazanç sağlanır. Fakat aynı oranda yoldan kayıp olur.",
            "Dişliler\n" +
                    "Bir eksen etrafında dönebilen silindir şeklindeki çarklardır.\n" +
                    "\n" +
                    "– Dişler, bir çark üzerine uygulanan kuvveti diğer çarklara aktarır.\n" +
                    "– Dişli çarklar hareketin yönünü ve süratini değiştirmeye yarar.\n" +
                    "– Büyük dişli küçük dişliden yavaş, fakat daha büyük kuvvetle döner.\n" +
                    "\n" +
                    "Aynı merkezli dişlilerde;\n" +
                    "\n" +
                    "– Dönme yönleri aynıdır.\n" +
                    "– Dönme sayıları da aynıdır.\n" +
                    "\n" +
                    "Farklı merkezli dişlilerde;\n" +
                    "\n" +
                    "– Dönme yönleri zıttır.\n" +
                    "– Diş sayısı fazla olan az, diş sayısı çok olan fazla döner.\n" +
                    "\n" +
                    "Aynı yönlü bağlı dişlilerde;\n" +
                    "\n" +
                    "– Dönüş yönleri aynıdır.\n" +
                    "– Büyük dişli bir tur döndüğünde küçük dişli 1 turdan fazla döner.\n" +
                    "\n" +
                    "Çapraz bağlı dişlilerde;\n" +
                    "\n" +
                    "– Dönüş yönleri zıttır.\n" +
                    "– Büyük dişli 1 tur attığında küçük dişli 1 turdan fazla döner.",
    };
    public static String Kimyabil[] = {
            "Simyadan Kimyaya\n" +
                    "Simya: Basit metalleri altına çevirme, şifa ve ölümsüzlük iksirini bulma uğraşlarına simya (alşimi), bu işle uğraşanlara simyacı\n" +
                    "(alşimist) denir.\n" +
                    "\n" +
                    "Simyacıların en büyük iki amacı ;\n" +
                    "\n" +
                    "– Felsefe taşını yapmak\n" +
                    "– Felsefe taşı hem metalleri altına çevirebilecek, hem de ölümsüzlük iksirinin bulunmasını kolaylaştıracaktı.",
            "Simyacıların Kullandığı Teknikler\n" +
                    "\n" +
                    "– Kavurma\n" +
                    "– Çözme\n" +
                    "– Yakma\n" +
                    "– Fırınlama\n" +
                    "– Damıtma\n" +
                    "– Süblimleştirme\n" +
                    "– Süzme\n" +
                    "– Mayalandırma\n" +
                    "\n" +
                    "Kullanılan Araç – Gereçler\n" +
                    "\n" +
                    "– İmbikler (damıtma için)\n" +
                    "– Potalar (eritme için)\n" +
                    "– Fırın (ısıtma için)\n" +
                    "– Kaplar (saklamak için)\n" +
                    "\n" +
                    "Özetle Simya: Bilim dalı değildir.Deneme-yanılmaya dayalıdır. Teorik bir temele dayanmaz. Sistematik bilgi birikimi içermez. Bilgi birikimi oluşmamıştır.",
            "Kimya bilimi; maddelerin yapısını, özelliklerini ve birbirleri arasındaki etkileşimleri inceleyen bilim dalına kimya denir. Bu nedenle kimya madde bilgisi olarak da adlandırılır. Kimya bilimi tarım, tıp, metalürji, arkeoloji ve gıda gibi birçok bilimle ortak çalışmalar yürütmektedir. Bu da kimyanın birçok alt alanlarının oluşmasını sağlamıştır.",
            "Kimya Disiplinleri\n" +
                    "\n" +
                    "Analitik Kimya: Kimyasal bileşiklerin tanınması ve miktarlarının belirlenmesi işlemlerini kapsayan kimya disiplinidir.\n",
            "Biyokimya: Canlı organizmaların kimyasal yapısını ve bu yapıda meydana gelen kimyasaldeğişiklikleri inceleyen kimya disiplinidir.\n" +
                    "\n" +
                    "Fizikokimya: Sıcaklık, basınç, derişim (çözeltilerde birim hacimdeki madde miktarı) gibi fiziksel faktörlerin kimyasal tepkimelere etkilerini inceleyen kimya disiplinidir.\n" +
                    "\n" +
                    "Polimer Kimyası: Çok sayıda küçük birimin (monomer)birbirine eklenmesiyle oluşan büyük molekülleri (polimer) inceler.\n" +
                    "\n" +
                    "Anorganik Kimya: Organik olmayan bileşiklerin yapılarını, özelliklerini ve tepkimelerini inceleyen kimya disiplinidir.\n" +
                    "\n" +
                    "Organik Kimya: Karbon (C) bulunduran bileşiklerin yapılarını, özelliklerini ve tepkimelerini inceleyen kimya disiplinidir.\n" +
                    "\n" +
                    "Endüstriyel Kimya: Endüstride (sanayide) kullanılan ham maddelerin imalatıyla ilgilenir.",
            "Kimyacıların Çalışma Alanları\n" +
                    "\n" +
                    "Kimya bilimi oldukça geniş bir yelpazeye sahiptir. Ancak bu alanda çalışan meslekler genel olarak birkaç başlık altında toplanabilir. Bu mesleklerden bazıları aşağıda kısaca tanıtılmıştır." +
                    "İlaç, Gübre, Petrokimya, Arıtım, Ahşap İşleme, İşleme, Tekstil",
            "Element: Aynı proton sayısına sahip tek tür atomlar topluluğuna element denir.\n" +
                    "– Tek tür atomdan oluşur.\n" +
                    "– Saf maddedir.\n" +
                    "– Homojendir.\n" +
                    "– Belirli koşullarda erime noktası ve kaynama noktaları sabittir.\n" +
                    "– Belirli koşullarda yoğunlukları sabittir.\n" +
                    "– Kimyasal ve fiziksel yöntemlerle daha basit maddeler ayrıştırılamazlar.\n" +
                    "– Sembollerle gösterilir.\n" +
                    "– Helyum, oksijen, azot gibi çok az element doğada element halinde bulunur. Elementlerin çoğunluğu doğada bileşikleri halinde bulunurlar. Bu tür elementler kimyasal yöntemlerle bileşiklerinden elde edilirler.\n" +
                    "– Atomik yapılı olanları olduğu gibi molekül yapılı olanları da vardır.",
            "Bileşik: Farklı elementlerin belirli oranlarda, Özelliklerini kaybederek bir araya gelmesiyle oluşan saf maddelere bileşik denir.\n" +
                    "\n" +
                    "– Saf ve homojen (hâl değişimi hariç) maddelerdir.\n" +
                    "– Belirli ayırt edici özellikleri vardır (erime, kaynama noktası, yoğunluk gibi).\n" +
                    "– Fiziksel yöntemlerle ayrıştırılamaz, kimyasal yöntemlerle ayrıştırılabilirler.\n" +
                    "– Bileşikler formüllerle gösterilir.\n" +
                    "– Bileşiği oluşturan elementler arasında belirli bir oran vardır. Örneğin suda hidrojen atomunun oksijen atomuna oranı 2/1’dir.\n" +
                    "– Bileşikler kendisini oluşturan bileşenlerin özelliklerini göstermezler.",
    };
    public static String atomveperiyot[] = {
            "Birçok bilim insanı elementleri çeşitli özelliklerine göre sınıflandırmaya çalışmıştır. Günümüzdeki periyodik tabloya en yakın sınıflandırma 1869 yılında Julius Lothar Mayer (Julis Lother Mayer) ve Dimitri Mendeleyev’in (Dimitri Mendeleyev) çalışmalarına dayanmaktadır.",
            "Elementlerin benzer kimyasal ve fiziksel özelliklerine ve artan atom numaralarına göre gruplandırıldıkları çizelgeye periyodik tablo / periyodik sistem / periyodik cetvel denir.\n" +
                    "\n" +
                    "Elementler gruplandırılırken; oda şartlarındaki fiziksel hâl, sertlik-yumuşaklık, iletkenlik, kararlılık, iyon yükü gibi özellikleri dikkate alınır. Periyodik tabloda benzer özelliğe sahip elementler alt alta dizilmiştir.",
            "Her elementin özelliklerini ayrı ayrı belirlemek yerine, periyodik tablodaki yerine bakarak element hakkında bilgi edinilebilir. Bu durum kimya ile ilgilenenlerin işini önemli ölçüde kolaylaştırmaktadır. Periyodik tabloda;\n" +
                    "\n" +
                    "– 7 tane periyot vardır.\n" +
                    "– Periyotlarda soldan sağa doğru gidildikçe elementlerin proton sayıları artar.\n" +
                    "– Aynı periyottaki elementlerin yörünge sayıları aynıdır.\n" +
                    "– Gruplarda yukarıdan aşağıya doğru gidildikçe elementlerin proton sayıları artar.\n" +
                    "– Gruplarda yukarıdan aşağıya doğru gidildikçe elementlerin yörünge sayıları artar.\n" +
                    "– Aynı grupta yer alan elementlerin kimyasal özellikleri genellikle benzerdir.\n" +
                    "– Periyodik sistemde toplam 18 tane grup yer alır.\n" +
                    "– Bunlardan 8 tanesi A grubu, 10 tanesi B grubu elementleridir.",
            "Bir elementi periyodik sistemdeki yeri nötr durumdaki elektron dağılımına göre yapılır.\n" +
                    "\n" +
                    "Katman elektron dizilimi B grubu ve A grubu elementlerinin grup türlerinin belirlenmesi için yeterli değildir. Bu nedenle sadece A grubu elementlerinin hatta ilk 20 elementin yeri katman elektron dizilimine bakılarak kesin olarak ifade edilebilir. Bunun için 2 temel kural vardır.\n" +
                    "\n" +
                    "– Elektron dizilimindeki katman sayısı elementin bulunduğu periyotu belirtir.\n" +
                    "– Elektron diziliminin son katmanındaki elektron sayısı da elementin bulunduğu A grubunu belirtir.\n" +
                    "\n" +
                    "Yani;\n" +
                    "\n" +
                    "Katman sayısı = Periyot Numarası\n" +
                    "Son Katmandaki elektron sayısı = Grup Numarasını verir.\n" +
                    "\n" +
                    "Örnek: 19K (Potasyum)elementinin peridodik cetveldeki yerini bulalım.\n" +
                    "\n" +
                    "19K: 2) 8) 8) 1) à Elementin 4 tane yörüngesi bulunduğundan element 4. periyotta yer alır.\n" +
                    "\n" +
                    "à Elementin son yörüngesinde 1 elektron bulunduğundan 1A grubunda yer alır.",
            "Metaller\n" +
                    "Bilinen elementlerin büyük çoğunluğu metaldir. 1A, 2A ve 3A gruplarında büyük oranda metal vardır. B gruplarının ise tamamı metaldir.\n" +
                    "\n" +
                    "–Cıva dışındaki metallerin tamamı oda koşullarında (25° C ve 1 atm) katı halde bulunurlar.\n" +
                    "–Kuvvet etkisi altında işlenebilir ve şekil verilebilir.\n" +
                    "–Parlak bir yüzeye sahiptirler.\n" +
                    "–Elektrik akımını ve ısıyı iyi iletirler.\n" +
                    "–Sadece elektron vererek bileşik oluşturabilirler. Yani bileşiklerinde daima pozitif (+) yüklüdürler. Bu nedenle birbirleriyle bileşik oluşturamazlar.\n" +
                    "–Isıtılarak eritildiklerinde birbirleri ile homojen karışırlar ve oluşan bu karışım alaşım olarak adlandırılır.\n" +
                    "\n" +
                    "NOT: 1 A grubunun 1.elementi olan hidrojen metal değildir.",
            "Ametaller\n" +
                    "Genellikle son katmanında 4, 5,6, 7 ve 8 elektron bulunur. Hidrojen hariç periyodik tablonun sağında bulunur.\n" +
                    "\n" +
                    "– Tel ve levha haline getirilemez.\n" +
                    "– Isı ve elektriği iyi iletmez.\n" +
                    "– Mattır.\n" +
                    "– Oda koşullarında katı, sıvı ve gaz haldedir.\n" +
                    "– Molekül yapıdadır.\n" +
                    "– Elektron alarak – yüklü (Anyon) oluşturur.\n" +
                    "– Son yörüngelerinde 5,6 veya 7 elektron bulundurur.\n" +
                    "– Periyodik sistemin sağ tarafında bulunmaktadır.",
            " Yarı Metaller\n" +
                    "Bor, antimon, silisyum, tellür, germanyum, polonyum, arsenik ve astatin olmak üzere toplam 8 yarı metal vardır. Yarı metaller fiziksel özellikleri bakımından metaller, kimyasal özellikleri bakımından ametallere benzerler.\n" +
                    "\n" +
                    "– Parlak ya da mat olabilirler.\n" +
                    "– Metallere göre az, ametallere göre ise daha iyi elektrik akımını ve ısıyı iletebilirler. (Yarı iletken özelliktedirler.)\n" +
                    "– Yarı metaller özellikle elektronik devre parçalarının ve optik malzemelerin yapımında kullanılırlar.\n" +
                    "– Tel ve levha haline getirilebilirler.\n" +
                    "– Çekiçle dövülemezler. Kırılgandırlar.",
            "Soygazlar\n" +
                    "En kararlı element grubudur. Helyum, neon, argon, kripton, ksenon ve radon soy gazdır.\n" +
                    "\n" +
                    "– Oda sıcaklığında gaz halinde bulunurlar.\n" +
                    "– Elektrik akımını iletmezler.\n" +
                    "– Bileşik oluşturmaya istekleri yoktur.\n" +
                    "– Helyum hariç son katmanlarında 8 elektron bulunur.\n" +
                    "– Doğada hiç bileşikleri yoktur.\n" +
                    "– Helyum (He) hidrojenden sonra en hafif gazdır. Yanıcı ve parlayıcı değildir. Renksiz bir gazdır. Güneşte ve yıldızlarda bol miktarda bulunur. Zeplin ve balon gibi hava taşıtlarını şişirmede, derin dalış tüplerinde kullanılır.\n" +
                    "– Neon (Ne),renksiz bir gazdır. Renkli reklam panolarının aydınlatılmasında, televizyon tüplerinde, paratonerlerde kullanılır.\n" +
                    "– Argon (Ar), kokusuz ve renksiz bir gazdır. Ampullerde ve flüoresan tüplerinde kullanılır.",
    };
    public static String modern[] = {
            "Bohr Atom Modeli Yetersizlikleri," +
                    "– Spektrumlardaki bazı çizgilerin, dış manyetik alan etkisinde daha alt çizgilere ayrışması, atomda Bohr’un belirttiklerinden başka fiziksel etkilerin de olduğu fikrini doğurmuştur.\n" +
                    "– Spektrum analizlerinde bazı çizgilerin parlaklığının diğerlerinden daha fazla olması, Bohr tarafından açıklanamamıştır.\n" +
                    "– Birden fazla elektronu bulunan elementlerde elektronların çekirdekle ve birbirleri ile, elektriksel ve manyetik etkileşimleri hesaba katılmamış ve açıklanamamıştır.\n" +
                    "– Atomlar arasındaki bağlar ve atomların birleşerek molekülleri nasıl oluşturduğu açıklanamamıştır.\n" +
                    "– Elektronun dalga hareketi dikkate alınmamıştır.",
            "Periyodik tablonun şekli atomların elektron dizilimiyle son derece ilişkilidir. Örneğin, 2. grup elementlerinin hepsi [E] ns2 elektron dizilimine sahiptir. (E burada bir asal gazın elektron dizilimidir) Ayrıca bunlar aynı grupta oldukları için kimyasal özellikleri bakımından önemli ölçüde birbirine benzemektedirler. Daha genel olarak, periyodik tablodaki blok kavramının nedeni s,p,d,f alt kabuklarını doldurmak için gerekli elektron sayısıdır. ( 2,6,10,14…)",
            "Elektron dizilimi, atom fiziği ve kuantum kimyasında, bir atom ya da molekülün (ya da diğer fiziksel yapıların) elektronlarının atomik ya da moleküler orbitallerdeki dağılımıdır. Örneğin Neon atomunun elektron dizilimi 1s2 2s2 2p6 olarak gösterilir." +
                    "5. enerji düzeyine kadar her enerji düzeyindeki maksimum elektron sayısı 2n formülü ile bulunur.\n" +
                    "\n" +
                    "Birinci enerji düzeyi: en fazla 2,\n" +
                    "İkinci enerji düzeyi: en fazla 8,\n" +
                    "Üçüncü enerji düzeyi: en fazla 18,\n" +
                    "Dördüncü enerji düzeyi: en fazla 32 elektron alabilir.",
            "Periyodik cetvelin bilim insanlarına sağladığı en büyük fayda, bir elementin sadece periyodik cetvedeki yerini bilerek onun hakkında bazı bilgilere anında ulaşabilmektir. Periyodik cetvelin yapısı gereği bir takım özellikler periyodik olarak artar veya azalır. Bu özelliklere periyodik özellikler denir.",
            "tom Yarı Çapı\n" +
                    "Atomun merkezi ile son katmanı arasındaki  uzaklık atom yarıçapıdır . Atomların yaptığı bağ türüne göre yarıçaplar üçe ayrılır.Bunlar;\n" +
                    "\n" +
                    "Tek bir kovalent bağla bağlanmış eşdeğer iki atomun çekirdekleri arasındaki uzaklığın yarısına kovalent yarıçap denir.\n" +
                    "\n" +
                    "İyonik bağı oluşturan metal atomları elektron vererek katyon oluştururken ametal atomları da elektron alarak anyon oluşturur. İyonik bağı oluşturan katyon ve anyonların çekirdekleri arasındaki uzaklık ölçülür. Bu iyonlar eşdeğer büyüklükte olmadığından, aralarındaki uzaklığın katyon ve anyon arasında bölüştürülmesiyle elde edilen yarıçapa iyonik yarıçap denir.\n" +
                    "\n" +
                    "Soy gaz atomları yüksek basınçlarda ve düşük sıcaklıklarda katı hale geçerken aralarındaki etkileşimlerden yararlanarak Van der Waals yarıçap hesaplanır.",
    };
    public static String tepkime[] = {
            "Bir maddenin bütün özelliklerini taşıyan yapı taşlarına kimyasal tür denir. Dört çeşit kimyasal tür vardır: atom, molekül, iyon, radikal.",
            "ir elementin fiziksel ve kimyasal özelliklerini gösteren en küçük birimine atom denir.\n" +
                    "\n" +
                    "– Atomlar fiziksel ve kimyasal yöntemlerle daha basit birimlerine ayrıştırılamaz.\n" +
                    "– Nükleer yöntemlerle ayrıştırılabilirler.\n" +
                    "– Proton, nötron gibi tanecikler çekirdekte; elektronlar ise elektron bulutunda yer alır.\n" +
                    "– Atomlar boyutlarının çok küçük olması nedeniyle optik mikroskoplarla görüntülenemez ancak elektron mikroskobu gibi araçlarla görüntülenebilir.",
            "Molekül\n" +
                    "Aynı cins veya farklı cins bir kaç atomun bir araya gelmesiyle oluşan yapılara molekül denir.\n" +
                    "\n" +
                    "– En küçük molekülü iki atomludur.\n" +
                    "– Aynı tür atomların bir araya gelmesi sonucu element molekülü, farklı tür atomların bir araya gelmesiyle bileşik molekülü oluşur.\n" +
                    "– Bileşikler kimyasal yöntemlerle kendini oluşturan bileşenlere ayrışabilir.\n" +
                    "– Moleküller iki atomlu (diatomik), üç atomlu (triatomik) veya çok atomlu (poliatomik) olabilir.",
            "İyon\n" +
                    "Elektron sayısı proton sayısına eşit olmayan yapılara iyon denir.\n" +
                    "\n" +
                    "– Bir atom, elektron verdiğinde verdiği elektron sayısı kadar pozitif (+), Pozitif yüklü iyonlara katyon denir.\n" +
                    "– Elektron aldığında aldığı elektron sayısı kadar negatif (-) yükle yüklenir. Negatif yüklü iyonlara anyon denir.\n" +
                    "– Birden fazla atomun tek bir atom gibi davrandığı yüklü atom gruplarına kök adı verilir.",
            "Radikal\n" +
                    "Oktedini tamamlamamış bir ya da birden fazla ortaklaşmamış elektron çifti içeren yüksek enerjili ve kararsız yapılardır.\n" +
                    "\n" +
                    "– Radikaller zincirleme reaksiyonların gerçeklemesinde başlatıcı olarak görev yaparlar.\n" +
                    "– İnsan vücudunda radikaller kendiliğinden oluşabilir ve vücuda zarar verebilirler.",
            "Güçlü Etkileşimler\n" +
                    "Kimyasal türler arasındaki itme ve çekme kuvvetleri aynı anda gerçekleşir. Çekme kuvvetleri itme kuvvetlerinden çok fazla olduğunda türler arasında bir kimyasal bağ oluşur. Kimyasal türler arasında kimyasal bağ oluşmasına neden olan bu tür etkileşimler güçlü etkileşimler olarak da adlandırılır.\n" +
                    "\n" +
                    "Güçlü etkileşimler,\n" +
                    "\n" +
                    "– İyonik bağ\n" +
                    "– Kovalent bağ\n" +
                    "– Metalik bağ olarak sınıflandırılır.",
            "İyonik Bağ" +
                    "– İyonik bağlarda zıt yükler birbirini çektiği için diğer güçlü bağlardan genellikle daha sağlamdır. Bundan dolayı erime – kaynama sıcaklıkları yüksektir.\n" +
                    "– İyonik bağda bulunan metaller katyonları, ametaller anyonları oluşturur.\n" +
                    "– İyonik bileşiklerin katı halleri sert ve kırılgandır. İyonik katı üzerine çekiçle vurulduğunda iyonik kristalin düzenli yapısı bozulur ve kırılma olayı gerçekleşir. Fiziksel özellik bakımından seramiklere benzerler.\n" +
                    "– İyonik bağlı katılarda iyonlar hareket etmediği için elektrik akımını iletmezler.\n" +
                    "– İyonik katılar suda çözündüğünde elektrik akımını iletir. Örneğin tuzlu su.",
            "Kovalent bağ" +
                    "Apolar Kovalent Bağ (Kutupsuz Kovalent Bağ): Bağı yapan atomların elektronegatiflikleri eşitse meydana gelen bağ çeşididir. Yani iki atomda elektronu aynı şiddetle çeker ve elektron üzerinde kutupsuz bir çekim meydana gelir. Aynı cins iki ametal atomunun birleşmesiyle meydana gelir. Apolar kovalent bağ örnekleri; iki oksijen atomunun elektronlarını ortaklaşa kullanarak meydana getirdikleri bağıdır.\n" +
                    "\n" +
                    "Polar Kovalent Bağ (Kutuplu Kovalent Bağ): İki farklı cins atomun bir araya gelmesiyle oluşur. Farklı atomlar oldukları için oluşan elektronegativite farkı, atomlardan elektronegativitesi yüksek olanın kısmi negatif, diğerinin ise kısmi pozitif yüklenmesini sağlar. Örneğin suyu meydana getiren hidrojen ve oksijen moleküllerinin son orbitallerindeki elektronların ortak kullanılmasıyla polar kovalent bağ meydana gelir.",
            "Metalik Bağ" +
                    "– Aynı periyotta sağa doğru gidildikçe metal atomları arasında, metalik bağ kuvveti artar, erime noktası yükselir.\n" +
                    "– Aynı grupta yukarı doğru gidildikçe metal atomları arasında, metalik bağ kuvveti artar, erime noktası yükselir.\n" +
                    "– Elektron denizinde serbest dolaşan değerlik elektron sayısı arttıkça metalik bağ kuvveti artar.\n" +
                    "– Metalik bağ metallerin elektrik akımını iletmesini, tel ve levha haline gelmesini ve işlenebilir olmasını sağlar.\n" +
                    "– Metaller gelen ışığı yansıttığı için parlaktır.\n" +
                    "– Oda şartlarında cıva hariç katı hâlindedirler. Cıva oda koşullarında sıvı hâldedir.",
    };
    public static String mol[] = {
            "Mol kavramının sözcük anlamına bakarsak mol Latincede büyük yığın manasına gelir. Kimyada da bir sayıyı ifade eder. Bu sayı Avagadro sayısıdır. Buna ihtiyaç duyulmasının nedeni atomun gözle görülemeyecek kadar küçük olması ve atomla ilgili hesaplamaların zorlaşmasıdır.\n" +
                    "\n" +
                    "Öyleyse örneğin kütle numarası 12 olan karbon atomundan kaç tane alırsak 12 gram geliyor ona bakalım dersek işte bunun cevabı mol kadardır.\n" +
                    "\n" +
                    "Proton ve nötron gibi taneciklerin kütlesini grama çevirmemize yarayan sayıya Avagadro sayısı denir. Bu miktarda tanecik sayısına ise 1 mol denir.",
            "Mol bir kütle birimi değil, sayı birimidir. 1 mol demek 602.000.000.000.000.000.000.000 adet demektir. Bunu her seferinde yazamayacağımız için bu sayıyı bilimsel gösterim mantığıyla kısaltıyoruz ve 6,02×1023 şeklinde ifade ediyoruz.\n" +
                    "\n" +
                    "Bu sayı bulan Avagadro adında bir bilim insanı olduğu için de mol anlamına gelen sayıya Avagadro sayısı ya da Avagadro sabiti diyoruz.",
            "Mol kavramı kullanılarak kütle hesaplamaları yapıldığı için öğrenciler sıklıkla molün bir kütle birimi olduğunu sanıyorlar. Ancak mol tanecik olarak sayıca bir büyüklüğü ifade etmektedir. Daha basit hale getirmek için aşağıdaki açıklamaya bakanız.\n" +
                    "\n" +
                    "1 mol patates = 6,02.1023  adet patates\n" +
                    "1 mol kapı kolu = 6,02.1023 adet kapı kolu\n" +
                    "1 mol su molekülü = 6,02.1023 adet su molekülü\n" +
                    "1 mol hidrojen atomu = 6,02.1023 adet hidrojen atomu\n" +
                    "1 mol proton = 6,02.1023 adet proton\n" +
                    "1 mol OH– iyonu = 6,02.1023 adey OH– iyonu\n" +
                    "1 mol NaCI molekülü = 6,02.1023 adet NaCI molekülü\n" +
                    "Bunu bu şekilde tekrar ederek yazıyoruz ki bilgiler kafamıza iyice otursun.",
    };
    public static String kimyasalhesap[] = {
            "Kimyasal tepkimelerin denkleştirilmesi sırasında kullanılan katsayılar tepkimede bulunan maddelerin tepkimeye girme oranlarını oluşturur. Bu orana sitokiyometrik oran denir. Bir kimyasal tepkimede miktar hesabı yaparken sitokiyometrik oran kullanılır.\n" +
                    "\n" +
                    "Kimyasal tepkimelerde maddelerin mol sayıları, kütleleri, tanecik sayıları ve hacimleri arasında her zaman doğru orantı vardır. Maddelerin miktarları arasında geçişler yapılırken tepkime denklemindeki katsayılardan yararlanılır.",
            "Mol sayısı ile molekül kütlesi, kütle, hacim, tanecik sayısı ve avogadro sayısı arasındaki ilişki:\n" +
                    "\n" +
                    "mol kütlesi-mol ilişkisi:      n = m/MA     (mol = kütle/mol kütlesi)\n" +
                    "\n" +
                    "tanecik sayısı-mol ilişkisi:    n = N/NA     (mol = tanecik sayısı/avogadro sayısı)\n" +
                    "\n" +
                    "mol hacmi-mol ilişkisi:        n = V/22,4    ( mol = hacim/22,4)\n" +
                    "\n" +
                    "*Normal şartlar altında (1 atm basınç ve 0 oC sıcaklık) 1 mol gaz 22,4 L hacim kaplar.",
            "Karışım problemlerinde, karışımı oluşturan maddelerin birbirleri ile tepkimeye girmesi söz konusudur. Bu tür sorularda hangi maddelerin birbiri ile tepkimeye girebildiği ya da giremediği bilinmelidir. Tepkime gerçekleşiyorsa tepkime denklemi yazılmalıdır.",
            "Tepkime Verimi Bulma\n" +
                    "Yüzde Verim Hesaplama\n" +
                    "\n" +
                    "Bir tepkimenin teorik verimini, sınırlayıcı bileşen belirler. Bir başka deyişle teorik verim, sınırlayıcı bileşenin tümüyle kullanılması hâlinde oluşabilecek ürün miktarıdır. Teorik verim, elde edilebilecek en yüksek verim olup denkleştirilmiş tepkimeden sayısal olarak hesaplanabilir. Uygulamada ise gerçek verim kullanılır ve gerçek verim tepkime sonunda oluşan ürün miktarıdır. Burada gerçek verim daima teorik verimden küçüktür. Kimyasal tepkimelerde tepkime verimini düşüren birçok neden olabilir. Esas tepkimenin yanında yürüyen ikinci bir tepkimenin reaktifleri kullanması, reaksiyonun dengede olması (Dengedeki tepkimede hem tepkimeye girenler hem de ürünler bulunur.), tepkime esnasındaki madde kayıpları, kullanılan maddenin yeterince saf olmaması gibi örnekler verilebilir.",
    };
    public static String asitvebaz[] = {
            "sit Nedir?\n" +
                    "Sulu çözeltilerinde Hidrojen İyonu veren maddelere asit denir.\n" +
                    "\n" +
                    "– Tatları ekşidir.\n" +
                    "– Sulu çözeltilerinde H3O+ (hidronyum) iyonu fazlalığı vardır.\n" +
                    "– Genellikle suda iyi çözünürler.\n" +
                    "– Sulu çözeltileri elektrik akımını iletir.\n" +
                    "– Mavi turnusol kağıdını kırmızıya boyarlar.\n" +
                    "– Aktifliği hidrojenden fazla olan metallerle tepkime vererek metalin tuzunu ve H2 gazını oluştururlar.",
            "Bazı asit formülleri: \n" +
                    "\n" +
                    "HCI : Hidroklorik asit\n" +
                    "HNO3 : Nitrik asit\n" +
                    "H2SO4 : Sülfürik asit\n" +
                    "H3PO4 : Fosforik asit\n" +
                    "\n" +
                    "* Sulu çözeltilerinde büyük oranda iyonlarına ayrışabilen asitlere kuvvetli asit denir.\n" +
                    "* Kuvvetli asitler çok tahriş edici ve yakıcıdır. Bu yüzden dikkatli kullanılmalıdır.\n" +
                    "* Günlük hayatta tükettiğimiz bazı gıdaların yapısında asit bulunur. Bu asitler zayıftır.",
            "Kuvvetli asitlere örnek;\n" +
                    "\n" +
                    "HNO3 : Nitrik Asit\n" +
                    "HCl : Hidroklorik Asit\n" +
                    "HClO4 : Perklorik Asit\n" +
                    "H2SO4 : Sülfürik Asit",
            "Baz Nedir?\n" +
                    "Sulu çözeltilerine hidroksit ( OH – ) iyonu verebilen maddelere baz denir.\n" +
                    "\n" +
                    "NaOH → Na+(suda) + OH– (suda )\n" +
                    "\n" +
                    "– Tatları acıdır.\n" +
                    "– Sulu çözeltilerin de OH– iyonu fazlalığı vardır.\n" +
                    "– Temas edildiklerinde ele kayganlık hissi verirler.\n" +
                    "– Sulu çözeltileri elektrik akımını iletir.\n" +
                    "– Kırmızı turnusolü maviye çevirir.\n" +
                    "– Alkali metallerin hidroksitleri (NaOH, KOH gibi) hariç diğerlerinin sudaki çözünürlükleri genellikle azdır.\n" +
                    "– Kuvvetli bazlar (Alkali metallerin oksit ve hidroksitleri.) amFoter metallerle (Zn, AI, Cr, Pb, Sn gibi…) tepkime vererek tuz ve H2 gazını oluştururlar.\n" +
                    "– Bazlar, asitler ile nötralleşme tepkimesi verir.\n" +
                    "– Aşındırıcı ve tahriş edicidirler. Sodyum hidroksit (NaOH) nem çekicidir. Ele temas ederse ciddi yanıklara sebep olur.",
            "* Sulu çözeltilerinde büyük oranda iyonlarına ayrışabilen bazlara kuvvetli baz denir.\n" +
                    "* Kuvvetli bazlar çok tahriş edici ve yakıcıdır. Bu yüzden dikkatli kullanılmalıdır.\n" +
                    "* Günlük hayatta kullandığımız bazı temizlik malzemeleri bazdır. Bunlar sulandırılmış ve zayıflatılmış bazlardır.\n" +
                    "\n" +
                    "Kuvvetli bazlara örnek olarak;\n" +
                    "\n" +
                    "NaOH : Sodyum hidroksit\n" +
                    "KOH : Potasyum hidroksit\n" +
                    "Ca(OH)2 : Kalsiyum hidroksit\n" +
                    "\n" +
                    "Zayıf bazlara örnek olarak;\n" +
                    "\n" +
                    "NH3 : Amonyak\n" +
                    "NH4OH : Amonyum Hidroksit",
            "Tuzlar\n" +
                    "Asitler ve bazlar tepkimeye girdiğinde tuz ve su oluşur.\n" +
                    "Bu olaya nötrleşme tepkimesi denir. Bu olayda asit ve baz bir birinin etkilerini yok ettiği için, asit ve baz etkileşmesine nötrleşme tepkimesi adı verilir.\n" +
                    "\n" +
                    "Tuzlara genel örnek olarak;\n" +
                    "\n" +
                    "Sodyum Klorür (NaCl)\n" +
                    "Sodyum Karbonat (Na2CO3)\n" +
                    "Sodyum Bikarbonat (NaHCO3)\n" +
                    "Amonyum Klorür (NH4Cl)\n" +
                    "\n" +
                    "– Tuz çözeltileri, asit ve baz çözeltileri gibi elektrik akımını iletir. Katı halde elektrik akımını iletmezler.\n" +
                    "– Çünkü tuzlar su içinde iyonlarına ayrışır. Su içinde serbest hâlde gezebilen iyonlar elektrik akımını iletir.\n" +
                    "– Tuzlar turnusol kağıdına etki etmez.\n" +
                    "– Kristal yapılıdırlar.",
    };
    public static String maddeninHalleri[] = {
            "Madde: Madde ya da özdek, uzayda yer kaplayan, hacmi ve kütlesi olan tanecikli yapılara denir. 5 duyu organımızla algılayabildiğimiz (hissedebildiğimiz) canlı ve cansız varlıklara denir. Maddenin en küçük yapı birimi atomdur.",
            "Sıvı: Basınç ile hacmi değişmeyen, bulunduğu kabın doldurduğu kısmının şeklini alan akışkan maddelerdir. Belirli hacimleri vardır. Sıvı tanecikleri titreşim ve yerdeğiştirme hareketi yaparlar. Katı halden sonraki en düzenli hal olarak nitelendirilir.",
            "Gaz: Bulunduğu kabın hacmini alabilen, basınç ile hacminde önemli değişiklikler olan akışkan maddelerdir. Belirli hacimleri yoktur. Gaz tanecikleri titreşim, öteleme ve dönme hareketi yaparlar. En düzensiz hal olarak nitelendirilir.",
            "Katı: Akışkan olmayan, basınç ile hacmi değişmeyen genellikle sert ve kırılabilen maddelerdir. Belirli hacim ve şekilleri vardır. Katı tanecikleri titreşim hareketi yaparlar. En düzenli hal olarak nitelendirilir.",
            "Plazma: Gaz halinin ısıtılarak maddenin molekül, atom, iyon ve elektronlarının bir arada bulunduğu karışımdır. N2, N, N+ ve e– nin bir arada bulunduğu durum plazma haline örnektir. Bunun yanında ateş, güneş, yıldız ve floresan lambaları plazma haline örnektir.\n" +
                    "\n" +
                    "Şimdi ayrı ayrı maddenin hallerini özelliklerini inceleyelim .",
            "Sıvıların Özellikleri\n" +
                    "\n" +
                    "– Sıvılar içinde bulundukları kabın şeklini alırlar.\n" +
                    "– Basınç yükseltildiğinde sıvıların hacimleri ölçülebilir büyüklükte değişmez.\n" +
                    "– Sıcaklık yükseltildiğinde hacimleri az da olsa arttığından yoğunlukları düşer.\n" +
                    "– Birbirleri içinde çözünebilen iki sıvı temasa geldiklerinde, az da olsa birbirlerinin içinde yayılırlar.\n" +
                    "– Sıvılar akmaya karşı direnç gösterirler.\n" +
                    "– Sıvıların yüzey gerilimleri vardır.\n" +
                    "– Açık kaptaki sıvılar buharlaşırlar.\n" +
                    "– Bu özellikler her sıvıda olmasına rağmen sıvıdan sıvıya farklılık göstermektedir.",
            "Katıların Özellikleri\n" +
                    "\n" +
                    "– Bütün maddeler atom ve moleküllerin çeşitli şekillerde bir araya gelmesiyle ortaya çıkar.\n" +
                    "– Katıdaki atomlar, özellikle elektriksel karakterli kuvvetlerle, belirli konumlarda bir arada tutulurlar.\n" +
                    "– Katı atomları bu denge konumları etrafında ısısal etkiler nedeniyle titreşim hareketi yaparlar.\n" +
                    "– Fakat düşük sıcaklıklarda bu titreşim hareketi azdır ve atomlar hemen hemen sabit gibi düşünülebilir.\n" +
                    "– Maddeye ısı enerjisi verilirse bu titreşim genliği artar.\n" +
                    "\n" +
                    "Katı maddeler amorf katılar ve kristal katılar olmak üzere ikiye ayrılır.",
            "Gazların Özellikleri\n" +
                    "\n" +
                    "– Maddenin en düzensiz halidir.\n" +
                    "– Birbirleriyle her oranda karışarak homojen karışımlar oluştururlar.\n" +
                    "– Bulundukları kabın şeklini ve hacmini alırlar. Gaz tanecikleri arasında büyük boşluklar vardır. Bu boşluklardan dolayı gazlar bir kuvvetin etkisiyle sıvılaşana kadar sıkıştırılabilir.\n" +
                    "– Tanecikleri arasında çekim kuvvetleri katı ve sıvılarınkine oranla çok azdır.\n" +
                    "– Bulundukları kabı tümüyle doldururlar, çünkü sınırsız yayılma özellikleri vardır.\n" +
                    "– Maddenin en yüksek enerjili halidir.\n" +
                    "– Titreşim, yer değiştirme ve öteleme hareketi yaparlar.\n" +
                    "– Tanecikler arası uzaklığın en fazla olduğu haldir.\n" +
                    "– Akışkandırlar ve sıkıştırılabilirler.\n" +
                    "– Yoğunlukları katı ve sıvılara göre daha düşüktür.\n" +
                    "– Gaz tanecikleri birbirlerinden bağımsız devamlı hareket halindedir.à Esnek olan doğrusal çarpışmalar yaparlar. Çarpışma sonunda birbirlerine yapışmazlar, hareket doğrultuları değişir, enerji kayıpları olmaz.\n" +
                    "– Isıtıldıklarında bütün gazlar sıcaklık değişimi karşısında aynı orandaà genleşirler. Bu nedenle genleşme katsayısı gazlar için ayırt edici değildir.\n" +
                    "– Gerçekte ideal gaz yoktur. Gazlar ancak bu ideal hale yaklaşabilirler. Gazlar düşük basınç ve yüksek sıcaklıkta en idealdirler. Mol kütlesinin küçük olması idealliği artırır.",
            "Plazma ve Özellikleri" +
                    "– Kütlesinin çoğunluğu serbest yüklü parçacıklar oluşturmasına karşın plazmalar dışarıya karsı yüksüzmüş gibi davranır. Çünkü plazma içindeki eksi işaretli yüklerin miktar, artı yüklerin miktarına eşittir. Bu özellikler nedeniyle plazmalar opaktır yani ışığı geçirmez, dağıtır.\n" +
                    "– Plazmalar, yüklü parçacıklardan oluştukları için elektrik ve manyetik alanlardan etkilenir.\n" +
                    "– Yapılarındaki yoğun serbest yüklü parçacıklar nedeniyle plazmalar iyi bir ısı ve elektrik iletkenidir. Plazmalar, metaller içinde en iyi iletken olarak bilenen gümüşün iletkenliğinin 102 katından bile daha büyük bir iletkenliğe sahiptir.\n" +
                    "– Plazmalar  bulundukları kabı doldurmadan bulut şeklinde kümelenirler oysaki gazlar kabı tümüyle doldurur.\n" +
                    "– Plazma ortamında gerçekleşen kimyasal tepkimeler olağan gaz ortamında gerçekleşen kimyasal tepkimelerden çok daha hızlıdır.\n" +
                    "– Bir plazmanın herhangi bir yerinde bir değişiklik oluşturulursa bu değişiklik plazma içinde her yöne ışık hızıyla yayılır. Oysa bir gaz kütlesinin içinde oluşturulan değişiklik her yöne ancak ses hızıyla yayılır. Bir başka değişle enerji plazma tanecikleri arasında ışık hızıyla taşınırken gazlarda bu taşınma ses hızıyla gerçekleşir.",
    };
    public static String karisimlar[] = {
            "Karışım, birden fazla maddenin kimyasal özellikleri değişmeyecek şekilde bir araya gelmesiyle oluşan madde topluluğudur. Saf maddeler element ve bileşiklerden oluşur. Fakat maddelerin çoğu ne tek bir elementtir ne de tek bir bileşiktir. Maddelerin çoğu saf madde olmayan karışımlardır.",
            "Karışımların Özellikleri\n" +
                    "\n" +
                    "– Birden fazla maddenin karışması ile oluşur. Birden çok element veya bileşik bulunabilir. (en az iki madde)\n" +
                    "– Karışımı oluşturanlar kendi özelliklerini kaybetmezler. Örnek: Şekerli  suda şekerin tadını algılarız.\n" +
                    "– Saf madde değildir.\n" +
                    "– Formül yâda sembolle gösterilmezler.\n" +
                    "– Maddeler her oranda karışabilir. Örnek: Bir bardak suya istediğimiz oranda tuzla karıştırabiliriz.\n" +
                    "– Fiziksel yolla ayrıştırılır. (buharlaştırma, yoğunluk farkı, damıtma)\n" +
                    "– Belirli bir erime, kaynama noktaları yoktur. (Miktarına göre değişir)\n" +
                    "\n" +
                    "Unutmayalım ki karışımı oluşturan maddeler arasında kimyasal bağ oluşmaz.\n" +
                    "\n" +
                    "Karışımlar homojen ve heterojen olmak üzere ikiye ayrılır.",
            "Homojen Karışımlar\n" +
                    "Her tarafında aynı özelliği gösteren, tek bir madde gibi gözüken karışımlardır. Karışımı meydana getiren maddeler gözle veya optik aletlerle görülemezler. Homojen karışımlara genel olarak “çözeltiler” de denir.\n" +
                    "\n" +
                    "Çözeltilerde dağıtıcı maddeye çözücü, dağılan maddelere ise çözünen adı verilir. Çözeltilerde dağıtıcı maddeye çözücü, dağılan maddelere ise çözünen adı verilir.\n" +
                    "\n" +
                    "– Homojendirler.\n" +
                    "– Saf değildirler.\n" +
                    "– Çözeltinin kütlesi karışan maddelerinin kütlelerinin toplamına eşittir.\n" +
                    "– Çözeltiler, fiziksel özelliklerine göre katı, sıvı ve gaz hâlde bulunabilir.",
            "Heterojen Karışımlar\n" +
                    "Heterojen karışımlarda maddeler birbiri içinde karışımın her tarafında aynı olacak şekilde karışmamıştır. Örneğin, çorba, çamurlu su ve sisli hava heterojen karışımdır.Heterojen karışımlara adi karışım da denir.\n" +
                    "\n" +
                    "– Karışımı oluşturan maddelerin kimyasal özelliklerinde değişiklik olmaz\n" +
                    "– Saf değildir.\n" +
                    "– Fiziksel yollarla ayrıştırılır.\n" +
                    "– Erime ve kaynama noktaları çözünenin derişimine bağlı olduğundan sabit değildir.\n" +
                    "– Karışımların öz kütleleri sabit değildir. Karışımı oluşturan maddelerin miktarına bağlı olarak karışımın öz kütlesi değişir.\n" +
                    "– Karışımın yapısında farklı cins atom veya molekül vardır.\n" +
                    "– Karışımda bulunan maddelerin miktarı gelişi güzeldir; aralarında belirli, sabit bir oran yoktur.",
            "Emülsiyon: Bir sıvıda çözünmeyen başka bir sıvının heterojen olarak bulanık bir şekilde dağılmış hâlidir. Su–zeytinyağı karışımı, su–benzin karışımı, gibi.\n" +
                    "\n" +
                    "Süspansiyon: Bir sıvıda çözünmeyen katının heterojen olarak dağılmış şeklidir. Su–kum karışımı, su–tebeşir tozu karışımı gibi.\n" +
                    "\n" +
                    "Kolloid: Bir maddenin sıvı içerisinde asılı kalmasıyla oluşan karışımlara denir. Homojen gibi görünürler, karışımı oluşturan maddeler gözle görülemezler, ancak karışımdan ışın demeti veya lazer ışını geçirilerek fark edilebilirler. Duman, jöle, boya gibi maddeler buna örnektir.\n" +
                    "\n" +
                    "Aerosol: Bir katı veya sıvının gaz içinde dağılmasıyla oluşan karışımlardır. Sis, sprey, baca dumanı buna örnektir. Aerosol karışımların çoğu koloite örnektir.",
            "Karışımların Ayrıştırılması\n" +
                    "Maddeler doğada çoğunlukla homojen veya heterojen karışımlar hâlinde bulunur. Bu maddeleri saf olarak elde etmek için karışımdan ayrılması gerekir. Maddeleri karışımlardan ayırmak için maddelerin aşağıdaki özelliklerin farklı olmasından yararlanılır.\n" +
                    "\n" +
                    "– Mıknatıstan Etkilenme\n" +
                    "– Erime noktası farkı\n" +
                    "– Tanecik boyutu farkı\n" +
                    "– Kaynama noktası farkı\n" +
                    "– Çözünürlük farkı\n" +
                    "– Yoğunluk farkı",
            "Mıknatıstan Etkilenme: Mıknatıs demir, nikel, kobalt elementlerini ve bunlardan yapılan maddeleri çekmektedir.  Karışım içerisinde demir, nikel ve kobalt varsa mıknatısla ayırım sağlanabilir.\n" +
                    "\n" +
                    "Erime noktası farkı: Katı maddelerin oluşturduğu karışımların ayrılmasında, erime noktalarının farklı olmasından yararlanır. Katı karışım ısıtıldığında erime noktası düşük olan madde önce erir ve karışımdan ayrılır. Demir ve kurşundan oluşan bir karışım (alaşım da olabilir) ısıtıldığında ve sıcaklık 327 °C a ulaştığında kurşun erir. Çünkü kurşunun erime noktası 325 °C tur. Ancak bu sıcaklıkta erime noktası 1538 °C olan demir erimez.",
            "Tanecik boyutu farkı: Katı – Katı heterojen karışımları ayırmak için kullanılır. Büyüklükleri birbirinden farklı olan katı haldeki\n" +
                    "maddelerden oluşan karışımları ayırmak için kullanılır.  Küçük tanecikler elekten geçerken büyükleri geçmez.\n" +
                    "\n" +
                    "Kaynama noktası farkı: Kaynama noktası farkı sıvı – katı veya sıvı – sıvı karışımların ayrılmasında kullanılır. Buharlaştırma\n" +
                    "basit damıtma, ayrımsal damıtma  örnek olarak verilebilir.",
            "Çözünürlük farkı: Maddelerin sıvılardaki çözünürlükleri farklıdır. Bu özellik kullanılarak karışımdan maddeler özütleme, kristallendirme ve ayrımsal kristallendirme yöntemleri kullanılarak yapılır.\n" +
                    "\n" +
                    "Yoğunluk farkı: Farklı yoğunluktaki Katı – Katı maddelerin ayrılmasında kullanılır. Buğday – saman karısımı suya atılırsa pirinç dibe batar, saman su üstünde yüzer.",
    };
    public static String canlilar[] = {
            "Fosil Yakıtlar\n" +
                    "Fosil yakıtlar, canlı kalıntılarının milyonlarca yıldır toprak altında ayrışması sonucunda meydana gelen enerji kaynağıdır. Petrol, kömür ve doğal gaz fosil yakıtlara örnektir.",
            "Kömür\n" +
                    "Bitki ve hayvan fosillerinden oluşur. Bitki, havasız ortamda bakteriler tarafından parçalanır ve çürür. Böylece oksijen ve hidrojen ortamdan uzaklaşır ve maddenin karbon içeriği zamanla artar. Dönüşüm süresi ne kadar uzun olursa fosil bileşimi saf karbona o oranda yakın olur.",
            "Turba: Henüz karbonlaşma sürecini tamamlamamış en genç kömürdür. Yüksek miktarda su ve safsızlık içerir.\n" +
                    "\n" +
                    "Antrasit: Yüksek kalorili kömür türüdür. Oluşumu en uzun süren kömürdür. Doğada az bulunur ve pahalıdır. Koku ve duman çıkarmaz, zor tutuşur, sert ve yoğundur, parmakta leke bırakmaz, kısa ve mavi renkli bir alevle yanar. Antrasit, kimyasal reaksiyonlarda indirgeyici ve lokomotiflerde yakıt olarak kullanılır. Elektrik üretimi ve endüstride yaygın kullanılır.",
            "Linyit: Oluşumunu henüz tamamlamamıştır. Yaklaşık 60 milyon yıl önce oluşmaya başlamıştır. Antrasit, kimyasal reaksiyonlarda indirgeyici ve lokomotierde yakıt olarak kullanılır. Elektrik üretimi ve endüstride yaygın kullanılır. Su ve bir çok yabancı madde içerir. CO2 ve CH4 salınımı ile taş kömürüne dönüşebilir.\n" +
                    "\n" +
                    "Kahverengi kömür de denir. Isıl değeri düşük, nem ve kül miktarı fazladır. Türkiye’de en çok bulunan kömürdür.\n" +
                    "\n" +
                    "Taş Kömürü: Yüksek kalorili bir kömürdür. Kömürleşme derecesi bakımından antrasit ve linyit arasında yer alır. Maden kömürü olarak bilinir ve uçucu maddeler açısından zengindir. Kauçuk, madeni yağ, akaryakıt yağı, yapay reçine, naylon gibi maddelerin üretiminde hammadde olarak kullanılır. Zonguldak yöresinde çıkarılır.\n" +
                    "\n" +
                    "Kömürün yanması sonucu atmosfere zararlı maddeler (toz, kükürt oksitler, azot oksitler, CO2, hidrokarbonlar ve aldehitler) salınır.",
            "etrol\n" +
                    "Petrol sözcüğü Latince petra (taş) ve oleum (yağ) sözcüklerinden türetilmiştir. Çok koyu yeşil (siyaha yakın yeşil) renginde bir sıvıdır. Petrolün yoğunluğu 0,8–0,95 g/cm3 arasında değişir. Petrolü doğal mineral yağ olarak da kabul edebiliriz.\n" +
                    "\n" +
                    "Petrolde hidrokarbon bileşiklerinin sonsuz sayıda karışımının yanı sıra çok daha düşük oranlarda ancak petrolün kimyasal yapısını etkileyecek düzeylerde azot, kükürt ve oksijen elementleride bulunur. Ham petrol çıkarıldığı coğrafyaya göre değişen bileşimlere sahiptir.\n" +
                    "\n" +
                    "Petrolün Rafinasyonu: Tipik bir petrol bir karbonlu C1 moleküllerden (CH4), kırk karbonlu C40 moleküllere (C40 H82 ) kadar değişen yüzlerce farklı hidrokarbondan oluşur.",
            "Ham Petrolden Elde Edilen Ürünler\n" +
                    "\n" +
                    "* Benzin\n" +
                    "* Motorin\n" +
                    "* Gaz yağı (aydınlatma ve jet yakıtı)\n" +
                    "* Petrol gazı (LPG)\n" +
                    "* Fuel oil (gemi, santral, ısıtma)\n" +
                    "* Makine yağları\n" +
                    "* Asfalt\n" +
                    "* Çeşitli kimyasallar\n" +
                    "* Mum ve cilalar",
            "Petrolün Bileşenleri: Petrol, fiziksel ve kimyasal özellikleri çok değişik olmakla birlikte hemen hemen bütün sıvı petrollerin kütlece % 82-87 arasında karbon, yüzde 12-15 arasında hidrojen ve %5’i geçmeyecek bir oranda diğer bileşenlerden içerir.\n" +
                    "\n" +
                    "Ana bileşeni karbon ve hidrojen de olsa yapısında az miktarda kükürt, azot, oksijen elementleri de içerir. Ağırlıkça % bolluk olarak, karbon ve hidrojenden sonra kükürt (S) % 0,05-5 oranında bulunur. Hemen hemen her petrolün yapısında sodyum klorür (NaCl)\n" +
                    "de bulunur.\n" +
                    "\n" +
                    "Petrolde en bol bulunan metal elementler vanadyum ve nikel olup, eser miktarda anorganik tuzlar, H2S ve su bulunur. Ham petrol bir karışım olduğundan belirli bir erime ve kaynama noktası yoktur.",
    };
    public static String kimyaher[] = {
            "Yaşamımızın vazgeçilmez parçası olan kimyasallar hemen hemen her alanda karşımıza çıkmaktadır. Temizlikte kullanılan sabun, deterjan; mutfak malzemeleri, kıyafetler, oyuncakların ana malzemesi polimerler, kozmetik ürünler, ilaçlar, gıdalar vb. maddeler kimya bilimi sayesinde kullanıma hazır hâle getirilmektedir. Yani kimya her yerdedir.",
            "Temizlik Maddeleri\n" +
                    "Kişisel temizlikte kullanılan sabun, şampuan, diş macunu; ev temizliğinde kullanılan deterjanlar, ağartıcılar, çamaşır suyu; gıdalarda hijyen sağlamak amacıyla kullanılan kireç kaymağı vb. ürünler temizlik maddeleridir .Sabun, deterjan, çamaşır sodası, çamaşır suyu, kir ve yağ çözücüler örnek olarak verilebilir.",
            "Sabun\n" +
                    "Sabun, bitkisel ve hayvansal yağların veya yağ asitlerinin NaOH gibi bazlarla kimyasal tepkimesi sonucu elde edilen temizlik maddesidir. Sabun kullanım amacına göre yapılır. Genel olarak yumuşak ve sert olmak üzere iki tür sabun vardır. Sert sabunlar sodyum (Na) tuzu, yumuşak sabunlar ise potasyum (K) tuzudur. Yumuşak sabunlar suda sert sabunlara göre daha fazla çözündükleri için genellikle traş kreminde ve sıvı sabun yapımında kullanılır.",
            "Deterjan\n" +
                    "\n" +
                    "Kir sökücü anlamına gelen deterjan petrol türevlerinden elde edilir. Deterjanın en önemli özelliği sert sularda bile köpürebilmesidir. Yaygın olarak kullanılan deterjan lauril alkolden elde edilen sodyum lauril sülfat’tır.\n" +
                    "\n" +
                    "Deterjanların temel bileşenleri\n" +
                    "Yüzey aktif maddeler\n" +
                    "Köpük düzenleyiciler\n" +
                    "Sertlik gidericiler\n" +
                    "Katkı maddeleri",
            "Polimerler\n" +
                    "Birbirine bağlanan ve tekrar eden küçük moleküllerin her birine monomer, oluşan büyük moleküle de polimer denir.\n" +
                    "Çok sayıda küçük moleküllerin uzun bir zincir şeklinde birleşmesiyle büyük moleküller oluşturması olayına polimerleşme tepkimesi denir.",
            "Kauçuk: Kauçuk polimerine çeşitli katkı maddeleri katılarak istenilen esneklikte araba lastikleri, silgiler, ameliyat eldivenleri vb. malzemeler yapılır.\n" +
                    "\n" +
                    "Polietilen: Polietilen polimeri elektrik yalıtkanı bir maddedir. Polietilenin farklı tepkime koşullarında ve farklı katalizör eşliğinde, kullanım alanları farklılık göstermektedir. Örneğin, PE polimerinin bir türü sert olup plastik şişe ve kapaklarında, plastik boru yapımında, oyuncaklarda kullanılırken diğer türü ise esnek ve yumuşak olup çöp ve alış-veriş poşetlerinde, şampuan, meyve suyu gibi sıkılabilir şişelerde, elektrik kablosunun kaplanmasında vb. kullanılmaktadır.\n" +
                    "\n" +
                    "Polietilen teraftalat (PET): Meşrubat, yiyecek ve içecek kapları, sentetik fiber gibi kullanım alanlarına sahiptir.\n" +
                    "\n" +
                    "Kevlar: Zırh, sağlam halat yapımı ve yanmayan koruyucu giysi yapımında kullanılmaktadır.\n" +
                    "\n" +
                    "Akrilik: Elyaflar giyim, ev tekstili ürünlerinde, araba tavanı, branda yapımında, inşaatlarda dolgu maddesi olarak kullanılır.",
            "Kozmetikler\n" +
                    "Cildimizi temizlemek, güzelleştirmek veya görünüşünü değiştirmek amacıyla cilde sürülen maddelere kozmetik denir. Kozmetik malzemeler kişisel bakım veya estetik amacıyla kullanılmaktadır. Cilt kremleri, makyaj malzemeleri, parfüm, saç bakım ürünleri, kalıcı dövme boyası, vb. maddeler kozmetik malzemelere örnektir.\n" +
                    "\n" +
                    "– Parfümler, malzemenin hoş kokulu olmasını sağlamak amacıyla kullanılır.\n" +
                    "– Nemlendiriciler, cildin nemli kalmasını sağlar.\n" +
                    "– Boyalar, karışıma istenilen rengi verir.",
            "İlaçlar\n" +
                    "Hastalıkları teşhis etmek, tedavi etmek veya önlemek amacıyla kullanılan canlı metabolizmasını etkileyen yiyecek ve su dışındaki kimyasal maddelerdir.\n" +
                    "\n" +
                    "İlaçlar doğal kaynaklardan elde edildiği gibi günümüzde daha çok laboratuvar koşullarında yapay olarak elde edilir. İlaçlar iki kısımdan oluşur. Bunlardan ilki etkin madde, diğeri ise taşıyıcı maddedir. Etkin madde, vücuttaki hedef bölgeye etki eden kimyasal maddelerdir. Taşıyıcı madde ise etkin maddenin hasta tarafından kolay alınabilmesi veya dozun daha kolay ayarlanabilmesi için vücudun normal işleyişine etkisi olmayan kimyasal maddelerdir.",
            "Hazır Gıdalar\n" +
                    "Çeşitli fiziksel veya kimyasal işlem uygulanmış (işlenmiş) ve ambalajlanmış gıda maddelerine ise hazır gıda denir.\n" +
                    "\n" +
                    "Hazır gıdalar şu şekilde sınıflandırılabilir;\n" +
                    "\n" +
                    "Toz ürünler; Hazır çorbalar, meyve içecekleri, tatlılar… Unlu mamüller; Hazır ekmek, kek, gofret, kraker…\n" +
                    "Fermantasyon ürünler; Ekmek, peynir, yoğurt, tereyağı, turşu, alkollü içecekler…\n" +
                    "Dondurulmuş ürünler; Ayıklanmış sebzeler, patates kızartması, balık, dondurulmuş meyveler…\n" +
                    "Konserveler; Hazır salçalar, marmelatlar, sebzeler, ton balıkları.",
            "Sıvı Yağ Çeşitleri\n" +
                    "\n" +
                    "Sıvı yağlar ayçiçek, zeytin, mısır, fındık vb. bitkilerinin tohumlarından çeşitli işlemler sonucu elde edilir.\n" +
                    "\n" +
                    "Ham yağ nedir?\n" +
                    "\n" +
                    "Bitki tohumlarından yağ elde ederken presleme veya özütleme yöntemi bazen de her iki yöntem birden kullanılarak yağının çıkması sağlanır. Presleme sonrasında karışımdaki yağ, küspeden süzme yöntemiyle ayrılır. Özütleme sonrasında ise yağ, çözücüden ayrımsal damıtma ile ayrılır. Bu şekilde ham yağ elde edilir.\n" +
                    "\n" +
                    "Rafinerasyon nedir?\n" +
                    "\n" +
                    "Ham yağın gıda olarak tüketilebilecek özellik kazanması için (yenilebilir yağ hâline gelebilmesi için) istenmeyen maddelerin yağdan uzaklaştırılması yani yağın arıtılması gerekmektedir. Bu işlemlere rafinasyon denir. Rafinasyon; yağa istenilen renk ve kokuyu verme, yağın asitliğinin azaltılması, yağdaki mumsu maddelerin uzaklaştırılması gibi işlemleri içermektedir.",
    };
    public static String biyolojiBilimi[] = {
            "Biyoloji veya yaşam bilimi, canlıları inceleyen bir bilim dalıdır. Biyoloji ile ilgilenmekte olan bilim insanına ise biyolog veya yaşam bilimci adı verilir. Biyologlar, bütün canlıları; bütün gezegeni kaplayan global boyuttan, hücre ya da molekülleri kapsamına alan mikroskobik boyuta kadar bunları etkileyen önemli nitelikteki dinamik olaylar ile beraber incelemekte olan biyoloji bilimi ile uğraşan kişilerdir. Pek çok süreci bünyesinde bulunduran yaşamsal süreçlerden birkaç tanesi; enerjinin ve maddenin işlenmesi, vücudu meydana getiren maddelerin sentezlenebilmesi, yaraların iyileşebilmesi ve bütün organizmanın çoğalmasıdır.",
            "Canlı veya organizma, biyoloji ya da ekolojide işlevlerini yaşama olabildiğince ayak uydurarak sürdürebilen basit bir yapıya sahip moleküllerinin ya da karmaşık yapılı organ mekanizmalarının bir araya gelmesi ile ortaya çıkan varlıklar için kullanılmakta olan bir kavramdır. Canlıların çevreye uyum sağlayabilme, kalıtım ve üreme gibi ortak özellikleri, doğal varlıklar kapsamının ve yaşamın temel ögelerini ortaya çıkarır.",
            "Canlıların çok sayıda ortak özelliği bulunur. Bu özellikleri şu şekilde sıralamak mümkündür:\n" +
                    "\n" +
                    "Hücresel yapı\n" +
                    "\n" +
                    "Beslenme\n" +
                    "\n" +
                    "Solonum ve enerjinin üretilmesi\n" +
                    "\n" +
                    "Metabolizma\n" +
                    "\n" +
                    "Organizasyon\n" +
                    "\n" +
                    "Hareket\n" +
                    "\n" +
                    "Çevresel uyarılara karşı tepki verme\n" +
                    "\n" +
                    "Üreme\n" +
                    "\n" +
                    "Boşaltım\n" +
                    "\n" +
                    "Adaptasyon\n" +
                    "\n" +
                    "Büyüme\n" +
                    "\n" +
                    "Homeostasi ya da iç denge\n" +
                    "\n" +
                    "Protein sentezi\n" +
                    "\n" +
                    "Şeklinde canlıların ortak özelliklerini sıralamak mümkündür."
    };
    public static String canlilarinyapisi[] = {
            "İnorganik bileşenler canlıların vücudunda sentezlenemez ve her canlı dışarıdan hazır olarak alır. İnorganik bileşenler genellikle hücre yapısına katılmada veya enzimleri oluşturmada kullanılır. Başlıca inorganik bileşenler; mineraller, asitler, bazlar, tuzlar ve hayatımızın olmazsa olmazı sudur.",
            "– Su tüm canlıların temel maddelerinden biridir. İnsan vücudunun üçte ikisi sudur. Hücre içinde, hücreler arasında,kanda su bulunur. – Vücut suyunun % 10’u kaybedildiğinde hayati tehlike başlar. Bu kaybedilen su oranı % 20’ye ulaştığında ölüm meydana gelir.",
            "Mineraller\n" +
                    "Canlıların yapısında az da olsa minerallere gereksinim duyulur. Vücuttaki minerallerin en önemli fonksiyonları aşağıda özetlenmiştir.\n" +
                    "\n" +
                    "– Vitamin ve hormon gibi moleküllerin yapısına katılırlar.\n" +
                    "– Kanın ozmotik basıncının ayarlanmasında görev yaparlar.\n" +
                    "– Kas kasılmasında ve sinirlerde uyartı iletiminde rol oynarlar.\n" +
                    "– Bazı enzimlerin yapılarına katılarak onların katalizör görevine yardımcı olurlar.\n" +
                    "– Mineral içeren besinlerin düzenli olarak vücuda alınması gereklidir. Çünkü ter, idrar ve dışkı ile vücuttan sürekli mineral kaybı olur.",
            "Asitler ve Bazlar\n" +
                    "Suda çözündüğünde hidrojen iyonu H+ veren bileşiklerdir. Tatları ekşidir. Mavi turnusol kağıdını kırmızıya çevirir. pH değerleri 0-7 arasında bulunur. Laktik asit ve sitrik asit gibi asitler organik asitlere örnektir. Hidroklorikasit ise inorganik asitlere örnek olarak verilebilir.",
            "Tuz\n" +
                    "Asitlerle bazların birleşmesi ile oluşan maddelerdir. Hücreler ve hücre dışı sıvılar çeşitli mineral tuzlarını içerirler. Bunların en önemlileri sodyum, potasyum, kalsiyum ve magnezyum tuzlarıdır. Tuzlar vücut sıvılarının pH değerini ve osmotik basıncını dengelenme de görevlidir.",
            "Organik Maddeler\n" +
                    "Genel olarak yapısında C, H ve O bulunan ve canlılar tarafından üretilebilen bileşiklerdir. Yapılarında ayrıca azot, fosfor, kükürt gibi elementleri de katılabilir. Bazı bileşikler oksijen içermedikleri halde organiktir [metan (CH4) gibi]. . Canlılarda bulunan organik bileşikler; karbonhidrat, protein, yağ, vitamin, nükleik asitler, enzimler ve hormonlardır.",
            "Karbonhidratlar\n" +
                    "Yapılarında C, H, ve O atomu bulunur. Genel formülleri (CH2O)n şeklindedir. Bitkiler tarafından fotosentez ile üretilirler. Fazlası yağa dönüştürülerek vücutta depolanır. Canlılar tarafından 1. Sırada enerji verici olarak kullanılırlar. Nükleik asitlerin (DNA, RNA) ve ATP’nin yapısına katılırlar. Lipit ve proteinlerle birleşerek hücre zarının yapısına katılırlar. Bitkilerde hücre çeperinin yapısına katılırlar. Canlılarda; monosakkarit, disakkarit ve polisakkarit olarak bulunurlar.",
            "Yağlar(Lipitler)\n" +
                    "Lipit, tüm canlıların yapısında bulunan temel organik bileşiklerden biridir. Lipitler, doymuş ve doymamış yağlar olarak ayrılır. Doymamış yağlar, oda sıcaklığında sıvı hâlde bulunan lipitler; doymuş yağlar ise yine oda sıcaklığında katı hâlde bulunan lipitlerdir. Biyolojik önemi olan lipitler için yağ asitleri, nötr lipitler (trigliserit), fosfolipitler ve steroitler örnek gösterilebilir. Lipitler, insan ve hayvanların temel besinleri arasında yer alır.",
            "Proteinler\n" +
                    "Proteinler, amino asitlerin zincir halinde birbirlerine bağlanması sonucu oluşan büyük organik bileşiklerdir. Proteinler, açlık anında en son tüketilirler. Kimyasal sindirimleri midede başlar. Proteinler, amino asitlerin yapıtaşlarından oluşan polimerlerdir. Her proteinin kendisine has özelliklerinin olmasını sağlayan özel amino asit dizilimleri vardır. Canlılarda kullanılan 20 çeşit amino asit (canlıdan canlıya değişiklik gösterebilir) vardır.\n" +
                    "\n" +
                    "Aminoasidin merkezin\u00ADdeki karbon atomuna bir karboksil grubu, bir amino grubu, hidrojen atomu ve R ile sembolize edilen değişken bir grup bağlanmıştır. R grubunun farklı olması amino asitlerin çeşitliliğini sağlar.\n" +
                    "\n" +
                    "Amino asitler proteinleri oluşturmak için birbirlerine peptit bağları ile bağlanırlar. İki aminoasit birleşirse oluşan bileşik dipeptit, üç aminoasit birleşirse tripeptit, çok sayıda aminoasit birleşirse polipeptit adını alır.",
            "Nükleik Asitler\n" +
                    "– Nükleik asitler her hücrede bulunan genler ve kalıtsal faktörlerle ilgili protein sentezinin anahtar maddeleridir.\n" +
                    "– İlk kez hücre çekirdeğinden izole edildiği için adına “nüklein” yada “nüklein maddesi” denmiştir.\n" +
                    "– Ancak, çekirdek dışında da nükleik asitlere rastlandığı bilinmektedir.\n" +
                    "– Nükleik asitler kalıtsal bilgileri depolar ve aktarırlar.\n" +
                    "– Proteinlerde polipeptid zincirleri gibi nükleik asitler de nükleotidlerden kurulur.\n" +
                    "• Nükleotidler ise molar oranları 1:1:1 olan 3 çeşit maddeden oluşur:\n" +
                    "\n" +
                    "* Pentoz\n" +
                    "* Fosfat grup\n" +
                    "* Azotlu baz (purin ya da pirimidin)",
            "DNA (Deoksiribonükleik Asit)\n" +
                    "\n" +
                    "Sarmal oluşturan iki nükleotit zincirinden meydana gelmiş merdivene benzer bir moleküldür.\n" +
                    "\n" +
                    "Şeker-fosfat omurgaları sarmalın dışında yer alırken, azotlu bazlar sarmalın iç kısmında birbirleriyle eşleşirler. İkili sarmal içinde belirli bazlar birbirlerine uygunluk gösterir. Adenin bazı daima timin bazıyla, guanin bazı ise daima sitozin bazıyla eşleşir.\n" +
                    "\n" +
                    "Adenin bazı ile timin bazı arasında iki, guanin bazı ile sitozin bazı arasında üç tane zayıf hidrojen bağı kurulur.\n" +
                    "\n" +
                    "DNA’yı oluşturan zincirlerden birinin baz sırası bilinirse, bunu tamamlayan ikinci zincirin baz sırası da bulunabilir. Örneğin birinci zincirin baz sırası ATTCGACG şeklinde ise, diğer zincirin baz sırası TAAGCTGC şeklinde olur.",
            "RNA (Ribonükleik Asit)\n" +
                    "\n" +
                    "RNA tek sıra nükleotitten oluşur. Bu nedenle RNA’da, G=C ve A=U olma zorunluluğu yoktur. RNA’nın işlevi, DNA’dan aldığı genetik şifreye göre protein sentezini gerçekleştirmektir. RNA molekülü ribozomlarda, sitoplazmada, çekirdekte, mitokondri ve kloroplastlarda bulunur. RNA molekülü kendisini eşleyemez; DNA molekülü üzerindeki bilgiye göre gerekli RNA molekülleri sentezlenir. Bu yüzden her hücredeki RNA molekülü miktarı farklıdır.. Kas hücreleri gibi protein sentezinin yoğun olduğu hücrelerde fazla miktarda bulunur.\n" +
                    "\n" +
                    "Görevlerine göre hücrede üç çeşit RNA bulunur.\n" +
                    "\n" +
                    "Mesajcı RNA (mRNA): DNA’dan aldığı genetik bilgiyi, belirli şifreler halinde sitoplazmadaki ribozomla taşır. Bu bilgi sentezlenecek proteinin amino asit diziliş sırasını belirler.\n" +
                    "\n" +
                    "Taşıyıcı RNA (tRNA): Sitoplazmadaki amino asitleri tanır ve ribozomla taşır.\n" +
                    "\n" +
                    "Ribozomal RNA (rRNA): Proteinlerle birlikte ribozomların yapısını meydana getirir.",
            "ATP\n" +
                    "Adenozin trifosfat yani ATP; karbon (C), hidrojen (H), oksijen (O), azot (N) ve fosfat (P) içeren, tüm canlı hücrelerinde enerji dönüşümlerinde rol alan organik bir bileşiktir. Biyolojide karşımıza çok çıktığı için ATP nedir diye merak etmiş olabilirsiniz. ATP yapısında adenin bazı, riboz şekeri ve üç fosfat grubu içeren özel bir nükleotittir.\n" +
                    "\n" +
                    "Azotlu organik bir baz olan adeninin beş karbonlu bir şeker olan riboza bağlanmasıyla oluşan yapıya “adenozin”; bu yapıya sırasıyla birinci, ikinci ve üçüncü fosfat gruplarının eklenmesiyle oluşan bileşiklere de sırasıyla adenozin monofosfat (AMP), adenozin difosfat (ADP) ve adenozin trifosfat (ATP) adı verilir.",
            "Enzimler\n" +
                    "Canlı hücrelerde görev yapan ve biyokimyasal tepkimelerin gerçekleşmesi için gerekli olan aktivasyon enerjisini düşüren katalizörlere denir. Enzimler olmasaydı bütün (enzimlerin etki ettiği) tepkimeler çok daha uzun zamanda çok daha az miktarda parçalanırdı. Örneğin Karaciğerde üretilen katalaz enzimi; H2O2 (hidrojen peroksiti) 1 saniyede 5.000.000 tanesini parçalar. Eğer katalaz enzimi bu tepkimede kullanılmasaydı tepkime 300 yıl sürecek ve sadece 1 tane H2O2 molekülü parçalanacaktı.\n" +
                    "\n" +
                    "Vücuttaki görevi\n" +
                    "\n" +
                    "– Reaksiyon hızını canlılar için uygun bir seviyeye indirmek.\n" +
                    "– Reaksiyonun başlaması için gerekli aktivasyon enerjisinin düşürülmesi. Böylece canlı daha az enerji harcayarak tepkimeyi başlatır.\n" +
                    "– Reaksiyon oluşurken açığa çıkan enerjinin canlıya zarar vermeyecek düzeyde tutulmasını sağlamak.",
            "Hormonlar\n" +
                    "Vücudumuzdaki özelleşmiş hücre grupları tarafından üretilip kana salgılanan kimyasal maddelerdir. Vücut içinde organlar arasındaki haberleşmeyi ve koordinasyonu sağlar. Düzenleyici moleküllerdir. Bazıları protein, bazıları streoit, bazıları ise amino asit yapılıdır. Her hormonun kanda belirli bir eşik değeri vardır. Seviyelerindeki azalma ya da çoğalma hastalıklara sebep olur ve ölçülmesi ya da takip edilmesi gereken durumlar olabilir.",
            "Vitaminler\n" +
                    "Organik yapılı moleküllerdir. Sindirime uğramadan hücre zarından geçebilirler. Enerji verici değillerdir. Düzenleyici olarak kullanılırlar. Oksijen, ışık, metal ve sıcaklıktan etkilenirler.\n" +
                    "\n" +
                    "Vücuttaki görevi\n" +
                    "\n" +
                    "– Büyüme ve gelişmede etkilidirler.\n" +
                    "– Üremede etkilidirler.\n" +
                    "– Vücudun direncinin artmasını sağlarlar.\n" +
                    "– Enzimlerin yapısına koenzim olarak katılırlar.",
            "A vitamini: A vitamini yağda eriyen vitaminlerdendir. Karaciğerde depolanan bu vitamin ısıya ve pişirmeye dayanıklıdır. Enfeksiyonlara karşı direnci arttırır normal büyüme, üreme, kemik ve diş gelişimi, görme için gereklidir. Cildin tırnakların ve saçların sağlıklı kalmasını sağlar. Diş ve dişetleri için büyük önem taşır .\n" +
                    "\n" +
                    "Hangi besinlerde bulunur: Kayısı, kuşkonmaz, maydanoz, ıspanak, havuç, kereviz, marul, portakal, erik, domates.\n" +
                    "\n" +
                    "B1 vitamini: Kasların ve sinir sisteminin faliyeti için gereklidir.Yetersizliğinde iştahsızlık, huzursuzluk, bellek zayıflığı ve dikkat azalması görülür. Bu vitamin öncelikle şeker hastalığı, doku sertleşmesi, sinirsel hastalıklar önlenmesinde kullanılır ve yaşlı insanların zihinsel fonksiyonların sürdürebilmesine yardımcı olur.\n" +
                    "\n" +
                    "Hangi besinlerde bulunur: Buğday, kepek, bira mayası, taze sebze meyve, koyun eti, sığır eti, balık eti, yumurta, süt.\n" +
                    "\n" +
                    "B2 vitamini: suda eriyen bir vitamindir ve vücutta depolanmaz. Eksikliğinde dilde kızarma, yanma hissi, ağız çevresi ve dudaklarda kızarma, tahriş, çatlaklar, gözlerde kaşıntı, yanma hissi, katarakt oluşumu, saçların dökülmesi, çocuklarda büyüme yavaşlaması, kilo kaybı, sindirim sorunları oluşur.\n" +
                    "\n" +
                    "Hangi besinlerde bulunur: Buğday unu, patates, et, süt, yumurta, peynir, kepek, yeşil sebzeler, havuç, fındık, yer fıstığı, mercimek.\n" +
                    "\n" +
                    "B3 vitamini: protein, yağ ve karbonhidrat metabolizması için gerekli olan bir vitamindir. Yetersiz beslenme sonucu deriyi sinir sistemini tutan pellegra adlı hastalık ortaya çıkar. Hücrelerin oksijeni kullanabilmeleri için gereklidir. Midede sindirimin temel taşları olan asitlerin üretimini sağlar.\n" +
                    "\n" +
                    "Hangi besinlerde bulunur: Bira mayası, kepek, yer fıstığı, sakatat, kırmızı et, balık, buğday, baklagiller, un, yumurta, süt, limon, kabak, incir, portakal, hurma.\n" +
                    "\n" +
                    "B6 vitamini: Sinir sistemi ve hormonların çalışmasını düzenler.Vücudun savunmasında antikor ve akyuvar oluşumunda rol oynar. Eksikliğinde migren tipi baş ağrısı, kansızlık, ciltte kuruluk, görme problemleri, uyuşukluk, adele zayıflığı ve krampları oluşur . Hayvansal ve bitkisel besinlerde düşük yoğunlukta bulunur.\n" +
                    "\n" +
                    "Hangi besinlerde bulunur: Muz, avakado, tavuk eti, patates, ıspanak, bezelye, bira mayası, havuç, yumurta, balık.\n" +
                    "\n" +
                    "B12 vitamini: Normal büyüme gelişmede olumlu rol oynar. Sinir hasarlarında tedavi edici rol oynar. Besinlerle veya sigara gibi alışkanlıklarla vücuda giren siyanürü etkisiz hale getirir. Eksikliğinde dilde hassasiyet, şişme, kızarma, hayal görme, depresyon, adalelerde kasılmalar, sinir iltihaplarına bağlı olarak el ve ayaklarda uyuşma, karıncalanma, yanma şikayetleri oluşur .\n" +
                    "\n" +
                    "Hangi besinlerde bulunur: Süt, yumurta akı, peynir, balık, karides, dana eti, dana karaciğeri, böbrek, midye, dil balığı, ringa balığı, uskumru, sardalya.\n" +
                    "\n" +
                    "C vitamini: Vücudumuz C vitaminini üretemez bitkiler ve bazı hayvanlar bu vitamini üretebilmektedir. Besinlerle alınan vitamin 2 saat içersinde kullanılır 4 saat sonunda kandan uzaklaşır. Yaraların iyileşmesini, damarların sağlıklı olamalarını sağlar.Vücudun savunma sistemini artırıcı etkisi vardır. Histamin yapımını azaltarak allerjik olayların şiddetini düşürür. Eksikliğinde diş eti kanamaları ve çekilmeleri olur. Göz merceği ve akciğer gibi yapılarda antioksidan olarak çalışır.\n" +
                    "\n" +
                    "Hangi besinlerde bulunur: Siyah üzüm, narenciye, çilek, kavun, karpuz, yeşil biber, maydanoz, brokoli, havuç, soğan, bezelye, muz, kabak, lahana, ıspanak.\n" +
                    "\n" +
                    "D vitamini: İnce bağırsaklardan kalsiyum ve fosforun emilimini düzenleyerek kemik büyümesi, sertleşmesi ve tamiri üzerinde etkili olur. Böbrek hastalıklarında düşük kan kalsiyumu seviyesini düzenler. Kas kasılmalarını önler. Kalsiyumla birlikte kemik gelişimini kontrol eder. Bebekler ve çocuklarda kemik ve dişlerin normal gelişme ve büyümesini sağlar.\n" +
                    "\n" +
                    "Hangi besinlerde bulunur: Balık yağı, balık, yumurta, tereyağı, ringa balığı, uskumru fileto, somon balığı, tuna balığı.\n" +
                    "\n" +
                    "E Vitamini Toksisitesi: Bir kişinin doğal kaynaklarla E vitamininde doz aşımı yapması olasılığı çok düşüktür. Doz aşımı yapan çoğu insan, E vitamini takviyesi aldığından dolayı meydana gelmiştir. Yüksek dozda E vitamini takviyesi, kanama ve beyinde ciddi kanama riskini artırabilir. Yüksek E vitamini seviyeleri de doğum kusurları riskini artırabilmektedir.\n" +
                    "\n" +
                    "K vitamini: Besinlerle birlikte kalın bağırsaktaki bakteriler tarafından da sentezlenir. Gereksiz antibiyotik kullanımı bakterileri öldürdüğünden dolayı K vitamini eksikliği görülür.\n" +
                    "\n" +
                    "Hangi besinlerde bulunur: Ispanak, brokoli ve marul gibi yeşil yapraklı sebzeler, yaban mersini ve incir gibi bazı meyveler, et, peynir, yumurta ve soya fasulyesi.",
    };
    public static String hucre[] = {
            "Hücre Nedir?\n" +
                    "Canlıların yaşam için gerekli olan özelliklerini taşıyan ve uygun koşullarda yaşamını tek başına sürdürme yeteneğine sahip temel yapı ve işlem birimidir. Hücre, çok hücreli canlılardaki en küçük yaşam birimidir.\n" +
                    "\n" +
                    "Hücre zarı, sitoplazma ve çekirdektir. Tek hücrelilerde bütün olaylar hücre içerisinde gerçekleşir. İş bölümü ve doku oluşumu yoktur. Çok hücrelilerde bütün olaylar hücre grupları arasındaki iş bölümü ile olur. En basit çok hücreli yada en karmaşık tek hücreli Volvox‘ tur. Volvox’ ta iş bölümü vardır ama doku oluşumu yoktur. Tek hücrelilerin oluşturduğu topluluğa koloni denir.",
            "Hücrenin Elemanları\n" +
                    "Sitoplazma\n" +
                    "\n" +
                    "– Hücre içinin çekirdek dışında kalan kısmına sitoplazma denir. Tüm hücrelerde bulunur.\n" +
                    "\n" +
                    "– Sitoplazma, organeller ve bunların içinde yer aldığı koyu kıvamlı yarı akışkan (kolloidal) sıvı kısım (sitozol) dan oluşur.\n" +
                    "\n" +
                    "– Bu sıvı kısmın içeriğini enzimler, RNA, organik bileşiklerin yapı taşları (amino asitler, nükleotitler gibi) yıkım tepkimeleri sonucu oluşan atık ürünler, koenzimler, iyonlar ve büyük oranda su (%70-90) oluşturur. Sitoplazma solunum, fotosentez, beslenme, sindirim, boşaltım gibi bütün yaşamsal olayların geçtiği yerdir.",
            "Hücre Zarı\n" +
                    "\n" +
                    "– Sitoplazmayı hücrenin dışından ayıran kısımdır.\n" +
                    "\n" +
                    "– Esnek bir yapıdadır ve canlıdır.\n" +
                    "\n" +
                    "– Seçici geçirgendir.\n" +
                    "\n" +
                    "– Üzerinde bulunan porlar sayesinde madde geçişini sağlayabilir.\n" +
                    "\n" +
                    "– Yoğun miktarda yağ barındırdığı için yağda çözünen maddeler zardan çözünerek hücrenin içine girebilir.\n" +
                    "\n" +
                    "– Canlı olduğu için madde geçişi sırasında enerji gerektiren olayları gerçekleştirebilir.\n" +
                    "\n" +
                    "– Zarının yapısında büyük oranda protein ve yağ az miktarda karbonhidrat bulunur.\n" +
                    "\n" +
                    "– Zarın yapısındaki fosfat ve yağlar birleşerek fosfolipitleri oluşturur.(Fosfolipler akıcılığı saplar.)\n" +
                    "\n" +
                    "– Protein molekküleri fosfolipitlerin arasına gömülüdür.\n" +
                    "\n" +
                    "– Zarın dışa bakan yüzünde proteinler karbonhidratlarla birleşerek glikoproteinleri, yağlar karbonhidratlarla birleşerek glikolipit oluşturur.\n" +
                    "\n" +
                    "– Zarın yapısında bulunan kolesteroller (Yağ monomeri) hücrenin fazla ısınmamasında rol alırlar.",
            "Hücrenin Organelleri Nelerdir?\n" +
                    "Zar tipine göre organeller üç grupta inceleyebiliriz.\n" +
                    "\n" +
                    "Zarsız organeller;\n" +
                    "\n" +
                    "* Setrozom\n" +
                    "* Ribozom\n" +
                    "\n" +
                    "Tek katlı zarlı organeller;\n" +
                    "\n" +
                    "* Endoplazmik retikulum (ER)\n" +
                    "* Lizozom\n" +
                    "* Golgi\n" +
                    "* Koful\n" +
                    "* Peroksizom\n" +
                    "\n" +
                    "Çift katlı zarlı organeller;\n" +
                    "\n" +
                    "* Mitokondri\n" +
                    "* Plastitler\n" +
                    "* Çekirdek",
            "Ribozom\n" +
                    "– Evrensel organeldir (Bütün canlı hücrelerde bulunur).\n" +
                    "\n" +
                    "– Temel görevi amino asitleri birbirine bağlayarak protein sentezlemektir.\n" +
                    "\n" +
                    "– Zarsız bir organeldir.",
            "Sentrozom\n" +
                    "Sentrozom, birbirine dik iki silindirik cisme sahiptir. Her sentriyol, birbirine paralel üç küçük tüpten oluşmuş, dokuz iplik içerir. Bu iplikler protein yapısında olup arası matriks ile doludur. Sentrozom organeli zarsız bir organeldir. Mikrotübüller silindirik biçimde dizilirler.",
            "Endoplazmik Retikulum (ER)\n" +
                    "Endoplazmik Retikulum, sabit bir büyüklüğü ve şekli olmayan, dolayısıyla hücre içindeki miktarı sayı ile belirtilemeyen bir organeldir.\n" +
                    "\n" +
                    "Olgun alyuvar hücreleri dışında genellikle bütün ökaryot yapılı hücrelerde bulunur. Çekirdek zarından başlayarak sitoplazmaya, hatta hücre zarına kadar uzanır ve hücre içinde birbiriyle bağlantılı olan geniş bir kanal sistemi oluşturur.\n" +
                    "\n" +
                    "Üzerinde ribozom taşıyan çeşidine granüllü endoplazmik retikulum, üzerinde ribozom bulundurmayan türüne de granülsüz ya da düz endoplazmik retikulum denir. Bir hücrede her iki tip endoplazmik retikulum aynı anda bulunabilir.",
            "Lizozom\n" +
                    "Lizozom, ökaryotik hücrelerin sitoplazmasında bulunan, zarla çevrili, genellikle küçük, yuvarlak ve çapları 0,2-0,8 mikron arasında değişen yapılardır. İçerikleri asidiktir ve çeşitli sindirici enzimler içerirler.\n" +
                    "\n" +
                    "Lizozomun görevleri;\n" +
                    "\n" +
                    "* Lizozomların en önemli görevi, hücre içindeki maddeleri sindirmektir.\n" +
                    "* Hücrenin savunmasına karşı bir görev üstlenir.\n" +
                    "* Enzimleri yaşlanmış olan molekül ve organelleri parçalar.\n" +
                    "* Lizozom spermin baş kısmında bulunup yumurtanın delinmesini sağlar",
            "Golgi\n" +
                    "– Tek zarla çevrili üst üste dizilmiş yassı keseciklerden oluşur.\n" +
                    "\n" +
                    "– Granülsüz ER’den meydana gelmiştir.\n" +
                    "\n" +
                    "– Hücrede salgılama ve zar fabrikası gibi görev yapar.\n" +
                    "\n" +
                    "– ER’den gelen protein, lipit, karbonhidrat gibi temel bileşenleri işleyip farklılaştırarak; hücre zarının bileşenleri olan glikolipit, glikoprotein, lipoprotein sentezler. Ayrıca enzim, hormon gibi düzenleyicileri de sentezler.",
            "Koful\n" +
                    "– Koful, çeşitli çözeltiler ile dolu tek katmanlı bir zar ile çevrilmiş organel.\n" +
                    "\n" +
                    "– Hem ökaryot hem de prokaryot hücrelerde bulunur.\n" +
                    "\n" +
                    "– Bitki hücrelerinde daha büyüktürler. Çünkü bitki hücreleri, hayvan hücreleri kadar gelişmiş değillerdir. Bu nedenle bitki hücrelerinde bulunan koful, daha fazla işleve sahiptir.",
            "Peroksizom\n" +
                    "– Tek kat zar ile çevrili olan peroksizomlar metabolik aktivitesi fazla olan, karaciğer, böbrek, ve kalp\n" +
                    "kası gibi hücrelerde fazla bulunurlar.\n" +
                    "\n" +
                    "– Bunlar katalaz, ürik asit, oksidaz ve daminoasit içerir.\n" +
                    "\n" +
                    "– Hücrede zehir etkisi yapan hidrojen peroksiti (H2O2); H2O ve ½ O2’ye dönüşen katalaz enzimini taşıyan organeldir.\n" +
                    "\n" +
                    "– Perksizomlar yağ asitlerini oksitleyerek metabolik enerjinin en büyük kaynağını oluştururlar ve bu özellikleriyle hücre için hayati bir rol oynarlar.",
            "Mitokondri\n" +
                    "Mitokondri :Hücrede enerji (ATP) üretimini sağlayan merkezdir.\n" +
                    "\n" +
                    "– Sayısı hücrenin enerji ihtiyacına göre değişir.\n" +
                    "\n" +
                    "– Çizgili kas, sinir, kalp ve karaciğer hücrelerinde mitokondri fazladır.\n" +
                    "\n" +
                    "– Dış zarı düzgün, iç zarı ise kıvrımlıdır.\n" +
                    "\n" +
                    "– Yani, iç zarı matrix içine doğru uzamıştır, böylece yüzey arttırılmıştır.\n" +
                    "\n" +
                    "– Bu uzantılara krista denir.\n" +
                    "\n" +
                    "– Mitokondri içindeki sıvıya matrix denir.\n" +
                    "\n" +
                    "– Kendine ait DNA, RNA ve ribozomu vardır.\n" +
                    "\n" +
                    "– Gerektiğinde çoğalabilir.\n" +
                    "\n" +
                    "– Gerektiği zaman bölünebilir, büyüyebilir ve kendisi için gerekli bazı proteinleri sentezleyebilir.\n" +
                    "\n" +
                    "– O2’li solunum, hücre sitoplâzmasında başlayıp mitokondride devam etmekte ve açığa çıkan enerji ATP şeklinde depolanmaktadır.",
            "Plastitler\n" +
                    "Bitki hücrelerinde, alglerde ve öglena gibi protistlerde bulunan çift katlı bir organeldir.\n" +
                    "\n" +
                    "-İçerdikleri renk maddeleri ve yaptıkları göreve göre kloroplast, kromoplast ve lökoplast olmak üzere üç çeşit plastit vardır. Üçü de çift katlı zar ile kuşatılmıştır.",
            "Kloroplast\n" +
                    "\n" +
                    "Alglerde, bitkilerin fotosentez yapan hücrelerinde, öglenada bulunur. Yapısında çok miktarda bulunan klorofil pigmenti nedeniyle yeşil renklidir. Klorofil pigmenti ile emdiği ışık enerjisini organik besinin yapısındaki kimyasal enerjiye dönüştürür.\n" +
                    "\n" +
                    "Kendine ait DNA, RNA ve ribozomu vardır. Çekirdek kontrolünde DNA’sını eşleyerek sayısını artırabilir. Kendi proteinlerini üretebilir.\n" +
                    "\n" +
                    "Dış zar ve iç zar sisteminden başka ışığın emildiği tilakoid zarlar bulunur. Bu zarlardan oluşan yapıya grana denir. Organelin sıvı kısmına ise stroma adı verilir. DNA, RNA ve ribozomIarı sıvı kısmı olan stromada bulunur. DNA’sı prokaryotlarınki gibi halkasaldır.\n" +
                    "\n" +
                    "Yapısında bulunan klorofil pigmenti ile güneş ışığını emerek besin üretimi yapar. Yani aşağıdaki reaksiyonda görüldüğü üzere inorganik maddelerden organik maddeler üretir.",
            "Kromoplast\n" +
                    "\n" +
                    "Bitkilerin çiçeğine renk verir. Çiçeklerdeki kırmızı, sarı, turuncu, hatta leylak gibi renklerin oluşmasını sağlar. Havuca turuncu renk veren karoten, domatese kırmızı renk veren likopen, limona sarı renk veren ksantofil, bitkiye yeşil rengi veren ise klorofildir. Kısaca kromoplast bitkiye sarı, kırmızı, turuncu gibi renkleri verir. Bitkilerin bazı renkleri ise koful öz suyunun asidik ya da bazik oluşuna göre renk değiştiren “antokyan” tarafından oluşturulur.",
            "Proplastit\n" +
                    "\n" +
                    "Proplastit, hücrede sitoplazma içerisinde bulunan tanımlanamamış plastit. Plastitlerin diğer plastit türlerine dönüşmeden önceki tanımlanamamış halidir.",
            "Lökoplast\n" +
                    "\n" +
                    "Renksizdir.Bitkinin kök,toprak altı gövdesi (rizom) ve tohumları gibi depo organlarında bulunur. Besin depolar. Patates gibi kökte, yumruda ya da bitkinin renksiz kısımlarında lökoplast renksizdir, ama gün ışığına çıkınca bitkinin bulunduğu yerdeki rengini değiştirir.",
            "Çekirdek\n" +
                    "Hücre çekirdeği ya da nükleus, ökaryot hücrelerin çoğunda bulunan zarla kaplı bir organeldir. Hücrenin genetik bilgilerinin çoğu, hücre çekirdeğinin içinde katlı uzun doğrusal DNA molekülleri ile histon gibi birçok proteinin bir araya gelerek oluşturduğu kromozomlarda bulunur. Bu kromozomların içindeki genler hücrenin çekirdek genomunu oluşturur. Hücre çekirdeğinin işlevi bu genlerin bütünlüğünü devam ettirmek ve gen ekspresyonunu düzenleyerek hücre işlevlerini kontrol altında tutmaktır. Çekirdeği çıkarılan her hücre bir süre sonra ölür.\n" +
                    "\n" +
                    "Çekirdek, çift katlı zar ile çevrilidir. Zar üzerinde tıpkı hücre zarının yapısında bulunan ve madde alışverişinin yapıldığı porlar bulunur. Yalnız çekirdek zarı üzerindeki porlar, hücre zarında bulunan porlardan daha büyüktür.\n" +
                    "\n" +
                    "Çekirdek zarı endoplazmik retikulum organelinin zarının devamıdır. Hücrede çekirdek bölünmesinin ilk aşamasında eriyip son aşamasında tekrar oluşur. Çekirdek içinde bulunan sıvı kısma çekirdek plazması denir. Bu sıvı kısımda DNA, RNA, ATP, mineraller, enzimler, nükleotitler, proteinler, su ve daha birçok madde bulunur.\n" +
                    "\n" +
                    "Çekirdek içinde rRNA ve proteinlerin yoğunlaştığı bölgeye çekirdekçik denir. Bu bölgeyi çekirdek plazmasından ayıran bir zar yoktur. Sitoplazmadaki ribozomlarda üretilen protein ve çekirdekçik içinde üretilen rRNA molekülü burada birbirine bağlanarak ribozom organelini oluşturur. Hücrenin ribozom organeline ihtiyacı ile doğru orantılı olarak çekirdekçik sayısı ve büyüklüğü artabilir.",
    };
    public static String cablicesitliligi[] = {
            "Canlıların benzerlik veya akrabalıklarına göre gruplara ayrılmasına canlıların sınıflandırılması denir.Canlılar iki tip sınıflandırılma yapılabilir\n" +
                    "\n" +
                    "Suni(Ampirik) Sınıflandırma\n" +
                    "Doğal(Filogenetik) Sınıflandırma\n" +
                    "Canlılar Alemi\n" +
                    "*Prokaryot Canlılar\n" +
                    "*Ökaryot Canlılar",
            "Sınıflandırmanın amacı;\n" +
                    "\n" +
                    "– Biyolojik çeşitliliği ve bu çeşitliliğin yeryüzü üzerindeki dağılımının nasıl olduğunu anlamak.\n" +
                    "– Çok fazla çeşitliliğe sahip olan canlı gruplarını daha kolay ve iyi öğrenilebilir hale getirmek.\n" +
                    "– Canlılarla ilgili genelleme yapabilmek. Bir gruptaki canlılardan birisi incelenip öğrenilirse, aynı gruptaki diğer canlılar hakkında da genel bilgiler edinilmiş olur.\n" +
                    "– Aynı canlının, farklı bölgelerde farklı adlarla tanınmasını engeller. Bilim insanları arasında iletişim ve dil birliği sağlar.\n" +
                    "– Günlük yaşamda kullanılan yaygın isimler canlının bilimsel özelliklerini doğru anlatmayabilir. Bilimsel adlandırma yöntemine uygun olarak yapılan adlandırmalar yaygın adların kullanılmasıyla ortaya çıkacak karışıklıkları önler.\n" +
                    "– Dünya üzerinde yaşamış ve nesilleri tükenmiş eski türler ile yeni türleri karşılaştırmak.",
            "Suni(Ampirik) Sınıflandırma\n" +
                    "Aristoteles’in sınıflandırması canlıların görülebilen ve morfolojik özelliklerine göre yapılmıştır. Günümüzdeki sınıflandırılmada, canlıların bütün özellikleri göz önünde bulundurulur.\n" +
                    "\n" +
                    "Bu gruplandırmayı yaparken canlıların yaşadıkları ortamları ve dış görünüşlerini dikkate almıştır.\n" +
                    "\n" +
                    "Havada yaşadıklarından ve ikisinin de kanadı olduğundan yarasa ve arıyı aynı gruba almıştır. Bu sınıflandırma doğru bir sınıflandırma değildir.\n" +
                    "\n" +
                    "Aristo’nun öğrencisi Theophratus (Teofratus) ise bitkileri dış görünüşlerine göre ot, çalı, ağaç olarak üç gruba ayırmıştır.\n" +
                    "\n" +
                    "Hayvanlar: Karada yaşayanlar,havada yaşayanlar,suda yaşayanlar. Suni sınıflandırma dış görünüş esas alındığı için nitel sınıflandırmaya dayanır.",
            "Doğal(Filogenetik) Sınıflandırma\n" +
                    "Canlıların köken benzerlikleri, akrabalık dereceleri ve genetik bilgileri gibi özelliklerine dayanılarak sınıflandırılmasına doğal (filogenetik) sınıflandırma denir.\n" +
                    "\n" +
                    "Bu sınıflandırma çeşidinde yapay sınıflandırmadan farklı olarak homolog organlar kullanılır. Kökenleri aynı, görevleri farklı olan organlara homolog organlar denir.\n" +
                    "\n" +
                    "Örnek: İnsanın kolu – Kuşun kanadı – Balinanın yüzgeci\n" +
                    "\n" +
                    "Organları homolog olan canlılar akrabadırlar.Akraba canlıların proteinlerindeki amino asit dizilişleri, embriyonik gelişim evreleri, boşaltım artıkları da benzerdir. Nicel gözlemlere dayanır.",
            "Sınıflandırma Birimleri\n" +
                    "Alem, Şube, Sınıf, Takım, Familya (Aile), Cins ve Tür’dür.\n" +
                    "\n" +
                    "En küçük birim türdür ve sadece türde bulunan canlıların üremesiyle (çifleşmesiyle) verimli döller oluşur. (Verimli döl: Oluşan oğul döllerinde üreme kabileyetine sahip olmasıdır.)\n" +
                    "\n" +
                    "Not: Yukarıda bahsedilen tür kavramı bazı canlı gruplarını içermeyebilir.(Örnek: Bakteriler, arkeler, bölünerek üreyebilen yassı solucanları ve deniz yıldızları gibi.)",
            "Binominal (İkili) Adlandırma:\n" +
                    "\n" +
                    "Türlerin adlandırılmasında iki kelime kullanılır. Birinci kelime büyük harf ile başlar ve eğik yazılır.\n" +
                    "\n" +
                    "Bu kelime, canlının cinsini belirtir. İkinci kelime ise küçük harf ile başlar ve eğik yazılır. Bu kelime tamamlayıcı addır. Bu iki kelime birden canlının tür ismidir.\n" +
                    "\n" +
                    "Aslan: Felis leo\n" +
                    "Kaplan: Felis tigris\n" +
                    "Ev kedisi: Felis domesticus\n" +
                    "Köpek: Canis familiaris\n" +
                    "Kurt: Canis lupus\n" +
                    "Karaçam: Pinus nigro  \n" +
                    "Soğan: Allium cepa\n" +
                    "Patates: Solanum tuberosum\n" +
                    "Ev faresi: Mus musculus",
            "Bakteriler\n" +
                    "– Ribozom dışında organelleri bulunmaz.\n" +
                    "– Bütün bakterilerde hücre zarı ve hücre çeperi bulunur.\n" +
                    "– Hücre zarından oluşan mezezomları bulunabilir.\n" +
                    "– Fotosentez yapan türlerinde (Siyano bakterilerinde) klorofil pigmenti bulunur.(Hücre zarında bulundururlar.)\n" +
                    "– Kalıtım maddesi olan DNA sitoplazmada bulunur ve halkasaldır.\n" +
                    "– Depo maddeleri glikojendir.\n" +
                    "– Aerob (Oksijenli solunum) , anaerob (Oksijensiz solunum) ve fakültatif (Hem oksijenli hemde oksijensiz solunum) solunum şekillerini yapabilirler.\n" +
                    "– Bölünerek ve sporla üreyebilirler.",
            "Virüsler\n" +
                    "– Protein kılıf ve bir nükleik asitten meydana gelir.Bu yapıya nükleoprotein denir.\n" +
                    "– Virüsün protein kılıfına kapsid, kılıfı oluşturan parçalara kapsomer, yönetici molekülüne ise genom denir.\n" +
                    "– Sitoplazmaları yoktur.\n" +
                    "– Enzim sistemleri olmadığından hücre içi mecburi parazittirler.\n" +
                    "– Enzim sistemleri olmadığından antibiyotiklerden etkilenmezler.\n" +
                    "– En küçük organizmalardır.\n" +
                    "– Hücre dışında kristal yapıda bulunurlar.\n" +
                    "– Özel dokularda çoğalırlar.Her virüsün çoğaldığı belli bir hücre çeşidi vardır. Bunun sebebi ise hücre zarındaki glikoproteinlerin virüslerle birleşebilme özelliği olmasındandır.\n" +
                    "– Virüsler yüksek sıcaklık, ortam pH ı ve radyoaktif ışınlardan etkilenir ve ölürler.",
            "Mavi-Yeşil Algler\n" +
                    "– Fotosentez yaparlar ama kloroplastları yoktur.\n" +
                    "– Tatlı su birikintilerinde ve göllerde yaşarlar.\n" +
                    "– Sitoplazmalarında yeşil renkli klorofil pigmenti ve mavi renkli fikosiyanin pigmenti bulunur.\n" +
                    "– Yapışkan, jelatinimsi bir dış kılıf ile örtülüdür.",
            "Ökaryot Canlılar\n" +
                    "Ökaryotlar hücrelerinin yapısından dolayı beraber gruplandırılmış bir canlılar grubudur.Ökaryotların tanımlayıcı özelliği genetik malzemelerinin zarla çevrili bir veya birkaç çekirdek içinde yer almasıdır.Bakteri ve arkeler çekirdeksiz olduklarından beraberce prokaryot olarak adlandırılırlar.Çekirdeğin yanı sıra, ökaryotların mitokondri veya kloroplast gibi zarla çevrili çeşitli organelleri vardır, bu tür hücre içi karmaşık yapılar da prokaryotlarda bulunmaz.\n" +
                    "\n" +
                    "Ökaryotların ortak bir atası olduğu için bir üst alem olarak tanımlanmışlardır. Üst alem sisteminde ökaryotların, prokaryotlara kıyasla, arkelerle daha çok ortak özellikleri vardır.",
            "Protista Alemi\n" +
                    "Tek hücreli canlılar (Prokaryot) olmalarına rağmen hücre yapısı olarak çok hücreli (Ökaryot) canlılara benzerler. Bu alemde yaşayan canlılar hücre çekirdeği ve zarlı organeller bulundurular.(Ökaryot canlılar gibi)\n" +
                    "\n" +
                    "Protista âlemi; kamçılılar, kök ayaklılar, silliler (kirpikliler), sporlular, algler ve cıvık mantarlar olmak üzere altı grupta incelenir.\n" +
                    "\n" +
                    "Amip: Yalancı veya kök ayakları sayesinde beslenme,hareket ve koruma gib aktiviteleri gerçekleştirebilirler. Hareket ederken amipsi hareket ederler. Belirgin bir şekilleri yoktur ve durmadan şekil değiştirirler. Hetotrof (Tüketici) beslenirler.\n" +
                    "\n" +
                    "Öglena: Bulundurdukları kampçı sayesinde beslenme,korunma ve hareket edebilme özellikleri kazanırlar. Hetetrof,(tüketici) ,ototrof (üretici) ve hem hetetrof hemde ototrof beslenen türleri bulunur.(Ototrof beslenebilen türlerinde kloroplast organeli bulunur.) Hücre çeperi bulundurmazlar ve paramesyum gibi hücrelerini saran pelikulaya sahiptirler. Kampçılarında göz lekesi gibi bir kısım bulundururlar. Bu sayede ışığı algılayabilirler.\n" +
                    "\n" +
                    "Algler: Bitki hücreleri gibi fotosentez yapar ve hücre çeperine sahiptir. Alglerin karasal hem de sucul ortamlarda yaşayan türleri vardır. Dünyada üretilen serbest oksijenin çok büyük bir kısmı algler tarafından üretilir. Bir hücreli olabildikleri gibi çok hücreli olanları da vardır. Plastitlerinde değişik renklerde pigment maddeleri bulunur. Algler; taşıdıkları pigmentlere göre yeşil, kahverengi, altın sarısı ve kırmızı algler olarak sınıflandırılır. Bazı algler, mikroskobik olmasına rağmen bazıları da metrelerce boya sahiptir.\n" +
                    "\n" +
                    "Cıvık Mantarlar: Mantarların protistlere benzeyen grubudur. Ancak hücre çeperine sahip olmadıkları için ve amipsi hareket yaptıkları için mantarlar aleminde incelenmezler. Cıvık mantarlar belirli bir hücre şekline sahip olmayan, nemli ve rutubetli yerlerdeki ölü bitki ve hayvanların kalıntıları üzerinde yaşayan, tek hücreli canlılardır.\n" +
                    "\n" +
                    "Paremesyum (Silliler): Bu alem içinde bulunan en gelişmiş canlı türüdür. Hücre yüzeylerinde bulunan sil adı verilen kısımlar ; hareket etmeyi , beslenmeyi ve dış etilere karşı tepki oluşturulmasını sağlar. Biri büyük biride küçük olmak üzre iki çekirdekleri bulunur. Büyük çekirdek hücre metabolizması ve eşeysiz üremeye (Bölünerek) düzenlerken küçük çekirdek ise konjugasyon olayını düzenler.(Konjugasyon: İki canlı arasında oluşan sitoplazmik köprü yardımıyla karşılıklı genetik madde .)\n" +
                    "\n" +
                    "Hücrelerinin dış kısmında pelikula adlı bir kılıf bulunur.Bu kılıf hücrenin şekil olmasında ve korunmasında etkilidir.Hücre çeperleri bulunmaz. Fotosentez yapamazlar (Tüketici canlılardır.) Hücredeki ozmotik dengeyi sağlana kontraktil koful bunundururlar.\n" +
                    "\n" +
                    "Sporlular : Spor adlı yapılar sayesinde üreyen canlılardır. Hareketlerini sağlayan bir yapı olmadığı için pasif hareket ederler. En bilinen üyeleri Plazmodium malariadır .(Sıtma hastalığının etkeni)  Sporlular hücre içi paraziti olarak yaşar ve besin ihtiyacını üzerinde yaşadığı canlıdan karşılar.Üremeleri, eşeysiz üremenin eşeyli üremeyi takip ettiği iki aşamada gerçekleşir. (Metagenez)",
            "Bitkiler Alemi\n" +
                    "Hepsi çok hücreli, hücre yapıları ise ökaryottur. Hücreleri çeperli, çeperin esas maddesi ise selülozdur. Klorofil molekülleri kloroplastlar içinde kümelenmiştir. Kloroplasttan başka, kromoplast ve lökoplast gibi renk pigmentleri de vardır. Depo karbonhidratları nişastadır.Yeşil bitkilerin hepsi ototrof olup, ışık enerjisini kimyasal enerjiye çevirirler. Çoğunluğu toprağa bağlı olduğundan yer değiştiremezler.",
            "Mantarlar (Fungiler) Alemi\n" +
                    "– Glikojen depolamaları ve heterotrof beslenmeleri (tüketici) hayvanlara benzer, ama hücre çeperi taşımaları ve pasif hareketli olmaları bitkilere benzer özellikleridir.\n" +
                    "– Hücre çeperleri kitin yapılıdır.\n" +
                    "– Bazıları tek hücreli (mayalar) bazıları ise çok hücrelidir (şapkalı mantarlar ve küf mantarları).\n" +
                    "– Tomurcuklanma ve sporlanma gibi eşeysiz üreme çeşitlerinin yanında eşeyli üreme de gösterirler. Bazı türlerinde eşeyli ve eşeysiz üreme bir birini takip eder (metagenez).\n" +
                    "– Gıda ve ilaç sektöründe mantarlar kullanılır.\n" +
                    "– Mantarlar kendi aralarında gruplara ayrılırlar.",
            "Hayvanlar Alemi\n" +
                    "Dünyanın en yüksek dağlarından en derin okyanuslarına kadar her yerde dağılış gösteren canlılardır. Bu yüzden de bütün canlılar içinde en fazla çeşitliliğe sahip alemdir. Milyonlarca hayvan türü olmasına rağmen bunlardan çok azı belirlenmiştir. Bazı hayvanlar gözle görülemeyecek kadar küçükken, bazıları metrelerce uzunluktadır ve bu canlıların yaşam yerleri de çok farklıdır. Bazıları diğer hayvanların üzerinde yaşarken bazıları havada ve bazıları derin okyanuslarda yaşar.\n" +
                    "\n" +
                    "– Hayvanların tüm türleri çok hücreli ve ökaryot yapıdadır.\n" +
                    "– Kendi besinlerini üretemezler bu yüzden de hazır beslenen(heterotrof) canlılardır.\n" +
                    "– Çoğalmaları eşeyli üremeyledir. Ancak bazıları eşeysiz de üreyebilir.\n" +
                    "– Büyük bir kısmı aktif olarak hareket eder. Bazıları hareket edemezler.\n" +
                    "– Hayvanlar uçarak, yüzerek, sürünerek hareket edebilir.\n" +
                    "– Algler, mantarlar ve bitkilerin aksine hücre duvarına sahip değillerdir.\n" +
                    "– Hayvanların çoğunda kas, sinir ve epitel gibi dokular gelişmiştir.",
            "Omurgasızlar\n" +
                    "Omurgasızlar , bir omurgası olmayan hayvanlara verilen genel bir addır. Omurgasız olarak adlandırılan canlıların yapılarında hiçbir iskelet bulunmaz. Omurgasız hayvanların vücudunun dış kısmını örten ve destekleyen bir dış yapı bulunur.Omurgasız hayvanların kıkırdak doku ve kemik dokudan oluşan iskeletleri yoktur. Bazı omurgasız hayvanların vücutlarında iskelet görevi gören değişik yapılar vardır. Örneğin yengeçlerde bulunan sert kabuk ve böceklerdeki kitin adı verilen örtü iskelet görevi yapar. Omurgasız hayvanların bir bölümü karada bir bölümü suda yaşar. Karada yaşayan omurgasız hayvanların akciğerleri yoktur. Bu hayvanlar trake solunumu ya da deri solunumu yaparlar. Suda yaşayan omurgasız hayvanlar ise solungaçlarıyla solunum yapar.Omurgasız hayvanlar yumurta ile çoğalır.\n" +
                    "\n" +
                    "Omurgasız hayvanlar olmak üzere 6 gruba ayrılırlar;\n" +
                    "* Süngerler\n" +
                    "* Sölenterler\n" +
                    "* Solucanlar (Yassı solucanlar, Yuvarlak solucanlar, Halkalı Solucanlar)\n" +
                    "* Yumuşakçalar\n" +
                    "* Eklem Bacaklılar (Kabuklular, Araknitler, Çok Ayaklılar, Böcekler)\n" +
                    "* Derisi Dikenliler",
    };
    public static String hucrebolunmesi[] = {
            "Mayoz Bölünme Nedir?\n" +
                    "Mayoz bölünme eşeyli üreyen canlıların eşey ana (üreme) hücrelerinde görülür. Mayoz bölünme sonucu genetik olarak birbirinden farklı 4 tane n kromozomlu üreme hücreleri oluşur. Üreme hücrelerine gamet denir. Gametler; sperm (erkek üreme hücresi) ve yumurta (dişi üreme hücresi) olmak üzere ikiye ayrılır.\n" +
                    "\n" +
                    "– Mayoz bölünme interfaz aşamasının ardından iki bölünmenin meydana gelmesiyle oluşur.\n" +
                    "– Mayozun birinci bölünmesine “mayoz 1”, ikinci bölünmesine ise “mayoz 2” adı verilir.\n" +
                    "– Mayoz sonucunda dört tane haploit (n kromozomlu) hücre oluşur.\n" +
                    "– Oluşan n kromozomlu hücreler farklılaşarak (örneğin spermlerde kuyruk gelişimi gözlemlenir) gamet hücrelerini oluşturur.\n" +
                    "– Farklı eşeylerin gamet hücreleri birleşerek (döllenerek) mitoz bölünme özelliğine sahip yeni bir birey oluşturur.\n" +
                    "– Mayoz bölünme her türde farklı zaman aralığında gözlemlenir.\n" +
                    "– Mayoz bölünme sayesinde kalıtsal çeşitlilik sağlanır.\n" +
                    "– Eşey organlarına gonad denir. Genel olarak erkek eşey organına erbezi (testis), dişi eşey organına ise yumurtalık (ovaryum) denir.",
            "Mayoz Bölünmenin Evreleri\n" +
                    "MAYOZ I\n" +
                    "Oluşacak hücrelerin ge dizilişi ve kromozom sayısı bakımdan değişikliğe uğraması bu bölünmede olur. Bölünme başlamadan önceki interfaz evresi mitozdaki gibi gerçekleşir.",
            "Profaz I\n" +
                    "\n" +
                    "DNA ipliklerinin kısalıp kalınlaşmaya başlaması ile başlar. Bu evre sınırları kesin olmayan 5 evreye ayrılıp incelenir. Bu evreler;\n" +
                    "\n" +
                    "Leptoten: Kromozomların mikroskopla seçilebildikleri andan itibaren başlar. İki eş kromatit birbirine sarılı halde bulunur. Ayrıca kromatinler üzerinde kromomer denilen ve koyu boyanan bölgeler fark edilir.",
            "Zigoten: Biri anneden diğeri babadan gelen ve birbirlerine benzeyen homolog kromozomlar yan yana gelerek eşleşmeye başlarlar.Bu eşleşme bir uçtan diğer uca doğru devam eder. Bu evrede her biri iki kromatit taşıyan iki kromozomun yan yana durmasıyla sanki canlı n sayıda kromozom taşıyormuş gibi görülür. Görülen bu yapıya tetrat denir.\n" +
                    "\n" +
                    "Pakiten: Homolog kromozomların eşleşmesi tamamlanır ancak kromozomlar kısalmaya devam eder. Ayrıca bu evrede mitozdan farklı olarak tetratlar arasında genetik madde alışverişi olur. Buna krossing-over denir. Bu olay homolog kromozomların birbiri üzerine çakışan (kiyazma “chiasma”) kısmında gerçekleşir.",
            "Diploten: Kromozomların sentromerleri ayrılmamıştır. Dört kromatit için iki sentromer vardır. Tetrat’taki homolog kromozomlar birbirinden ayrılmaya başlar. Ancak kiyazma bölgelerinde ayrılma olmaz ve kiyazmalar uca doğru kaymaya başlar.\n" +
                    "\n" +
                    "Diakinez: Kromozomlar son halini alır. Çekirdekçik kaybolur. Çekirdek zarı parçalanır.\n" +
                    "\n" +
                    "Metafaz I\n" +
                    "\n" +
                    "Bu safha mitozdaki metazfazdan biraz farklıdır. Mitozda eşlenmiş kromozomlar bir sıra halinde, ekvator bölgesinde dizilirlerdi. Burada ise iki sıra halinde dizilirler. Homolog kromozomlar sıralanırken karşı karşıya gelirler.",
            "Anafaz I\n" +
                    "\n" +
                    "Bu safhada mitozda bölünmede olduğu gibi kromatid ayrılması olmaz. Mitozun anafazında kardeş kromotidler ayrılırdı. Burada ise homolog kromozomlar (eşlenmiş haliyle) biri bir hücreye, diğeri öbür hücreye gidecek şekilde ayrılır Yani homolog kromozom ayrılması gerçekleşir.\n" +
                    "\n" +
                    "Mayoz bölünme sonucunda kalıtsal yapısı farklı hücrelerin oluşmasını sağlayan esas olay budur. Bir mayozda krossing-over olmasa da kalıtsal çeşitlilik sağlanır.\n" +
                    "\n" +
                    "Telofaz I\n" +
                    "\n" +
                    "Mitozdakinden farklı değildir. Çekirdek zarları ve çekirdekçik oluşarak, sitoplazma bölünür. Burada oluşan kök hücre haploid (n)dir. Çünkü başlangıçtaki hücrenin homolog kromozomlarından birer tanesinin bulundurur. Ancak kromozomlar eşlenmiş olduğu için iki kromadidli haldedir. Yani DNA miktarı olarak 2n denilebilir. Kısa süren Telofaz I den olarak Mayoz II başlar.",
            "MAYOZ II\n" +
                    "Profaz II\n" +
                    "Birinci bölünmenin telofazı ile ikinci bölünme arasında bir dinlenme devresi olmadan çekirdek zarı parçalanır. Birinci iğ iplikçiklerinin doğrultusuna dik yeni iğ iplikçikleri oluşur.\n" +
                    "\n" +
                    "Metafaz II\n" +
                    "\n" +
                    "Her yavru hücrenin haploid (n) kromozomu ekvatoral düzlem üzerinde dizilir, cross over olmaz.\n" +
                    "\n" +
                    "Anafaz II\n" +
                    "\n" +
                    "Mayoz bölünmenin 2. bölümü olan Mayoz 2’nin 3. evresidir. Ara evre olarak da adlandırılır. Bu evre mitozdaki anafaz evresine benzer. Ancak, mitozdaki anafazda kardeş kromatitler düzenli bulunurken bu evrede düzensiz bulunurlar. Bu da Mayoz bölünmede genetik çeşitliliği sağlar.",
            "Telofaz II\n" +
                    "\n" +
                    "Kromozomların helezonları açılır, dolayısıyla görünmez olurlar. Çekirdek zarları oluşur sitoplazma bölünür. Böylece bir hücreden 4 tane haploid hücre meydana gelir.\n" +
                    "\n" +
                    "‘Sitoplazma bölünmesi’\n" +
                    "\n" +
                    "Hayvansal hücrelerde: Çekirdek bölünmesi tamamlandıktan sonra sitoplazma ortadan boğumlanarak ikiye bölünür ve iki ayrı hücre oluşmuş olur.\n" +
                    "\n" +
                    "Bitkisel hücrelerde: Oluşmuş olan iki çekirdekli hücrenin ortasında bir orta lamel (ara lamel) oluşur ve hücre duvarına kadar ulaşır. Dolayısıyla birbirine bitişik iki hücre oluşur.\n" +
                    "\n" +
                    "Mayoz bölünme sonucunda n kromozomlu 4 hücre (gamet)oluşur.",
            "Mitoz Bölünme Nedir?\n" +
                    "Mitoz ya da mitoz bölünme, ana hücrenin bölünerek iki yeni hücre oluşturmasına denir. Mitoz yalnızca ökaryotik hücrelerde görülür ve çok hücreli canlılarda büyüme gelişme ve yaraların onarılmasını sağlar.",
            "Hücre Döngüsü ve Mitoz Evreleri\n" +
                    "Hücrelerin belirli bir yaşam süreleri vardır. Bölünme sonucu oluşmuş bir hücrenin, bölünme geçireceği döneme kadar ki hayatına hücre döngüsü denir.\n" +
                    "\n" +
                    "Hücre döngüsü sitoplazmada mevcut bazı kimyasal sinyaller tarafından yürütülür ve çeşitli kontrol noktaları vardır. Hücreyi bölünmeye zorlayan faktör, hacim / yüzey oranının giderek artmasıdır. Bu durum madde alış verişini ve çekirdeğin kontrolünü zorlaştırır. Hücre bölünerek yüzey / hacim oranını artırır.\n" +
                    "\n" +
                    "Hücrenin bölünebilmesi için hücre çekirdeğinden ‘’ bölünme emri ‘’ verilmesi gerekir, bu emir verildikten sonra hücre bölünür.\n" +
                    "\n" +
                    "Hücre bölünmesi hücre döngüsünün bir parçasıdır. Hücre döngüsü uzun bir interfaz evresi ile kısa bir mitotik evreden oluşur.",
            "İnterfaz\n" +
                    "\n" +
                    "Mitoz evresi hücre döngüsünün görece çok kısa bir parçasıdır. Döngünün büyük kısmını oluşturan evre, hücrenin kendisini bölünmeye hazırladığı interfaz evresidir.\n" +
                    "\n" +
                    "İnterfaz G1, S ve G2 olmak üzere üç evreye ayrılır. G1 evresinde ATP sentezi, organel sayısı ve protein sentezi artar. S evresinde DNA eşlenmesi tamamlanır. G2 evresinde hücre, bölünme hazırlığını tamamlar. Hızlı çoğalan bir insan hücresinde hücre döngüsü 24 saatte tamamlanırken embriyo hücresinde 30 dakikadan az, maya hücresinde 90 dakika, bakteri hücresinde 20 dakika gibi kısa sürede tamamlanabilir.",
            "Karyokinez\n" +
                    "\n" +
                    "Profaz\n" +
                    "İnterfazda eşlenmiş durumdaki kromatinler kısalıp kalınlaşarak kromozoma dönüşürler. Çekirdek zarı, çekirdekçik ve organeller eriyerek tamamen kaybolur. Kromozomlar ekvatoral bölgeye hareket etmeye başlarlar.\n" +
                    "\n" +
                    "Metafaz\n" +
                    "Kardeş kromotitler ekvatoral düzlemde bir çember gibi, bazen de karışık olarak ekvatoral düzlem üzerinde dizilirler ve sentrozomlar interfazda oluşturmuş olduğu iğ ipliklerini kromozomlara doğru göndermeye başlar. Hücrenin ortasında hafif boğumlanma olur. İğ iplikleri kardeş kromatitlere tutunur. Kromozomların en net görüldüğü safhadır.\n" +
                    "\n" +
                    "Anafaz\n" +
                    "Kromozomlardaki sentromerlerin aynı anda ikiye bölünmesiyle kardeş kromatitler tam olarak birbirinden ayrılır. Kardeş kromatitler sentromerleriyle iğ ipliklerine tutunarak zıt kutuplara doğru çekilir. Anafaz evresi kardeş kromatitlerin zıt kutuplara ulaşmasıyla tamamlanır.\n" +
                    "\n" +
                    "Telofaz\n" +
                    "Profaz evresinde eriyen çekirdek zarı, çekirdekçik ve organeller yeniden oluşmaya başlar.Kutuplara çekilen kromatitler çekirdek zarının içine girerler.Kısaca bu evrede Profazda olan her şeyin tam tersi olur.Bu evreden sonra sitoplazma bölünmesi gerçekleşir.",
            "Sitokinez (Sitoplazma bölünmesi)\n" +
                    "\n" +
                    "Hücrede sitoplazma bölünmesi anafaz evresiyle başlar. Çekirdek ve sitoplazma bölünmesi eş zamanlı gerçekleşir. Protein yapılır mikrofilamentler hayvan hücrelerinin bölünmesinde sitoplazmanın boğumlanmasında görev alır.\n" +
                    "\n" +
                    "Mitoz bölünmede oluşan hücre sayısı 2n formülü ile bulunur. (n) bölünme sayısıdır.\n" +
                    "\n" +
                    "Bazı durumlarda çekirdek bölündükten sonra sitoplazma bölünmesi olmaz. Böylece çok çekirdekli hücreler oluşur. Buna endomitoz denir.\n" +
                    "\n" +
                    "Hayvan ve bitki hücrelerinde mitoz bölünme farklılıkları\n" +
                    "\n" +
                    "– Hayvan hücrelerinde sitoplazma boğumlanarak bölündüğü halde bitki hücresinde orta lamel (ara lamel) oluşumuyla gerçekleşir.\n" +
                    "– Bitki hücresinde iğ ipliklerini sitoplazma hazırlarken hayvan hücrelerinde bunu sentrozomlar yapar.",
    };
    public static String insandaureme[] = {
            "İnsanda üreme sistemi sinirler ve hormonların denetiminde çalışır. Dişi ve erkek üreme sistemi bir birinden farklı yapılar içerir.",
            "Erkeklerde üreme sistemini testisler, epididimis kanalı, vasdeferans kanalı, yardımcı bezler ve penis oluşturur.\n" +
                    "\n" +
                    "Testisler (Er bezleri): Testisler, hormon üretir (testosteron) ve sperm hücrelerini üretir. Embriyonun gelişimi sırasında karın boşluğunda bulunan testisler, doğumdan önce veya doğumdan hemen sonra testis torbasına iner Testislerin, testis torbasına inmesi sperm üretimi için gereklidir. Çünkü vücut sıcaklığı sperm üretimi için uygun değildir. Erkeklerde sağ ve solda olmak üzere iki testis bulunur. Her testisin içinde seminifer tüpçükler bulunur. Seminifer tüpçüklerdeki sperm ana hücreleri sperm hücrelerini üretir. Seminifer; tüpçüklerde bulunan sertoli hücreleri ise spermin beslenmesi ve korunmasında görev alır. Seminifer tüpçüklerin arasına dağılmış halde leydig hücreleri bulunur. Leyding hücreleri testosteron hormonu salgılar.\n" +
                    "\n" +
                    "Epididimis kanalı: Sperm hücrelerinin kamçılı hale geldiği yani farklılaştığı yerdir\n" +
                    "\n" +
                    "Vasdeferans kanalı: Epididimiste farklılaşan sperm hücreleri vasdeferansta depolanır. Daha sonra buradan üretraya (dış idrar yolu) taşınır ve oradan da dışarı atılır.\n" +
                    "\n" +
                    "Yardımcı bezler: Spermlerin hareket etmesini ve beslenmesini sağlayan seminal sıvıyı üreten bezlerdir. Bunlar prostat bezi, cowper bezi ve seminal keseciklerdir. Seminal sıvı spermin geçtiği yolu kayganlaştırır, dişi üreme kanalındaki asitlere karşı spermi korur ve içerdiği şeker sayesinde spermi besler.\n" +
                    "Döllenme ve sonrası olaylar\n" +
                    "\n" +
                    "İnsan yumurta hücresi kendine özgü kimyasal maddeler salgılar. Bu madde spermin yumurtaya yönelmesini sağlar.\n" +
                    "\n" +
                    "Yumurtanın dış kısmında bulunan zona pellucida tabakasında spermleri tanıyan reseptörler vardır. Bu reseptörler sayesinde yumurta sadece kendi türüne ait bireylerin spermleri tarafından döllenir.\n" +
                    "\n" +
                    "Spermler zona pellucida’daki reseptörlere bağlanır.\n" +
                    "\n" +
                    "Spermin akrozom kısmındaki sindirim enzimleri zona pellucida zarını (dış zar) eritir. Böylece sperm yumurta zarına (iç zar) ulaşır.\n" +
                    "\n" +
                    "Spermin yumurtaya bağlanmasıyla zona pellucida sertleşmeye başlar.\n" +
                    "\n" +
                    "Bu durum çok sayıda spermin zona pellucidayı geçip yumurta içine girmesini engeller.\n" +
                    "\n" +
                    "Yumurta zarı ile sperm zarı kaynaşır ve sperm çekirdeği yumurtaya geçer ama kuyruk kısmı dışarıda kalır.\n" +
                    "\n" +
                    "Sperm ve yumurta çekirdeğinin kaynaşmasına döllenme denir.\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "Plasenta, anne ile embriyo arasında madde alışverişini sağlar. Ayrıca östrojen ve progesteron hormonu salgılayarak gebeliğin devam etmesini sağlar. Eğer plasenta zedelenirse progesteron seviyesi düşeceği için düşüğe sebep olabilir. Plasentada anne ile embriyonun kan damarları birbirine çok yakındır fakat kanları birbirine karışmaz. Burada madde alış verişi olur. Besin ve oksijen anneden embriyoya, boşaltım atıkları ve karbondioksit ise embriyodan anneye geçer Ancak alyuvar ya da ATP geçmez.",
            "Dişi bir birey henüz anne karnındayken birincil oositler oluşur ve profaz aşamasında ergenliğe kadar duraklama dönemine girer. Ergenlik çağında birincil oositler birer birer mayozu tamamlar ve her ay genelde bir yumurta bazen de iki yumurta üretilir. Oluşan yumurtalar, yumurta kanalındaki (Fallopi tüpü) siller tarafından yumurta kanalına doğru çekilir. Yumurta kanalına taşınan yumurta bazen burada döllenir bazen de döllenmeden dışarı atılır.\n" +
                    "\n" +
                    "Dişi Üreme Sisteminin Kısımları\n" +
                    "\n" +
                    "1. Yumurtalık (Ovaryum): Yumurtalık çok sayıda folikül keseden oluşur Folikül keselerde yumurta üretilir. Sağ ve solda olmak üzere iki yumurtalık bulunur. Normalde her ay yumurtalıklardan biri yumurta üretir ancak bazen iki yumurtalıkta aynı zamanda yumurta üretir ve bu durumda çift yumurta ikizleri oluşabilir.\n" +
                    "\n" +
                    "2. Fallopi tüpü (Yumurta kanalı): Bir ucu yumurtalığa diğer ucu döl yatağına bağlıdır Böylece yumurtalıkta oluşan yumurtayı döl yatağına taşır Sperm ile yumurtanın döllendiği yer fallopi tüpüdür Döllenme sonucu oluşan zigotun döl yatağına taşınması birkaç günü alabilir Yani zigotun ilk mitoz bölünmeleri fallopi tüpünde meydana gelir.\n" +
                    "3. Uterus (Döl yatağı = Rahim): Döllenmiş yumurtanın doğuma kadar geliştiği yerdir. İç yüzeyinde bol miktarda kan damarı bulunur.\n" +
                    "\n" +
                    "4. Vagina: Yumurta hücresinin dışarı atıldığı açıklıktır.\n" +
                    "\n" +
                    "Hipofiz bezinde üretilen ve dişi üreme sistemini kontrol eden hormonlar\n" +
                    "\n" +
                    "FSH (Folikül uyarıcı hormon)\n" +
                    "\n" +
                    "Yumurtanın oluştuğu keselere folikül keseler denir. FSH, foliküllerin gelişmesini sağlar ve foliküllerde yumurtanın oluşumunu uyarır.\n" +
                    "FSH, östrojen hormonunun üretimini uyarır.\n" +
                    "Foliküllerde yumurta üretildiğinde FSH’ın etkisiyle yumurtalık östrojen hormonu üretir ve döl yatağının gelişimini hızlandırır. Yani östrojen, döl yatağının embriyonun gelişmesine hazır hale getirilmesinde görev alır. Böylece yumurta döllenirse döl yatağına yerleşir.\n" +
                    "LTH = Prolaktin (Lüteotropik hormon)\n" +
                    "\n" +
                    "Süt bezlerinin gelişmesini ve sütün oluşmasını sağlar\n" +
                    "Analık iç güdüsünü oluşturur\n" +
                    "LH (Lüteinleştirici hormon)\n" +
                    "\n" +
                    "LH, folikülün yırtılmasını ve yumurtanın folikülden dışarı çıkmasını sağlar (ovulasyon)\n" +
                    "LH, yumurta folikülden çıktıktan sonra folikülün yağlanmasına ve sarı bir renk almasına sebep olur (korpus luteum). Yani aslında korpus luteum hücreleri yumurtalık hücrelerinin sarı bir renk almış halidir.\n" +
                    "Ayrıca LH, korpus luteum hücrelerinin progesteron hormonu salgılamasını uyarır Progesteron hormonu döl yatağının süngerimsi bir yapı kazanmasını sağlar Böylece eğer döllenme olmuşsa embriyo döl yatağına rahatlıkla tutunabilir.",
            "TÜP BEBEK YÖNTEMİ\n" +
                    "\n" +
                    "Erkekte canlı sperm sayısının azlığı ya da dişide yumurta kanalının tıkalı olması gibi sebeplerle doğal yolla döllenme gerçekleşmezse, ebeveynlerden alınan yumurta ve sperm hücreleri laboratuvar şartlarında döllenerek dişinin rahmine aktarılır. Bu yönteme tüp bebek yöntemi denir. Tüp bebek yönteminde uygulanan aşamaların sırası,",
            "1. Yumurtalıkların uyarılması\n" +
                    "\n" +
                    "2. Yumurta toplama: Yumurtalık uyarımı ile belirli bir büyüklüğe ulaşmış foliküller elde edildiğinde, çatlatıcı iğne yapılır ve 34-36 saat sonrasında yumurta toplama işlemi uygulanır.",
            "3. Döllenme: Yumurta ve sperm hazırlandıktan sonra döllenme safhasına geçilir. Döllenme standart tüp bebek (in vitro fertilizasyon; IVF) veya mikroenjeksiyon ( ICSI)ile sağlanır. IVF ile ICSI’nin tek farkı dölleme safhasıdır. IVF görünür sperm problemi olmayan durumlarda tercih edilir. Sperm problemi olanlarda ICSI tercih edilir. IVF’de sperm yumurtanın yanına bırakılır ve sperm kendisi döllemeyi gerçekleştirir. ICSI yönteminde ise yumurtanın etrafındaki hücreler eritilerek sperm aktarma işlemi yapılır.",
            "4. Embriyo transferi: Embriyolar laboratuvarda; takip edilerek embriyo sayısı ve kalitesine göre 3. ya da 5. gün transfer edilir.\n" +
                    "\n" +
                    "5. Gebelik testi yapılır",
    };
    public static String kalitim[] = {
            "Canlılarda bir karakterin meydana gelişini, gelişmesini, oluşumunu bir dölden yeni bir döle geçmesini inceleyen ve araştıran bilim dalına genetik denir.Genetik kalıtım olarakta adlandırılmaktadır.",
            "Kalıtım bilimi (genetik): Canlılardaki benzerlik ve farklılıkların ortaya çıkmasını sağlayan faktörleri, bu faktörlerin nesilden nesle nasıl geçtiğini araştıran bilim dalına kalıtım bilimi veya genetik denir.\n" +
                    "\n" +
                    "Gen: Kromozomların kalıtsal bir karakterin oğul döllere aktarılmasını sağlayan bölümüne denir. Gen, yaklaşık 1500 adet nükleotitten oluşan DNA parçasıdır.\n" +
                    "\n" +
                    "Allel gen: Bir karakterin kalıtımından sorumlu gen çiftidir.",
            "Genotip: Bir canlının anne ve babasından aldığı genlerin tümüdür.\n" +
                    "\n" +
                    "Fenotip: Bir canlının, genotipine bağlı olarak oluşan dış görünüşüne denir. Fenotipin belirlenmesinde, genotip kadar çevresinin de rolü vardır.\n" +
                    "\n" +
                    "Dominant (baskın) gen: Dölde etkisini her zaman gösterebilen gendir. Büyük harflerle gösterilir. A, B, C gibi.",
            "Resesif (çekinik) gen: Dominant gen olmadığında etkisini gösterebilen gendir. Küçük harflerle gösterilir. a, d, gibi. Resesif karakterin, oğul dölün fenotipinde kendini gösterebilmesi için, iki resesif genin yan yana gelmesi şarttır. (aa, dd, bb gibi.)\n" +
                    "\n" +
                    "Bağımsız Gen: Farklı kromozomlar üzerinde bulunan genlerdir.\n" +
                    "\n" +
                    "Bağlı Gen: Aynı kromozom üzerinde bulunan genlerdir. Bağlı genler sadece krossing over ile ayrılabilirler.",
            "Mutasyon: Değişen ortam şartlarında canlının genotipinde meydana gelen değişikliklerdir. Mutasyonlar canlının yaşamını olumsuz yönde etkiler.\n" +
                    "\n" +
                    "Modifikasyon: Değişen ortam şartlarında canlının fenotipinde meydana gelen ve kalıtsal olmayan değişikliklerdir. Modifikasyon en iyi tek yumurta ikizlerinde incelenir.\n" +
                    "\n" +
                    "Tek yumurta ikizlerinde, bir yumurta bir sperm tarafından döllenir. Zigotun mitozla bölünmesi sonucu oluşan iki hücre ayrılarak, mitozla iki bireyi oluşturur. Dolayısıyla kalıtsal özellikleri aynıdır.\n" +
                    "\n" +
                    "Tek yumurta ikizlerinde görülen farklılıklar tamamen modifikasyonla olur. Çünkü kalıtsal özellikleri birbirinin tamamen aynısıdır.\n" +
                    "\n" +
                    "Doğuşta birbirlerine benzeyen tek yumurta ikizleri, zamanla dış çevre şartlarının etkisiyle birbirlerinden farklı gelişmeler gösterebilir. Dış görünüşlerinde farklılıklar gözlenebilir. Örneğin boy uzunluğu ve kilo gibi özellikleri farklı olabilir.",
            "Adaptasyon: Değişen ortam şartlarında, canlının sahip olduğu genlerle bulunduğu ortama uyum sağlamasıdır. Adaptasyon, canlının yaşama ve üreme şansını artırır. Örneğin kaktüslerin iğne yapraklı olması, çöllerde yaşayan develerin hörgüçlerinde yağ depolaması ve kurak ortam bitkilerinde stomaların yaprağın alt yüzeyinde bulunması birer adaptasyondur.\n" +
                    "\n" +
                    "Varyasyon: Canlılarda ortaya çıkan tür içi değişikliklerdir. Varyasyonlar, mutasyon ve eşeyli üreme olayları sonucu oluşur.",
            "Gamet Bulma\n" +
                    "Kalıtım çaprazlamalarında gamet sayısı değil gamet çeşidi önemlidir. Gametler (dişi ve erkek üreme hücreleri) mayoz bölünmeyle meydana geldiği için haploit (n) kromozomludurlar.\n" +
                    "\n" +
                    "Çaprazlamalar gametlerle yapıldığından, öncelikle genotipi belli olan bir canlının oluşturabileceği gamet çeşidinin hesaplanması gerekir. Böylece oluşabilecek bireylerin genotip ve fenotipleri doğru olarak tahmin edilebilir.",
            "Eş Baskınlık Nedir?\n" +
                    "Mendel’in çalışmalarında tam baskınlık durumunda heterozigot genotipli bireylerin fenotipinde baskın özellik görülür.\n" +
                    "\n" +
                    "Eş baskınlıkta aleller birbirine baskınlık kuramadığından heterozigot bireylerin fenotipinde iki alelin etkisi birlikte görülür. Eş baskınlıkta heterozigot genotipli bireylerde her iki alel de fenotipi ayrı ayrı ve farklı olarak etkiler. Eş baskınlığa örnek olarak insanda M ve N genlerinin kontrol ettiği MN kan grubu, A ve B genlerinin kontrol ettiği AB kan grubu verilebilir.\n" +
                    "\n" +
                    "MN kan grubu sisteminde M, N ve MN olmak üzere üç farklı kan grubu vardır. Bu gruplandırmada alyuvarların zarında bulunan M ve N antijenleri etkilidir. Bağışıklık tepkisine yol açarak antikor oluşumuna neden olan maddelere antijen denir. Alyuvar zarında sadece M antijeni taşıyan bireyler M kan grubuna, sadece N antijeni taşıyan bireyler N kan grubuna sahiptir. Alyuvar zarında M ve N antijenlerini birlikte taşıyan bireyler ise MN kan grubuna sahiptir.",
            "Çok Alellik Nedir?\n" +
                    "Bir karakteri oluşturan alel çeşidinin ikiden fazla olması durumuna çok alellik denir. Farklı canlılarda çok alelli olarak kalıtılan özelliklere rastlanır.\n" +
                    "\n" +
                    "Bir karakterin kaç çeşit aleli olursa olsun, diploit canlı bu alellerden en fazla ikisine, haploit canlı ise bir tanesine sahip olur.\n" +
                    "\n" +
                    "Tavşanlarda kürk renginin, meyve sineğinde göz renginin ve insanda kan gruplarının kalıtımında ikiden fazla alel gen rol oynar.\n" +
                    "\n" +
                    "Tavşanlarda kürk rengi; dört farklı alel gen tarafından belirlenir. Bu genlerin arasında eş baskınlık yoktur. Bunun için dört çeşit fenotip oluşur. Bunlar himalaya, gümüşi, yabani ve albino şeklindeki fenotiplerdir.",
            "Kan Grubu Genetiği\n" +
                    "A, B, AB ve 0 kan gruplarının kalıtımını A, B ve 0 genleri sağlar. Bu genlerden A ve B genleri baskın, A ve B genleri birlikte bulunursa eş baskın, 0 geni ise çekiniktir.\n" +
                    "\n" +
                    "– Alyuvar yüzeyinde A antijeni varsa A grubu, B antijeni varsa B grubu, hem A hem de B antijenleri varsa AB grubu, antijen yoksa 0 (sıfır) grubu oluşur.\n" +
                    "\n" +
                    "– Kan plazmasında ise antikorlar bulunur. A kan grubunun plazmasında anti B, B kan grubunun plazmasında anti A, 0 grubunun plazmasında hem anti A hem de anti B antikorları bulunur. AB kan grubunun plazmasında ise antikor yoktur.\n" +
                    "\n" +
                    "Rh faktörü: Rh faktörünü belirleyen gen, “R” simgesiyle gösterilir. Bir insanın kanında Rh antijeni bulunuyorsa Rh (+), bulundurmuyorsa Rh (-) kan grubundandır. İnsanların %85’i Rh(+), %15’i Rh(-) kan grupludur. Kan grubu Rh(+) baskın, Rh(-) çekinik özelliktedir.\n" +
                    "\n" +
                    "Birbirleriyle uyumlu olan kan gruplarının bilinmesi kan nakilleri açısından son derece önemlidir. Eğer vericinin kanında alıcı için yabancı bir protein (A ya da B antijeni) varsa alıcı tarafından üretilen antikorlar (anti A ya da anti B) yabancı proteine tutunur ve kan hücreleri birbirine yapışarak kümelenir. Bu olaya çökelme (aglütinasyon) adı verilir.",
            "Eşeye Bağlı Kalıtım\n" +
                    "Cinsiyeti (eşeyi) belirleyen X ve Y kromozomları üzerinde yer alan genler eşeye bağlı genler olarak adlandırılır.\n" +
                    "\n" +
                    "İnsanda 46 kromozom bulunur. 44 kromozom ( vücut kromozomları ) vücut organlarını oluşturur. Diğer 2 kromozom ( eşey kromozomları ) cinsiyet özelliklerini belirler. Dişi ve erkek bireylerin vücutlarının farklı özellikte olması eşey kromozomları sayesindedir. İnsanda cinsiyeti Y kromozomunun bulunup bulunmaması belirler. Y kromozomu babadan gelir ve bireyin erkek olmasını sağlar. Y kromozomu erkeklerde testis ve hormonları oluşturur. Eski toplumlarda doğan çocukların cinsiyetini kadının belirlediği düşünülmüştür. Ancak cinsiyeti erkek bireyden Y kromozomunun gelip gelmemesi belirler.",
            "Soy Ağacı \n" +
                    "Kalıtsal bir özelliğin nesiller boyu nasıl aktarıldığını gösteren şemaya soy ağacı denir. Kalıtsal bir özelliğin ya da bir kalıtsal hastalığın aile içerisindeki seyrini incelemek için, kullanılmaktadır.",
            "Otozomal Soy Ağacı\n" +
                    "Herhangi bir araştırmada kullanılacak bireylerin belirli karakterler bakımından homozigot veya heterozigot olup olmadığını anlamak için soy ağaçları kullanılır. Ayrıca soya bağlı bir karakterin görünme ihtimalini hesaplamak gibi pratik amaçlar içinde soy ağaçları kullanılır.\n" +
                    "\n" +
                    "Otozomal soy ağaçlarında ilgili genler, otozomlar üzerinde dominant veya resesif olarak bulunur. Soyağacı incelenerek bireylerin genotipleri belirlenebilir.",
            "Gonozomal Soy Ağacı\n" +
                    "Gonozomal kromozomlarda bulunan karakterlerin aktarılmasını gösteren soy ağacıdır. Karakterin oluşmasından etkili olan genler X ve Y kromozomlarının üzerinde bulunur. Bu genler çekinik veya baskın olabilir. Sadece Y kromozomunda bulunan genler erkek bireylerde görülür (yapışık parmaklılık gibi). X kromozomundaki genler hem erkek hem de dişilerde (renk körlüğü, hemofili) bulunur.",
            "Rekombinasyon\n" +
                    "İki ayrı DNA molekülünün birleşerek yeni DNA molekülü oluşturması sonucu oluşan kalıtsal çeşitliliğe rekombinasyon denir.\n" +
                    "\n" +
                    "Eşeyli üremede yavruların anne ve babanın bire bir aynısı olmamasının nedenleri;\n" +
                    "\n" +
                    "-Mayoz sırasındaki; Krossing over olayı, kromozomların şansa dayalı olarak kutuplara gitmesi ve döllenme olayıdır.\n" +
                    "-Eşeyli üremedeki bu üç mekanizmanın birlikte etkisi ile her kuşakta yeni kombinasyonlar ortaya çıkar. Mevcut alellerin yeniden düzenlenmesi genetik çeşitliliğin oluşmasına önemli katkı sağlar.",
            "Mutasyon\n" +
                    "Mutasyon, canlıların genlerinde meydana gelen rastgele ve kalıcı değişimler olarak tanımlanabilir. Bu değişimlere çeşitli çevresel faktörler neden olmaktadır. Mutasyonlar; canlının üreme hücrelerinde, üreme ana hücrelerinde veya vücut hücrelerinde gerçekleşebilir. Üreme ya da üreme ana hücrelerinde meydana gelen mutasyonlar sonraki nesile aktarılabilirken vücut hücrelerinde meydana gelen mutasyonlar, sadece o bireyle sınırlı kalır. Mutasyonlar, canlılarda genetik varyasyonlara ve bunun sonucunda da fenotipik çeşitlenmeye neden olur.\n" +
                    "\n" +
                    "Mutasyonların birçoğu canlılarda zararlı hatta öldürücü olabilir. Genetik varyasyona neden olan diğer bir etmen mayoz sırasında kromozomların bağımsız dağılımıdır. Mayozda bireyin anne ve babasından aldığı homolog kromozom çiftlerinin birbirinden ayrılarak (mayoz 1-anafaz 1) hangi gamete gideceği tamamen şansa bağlı bir olaydır. Mayozda kromozomların birbirinden bağımsız olarak dağılımı sayesinde farklı genetik kombinasyonlara sahip gametler oluşur.",
            "Kromozomların Bağımsız Dağılımı\n" +
                    "Mayozun Metafaz I evresinde homolog kromozomlar rastgele birbirlerinden bağımsız dizilir ve Anafaz I de ayrılırlar. Böylece mayoz I sonunda oluşan yavru hücreler her bir homolog kromozom çiftindeki biri anneden diğeri babadan gelen kromozomların birine sahip olur.",
    };
    public static String moderngenetik[] = {
            "   Biyoteknoloji bilimi, çeşitli mühendislik alanlarını kullanarak bitki, hayvan ve mikroorganizma\n" +
                    "    yapılarını kültür ortamında değiştirip geliştirerek onları dan yeni ürünler elde etmeyi\n" +
                    "    amaçlayan bilim dalıdır. Genetik mühendisliği ise genlerin yalıtılması, çoğaltılması, farklı\n" +
                    "    canlıların genlerinin birleştirilmesi ya da genlerin bir canlıdan başka bir canlıya aktarılması\n" +
                    "    gibi çalışmalar yapar. Başka bir ifadeyle genetik mühendisliği, biyoteknolojinin uygulanmasını\n" +
                    "    içeren çalışmaları kapsar.",
            "Islah Yöntemleri" +
                    "    Günümüzde istenilen özellikte bitki ve hayvan üretebilmek için gen mühendisleri, insanlığa yarar\n" +
                    "    sağlayacak şekilde organizmaların genetik yapılarını değiştirmiştir. Kendi türü dışında başka\n" +
                    "    bir türden gen aktarılarak belli bir özelliği değiştirilmiş canlılara genetiği değiştirilmiş\n" +
                    "    organizma (GDO) veya transgenik organizma denir. Geleneksel ıslah yöntemleriyle istenilen\n" +
                    "    özelliklere sahip canlılar seçilip bunlar bir birleriyle eşleştirilmiştir. Böylece her iki ata\n" +
                    "    bireyin istenilen özellikleri yeni bireyde toplanmış olur. Geleneksel ıslah yöntemlerinin\n" +
                    "    yetersizliği bilim adamlarını modern ıslah yöntemlerine geliştirmeye yöneltmiştir. Modern ıslah\n" +
                    "    yöntemleri olarak tür içi ve türler arası melezleme, yapay döllenme, poliploidi, gen aktarımı ve\n" +
                    "    klonlama kullanılmaktadır.",
            "Melezleme" +
                    "Uzun süre sadece kendi arasında gen alış verişi yapan ırklar genetik olarak zayıf ırk olarak\n" +
                    "    kabul edilir. Çünkü bu durum zararlı çekinik genlerin yan yana gelmesine (homozigot),\n" +
                    "    dolayısıyla fenotipte etkisini göstermesine sebep olur. Farklı karakterler bakımından homozigot\n" +
                    "    ırklar arasında çaprazlama yaparak üstün özelliklere sahip melez bireyler elde edilebilir.\n" +
                    "    Örneğin küçük ve tatlı erikle büyük ve tatsız eriklerin çaprazlanması sonucunda büyük ve tatlı\n" +
                    "    erikler elde edilmiştir.",
            "Yapay döllenme" +
                    "Üstün özellikli hayvanlardan alınan spermler, sperm bankalarında saklanarak uygun zamanda üstün\n" +
                    "    özellikli yumurtaları döllemek için kullanılır. Bu yöntemde spermin yumurtayı dölleme şansı daha\n" +
                    "    yüksektir.",
            "Poliploidi" +
                    "Ekonomik değeri yüksek olan sebzeler ve meyveler poliploidi yöntemiyle elde edilebilir.\n" +
                    "    Hücrelerdeki kromozom sayısının normal türe göre daha fazla olmasına poliploidi denir.\n" +
                    "    Poliploidi aslında bir tür mutasyonla meydana gelir. Bu yüzden bilim adamları poliploit bireyler\n" +
                    "    elde ederken hücreleri mutasyona uğratmaya çalışır. Poliploid bireyler genelde kendi atalarından\n" +
                    "    daha verimli olurlar. Örneğin buğday ve çavdardan elde edilen poliploid bireyler buğdaydan\n" +
                    "    verimliliği, çavdardan dayanıklılığı alır. Çekirdeksiz karpuz poliploidiye örnektir. Poliploidi\n" +
                    "    bitkilerde hayvanlara göre daha sık görülür.",
            "Gen klonlama" +
                    "Bilim adamları bir genle ilgili çalışabilmek için o genin üzerinde bulunduğu DNA parçasını\n" +
                    "    kopyalar. Buna gen klonlama denir. Bakteriler, hızlı çoğaldıkları için ve basit yapılı oldukları\n" +
                    "    için klonlama çalışmalarında bakterilerden yararlanılır. Genlerin klonlanabilmesi için\n" +
                    "    plazmitler veya virüsler vektör (taşıyıcı) olarak kullanılır. Plazmitler, bakterilerde normal\n" +
                    "    DNA dışında bulunan, kendi kendine eşlenebilen küçük halkasal DNA’lardır.",
            "Kök Hücre" +
                    "Bölünme yeteneği fazla olan, başka doku ve organlara dönüşebilen farklılaşmamış hücrelere kök\n" +
                    "    hücre denir. Kök hücre, farklılaşmamış ama farklılaşma yeteneği yüksek olan hücredir. Yani başka\n" +
                    "    hücrelere dönüşebilme yeteneği fazladır. Örneğin, sinir hücreleri başka hücrelere dönüşmez zaten\n" +
                    "    farklılaşmış hücrelerdir. Bu yüzden sinir hücresi kök hücre olamaz. Yetişkin kök hücreleri\n" +
                    "    (kemik iliği), kordon kanından elde edilen kök hücreler ve embriyonik kök hücreler günümüzde\n" +
                    "    bilinen üç temel kök hücre kaynağıdır. Örneğin kemik iliğindeki kök hücreler kan hücrelerinin\n" +
                    "    tüm çeşitlerine dönüşebilir. Yetişkin kök hücreleri, vücutta birçok doku ve organda bulunur.\n" +
                    "    Bulundukları bölgedeki hücrelerin hasar görmesi durumunda çoğalarak hasarlı kısmın onarılmasını\n" +
                    "    sağlar.",
            "DNA Parmak İzi" +
                    "Her bireyin DNA dizilimi (Tek yumurta ikizleri hariç) kendine özgüdür. Buna DNA parmak izi\n" +
                    "    denir. DNA parmak izi suçluların tespitinde kullanılan yaygın bir yöntemdir. Bu yöntemde olay\n" +
                    "    yerinde bulunan kan, tükürük, kıl, tırnak, sindirim artığı ve deri döküntüsü gibi canlı\n" +
                    "    kalıntıları kriminal çalışmalarla incelenerek suçluların bulunması sağlanır. DNA parmak izi\n" +
                    "    dışında bir de normal parmak izi vardır. Normal parmak izi parmak uçlarındaki izlerden elde\n" +
                    "    edilebilir.",
            "Amniyon sentez Yöntemi" +
                    "Bu yöntemde bir iğne yardımıyla uterusa girilir ve fetüsün etrafını çevreleyen amniyotik sıvıdan\n" +
                    "yaklaşık 10 ml kadar alınır.Bu sıvı içerdiği kimyasal maddeler bakımından incelenir.Ayrıca\n" +
                    "sıvıya karışan fetal hücrelerden kültür hazırlanarak, hücrenin kromozomları mikroskopta\n" +
                    "incelenir (Karyotip analizi). Kromozomların sayısı, yapısı, bantlaşma bölgeleri ve sentromer\n" +
                    "konumları incelenerek kalıtsal hastalıkların teşhisi yapılır.",
    };
    public static String cablilardaenerjidon[] = {
            "Canlılık ve  Enerji\n" +
                    "Bir sistemin iş yapabilme yeteneğine enerji denir. Bütün canlıların temel enerji kaynağı ise güneştir. Canlıların enerjiyi bir biçimden diğerine dönüştürme yeteneği sayesinde yaşam devam eder. Enerji, bir biçimden diğerine dönüşürken mutlaka bir bölümü ısı enerjisi hâlinde çevreye yayılır.",
            "I. tip enerji dönüşümü: Fotosentez olayı ile güneşin ışınım enerjisi organik bileşiklerin bağlarındaki kimyasal enerjiye dönüşür. Kimyasal enerji fotosentezle üretilen organik moleküllerdeki kimyasal bağlarda depolanır.",
            "II. tip enerji dönüşümü: Organik bileşiklerdeki kimyasal bağ enerjisinin, hücresel solunum sırasında hücre içinde kullanılabilen yüksek enerjili fosfat bağlarına dönüşümü. Yani ATP sentezlenmesi (fosforilasyon) olayıdır.",
            "III. tip enerji dönüşümü: ATP nin yüksek enerjili fosfat bağlarının hidroliz reaksiyonlarıyla kopartılması şeklinde başlayan dönüşümdür. Açığa çıkan ATP enerjisi farklı enerji türlerine dönüştürülerek kullanılır. Örneğin bu enerji hareket ederken kaslarınızda kinetik enerjiye, düşünürken sinir hücrelerinizde elektrik enerjisine dönüştürülür. Bunun yanı sıra ateş böceği gibi bazı canlılar kimyasal enerjiyi ışık enerjisine dönüştürebilen sistemlere sahiptir.",
            "Besinleri oluşturan organik moleküller bir dizi kimyasal tepkimeyle yıkılarak enerji açığa çıkarılır. Hücrede gerçekleşen kimyasal tepkimelerin hepsine birden metabolizma adı verilir. Metabolizma, yapım ve yıkım reaksiyonlarından oluşur Basit moleküllerden karmaşık yapılı moleküllerin sentezlendiği reaksiyonlara yapım reaksiyonları (anabolizma) denir.",
            "Amino asitlerden proteinlerin sentezlenmesi bir yapım reaksiyonudur. Karmaşık moleküllerin daha basit moleküllere parçalandığı reaksiyonlar ise yıkım reaksiyonu (katabolizma) olarak adlandırılır.\n" +
                    "\n" +
                    "Hücrede iş yapmak için kullanılabilen enerjiye serbest enerji denir. Hücrede gerçekleşen kimyasal tepkimeler serbest enerji değişimine göre iki gruba ayrılır.",
            "Ekzergonik tepkime: Enerji açığa çıkaran tepkimelere (enerji veren) denir.\n" +
                    "Örnek olarak: Defosforilasyon, oksijenli ve oksijensiz solunum solunum…\n" +
                    "\n" +
                    "Endergonik tepkime: Gerçekleşmesi için enerjiye ihtiyaç duyulan tepkimelerdir.\n" +
                    "Örnek olarak: Fosforilasyon, fotosentez sırasında organik moleküllerin sentezlendiği reaksiyonlar, bütün biyosentez reaksiyonları, kasların kasılmasını, aktif taşıma, hücre bölünmesi ve sinirsel iletimi sağlayan reaksiyonlar endergoniktir.",
            "ATP Molekülün Yapısı\n" +
                    "Adenin bazı, Riboz şekeri (pentoz) ve üç fosfat grubundan (fosforik asit) oluşur. Adenin bazına ribozun glikozit bağı ile bağlanmasıyla adenozin nükleozit oluşur. Fosfat ile şeker arasında ester bağı bulunur.\n" +
                    "\n" +
                    "Özellikleri:\n" +
                    "– Yapısında iki yüksek enerjili fosfat bağları bulunur\n" +
                    "– Canlının tüm yaşamsal olaylarında kullandığı enerji kaynağıdır\n" +
                    "– Kolayca başka enerji formlarına dönüştürülebilir.(Elektrik,ısı,kimyasal bağ ,osmotik,ışık vb.)\n" +
                    "– Bütün reaksiyonlara katılabilir\n" +
                    "– Her hücre kendi ATP sini kendi sentezler\n" +
                    "– Hücrede sitoplazma,mitokondri ve kloroplastlarda sentezlenir\n" +
                    "– Hücre yaşamsal olaylarında sitoplazmada veya mitokondride üretilen ATP kullanılır\n" +
                    "– Kloroplastlarda sentezlenen ATP organik madde sentezi ve kloroplastlardaki diğer yaşamsal olaylarda kullanılır\n" +
                    "– Yüksek enerjili son fosfat bağının kopması ile ortama 7300 cal enerji verilir.\n" +
                    "– Hücrelerde ADP nin sistemden enerji alarak kendine bir fosforik asit bağlayıp ATP haline gelmesine fosforilasyon denir.",
            "Fotosentez Nedir?\n" +
                    "Bitkilerin CO2 ve H2O gibi inorganik maddelerden güneş enerjisi ve klorofil yardımı ile organik besin üretmeleridir. Bu sırada atmosfere yan ürün olarak O2 verilir. İnorganik maddelerden organik maddeler (besin) üretmektir.\n" +
                    "\n" +
                    "Fotosentez Denklemi: 6CO2 + 6H2O —–(Işık/Klorofil)———–C6H12O6 + 6O2",
            "Fotosentezin Evreleri\n" +
                    "Fotosentez, iki ana basamakta gerçekleşir.\n" +
                    "\n" +
                    "– Birinci basamakta ışık enerjisi, hücrenin doğrudan kullanabileceği kimyasal enerjiye dönüştürülür. Dönüşüm sırasında mutlaka ışık enerjisi kullanıldığından bu olaya ışığa bağımlı reaksiyonlar denir.\n" +
                    "\n" +
                    "– İkinci basamakta CO2 kullanılarak birinci basamaktan gelen ATP ve NADPH molekülleri yardımıyla organik madde sentezlenir. Bir dizi kimyasal tepkimelerin gerçekleştiği bu basamağa ışıktan bağımsız reaksiyonlar denir.",
            "Fotosentez Hızını Etkileyen Faktörleri\n" +
                    "Fotosentetik bir hücrenin birim zamanda ortamdan aldığı CO2 veya ürettiği O2 miktarı fotosentez hızını gösterir.  Fotosentez aynı anda birden çok faktörün etkisi altındadır. Bu durumda fotosentezin hızını, (bitkinin ihtiyacına göre) miktarı en az olan faktör belirler. Buna minimum yasası denir.",
            "Kemosentez\n" +
                    "Klorofiil bulunmayan prokaryot hücre yapısına sahip olan bazı bakteri ve arkelerin inorganik maddelerin oksidasyonu ile açığa çıkan kimyasal enerjiyi kullanarak organik madde sentezlemesi olayına kemosentez, bu olayı gerçekleştiren canlılara da kemoototrof canlılar denir.\n" +
                    "\n" +
                    "Kemosentez yapan canlılar ışığın ulaşamadığı (örneğin derin okyanus tabanları) yerlerde bulunan çoğu ekosistemde üretici basmaktadır.\n" +
                    "\n" +
                    "Bazı kemosentetik bakteriler (fotosentezdeki gibi) CO2 yi indirgeme yoluyla organik besin üretirken diğer kemosentetik bakteriler farklı tepkimeler gerçekleştirir.",
    };
    public static String solunum[] = {
            "Canlılar yaşamsal faaliyetlerini gerçekleştirebilmek için enerjiye ihtiyaç duyarlar. Hücre zarından geçiş olaylarından bazıları, hareket, sinirsel iletim gibi pek çok yaşamsal faaliyet ATP harcanarak gerçekleştirilir. Bu ATP’nin eldesi ise besinlerin parçalanması ile sağlanır. Besin moleküllerinin kimyasal bağlarında bulunan enerji, çeşitli enzimler yardımıyla ve bazı reaksiyon zincirleri sonucunda ATP’ye ve ısıya dönüştürülür.\n" +
                    "\n" +
                    "Her üç olay da canlı hücreler içerisinde meydana gelir ve canlının ihtiyaç duyduğu enerjinin üretimini sağlar.",
            "Fermantasyon\n" +
                    "Glikoz moleküllerinin etil alkol, laktik asit, asetik asit gibi organik moleküllere kadar parçalanmasıdır. Oluşan moleküller yeterince küçük değildir yani koparılan bağ sayısı azdır. Bu nedenle fermantasyon sonucu oluşan ATP, solunum tepkimelerine göre oldukça azdır.\n" +
                    "\n" +
                    "Bilmemiz gereken 2 çeşit fermantasyon vardır:\n" +
                    "\n" +
                    " Etil alkol fermantasyonu\n" +
                    " Laktik asit fermantasyonu\n" +
                    "\n" +
                    "Her iki fermantasyon da glikoliz evresi ile başlar ve her ikisinin de tamamı sitoplazmada gerçekleşir.",
            "Oksijenli Solunum (Aerobik Solunum)\n" +
                    "Oksijenli solunum, aerobik solunum olarak da bilinir. Organik besinlerin Oksijen yoluyla ATP elde etme işidir. Hücrede besinlerdeki kimyasal enerjinin oksijen kullanarak açığa çıkarılması demektir. Biyoloji ders kitapları sık sık hücresel solunum sırasında glikoz molekülü başına 38 ATP molekülü (2 glikolizden, 2 Krebs döngüsünden, 34 kadar elektron taşıma sisteminden) üretildiğini söylese de[1] sızıntılı zarların yanı sıra mitokondriyal matrikse pirüvat ve ADP hareketinin maliyetinden dolayı bu sayıya asla ulaşılmaz, mevcut tahminler glikoz başına 29 ilâ 30 ATP dolayındadır.[1]\n" +
                    "\n" +
                    "C6H12O6 (s) + 6 O2 (g) → 6 CO2 (g) + 6 H2O + 32 ATP\n" +
                    "\n" +
                    "Üç şekilde incelenir:\n" +
                    "\n" +
                    "Glikoliz (sitoplazmada)\n" +
                    "Krebs devri (Karbon(C) yolu tepkimeleri) (mitokondrinin matriksinde)\n" +
                    "Elektron taşıma sistemi (Hidrojen(H) yolu tepkimeleri) (mitokondrinin kristasında)",
            "Glikoz\n" +
                    "Bütün hücresel solunum tepkimeleri glikoliz ile başlar. Glikoliz, glukozun hücrenin sitoplazmasında enzimlerle 2 molekül piruvata (pirüvik aside) yıkıldığı evredir. Glikozun aktifleşmesi ve reaksiyonun başlayabilmesi için aktivasyon enerjisi olarak 2 ATP harcanır.\n" +
                    "\n" +
                    "– Bir glikoz molekülü başına, substrat düzeyinde fosforilasyon ile toplam 4 ATP üretilir. Net kazanç 2 ATP’dir. 2 NAD+ indirgenir yani 2 NADH+H+ oluşur.\n" +
                    "\n" +
                    "– Sitoplazmada gerçekleşir.\n" +
                    "– Oksijene gerek duyulmaz. CO2 kullanılmaz ve de oluşmaz.\n" +
                    "– Glikoliz, hemen hemen tüm canlılarda sitoplazmada aynı enzimlerle gerçekleşir. Bunun nedeni her aşamada görev alan enzimlerin tüm canlılarda bulunmasıdır.\n" +
                    "– Glikolizin son ürünü olan piruvatlar ve NADH’lar ortamda oksijen varsa, mitokondri matriksine (mitokondri iç sıvısına) geçer. (Oksijenin dolaylı etkisi)",
            "Krebs Döngüsü\n" +
                    "Sitrik asit döngüsü de denir. Karbondioksit çıkışının olduğu evredir. Substrat düzeyinde fosforilasyon ile az sayıda ATP sentezi gerçekleşir. NAD ve FAD molekülleri hidrojen yakalayarak indirgenir.\n" +
                    "\n" +
                    "Sitoplazmada glikoliz sonucu oluşan pirüvik asit molekülleri mitokondriye girerek Asetil Co-A molekülüne dönüştürülür. Pirüvik asit 3C’lu,Asetil Co-A ise 2 C’ludur; bu nedenle CO2 çıkışı gerçekleşir. Bu esnada NAD molekülü de hidrojen alarak indirgenir, NADH ‘ye dönüşür. Bu evre Krebs’e hazırlık olarak da tanımlanabilir.\n" +
                    "\n" +
                    "Krebs döngüsünde NAD’den başka bir hidrojen taşıyısı daha görev yapar: FAD (Flavin Adenin dinükleotid). NAD kadar fazla sayıca kullanılmasa da bu molekül de hidrojenleri ETS’ye taşır.\n" +
                    "\n" +
                    "Krebs döngüsü reaksiyonları enzimatik özelliktedir ve ökaryotlarda mitokondrinin sıvı kısmı olan matrikste; prokaryotlarda ise sitoplazmada gerçekleşir.",
            "Oksijensiz Solunum\n" +
                    "Oksijensiz solunum, adından da anlaşılacağı gibi besinlerin oksijen kullanılmadan parçalanarak enerji üretilmesidir. Oksijensiz solunum diğer adıyla fermantasyon olayı genellikle sitoplazmada gerçekleşir. Fermantasyonda oksijenli solunuma göre daha az enerji üretilir. Çizgili kas hücreleri, tek hücreli canlılar, bazı bakteriler ve maya mantarları oksijensiz solunum yaparlar.\n" +
                    "\n" +
                    "Oksijensiz solunumla elde edilen enerji miktarı oksijenli solunuma göre daha azdır. Çünkü, burada glikoz, CO2 ve H2O’ya kadar parçalanamaz, yani tamamen okside olmaz.",
    };
    public static String insanfizyolojisi[] = {
            "Vücudu denetlemek için kimyasal yöntemlerle iletişim kuran denetleyici ve düzenleyici sistemin parçasına endokrin sistem denir. Ürettiği salgıyı doğrudan kana veren bezlere endokrin bez adı verilir. Endokrin sisteminin salgısına hormon adı verilir. Hormonlar sadece kan içerisinde taşınır ve hedefledikleri hücrelere bağlanırlar.",
            "Hipofiz Bezi ve Hormonları\n" +
                    "Beynin alt kısmında bulunan bezelye büyüklüğünde küçük bir organdır. Vücudun “ana bezi” olarak, bir çok hormon üretir. Ürettiği hormonlar vücuttaki diğer bezleri uyararak hormon salgılanmasına neden olur. Hipofiz bezi birçok farklı hormon yapar.",
            "– Prolaktin: Memelilerde laktasyona (süt üretimine) yardımcı olan ve bir dizi başka işlev ve sistemden sorumlu olan bir hormondur. Prolaktin, beyindeki hipofiz bezinin ön kısmının yanı sıra rahim, beyin, göğüsler, prostat, yağ dokusu, deri ve bağışıklık hücrelerinde üretilir.\n" +
                    "\n" +
                    "– Büyüme Hormonu (Somatotropin): Büyüme hormonu, hipofizin bezinin ön lobundaki somatotroflar tarafından sentezlenen ve salgılanan yaklaşık 190 amino asitten oluşan bir proteindir. Büyüme ve metabolizma da dahil olmak üzere çeşitli kompleks fizyolojik süreçlerde rol oynar.",
            "– ACTH (Adrenokortikotropik Hormon): Böbrek üstü bezinin kabuk (korteks) kısmını uyararak burada steroid yapıdaki hormonların yapımını uyarır.\n" +
                    "\n" +
                    "– TSH (Tiroid Uyarıcı Hormon): Kadında yumurtalıkları (ovaryumu) etkileyerek yumurta üretimini (oogenez) sağlar. Erkekte testisleri (er bezlerini) etkileyerek sperm üretimini (spermatogenez) sağlar.\n" +
                    "\n" +
                    "– LH (Luteinleştirici hormon): Erkekte spermin olgunlaşmasını ve testislerin testesteron salgılamasını sağlar.\n" +
                    "Kadında, yumurtalıkta ovulasyonu (yumurtlama) ve korpus luteum (sarı cisim) oluşumunu sağlar.",
            "– FSH (Folikül Uyarıcı Hormon):  Follikül stimüle edici hormon, gonadotropik hormonlardan biridir (diğeri LH’dır). Her ikisi de hipofiz bezi tarafından kan dolaşımına salınır. Folikül stimüle edici hormon, pubertal gelişim ve kadınlarda yumurtalıklarının, erkeklerde testislerinin gelişmi ve işlevi için gerekli hormonlardan biridir.\n" +
                    "\n" +
                    "Kadınlarda bu hormon, yumurtlamadan önce, yumurtalıktaki foliküllerden birisini uyararak bir yumurtanın büyümesini sağlar. Ayrıca östradiol üretimini de arttırır. Erkeklerde follikül stimüle edici hormon, testislerin Sertoli hücrelerinde sperm üretimini (spermatogenezi) tetikler.\n" +
                    "\n" +
                    "– ADH (Vazopressin): Antidiüretik hormon (ADH) ile eş anlamlı olarak kullanılır. Hipotalamus ve arka Hipofiz Bezi tarafından salgılanan, hafif bir damar daraltıcı etkisi olan ancak başlıca işlevi idrarla su kaybını önlemek olan bir hormondur. Homeostaz açısından son derece önemli bir hormondur.\n" +
                    "\n" +
                    "– Oksitosin: Sadece dişilerde, doğum sırasında salgılanan bir hormondur. Doğum sancısının oluşmasını ve devamında sütün süt kanallarına salınmasını uyarır. Bu nedenle bazen doğum sırasında doğum sancısı oluşturmak için enjekte edilir.",
            "Tiroit Bezi ve Hormonları\n" +
                    "Tiroit bezi, nefes borusu yani trakeanın ön kısmında yer alan, 25-40 gram ağırlığında ve şekli kelebeğe benzeyen bezdir. Boyutu küçük olmasına karşın salgıladığı hormonlarla vücudumuz için çok önemli işlevlere sahiptir. Bu organın temel görevlerinden biri vücut metabolizmasını ayarlayan T3 ve T4 hormonlarını salgılamaktır.",
            "– Trioksin: Vücutta bazal metabolizma hızını, hücresel işlevlere enerji sağlamak amacıyla mitokondrilerin sayısını ve aktivitesini arttırır. Vücudun bütün hücreleri bu hormondan etkilenir. Yapısında %65 oranında iyot (I) minerali bulunur ve protein yapılıdır.\n" +
                    "Gelişme döneminde tiroksin az salgılanırsa; kretenizm (ahmaklık) hastalığı olur. Erginlik döneminde az salgılanırsa; miksodema hastalığı olur. Bu hastalıkta metabolizma hızı yavaşlar ve uyuşukluk hissedilir. Yetişkinlik döneminde az salgılanırsa; guatr hastalığı olur. Deniz ürünleriyle beslenmek ve iyotlu tuz kullanmak bu eksikliğin önlenmesinde etkili bir rol oynar.\n" +
                    "\n" +
                    "– Kalsitonin Hormonu: Kandaki kalsiyum seviyesini ayarlayan bir hormondur. Kandaki fazla kalsiyumun (D vitamini yardımı ile) kemiğe geçmesini sağlar. Ayrıca böbreklere etki ederek kalsiyumun geri emilmesini azaltır ve idrarla daha fazla atılmasını sağlar. Bağırsaklardan da kalsiyumun geri emilimini azaltır.",
            "Paratiroit Bezi ve Hormonları\n" +
                    "Paratiroit bezi, tiroit bezinde konumlanmış dört küçük bezden oluşur. Salgıladığı hormona parathormon adı verilir.\n" +
                    "\n" +
                    "– Parathormon:  Kalsiyumun kemiklerden kana geçişini, böbreklerden fosforun atılmasını sağlar. Parathormon besinlerle alınan ve deride sentezlenen D vitamininin aktifleşmesini sağlar. Kanda kalsiyum seviyesi azaldığında salgısı artan parathormon sayesinde kemik dokudan kana kalsiyum geçişini hızlandırır. Kalsiyumun börek ve bağırsaklardan geri emilimini arttırır. Ayrıca böbreklerden fosforun atılmasını hızlandırır ve kandaki fosfor miktarını azaltır. ",
            "Böbrek Üstü Bezleri ve Hormonları\n" +
                    "Böbrek üstü bezleri her iki böbreğin üzerinde bulunur ve böbreklerden bağımsız çalışır. Diğer organlara göre çok fazla kılcal damar ağına sahiptir. Kabuk (kortex) ve öz (medula) bölgelerinden oluşur.",
            "Pankreas ve Hormonları\n" +
                    "Hem hormon salgılayan hem de sindirim enzimi salgılayan pankreas, karma bez olarak görev alır. Ekzokrin bez olarak sindirim enzimlerini, endokrin bez olarak insülin ve glukagon hormonlarını salgılar.\n" +
                    "\n" +
                    "– İnsülin: Pankreasın langerhans adacığındaki beta hücreleri tarafından salgılanır.Kandaki glikozun vücut hücrelerine geçmesini sağlayarak kan şekerini düşürür.Beyin hücreleri hariç tüm vücut hücrelerinin glikoza geçirgenliğini arttırır.Glikozun fazlasının kas ve karaciğerde glikojen olarak depo edilmesini sağlar.Kas hücrelerinin ve yağ doku hücrelerinin kandan daha fazla glikoz almalarını uyarır.Protein sentezini arttırır.\n" +
                    "\n" +
                    "– Glukagon:Langerhans adacıklarının alfa hücrelerinden salgılanır.Kanın glikoz seviyesini artırıcı yönde etki yapar.Açlık durumunda kan şekeri düştüğünde salgılanan glukagon, karaciğerde glikojen yıkımını sağlar ve kana glikoz salınımını uyarır, yağ dokularında yağ yıkımını sağlar.",
            "Eşeysel Bezler ve Hormonları\n" +
                    "Dişide yumurtalıklarda, erkekte ise testislerde üretilen eşey hormonları, büyüme ve gelişmeyi düzenleyerek üreme döngülerini ve eşeysel davranışları kontrol eder. Steroid yapılı olan eşey hormonları, FSH ve LH hormonları tarafından kontrol edilerek üretilir.",
            "Yumurtalık Hormonları\n" +
                    "Dişide üreme sisteminde bir çif yumurtalık (ovaryum) bulunur.Ovaryumlar östrojen ve progesteron hormonları üretir ve salgılar.\n" +
                    "\n" +
                    "– Östrojen: Östrojen, ergenlik döneminde ikincil dişilik özelliklerinin (meme bezlerinin büyümesi, sesin incelmesi, omuzların dar olması, vb.) ortaya çıkmasını sağlar. Bunun yanında yumurta kanalını, ovaryumu, döl yatağının (uterus) büyüyüp gelişmesini uyarır.Ayrıca, rahim duvarında mitozu artırır.\n" +
                    "\n" +
                    "– Progesteron: Progesteron ise döl yatağını, embriyonun tutunup gelişebilmesi için uygun hâle getirmek için rahim duvarının kılcal damar ağını zenginleştirir.",
            "Testis Hormonları\n" +
                    "Testis hormonları, testislerde bulunan leydig hücreleri tarafından testosteron hormonu salgılanır. Testosteron, spermlerin olgunlaşmasını sağlar. Ergenlik döneminde ikincil erkeklik özelliklerinin (sesin kalınlaşması, vücut kıllanması vb.) ortaya çıkmasını ve sperm oluşumu için testislerin normal gelişimini sağlar.",
            "Görme Duyusu Göz\n" +
                    "İnsan gözü 4000 – 7400 A° arasındaki dalga boyuna sahip ışıkla uyarılabilen, görme olayını gerçekleştiren organdır. Göz, görmeyi sağlayan ve koruyucu görevi olan yapılardan meydana gelmiştir. Gözdeki koruyucu yapılar; kaşlar, göz kapakları, kirpikler, gözyaşı bezi ve göz yuvarlağını göz çukuruna bağlayan, hareketi sağlayan kaslardır.\n" +
                    "\n" +
                    "Göz dıştan içe doğru sert tabaka (sklera), damar tabaka (koroid) ve ağ tabaka (retina) olmak üzere üç bölümden oluşur.",
            "Tat Alma Duyusu Dil\n" +
                    "Tat alma, beş duyudan biridir. İnsanda tat alma, dile temas eden nesnelerdeki kimyasal maddelerin kemoreseptörler tarafından algılanması sonucu oluşur. Bilimsel anlamda dilin tat alma sistemi ile algıladığı beş temel (ana) tat vardır: tatlı, ekşi, tuzlu, bitter (buruk/acımtırak) ve umami.\n" +
                    "\n" +
                    "Bunlara ilaveten biber vb. yiyeceklerin oluşturduğu yanma hissi “acı” olarak tanımlanır ve gündelik kullanımda sıklıkla temel tatlara dahil edilir. Temel tatlar haricinde yağlı, metalik gibi çok çeşitli tat sınıfları mevcuttur.\n" +
                    "\n" +
                    "Aralarında insanın da bulunduğu kara omurgalılarında tat alma, dilde bulunan ve tat tomurcuğu adı verilen organ tarafından gerçekleştirilir.Balıklarda tat tomurcuğu dudaklarda, yüzgeçlerde ve bazı türlerde kuyrukta bulunur. Kimyasalları algılayan reseptör hücrelerin yaklaşık 50-150’si bir tat tomurcuğunu meydana getirir. Tat tomurcukları dil yüzeyinde gömülü durumdadır ve ağızdaki kimyasallar tat tomurcuğuna tat gözenekleri vasıtasıyla erişir.",
            "Koku Alma Duyusu Burun\n" +
                    "Burun, nefes ve koku alma organı olarak iş görür. Solunan havayı ısıtma, temizleme ve nemlendirme gibi görevleri vardır. İnsanların koku duyusu, uçucu ve mukusta çözünebilen kimyasalları algılar. Koku reseptörleri burnun üst kısmında sarı bölge adı verilen yerde bulunur.\n" +
                    "\n" +
                    "Reseptör hücrelerin algılayıcı uçlarında yer alan siller, kokuyu algılar ve uyarı, hücrelerin kendi aksonları aracılığı ile beynin ilgili merkezine götürülür. Uzun süre aynı koku alınırsa koku reseptörleri yorulurlar ve koku hissedilmez. Bu durum koku adaptasyonudur.\n" +
                    "\n" +
                    "Kişinin kendi ten kokusunu veya üzerine sıktığı parfüm kokusunu bir süre sonra algılayamamasının sebebi budur. Bu durumdaki duyu hücreleri ancak ortama yayılan farklı bir kokuyu algılayabilir.",
            "İşitme Duyusu Kulak\n" +
                    "İşitme, dış ortamdaki seslerin dış kulak yolundan iç kulağa iletilip iç kulaktaki sinir hücrelerini uyarması ve akustik bilginin beyne aktarılmasıyla dış ortamdaki seslerin algılanmasına denir.\n" +
                    "\n" +
                    "Kulak, işitme ve denge organımızdır. Kulağın yapısı dış kulak, orta kulak ve iç kulak olmak üzere üç kısımdan oluşur.\n" +
                    "\n" +
                    "Dış kulak ses dalgalarını toplayıp orta kulağa iletmekten; orta kulak aldığı ses dalgalarının şiddetini arttırarak iç kulağa iletmekten sorumludur. İç kulak ise aldığı bu ses dalgalarını sinir sinyallerine dönüştürerek beyne gönderir ve beyinde sesin algılanıp yorumlanması gerçekleşir.",
            "Dokunma Duyusu Deri\n" +
                    "Terleme ile boşaltıma yardımcı olur. Solunumu sağlar. Vücudu dıştan gelebilecek darbelere karşı korur. Vücut ısısını ayarlar",
            "İskelet Sistemi\n" +
                    "İç organları korur, mineral depolar, kaslara ve iç organlara bağlanma yüzeyi oluşturur.\n" +
                    "\n" +
                    "İskeletimiz kemik, kıkırdak ve eklemlerden oluşur. Vücudumuzdaki iskelet yaklaşık olarak 206 kemikten oluşmuştur.\n" +
                    "\n" +
                    "İskelet;\n" +
                    "\n" +
                    "– Vücudun dik durmasını sağlar.\n" +
                    "– İç organları dış etkilerden korur.\n" +
                    "– Kan hücreleri üretir.\n" +
                    "– Kalsiyum ve fosfor gibi mineralleri depolar.\n" +
                    "– İç organlara ve kaslara tutunma yüzeyi sağlar.\n" +
                    "– Vücuda genel şeklini verir.\n" +
                    "– Kasların yardımıyla vücudun hareket etmesini sağlar.",
            "Kemikler\n" +
                    "Kemiklerde bulunan, % 25 su, % 45 inorganik madensel tuzlar (kalsiyum fosfat, kalsiyum karbonat, magnezyum fosfat az miktarda sodyum ve demir) kemiğin sert yapısını, % 30 organik maddeler ise esnekliği sağlar. Canlı kemik hücrelerine osteosit ve bu hücreler tarafından salgılanan organik ara maddeye osein denir. Bu iki yapı kemik dokusunu meydana getirir. Kemikler yapıları yönüyle iki kısma ayrılır.\n" +
                    "\n" +
                    "Kemik hücreleri yıldız şeklinde olup kemik dokusunda lakün adı verilen boşluklarda yer alır. Bütün kemiklerin dışında kemik zarı (periost) bulunur. Periost, bağ dokudan yapılmış, bol miktarda sinir ve kan damarı içerir.",
            "Kemik Çeşitleri\n" +
                    "Uzun kemikler: Kol ve bacaklarda bulunan, uzunluğu kalınlığından fazla olan, silindir şeklindeki kemiklerdir.Uç kısımlarındaki şişkin bölgelere baş, iki baş kısım arasındaki bölgeye ise gövde adı verilir. Baş kısımlarının dışı sert kemik doku, içi süngerimsi kemik doku yapısındadır. Süngerimsi kemik dokunun içindeki boşluklarda kan hücrelerinin üretildiği kırmızı kemik iliği bulunur.\n" +
                    "\n" +
                    "Gövdede sert kemik doku bulunur. Gövdenin ortasındaki boşlukta ise sarı kemik iliği yer alır. Uzun kemiğin baş kısmı ile gövdesi arasında, kemiğin boyuna uzamasını sağlayan kıkırdak doku yapısında epifiz plağı denilen büyüme bölgesi bulunur. Bu kıkırdak yapı 19-23 yaşından sonra kemikleşir ve kemiğin boyuna uzaması durur. İnsanlarda boydaki uzamanın sınırlı olmasının nedeni budur.\n" +
                    "\n" +
                    "Kısa Kemikler: Omurgada, el ve ayak bileklerinde bulunur. Sarı ilik kanalı bulunmaz. Yaklaşık olarak eni boyu ve kalınlığı eşit olan kemiklerdir.\n" +
                    "\n" +
                    "Yassı Kemikler: Göğüs, kafatası, kürek ve kaburga kemiklerinden ibarettir. Yassı kemiklerde sarı ilik kanalı bulunmaz. Bu tip kemiklerde süngerimsi kemik dokusu sıkı kemik dokusundan fazladır. Eni ve boyu fazla kalınlığı çok az olan kemiklerdir.\n" +
                    "Yassı ve kısa kemiklerin süngerimsi dokuları içinde uzun kemiklerin baş kısmında olduğu gibi alyuvarların yapımını sağlayan kırmızı kemik iliği bulunur.\n" +
                    "\n" +
                    "Düzensiz şekilli kemikler: Belli bir şekli olmayan, baskılara karşı dayanıklı, sağlam kemiklerdir. Örneğin omurlar ve çene kemikleri düzensiz kemik çeşitleridir.",
            "Kas sistemi\n" +
                    "Kas sistemi canlıya hareket yeteneği sağlayan sistemdir. Kas sistemi omurgalılarda sinir sisteminin kontrolü altında olmasına rağmen bazı kaslar (örneğin kalp kası) tamamen otonom çalışabilir.\n" +
                    "\n" +
                    "Kaslarda hücreler arası madde bulunmaz. Kas hücresinin sitoplazmasına sarkoplazma, hücre zarına ise sarkolemma denir. Kas hücrelerinin endoplazmik retikulumuna da sarkoplazmik retikulum adı verilir, mitokondrilerine sarkozom denir. Kas hücreleri yüksek enerjiye ihtiyaç duyduklarından çok sayıda mitokondrileri vardır.\n" +
                    "\n" +
                    "Sarkoplazmada kasılmayı sağlayan miyofibril olarak adlandırılan telcikler vardır. Miyofibriller, aktomiyozin denilen aktin ve miyozin proteinlerinden oluşur.\n" +
                    "\n" +
                    "Vücudumuzda üç çeşit kas bulunmaktadır. Bunlar; çizgili kas (ya da iskelet kası), düz kas, kalp kasıdır.",
            "Çizgili Kas: Silindir şeklinde uzun hücrelerden oluşur. Kas hücrelerine kas lifi denir. Hücreler arası zarları eridiğinden dolayı çizgili kas lifleri çok çekirdeklidir. Çekirdekler hücre zarının hemen altında bulunur. Miyofibriller, düzenli aralıklarla açık ve koyu olarak enine bantlaşmalar gösterir.\n" +
                    "\n" +
                    "Somatik sinir sistemi kontrolünde çalışır. Yani istemli çalışır. Düz kaslara göre daha hızlı çalışır, çabuk yorulur. Oksijen yetersizliğinde laktik asit fermantasyonu ile ATP üretirler.\n" +
                    "\n" +
                    "Düz Kas: Düz kaslar Otonom sinir sistemi tarafından kontrol edilir. İstemsiz yapılan hareketlerin gerçekleşmesini sağlar. Bağırsak, mide, atardamar, toplardamar gibi organların yapısında bulunur. Sadece oksijenli solunum yaparlar. Miyoglobin içermezler. Kreatin fosfat metabolizmasını kullanmazlar. DNA replikasyonu yapmazlar. Depo şeker olarak glikojen sentezlemezler.\n" +
                    "\n" +
                    "Kalp Kası: Kalbin yapısında yer alır. Silindirik hücreleri dallanma gösterir. Kalp kası hücreleri genellikle tek çekirdeklidir ve çok miktarda mitokondri içerir. Miyozin ve aktin filamentlerin düzenli diziliminden dolayı kalp kası hücreleri mikroskop altında çizgili görünür. Bu hücreler, çizgili olmaları nedeniyle iskelet kası hücreleri\u00ADne benzer, hızlı kasılır.\n" +
                    "\n" +
                    "İstemsiz çalışmala\u00ADrı nedeniyle düz kas hücrelerine benzerlik gösterir. Çalışmaları otonom sinir sistemi tarafından düzenlenir. Kalp kası hücreleri otonom sinir sistemi tarafından impuls almadan da kasılıp gevşeyebilir.",
            "Mekanik Sindirim: Besinlerin enzim kullanılmadan sadece fiziksel olarak küçük parçalara ayrılması olayına mekanik (fiziksel) sindirim denir. Bu sindirim türünde, besinin kimyasal yapısı değişmezken sadece fiziksel değişim gerçekleşir. Örneğin, ağızda dişlerin lokmaları daha küçük parçalara ayırması.\n" +
                    "\n" +
                    "Mekanik sindirimin amacı; Besinlerin yüzeyini arttırarak enzimlerin etkinliğini arttırmak böylece kimyasal sindirimi kolaylaştırmaktır.\n" +
                    "\n" +
                    "Kimyasal Sindirim: Dışarıdan alınan besin maddelerinin su ve enzimler yardımıyla yapı taşlarına (monomerlerine) kadar parçalanmasıdır. Kimyasal sindirim hidroliz tepkimeleriyle gerçekleşir. Hidroliz; büyük biyolojik moleküllerin suyun eklenmesiyle parçalanmasıdır. ATP harcanmaz.\n" +
                    "\n" +
                    "Kimyasal sindirimin temel amacı; Polimerlerin veya makro moleküllerin yapı birimlerine ayrılmasını sağlamak, böylece enerji verici molekülleri hücre içine alabilmektir.\n" +
                    "\n" +
                    "Kimyasal sindirim, gerçekleştiği yere göre hücre içi ve hücre dışı olmak üzere ikiye ayrılır.\n" +
                    "\n" +
                    "Hücre dışı sindirim: Hücrenin dış ortama enzim salgılamasıyla gerçekleşir. Sindirim sonucu oluşan monomer yapılı besinler difüzyon ve aktif taşımaya hücre içine alınır. Saprofit bakteri mantarlarda, böcekçil bitkilerde ve omurgalı hayvanlarda görülür.\n" +
                    "\n" +
                    "Hücre içi sindirim: Fagositoz ve pinositoz yoluyla hücreye alınan besinlerin lizozom enzimleriyle parçalanmasıdır. Amip, öglena gibi tek hücrelilerde ve akyuvar hücrelerinde görülür.",
            "Sindirim Organları\n" +
                    "İnsanda sindirim sistemi, sindirim olaylarının gerçekleştiği sindirim kanalı ve sindirime yardımcı organlardan oluşur.\n" +
                    "\n" +
                    "Sindirim kanalı; ağız, yutak, yemek borusu, mide, ince bağırsak, kalın bağırsak ve anüsten meydana gelir.\n" +
                    "\n" +
                    "Sindirime yardımcı organlar; tükürük bezleri, pankreas, karaciğer ve safra kesesinden meydana gelir.",
            "Besinlerin Emilimi\n" +
                    "Vücuda alınan besinlerin bir kısmı sindirilerek emilirken bir kısmı da doğrudan emilir. Emilimin büyük kısmı bağırsaklarda gerçekleşir. Bunun yanısıra ağız ve mide emilimin yapıldığı diğer organlardır.\n" +
                    "\n" +
                    "Su, glikoz, amino asit. mineraller ve suda eriyen vitaminler ince bağırsak epitel hücrelerine emilir ve kılcal kan damarlarına geçerek kan dolaşımı ile kalbe taşınır.\n" +
                    "\n" +
                    "Gliserol, yağ asitleri ve yağda eriyen vitaminler ince bağırsak epitel hücrelerine emilir. Epitel hücrelerinde yağ asitleri gliserolle birleşir ve yağ oluşturur. Oluşan yağlar kolesterol ve özel proteinlerle sarılarak şilomikrona dönüşür. Şilomikron lenf kılcalına geçerek taşınır.",
            "Merkezi Sinir Sistemi\n" +
                    "Merkezi sinir sitemi beyin ve omurilikten oluşur. Beyin kafatasının içini dolduran milyarlarca hücreden oluşmuş bir merkezdir. Omurilik ise omurga kanalı içerisinde incelerek uzanan bir yapıdır.",
            "Beyin\n" +
                    "Kafatası içerisinde bulunur, kütlesi yaklaşık 1,5 kg’dır. Beyin ve omurilik dıştan içe doğru sen zar, örümceksi zar ve ince zardan oluşan meninges (beyin zarları) ile sarılıdır. Bu zarların mikroorganizma etkisiyle iltihaplanması, menenjit adı verilen hastalığa neden olabilir.",
            "Omurilik\n" +
                    "Sırtta omurganın içerisinde yaklaşık 45-50 cm uzunluğa sahip olan sinir kordonuna omurilik denir. Omurilik yapısının en dışında omurga kemikleri bulunur. Omurilikte beyinde olduğu gibi sert zar, örümceksi zar, BOS sıvısı, ince zar, omuriliğin ak maddesi, omuriliğin boz maddesi ve en içte BOS sıvısı ile dolu olan omurilik kanalı bulunur.\n" +
                    "\n" +
                    "Omurilik refleks tepkilerinden sorumlu olunan bölgedir. Uyarılara karşı istemsiz ve aniden oluşturulan tepkilere refleks denir. Refleksler çoğunlukla istemli kontrol edilemez. Refleks olaylarının omurilikten yönetilmesi hareketin beyne iletileceği ve değerlendirileceği süreyi kısaltarak canlılar için dış uyarılara hızlı tepki vermeyi sağlar. Omurilikte refleks oluşurken impulsun izlediği yola refleks yayı denir.\n" +
                    "\n" +
                    "Doğuştan var olan ve tüm insanlarda benzer şekilde olan reflekslere kalıtsal refleks denir. Örneğin; bebeklerde emme refleksi, göz kapağının ani ışıkta kapanması ve diz kapağı refleksi kalıtsal reflekslerdir.\n" +
                    "\n" +
                    "Öğrenme sonucu oluşan kazanılmış reflekslere şartlı refleks denir. Örneğin; limon görünce ağzın sulanması, kedilerin pisi pisi sesine doğru gelmeleri, bisiklet sürmek, dans etmek gibi.\n" +
                    "\n" +
                    "Basit bir refleks olayında duyu nöronu, ara_nöron ve motor nörondan oluşan refleks yayı görev yapar. Örneğin, eline iğne batan bir kişide, kolu geri çekme refleksi basit reflekstir.",
            "Çevresel Sinir Sistemi\n" +
                    "Çevresel sinir sistemi, beyinden (kafa sinirleri) ve omurilikten (omurilik sinirleri) çıkan duyu ve motor nöronlarından oluşur.Beyinden 12 çift sinir çıkar. Bu sinirlerden 10. sinir çiftine vagus siniri adı verilir. Vagus siniri, akciğer, kalp, pankreas ve bağırsaklara uzanan parasempatik bir sinirdir.\n" +
                    "\n" +
                    "Omurilikten 31 çift sinir çıkar, bunlar duyu ve motor nöronlarıdır. İnsanda en büyük omurilik sinir çifti, bacaklara giden siyatik sinirlerdir.\n" +
                    "\n" +
                    "Çevresel sinir sistemi otonom (istemsiz) ve somatik (istemli) olmak üzere ikiye ayrılır.",
            "Otonom Sinir Sistemi\n" +
                    "Otonom sinir sistemi istemsiz çalışır. Beyinden ve omurilikten gelen motor sinirlerden meydana gelir.  Otonom sinir sisteminin bazıları hariç miyelinsiz sinirlerden oluşur.\n" +
                    "\n" +
                    "Akson çapları dardır. İmpuls iletimi yavaştır. Bu sebepten impuls, miyelinli motor sinirlere göre daha yavaş ilerler. İç organların çalışmasını düzenler.\n" +
                    "\n" +
                    "Boşaltım, kan dolaşımı, üreme, solunum, sindirim sistemi hareketleri ve bazı endokrin bezlerin çalışması gibi önemli vücut fonksiyonlarını kontrol eder.\n" +
                    "\n" +
                    "Otonom sistemi birbirine zıt çalışan sempatik ve parasempatik sistemden oluşur. Her iç organa biri sempatik diğeri parasempatik sinir sisteminden gelen bir çift sinir bağlanır.",
            "Somatik Sinir Sistemi\n" +
                    "Bilinçli yapılan hareketleri kontrol eden sinir sistemine somatik sinir sistemi denir. İskelet kaslarına giden miyelin kılıflı motor nöronlardan oluşur. Bu nöronların gövdeleri beyin veya omuriliktedir. Bu sinir sistemi; konuşma, yazma, koşma gibi istemli tepkileri kontrol eder.",
            "Sinir Sistemi Rahatsızlıkları\n" +
                    "Sinir sistemi hastalıları önemli sağlık sorunları arasındadır. Bu tip hastalıklara multiple skleroz (MS), epilepsi, Alzheimer, Parkinson ve depresyon gibi örnekler verilebilir.",
            "Dolaşım Sistemi\n" +
                    "Metabolik faaliyetlerin devamı için gereken maddelerin ortama kazandırılmasını veya metabolik faaliyetler sonucu oluşan artık/zararlı maddelerin ortamdan uzaklaştırılmasını sağlayan sisteme dolaşım sistemi denir.\n" +
                    "\n" +
                    "Dolaşım sistemi açık ve kapalı dolaşım sistemi olmak üzere ikiye ayrılır.",
            "Açık dolaşım Sistemi\n" +
                    "Bu tip dolaşım sistemi yumuşakçalar ve eklembacaklılar gibi omurgasızların büyük bir kısmında görülür. Bu canlılarda hemosöl olarak adlandırılan vücut boşluklarında dolaşım sıvısı organları doğrudan sarar (yıkar) ve kan (dolaşım sıvısı) ile interstisyel sıvı (doku sıvısı) arasında ayrışma yoktur. Bu birleşik sıvıya hemolenf denir. Hayvan hareket ederken oluşan kas hareketleri hemolenf hareketini sağlar fakat sıvı akışını bir bölümden diğerine yönlendirilmesi kısıtlıdır. Kalp gevşediğinde kan açık gözenekler (por) aracılığıyla kalbe döner.\n" +
                    "\n" +
                    "Hemolenf vücudun içini (hemosöl) tamamen kapsar ve tüm hücreleri sarar. Hemolenf su, inorganik tuzlar ve organik bileşiklerden oluşur. Birincil oksijen taşıyıcı molekül ise hemosiyanindir. Kılcal kan damarları bulunmaz.\n" +
                    "\n" +
                    "Ayrıca, hemosit olarak adlandırılan hücreler vardır ki bunlar hemolenfte bağımsız bir şekilde gezer ve antropod bağışıklık sisteminde rol alırlar. Kanın damarlardan geçerek vücut boşluğuna aktıktan sonra toplanarak kalbe dönmesidir. Açık dolaşım derisi dikenlilerde (deniz kestanesi,deniz yıldızı vb.), eklem bacaklılarda (örümcek, arı, sinek vb.) ve yumuşakçalarda (deniz anası, istiridye, midye vb.) görülür.",
            "Kapalı Dolaşım Sistemi\n" +
                    "Kapalı dolaşım sistemi; atardamar, toplardamar, kılcaldamar ve kalpten oluşur. Kan hep damar içinde olduğundan kapalı dolaşım sistemi, açık dolaşım sistemine göre daha hızlıdır; buna bağlı olarak kapalı dolaşım sistemine sahip canlıların metabolizması da hızlıdır. Hedef hücreyle kan temas etmez. Bu yüzden kılcaldamarların etrafında madde ve gaz alış verişini sağlayacak doku sıvısı bulunur. Toprak solucanı, ahtapot, bazı omurgasız hayvanlar ve bütün omurgalı hayvanlar kapalı dolaşım sistemine sahiptir.\n" +
                    "\n" +
                    "Bazı canlılarda hem açık hem de kapalı dolaşım sistemi olmayabilir. Omurgasız hayvanlardan; sünger, sölenter ve yassı solucanlar bu tür, dolaşım sistemi bulunmayan, canlılara örnektir. Bu canlılar dolaşım ihtiyacını; difüzyon, osmoz ve aktif taşıma ile sağlar.",
            "Kan Dolaşımı\n" +
                    "İnsanda kan dolaşım sistemi kan, damarlar ve kalp olmak üzere üç temel ögeden oluşmaktadır.\n" +
                    "\n" +
                    "Kalp\n" +
                    "Göğüs boşluğunda iki akciğer arasında hafif sola eğik olarak yerleşmiştir.\n" +
                    "\n" +
                    "İnsanda bulunan kalp 4 odacıktan oluşmaktadır. Kulakçık adını verdiğimiz toplardamardan kan toplayan yapılar, topladıkları kanı karıncık adındaki kalp bölmesine iletir. Karıncıklar atardamarlar aracılığıyla kanları ilgili organlara ulaştırır.\n" +
                    "\n" +
                    "Kalp, üstte iki kulakçık, altta iki karıncık olmak üzere dört odacıktan oluşur. Sol kulakçık ve sol karıncıkta temiz kan (oksijence zengin kan), sağ kulakçık ve sağ karıncıkta ise kirli kan (karbondiositçe zengin kan) bulunur. Kulakçıklar ile karıncıklar arasında ve atardamarların karıncıktan çıktığı noktalarda kapakçıklar bulunur.\n" +
                    "\n" +
                    "Kulakçık ve karıncıkları birbirinden ayıran kapakçıklar bulunur. Bu kapakçıklar kanın kalp içinde tek yönlü akmasını sağlar. Sağ kulakçıkta sağ karıncık arasında üçlü kapakçık (triküspit) sol kulakçık ve sol karıncıkarasında ise ikili kapakçık (biküspit, mitral) bulunur. Bu kapakçıklar, karıncıklar kasıldığında kapanır, kulakçıklar kasıldığında açılır.",
            "Damarlar\n" +
                    "İnsanda atardamar, toplardamar ve kılcaldamar olmak üzere üç çeşit damar vardır.\n" +
                    "\n" +
                    "Atardamar\n" +
                    "\n" +
                    "Kalpteki kanı diğer organlara taşıyan damarlardır. Kanın akış yönü kalpten vücuda doğrudur.  Akciğer atardamarı hariç vücuttaki tüm atardamarlar oksijence zengin kan (temiz kan) taşır. Akciğer atardamarı ise kalpteki kirli kanı ( CO2 yoğunluğu fazla kanı) temizlenmesi için akciğere götürür.\n" +
                    "\n" +
                    "Atardamarlar, kan götürdüğü organa göre isimlendirilirler. Lifli bağ doku, elastik lif içeren düz kas ve tek sıralı yassı epitel doku olmak üzere 3 kısımdan oluşur.\n" +
                    "\n" +
                    "Yapısındaki elastik lifler sayesinde patlamadan yüksek kan basıncına dayanır.",
            "Toplardamar\n" +
                    "\n" +
                    "Kanı kalbe toplayan damarlara toplar damar denir. Akciğer ve plasenta toplar damarı hariç bütün toplar damarlar kirli kan taşır. Atar damardaki gibi 3 tabakaya sahiptir.\n" +
                    "\n" +
                    "Toplar damarlardaki kan basıncı çok düşük olduğundan tek yönlü kapakçıklar bulunur. Basınç düşük olduğu için elastik lifler bulunmamaktadır.",
            "Kılcal damar\n" +
                    "\n" +
                    "Genellikle atardamarlar ile toplardamarlar arasında bulunur. Tek katlı yassı epitel dokudan (endotel) oluşur.\n" +
                    "\n" +
                    "Kan ile doku sıvısı arasında madde alışverişini sağlar. Toplam çap alanı (toplam yüzeyi) en geniş olmasından dolayı kan akış hızı en yavaş olan damarlardır.",
            "Kan\n" +
                    "Yetişkin bir insanda ortalama 5 litre kan bulunur. Kanın %55’ini plazma, %45’ini ise kan hücreleri oluşturur.\n" +
                    "\n" +
                    "Plazma\n" +
                    "\n" +
                    " Kan dokunun sıvı olan ara maddesine plazma denir. Plazma, içinde bulunan çözünmüş proteinlerden dolayı sarı renktedir.\n" +
                    "\n" +
                    "Kan plazmasının yaklaşık %90’ı su, %7’si protein (albumin, globülin, fibrinojen), geri kalan kısmı hormon, antikor, vitamin, amino asit, karbonhidrat, yağ,üre, ürik asit, enzim (sindirim enzimi hariç) gibi organik maddelerle sodyum, klor, magnezyum, bikarbonat gibi iyonlardan oluşur.\n" +
                    "\n" +
                    "Kan proteinleri, kanın pıhtılaşması gibi bazı olayların gerçekleşmesinde rol oynarlar. Yapısında; albumin, globulin, fibrinojen ve protrombin gibi kan proteinleri vardır.",
            "Kan Hücreleri\n" +
                    "\n" +
                    "Kanın yaklaşık %45’ini oluşturur. İçerisinde alyuvar (eritrosit), akyuvar (lökosit) ve kan pulcukları (trombositler) bulunur.\n" +
                    "\n" +
                    "Alyuvarlar: Oksijen ve karbondioksit taşıyan içerisinde hemoglobin pigmenti bulunan kan hücresidir. Kanda en çok bulunan kan hücresidir. Hemoglobinin içindeki demir sayesinde kana kırmızı rengini verir.\n" +
                    "İnsanlarda olgun alyuvar hücreleri çekirdeksizdir. Bu sayede daha çok gaz taşınabilir. Deniz seviyesinden yükseklere çıkıldıkça oksijen basıncı düşer, nefes almanın güçleşmemesi için kandaki alyuvar sayısı artar.\n" +
                    "Alyuvarlar kırmızı kemik iliğinde üretilir. Ömürleri 120 gündür. Ömrü biten alyuvarlar karaciğer veya dalakta parçalanır.",
            "Trombositler: Kemik iliğindeki büyük hücrelerin parçalanmasıyla oluşur, renksiz ve çekirdeksizdir. 1mm (küp) kanda 150 bin – 400 bin kadar bulunur. Kanın pıhtılaşmasını sağlar. Yaklaşık bir hafta olan ömürlerini tamamladıklarında karaciğer veya dalakta parçalanır.\n" +
                    "\n" +
                    "Akyuvarlar: Savunma hücreleridir. Vücutta enfeksiyon olduğunda akyuvar sayısı artar. Kemik iliği ve lenf bezlerinde üretilen akyuvarların çekirdekleri ve organelleri bulunur. Yalancı ayaklar oluşturarak aktif yer değiştirebilir.\n" +
                    "\n" +
                    "Akyuvarlar granüllü ve granülsüz olmak üzere ikiye ayrılır.",
    };
    public static String populasyon[] = {
            "Kominüte Ekolojisi\n" +
                    "Ekosistemlerin canlı kısmına komünite adı verilir. Her ekosisteme özgü bir komünite bulunur. Örneğin, ormandaki canlıların tümü orman komünitesini oluşturur. Bir komünitede bitki, hayvan ve mikroorganizma türlerinden oluşan binlerce popülasyon bulunabilir. Komüniteler bitki ve hayvan komüniteleri şeklinde olabileceği gibi karma da olabilir.\n" +
                    "\n" +
                    "Komünitede ne kadar çok canlı çeşidi varsa komünitede o kadar büyük olur. Bu yüzden kutuplardaki komüniteler orta enlem komünitelerine göre daha küçüktür. Çevre kirliliğinin komüniteler üzerinde kötü bir etkisi vardır; çünkü çevre kirliliği canlı çeşitliliğini azaltır.\n" +
                    "\n" +
                    "Komüniteler birbirinden tamamen bağımsız değildirler. Komşu komüniteler arasında kesişim(geçiş) bölgeleri vardır. Bu kesişim bölgelerine ekoton adı verilir.\n" +
                    "\n" +
                    "Komüniteyi oluşturan canlılar arasında farklı etkileşimler vardır. Bu etkileşim tipleri şunlardır:\n" +
                    "\n" +
                    "– Rekabet\n" +
                    "– Av-Avcı İlişkisi\n" +
                    "– Simbiyotik Yaşam\n" +
                    "– Süksesyon",
            "Mutualizm: iki ya da daha fazla türün karşılıklı olarak yararlanması sonucu zorunlu olduğu bir ilişki şeklidir. Mantar ve su yosununun oluşturduğu liken birliği, geviş getiren otçullar arası ilişki mutualizme önektir. Türler arasında zorunlu olmayan mutualizm de görülür. Buna gevşek mutualizm denir.\n" +
                    "\n" +
                    "Kommensalizm: Bu yaşam biçiminde beraber yaşayan canlılardan biri, bu beraberlikten fayda sağlarken diğeri etkilenmeden yaşar. Örneğin köpek balığının karın kısmına tutunarak hareket eden vantuzlu balık, köpek balığı avını yerken etrafa saçılan et parçalarıyla beslenir. Köpek balığı bu olaydan olumlu veya olumsuz etkilenmez.\n" +
                    "\n" +
                    "Parazitizm: Bir arada bulunan iki canlıdan birinin diğerine zarar vererek yaşamasıdır. Zarar gören konak yararlanan ise parazitlerdir.",
            "Popülasyon Ekolojisi\n" +
                    "Belirli bir bölgede yaşayan aynı türe ait bireylerin oluşturduğu topluluğa popülasyon denir. Her bir komünite çok sayıda popülasyondan oluşur. Bir ormandaki meşe ağaçları, bir şehirdeki insanlar birer popülasyon örneğidir. Popülasyonu oluşturan bireyler benzer çevre koşullarından etkilenir, bulundukları ortamın besin kaynaklarını ortak kullanırlar.\n" +
                    "\n" +
                    "Popülasyonun yoğunluğu, büyüklüğü, dağılımı ve yaş dağılımı popülasyon dinamiğini meydana getirir.",
            "Popülasyon Yoğunluğu\n" +
                    "Birim alan ya da hacimdeki birey sayısına popülasyonun yoğunluğu denir.\n" +
                    "\n" +
                    "Doğum ve ölüm oranı, içe ve dışa göçler popülasyon yoğunluğunu etkileyen faktörlerdir. Doğum ve içe göçler popülasyon yoğunluğunu arttırır. Ölüm ve dışa göçler popülasyon yoğunluğunu azaltır.\n" +
                    "\n" +
                    "Popülasyona birim zamanda üreme sonucu katılan birey sayısına doğum oranı; popülasyondan birim zamanda ölüm sonucu ayrılan birey sayısına ise ölüm oranı denir.\n" +
                    "\n" +
                    "Doğum ve ölüm oranı ölçüldüğünde elde edilen veriler, popülasyonun büyüklüğünün zaman içinde nasıl değişeceğini tahmin etmemizi sağlar.",
            "Popülasyonun Büyüklüğü\n" +
                    "Belirli bir zaman diliminde, popülasyonu oluşturan birey sayısı popülasyonun büyüklüğünü belirler. Uygun çevre şartlarının bulunduğu ortama yerleşen bir türün, ortamın uygunluğu derecesinde, sayısında artma veya azalma görülür. Çevre şartları ve biyotik faktörler popülasyonun büyüklüğünü denetler.",
            "Popülasyon Büyüklüğü\n" +
                    "Popülasyonlar bulunduğu ortamda sınırsız çoğalamaz. Popülasyon büyüklüğünü rekabet, av-avcı ilişkisi, sıcaklık, yağış, besin v.b faktörler etkiler. Belirli özelliklere sahip bir yaşama ortamında bulunabilecek en fazla birey sayısı taşıma kapasitesini belirler.\n" +
                    "\n" +
                    "Popülasyonda birey sayısı taşıma kapasitesine yaklaştıkça çevre direnci artar, popülasyonun büyüme hızı yavaşlar. Popülasyonun artışını engelleyen ekolojik faktörler çevre direncini oluşturur.\n" +
                    "\n" +
                    "Belirli bir zamanda, popülasyonlarda görülen değişmeler büyüme eğrileri ile açıklanır.",
            "Popülasyon Dağılımı\n" +
                    "Bir popülasyondaki bireylerin belirli bir alandaki yerleşme biçimidir. Popülasyonu oluşturan bireyler temel olarak üç tip dağılım gösterir:\n" +
                    "\n" +
                    "Rasgele dağılım: Çevrenin her köşesinde koşulların aynı olması ve rekabet eğilimi olmayan popülasyonlarda gözlenen dağılımdır. Popülasyonu oluşturan bireyler yaşam için en uygun alanı seçerler.\n" +
                    "\n" +
                    "Düzenli dağılım: Doğada oldukça nadirdir. Zor çevresel şartlarda bireyler arasında yetersiz kaynaklar için rekabet söz konusuysa görülür. Bireyler birbirlerine nispeten eşit uzaklıkta bulunurlar.\n" +
                    "\n" +
                    " Kümeli dağılım: Doğada en sık görülen dağılım biçimidir. Bireyler bir araya gelerek gruplar oluşturur. Örneğin bazı hayvan türleri belirli sayıda bireylerden oluşan gruplar (sürüler) oluşturacak şekilde bir araya gelirler. Doğada en sık görülen dağılım biçimidir. Bireyler bir araya gelerek gruplar oluşturur. Örneğin bazı hayvan türleri belirli sayıda bireylerden oluşan gruplar (sürüler) oluşturacak şekilde bir araya gelirler.",
    };
    public static String evrim[] = {
            "Hayatın Başlangıcı ve Evrim Teorileri\n" +
                    "Bilim adamları uzun yıllardır hayatın nasıl başladığını bulmaya çalışmışlar ve bunun üzerine bir çok hipotez, görüş ve teoriler (Doğal Seleksiyon, Evrimle ile ilgili Görüşleri(Lamarck’ın Görüşleri, Darwin’in Görüşleri), Abiyogenez Hipotezi, Biyogenez Hipotezi, Heterotrof Hipotezi, Ototrof Hipotezi,Panspermia Hipotezi) kurulmuştur.",
            "1.      Abiyogenez (Kendiliğinden Oluş) Hipotezi\n" +
                    "\n" +
                    "Eski Yunan filozofu Aristo canlıların kendiliğinde var olabileceğine, yani cansız maddelerden kendiliğinden ve kısa sürede meydana geldiğine inanıyordur. Ama bu hipotez ileri ki zamanlarda çürütülmüştür.",
            "2.      Biyogenez Hipotezi:\n" +
                    "\n" +
                    "Bu görüş canlının kendinden önceki canlılardan meydana geldiği öne sürer.a",
            "3.      Panspermia Hipotezi:\n" +
                    "\n" +
                    "Bu görüş yeryüzündeki yaşamanın başka bir gezegenden ya da uzaydan geldiğini öne sürer. Günümüzde bu fikri savunanlar vardır. Ama bu görüş ilk canlının nasıl oluştuğu hakkında bir fikir ileri sürmüyor.",
            "4.      Ototrof Hipotezi:\n" +
                    "\n" +
                    "Bu hipoteze göre dünyada ilk meydana gelen canlı ototroftur.Ototroflar hem kendilerinin hem de başka canlıların yaşabileceği besinleri üretebildiği için karmaşık yapıda anlılardır. Bazı bilim adamları böyle karmaşık yapılı bir ototrofun ilk meydana gelen canlı olamayacağı idea ederek bu fikri karşı çıkmışlardır. Ototrofların karmaşık bir yapıda olması için milyonlarca yılın geçtiğini söylüyorlar.",
            "5.      Heterotrof Hipotezi:\n" +
                    "\n" +
                    "Bu hipoteze göre ilk canlı heterotrof bir organizmadır İlk canlı dünyanın geçirdiği uzun süren kimyasal evrim sonucu ortaya çıkan özel koşullarda uzun süren bir zaman diliminde çok basit olarak oluşmuştur.Heterotrof hipotezi Oparin ve Halden tarafından ileri sürülmüştür.İlk atmosferdeki basit gazlar ilk atmosfer koşullarındaki enerjilerle iyonlaşıp birleşerek ilk organik molekülleri oluşturur.\n" +
                    "\n" +
                    "Kanıt : Wöhler deneyi : CO2 + NH3  ÜreMiller deneyi : CH4 , NH3 , H2O , H2 Mor ötesi ve elektrik şarjıyla organik moleküllere dönüşür.Oluşan basit organik moleküller kimyasal yolla birbirini etkileyerek kompleksleşmişlerdir. Kanıt : FOX deneyi; Erime noktasına kadar ısıtılan aminoasitlerden bir çeşit protein elde etmiştir.",
            "EVRİMLE İLE İLGİLİ GÖRÜŞLER:\n" +
                    "Lamarck’ın Görüşleri:\n" +
                    "Biyolojide türlerin değişebileceğini ilk ortaya atan Fransız Buffon ve Lamarck’tır. Bu görüşe göre bitki ve hayvan türleri, çevre şartlarının etkisiyle değişebilmektedir.\n" +
                    "Lamarck; canlıların çevre şartları ile sonradan kazandıkları özellikler ileri nesillere aktarılır. Diğer bir nokta ise kullanma ve kullanmama. Bu görüşe göre canlı bir vücudunun bir parçasını çok kullanırsa gelişir ve kuvvetlenir. ÖR: Zürafalar.Kullanılmayan kısımlar ise zamanla zayıflar, küçülür ve hatta kaybolur.\n" +
                    "Deneyler sonradan kazanılan özelliklerin döllere geçmeyeceğini göstermiştir.ÖR: Bir farenin 20 nesil boyunca kuyruğu kesilmiş ama her seferinde yeni doğan farede kuyruk olmuştur.",
            "Darwin’in Görüşleri:\n" +
                    "Rekombinasyon: Eşeyli üreyen canlılarda farklı gametlerin birleşmesi sonucu yeni döllerin oluşması\n" +
                    "Varyasyon: Bir türdeki bireylerde görülen farklılık ve değişmedir. Kalıtsal varyasyonlar mutasyonla veya eşeyli üremesiyle ortaya çıkar (mayoz döllenme). Vücut hücrelerinde görülen mutasyonlar kalıtsal değildir. Üreme hücrelerinde görülen mutasyonlar kalıtsaldır.\n" +
                    "Kalıtsal olmayan çevresel varyasyonlara modifikasyon denir: ÖR: Kas geliştirmek, bronzlaşmak\n" +
                    "Doğal Seleksiyon (Seçilim): Bir türün ortama uyum sağlayanlarının yaşaması, sağlayamayanların ise yok olurlar.\n" +
                    "Doğal seleksiyonlar sonucu adaptasyonlar ortaya çıkar.\n" +
                    "\n" +
                    "Adaptasyon: Bir organizmanın belirli bir çevrede yaşama ve üreme şansını artıran kalıtsal olan özellik ya da  özellikler topluluğudur.\n" +
                    "Evrenin hammaddesi kalıtsal varyasyonlar, mekanizması ise doğal seleksiyondur.",
    };
    public static String ekosistem[] = {
            "Belli bir bölgede yaşayan ve birbirleriyle devamlı etkileşim halinde olan canlılar ile bunların cansız çevrelerinin oluşturduğu bütüne ekosistem denir. Ekosistem aynı zamanda bir besin ağı ile şekillenmektedir. Ekosistem, küresel ölçekte bir düzeni ifade etmekle beraber yerel ve korunaklı bir sistemin varlığına da atıfta bulunabilir.\n" +
                    "\n" +
                    "Canlıların birbirleriyle ve çevreleriyle olan ilişkisini inceleyen bilim dalına ekoloji denir. Küresel ısınma, çevre kirliliği ve diğer çevresel sorunların ekoloji ile iş birliği içinde çözülmesi mümkündür. Bu yüzden ekoloji gittikçe önem kazanan bir bilim dalı olarak görülmektedir.",
            "Ekosistemin Yapısı ve Ekosistem İle İlgili Kavramlar\n" +
                    "Habitat: Bir organizmanın veya popülasyonun doğal olarak yaşayıp üreyebildiği yere habitat adı verilir. Habitat kısaca organizmanın adresidir. Canlılar özellikle hayvanlar habitatlarını değiştirebilme özelliğine sahiptir. Göçmen kuşlar yazın ve kışın farklı habitatlarda yaşarlar.\n" +
                    "\n" +
                    "Ekolojik Niş: Bir organizmanın yaşadığı ortamda yaptığı işe, göreve ekolojik nişadı verilir. Bir organizmanın ekolojik nişi; bu organizmanın hangi canlılarla beslendiği, hangi canlılar tarafından yenildiği ile çevresinin biyolojik, fiziksel ve kimyasal yapısını nasıl etkilediği gibi özellikleridir.\n" +
                    "\n" +
                    "Ekolojik nişleri çalışkan iki veya daha fazla organizmadan her birinin yaşamak için gerekli kaynağı ele geçirme mücadelesine rekabet denir.",
            "Tür: Ortak bir atadan gelen, çiftleştiğinde verimli bireyler oluşturan canlı topluluğuna tür adı verilir.\n" +
                    "\n" +
                    "Popülasyon: Belirli bir bölgede yaşayan aynı türe ait bireylerin oluşturduğu topluluğa popülasyon denir. Her bir komünite çok sayıda popülasyondan oluşur. Bir ormandaki meşe ağaçları, bir şehirdeki insanlar birer popülasyon örneğidir. Popülasyonu oluşturan bireyler benzer çevre koşullarından etkilenir, bulundukları ortamın besin kaynaklarını ortak kullanırlar.\n" +
                    "\n" +
                    "Komünite: Ekosistemlerin canlı kısmına komünite adı verilir. Her ekosisteme özgü bir komünite bulunur. Örneğin, ormandaki canlıların tümü orman komünitesini oluşturur. Bir komünitede bitki, hayvan ve mikroorganizma türlerinden oluşan binlerce popülasyon bulunabilir. Komüniteler bitki ve hayvan komüniteleri şeklinde olabileceği gibi karma da olabilir.",
            "Biyotop: Komüniteler çok sayıda türden oluşabilirler. Bu canlıların yaşamlarını sürdürebilmek için ihtiyaç duydukları coğrafik alana biyotop adı verilir.\n" +
                    "\n" +
                    "Ekoton: İki komünite arasındaki geçiş bölgelerine ekoton denir. Bu alanlar komşu iki komünitenin de özelliklerine biraz sahip olduklarından tür sayısı, birey sayısı ve sahip olunan özellikler açısından farklılıklar gösterir.\n" +
                    "\n" +
                    "Ekosistem: Canlı ve cansız çevrenin birlikte oluşturduğu bölgeler ekosistem olarak adlandırılır. Ekosistem ekosferin alt birimidir.\n" +
                    "\n" +
                    "Biyosfer (Ekosfer): Belirli fiziksel, kimyasal ve biyolojik özellikleri olan bölgelerden (dağ, çöl, orman, deniz, akarsu gibi) oluşmuştur. Kısaca dünya üzerinde canlıların yaşadığı alanların tümü biyosfer (ekosfer) olarak adlandırılır. Bu alan okyanusların en derin yerinden atmosferin 16 km’lik alanına kadar uzanır.",
            "Besin Zinciri ve Besin Ağı\n" +
                    "Bir komünite içinde, enerjinin taşınabileceği organizmalar dizisine besin zinciri, karmaşık olarak birbirine girmiş çok sayıda besin zincirinin tümüne besin ağı denir.\n" +
                    "\n" +
                    "Besin zinciri hangi hayvanın hangi hayvanı yediğini ve sonuçta nasıl insana gelene kadar büyüdüğünü gösterir. Besin zincirinde canlılar üreticiler tüketiciler ve çürükçüller olarak sınıflandırılır.\n" +
                    "\n" +
                    "Üreticiler bitkiler, tüketiciler hayvanlar ve insanlar, çürükçüller ise besin artıklarını ve üreticilerin kalıntılarını yiyerek temizleyen ve toprağa karışmasını sağlayan bakterilerdir.\n" +
                    "\n" +
                    "Besin zinciri aynı zamanda hayvanların sınıflanmasında ve hangi hayvanın hangisiyle besleneceğinin tespit edilmesinde etkilidir. Bu sayede hangi hayvanın neslinin tükendiği durumlarda besin zincirinin etkileneceği veya hangi hayvanın hangisini yiyeceği bilineceği için hayvansal planlamanın yapılması kolaylaşacaktır.",
            "Madde Döngüleri\n" +
                    "Hayatın devamı için gerekli olan maddelerin ekosistem içinde canlılar ve cansız çevreleri arasındaki dolaşımına ekolojik madde döngüleri denir. Bu döngülerin biyolojik, kimyasal ve jeolojik etmenleri olduğundan biyojeokimyasal döngüler de denir.\n" +
                    "\n" +
                    "Su Döngüsü\n" +
                    "\n" +
                    "Suyun litosfer (taş küre), hidrosfer (deniz ve tatlı sular) ile atmosfer arasındaki hareketine su döngüsü denir.\n" +
                    "\n" +
                    "Okyanus, deniz, göl veya kara yüzeyinde bulunan su kütleleri iklimin etkisi ile su buharına dönüşmektedir. Atmosferdeki hareketlerin etkisi ile yer değiştiren su buharı başka alanlarda yoğunlaşarak yağışa dönüşmekte ve tekrar yüzeye inmektedir.\n" +
                    "\n" +
                    "Su döngüsünde en önemli aşama suyun gaz hale geçmesi olayı yani buharlaşmadır. Atmosferdeki nemim %90’ı okyanus deniz ve göllerden buharlaşma ile sağlanmaktadır.Bitkilerin yüzeyinden su moleküllerinin atmosfere karışması terleme olarak adlandırılmaktadır.\n" +
                    "\n" +
                    "Su buharının gaz halden sıvı hale geçmesi olayı yoğuşma olarak adlandırılır. Önce yoğuşan su buharı, sıcaklığın düşmesiyle yağışa dönüşmektedir. Yeryüzüne inen su kütlesinin yüzeydeki hareketine yüzey akışı, yer altındaki hareketi ise yer altı akışı olarak adlandırılır.",
            "Karbon Döngüsü\n" +
                    "\n" +
                    "Karbon doğada hem mineral biçiminde (kömür, elmas, gaz olarak veya suda çözünmüş durumda karbon dioksit olarak) hem de organik (canlıların yapısındaki karbonhidratlarda, proteinlerde vs.) biçimde bulunur.\n" +
                    "\n" +
                    "İnsanlar, hayvanlar ve bitkiler oksijenli solunum yaptıklarında atmosfere CO2 gazı verirler. Kömür, petrol ürünleri gibi fosil yakıtların yakılması ve orman yangınları da atmosfere CO2 salınmasını sağlar. Bu CO2 fotosentez yapan yeşil bitkiler tarafından alınır ve besin üretiminde kullanılır. Böylece CO2 deki karbon yeniden canlılara geçer bu canlıların ölmesiyle toprağa karışan karbon fosil yakıtların oluşmasına neden olur. Yine deniz ve okyanuslarda çözünen CO2 kireç taşı oluşumuna neden olmaktadır; fotosentez ve solunum olayları deniz ve okyanuslarda da gerçekleşir.",
            "Azot Döngüsü\n" +
                    "\n" +
                    "Atmosferdeki azotun canlılar tarafından kullanımı ve tekrar atmosfere dönmesi olayına azot döngüsü denir.\n" +
                    "\n" +
                    "Azot, canlılar için en önemli yapı maddesi olan proteinlerin yapısında bulunduğu gibi ATP, nükleik asit ve vitamin gibi organik maddelerin yapısına da katılır. Azot bağlayıcı bakteriler, havadaki azot gazını bitkilerin kullanabileceği azot\n" +
                    "tuzlarına dönüştürür.\n" +
                    "\n" +
                    "Bitkiler topraktan aldıkları nitrat (NO3 —) gibi azot tuzlarını fotosentez tepkimelerinde kullanarak organik besinleri (amino asit gibi) üretirler. Hayvanlar ise azot ihtiyaçlarını beslenme yoluyla bitki ve diğer hayvanlardan karşılarlar.\n" +
                    "\n" +
                    "Ölü bitki ve hayvanlardaki ya da organizmaların atıklarındaki azotlu organik bileşiklerin ayrıştırıcılar tarafından parçalanması ile amonyak (NH3) ya da amonyum (NH4 +) iyonları oluşur.\n" +
                    "\n" +
                    "Amonyak ve amonyum iyonlarının kemosentetik bakterilerin faaliyeti sonucunda nitrata (NO3 —) dönüştürülmesine nitrifikasyon denir.   Toprakta bulunan nitrit ya da nitratın bakteriler tarafından atmosferdeki azot\n" +
                    "gazına dönüştürülmesine denitrifikasyon denir.",
            "Oksijen Döngüsü\n" +
                    "\n" +
                    "Oksijen canlıların besin üretimi için kilit önem taşımaktadır. Oksijen atmosferde üç şekilde bulunmaktadır. Bunlar atomik oksijen (O), moleküler oksijen (O²) ve ozon (O³)’dur.\n" +
                    "\n" +
                    "Moleküler oksijen solunum için gereklidir. Ayrıca oksijen hidrojen, sülfür, karbon ve fosfor gibi maddelerle bileşim halinde gelebilmektedir. Ozon, Güneş’ten gelen ultraviyole ışınlarını tutmaktadır.Oksijenin en önemli kaynağı fotosentez yapan bitkilerin oluşturduğu oksijendir. Ayrıca atmosferdeki su molekülleri fotoliz yoluyla ayrışarak oksijen üretimine katkıda bulunmaktadır.\n" +
                    "Oksijen canlı solunumu, yanma ve organik maddelerin çürümesi esnasında tüketilmektedir. Oksijen oranının ölçülebilir miktarda değişim olmadığı için oksijen döngüsünün denk kapandığı söylenebilir.",
            "Ekosistemi Etkileyen Faktörler\n" +
                    "Ekologlar, canlılar üzerinde etkili olan faktörleri abiyotik ve biyotik faktörler olarak ikiye ayırır.\n" +
                    "\n" +
                    "Abiyotik Faktörler (Cansız Varlıklar)\n" +
                    "\n" +
                    "Abiyotik faktörler, canlıların yaşamlarını devam ettirebilecekleri çevresel koşulları ifade eder.\n" +
                    "\n" +
                    "– Işık, iklim, sıcaklık, su, ortam pH’sı, toprak ve mineraller canlıları etkileyen abiyotik faktörlere örnek olarak verilebilir.\n" +
                    "– Her canlı türü için abiyotik faktörlerin alt ve üst sınırları vardır. Bu iki sınıra tolerans sınırları denir. Tolerans sınırları arasında kalan aralığa ise tolerans (hoşgörü) aralığı adı verilir.",
            "Biyotik Faktörler (Canlı Varlıklar)\n" +
                    "\n" +
                    "Bir ekosistemde bulunan canlı varlıkların hepsine biyotik faktör denir. Biyotik faktörler ekolojik nişlerine göre üreticiler, tüketiciler ve ayrıştırıcılar olmak üzere üçe ayrılır. Ekosistemde ki canlılığın devamı biyotik faktörler arasındaki ilişkinin devamlılığına bağlıdır.\n" +
                    "\n" +
                    "Üreticiler: İnorganik maddeleri organik maddelere dönüştürerek kendi besinini üreten canlılara üretici (ototrof) canlılar denir.\n" +
                    "Güneş enerjisini kullanarak kendi besinini üreten canlılara fotoototrof denir. Bitkiler, algler, öglena, bazı bakteriler ve arkeler bu canlılara örnek olarak verilebilir. İnorganik maddelerin oksidasyonu sırasında açığa çıkan kimyasal enerji yardımıyla kendi besinini üreten canlılara kemoototrof denir.\n" +
                    "\n" +
                    "Tüketiciler: Kendi besinini üretemeyen, bulundukları ortamdan hazır alan canlılara tüketici (heterotrof) canlılar denir. Hayvanlar ve mantarların tamamı bu gruba girer. Ayrıca bakteri ve protistlerin çoğu da tüketici olarak beslenir.\n" +
                    "\n" +
                    "Ayrıştırıcılar: Organik atıkları inorganik maddelere çevirerek, yeniden ototrofların kullanımına sunarlar. Bu yüzden madde döngülerinde önemli bir göreve sahiptirler. Saprofit olarak da adlandırılan ayrıştırıcıların en önemli örneklerini mantarlar, bazı\n" +
                    "bakteriler, toprak solucanı vb. canlılar oluşturur",
    };
    public static String felsefekonusu[] = {
            "Felsefe Yunanca Philia ve Sophia kelimelerinden meydana gelen bilgelik sevgisi anlamında bir kelimedir.\n" +
                    "\n" +
                    "İlk defa Yunanlı filozof Pythagoras, insanın bilgeliğe ulaşamayacağını ancak onu sevebileceğini söyleyerek kendisine “Ben filozofum” dermiş. Philiasophia önce Latince’ye oradan diğer Avrupa dillerine, daha sonra Arapça’ya ve Türkçe’ye Felsefe olarak geçmiştir.",
            "Felsefe terimi, gerçek anlamını Platon ve Aristoteles felsefesinde bulur. Aristo, felsefeyi “Varolanların ilk temellerini ve\n" +
                    "ilkelerini araştıran bir bilgidir.” şeklinde tanımlar.\n" +
                    "\n" +
                    "Ayrıca felsefe;\n" +
                    "– İnsanın içinde yaşadığı evreni anlama uğraşıdır.\n" +
                    "– Hem sağlam bilgi üretme hem de ahlaklı ve mutlu yaşama çabasıdır, şeklinde tanımlanmıştır.",
    };
    public static String bilgifelsefesi[] = {
            "Epistemoloji ya da bilgi felsefesi, bilginin doğası, kapsamı ve kaynağı ile ilgilenen felsefe dalıdır.\n" +
                    "\n" +
                    "Akıl ve sezgi gibi yetiler gerçekten insan zihninde var mıdır? Varsa, görünüşlerin ötesinde kalan varlığı bilmemizi sağlayabilirler mi? türünden sorular bilgi felsefesinin konusunu oluşturur.\n" +
                    "\n" +
                    "Bilgi kuramının temel kavramları :\n" +
                    "\n" +
                    "Doğruluk : Doğruluk, bilginin, bilgisi edinilen şeyle tam uygunluğunu dile getirir. Buna göre doğruluk; algılar, kavramlar ve\n" +
                    "bilimsel kuramlarla nesnel gerçek arasındaki uygunluktur.\n" +
                    "\n" +
                    "Gerçeklik (Realite) : Varlığın, varoluş tarzıdır. Bilinçten bağımsız olarak var olandır.\n" +
                    "\n" +
                    "Temellendirme : Ortaya atılan bir soru ya da ileri sürülen bir sav için dayanak, gerekçe, temel bulma işidir.",
            "Epistemoloji’de Bilginin Doğruluk Ölçütleri\n" +
                    "Uygunluk:Doğruluk,düşünce ile nesne arasındakş tam uygunluktur.Bilginin konusu olan nesnesine uygunluğudur.\n" +
                    "\n" +
                    "Tutarlılık:Bir bilginin veye önermenin daha önce kabul edilmiş doğru bilgi ve önermelerle çelişmemesidir.\n" +
                    "\n" +
                    "Tümel Uzlaşım: Bir bilgi veya önermenin doğruluğu hakkında herkesin veya çoğunluğun aynı düşüncede birleşmesidir.",
            "Apaçıklık: Bir bilgi veya önermenin hem açık ve seçik hemde kuşku duyulmayan bir açıklıkta olması durumudur.Bu tür bilgiler sezgisel bir kavrama ve çıkarımla elde edilir.\n" +
                    "\n" +
                    "Açık Bilgi: Bir bilgi veya düşüncenin bir bütünlük içinde tutarsızlık içermeden kavranmasıdır. Örneğin,diş ağrısının hissedilip bilinmesi açık bilgidir.\n" +
                    "\n" +
                    "Seçik Bilgi: Bir bilgi veya önermenin bir başka bilgi,önerme ile karıştırılmamasıdır.\n" +
                    "\n" +
                    "Yarar: Bir bilgi veya önerme yararlı,uygulanabilir sonuçlar veriyorsa doğrudur.Yani işe yarar bilgi doğrudur.",
            "Epistemoloji’de Bilgi Türleri\n" +
                    "Gündelik Bilgi: Günlük yaşam ve deneyimler sonucu elde edilen bilgi türüdür." +
                    "Dini bilgi: Tanrıyı ve Tanrı karşısında evrenin ve insanın yerini, görevini anlatan bilgilerin tümüdür. Dogmatiktir. Kaynağı bakımından ilahidir.\n" +
                    "\n" +
                    "Sanatsal bilgi: Sanat; insanin, güzeli arama, bulma veya yaratma sürecini anlatan bir etkinliktir. Sanat bilgisinde özneyi nesneye yönelten “güzellik” kaygısıdır. Sanatçı nesnesine yönelerek onu algılar ve kendine özgü bir biçimde ifade eder. Öznel ve duygusaldır.\n" +
                    "Sezgilere yeteneğe ve hayal gücüne dayalıdır. Yaratıcılık esaslıdır. Ürünleri somuttur.\n" +
                    "\n" +
                    "Bilimsel bilgi: Bilimsel bilgi, bilimsel yöntemler ile elde edilen bilgidir. Bilimsel yöntem akıl, deney ve gözleme dayalıdır. Bilimsel bilgi birikimli olarak ilerler. Nesneldir, akla ve deneye dayanır. Sistemli ve sonuçları kesindir. Sonuçları formüle edilebilir. Olgusaldır.\n" +
                    "\n" +
                    "Teknik bilgi: Teknik bilgi, gündelik ve bilimsel bilginin pratiğe dönüştürülmesidir. Amacı insan yaşamını kolaylaştırmak. İnsana fayda sağlamak.\n" +
                    "\n" +
                    "Felsefi bilgi: Felsefe; varlık, bilgi, gerçek, adalet, güzellik, doğruluk, akıl ve dil gibi konularla ilgili genel ve temel sorunlara ilişkin yapılan çalışmalar sonucunda elde edilen bilgidir. Öznel ve kümülatiftir. Eleştiriye açıktır. Kendi içinde tutarlı ve çelişkisizdir. Sonuçları kesin değildir. Varlığı bütün olarak ele alır. Olgusal değildir. Sorgulayıcı ve şüphecidir.",
            "Septisizm: Kuşkuculuk, septisizm, veya skeptisim; her tür bilgi savını kuşkuyla karşılayan, bunların temellerini, etkilerini ve kesinliklerini irdeleyen, ayrıca aklın kesin bir bilgi elde edemeyeceğini, hakikate erişilse dahi sürekli ve tam bir şüphe içinde kalınacağını, mutlak`a ulaşmanın mümkün olmadığını savunan felsefi görüştür",
            "Sofizm: Sofistler her şeyin merkezine insanı aldıklarından dolayı görecelilikten bahsederler. Bu nedenle insanların hepsinin üzerinde birleşeceği bir bilginin olamayacağını savunurlar. Sofistlerin en ünlülerinden biri Protagoras’tır. O’na göre ‘İnsan her şeyin ölçüsüdür’. ",
            "Akılcılık (Rasyonalizm): Akılcılık, bilginin kaynağının akıl olduğunu; doğru bilginin ancak akıl ve düşünce ile elde edilebileceği tezini savunan felsefi yaklaşımdır. Bu yaklaşıma göre deney yolu ile elde edilen bilgi kesin bilgi değildir, geçicidir. İnsan duyum ve algıları geçici, doğruluğu kesin olmayan bilgiler verir. ",
            "Empirizm (Deneycilik): Deneycilik, bilginin duyumlar sayesinde ve deneyimle kazanılabileceğini öne süren yaklaşımdır. Deneyci yaklaşıma göre insan zihninde doğuştan bir bilgi yoktur. Bu nedenle akılcılık yaklaşımına karşıdır. Akılcılığın insan aklında doğuştan ilkeler varolduğu varsayımına karşıdır. Doğru bilgi duyular vasıtasıyla deney yolu ile elde edilebilir. ",
            "Kritisizm (Eleştiricilik): Bu akımda temel amaç Rasyonalizm ve Empirizm’i birleştirip doğru bilgiye ulaşmadır. Akımın en önemli temsilcisi Kant’dır.",
            "Pozitivizm (Olguculuk): Pozitivizm, olguculuk her iki felsefi düşünceye verilen addır. Her iki düşüncenin de teoloji ve metafizik içermeyen, sadece fiziksel veya maddi dünyanın gerçeklerine dayanan bilim anlayışı vardır.",
            "Analitik Felsefe: Felsefeyi düşünsel bir etkinlik olmaktan çıkarıp bir dil analizi olarak algılayan felsefi akımdır. Bilimlerin dilini çözümlemeye ve onların kavram yapısını araştırmaya öncelik verilir. Ludwig Wittgenstein akımın önde gelen temsilcilerindendir.",
            "Entüisyonizm (Sezgicilik): Entüisyonizm veya sezgicilik felsefi bir kavram olarak sezgiye akıl, zihin ve soyut düşünme karşısında hem öncelik, hem de üstünlük tanıyan felsefe akımıdır. Henri Bergson akımın kurucusudur, bu nedenle kimi zaman felsefe tarihinde Bergsonculuk olarak adlandırılması da söz konusudur. Sezgiciliği savunan İslam filozofu ise Gazali’dir",
            "Pragmatizm (Faydacılık): Bu yaklaşımda teoriden çok pratiğe önem verilir. Pragmatizmin bilgi felsefesine yaklaşımı insana fayda veren bilgilerin doğru bilgi, fayda vermeyenlerin ise yanlış bilgi olduğudur. Başlıca temsilcileri W.James ve J.Dewey’dir",
    };
    public static String bilimfelsefesi[] = {
            "Bilim felsefesi, bilimin ne olduğunu, bilimsel kuramın özgül yapısını, bilimsel bilginin epistemolojik statüsünü, bilimsel yöntemin (ya da yöntemlerin) anlamını, bilim alanı ve bilimsel bilginin nesnesini, bilimin gelişiminin anlamını, özet olarak bir bütün bilimin konumu, gelişimi ve iç-yapısını değerlendiren, bunu kuramsal düzlemde ortaya koymaya çalışan felsefe bölümüdür.",
            "Ürün olarak bilim : Bu yaklaşım, bilimi anlamak, bilim diye ortaya konmuş eserleri (ürünleri) ele alır ve onları tarihsel\n" +
                    "gelişimi içinde anlamaya çalışır. Bunun yolunu da bilim eserlerini mantık açısından çözümlemekte görür. Bilimsel önermeleri\n" +
                    "mantık aracılığıyla çözümlemek isteyen yaklaşıma mantıkçı ampirizm ya da neo pozitivizm denir. En önemli temsilcileri Hans\n" +
                    "Reichenbach ve Rudolf Carnap’tır. Bunlara göre bir önermenin anlamlı olabilmesi için ya doğrudan olgusal bir dille ya da\n" +
                    "sonuçta olgusal bir dilin kısaltılması şeklinde ifade edilmiş olması gerekir.",
    };
    public static String varlıkFelsefesi[] = {
            "Ontoloji ya da varlık felsefesi, temel sorunu varlık olan felsefi disiplin. Varlık ya da varoluş ile bunların temel kategorilerinin araştırılmasıdır. “Varlık” ve “varoluş” ayrımını; “Varlık vardır” ve “Varlık yoktur” fikirlerini tartışır.",
            "Bilim açısından varlık: Bilim var olan yani olgusal olan maddeleri inceler. Bilim varlık var mıdır gibi sorularla ilgilenmez. Bilim varlığın var olduğunu ön kabul eder. Ayrıca bilim varlığı Felsefe’de olduğu gibi bir bütün olarak değil de parçalara ayırarak inceler.",
            "Felsefe açısından varlık: Felsefe varlığın olup olmadığı, bilinip bilinemeyeceği gibi sorularla uğraşıp bunları kendi içinde tutarlı ve çelişkisiz olma şartıyla cevaplar. Felsefe varlık problemlerini bir yöntem dahilinde değil de saf düşünme ve akıl yoluyla cevaplamaya çalışır. Felsefe varlığı bütün olarak kabul eder ve buna göre çalışmalarını yapar. Felsefe’de varlık sorunu evreni açıklama çabalarıyla başlamıştır.",
            "Ontoloji açısından varlık: Yunanca “Onto” kelimesi, varlık demektir. “Loji” ise bilim, bilgi demektir. Ontoloji; var olanın, varlığın bilimi anlamına gelir. Varlığın nedenlerini, temel ilkelerini ele alan felsefedir.",
            "Metafizik açısından varlık:  Metafizik; tarih boyunca bilimin ele alamadığı konuları inceleyen, daha çok çözümlenmemiş konularla ilgilenen, tüm varlıkların ilk nedenlerini araştıran; varlık, bilgi, ahlak, sanat, din, adalet gibi tüm konuları bütüncül ve akılcı bir yaklaşımla ele alan felsefe dalıdır.",
            "Nihilizm : Kendisinden kuşku duyulamayan hiçbir şeyin olmadığını öne süren ve maddesel gerçekliğin varlığını reddeden\n" +
                    "bir görüştür. En önemli temsilcileri Gorgias ve Friedrich Nietzsche’ dir.",
            "Taoculuk : Dış dünyadaki varlıklar var olmasalar bile gerçekten var olan bir varlıktan söz edilebilir. Bu Tao’dur. Tao, evrenin\n" +
                    "düzenidir; bütün olayların kendisinden çıktığı “sonsuz öz” dür. Gerçek tüm çeşitliliğine rağmen tektir. Olaylar dış\n" +
                    "görünüşlerden başka bir şey değildir, her şey görecelidir, aldatıcı dünya varlıktan yoksundur. Taoculuğun kurucusu Lao\n" +
                    "Tse’dir.",
            "Realizm : Dış dünyanın gerçekten var olduğunu ileri süren öğretidir. Bu öğretiye göre dış dünya bizden bağımsız ve nesnel\n" +
                    "olarak vardır",
            "Varlık ideadır: Varlığın ilk ve en önemli öğesinin idea yani düşünce olduğunu savunan görüştür. Bu anlayışı savunan filozoflar zihinden bağımsız bir dünya olmadığını savunurlar. Platon İdealizm’in kurucusudur ve varlık sorununun çözümünü iki evren anlayışıyla açıklar (dualizm-ikicilik\n" +
                    "\n" +
                    "Başlıca temsilcileri: Sokrates, Platon, Aristoteles,Hegel.",
            "Varlık maddedir: Maddecilik ya da materyalizm her şeyin maddeden oluştuğunu ve bilinç de dahil olmak üzere bütün görüngülerin maddi etkileşimler sonucu oluştuğunu öne süren, a priori olan hiçbir metafiziksel kavram kabul etmeyen felsefi kuramıdır. Bir diğer deyişle madde, varolan tek tözdür. Maddecilik “fiziksel maddenin tek veya esas gerçeklik olduğu” yönündeki kuramdır.\n" +
                    "\n" +
                    "Başlıca temsilcileri: Demokritos, Hobbes, Karl Marx, La Mattire’dir",
            "Varlık hem idea hem maddedir: Descartes’e göre iki cevher vardır ve bunlar ruh ve maddedir. Ona göre ruh düşünen madde ise yer kaplayan cevherdir. Descartes’in görüşünü benimseyenlere ‘kartezyen’ denir.\n" +
                    "\n" +
                    "Varlık fenomen olarak vardır: Varlık görüngü (fenomen) olarak vardır. Başlıca temsilcileri: Descartes",
    };
    public static String ahlakfelsefesi[] = {
            "Etik, felsefenin ahlaki değerlerle ilgili olan alt dalına karşılık gelir. Antik Yunanca “ethos” (karakter, adet olan hayat tarzı) sözcüğünden türemiştir.\n" +
                    "\n" +
                    "Ahlak, bir topluluk içinde yaşayan insanların davranışlarını ve birbirleriyle olan ilişkilerini düzenlemek amacıyla oluşturulmuş eylem kuralları, normlar silsilesi ve değer sistemidir. Ahlak bize belirli bir toplulukta neyin doğru, neyin yanlış olduğunu söyler; toplumlar arasında benzer ahlaki kurallar olabileceği gibi farklılıklar da söz konusudur.",
            "Metaetik\n" +
                    "\n" +
                    "Metaetik, ahlak felsefesinin özüne dair tartışmaları içeren alandır. Ahlak metafiziği, epistemolojisi ve psikolojisi metaetiğin kapsamına girmektedir. Ahlak kültürel midir, yoksa insanlardan bağımsız ahlaki gerçekler var mıdır? İnsanları ahlaki davranmaya ya da davranmamaya motive eden şey nedir? Ahlaki bilgilere nasıl erişebiliyoruz? Ahlaka dair uzlaşmazlıkların felsefi imaları nelerdir? Ahlaki nitelikler doğal niteliklere indirgenebilir mi yoksa kendine özgü, her şeyden farklı şeyler midir? Bu gibi soruların hepsi metaetik altında tartışılır.",
            "Normatif Etik \n" +
                    "\n" +
                    "Etiği ortaya çıkaran şey Sokrates ve Platon gibi filozofların insan hayatının amacı ve erdemli bir hayatın niteliği üzerinde düşünmeye başlamaları olmuştur.\n" +
                    "\n" +
                    "Bu filozoflar, Sofistlerin genel geçer ahlaki değerlerin olmadığı ahlaki bir göreceliği savunduğu dönemde evrensel denebilecek ahlaki değerleri var olduğunu ortaya koymaya çalışmışlardır.",
            "Pratik (Uygulamalı) Etik\n" +
                    "\n" +
                    "Pratik etik alanı, etiğin soyutlamalardan kurtulup somut düzleme indiği alandır. Burada direkt olarak eylemlerin kendisinin etik olup olmadığı tartışılmaktadır. Pratik etiğe konu olan eylemler sınırsızdır; biz bu yazıda örnek olması bakımından üç tanesini değerlendireceğiz. Kürtaj, hayvan hakları (veganizm) ve idam.",
    };
    public static String sanatFelsefesi[] = {
            "Estetik olaylar da, tıpkı bilgi olayında olduğu gibi, bize süje ile obje arasındaki ilgiyi gösterir. Estetik olay da aynı şekilde estetik olarak algılayan süje ile bu süjenin estetik algı ile kendisine yöneldiği varlık, doğa ya da sanat eseri dediğimiz obje arasındaki ilgidir.",
            "Estetiğin Temel Soruları\n" +
                    "– Güzellik nedir?\n" +
                    "– Güzel olarak nitelediğimiz şeyi güzel yapan faktörler nelerdir?\n" +
                    "– Güzelllik, onu algılayan özneden bağımsız bir değer midir?\n" +
                    "– Sanat nedir?\n" +
                    "– Sanat eserine duyulan estetik tepkiyle, doğadaki güzelliğe duyulan estetik tepki arasında ne fark vardır?\n" +
                    "– Sanat eseri nasıl oluşmuştur?",
            "Taklit Olarak Sanat\n" +
                    "\n" +
                    " Bu görüşe göre, sanat eserinde gördüğümüz, sanatçının algıladığı şeyleri taklit ederek bize yansıtmasıdır. Sanatçı, doğanın güzelliğini eserinde ne kadar aslına uygun olarak yansıtabilirse, eseri o kadar güzel olarak yargılanır. Bu nedenle bu kurama yansıtma kuramı da denir. Yansıtma kuramı İlkçağın idealist filozofu Platon’a kadar geri gider. Aristoteles’de sanatı bir taklit olarak görür. şair dil, müzikçi ses, ressam da boya aracıyla nesneleri taklit eder, onları yansıtır.",
            "aratma Olarak Sanat \n" +
                    "\n" +
                    "Sanat eseri, sanatçının kendi yaratıcı gücü, yeteneği ve coşkusunun oluşturduğu estetik objedir. Doğa kendi başına güzel değildir. Nesneler dünyası tinsellikten yoksun, bir madde dünyasıdır. Yaratma olayı, sanatçının algıladığı maddi varlığa duygu, düşünce ve hayal gücünü katması olayıdır. Bir sanat eseri, sanatçının kendinden kattığı değerlerle anlam kazanır.",
            "Oyun Olarak Sanat\n" +
                    "\n" +
                    "Sanat ile oyun arasında daima bir benzerlik görülmüştür. Çünkü, her iki etkinliğin de ereğinin kendinde olmasıdır. Oyun oynayan bir çocuk için oyunun dışında bir başka erek , bir başka dünya yoktur, çocuk oynamak için oynar. Bu görüşe göre, sanat etkinliğini bir oyun gibi değerlendirmek gerekir. ",
            "Güzellik Problemi\n" +
                    "\n" +
                    "Güzellik, hemen her filozofta farklı biçimde tanımlanmıştır.\n" +
                    "\n" +
                    "Platon, güzelliği bir idea olarak görür. Platon’a göre sanat, güzel ideasını taklit etme olduğundan, yapılan eser ne kadar ideaya yaklaşırsa o oranda güzel olur.\n" +
                    "\n" +
                    "Aristoteles’e göre güzellik ahenktir, düzendir, sınırdır. İnsanın algı sınırlarını ve kavrayış gücünü aşan çok büyük bir şey, güzel olamaz.\n" +
                    "\n" +
                    "Plotinos’a göre güzellik, Tanrısal aklın evrendeki ışımasıdır. Madde, Tanrısal akıldan (İdeadan) pay almazsa çirkindir.\n" +
                    "\n" +
                    "Hegel’e göre güzellik, Mutlak Ruh’un duyularla kavranabilen görünüşleridir. Yani her şeyin ilkesi olan İdea’nın duyulara görünüşüdür.\n" +
                    "\n" +
                    "Kant’a göre güzel, çıkar gözetmeksizin hoşlanmanın nesnesidir. Güzellikte, pratik amaç gütmeyen bir düzen vardır.",
    };
    public static String dinFelsefesi[] = {
            "Din felsefesi, değişik dinlerin farklılıklarını, ortaya çıkışlarında ki temel faktörleri incelemeyi ve kapsamlı bir şekilde tartışmayı amaçlar. Bir başka ifadeyle din felsefesi, dinin felsefe açısından ele alınması ve bir düşünme, bir tartışma ve bir değerlendirme konusu yapılmasıdır.",
            "Dine felsefi yaklaşım her şeyden önce din gerçeğini kabul eden ve anlamladırmaya çalışan bir yaklaşımdır. Dini dinin temel kavramlarını ve inançlarını değerlendirmek, din gerçeğine eleştirel bir gözle yaklaşmakla olur.",
            "eoloji İle Din Felsefesinin Farkı\n" +
                    "Teoloji (İlahiyat), dini konu edinir; amacı dini temellendirmek ve açıklamak, böylece inananların inançlarını güçlendirmektir.\n" +
                    "\n" +
                    "Teoloji, doğrudan doğruya inanca dayanır. Dini yargıları hiç bir şekilde sorgulamaz; bu yönüyle dogmatiktir. Oysa din felsefesi, özgür düşünmeyi, nesnel olmayı ve sorgulamayı temel alır.\n" +
                    "\n" +
                    "Teoloji belirli bir dini ve bu dine ait problemleri ele alır. Dolayısıyla Yahudi teolojisinden, Hıristiyan teolojisinden söz edilebilmektedir. Din felsefesi ise dini veya dinleri genel olarak ele almaktadır.",
            "Din Felsefesinin Temel Kavramları\n" +
                    "Tanrı: Evrende var olan herşeyin yaratıcısı olduğuna ve tekliğine inanılan yüce varlık.\n" +
                    "Mucize: Mucize, insan aklının ölçülerini aşan, doğa yasalarının dışına çıkın, düşünce ilkelerinde değil de, dini inanca dayanan bir oluştur.\n" +
                    "Vahiy: Peygamberlere gelen ilahi ilham anlamına gelir. İlahi bir nitelik taşıyan ana düşünce, vahiy yoluyla\n" +
                    "peygamberlere bildirilir.\n" +
                    "Peygamber: Peygamber, her dinde Tanrı’nın buyruğnu insanlara bildiren elçidir.\n" +
                    "İman: Dinin ortaya koyduğu doğrulara inanmaya denir.\n" +
                    "İbadet: Tanrının buyruklarını yerine getirmeye ibadet adı verilir.\n" +
                    "Yüce: İncanca ölçüleri aşan, sınırlanamayan, önünde eğinilen üstün varlık anlamına gelir.\n" +
                    "Kutsal: Din açısından saygıya değer olan, Tanrı ya da peygamberler tarafından kutsanmış olandır.",
            "Tanrı’nın varlığını kabul edenler\n" +
                    "\n" +
                    "a) Teizm\n" +
                    "Bütün varlıkların yaratıcısı olan bir Tanrı’nın var olduğuna inanmaktır. Bu yaklaşıma göre Tanrı, Evren ve canlılar ile sürekli ilişki içerisindedir. Teizm’e göre Tanrı vardır ve Tanrı’nın insanları doğru yola sokmak için insanlığa göndermiş olduğu peygamberler ve dinler vardır. Teizm dar anlamda tek bir Tanrı’ya inanmak anlamına gelen monoteizme eşitlenir. Monoteizm tek bir Tanrı’ya inanmak, Politeizm ise birden fazla Tanrı’ya inanma anlayışıdır. ",
            "Deizm\n" +
                    "Deizm iki temel ilkeye dayanır. Tanrı vardır, ama Evren’e hiçbir müdahalesi olmayan bir varlıktır. İnsan akla ve bilime güvenmelidir. İnsan Evren’i akıl ve bilimin ilkelerine göre açıklayabilir. Bu sebeple Deizm’de Tanrı dışında Teizm’de yer alan dinsel kavramların hiçbiri yer almaz. Aristotales, J. Locke, J.J. Russeau, Voltaire önemli temsilcileridir.",
            "Panteizm\n" +
                    "Tanrı-Evren ikiliğini reddeder, Tanrı’nın her şeyi içerdiğini dolayısıyla doğanın ve insanın bağımsız varlıklar olmadığını öne süren bir yaklaşımdır. Panteizm’e göre Tanrı ve Evren bir bütündür. Spinoza, G. Bruno temsilcileridir.",
            "Panenteizm\n" +
                    "Panteizm’de olduğu gibi Evren’in kendisinin Tanrı olduğunu, panteizmden farklı olarak ilk devindirici olan tanrının Evren ve tüm varlıkları özünden yarattığı ve Evren’e aşkın, Evren’in bilincinde mutlak ve değişmez bir varlık olarak egemen olduğu inancıdır. Panteizmde her şey Tanrı’dır. Panenteizmde ise, her şey Tanrı’dan sudur etmiştir (oluşmuştur). Ruhun tek amacı, oluştuğu Tanrı’ya dönmektir. Bunun da yolu tek evrensel yasa olan evrim/tekamül’den geçmektir.",
            "Ateizm (Tanrıtanımazlık): Tanrı’nın varlığını reddedenlerin görüşleri ateizm kavramı ile açıklanır. Ateistler tanrının varlığını reddederken şu kanıtları kullanırlar:\n" +
                    "\n" +
                    "Kötülük Kanıtı: Tanrı olsaydı kötülük olmazdı. Evren’de bir kötülük mevcutsa tanrının varlığından söz edilemez.\n" +
                    "\n" +
                    "Madde Kanıtı: Madde olduğuna göre maddi olmayan bir tanrının varlığından söz edilemez.\n" +
                    "\n" +
                    "Toplum Kanıtı: Hayata düzen veren tanrı değil toplumun kendisidir şeklindeki düşünceyi kabul ederek tanrıyı reddeden anlayıştır.",
            "Agnostisizm (Bilinemezcilik): Bizim tanrıya ilişkin bir bilgiye sahip olamayacağımızı, dolayısıyla var olduğunun da var olmadığının da kanıtlanamayacağını savunan öğretinin adıdır.",
    };
    public static String siyasefFelsefesi[] = {
            "Siyaset (Politika Latince) dilimize Arapça’dan geçmiş bir sözcüktür ve devlet ve toplum yönetimi ile ilgili tüm etkinlikleri ifade eder.Bu alanı, hem siyaset bilim hem de siyaset felsefesi inceler.Siyaset bilim devlet biçimlerini, siyasi olguları ve süreçleri ele alır,betimler ve olanı olduğu gibi inceler. Siyaset felsefesi ise varolan siyaset üzerine bir sorgulama ve akıl yürütme etkinliğidir.Siyaset felsefesi ideolojiler üstü bir tutumla olması gerekeni araştırır.",
            "Siyaset Felsefesinin Temel Kavramları\n" +
                    "Birey: Toplumda yaşayan insanlardan her biri\n" +
                    "Toplum: Bireylerden oluşan sosyal grup\n" +
                    "İktidar: Yönetimi elinde bulundurma gücü\n" +
                    "Devlet: Toplum yönetimi ile ilgili en geniş kurum\n" +
                    "Yönetim: Devlet ve Toplumu yönetme\n" +
                    "Meşruiyet: Hukuka, yasaya uygun olma\n" +
                    "Egemenlik: Devletin iktidar gücünü kullanabilmesi\n" +
                    "Hak: Bireyin yasaya uygun isteği\n" +
                    "Hukuk: Toplumsal yaşamı düzenleyen yazılı kuralların bölümü\n" +
                    "Yasa: Yaptırım gücüne sahip yazılı kurallar\n" +
                    "Bürokrasi: Devlet işlerinin yürümesini sağlayan hiyerarşik biçiminde örgütlenmiş görev yapanlardan oluşan yapı.\n" +
                    "Sivil Toplum: Toplum yönetiminde, iktidarın etki alanı dışında bulunan ve kendi dinamiğini oluşturarak varlığını sürdüren toplum olanı.",
            "Egemenlik Nedir? Kaç Tür Egemenlik Vardır?\n" +
                    "\n" +
                    "Egemenlik yönetme gücünü kullanmaktır. Temel olarak 6 farklı egemenlik türü vardır.\n" +
                    "\n" +
                    "a.) Monarşik Egemenlik: Yöneticinin tek kişi olduğu yönetim biçimidir. Yönetici gücünü ailesi ve kendisinden alır. Ağzından çıkan her söz kanundur.\n" +
                    "\n" +
                    "b.) Oligarşik Egemenlik: Yöneticilerin bir grup zümreden oluşturduğu yönetim biçimidir. Yöneticiler içinde bulundukları zümrenin çıkarlarını ön plana alırlar. Bu nedenle halk tarafından benimsenmez. İşi iyi bilen uzmanlardan oluşması bu yönetim biçiminin artısıdır.\n" +
                    "\n" +
                    "c.) Teokratik Egemenlik: Yöneticilerin din adamlarından ya da dini özellikleri taşıdığına inanılan yöneticilerden oluşan egemenlik türüdür. Yöneticiler gücünü kutsal kitaplardan alır. Yaşam dini kurallara göre biçimlendirilir.\n" +
                    "\n" +
                    "d.) Demokratik Egemenlik: Halkın temsilcilerinin iktidarda olduğu egemenlik türüdür. Toplumsal yaşam pozitif hukuka göre belirlenir.\n" +
                    "\n" +
                    "e.) Sosyalist Egemenlik: Yöneticilerin gücünü işçi sınıfından aldığı egemenlik türüdür.\n" +
                    "\n" +
                    "f.) Kapitalist Egemenlik: Yöneticilerin gücünü orta sınıftan aldığı egemenlik türüdür. Toplumsal yaşamda egemenlik önemlidir. Bırakınız yapsınlar, bırakınız geçsinler mantığı hakimdir.",
    };
    public static String inanc[] = {
            "İslam’da Bilgi Kaynakları\n" +
                    "İnsan, evrendeki varlıklar içinde, varlığının farkında olan ve bunu ifade edebilen, kültür ve uygarlık oluşturabilen, yaşadığı çevreyi imar edebilen tek varlıktır. İnsan aklı ve hür iradesi sayesinde bu evrende etkin olmaktadır. Akıl ve hür iradenin etkinliği ise “bilgi” sayesinde gerçekleşmektedir. İnsan, yaratılışının bir gereği olarak şüphe eder, soru sorar ve merak eder. İnsan, ilgisini çeken şeyleri anlamak, aklına takılan sorulara cevap bulmak ve bilmek ister. İnsanın varlığını layıkıyla sürdürebilmesi için bilmesi gerekir.\n" +
                    "Bilme onu diğer varlıklardan ayıran en büyük özelliğidir.",
            "İslam düşüncesine göre bilginin kaynakları akıl, duyular ve haber şeklinde belirlenmiştir. Önce akıl, duyular ve haberin tanımı, sınırları ve doğru bilgiye ulaştırmaları bakımından önemi anlatılmaktadır. Akıl, doğruyu yanlıştan ayıran, olaylar arasında sebep\n" +
                    "sonuç ilişkisi kurarak yargıda bulunan, bilgi üreten, kavramlaştıran bir yetidir. Duyular, görme, işitme, koklama, tatma ve dokunma olmak üzere beş duyudan oluşmaktadır. Haber ise doğru ve yalan olma ihtimali bulunan her çeşit bilgidir. Doğru bilginin, bunlardan birisi, ikisi veya her üçü yoluyla elde edilmesi gerektiği vurgulanmaktadır.\n" +
                    "\n" +
                    "Kur’an, bilgi kaynağı olarak, vahiy başta olmak üzere, doğru haberi, duyuları ve akıl yürütmeyi göstermektedir. İnsan hayatının gayesi, Allah’ı (c.c.) bilmek, inanmak ve O’na ibâdet (kulluk) yapmaktır. Allah’ı (c.c.) bilmek, bilgilerin en üstünü ve yücesidir.",
            "İnsan ancak bilgi vasıtalarıyla Allah’a (c.c.) giden yolu bulabildiği gibi, kendisini ve çevresini de bu vasıtalarla tanır ve bilir. İslam düşüncesine göre rüya, ilham ve keşif sadece kişinin kendi tecübesine dayandığı ve objektif olduğu için geçerli bir bilgi kaynağı değildir. Bu bilgi kaynakları başkaları tarafından kabul edilemeyeceği gibi bunların doğruluklarını\n" +
                    "gösterecek herhangi bir delil de yoktur.",
            "İslam İnancında İmanın Mahiyeti\n" +
                    "Her dinin mensuplarının bağlı oldukları dine karşı bir takım sorumlulukları vardır. “Din” kavramı ile “iman” kavramı birbiri ile paralel olan iki kavramdır.\n" +
                    "\n" +
                    "Allah’a (c.c.), Hz. Peygamber’e (s.a.v.) ve onun haber verdiği her şeye yürekten inanıp, kabul ve tasdik eden kimseye mümin denir. Allah’ın (c.c.) varlığını reddeden, İslam dininin temel esaslarına inanmayan, Kur’an-ı Kerim’in bir veya birkaç ayetini veya tamamını inkâr eden kişiye de kâfir denir. Allah’ın (c.c.) dinine teslim olan, Hz. Peygamber’in (s.a.v.) din adına bildirdiği her şeye gönülden bağlanan, ibadetlerini yerine getiren, dinin güzel ahlakını davranışlarına yansıtarak inandığı gibi yaşayan kişiye Müslüman denir. Buna göre, Müslüman inancının gereğini tam bir teslimiyetle yerine getiren kişidir.",
            "İmanın en önemli unsuru kalp ile tasdiktir. İman, Allah’ın (c.c.) varlığını, birliğini, sıfatlarını, peygamberlerini, ahiret gününü ve bunlardan başka iman edilmesi gereken şeyleri kalp ile tasdik edip (onaylayıp) dil ile ikrar etmesidir. Kişi, iman konusunda herhangi bir baksı ve tehdit altında olmadan tasdik etmelidir. İkrar, kalbi ile iman ettiği hususları dil ile ifade etmesi, söylemesidir. İkrar, imanın bir unsuru değil sadece bu dünya için bir şarttır.\n" +
                    "\n" +
                    "Bir kişi kalbiyle inanmadığı hâlde diliyle inandığını söylerse mümin olamaz. Bunun aksine kalbiyle tasdik edip inandığı hâlde, diliyle bir özür veya tehdit altında olduğu için inandığını açıklayamayan, kâfir ve inançsız olduğunu söyleyen kimse de mümin sayılır.\n" +
                    "İman, kalp ile tasdiktir fakat bunun için kişinin neye iman ettiği hakkında bilgi sahibi olması gerekir. Bu anlamda iman ile bilgi arasında yakın ve açık bir ilişki vardır.",
            "İman, Hz. Muhammed’in Allah’tan (c.c.) getirdiği esasların doğru olduğunu kabul edip onlara gönülden inanmaktır. İbadet ise Allah’ın (c.c.) rızasını gözeterek yapılan her türlü güzel iş ve davranış demektir. İman ve ibadet İslam dininin en önemli iki temel\n" +
                    "unsurudur. Kişi iman ettikten sonra hayatına ibadet ve iyi işler yaparak sürdürür. İman etmeden yapılan iyilikler ve güzel amellerin ibadet değeri olmaz.\n" +
                    "\n" +
                    "İman; inanılacak hususların kesin delillere dayalı olup olmamasına göre de taklidî, tahkikî iman diye ikiye ayrılır.",
    };
    public static String insanvedin[] = {
            "İnsanın yaratılışı itibariyle hem maddi hem de manevi yönü vardır. Yeme, içme, dinlenme,\n" +
                    "ısınma, barınma gibi fizyolojik ihtiyaçları insanın maddi yönünü oluştururken yüce bir\n" +
                    "varlığa inanma, bir dini benimseme gibi ruhsal ihtiyaçları da manevi yönünü\n" +
                    "oluşturmaktadır.",
            "İnsanları dine yönlendiren etkenlerin başında fıtrat, hakikati bulma isteği, zihinsel\n" +
                    "arayışlar, bireysel ve sosyal ihtiyaçlar gelir. İnsan doğası yüce bir varlığa sığınmak\n" +
                    "ister. Bunun yanında insanın zihinsel arayışları da onu bir yaratıcıya ve hayatını\n" +
                    "düzenleyecek kurallara yönlendirir. İnsanı inanmaya yönlendiren daha birçok etken\n" +
                    "vardır.",
    };
    public static String islamveibadet[] = {
            "İbadet, Allah’a (c.c.) gönülden isteyerek yönelmek, boyun eğmek ve itaat etmektir. İbadet, insanın yaratılış amacıdır. İbadet, bizleri var eden, her türlü nimetler verene Yüce Yaratıcı’ya duyulan sevgi ve saygının bir sonucu ve göstergesidir.\n" +
                    "\n" +
                    "Bazı ibadetlerin (namaz, zekât, oruç, hac) uygulanmasında belirli bir vakit ve şekil şartı vardır. Bunlara özel anlamda ibadet denir. Genel anlamda ibadet ise, Allah’ın (c.c.) rızasına dayanan her türlü söz ve davranıştır.",
            "İbadetin Amacı Nedir?\n" +
                    "İbadet, Allah’a gönülden isteyerek yönelmek, tapmak, boyun eğmek ve itaat etmek demektir. Türkçemizde kullanılan kulluk etmek deyimi de aynı anlamı karşılamaktadır. İbadet, yaratıcı kudret karşısında boyun bükmenin zirvesi ve O’na olan sevginin sonucu ve göstergesi olarak değerlendirilmiş ve sırf Allah için, Allah’ın rızâsı için yapılması ve sadece Allah’a tahsis edilmesi gerektiği belirtilmiştir. Gerçekten de yaratan, yaşatan ve öldüren Allah’tan başka, ibadete lâyık olan bir varlık yoktur. Hesap gününde muhatap olunacak olan “Neye taptınız?” ve “Ne için ibadet ettiniz?” sorusunu insan daima hatırında tutmalı ve bu dünyada iken “Allah’a tapıyorum ve ibadeti Allah için yapıyorum” diyebilmeli, bunu gönlünde hissedebilmelidir.",
            "İnsan, ibadet sayesinde Allah’a (c.c.) yaklaşır. İbadet, insanı manevi olarak yüceltir. İbadet, insana Yaratıcı ile sürekli iletişim sağlar. Bu bilinçle yaşayan insan Allah’ı (c.c.) unutmaz. Allah’ın (c.c.) sevgisi kalbine yerleşir. İbadet insanı iyiliklere sevk eder, kötülüklerden uzaklaştırır. İbadet, insana dünya ve ahirette huzur, mutluluk ve güven verir.",
            "İslam dininde Yüce Allah’ın (c.c.) emirlerini yerine getirmek ve yasaklarından kaçınmakla sorumlu tutulan kimseye mükellef denir. Dinimizde ibadetle yükümlü sayılan insanların davranışları ve bunlarla ilgili hükümlere de ef ’ali mükellefin (mükelleflerin fiilleri) denir.\n" +
                    "\n" +
                    "İslam dininde ibadetlerle sorumlu kılınan insanların bazı davranışları yapmaları, bazılarını da yapmamaları gerekir. ",
            "İbadet, Allah’ın insanlara verdiği nimetler karşısında kişinin bir tür teşekkür etmesidir. İbadetler, bedeni olarak yapılır. Namaz kılmak, oruç tutmak, zekât vermek, hacca gitmek bedenen yapılan ibadetlerdir. Ancak İslam’da ibadetin temel ilkeleri vardır. Yani ibadetin geçerli olması için gerekli olan ilkeler.",
            "Niyet, yapılan ibadetin amacıdır. Niyet, ibadetin özüdür. İbadetin kabul olması, Allah için, yapılmasına bağlıdır. Allah’a (c.c.) inanan bir insan, ibadetlerini yalnızca O’nun için yapar, her türlü riyadan ve gösterişten uzak durur. İbadetlerinde hiçbir\n" +
                    "dünyevi çıkar ve menfaat beklemez, hiçbir şeyi O’na ortak koşmaz.",
            "İhlas; samimiyet, içtenlik, temizlik, saflık, gösterişsizlik anlamlarına gelir. İhlas, tutum ve davranışlarda sadece Allah’ın hoşnutluğunu gözetme, sözün öze uyması, riyakâr ve ikiyüzlülükten uzak olmaktır. İnsanın bütün davranışlarında, sözlerinde,\n" +
                    "inançlarında ve ibadetlerinde yalnızca Allah’ın rızasını gözetmesidir.",
            "İbadetler, Allah (c.c.) emrettiği için yapılır. Bu temel ilkenin yanında ibadetlerin bireysel ve toplumsal birçok faydası vardır. İnsan ibadetlerle Allah’ (c.c.) yaklaşır ve O’nunla olan bağını güçlendirir.\n" +
                    "\n" +
                    "İbadet insana huzur ve mutluluk verir. Hayatın karmaşası içinde manevi yönden destek olur. İbadet, insanın yaratıcısı ile ilişkisini canlı tutmasını sağlar. İnsana sorumluluk bilinci kazandırır. Duyarlı bir insan olmasına katkı sağlar. İnsana iradesine sahip çıkmayı öğretir. Bilinçli ve ihlaslı yapılan ibadetler, insanı kötülüklerden uzaklaştırır. İbadet aynı zamanda insanın Allah’a (c.c.) olan şükrünün bir göstergesidir.",
            "Bakara Suresi 177. Ayette verilen mesajlar, sadece ilki ile sınırlı kalmamaktadır. Birinci bölümde “yüzlerin doğu ve batıya çevrilmesinin” asıl iyilik olmadığı vurgulanırken ikinci bölümde ise asıl iyiliğin neler olduğu aktarılmaktadır. İmanın şartları 6’dır. Bunlar;\n" +
                    "\n" +
                    "– Allah’a iman,\n" +
                    "– Meleklere iman,\n" +
                    "– Kitaplara iman,\n" +
                    "– Peygamberlere iman,\n" +
                    "– Ahiret gününe iman,\n" +
                    "– Kadere, yani hayır ve şerlerin (iyilik ve kötülüklerin) Allahü teâlâdan olduğuna iman etmek.\n" +
                    "\n" +
                    "Bakara Suresi 177. Ayette verilen masaj da tam olarak ikinci bölümde imanın şartlarını anlatmaktadır. İmanın şartlarına ek olarak gerçek manada bir insanın iman etmesi için yapması gereken diğer şeyler de aktarılmaktadır.",
    };
    public static String islamdusuncesi[] = {
            "İslam’ın farklı şekillerde yorumlanması siyasi-itikadi olduğu gibi ameli-fıkhi alanda da olmuştur. Ameli-fıkhi yorumlar genellikle dinin ibadetler ve insanlar arası ilişkilerini düzenleyen kurallarda yoğunlaşmıştır. Yorumların ve farklılıkların hiçbirisi özünde ve temel ilkelerinde olmamıştır.",
            "İslam bilginlerinin görüş ve düşüncelerini temel alan Caferilik, Hanefilik, Malikilik, Şafiilik ve Hanbelilik gibi mezhepler oluşmuştur.",
            "anefilik\n" +
                    "Hicri ilk iki yüzyılda Kûfe merkezli olarak çıkan ve ismini kurucusu sayılan büyük fakih İmam-ı Âzam Ebû Hanife’den alan Ehl-i sünnet fıkıh mezheplerindendir.\n" +
                    "Bu mezhebe mensup olan fakihlere ve bu mezhep görüşüyle amel eden kişilere de Hanefi denilmiştir.",
            "Ebû Hanife’nin Tam adı: Ebû Hanîfe Nu’mân b. Sâbit (d. 80/699 Kûfe/ö. 157/767 Bağdat).\n" +
                    "Künyesi: Ebû Hanife.\n" +
                    "Lakabı: İmâm-ı Âzam (En büyük imam).\n" +
                    "\n" +
                    "Kendisi Irak Re’y ekolünün lideri ve önderidir.\n" +
                    "Akaide dair yazdığı beş küçük eseri çok meşhurdur. Bunlar; el-Fıkh’l-Ekber, el-Fıkhü’l-Ebsat, er-Risâle, el-âlim ve’l-Müteallim ve el-Vasiyye isimli risalelerdir. Ebû Hanife’nin görüşünü yazan, yayan ve yaşatan öğrencileri olmuştur. Bunlardan İmam Ebû Yûsuf, İmam Muhammed, Züfer, Hasan b. Ziyâd en meşhurlarıdır.",
            "Caferilik\n" +
                    "Peygamberimizin soyundan gelen İmam Cafer Sadık’ın görüşlerini temel alan mezheptir.Bu mezhebin görüşlerinin büyük çoğunluğu Hanefilik, Şafiilik, Malikilik gibi mezheplerin görüşlerine uygundur.",
            "Malikilik\n" +
                    "H 2./M 8. yüzyılda “Medine” merkezli olarak çıkan ve ismini kurucusu sayılan büyük hadis ve fıkıh âlimi Malik b. Enes’ten alan Ehl-i sünnet fıkıh mezheplerindendir. Bu mezhebe mensup olan fakihlere ve bu mezhep görüşüyle amel eden kişilere de Maliki denilmiştir.\n" +
                    "\n" +
                    "İmam Malik’in Tam adı: Malik b. Enes el-Esbahî (d. 93/712 Medine/ö. 179/795 Medine). Hadis ilminde de en güvenilir (sika) imamlardandır. Müctehit ve muhaddistir. Kendisine “Hadisçilerin ve Hicaz fıkıhçılarının önderi” denilir.\n" +
                    "\n" +
                    "Eseri: el-Muvatta’dır. İmam Malik’ten Abdurrahman b. Kasım, Abdurrahman el-Kurtubî ve Asbağ b. Ferec\n" +
                    "gibi bazı âlimler ders almıştır.",
            "Şafiilik\n" +
                    "Asıl adı Muhammed olan İmam-ı Şafiî’nin görüşlerini temel alan mezheptir. İmam-ı Şafiî, dinî hükümleri tespit etmede izlediği yöntemi şu şekilde açıklamıştır: “Öncelikle Kur’an’ı ve Resulüllah’ın sünnetini esas alırız. Sonra, sahabilerin görüşlerini ve Müslüman bilginlerin tamamına yakınının görüş birliği ile verdikleri hükümleri kabul ederiz. Bir konunun hükmünü bu kaynaklarda bulamazsak o konuda kendi görüşümüzü belirtiriz.”",
            "Hanbelîlik\n" +
                    "H 3./M 9. yüzyılda “Bağdat” merkezli olarak çıkan ve ismini kurucusu sayılan büyük hadis bilgini Ahmed b. Hanbel’den alan Ehl-i sünnet fıkıh mezheplerindendir. Bu mezhebe mensup olan fakihlere ve bu mezhep görüşüyle amel eden kişilere de Hanbeli denilmiştir.\n" +
                    "\n" +
                    "İmam Ahmed b. Hanbel’in Tam adı: Ebû Abdullah Ahmed b. Muhammed b. Hanbel\n" +
                    "eş-Şeybânî (d. 164/780 Bağdat/ö. 241/855 Bağdat).\n" +
                    "\n" +
                    "Sünni fıkhının büyük hadis imamı sayılan fıkıh ve hadis bilgini. Hadis (Hicaz) ekolünün önderlerindendir. Ahmed b. Hanbelin en önemli eseri el-Müsned adlı hadis kitabıdır. Akait konularına dair “er-Red Ale’z-zenadıka ve’l-Cehmiyye (Zındık ve Cebriyye Yanlılarına Cevap) adlı bir eseri vardır.",
    };
    public static String HzMuhammed[] = {
            "Arabistan Yarımadasında bulunan Mekke şehrinde dünyaya gelmiştir.Arabistan Yarımadası kabilelerden oluşur, merkezi yönetim yoktu. Yerleşik hayat ve göçebe hayat vardı, Yerleşik hayat yaşayanlar şehirde yaşarlar ve ticaret ve tarımla uğraşırlardı. Göçebe hayatı yaşayanlar çöllerde yaşar, tarım ve hayvancılıkla uğraşırlardı. Onlara bedevi denirdi.Yazılı edebiyat yerine sözlü edebiyat gelişmişti.",
            "Müslümanlıktan önce, Arapların çoğunluğu putprestti. Yaptıkları bir takım heykellere ilah diye tapıyorlardı. Mekke’de Kabe ve civarına 360 kadar put yerleştirilmişti. Her kabilenin ayrı bir putu, her putun özel bir ziyaret günü vardı.\n" +
                    "\n" +
                    "Arabistan’da putperestlerden başka, Musev’i, Hristiyan, Mecusi ve Sabii dinlerine mensup kimseler de vardı. Çok az sayıda Hz. İbrahim’in tebliğinden devre ulaşan dini esasları benimsemiş tek Tanrı inancında olan “Hanif”ler de vardı.",
            "Hz. Muhammed’in (s.a.v.) Çocukluğu ve Gençliği\n" +
                    "571 yılında nisan ayının sonlarına doğru Hz. Peygamber dedesi Abdülmüttalip bir torun bekliyordu. Müjdeli haber her an verilebilirdi. Hz. Peygamber doğumuna 2 ay kala babası Abdullah vefat ettiğinden Hz. Peygamber yetim olarak Dünya’ya gelecekti. Hz. Peygamber annesi Âmine Kureyş Kabilesi Zühreoğulları’dan Vehb’in kızıdır. Hz. Peygamber’in babası Abdullah’ta yine Kureyş Kabilesi’nin Haşimoğulları kolundan Abdülmüttalip’in oğludur. Hz. Peygamber yetim olarak Dünya’ya gelirken ona dedesi Abdülmüttalip tarafından o bölgede az rastlanan Muhammed adını verdi.",
            "lk sütannesi Halime oldu.\n" +
                    "\n" +
                    "Dedesi Abdulmuttalip’in vefatından sonra Hz. Muhammed (s.a.)’in bakımını amcası Ebu Talip üstlenmiştir. Amcasının hanımı olan Fatma da Hz. Peygambere öz annesi gibi davranmıştır. Peygamberimiz daha sonra amcasının oğlu Hz. Ali’yi yanına alarak onu aynı amcasının kendisini yetiştirdiği gibi yetiştirmiştir.",
            "Mekke’nin zengin ve soylu iş kadınlarından biri olan Hz. Hatice, Hz. Muhammed (s.a.)’in dürüstlüğünden ve ticaretteki başarısından etkilenmiş ve ona evlilik teklifinde bulunmuştur. Bu evlilikten Kasım, Zeynep, Rukiye, Ümmügülsüm, Fatıma ve Abdullah olmak üzere altı çocuğu dünyaya gelmiştir. Bunlardan Fatıma dışındakiler Hz. Peygamberin sağlığında vefat etmişlerdir. Hz. Fatıma ise Hz. Muhammed (s.a.)’in vefatından altı ay sonra vefat etmiştir.",
            "Otuz beş yaşına geldiğinde, Hacerü’l-Esved’in(Siyah Taş) Kâbe duvarındaki yerine konulması meselesinde kabileler arasındaki çatışmayı verdiği kararla bitirmiştir.(Muhammed’ül-Emin).",
            "Hz. Muhammed’e (s.a.v) Vahyin Gelişi\n" +
                    "610 yılının Ramazan ayının 27. gecesinde Hira Mağarası’nda vahiy meleği Cebrail kendisine ilk vahyi getirdi.\n" +
                    "\n" +
                    "Melek:\n" +
                    "– “Oku!” dedi.\n" +
                    "Hz. Muhammed (s.a.v.):\n" +
                    "“Ben okuma bilmem.” diye cevap verdi.\n" +
                    "Melek, Hz. Muhammed (s.a.v.)’i kucaklayıp güçsüz\n" +
                    "bırakıncaya kadar sıktı.\n" +
                    "– “Oku!” diye emrini tekrarladı.\n" +
                    "Hz. Muhammed (s.a.v.) yine:\n" +
                    "– “Ben okuma bilmem.” cevabını verdi.\n" +
                    "Melek emrini tekrarlayıp üçüncü defa Hz.\n" +
                    "Peygamber (s.a.v)’i sıktıktan sonra Alak Suresi’nin ilk beş ayetini okudu.",
            "Gördükleri karşısında heyecanlanan Peygamberimiz gördüklerini ilk olarak eşi Hz. Hatice’ye anlattı. Hz. Hatice bu durumu öğrenmek için, Tevrat ve İncil’den haberdar olan bilge bir insan olan akrabası Varaka b. Nevfel’e sordu. Varaka, Hz. Muhammed (s.a.)’in başından geçenleri dinleyince ona gelenin vahiy meleği olduğunu, eğer hayatta kalacak olursa İslam’a daveti sırasında onun yanında olacağını bildirdi.\n" +
                    "\n" +
                    "İlk önce yakın çevresinde gizli bir şekilde İslam’ı tebliğ eden Hz. Muhammed’e (s.a.v) Allah (c.c), üç yıl sonra tebliği açıkça yapmasını emretti.\n" +
                    "\n" +
                    "Hz. Muhammed (s.a.v), önce yakınlarını evinde, sonra da Mekkelileri Safa Tepesi’nde topladı. Allah’tan aldığı vahyi onlara bildirdi ve onları İslam’a davet etti.",
            "Hz. Muhammed’e (s.a.v) Hicreti\n" +
                    "615 yılı Müşriklerin ağır baskıları üzerine Hz. Osman liderliğinde (4 kadın, 11 erkek) on beş Müslüman Habeşistan’a hicret etti. 617 yılı Cafer b. Ebu Talip liderliğindeki (18 kadın, 82 erkek) yüz Müslüman ikinci defa Habeşistan’a hicret etti.\n" +
                    "\n" +
                    "616 yılı Hz. Hamza ve Hz. Ömer Müslüman oldu. Aynı yıl müşrikler Müslümanlara boykot uyguladı.",
            "619 yılı Hüzün Yılı: Çocukluğundan itibaren kendisi koruyup kollayan amcası Ebu Talip ve evliliği boyunca desteğini ondan hiç esirgemeyen eşi Hz. Hatice aynı yıl içerisinde vefat ettiler. Bu nedenle peygamberliğin onuncu yılına denk gelen bu yıla Müslümanlar Hz. Peygamberin çok üzülmesi sebebiyle “Hüzün Yılı” adını verdiler.\n" +
                    "\n" +
                    "620 yılı Hz. Muhammed (s.a.) İslam’a davet için Zeydb. Harise ile Taif’e gitti. Ağır hakaretlere uğrayarak Mekke’ye döndü.\n" +
                    "İsra ve Miraç olayı gerçekleşti.\n" +
                    "\n" +
                    "621 yılı Peygamberimiz (sav)Medineli Müslümanlarla 1. ve 2. Akabe biatını yaptı.",
            "622 Yılı Medine’ye Hicret: Hz. Peygamber ve Medineliler 1. Ve 2. Akabe biatlarını yaparak Hz. Peygamberi kendi şehirlerine davet etmişler ve onu canları pahasına koruyacaklarına dair söz vermişlerdir. Mekke’den Medine ‘ye göç eden Mekkeli Müslümanlara Muhacir, Medine’ye göç edelere yardım eden Medineli Müslümanlara da Ensar denilir. Hz. Peygamber ise arkadaşı Hz. Ebu Bekir ile birlikte Mekkelilerin kendilerini takip etmelerini engellemek için farklı bir yol takip ederek Medine’ye hicret etmiştir. Yolda Hz. Peygamber Kuba Mescidi’ni yaptırdı. Ranuna vadisinde ilk cuma namazını kıldırdı ve ilk hutbeyi okudu.",
            "Müslümanlar Medine’ye hicret edince özgürlük ve huzura kavuştular. Ancak Mekkeli müşrikler onları orada da rahat bırakmıyordu. Baskılar, sonunda çatışmaya dönüştü. 624 yılında Müslümanlar, Mekkeli müşrikleri Bedir savaşında bozguna uğrattı. Bedir savaşının intikamını almak isteyen müşrikler 625 yılında Müslümanlara tekrar saldırdılar. Uhud savaşında Müslümanlar galip gelecekken, Hz. Peygamberin stratejik bir noktaya yerleştirdiği okçular yerlerini terk edince üstünlüklerini kaybettiler. Bu savaş iki taraf için de tam bir sonuç elde edilemeden sona erdi. 627 yılında Mekkeliler bu defa büyük bir orduyla Medine’yi kuşattılar ama şehri ele geçiremeyip geri döndüler. Bu savaşa Hendek savaşı denildi. Çünkü Müslümanlar Medine şehrinin etrafına geniş hendekler kazmışlardı. Düşman birlikleri bu hendekleri geçemediler. Müslümanlarla Mekkeli müşrikler arasında 628 yılında Hudeybiye anlaşması imzalandı. Anlaşmaya göre iki taraf on yıl savaşmayacaktı. Bu barış ortamı İslam’ın yayılmasını hızlandırdı.",
            "Mekke’nin Fethi: Mekkeliler Huzaa kabilesine baskın yapıp yirmi üç kişinin öldürülmesiyle 628 yılında yapılan Hudeybiye Antlaşmasını bozmuş oldular. Bunun üzerinde Huzaalılar Hz. Peygamberden yardım istedi. Hz. Peygamber Mekke’yi on bin kişilik büyük bir orduyla evine kapanan veya Kâbe’ye sığınan hiç kimseye dokunmayarak savaşsız bir şekilde fethetti.",
            "632 Yılı  Veda Hutbesi: Hz. Peygamber hac sırasında Arafat’ta yüz yirmi bin kişilik kitleye bir konuşma yaptı. Daha sonra bu konuşmasına Veda Hutbesi denilmiştir.",
            "632 yılı 63 yaşında Hz. Peygamber’in Vefatı (13 Rebiyülevvel/8 Haziran Pazartesi) : Hz. Peygamberimizin kabri Mescid-i Nebi’nin yanı başına defnedilmiştir. Kabrine güzel kokulu bahçe anlamında Ravza-i Mutahhara denir.",
    };
    public static String islamvebilim[] = {
            "Din ve Bilim İlişkisi\n" +
                    "Din, Yüce Allah tarafından insanlara peygamberler aracılığıyla bildirilen kurallar bütünüdür. Dinin kaynağı her şeyi yaratan, yaşatan ve her an kontrolü altında tutan Allah’tır (c.c.).\n" +
                    "\n" +
                    "Bilim sözcüğünün İslam medeniyetindeki karşılığı ilimdir. İslam, insanın yaratılışına uygun bir din olduğu için bütün Müslümanlara ilmi farz kılmıştır. Tıp, hesap ve teknik gibi toplum için gerekli olan her türlü bilgiyi öğrenmek farz-ı kifayedir. Âlim (bilgin); temel İslam bilgilerini aldıktan sonra belirli bir ilim dalında daha çok ilerleyip uzmanlaşan kimsedir. Kur’an-ı Kerim ve Hz. Peygamber (s.a.v.) âlimleri övmüştür.",
            "İslam Medeniyetinde Bilim ve Düşüncenin Gelişimi\n" +
                    "Medeniyet, toplumların, gayelerine ulaşmak için birer vasıta olarak kullandıkları sosyal, hukuk ve ticarî kurallar da medeniyetin bir parçasıdır. İslam medeniyetinin temeli, Kur’an ve Hz. Peygamber’in (s.a.v.) sünnetidir. İslam medeniyeti dışında başka hiçbir medeniyet bilimsel bir yapı üzerinde kurulmamıştır. Bilimsel bir yapılaşma ile oluştuğu için İslam medeniyetini “bilimsel medeniyet” olarak nitelendirebiliriz.",
            "İslam Medeniyetinde Öne Çıkan Eğitim Kurumları\n" +
                    "Bunların başlıcaları şunlardır:\n" +
                    "\n" +
                    "Cami ve Mescit\n" +
                    "\n" +
                    "Mescit: Cami, namazgâh da denir. İçerisinde beş vakit namaz, cuma ve bayram namazlarının kılındığı Müslümanların ibadet yerine denir. Türk toplumunda içinde ibadet edilen küçük yerlere “mescit”, büyüklerine de “cami” denir. Bu ayrım diğer milletlerde yoktur.\n" +
                    "\n" +
                    "Cami: Mescitlerin büyüğüne “cami” denir. Cami; toplayan, toplayıcı demektir. Beş vakit namazda cuma ve bayram namazlarında müminleri bir araya topladığı için bu isim verilmiştir.",
            "Mektep\n" +
                    "\n" +
                    "İslam ülkelerinde ve özellikle Osmanlılarda çocuklara temel eğitimin verildiği yerdir. Hulefa-i Raşidin devrinde ve özellikle Hz. Ömer (r.a.) zamanında bu tür okullar yaygınlaşmıştır; onun getirdiği yenilikler arasında mektep tesisi ve muallimlere maaş bağlanması da sayılmaktadır. Emevi ve Abbasi devirlerinde mektepler gelişerek devam etmiştir. Osmanlı eğitim sisteminde hemen her cami yanında bir mektep tesis edilmiştir. Bu mekteplerde 5-6 yaşında “Sabi” denilen küçük çocukların okutulduğu için de daha ünlü ismiyle “Sıbyan Mektebi” adı verilmiştir. Osmanlı eğitim sisteminde ilköğretim kurumlarını bu sıbyan mektepleri teşkil eder.",
            "Medrese\n" +
                    "\n" +
                    "Ders yapılan yer, okul, mektep. İslam tarihinde dinî ilimler ile sosyal ve fen bilimlerinin öğretildiği yüksek öğretim seviyesindeki eğitim öğretim kurumu, fakülte. Medreselerde ders veren hocalara “müderris” denir.",
            "Daru’l-kurra\n" +
                    "\n" +
                    "Kur’an-ı Kerim okuma ilmini uzmanlık derecesinde öğreten ve hafız yetiştiren okullardır.\n" +
                    "\n" +
                    "Daru’l-hadis\n" +
                    "\n" +
                    "Hadis ilimlerinin öğretildiği ve hadis ilimlerinde uzmanların yetiştirildiği yüksek öğretim kurumlarıdır.\n" +
                    "\n" +
                    "Beytü’l-hikme\n" +
                    "\n" +
                    "Orta Çağ İslam ilim ve kültür tarihinde tercüme ve yüksek seviyedeki ilmi araştırmaların yapıldığı merkezlere verilen isimdir.",
            "Kütüphane\n" +
                    "\n" +
                    "Kütüphane terimi, “kitapların saklandığı yer” anlamında kullanılmaktadır. Müslümanların kitaba olan sevgi ve saygıları yazılı eser alanında İslam medeniyetinin önemli yer tutmasını sağlamıştır.\n" +
                    "\n" +
                    "Rasathane\n" +
                    "Gözlemevi. Yıldızların gözlendiği yer. Rasadhane; Arapça rasad (gözetleme) ve Farsça hâne (ev) kelimelerinden oluşur.\n" +
                    "\n" +
                    "Şifahane\n" +
                    "\n" +
                    "Hastane. Darüşşifa. Bimâr (hasta) kelimesinden yer adı yapmakta kullanılan -istan ekiyle türetilmiş Farsça bir isimdir. Sağlık hizmeti verilen ve bu amaçla gerektiğinde hastaların yatarak tedavi oldukları kurumdur.",
            "Müslümanların Bilim Alanında Yaptığı Öncü ve Özgün Çalışmalar\n" +
                    "Dil\n" +
                    "\n" +
                    "İnsanların birbirleriyle anlaşmak, konuşmak, tanışmak amacıyla kullandıkları işaret ve sesler sistemidir. Arapça büyük medeniyetler, kültürler ve imparatorluklar doğuran dillerin başında gelmiştir ve bir kültür ve medeniyet dilidir.",
            "Fıkıh\n" +
                    "\n" +
                    "Fakihin, ibadet, cezalar ve muamelatla ilgili dinî hükümleri ana kaynaklar olan Kur’an-ı Kerim ve sünnetten çıkararak ayrıntılı delillerle bilmesidir.\n" +
                    "En önemli fıkıh âlimleri arasında İmam Ebu Hanife (ö. 767), İmam Malik (ö. 795), İmam Şâfii (ö. 819) ve İmam Ahmed b. Hanbel (ö. 855) gibi isimler sayılabilir.",
            "Kelam\n" +
                    "\n" +
                    "Allah’ın (c.c.) zatından, sıfatlarından, isimlerinden ve fiillerinden, peygamberlikle ilgili meselelerden, başlangıç ve sonuç bakımından varlıkların durumundan İslam ölçüleri içinde bahseden ilimdir.\n" +
                    "\n" +
                    "Ebu Hanife’nin el-Fıkhü’l-Ekber isimli eseri konuları esasında akait olmasına ilk kelam eserlerinden biri sayılır. Müslümanlar arasında kabul edilen iki temel itikadi mezhebin kurucuları Eş’ari (ö. 941) ve Mâturîdi’dir. (ö. 944).",
            "Tefsir\n" +
                    "\n" +
                    "Kur’an-ı Kerim ayetlerinin anlamlarını açıklamaya, hükümlerini ve bu hükümlerin dayandığı gerekçeleri açığa çıkarmaya ve ayetleri belirli bir yöntem çerçevesinde yorumlamaya yarayan ilim dalıdır. İslam tarihinde Kur’an ayetlerini anlamak veya anlamlandırmak üzere çok sayıda çalışma yapılmıştır. Bu tefsirler diğer din ve kültürlere mensup insanlar için örnek olmuştur.",
            "Hadis\n" +
                    "\n" +
                    "Hz. Peygamber’in (s.a.v.) sözleri, fiilleri ve takrirleri (onaylaması); sahabelerin dine aykırı olmayan söz ve davranışlarını onaylamasıdır.\n" +
                    "\n" +
                    "Kütüb-i Sitte şunlardır: Buhâri (ö. 869) ve Müslim (ö.875)’in “el-Câmiu’s-Sahîh”-leri ile, Ebû Dâvûd (ö. 888), Tirmizî (ö.875), Nesâî (ö. 916) ve İbn Mâce (ö. 886).",
            "Tarih\n" +
                    "\n" +
                    "Toplumların başından geçen olayları zaman ve yer göstererek anlatan, bunların sebep ve sonuçlarını, birbirleriyle olan ilişkilerini ele alan bilim dalı ve bu dalda yazılan eserlerin ortak adıdır. Bu alanda ortaya çıkan ilk yazılı çalışmalar Hz. Peygamber’in (s.a.v.) savaşlarını konu alan megazi kitaplarıdır.\n" +
                    "\n" +
                    "İslam dünyasında tanınan en ünlü tarihçilerden bazıları şunlardır: İbn İshak (ö. 768), Vakıdî (ö. 823), İbn Hişam (ö.833), İbn Sa’d (ö.845), Belâzurî (ö.892), Taberi (ö.922), İbn Haldun (ö.1406), Naima (ö. 1716) ve Ahmet Cevdet Paşa’dır (ö.1895).",
            "Felsefe\n" +
                    "\n" +
                    "Madde ve hayatı; bunların toplum, ruh, kâinat gibi belirtilerini; sebep, prensip ve gaye bakımından inceleyen zihnî çalışma ve bu çalışmaların zihnî ürünü; varlığın ve bilginin kaynağının ilmî olarak araştırılmasıdır.\n" +
                    "\n" +
                    "İslam tarihinde her biri felsefe alanının en önemli temsilcileri olan çok sayıda filozof bulunmaktadır. Kindî (ö.873), Ebu Bekir Râzî (ö.925), Farabi (ö.950), İbn Sina (ö.1037), Gazali (ö.1111) ve İbn Rüşd (ö.1198), Müslüman filozoflardan bazılarıdır.",
            "Coğrafya\n" +
                    "\n" +
                    "İnsanlar ve yer (mekân) ile bunlar arasındaki ilişkiyi neden-sonuç ve dağılış ilkesine bağlı olarak inceleyen ve sorgulayan bir bilim dalıdır. Yer ve insanlar arasındaki ilişkiler coğrafyanın konusunu oluşturur. VIII. yüzyılda Abbasi Devleti’nin kurulmasından sonra Yunan, İran ve Hint astronomi-coğrafya çalışmalarının İslam dünyası tarafından tanınmasıyla coğrafya bir ilim dalı olarak ortaya çıktı.\n" +
                    "\n" +
                    "Ünlü coğrafyacılardan bazıları şunlardır: Piri Reis (ö. 1554). Seydi Ali Reis (ö. 1565), Uluğ Bey (Muhammed Taragay, ö. 1449), Kâtib Çelebi (ö. 1657), Evliya Çelebi (ö. 1684).",
            "Tıp\n" +
                    "\n" +
                    "İnsan sağlığının sürdürülmesi ya da bozulan sağlığın yeniden düzeltilmesi için uğraşan, hastalıklara teşhis koyma, hastalıkları tedavi etmeye yönelik çalışmalarda bulunan bilim dalıdır. Tarih boyunca dünyanın farklı yerlerinde tedavi için şifa amaçlı farklı yöntemler ve farklı tıbbî sistemler ortaya atılmıştır.\n" +
                    "\n" +
                    "Hz. Peygamber’in (s.a.v.) tıpla ilgili söz ve uygulamalarını içeren bu önerileri “Tıbbı Nebevî” adı verilen kitaplarda toplanmıştır.\n" +
                    "İlk hastaneyi Emevi halifesi Velid b. Abdülmelik H 88/M 706’da yaptırmıştır.\n" +
                    "\n" +
                    "Müslüman dünyasının en meşhur tıp âlimlerinden bazıları şunlardır: Ebû Bekir er-Razi (ö. 925), ez-Zehrâvi (ö.1013), İbn Sîna (ö.1037), İbn Rüşd (ö. 1198), İbnü’n-Nefis (ö.1288), Akşemseddin (ö.1459).",
            "Astronomi\n" +
                    "\n" +
                    "Astronomi (gök bilimi, gökbilim). İslam dünyasında astronomi bilimi ilm-i felek, ilm-i nücûm, ilm-i hey’et gibi adlarla bilinirdi.\n" +
                    "Astronomi, gök cisimlerini açıklamaya çalışmak üzere gözleyen bilim dalıdır. Astronomi yeryüzündeki en eski bilimlerden biri olarak kabul edilir.\n" +
                    "\n" +
                    "Astronomiyi geliştiren İslam bilginlerinden başlıcaları şunlardır: Ferganî (ö. 861), Hârizmi (Muhammed b. Mûsâ) (ö. 847), Kindî (ö. 873), Battâni (ö. 929), Birûnî (ö. 1061), Ebu Said es-Siczî (ö.1024), Caca Bey (1240- 1301), Uluğ Bey (1393-1449), Ali Kuşçu (1403-1474).",
            "Matematik\n" +
                    "\n" +
                    "Yunancada “orta” ve “öğrenme, öğretme” anlamlarına gelen gelir. Nazarî ilimlerin orta kısmında yer alır. Bu ilme Osmanlıca da riyâziyyât adı verilmiştir. Müslüman bilim adamlarının matematik bilimine katkıları çok fazladır.\n" +
                    "\n" +
                    "Bunlardan bazıları şunlardır: Hârizmî, İbnü’l-Heysem (ö. 1040), Abdurrahman el-Hâzinî (ö. 1155), Şerefeddin Tûsi (ö.1213), Nasîruddin Tûsi (ö.1274).",
            "Fizik\n" +
                    "\n" +
                    "Maddeyi, maddenin uzay-zamanda hareketini enerji ve kuvveti de kapsamak üzere bütün ilgili kavramlarla birlikte inceleyen doğa bilimidir.\n" +
                    "\n" +
                    "Müslüman fizikçilerden bazıları şunlardır: İbnü’l Heysem, el-Cezerî (İsmail b. Rezzâz el-Cezerî’) (ö.1206), Farabî (ö. 950).",
            "Kimya\n" +
                    "\n" +
                    "Cisimlerin temel yapılarını, birbirleriyle olan etkileşimlerini ve yeni bileşimler meydana getirmelerini inceleyen bilim dalıdır.\n" +
                    "\n" +
                    "Müslüman kimyacılardan bazıları şunlardır: Câbir b. Hayyân (ö. 776), Ebû Bekir er-Râzî (ö. 925), Kindî, Aziz Sancar (d.1946)",
    };
    public static String dinler[] = {
            "İSLAM DİNİ: Allahü Teala'nın insanlara gönderdiği son ilahi dindir. Peygamberimiz Hz. Muhammed aracılığıyla gönderilmiştir.\n" +
                    "\n" +
                    "• İslam sözcüğünün anlamı Allah'a teslim olmak demektir.\n" +
                    "\n" +
                    "• İslam dininin temelini tevhit inancı (Allah'ın varlığına ve birliğine iman) oluşturur.\n" +
                    "\n" +
                    "• İslam dininde temel inanç esasları altı tanedir. Bunlar;\n" +
                    "\n" +
                    "     » Allah'ın varlığına ve birliğine inanmak\n" +
                    "\n" +
                    "     » Meleklere inanmak\n" +
                    "\n" +
                    "     » Kutsal kitaplara inanmak\n" +
                    "\n" +
                    "     » Peygamberlere inanmak\n" +
                    "\n" +
                    "     » Ahiret gününe inanmak\n" +
                    "\n" +
                    "     » Kader ve kazaya inanmak",
            "• İslam dininin peygamberi Hz. Muhammed (s.a.v.)'dir. Hz. Muhammed son peygamberdir. 40 yaşında iken Mekke'de kendisine peygamberlik vazifesi verilmiş, bu mübarek görevi 23 yıl sürmüştür. www.huseyinarasli.com\n" +
                    "\n" +
                    "• İslam dininin kutsal kitabı Kur'an-ı Kerim'dir. M.S. 610 yılı Ramazan ayının Kadir gecesinde indirilmeye başlanmış, indirilişi 23 yılda tamamlanmıştır.\n" +
                    "\n" +
                    "\n" +
                    "• Kur'an-ı Kerim'in ana konusu tevhid inancıdır. Tevhid inancı, Allah'ın varlığı ve birliği inancı demektir.",
            "• İslam dininde ibadet yerleri cami ve mescit olarak adlandırılır.\n" +
                    "• Müslümanlıkta din adamlarına imam ve müezzin adı verilir.\n" +
                    "\n" +
                    "• İslam dininde Ramazan ve Kurban bayramları olmak üzere yılda iki bayram vardır.\n" +
                    "\n" +
                    "• İslam dininde güzel ahlak çok önemlidir. Hz. Muhammed (s.a.v.) \"Ben güzel ahlakı tamamlamak için gönderildim.\" buyurmuştur. ",
            "YAHUDİLİK: Yahudilik ilahî bir din olup yeryüzünde yaşayan en eski dinlerden biridir. İlahî din; Allah tarafından peygamberler aracılığıyla gönderilen, yani vahye dayalı olan dinlere denir. Yahudiliğe, Hz. Musa'ya (a.s.) atıfla Musevîlik de denir.\n" +
                    "\n" +
                    "• Yahudiliğin peygamberi Hz. Musa aleyhisselamdır. Hz. Musa Mısır'da doğmuş, İsrailoğullarına peygamber olarak gönderilmiştir. Kur'an-ı Kerim'de en çok söz edilen peygamberlerden biridir. Yahudiler ayrıca Hz. Davut (a.s.) ve Hz. Süleyman (a.s.) dönemlerini en görkemli zamanları olarak anarlar.\n" +
                    "\n" +
                    "• Yahudilikte tanrının adı Yehova'dır. Yahudiler tanrının var ve bir olduğuna, her şeyi yarattığına inanırlar. Ayrıca İsrailoğullarının seçilmiş millet olarak yaratıldığını kabul ederler. Tanrı Yehova'nın adını gereksiz yere ağızlarına almazlar, resmini ya da heykelini yapmazlar.",
            "• Yahudiliğin kutsal kitabı Tanah'tır. Tanah, Eski Ahit (Ahd-i Atik) olarak da bilinir. Tanah üç bölümden oluşur.\n" +
                    "\n" +
                    "     » Tevrat: Beş bölümden oluşur; Tekvin, Çıkış, Levililer, Sayılar, Tesniye.\n" +
                    "\n" +
                    "     » Neviim: Peygamberlerden söz eder.\n" +
                    "\n" +
                    "     » Ketuvim: Belgesel, şiirsel ve tarihsel bölümlerden oluşur.\n" +
                    "www.huseyinarasli.com\n" +
                    "• Yahudiliğin ibadet yerlerine Sinagog veya Havra denir.\n" +
                    "\n" +
                    "• Yahudilikte din adamları Haham olarak adlandırılır.\n" +
                    "\n" +
                    "• Yahudi inancında cumartesi kutsal gündür. O gün hiçbir iş yapılmaz, sadece ibadet edilir.\n" +
                    "\n" +
                    "• Yahudilerin dini ve milli sembolleri Yedi Kollu Şamdan (Menora) ile Altı Köşeli Yıldız'dır.\n" +
                    "\n" +
                    "• Yahudi dininde ahiret, cennet ve cehennem inancı vardır.",
            "• Yahudilikte ibadet günlük ve haftalık olarak yapılır.\n" +
                    "\n" +
                    "     » Günlük ibadet; sabah, öğle ve akşam olmak üzere üç vakit yapılır.\n" +
                    "\n" +
                    "     » Haftalık ibadet; cumartesi günü Sinagog'a gidilerek topluca yapılır.\n" +
                    "\n" +
                    "• Kudüs'te bulunan Ağlama Duvarı, Yahudiler için çok önemli bir mekandır.",
            "HRİSTİYANLIK: Hristiyanlık ilahî bir din olup dünyada en çok mensubu bulunan dinlerdendir. Filistin bölgesinde doğmuş, İsrailoğullarına gönderilmiştir.\n" +
                    "\n" +
                    "• Hristiyanlığın peygamberi Hz. İsa aleyhisselamdır. Hz. İsa Filistin'in Nasıra köyünde doğmuş, Allah'ın bir mucizesi olarak babasız dünyaya gelmiştir. Annesinin adı Meryem'dir.\n" +
                    "\n" +
                    "• Hz. İsa otuz yaşına geldiğinde peygamberlikle görevlendirildi. www.huseyinarasli.com\n" +
                    "\n" +
                    "• Hz. İsa'ya başlangıçta on iki kişi inandı. Bunlara Havariler denir.\n" +
                    "\n" +
                    "• Hristiyanlık dininin inanç esaslarının temelini Teslis inancı oluşturur. Teslis, \"üçlü tanrı inancı\" demektir.\n" +
                    "\n" +
                    "• Teslis inancının unsurları Baba, Oğul ve Kutsal Ruh'tur.\n" +
                    "\n" +
                    "     » Baba; her şeyin yaratıcısı, evrenin sahibi olan Tanrı demektir.\n" +
                    "\n" +
                    "     » Oğul; Hz. İsa'yı ifade eder. Tanrı, Hz. İsa'nın kişiliğinde bedenleşmiş, sevgi ve merhametiyle insanlar arasında yaşamış olarak kabul edilir. Yani Hz. İsa tanrılaştırılmıştır.\n" +
                    "\n" +
                    "     » Kutsal Ruh; Tanrı'nın vahyini kiliseye iletmekle görevli, seçilmiş kişileri yöneten tanrı nefesidir.",
            "• Hristiyanlığın kutsal kitabı İncil'dir. İncil'in diğer adı Yeni Ahit'tir. Matta, Markos, Luka ve Yuhanna kitapları, en meşhur incil kitaplarıdır.\n" +
                    "\n" +
                    "• İncil'de Hz. İsa'nın yaşamından, Hristiyanlık dininin inanç, ibadet ve ahlak ilkelerinden bahsedilir.\n" +
                    "\n" +
                    "• Hristiyanlık dininde melek, kader ve ölümden sonra diriliş inancı vardır. Ayrıca Hz. Muhammed'in (s.a.v.) dışındaki peygamberlerin peygamberliklerini kabul ederler.\n" +
                    "\n" +
                    "• Hristiyanlığın ibadet yerlerine Kilise denir.\n" +
                    "\n" +
                    "• Hristiyanlık inancında din adamlarına papaz ya da rahip adı verilir.\n" +
                    "\n" +
                    "• Hristiyanlığın sembolüne haç adı verilir. Haç aynı zamanda kilisenin de sembolüdür.",
            "• Hristiyanlığın önemli ayinlerinden biri vaftiz ayinidir. Hristiyanlık inancına göre Hz. Adem ve Hz. Havva yasak meyveyi yedikleri ve bu sebeple cennetten çıkarıldıkları için bütün insanlar günahkar olarak doğar. Bu yüzden doğan çocuk vaftiz edilir, kutsal su ile yıkanarak günahlarından arındırılır.\n" +
                    "\n" +
                    "• Hristiyanlığın diğer bir önemli ayini günah itirafı yapmaktır. Buna göre; günah işleyen kişi günahlarını papaza itiraf eder. Papaz da kilise adına o kişinin bağışlanması için dua eder. Böylece tövbe sonucu günahların bağışlandığına inanılır.\n" +
                    "\n" +
                    "• Hristiyanlıkta üç tane mezhep vardır;\n" +
                    "\n" +
                    "     » Katolik mezhebi; dini lideri papa, merkezi Vatikan'dır.\n" +
                    "\n" +
                    "     » Ortodoks mezhebi; dini lideri İstanbul'da bulunan patriktir.\n" +
                    "\n" +
                    "     » Protestan mezhebi; diğer iki mezhebe tepki olarak doğmuştur. Martin Luther'in görüşleri çerçevesinde oluşmuştur.",
            "Hint Dinleri\n" +
                    "HİNDUİZM: Hindistan'da yaygın bir din olup M.Ö. 1500 yıllarında ortaya çıkmıştır. Bilinen bir kurucusu, sistemi ve ibadet şekli yoktur.\n" +
                    "\n" +
                    "• Kutsal metinleri \"Vedalar\" adı verilen ve dört bölümden oluşan bir kitaptır. Vedaların \"Rişi\" denilen ve doğaüstü güçlerle ilişkiye geçtiği kabul edilen kişilere verildiğine inanılır.\n" +
                    "\n" +
                    "• Kast sistemi Hinduizm'in en belirgin yönlerindendir. Kast; aynı işle meşgul olan, görev ve gelenekleriyle birbirine sımsıkı bağlanan insanların oluşturduğu birlik demektir. Hinduizm'de toplum kastlara ayrılmıştır.",
            "BUDİZM: M.Ö. 6. yüzyılda Hindistan'da ortaya çıkmıştır. En çok Hindistan'da yaygın olup bunun yanında Doğu ve Güneydoğu Asya, Avrupa, Kuzey Amerika ve İngiltere'de de mensubu bulunan bir dindir.\n" +
                    "\n" +
                    "• Budizm'in kurucusu \"Buda\"dır. Buda'nın asıl adı Siddharta Gauatama olup \"Buda\" onun lakabıdır. Buda isminin anlamı \"ilhama kavuşan\" demektir.\n" +
                    "\n" +
                    "• Buda 29 yaşındayken insanlardan uzaklaşıp yalnız bir hayat sürmeye başlamış, 35 yaşındayken kendisine ilham geldiği söylenerek Buda olmuştur.\n" +
                    "\n" +
                    "• Buda'nın öğretileri kendisinden sonra yazıya geçirilmiş ve böylece Budizm'in kutsal metinleri oluşmuştur. www.huseyinarasli.com\n" +
                    "\n" +
                    "• \"Tipitaka (Tripitaka)\" Budizm'in kutsal metinlerine verilen isimdir. Anlamı üç sepet demektir. Bunlar;\n" +
                    "\n" +
                    "     » Doktrin ve disiplin sepeti\n" +
                    "\n" +
                    "     » Buda'nın konuşmaları\n" +
                    "\n" +
                    "     » Buda'nın insan ve evrenle ilgili düşünceleri\n",
            "CAYNİZM:\n" +
                    "\n" +
                    "• Hindistan'da yaygındır.\n" +
                    "\n" +
                    "• M.Ö. 599-517 yılları arasında yaşamış olan \"Mahavira\"nın görüşleri doğrultusunda ortaya çıkmıştır.\n" +
                    "\n" +
                    "• Caynistler \"zahid\"liğe önem verirler, sakin bir hayat yaşamayı tercih ederler. Çünkü Mahavira 30 yaşındayken ailesini terk edip inzivaya çekilmiş, zühd hayatı yaşamıştır.\n" +
                    "\n" +
                    "\n" +
                    "• Mahavira Hinduizm'deki kast sistemine ve din adamlarının egemenliğine karşı çıkmıştır.\n" +
                    "\n" +
                    "• Caynizm'in kutsal metinlerine \"Agamalar\" denir. Mahavira öldükten sonra oluşturulan bu metinler, onun düşüncelerine ve öğretilerine dayanır.\n" +
                    "\n" +
                    "• Caynistler ilahiler okuyarak ayin yaparlar ve bu ayinleri rahipler ya da rahibeler yönetir.",
            "SİHİZM:\n" +
                    "\n" +
                    "• Hindistan'da yaygındır.\n" +
                    "\n" +
                    "• 16. yüzyılda Guru Nanak'ın (M.S. 1469-1539) düşünceleri doğrultusunda ortaya çıkmıştır.\n" +
                    "\n" +
                    "• Guru Nanak Hinduizm'deki kast sistemine ve din adamlarının egemenliğine karşı çıkmıştır.\n" +
                    "\n" +
                    "• Tek Tanrı inancına sahip bir dindir.\n" +
                    "\n" +
                    "• Guru Nanak İslam'dan etkilenmiş ve Hint toplumunun bazı dini uygulamalarını İslam'ın ilkeleriyle birleştirmeye çalışmıştır.\n" +
                    "\n" +
                    "• Dünyanın çeşitli ülkelerinde Sihizm inancını benimseyen \"Sih\"ler yaşamaktadır.\n" +
                    "\n" +
                    "• Sihler sarık biçiminde bir başlık takarlar.\n" +
                    "\n" +
                    "• Alkol kullanmazlar, reenkarnasyona inanırlar ve ineği kutsal sayarlar.\n" +
                    "\n" +
                    "• Sihler yoğun olarak Hindistan'ın Pencap eyaletinde yaşarlar.\n" +
                    "\n" +
                    "• Sihizm'in en önemli ibadethanesi Amritsar'da bulunan Altın Mabet'tir.",
            "Çin ve Japon Dinleri\n" +
                    "KONFÜÇYANİZM:\n" +
                    "\n" +
                    "• Çin'de yaygındır.\n" +
                    "\n" +
                    "• Konfüçyüs'ün (M.Ö. 551-479) görüş ve düşünceleri doğrultusunda ortaya çıkmıştır.\n" +
                    "\n" +
                    "• Bilge bir kişi olan Konfüçyüs, genç yaşından itibaren dersler vermeye, öğrenci yetiştirmeye başlamıştır.\n" +
                    "\n" +
                    "• Bir süre de memurluk yapmış, sonra görevinden ayrılıp Çin ülkesini dolaşmış, gittiği yerlerde erdemli davranışlar ve Çin uygarlığının canlandırılması üzerine konuşmalar yaparak halkı aydınlatmaya çalışmıştır.\n" +
                    "\n" +
                    "• Konfüçyanizm genel olarak tek tanrı inancına dayalıdır.\n" +
                    "\n" +
                    "• Tanrı, her şeyi yaratan, yöneten ve ibadet edilmeye layık olan Tien'dir.\n" +
                    "\n" +
                    "• Konfüçyanizm'de erdemli davranışlar sergileyerek ahlaki olgunluğa erişmek çok önemlidir.\n" +
                    "\n" +
                    "• Beş Klasik ve Dört Kitap adındaki kutsal metinleri, Konfüçyüs öldükten sonra onun görüşleri bir araya toplanarak oluşturulmuştur.",
            "TAOİZM:\n" +
                    "\n" +
                    "• Çin'de yaygındır. www.huseyinarasli.com\n" +
                    "\n" +
                    "• Kurucusu, M.Ö. 6. yüzyılda yaşamış Lao Tse (ihtiyar bilge)'dir.\n" +
                    "\n" +
                    "• Taoizm genel olarak tek tanrı inancına dayalı olup Tao kavramı üzerine kurulmuştur.\n" +
                    "\n" +
                    "• Tao ezeli ve ebedidir, tek gerçektir, tam anlamıyla bilinemez, ancak düşünce yoluyla kavranabilir.\n" +
                    "\n" +
                    "• Taozim'de ruhun ölümsüz olduğuna, iyi bir hayat yaşayan kişilerin ruhlarının Tao ile birlikte olacağına inanılır.\n" +
                    "\n" +
                    "• Cennet, cehennem, ahiret inancı yoktur.\n" +
                    "\n" +
                    "• Ahlaki ilkelere çok önem verilir. Bu sebeple kişi Tao'nun öğretilerine bağlı kalmalı, erdemli davranışlar sergilemeye çalışmalıdır.\n" +
                    "\n" +
                    "• Tao-Te-King (Tao ve Fazilet), Taozim'in kutsal kitabı sayılır.\n",
            "ŞİNTOİZM:\n" +
                    "\n" +
                    "• Japonya'da yaygın olan milli bir dindir.\n" +
                    "\n" +
                    "• Çok tanrılı inanç sistemine sahiptir. Güneş, ay, rüzgar, nehir, fırtına vb doğa olaylarının her birinin ayrı bir tanrı olduğuna inanılır ve bunlara tapınmaya önem verilir.\n" +
                    "\n" +
                    "• Tanrıların en büyüğünün Güneş Tanrısı Amaterasu olduğuna inanılır.\n" +
                    "\n" +
                    "• Bu dinde ataların ruhlarına da çok önem verilir. Ruhların yaşadığına inanılarak evde onlara ayrı bir köşe tahsis edilir, yiyecek bırakılır.\n" +
                    "\n" +
                    "• Şintoistler diğer dinlere karşı son derece hoşgörülüdür.\n" +
                    "\n" +
                    "• Belirli bir kutsal kitabı yoktur. Sözlü olarak aktarılan Kojiki ve Nihangi adlarında kutsal vakayinameleri vardır.\n" +
                    "\n" +
                    "• Şintoizm'de ibadet sade ve basittir. Elini, yüzünü, ayaklarını yıkayan bir şintoist tapınağa gider ve dua eder.",
            "Dinlerde Önemli Günler ve Geceler:\n" +
                    "www.huseyinarasli.com\n" +
                    "• İslam dininde Ramazan ayı, cuma günü, kadir gecesi ve diğer kandil geceleri, Ramazan ve Kurban bayramları önemli gün ve gecelerdendir.\n" +
                    "\n" +
                    "• Hristiyanlık'ta pazar günü, Meryem Ana Günü, Haç Yortusu, Paskalya, Noel önemli gün ve gecelerdendir.\n" +
                    "\n" +
                    "\n" +
                    "• Yahudilik'te cumartesi günü, Roşhaşana, Pesah Bayramı önemli gün ve gecelerdendir.\n" +
                    "\n" +
                    "• Budizm'de Uposattha Günü önemlidir.",
    };
    public static String dogruda[]={
            "En kısa sürede bilgi kartları eklenecektir.",
    };
    public static String dik[]={
            "En kısa sürede bilgi kartları eklenecektir.",
    };
    public static String ikiz[]={
            "En kısa sürede bilgi kartları eklenecektir.",
    };
    public static String ucgenalan[]={
            "En kısa sürede bilgi kartları eklenecektir.",
    };
    public static String ucgenaciortay[]={
            "En kısa sürede bilgi kartları eklenecektir.",
    };
    public static String ucgenkenarort[]={
            "En kısa sürede bilgi kartları eklenecektir.",
    };
    public static String ucgendeeslik[]={
            "En kısa sürede bilgi kartları eklenecektir.",
    };
    public static String ucgendeacikenar[]={
            "En kısa sürede bilgi kartları eklenecektir.",
    };
    public static String cokgen[]={
            "En kısa sürede bilgi kartları eklenecektir.",
    };
    public static String dortgen[]={
            "En kısa sürede bilgi kartları eklenecektir.",
    };
    public static String yamuk[]={
            "En kısa sürede bilgi kartları eklenecektir.",
    };
    public static String paralel[]={
            "En kısa sürede bilgi kartları eklenecektir.",
    };
    public static String eskenardortgen[]={
            "En kısa sürede bilgi kartları eklenecektir.",
    };
    public static String cemberdeacı[]={
            "En kısa sürede bilgi kartları eklenecektir.",
    };
    public static String cemberdeuzun[]={
            "En kısa sürede bilgi kartları eklenecektir.",
    };
    public static String daire[]={
            "En kısa sürede bilgi kartları eklenecektir.",
    };
    public static String prizma[]={
            "En kısa sürede bilgi kartları eklenecektir.",
    };
    public static String piramit[]={
            "En kısa sürede bilgi kartları eklenecektir.",
    };
    public static String kure[]={
            "En kısa sürede bilgi kartları eklenecektir.",
    };
    public static String koordinatduzlemi[]={
            "En kısa sürede bilgi kartları eklenecektir.",
    };
}
