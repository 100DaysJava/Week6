package Patterns;
public class Pattern5 {
	public static void main(String[] args) {
		char i;
		char j;
		for( i ='A'; i<='E';i++) // rows
		{
			for( j='A'; j<='E';j++) // cols
			{
				System.out.print(j); //ABCDE
			}
			System.out.println();
		}
	} }
