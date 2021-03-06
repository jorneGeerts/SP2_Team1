package logic;

public class Adres {

	protected String straat;
	protected int huisnummer;
	protected int busnummer;
	protected String postcode;
	protected String woonplaats;
	protected String land;

	Adres(String straat, int huisnummer, int busnummer, String postcode, String woonplaats, String land) {
		this.straat = straat;
		this.huisnummer = huisnummer;
		this.busnummer = busnummer;
		this.postcode = postcode;
		this.woonplaats = woonplaats;
		this.land = land;
	}

	public String getStraat() {
		return straat;
	}

	public void setStraat(String straat) {
		this.straat = straat;
	}

	public int getHuisnummer() {
		return huisnummer;
	}

	public void setHuisnummer(int huisnummer) {
		this.huisnummer = huisnummer;
	}

	public int getBusnummer() {
		return busnummer;
	}

	public void setBusnummer(int busnummer) {
		this.busnummer = busnummer;
	}

	public String getPostcode() {
		return postcode;
	}

	public void setPostcode(String postcode) {
		this.postcode = postcode;
	}

	public String getWoonplaats() {
		return woonplaats;
	}

	public void setWoonplaats(String woonplaats) {
		this.woonplaats = woonplaats;
	}

	public String getLand() {
		return land;
	}

	public void setLand(String land) {
		this.land = land;
	}

	@Override
	public String toString() {
		String gegevens = straat + " " + huisnummer + " " + busnummer + "\n" + postcode + " " + woonplaats + "\n"
				+ land;
		return gegevens;
	}

}