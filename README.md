# javaKursuBaslangicOrnekleri

# # Java Genel Bilgiler 

**JDK (Java Development Kit)** Java uygulamaları geliştirme ortamıdır. İşin Mutfağıdır. JVM, JRE, Java kütüphaneleri, Java Compiler ve Interpreter içerir. 

**JVM(Java Virtual Machine)** için Java programının çalıştığı platform ile Java programı arasında soyut bir ara katmandır. Yazdığımız Java kodlarını; Windows, Linux, Mac gibi Platformlarda çalışmasını sağlayan  sistemdir. Java'nın platform bağımsız çalışma nedenidir diyebiliriz. 

**JRE(Java Runtime Enviroment)** ise Java programlama dili ile yazılmış olan uygulamaların çalışmasını sağlayan bileşenler ile Java Kütüphanelerini barındırır. JVM de çalışabilmesi için kodları uygun byte Kodlara dönüştürür.
  
**JAVA bytecode** JVM Sanal makinesinin anladığı kodlara denir. Yazılan kodlar Java'da JRE tarafından bytecode'lere çevriliyor.JVM de java dışında örnek olarak Scala, Groovy, JRuby ve Jython gibi8989 diller de kodlarını bytecode' ye dönüştürerek JVM üzerinde çalışabilen dillerdir.

 **Derleyici (Compiler)** İDE' de yazdığımız kodların JVM' de çalışabilmesi için bytecode' lara dönüştürülme işlemidir. 
 
 **Yorumlayıcı (Interpreter)** Bir Java uygulamasının JVM de çalışabilmesi için önce JRE tarafından compiler edilir. Sonra JVM tarafından hangi platformda çalışacaksa ona uygun şekilde interpreter edilerek uygulama çalıştırılır. JVM platforma göre yorumlar diyebiliriz.
 
 **Stack:** Uygulama derlenirken değişkenler değerleri RAM 'e yüklenir. Değer tipleri int, short, byte, long, decimal, double, float dir. Heap e göre daha hızlıdır.

 **Heap: ** Heap' te stack bölgesi gibi RAM ’deki hafıza alanıdır. Nesnelerin hepsi Heap’ te bulunur ve veriler çalışma zamanında dinamik olarak yaratılırlar yani derleme aşamasında yer tahsis işlemi yapılmaz. Referans tipli değişkenlerin saklandıkları ve değişkene adres bilgisinin gönderildiği yerlerdir.

---

# JAVA Diline Giriş

**JAVA**,çeşitli uygulamalar geliştirmek için kullanılan popüler bir programlama dilidir. JAVA'nın avantajı nesne yönelimli programlamayı desteklemesidir.  Programlama yapabilmek için veri depolamak gereklidir ve veri depolamak için ayrılmış bellek konumlarına **değişken** adı verilir.  Her değişkenin belirli bir türü vardır. JAVA dili tarafından sağlanan 8 ilkel tür vardır. Bunlar ,**Primitive Type** , olarak sınıflandırılır : 

 - byte
 - short
 - int
 - long
 - float
 - double
 - char
 - boolean

Bazen primitive türleri bir nesneye ve nesneyi de ilkel türe dönüştürmek gerekir.  

**WrapperClass Nedir** : JAVA'da Wrapper sınıfı, ilkel bir veri türünü nesneye ve nesneyi de ilkel bir türe dönüştürmek için kullanılan sınıfdır.

*Integer intSayi = new Integer(10);*
// intSayi bir Integer tipinde bir Wrapper Class nesnesidir.

*int i = intSayi . intValue();*
// i değişkeni ise Primitive türünde ilkel bir int (integer) değişkenidir.

intValue() metodu kullanılarak nesneden ilkel türe bir **unBoxing** işlemi uygulanmıştır. Yani; Bir Wrapper sınıfının nesnesini , karşılık gelen primitive türünde otomatik olarak dönüştürme işlemine **kutudan çıkarma (unBoxing)** işlemi olarak bilinir.ArrayLists gibi koleksiyonlar nesneleri depoladıkları için Wrapper sınıfını kullanırlar.

## Primitive ve Wrappend Class verileri karşılaştırırsak : ##

 |Primitive Tür                          |Wrapper Class|
|-------------------------------|-----------------------------|
|İlkel tür, JAVA tarafından sağlanan önceden tanımlanmış bir veri türüdür.       |Wrapper sınıfı, ilkel türü nesneye ve nesneyi ilkel türe dönüştürmek için mekanizma sağlar.             | 
|İlkel tür bir nesne değildir, dolayısıyla bir sınıfa ait değildir.            |Bir nesne oluşturmak için bir Wrapper sınıfı kullanır bu nedenle karşılık gelen bir sınıfa sahiptir. |
|İlkel bir veri türü null değerlere izin vermez|Wrapper Sınıf nesneleri null değerlere izin verir.|
|Gerekli bellek Wrapper sınıflara kıyasla daha düşüktür.| Gerekli bellek,ilkeltürlerden daha yüksektir. kümelenmiş dizin ek bir alan gerektirmez.|
|Koleksiyonlarda ilkel bir tür kullanılmaz.|Wrapper sınıflar ArrayList vb. gibi koleksiyonlarla kullanılabilir.|


[Ayrıca Bakınız:](https://www.differencebetween.com/difference-between-wrapper-class-and-vs-primitive-type-in-java/)

---
## Integer.valueOf() ve Integer.parseInt() Kavramları:

**Integer.ParseInt():** Diziler üzerinde çalışırken dize olarak gösterilen bir sayıyı tamsayı türüne dönüştürmemiz gereken zamanlar vardır. JAVA'da String' i Integer' e dönüştürmek için genellikle kullanılan yöntem parseInt'dir. Bu yöntem java.lang package. içinde Integer Sınıfında yer alır. Parametre olarak geçerli bir dize alır ve onu ilkel veri türüne ayrıştırır. Yalnızca String' i parametre olarak kabul eder ve diğer herhangi bir veri türünün değerlerini geçerken uyumsuz türler nedeniyle bir hata üretir. Bu yöntemin iki çeşidi vardır. 

*public static int parseInt(String s) throws NumberFormatException*

*public static int parseInt(String s, int radix) throws NumberFormatException*
radix = Sayı Tabanı demek. Girilen sayının Hangi tabanda olduğunu göstermemizi istiyor.
*int`  `radixExample = Integer.parseInt(``"20"``,` `16``);*

 - 16 lık tabanda 20 sayısı 10 luk tabanda 32 ye eşittir. değişkenimizin
   değeri 32 olur.

**Integer.valueOf():**
Bu Yöntem, geçirilen argümanın degerini tutan ilgili Integer nesnesini döndüren  java.lang package. 'e ait statik bir yöntemdir. Bu yöntem, parametre olarak bir tamsayı veya bir String alabilir. Ancak verilen String geçersiz olduğunda hata verir. Bu yöntem aynı zamanda parametre olarak bir karakter alabilir ancak çıktı olarak ona karşılık gelen Unicode değeri olacaktır. Bu yöntem her zaman -128 ila 127 aralığındaki değerleri önbelleğe alır ve bu aralığın dışındaki diğer değerleri önbelleğe alabilir.

*public static Integer valueOf(int a)
public static Integer valueOf(String str)
public static Integer valueOf(String str, int base)*

| Integer.parseInt() | Integer.valueOf()  |
|--|--|
| Parametre olarak sadece String alabilir. |Parametre olarak bir String ve bir tamsayı alabilir.  |
|ilkel bir int değeri döndürür.| Bir Integer nesnesi döndürür.|
|Parametre olarak bir tamsayı iletildiğinde uyumsuz türler nedeniyle hata üretir.|Bir tamsayı parametre olarak iletildiğinde verilen parametreye karşılık gelen Integer Nesnesi döndürür.|
|Bu yöntem parametre olarak bir karakter iletildiğinde hata üretir.|Parametre olarak bir karakter alabilir ve karşılık gelen Unicode değeri gönderir.|
|Bir dizeyi ayrıştırmak, bir dize oluşturmaya kıyasla çok zaman aldığından performans açısından geride kalıyor.|Sıklıkla istenen değerleri önbelleğe alarak önemli ölçüde daha iyi alan ve zaman performansı sağlaması muhtemeldir.|
|İlkel int veri türüne ihtiyacımız varsa kullanılmalıdır.|Wrapper Integer nesnesi gerekiyorsa kullanılmalıdır.|
[Ayrıca Bakınız...](https://www.geeksforgeeks.org/integer-valueof-vs-integer-parseint-with-examples/)

---

# # StringBuffer ve StringBuilder arasındaki fark 

**JDK (Java Development Kit)** Java uygulamaları geliştirme ortamıdır. İşin Mutfağıdır. JVM, JRE, Java kütüphaneleri, Java Compiler ve Interpreter içerir. 
Java, bir karakter dizisini temsil etmek için üç sınıf sağlar: String, StringBuffer ve StringBuilder. String sınıfı değişmez bir sınıfken, StringBuffer ve StringBuilder sınıfları değişkendir. StringBuffer ve StringBuilder arasında birçok fark vardır. StringBuilder sınıfı, JDK 1.5'ten beri tanıtılmaktadır.

StringBuffer ve StringBuilder arasındaki farkların bir listesi aşağıda verilmiştir:


|StringBuffer | StringBuilder |
|--|--|
|  StringBuffer _senkronizedir,_ yani iş parçacığı güvenlidir. Bu, iki iş parçacığının aynı anda StringBuffer yöntemlerini çağıramayacağı anlamına gelir.  | StringBuilder _senkronize_ değil, yani iş parçacığı için güvenli değil. Bu, iki iş parçacığının aynı anda StringBuilder yöntemlerini çağırabileceği anlamına gelir.  |
|StringBuffer, StringBuilder'dan daha _az verimlidir_ .|StringBuilder, StringBuffer'dan _daha verimlidir_ . |
| StringBuffer, Java 1.0'da tanıtıldı | StringBuilder Java 1.5'te tanıtıldı |
---
**Synchronized Nedir:** Senkronize şu anlama gelir: Sırayla, Eşzamanlı değil [Aynı anda değil]. Synchronized yöntemi, bir iş parçacığı zaten üzerinde çalışırken, üzerinde başka bir iş parçacığının çalışmasına izin vermez. Bu, eşzamanlılığı önler. senkronizasyon örneği: Bir sinema bileti almak ve kuyrukta beklemek istiyorsanız. bileti ancak önünüzdeki kişi bileti aldıktan sonra alacaksınız demek oluyor.

**Thread safe means:** Bu yöntem, aynı anda birden fazla iş parçacığı tarafından sorunsuz bir şekilde erişilmek üzere güvenli hale gelir. synchronized anahtar sözcüğü, 'thread safe' elde etmenin yollarından biridir. Ancak Unutmayın: Aslında, birden fazla iş parçacığı senkronize yönteme erişmeye çalışırken, sırayı takip ederler, böylece erişim güvenli hale gelir. Aslında, aynı anda hareket ederler, ancak kaynağın senkronize davranışı nedeniyle aynı kaynağa (yöntem/bloğa) aynı anda erişemezler.

---
### String Formatlama ###

***System.out.printf(" %-15s %03d \n ", s1 , x );***

printf fonksiyonunda ;
**%d** int değişkenini
**%s** String değişkenini
ifade eder.
**%-15s**  Sağına 15 karakter tamamlayacak kadar Boşluk koyar.
**%15s**   Soluna 15 karakter tamamlayacak kadar Boşluk koyar.
**%03d**  Rakamlarda 3 basamağa 0 ile tamamlar. 006, 055 gibi 
**"%.2f"** Noktalı sayılar için noktadan sonra 2 basamak alır. 3.14

**/n** İmleç, Bir alt Satır başına geçer.
**/t** İmleç, Bir -tab tuşu kadar boşluk bırakır.
**/r** İmleç, Bulunduğu Satırın satır başına geçer.

**JAVA Para Birimi Dönüştürücü:**

    	NumberFormat chinaParaBirimi = NumberFormat.getCurrencyInstance(new Locale("zh", "CN"));
        NumberFormat franParaBirimi = NumberFormat.getCurrencyInstance(new Locale("fr", "FR"));
        NumberFormat trParaBirimi = NumberFormat.getCurrencyInstance(new Locale("tr", "TR"));

**JAVA Tarih Dönüştürücü:**<p>
SimpleDateFormat dfGun=new SimpleDateFormat("dd-mm-yyyy EEEEE");

    Date d=new Date();<p>
    Calendar cal = Calendar.getInstance();<p>
    cal.set(Calendar.MONTH, (month-1));<p>
    cal.set(Calendar.DAY_OF_MONTH, day);<p>
    cal.set(Calendar.YEAR, year);<p>
    d=cal.getTime();<p>
    String gun= dfGun.format(d).toUpperCase();<p>

------------------------------------------------------------



## **By pass value ile By pass referans arasındaki farklar, örnek üzerinden ?** ##


Değişken geçirme sistemi olarak tanımlanır. Bir Metoda parametre atadığımızda parametrelerin gerçek değerlerinin mi iletildiği yoksa referans değerlerinin mi iletildiğini ifade eder. Aradaki farkdan bahsedecek olursak, Java by pass value bir dildir. Metod a bir değişken gönderdiğimiz de gönderdiğimiz değişken bellekte bir kopyasını yaratır. ve bu kopya değer üzerinden işlem sağlar. Orjinal değişkenimiz bozulmaz. Referans seçeneğinde ise değişkenin referans ı metoda gönderlir. bu sayede değişkende yapılan değişiklikler orjinal değerini de etkileyecektir.

[Kaynak ve Detaylı Açıklama](https://hasancelik.org/java-hafiza-yonetimi/Java-memory-models-pass-by-value-reference/)

------------------------------------------------------------

## Java da Tip Dönüşümleri (Type Casting)

Java nesne tabanlı bir dildir ve tüm nesneler Object sınıfından türetilmiştir. Bu yüzden çoğu nesne birbirini kapsayarak ilerlemektedir.
Bir birini kapsayan nesneler arasında özelikerini uyumlarını ve kapsamlarını dikkate alarak birbirine dönüşterebiliriz. Örnek verecek olursak. Sayı nesnelerinden bahsedebiliriz.

`byte<short<int<long<float<double

tüm bu veri tiplerini ele alalım. boyutlarını dikkate alırsak taşmayacak şekilde birbirlerine çevirebiliriz. dönüştürebiliriz. 
ya da kendi nesnelerimizle uğraşırkende kullanabiliriz.

    insan>ogrenci>ogretmen>prof>yonetici

en Kapsayıcı sınıfımız insan sınıfı  yönetici bazı özelliklerini kullanmadığımızda insan sınıfına dönüştürebiliriz. insan sınıfına uygun vasıfları eklediğimizde yönetici sınıfına dönüştürebiliriz.

------------------------------------------------------------

# # JDK 17'nin yeni özellikleri şunları içerir:

- **[Context-specific deserialization filters]** 
Uygulamaların, her serileştirme işlemi için bir filtre seçmek üzere çağrılan JVM çapında bir filtre fabrikası aracılığıyla bağlama özel ve dinamik olarak seçilen seri durumdan çıkarma filtrelerini yapılandırmasına izin verir. Oracle, bu teklifin arkasındaki motivasyonu açıklarken, güvenilmeyen verilerin seri durumdan çıkarılmasının doğası gereği tehlikeli bir faaliyet olduğunu, çünkü gelen veri akışlarının içeriğinin oluşturulan nesneleri, alanlarının değerlerini ve aralarındaki referansları belirlediğini söyledi. Birçok kullanımda, akıştaki baytlar bilinmeyen, güvenilmeyen veya kimliği doğrulanmamış bir istemciden alınır. Akışın dikkatli bir şekilde oluşturulmasıyla, bir düşman, keyfi sınıflardaki kodun kötü niyetle yürütülmesine neden olabilir. Nesne yapısının, durumu değiştiren veya başka eylemleri başlatan yan etkileri varsa, bu eylemler uygulama nesnelerinin bütünlüğünü tehlikeye atabilir, kitaplık nesneleri ve Java çalışma zamanı. Serileştirme saldırılarını devre dışı bırakmanın anahtarı, rastgele sınıf örneklerinin seri durumdan çıkarılmasını önlemek ve böylece yöntemlerinin doğrudan veya dolaylı olarak yürütülmesini engellemektir. Deserialization filtreleri tanıtıldı, uygulama ve kitaplık kodunun gelen veri akışlarını seri durumdan çıkarmadan önce doğrulamasını sağlar. Bu kod `java.io.ObjectInputFilter`, bir seri durumdan çıkarma akışı oluşturduğunda doğrulama mantığı sağlar . Ancak, açıkça doğrulama istemek için bir akışı oluşturan kişiye güvenmenin sınırlamaları vardır.  Bir API, sistem özellikleri veya güvenlik özellikleri aracılığıyla ayarlanabilen JVM çapında bir seri durumdan çıkarma filtresi sunarak bu sınırlamaları ele aldı, ancak bu yaklaşımın, özellikle karmaşık uygulamalarda sınırları da vardır. Daha iyi bir yaklaşım, akış başına filtreleri her akış oluşturucunun katılımını gerektirmeyecek şekilde yapılandırmaktır. Planlanan geliştirme, geliştiricilerin her seri durumdan çıkarma bağlamı ve kullanım durumu için uygun filtreler oluşturmasına ve uygulamasına yardımcı olmalıdır.

- **restoration of always-strict floating point semantics** 
Kayan nokta operasyonları yerine hem sıkı kayan nokta anlambilim (olmasındansa sürekli sıkı yapılacaktır `strictfp`) ve kurnazca farklı bir varsayılan kayan nokta anlambilim. Bu, orijinal kayan nokta semantiğini dile ve VM'ye geri yükler ve Java Standard Edition 1.2'de katı ve varsayılan kayan nokta modlarının tanıtılmasından önceki semantiği eşleştirir. Bu çabanın hedefleri, aşağıdakileri içeren sayısal olarak hassas kitaplıkların geliştirilmesini kolaylaştırmayı içerir `java.lang.Math`ve`java.lang.StrictMath`. 1990'ların sonlarında varsayılan kayan nokta semantiğini değiştirmeye yönelik itici güç, orijinal Java dili ile JVM semantiği arasındaki kötü etkileşimden ve popüler x86 mimarisinin x87 kayan nokta yardımcı işlemci komut setinin bazı özelliklerinden kaynaklandı. Normal altı işlenenler ve sonuçlar da dahil olmak üzere her durumda tam kayan nokta semantiğini eşleştirmek, ek talimatların büyük genel giderlerini gerektiriyordu. Taşma veya taşma yokluğunda sonuçları eşleştirmek daha az ek yük ile yapılabilir ve kabaca Java SE 1.2'de tanıtılan gözden geçirilmiş varsayılan kayan nokta semantiği tarafından izin verilen şeydir. Ancak, 2001 dolaylarında başlayan Pentium 4 ve sonraki işlemcilerde gönderilen SSE2 (Akış SIMD Uzantıları 2) uzantıları, aşırı yük olmadan doğrudan JVM kayan nokta işlemlerini destekleyebilir.

- **Deprecation of the Security Manager kaldırılması,**
Gelecekteki bir sürümde kaldırılmaya hazırlanıyor. Java 1.0'a dayanan Güvenlik Yöneticisi, istemci tarafı Java kodunun güvenliğini sağlamanın birincil yolu olmuştur ve nadiren sunucu tarafı kodunun güvenliğini sağlamak için kullanılmıştır. Teklifin bir amacı, Güvenlik Yöneticisi'nin kullanıldığı belirli dar kullanım durumlarını (ör. engelleme) ele almak için yeni API'lerin veya mekanizmaların gerekip gerekmediğini değerlendirmektir `System::exit`. Planlar, JDK 17'de kullanımdan kaldırılması planlanan eski Applet API ile uyumlu olarak Güvenlik Yöneticisinin kaldırılması için kullanımdan kaldırılmasını gerektirir.

- **pattern matching for  `switch`Önizlemesi** 
Java'daki kalıpların dilini genişleterek `switch`ifadelerin ve ifadelerin her biri belirli bir eylemle bir dizi [kalıpla] test edilmesini sağlar. Bu, karmaşık veri odaklı sorguların kısa ve güvenli bir şekilde ifade edilmesini sağlar. Bu özelliğin amaçları arasında, `switch`vaka etiketlerinde kalıpların görünmesini sağlayarak ifadelerin ve ifadelerin ifadesini ve uygulamasını genişletmek, `switch`istendiğinde tarihsel boş düşmanlığı gevşetmek ve iki tür kalıp tanıtmak yer alır: `guarded patterns`kalıp eşleştirme mantığına izin veren . `parenthesized patterns`bazı ayrıştırma belirsizliklerini çözen keyfi Boolean ifadeleri ile rafine edilmiştir . [JDK 16] 'da ,`instanceof`operatörü, bir tür deseni alacak ve desen eşleştirmesi yapacak şekilde genişletildi. Önerilen mütevazi uzantı, bilinen örnek-ve-yayın deyiminin basitleştirilmesine izin verir.

- **Strong encapsulation for JDK internals** 
[JDK dahili] sun.misc.Unsafe` öğeleri için güçlü kapsülleme, JDK 9'dan JDK 16'ya kadar yapılabildiği gibi, dahili öğelerin güçlü kapsüllenmesini tek bir komut satırı seçeneğiyle gevşetmeyi artık mümkün kılmaz. plan, JDK'nın güvenliğini ve sürdürülebilirliğini iyileştirmeyi ve geliştiricileri dahili öğelerden standart API'lere geçmeye teşvik etmeyi içerir.

- **Removal of the Remote Method Invocation (RMI) Activation mechanism** 
 RMI Etkinleştirme mekanizması eskidir ve kullanılmamaktadır ve [JDK 15'te] kaldırılmak üzere kullanımdan kaldırılmıştır .

- **The [foreign function and memory API**  
Bir kuluçka aşaması tanıttı, Java programlarının Java çalışma zamanı dışındaki kod ve verilerle birlikte çalışmasına izin verir. Yabancı işlevleri, yani JVM dışındaki kodu verimli bir şekilde çağırarak ve yabancı belleğe, yani JVM tarafından yönetilmeyen belleğe güvenli bir şekilde erişerek API, Java programlarının yerel kitaplıkları çağırmasını ve JNI'nin (Java) kırılganlığı ve riski olmadan yerel verileri işlemesini sağlar. Yerel Arayüz). Önerilen API, iki API'nin evrimidir - yabancı bellek erişim API'si ve yabancı bağlayıcı API. Yabancı bellek erişim API'si, kuluçka API'si olarak 2019'da Java 14'e hedeflendi ve Java 15 ve Java 16'da yeniden kuluçkalandı. Yabancı bağlayıcı API, 2020'nin sonlarında kuluçka API'si olarak Java 16'ya hedeflendi. API planının hedefleri arasında kullanım kolaylığı, performans, genellik ve güvenlik yer alır.
Bir kuluçka API'si olarak [JDK 16'ya entegre edilen platformdan bağımsız [vektör API'si], JDK 17'de tekrar kuluçkalanacak ve desteklenen CPU mimarileri üzerinde optimal vektör talimatlarına çalışma zamanında güvenilir bir şekilde derlenen vektör hesaplamalarını ifade etmek için bir mekanizma sağlayacaktır. Bu, eşdeğer skaler hesaplamalardan daha iyi performans sağlar. JDK 17'de, vektör API'si, bayt vektörlerini boolean dizilerine ve bu dizilerden çevirmeye yönelik geliştirmeler de dahil olmak üzere performans ve uygulama için geliştirilmiştir.

- **Sealed classes and interfaces**
 Diğer sınıfların veya arabirimlerin bunları genişletebileceğini veya uygulayabileceğini kısıtlar. Teklifin hedefleri, bir sınıfın veya arayüzün yazarının, onu uygulamaktan sorumlu olan kodu kontrol etmesine izin vermek, bir üst sınıfın kullanımını kısıtlamak için erişim değiştiricilerinden daha bildirimsel bir yol sağlamak ve bir temel sağlayarak kalıp eşleştirmede gelecekteki talimatları desteklemektir. kalıpların kapsamlı analizi için. Bu yetenek, API tasarımcılarının daha esnek kod oluşturmasına yardımcı olur.
 
-  **Removal of the experimental AOT and JIT compiler** . Plan, geliştiricilerin JIT derlemesi için harici olarak oluşturulmuş derleyici sürümlerini kullanmaya devam edebilmeleri için Java düzeyinde JVM derleyici arabiriminin bakımını gerektirir. AOT derlemesi (jaotc aracı), deneysel bir özellik olarak JDK 9'a dahil edildi . Araç , AOT derlemesi için kendisi Java'da yazılmış olan Graal derleyicisini kullanır . Bu deneysel özellikler JDK 16'ya dahil edilmedi Oracle tarafından yayınlanan derlemeler ve kimse şikayet etmedi. Öngörülen plana göre, üç JDK modülü kaldırılacaktır: jdk.aot (jaotc aracı); internal.vm.compiler, Graal derleyicisi; ve jdk.internal.vm.compiler.management, Graal MBean. AOT derlemesiyle ilgili HotSpot kodu da kaldırılacaktır.

- **Porting the JDK to MacOS/AArch64 in response to Apple’s plan to transition its Macintosh computers from x64 to AArch64.** Java için bir AArch64 bağlantı noktası Linux için zaten mevcuttur ve Windows için çalışmalar devam etmektedir. Java geliştiricileri, uygulama ikili arabirimi ve ayrılmış işlemci kayıtları kümesi gibi düşük düzeyli sözleşmelerdeki farklılıkları barındırmak için JDK'nın bağlantı noktalarındaki norm olduğu gibi koşullu derleme kullanarak bu bağlantı noktalarından mevcut AArch64 kodunu yeniden kullanmayı bekler. MacOS/AArch64 için yapılan değişiklikler, mevcut Linux/AArch64, Windows/AArch64 ve MacOS/x64 bağlantı noktalarını bozma riski taşır, ancak risk, entegrasyon öncesi test yoluyla azaltılacaktır.

- **Deprecating the Applet API for removal** Bu API esasen alakasız çünkü tüm web tarayıcısı satıcıları Java tarayıcı eklentileri için desteği kaldırmış veya bunu yapmak için planlarını açıklamış durumda. Applet API , Eylül 2017'de [Java 9'da] daha önce kullanımdan kaldırılmıştı, ancak kaldırılmak üzere değildi .
  
- **MacOS için yeni bir işleme hattı** kullanımdan kaldırılmış OpenGL API'sini kullanan mevcut işlem hattına alternatif olarak Apple Metal API'sini kullanan yeni bir işleme işlem hattı . Bu teklif, MacOS Metal çerçevesini kullanan ve Apple'ın OpenGL API'sini MacOS'un gelecekteki bir sürümünden kaldırması durumunda hazır olan Java 2D API için tamamen işlevsel bir işleme hattı sağlamayı amaçlamaktadır. İşlem hattının, belirli uygulamalarda ve kıyaslamalarda iyi veya daha iyi performansla, mevcut OpenGL işlem hattı ile işlevsel eşliğe sahip olması amaçlanmıştır. Mevcut Java 2D modeline uyan temiz bir mimari oluşturulacaktır. Boru hattı, kullanımdan kaldırılana kadar OpenGL boru hattı ile birlikte var olacaktır. Yeni Java veya JDK API'leri eklemek teklifin bir amacı değildir. Atlanabilir PRNG'ler ve ek bir bölünebilir PRNG algoritmaları (LXM) sınıfı dahil olmak üzere, sahte rasgele sayı üreteçleri (PRNG'ler) için yeni arabirim türleri ve uygulamaları sağlayacak 

- **Enhanced pseudo-random number generators**. Yeni bir arayüz, `RandomGenerator`tüm mevcut ve yeni PRNG'ler için tek tip bir API sağlayacaktır. Dört özel RandomGenerator arabirimi sağlanacaktır. Planı motive etmek, Java'da sözde rasgele sayı üretimi alanında iyileştirme için birden fazla alana odaklanmaktır. Bu çaba, çok sayıda başka PRNG algoritmasının uygulamalarını sağlamayı gerektirmez. Ancak, diğer programlama dili ortamlarında zaten yaygın olarak kullanılan üç ortak algoritma eklenmiştir. Planın hedefleri şunları içerir:
    -   Uygulamalarda çeşitli PRNG algoritmalarını birbirinin yerine kullanmayı kolaylaştırır.
    -   PRNG nesnelerinin akışlarını sağlayan akış tabanlı programlama için geliştirilmiş destek.
    -   Mevcut PRNG sınıflarında kod tekrarının ortadan kaldırılması.
    -   Sınıfın mevcut davranışının korunması `java.util.Random`.
