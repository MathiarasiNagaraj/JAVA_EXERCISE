package Exercise_4;

import Exercise.Main;

public class EX2_Sample {
public void mth1()
{
	mth2();
	System.out.println("caller");
}
public void mth2()
{
	try {
		throw new Exception();
		//return
	}catch (Exception e)
	{
		System.out.println("catch-mth2");
		
	}
	finally {
		System.out.println("finally-mth2");
	}

}
public static void main(String[] args) {
	EX2_Sample s=new EX2_Sample();
	s.mth1();
}
}
