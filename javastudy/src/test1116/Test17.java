package test1116;

 
class Outer {
    static class Inner {
          int iv=200;
    }
}


public class Test17 {
  public static void main(String[] args) {
 
	  Outer.Inner in = new Outer.Inner();
	  System.out.println(in.iv);

		/*
		StringBuffer a = new StringBuffer("A");
		StringBuffer b = new StringBuffer("B");
		
		System.out.println("main1 : " + a.hashCode()+", a:"+a+","+b.hashCode()+",b:"+b);
		
		operate(a, b);
		System.out.println(a + "," + b);
		System.out.println("main2 : " + a.hashCode()+", a:"+a+","+b.hashCode()+",b:"+b);
		*/
  }
  
  static void operate(StringBuffer x, StringBuffer y) {
	  System.out.println("operate1 : " + x.hashCode()+", x:"+x+","+y.hashCode()+",y:"+y);
	  x.append(y);
	  //System.out.println(x);
	  System.out.println("operate2 : " + x.hashCode()+", x:"+x+","+y.hashCode()+",y:"+y);
	  y = x;
	  //System.out.println(y);
	  System.out.println("operate3 : " + x.hashCode()+", x:"+x+","+y.hashCode()+",y:"+y);
  }
}