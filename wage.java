import java.util.Random;
public class wage
{

	public static void main(String args[])
	{
	
	int wph = 20;
	int fdh = 8;
	 System.out.println("Welcome to wage computation");

         Random rand = new Random();

         int attan = rand.nextInt(30);

         System.out.println("Attandance: "+attan);

	 System.out.println("Daily employee wage: Rs."+(wph*fdh));

	}

}
