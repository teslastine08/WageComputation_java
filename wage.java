import java.util.Random;
import java.util.Scanner;
public class wage
{
public static final int is_part = 1;
public static final int is_full = 2;
public static final int  emp_rate_per_hour =20;

	public static void main(String args[])
	{
	
	 int emphrs = 0;
	 int empwage = 0;
	int empcheck = (int) Math.floor(Math.random() *10) % 3;
	switch (empcheck)
	{
	case is_part:
		emphrs = 4;
		break;
	case is_full:
		emphrs = 8;
		break;
	default:
		emphrs = 0;
	}
	empwage = emphrs * emp_rate_per_hour;
	System.out.println("empwage: Rs."+empwage);
	}

}

