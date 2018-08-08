package SeleniumAssignment;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;
class cam{
	String mid;
	String name;
	Date doj;
	public cam(String name,Date doj) {
		this.name=name;
		this.doj=doj;
	}
	
}

public class Assig2 {


	public static void main(String[] args) throws ParseException {
	HashMap<String,cam> h=new HashMap<String,cam>();
		Scanner in=new Scanner(System.in);
		cam [] c=new cam[3];
		for( int i=0;i<3;i++) {
			String mid=in.next();
			String name=in.next();
			String doj=in.next();
			SimpleDateFormat format=new SimpleDateFormat("dd:mm:yyyy");
			Date dt=(Date) format.parse(doj);
			c[i]=new cam(name,dt);
			h.put(mid,c[i]);
		}
		Date[] d=new Date[3];
		for( int i=0;i<3;i++) {
			d[i]=c[i].doj;
		}
for( int i=0;i<3;i++) {
	for( int j=0;j<3;j++) {
		if(d[i].compareTo(d[j])>0) {
			Date temp=d[i];
			d[i]=d[j];
			d[j]=temp;
			
		}
	}
		
}
for(int i=0;i<3;i++)
	System.out.println(d[i]);
for(int i=0;i<3;i++) {
	for(Entry<String,cam> e : h.entrySet()) {
		c[i]=e.getValue();
		if(d[i].equals(c[i].doj)) {
			System.out.println(e.getKey()+" "+ c[i].name+ " "+ c[i].doj);
		}
		
	}
}

	}

}
