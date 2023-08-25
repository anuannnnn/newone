import java.util.Scanner;

public class gh {

	private int num;
	private String s;
	
	

    
public gh()
{
	this.num=6;
	this.s="jj";
}


	public gh(int num, String s) {
		// TODO Auto-generated constructor stub
		this.num=num;
		this.s=s;
		
	}



	public int getNum() {
		return num;
	}



	public void setNum(int num) {
		this.num = num;
	}



	public String getS() {
		return s;
	}



	public void setS(String s) {
		this.s = s;
	}
	public static void main(String[] args) {
		gh s=new gh(2,"ll");
		System.out.println(s.getNum());
		
	    
    }
 }