
public class HourlyEmployee extends Employee {
	
	protected double saat,wage;

	protected HourlyEmployee(String adi, String soyadi, long tc, double saat, double wage) {
		super(adi, soyadi, tc);
		this.saat = saat;
		this.wage = wage;
	}

	protected double getSaat() {
		return saat;
	}

	protected void setSaat(double saat) {
		this.saat = saat;
	}

	protected double getWage() {
		return wage;
	}

	protected void setWage(double wage) {
		this.wage = wage;
	}
	
	
	protected double earnings() {
		double kazanc = saat*wage*30;
		return kazanc;
	}
	
	protected String write() {
		return super.write()+" Aylik kazanc: "+earnings();
	}
	
	
}
