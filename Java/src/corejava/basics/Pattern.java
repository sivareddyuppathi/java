package corejava.basics;

public class Pattern {
	
public String Fourlines(int n)
	{
	    String res="";
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				//System.out.print("*");
				res+="*"+" ";
		}
			//System.out.println();
			res+="\n";
		}
		return res;
	
	}

	public static void main(String[] args) {
	    Pattern p=new Pattern();
	    String s= p.Fourlines(5);
	    System.out.println(s);
	    

	}

}
