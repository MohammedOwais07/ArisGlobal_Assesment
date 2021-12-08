package com;
interface lengthstg{
	abstract int lengthofstg(String stg);
}
interface square{
	abstract int squareofnum(int n);
}

public class lamb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		lengthstg l1=(String stg)->stg.length();
		
		int ans=l1.lengthofstg("Owais");
		System.out.println(ans);

		square sq=(int n)->n*n;
		int ans1=sq.squareofnum(2);
		System.out.println(ans1);
		
		
	}

}
