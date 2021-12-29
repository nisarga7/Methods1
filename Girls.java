class Girls
{
	static String[] xworkz={"Ashtalaxmi","Shwetha","Pooja","Manjula","Muskan","Radhika"};
		static void java(){
			for(int index=0;index<xworkz.length;index++){
				System.out.println(xworkz[index]+"\t");
			}
		}
		static void nextline()
		{
		int num=1;
		for(int index=0;index<xworkz.length;index++)
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
java();
xworkz[1]="Anita";
nextline();
java();
}
}
