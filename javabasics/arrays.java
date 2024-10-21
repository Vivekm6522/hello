package javabasics;

public class arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {1,7,5,10,17};
		int temp=0;
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]>a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		
	for(int b:a)	{
		System.out.print(b  + "  ");
	}
		

	}

}
