import java.util.ArrayList;
public class Kafile {
	private String katilinanYarisma;
	private ArrayList<MilliSporcu>milliler;
	private String kafileBaskani;
	private String yarismaUlkesi;
	private int erkekSayisi;
	private int kadinSayisi;
	public Kafile(String katilinanYarisma, String kafileBaskani) {
		super();
		this.katilinanYarisma = katilinanYarisma;
		this.kafileBaskani = kafileBaskani;
		milliler=new ArrayList<MilliSporcu>();
		
	}
	public String getKatilinanYarisma() {
		return katilinanYarisma;
	}
	public ArrayList<MilliSporcu> getMilliler() {
		return milliler;
	}
	public String getKafileBaskani() {
		return kafileBaskani;
	}
	public int getErkekSayisi() {
		return erkekSayisi;
	}
	public int getKadinSayisi() {
		return kadinSayisi;
	}
	public void setKatilinanYarisma(String katilinanYarisma) {
		this.katilinanYarisma = katilinanYarisma;
	}
	public void setMilliler(ArrayList<MilliSporcu> milliler) {
		this.milliler = milliler;
	}
	public void setKafileBaskani(String kafileBaskani) {
		this.kafileBaskani = kafileBaskani;
	}
	public void setYarismaUlkesi(String yarismaUlkesi) {
		this.yarismaUlkesi = yarismaUlkesi;
	}
	public void setErkekSayisi(int erkekSayisi) {
		this.erkekSayisi = erkekSayisi;
	}
	public void setKadinSayisi(int kadinSayisi) {
		this.kadinSayisi = kadinSayisi;
	}
	public String KafileProfili() {
		
		return("Kafile Baskani: "+kafileBaskani+"\n"+"Katýlýnan Yarisma: "+ katilinanYarisma+"\n"+"Yarýþma Ülkesi: "+ yarismaUlkesi+"\n"+"Erkek Sayisi: "+ erkekSayisi+"\n"+"Kadin Sayisi: "+kadinSayisi);
		
	}
	
	public MilliSporcu getSporcuBilgileri(int SporcuNo) {
		for(MilliSporcu i: milliler) {
			if (i.getSporcuNo()==SporcuNo) {
				return i;	
			}
				
		
				
		}
		return null;
		
		
	}
	
	public String KafileyeSporcuEkle(MilliSporcu ms) {			// çok daha kýsa ve optimize olabilir bu metod. Bu projenin daha optimize versiyonu yazýlacaktýr.
		String str= Integer.toString(ms.getSporcuNo());
		
		for(MilliSporcu ad: this.milliler) {
			if(ms.getSporcuNo()== ad.getSporcuNo()) {
				
				str+=" nolu sporcu zaten var.";
				return str;
				
				
				
		}
			
		}
		
			
				this.milliler.add(ms);
				str+=" nolu sporcu eklendi.";
				if(ms.getCinsiyet()=='E')
					erkekSayisi+=1;
				else if(ms.getCinsiyet()=='K')
					kadinSayisi+=1;
				


			return str;
	
	
	
}
	
	
}
