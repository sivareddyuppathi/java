package inhertance;

public class Test {

	int a;
	//string name;
	Test(int z)
	{
a=z;
	}
	void m1()
	{
		System.out.println(a);
	}
	public static void main(String[] args) {
		Test t=new Test(10);
		t.m1();
		

	}

}
