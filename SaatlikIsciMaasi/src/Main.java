import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		String isim,soyisim;
		long tc;
		int saat,wage;
		
		System.out.println("Isim Soyisim: ");
		isim = input.next();
		soyisim = input.next();
		System.out.println("TC:");
		tc=input.nextLong();
		System.out.println("Kac saat:");
		saat=input.nextInt();
		System.out.println("Saatlik ucret:");
		wage=input.nextInt();
		
		HourlyEmployee e = new HourlyEmployee(isim,soyisim,tc,saat,wage);
		Employee d = new Employee(isim,soyisim,tc);
		
		System.out.println(e.write());
		
		
	}

}
