
public class Yuzucu extends MilliSporcu {
private String kasProfili;
private String yuzmeSekli;
private int yuzmeSaati;
public Yuzucu(String isim, char cinsiyet, String dogumTarihi, int sporcuNo, String kasProfili) {
	super(isim, cinsiyet, dogumTarihi, sporcuNo);
	this.kasProfili = kasProfili;
}

public String SporcuProfili() {
	return "Merhaba, ben "+Integer.toString(super.SporcuNo)+" nolu Y�z�c�y�m. Toplam "+this.yuzmeSaati+ " saat y�zd�m.";
}

public String getKasProfili() {
	return kasProfili;
}

public String getYuzmeSekli() {
	return yuzmeSekli;
}

public int getYuzmesaati() {
	return yuzmeSaati;
}

public void setYuzmeSekli(String yuzmeSekli) {
	this.yuzmeSekli = yuzmeSekli;
}

public void setYuzmesaati(int yuzmesaati) {
	this.yuzmeSaati = yuzmesaati;
}













}
