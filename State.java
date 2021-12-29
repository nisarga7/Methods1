class State{
	static String[] pride={"Karnataka","Kerala","Goa","Maharashtra","Gujarat","Andhra"};
		static void printOne(){
			for(int index=0;index<pride.length;index++){
				System.out.println(pride[index]+"\t");
			}
		}
		static void nextline()
		{
		int num=1;
		for(int index=0;index<pride.length;index++)
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
printOne();
pride[1]="Tamilnadu";
nextline();
printOne();
}
}
