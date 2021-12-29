class Cosmetics
{
	static String[] flavor ={"Lotion","Primer","Foundation","Compact","Cream","Powder"};
		static void brand(){
			for(int index=0;index<flavor.length;index++){
				System.out.println(flavor[index]+"\t");
			}
		}
		static void nextline()
		{
		int num=1;
		for(int index=0;index<flavor.length;index++)
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
flavor[1]="Perfume";
nextline();
brand();
}
}
