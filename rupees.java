import java.util.Scanner;

class rupees{

	public static void main(String vrgs[]){

	Scanner sc = new Scanner(System.in);

	System.out.print("enter the amount of rupees :- ");
	double rupees = sc.nextDouble();

	System.out.print("enter the amount of dollar :- ");
	double dollar = sc.nextDouble();

	double ans = (rupees/dollar);

	System.out.println( rupees+ "current value of dollar is = "+ans+ "$");

	

}

}