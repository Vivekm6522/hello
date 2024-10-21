package javabasics;

public class operators {

	public void arithmetic() {
		int a = 10 , b =5;
		System.out.println("addition:"+(a+b));
		System.out.println("subtraction:"+(a-b));
		System.out.println("multiple:"+(a*b));
		System.out.println("divide:"+(a/b));
		System.out.println("modulus:"+(a%b));
	}
	
	public void relational() {
		int a = 10 , b = 5;
	System.out.println("a<b:"+(a<b));
	System.out.println("a>b:"+(a>b));
	System.out.println("a<=b:"+(a<=b));
	System.out.println("a>=b:"+(a>=b));
	System.out.println("a==b:"+(a==b));
	System.out.println("a!=b:"+(a!=b));	
		
	}
	
	
	/*AND && rendu condition true va irundha true
	 OR || ethachu oru condition true va irundhale true dha
	 NOT ! not true*/
	
	
	public void logical() {
		int a = 40 , b = 20 , c = 10 ;
		System.out.println("value 1:"+((a<b)&&(b<c)));
		
		System.out.println("value 2:"+((a<b)||(b<c)));
		
	}
	
	// assignment >> variable operator =expression 
	//eg a+=2 >> a=a+2
	
	public void assignment() {
	 int a=2,b=4,c=5;
	a+=4;
	b-=5;
	c*=5;
	System.out.println("value 1:"+a);
	System.out.println("value 2:"+b);
	System.out.println("value 3:"+c);
			
	}
	//syntax expression1? expression2 :expression 3
	public void conditional() {
		int a=2,b=1,c=(a>b)? a:b;
		if(c==a) 
		System.out.println("a is big");
		   else if (c==b)
		    System.out.println("b is big");
		    else {
		    	System.out.println("not valid");
		    }
		
	}
	
	public void bitwise() {
		int a = 6 , b= 8;
		//bitwise AND 
		System.out.println("a&b:"+(a&b));
		//bitwise OR
		System.out.println("a|b:"+(a|b));
		//bitwise exclusive OR
		System.out.println("a^b:"+(a^b));
		//
		
	}
     public void unary() {
    	 int x=10;  
    	 System.out.println(x++);//10 (11)  
    	 System.out.println(++x);//12  
    	 System.out.println(x--);//12 (11)  
    	 System.out.println(--x);//10  
    	 
    	 
    	 
    	 
}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
  operators i = new operators();
    i.conditional();
	}

}
