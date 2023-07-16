 package waterbill;
import java.util.*;

public class water {
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Read Number of units consumed");
		int meter_charge = 75;
		int number_Unit_consumed=sc.nextInt();
		int charge=0;
		if (number_Unit_consumed<=100)
		{
			charge=number_Unit_consumed*5;
			int total=charge+ meter_charge;
			System.out.println(total);
		}
		else{
			if(number_Unit_consumed<=250) {
				charge=number_Unit_consumed*10;
				int total=charge+ meter_charge;
				System.out.println(total);
			}
			else {
				charge=number_Unit_consumed*20;
				int total=charge+ meter_charge;
				System.out.println(total);
			}
		}
		
		
	}
	

}
