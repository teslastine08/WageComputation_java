import java.util.Random;
import java.util.Scanner;
public class wage
{

	public static void main(String args[])
	{
	
	 int wph = 20;
	 int fdh = 8;
	 int parthr = 8;
	 int num;

	 Scanner in = new Scanner(System.in);

	 System.out.println("Welcome to wage computation");





         Random rand = new Random();

         int attan = rand.nextInt(30);

         System.out.println("Attandance: "+attan);



	 System.out.println("Daily employee wage: Rs."+(wph*fdh));

	 System.out.println("Employee monthly wage: Rs."+((wph*fdh)*attan));



	System.out.println("Enter part time Days: ");
        num = in.nextInt();

	switch (num)
	{
	case 1:
	if(num < 30)
	System.out.println("Part time wage: Rs."+(num*parthr*wph));
	break;

	default:
	System.out.println("Data provided wrong");
	break;

	}
	}

}

