import java.util.Scanner;

public class ccbasjn{
	public static void main (String []args){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("masukan angka:");
		int angka = sc.nextInt();
		
		if(angka<0){
			System.out.println(angka + "ini bilangan negatif");
		}
		else{
			System.out.println(angka + "ini bilangan positif");
		}
	}
}
			