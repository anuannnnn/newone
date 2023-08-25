import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter array limit"+ "?");
		Scanner sc = new Scanner(System.in);
		int l=sc.nextInt();
        int[] arra = new int[l];
       
		for(int i=0;i<arra.length;i++)
		{
			arra[i]=sc.nextInt();
		}
		for(int i=arra.length-1;i>=0;i--)
		{
			System.out.println(arra[i]+"");
		}
	}

}
