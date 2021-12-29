class God
{
	static String[] bless ={"Banashankari","Renukadevi","Ganesha","Laxmi","Mahalaxmi","Hanuman"};
		static void peace(){
			for(int index=0;index<bless.length;index++){
				System.out.println(bless[index]+"\t");
			}
		}
		static void nextline()
		{
		int num=1;
		for(int index=0;index<bless.length;index++)
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
peace();
bless[1]="Bhajarangi";
nextline();
peace();
}
}
