
public class Quiz1 {

	public static void main(String[] args) {
		Kafile kafile= new Kafile("Avrupa Olimpiyatlarý"," Mustafa Taþ");
		kafile.setYarismaUlkesi("Almanya");
		Yuzucu yuzucu1= new Yuzucu("Hakan",'E',"01-02-1985",5,"latissimus dorsi+ , trapezius+ ");
		yuzucu1.setYuzmesaati(24);
		Guresci guresci1=new Guresci("Bulldozer Ýmansýz",'E',"21.05.1965",2,"Aðýr Siklet", 1000);
		guresci1.setKilo(96);
		guresci1.setGalibiyet(86);
		UzunAtlamaAtleti atlet1=new UzunAtlamaAtleti("Sýla Pektaþ",'K',"08.12.1996",68);
		atlet1.setAtletizmeBasladigiTarih("23.04.2005");
		atlet1.setKatildigiYarismaSayisi(83);
		atlet1.setMaxMesafe(12.0);
		Yuzucu yuzucu2= new Yuzucu("Alev",'K',"18.02.1997",74,"rectus abdominis+ , triceps brachialis++ , pectoralis major+ , pectoralis minor+ , gluteus maximus+++");
		yuzucu2.setYuzmesaati(230);
		Guresci guresci2=new Guresci("Ayý Boðan Sabri",'E',"01.01.1980",1,"Aðýr Siklet", 50000);
		
		guresci2.setKilo(112);
		guresci2.setGalibiyet(40);
		Yuzucu yuzucu3=new Yuzucu("Alev",'K',"18.02.1997",74,"uzun boy, kaslý sýrt...");  //yuzucu2 ile ayný. Kafileye sporcu ekle metodunun çalýþmasýnýn kontrolü için bu obje oluþturuldu. 
		UzunAtlamaAtleti atlet2= new UzunAtlamaAtleti("Hazal Çetinkaya",'K',"25.04.1990",25);
		atlet1.setKatildigiYarismaSayisi(23);
		atlet1.setMaxMesafe(2.5);
		
		
		System.out.println(kafile.KafileyeSporcuEkle(yuzucu1));
		System.out.println(kafile.KafileyeSporcuEkle(guresci1));
		System.out.println(kafile.KafileyeSporcuEkle(atlet1));
		System.out.println(kafile.KafileyeSporcuEkle(yuzucu2));
		System.out.println(kafile.KafileyeSporcuEkle(guresci2));
		System.out.println(kafile.KafileyeSporcuEkle(yuzucu3));
		System.out.println(kafile.KafileyeSporcuEkle(atlet2));
		System.out.println(kafile.KafileProfili());
		System.out.println(yuzucu1.SporcuProfili());
		System.out.println(guresci1.SporcuProfili());
		System.out.println(atlet1.SporcuProfili());
		System.out.println(yuzucu2.SporcuProfili());
		System.out.println(guresci2.SporcuProfili());
		
		
	}

	
	
	
	
	
	
	
}
