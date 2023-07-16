package JulyRideBillCalculator;
import java.util.Scanner;
public class JulyRideBillCalculator {

	public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the height in cm: ");
        int height = sc.nextInt();
        int totalBill=0;
        if(height>120){
            System.out.println("Can ride");
            System.out.print("Enter your age in years : ");
            int age=sc.nextInt();

            if(age>0 && age<12){
                totalBill=5;
            }
            else if(age>=12 && age<18){
                totalBill=7;
            }
            else if(age>=18 && age<45){
                totalBill=12;
            }
            else if(age>=45 && age<=55){
                totalBill=0;
            }
            else{
                System.out.println("Can't Ride");
            }
            System.out.print("want photos? : ");
            String photos=sc.next();
            if(photos.equalsIgnoreCase("yes")){
                totalBill=totalBill+3;
                System.out.println("The total bill is : $"+totalBill);
            }
            else if(photos.equalsIgnoreCase("no")){
                System.out.println("The total bill is : $"+totalBill);
            }
            else{
                System.out.println("INVALID INPUT");
            }
        }
        else{
            System.out.println("Can't ride");
        }
		

	}

}
