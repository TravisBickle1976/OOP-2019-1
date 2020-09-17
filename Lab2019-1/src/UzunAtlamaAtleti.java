
public class UzunAtlamaAtleti extends MilliSporcu {
	
	public UzunAtlamaAtleti(String isim, char cinsiyet, String dogumTarihi, int sporcuNo) {
		super(isim, cinsiyet, dogumTarihi, sporcuNo);
		// TODO Auto-generated constructor stub
	}

	private String atletizmeBasladigiTarih;
	private double maxMesafe;
	private int katildigiYarismaSayisi;
	

	
	public String SporcuProfili() {
		return "Merhaba, ben "+ Integer.toString(super.SporcuNo)+" nolu Milli Atletim. Atletizme "+ atletizmeBasladigiTarih+" tarihinde baþladým. Toplam "+ katildigiYarismaSayisi+ " yarismaya katýldým ve maximum "+maxMesafe+ " metre atladým.";
	}

	public String getAtletizmeBasladigiTarih() {
		return atletizmeBasladigiTarih;
	}

	public double getMaxMesafe() {
		return maxMesafe;
	}

	public int getKatildigiYarismaSayisi() {
		return katildigiYarismaSayisi;
	}

	public void setAtletizmeBasladigiTarih(String atletizmeBasladigiTarih) {
		this.atletizmeBasladigiTarih = atletizmeBasladigiTarih;
	}

	public void setMaxMesafe(double maxMesafe) {
		this.maxMesafe = maxMesafe;
	}

	public void setKatildigiYarismaSayisi(int katildigiYarismaSayisi) {
		this.katildigiYarismaSayisi = katildigiYarismaSayisi;
	}
	
	
	
	
	

}
