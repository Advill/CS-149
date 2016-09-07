import java.util.*;
public class Coord911 {
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		System.out.println("What is the first name of the caller?");
		String fname = s.nextLine();
		System.out.println("What is the last name of the caller?");
		String lname = s.nextLine();
		System.out.println("What is the preferred name of the caller?");
		String prefname = s.nextLine();
		System.out.println("What is the location of the Incident?");
		String location = s.nextLine();
		System.out.println("What is the emergency code of the Incident?");
		String code = s.nextLine();
		System.out.println("What is the age of the caller?");
		String age = s.nextLine();
		System.out.println("What is the x-coordinate of the caller?");
		double x = s.nextDouble();
		System.out.println("What is the y-coordinate of the caller?");
		double y = s.nextDouble();
		System.out.println(fname + lname + "\nDate: 09/09/2016 \n" + 
					"age: " + age + "\nNickname: " + prefname +
					"\nStreet Adress: " + location + "\nCODE\tX	\tY" + 
					"----\t-\t-\n" + location + "\t" + x + "\t" + y +
					"\nBy land distance: " + (x + y) + "\nHelicopter Distance"
					+ (Math.sqrt(x*x + y*y)));//Yes, I could have done multiple println statements
					//but i wanted to test if I still remembered how to make it work like this
	}
}
