
public class Program09 {

	public static void main(String[] args) {
		int m=1;
		for(int i=1 ; i<=5; i++)
		{
			for(int j=1 ; j<=i ; j++)
			{
				System.out.print("["+m++ +"] ");
			}
			System.out.println();
		}
	}
}
//output
//[1] 
//[2] [3] 
//[4] [5] [6] 
//[7] [8] [9] [10] 
//[11] [12] [13] [14] [15] 
