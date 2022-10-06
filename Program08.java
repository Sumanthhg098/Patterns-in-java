
public class Program08 {

	public static void main(String[] args) {
		int k=1 , u=10;
		for(int i=1 ; i<=5 ; i++)
		{
			for(int j=1 ; j<=i ; j++)
			{
				System.out.print( "1");
			}
			for(int j=1 ; j<=6-i ; j++)
			{
				System.out.print(" ");
			}
			for(int j=1 ; j<=5-i ; j++)
			{
				System.out.print(" ");
			}
			for(int j=1 ; j<=i ; j++)
			{
				System.out.print(  "1");
			}
			
			System.out.println();
		}
	}
}
//output
//1         1
//11       11
//111     111
//1111   1111
//11111 11111
