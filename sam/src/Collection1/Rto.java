package Collection1;

public class Rto {
	/**
	 * @param num
	 * @return
	 */
public String[] validate(String[] num) {
			
		
		int size,len,i,j,k;
		int flag1,flag2,flag3;
		double n;
		char c;
		size=num.length;
		for(i=0;i<size;i++)
		{
			len=num[i].length();
			n=0;
			flag1=0;
			flag2=0;
			flag3=0;
			for(j=0;j<len;j++)
			{
				c=num[i].charAt(j);
				if(c>='0'&&c<='9')
					flag1=1;
				else if(c=='.')
				{
					if(flag2==1)
					{
						flag3=1;
					}
					else
					{
						flag2=1;
					}
					}
				else
					flag3=1;
				
				}
		
			if(flag3==1)
			{
				if(flag2==1)
				{
					num[i]+=" invalid-decimal";
				}
				else
				{
					num[i]+=" invalid-integer";
				}
			}
			else
			{
				if(flag2==1)
				{
					num[i]+=" valid-decimal";
				}
				else
				{
					num[i]+=" valid-integer";
				}
			}
				
			
			
		
	
		}
		return num;
}
}
