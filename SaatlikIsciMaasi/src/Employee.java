
public class Employee {
	protected String adi,soyadi;
	protected long tc;
	
	protected Employee(String adi, String soyadi, long tc) {
		super();
		this.adi = adi;
		this.soyadi = soyadi;
		this.tc = tc;
	}
	protected String getAdi() {
		return adi;
	}
	protected void setAdi(String adi) {
		this.adi = adi;
	}
	protected String getSoyadi() {
		return soyadi;
	}
	protected void setSoyadi(String soyadi) {
		this.soyadi = soyadi;
	}
	protected long getTc() {
		return tc;
	}
	protected void setTc(long tc) {
		this.tc = tc;
	}
	
	protected String write() {
		return adi+" "+soyadi+" tc:"+tc;
	}
	
}
