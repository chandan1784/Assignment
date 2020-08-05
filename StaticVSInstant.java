

public class StaticVSInstant{
	
	static int x=50; //class variable
	int p=50; // instance variable
  //System.out.println(x); //error ?

	public static void main(String[] args) {
	StaticVSInstant t=new StaticVSInstant();
	StaticVSInstant t1=new StaticVSInstant();
	int y=10;
	
	t.x=10;
	t1.x=20;

	t.p=100;
	t1.p=200;

	System.out.println("tp "+t.p);
	System.out.println("t1p "+t1.p);

	System.out.println("tx "+t.x);
	System.out.println("t1x"+t1.x);
	
	System.out.println(y);
	System.out.println(x);
	//System.out.println(p);// error:-Cannot make a static reference to the non-static field p

	}

}
