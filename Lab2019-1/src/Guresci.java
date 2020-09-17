
public class Guresci extends MilliSporcu{
	private String siklet;
	private int toplamSaat;
	private int galibiyet;
	private int beraberlik;
	private int malubiyet;
	
	
	public Guresci(String isim, char cinsiyet, String dogumTarihi, int sporcuNo, String siklet, int toplamSaat) {
		super(isim, cinsiyet, dogumTarihi, sporcuNo);
		this.siklet = siklet;
		this.toplamSaat = toplamSaat;
	}

	public String SporcuProfili() {
		return "Merhaba, ben "+super.SporcuNo+" nolu Milli güreþçiyim. "+super.kilo+" kilo sikletinde güreþiyorum. Toplamda "+ this.galibiyet+ " galibiyetim var." ;
	}

	public String getSiklet() {
		return siklet;
	}

	public int getToplamSaat() {
		return toplamSaat;
	}

	public int getGalibiyet() {
		return galibiyet;
	}

	public int getBeraberlik() {
		return beraberlik;
	}

	public int getMalubiyet() {
		return malubiyet;
	}

	public void setGalibiyet(int galibiyet) {
		this.galibiyet = galibiyet;
	}

	public void setBeraberlik(int beraberlik) {
		this.beraberlik = beraberlik;
	}

	public void setMalubiyet(int malubiyet) {
		this.malubiyet = malubiyet;
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
	

	


