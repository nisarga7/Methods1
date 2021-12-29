class Color{
	static String[] divine={"Black","White","Safron","Blue","Green","Purple"};
		static void printOne(){
			for(int index=0;index<divine.length;index++){
				System.out.println(divine[index]+"\t");
			}
		}
		static void nextline()
		{
		int num=1;
		for(int index=0;index<divine.length;index++)
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
divine[1]="Pink";
nextline();
printOne();
}
}
