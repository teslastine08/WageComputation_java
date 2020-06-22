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
	{
	if(num < 30)
	{
	System.out.println("Part time wage: Rs."+(num*parthr*wph));
	}

	else
	{
	System.out.println("Data provided wrong");
	}
	}


	Random rand1 = new Random();
	int attain = rand.nextInt(20);
	System.out.println("Attandance 2: "+attain);
	System.out.println("Monthly wage limiting to 20 days: Rs."+(wph*fdh)*attain);
	
	int z = ((wph*fdh)*attain);
	int th=100;
	int y = ((wph*fdh)/fdh*th);
	

	if(z<y)
	{
	System.out.println("Limited wage: Rs."+z);
	}
	else
	{
	System.out.println("Limited Wage: Rs."+y);
	}
	}

}



