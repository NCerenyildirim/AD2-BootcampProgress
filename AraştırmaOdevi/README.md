# UpSchool_Arastirma_Odevleri
# Araştırma Ödevleri:

- [Araştırma Projesi 1 - Lateinit](#1)
- [Araştırma Projesi 2 - Tools Namespace](#2)


### <a name="1"></a> Araştırma Projesi 1

- Lateinit neden kullanıyoruz?
- Lateinit kullanımından bahseder misiniz?
- Lateinit için bir örnek kullanım gösterir misiniz ?



### <a name="2"></a> Araştırma Projesi 2


- Layout dizini içinde xml dosyalarımız için kullandığımız namespace nedir ?
- Neden kullanılmaktadır ?
- Nasıl kullanılmalıdır ?
- Bir adet Tools (tools namespace) attribute kullanımını gösterir misiniz ? 

## <a name="3"></a> Araştırma Projesi 3

- Font family dosyası nasıl oluşturulup kullanıyoruz?
- Neden belirttiğiniz şekilde kullanımı tercih ediyoruz?

P.S. [Bu linkten](https://developer.android.com/guide/topics/ui/look-and-feel/fonts-in-xml ) faydalanarak font family projenizde deneyebilirsiniz.

## <a name="4"></a> Araştırma Projesi 4

- Property Animation ile ilgili olarak objectAnimator ile animator arasındaki farkı kısaca açıklayınız

P.S. [Bu linkten](https://developer.android.com/guide/topics/resources/animation-resource#Property) faydalanabilirsiniz.






 **1)Araştırma Projesi 1**
 
Lateinit diğer adıyla late initialization ilk kullanımda değişkene bir değer atama zorunluluğu getirmez. Bu sayede değişken başlatılana kadar bellekte yer ayrılmaz. Lateinit kullanırken dikkat edilmesi gereken unsurlardan biri atanacak değişkenin null değere sahip olmaması gerekir.

**Örnek Kullanım için:**

![Lateinit](https://user-images.githubusercontent.com/103643989/164019689-12906394-e9ae-41db-a403-f81aba5289e8.png)


**2)Araştırma Projesi 2**
Farklı XML uygulamalarından birlikte kullanılan XML kaynakları aynı isimde etiketlere sahip olabilir. Bu çakışmayı önlemek için namespaceler kullanılır.Uygulamayı çalıştırmadan toolsattributeları sayesinde tasarladığımız ekranlarda görüntünün nasıl olacağını anlayabiliriz.

**Örnek Kullanım için:**

![namespace example](https://user-images.githubusercontent.com/103643989/164034716-eaade264-1e69-49fe-aeec-690d4201dd53.png)

**Toolscontext Attribbutes Kullanımı**

Bu öznitelik, bu düzenin varsayılan olarak hangi etkinlikle ilişkili olduğunu bildirir.



![context](https://user-images.githubusercontent.com/103643989/164041951-adb94a61-d5af-4529-99bc-e9d8eeb7f294.png)

**3)Araştırma Projesi 3**

Font family dosyamızı projemizde farklı font çeşitlerini kullanarak değişik görüntüler yaratmak için kullanıyoruz. Araştırarak bulabilebileceğimiz fontları android studioya'ya ekleyerek kullanım sağlayabiliriz.
 Res dosyasında sağ tık yaparak new directory > font şeklinde dosya açarak indirdiğimiz fontumuzu buraya yüklüyoruz.
 
 
![Font](https://user-images.githubusercontent.com/103643989/165372158-86cd9141-4ee2-454b-a3fb-a2764169fc53.png)


*Fontunuzu xml dosyası şeklinde yüklerseniz birden fazla text için bu fontu kullanmanız mümkün olacaktır.*




**4)Araştırma Projesi 4**

Uygulama oluştururken yarattığımız arayüzdeki nesneleri istediğimiz hareket ettirmek için animasyonlardan yararlanırız.

*ObjectAnimator:* Hedef bir nesneyi ve bu nesneye özellik kazandırmamızı sağlayan valueAnimatorün alt sınıfıdır. Bu sınıf, animasyon için yeni bir değer hesapladığında özelliği buna göre günceller. Hedef nesnelerde değerleri canlandırma sürecini çok daha kolay hale getirdiği için çoğu zaman ObjectAnimator kullanmak istersiniz.
