import java.util.Scanner;

class pattern{
	

	public static void main(String vrgs[]){

	Scanner sc = new Scanner(System.in);

	int i,j;
	System.out.println("Enter any number :- ");
	int n = sc.nextInt();
	for(i=1;i<=n;i++){
	for(j=1;j<=i;j++){
	System.out.print("*");
	}
	System.out.println("");
}
}
}