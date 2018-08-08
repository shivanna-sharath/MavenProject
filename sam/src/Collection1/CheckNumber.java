package Collection1;

import java.awt.List;

public class CheckNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] input= {"10.29","1234a5","12.0.0"};
		Rto object=new Rto();
	     String[] actual=object.validate(input);
		for( String s:actual)
		{
			System.out.println(s);
		}
		}

	}


