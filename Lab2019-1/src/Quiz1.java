
public class Quiz1 {

	public static void main(String[] args) {
		Kafile kafile= new Kafile("Avrupa Olimpiyatlar�"," Mustafa Ta�");
		kafile.setYarismaUlkesi("Almanya");
		Yuzucu yuzucu1= new Yuzucu("Hakan",'E',"01-02-1985",5,"latissimus dorsi+ , trapezius+ ");
		yuzucu1.setYuzmesaati(24);
		Guresci guresci1=new Guresci("Bulldozer �mans�z",'E',"21.05.1965",2,"A��r Siklet", 1000);
		guresci1.setKilo(96);
		guresci1.setGalibiyet(86);
		UzunAtlamaAtleti atlet1=new UzunAtlamaAtleti("S�la Pekta�",'K',"08.12.1996",68);
		atlet1.setAtletizmeBasladigiTarih("23.04.2005");
		atlet1.setKatildigiYarismaSayisi(83);
		atlet1.setMaxMesafe(12.0);
		Yuzucu yuzucu2= new Yuzucu("Alev",'K',"18.02.1997",74,"rectus abdominis+ , triceps brachialis++ , pectoralis major+ , pectoralis minor+ , gluteus maximus+++");
		yuzucu2.setYuzmesaati(230);
		Guresci guresci2=new Guresci("Ay� Bo�an Sabri",'E',"01.01.1980",1,"A��r Siklet", 50000);
		
		guresci2.setKilo(112);
		guresci2.setGalibiyet(40);
		Yuzucu yuzucu3=new Yuzucu("Alev",'K',"18.02.1997",74,"uzun boy, kasl� s�rt...");  //yuzucu2 ile ayn�. Kafileye sporcu ekle metodunun �al��mas�n�n kontrol� i�in bu obje olu�turuldu. 
		UzunAtlamaAtleti atlet2= new UzunAtlamaAtleti("Hazal �etinkaya",'K',"25.04.1990",25);
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
