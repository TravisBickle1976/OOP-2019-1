
public class MilliSporcu {
	protected String isim;
	protected char cinsiyet;
	protected String dogumTarihi;
	protected String dogumYeri;
	protected float boy;
	protected float kilo;
	protected int SporcuNo;
	public MilliSporcu(String isim, char cinsiyet, String dogumTarihi, int sporcuNo) {
		super();
		this.isim = isim;
		this.cinsiyet = cinsiyet;
		this.dogumTarihi = dogumTarihi;
		SporcuNo = sporcuNo;
		
}
	public String SporcuProfili() {
		return("Merhaba, ben "+SporcuNo+ " nolu sporcuyum. "+dogumTarihi +"tarinde spora baþladým" );
	}
	
	
	public String getIsim() {
		return isim;
	}
	public char getCinsiyet() {
		return cinsiyet;
	}
	public String getDogumTarihi() {
		return dogumTarihi;
	}
	public String getDogumYeri() {
		return dogumYeri;
	}
	public float getBoy() {
		return boy;
	}
	public float getKilo() {
		return kilo;
	}
	public int getSporcuNo() {
		return SporcuNo;
	}
	public void setDogumYeri(String dogumYeri) {
		this.dogumYeri = dogumYeri;
	}
	public void setBoy(float boy) {
		this.boy = boy;
	}
	public void setKilo(float kilo) {
		this.kilo = kilo;
	}
	
	
	
	
	
	
	
	
	
	
}
