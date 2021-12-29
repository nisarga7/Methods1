class Bikes
{
	static String[] company ={"Splender","Passion","TVS","RX","Pulsar","Apache"};
		static void brand(){
			for(int index=0;index<company.length;index++){
				System.out.println(company[index]+"\t");
			}
		}
		static void nextline()
		{
		int num=1;
		for(int index=0;index<company.length;index++)
		{	
			if(num==5)
			{
				System.out.println();
		}
		num++;
		}
}
public static void main(String []args)
{
brand();
company[1]="Activa";
nextline();
brand();
}
}
