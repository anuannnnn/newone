
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int a[]={2,6,13,8,1,6,7,8,15};
		boolean ispr=true;
		int count=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					count++;
					if(count==2)
					{
						
						ispr=false;
						break;
					}
					
					System.out.println(a[i]);
					
				}
			}
		}
		if(ispr)
		{
			System.out.println("jj");
		}
		else
		{
			System.out.println("ll");
		}
	}

}
