package collections1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Freq {

	public static void main(String[] args) {

		String s = "Hello this is test. The test is successful. But, this is not the end.";
		s = s.toUpperCase();

		s = s.replace(".", "");
		s = s.replace(",", "");
		String[] a = s.split(" ");

		HashMap<String, Integer> hm = new HashMap<String, Integer>();

		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
			Integer flag=hm.get(a[i]);
			if(flag==null)
			{
				flag=0;
			}
			
			hm.put(a[i], flag+1);
			
		}
		System.out.println("output :\n"+hm);
		for(Entry<String, Integer> r:hm.entrySet())
		{
			if(r.getValue()>1)
				System.out.println(r.getKey()+"-"+r.getValue());
		}
		System.out.println("\n\n");
		
	}
}
