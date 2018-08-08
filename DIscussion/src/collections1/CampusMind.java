package collections1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Map.Entry;


class cam {
	String mid;
	String name;
	String track;
	Date doj;

	public cam(String name, String track, Date doj) {
		this.name = name;
		this.track = track;
		this.doj = doj;

	}

}

public class CampusMind {

	public static void main(String[] args) throws ParseException {
		HashMap<String, cam> h = new HashMap<String, cam>();
		Scanner in = new Scanner(System.in);
		cam[] c = new cam[6];
		for (int i = 0; i < 6; i++) {
			String mid = in.next();
			String name = in.next();
			String track = in.next();
			String doj = in.next();

			SimpleDateFormat format = new SimpleDateFormat("dd-mm-yyyy");
			Date dt = (Date) format.parse(doj);
			c[i] = new cam(name, track, dt);
			h.put(mid, c[i]);

		}
		Date[] d = new Date[6];
		for (int i = 0; i < 6; i++) {
			d[i] = c[i].doj;

		}
		for( int i=0;i<6;i++) {
			for( int j=0;j<6;j++) {
				if(d[i].compareTo(d[j])>0) {
					Date n=d[i];
					d[i]=d[j];
					d[j]=n;
		}
			}
	}
		for(int i=0;i<6;i++)
			System.out.println(d[i]);
		for(int i=2;i<5;i++) {
			for(Entry<String,cam> e : h.entrySet()) {
				c[i]=e.getValue();
				if(d[i].equals(c[i].doj)) {
	
					System.out.println( c[i].name+ " "+ c[i].doj);
				
				
				}
				
				
			}
		}
		
}
}
