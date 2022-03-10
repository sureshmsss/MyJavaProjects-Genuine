package com.it2;

public class Vr002 {

	public void foo(Object o){
		System.out.println("Object parameter");
	}
	public void foo(Number o){
		System.out.println("Number parameter");
	}
		public void foo(String s){
			System.out.println("Strins parameter");
		}
		public void foo(Integer i){
			System.out.println("Integer parameter");
		}
		public void foo(Double i){
			System.out.println("Double parameter");
		}
/*		public void foo(Float f){
			System.out.println("Float parameter");
		}
*/
/*		public void foo(int i){
			System.out.println("int parameter");
		}
		
		public void foo(long i){
			System.out.println("long parameter");
		}
*/		public void foo(double i){
			System.out.println("double parameter");
		}
		
		public static void main(String[] args) {

			Vr002 c1=new Vr002();
			float f1=110.02f;
			double d1=110.02;
			
		//	c1.foo(12);
		//	c1.foo(-120);
			c1.foo(f1);
		//	c1.foo(d1);
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			

/*			Object ob1=new Object();
			Object ob2="M S";
			Object ob3=new Integer(7279);

			c1.foo(ob1);
			c1.foo(ob2);
			c1.foo(ob3);
			System.out.println("---");
			c1.foo("MS");
			c1.foo(4001);
			System.out.println("---");
			c1.foo((String)ob2);
//			c1.foo((Integer)ob2);//RE: annot cast
			c1.foo((Integer)ob3);
			System.out.println("---");
//			c1.foo((String)ob1);//RE
//			c1.foo((Integer)ob1);//RE
//			c1.foo((String)ob3);//RE
//			c1.foo((Integer)ob1);/**/



			System.out.println("Hello World!");
		}
	}

