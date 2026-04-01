import java.util.Scanner;

class ascii{

	public static void main(String vrgs[]){

	Scanner sc = new Scanner(System.in);
	

	System.out.println("Enter any ASCII Character :- ");
	char ch = sc.next().charAt(0);

	int asciiValue = (int) ch;

	System.out.println("ACCII value of " +ch+ " is :- "+asciiValue);
	

	System.out.println("Enter ASCII value :- ");
	int ascii =sc.nextInt();
	char character = (char) ascii;
	System.out.println("Character for ASCII value" +ascii+ " is :-"+character);



}	

}