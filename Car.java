class Model{
	static String[] cars={"Benz","XUV","Quanta","Bolero","Indica","Duster"};
		static void printAll(){
			for(int index=0;index<cars.length;index++){
				System.out.println(cars[index]+"\t");
			}
		}
		static void nextline()
		{
		int num=1;
		for(int index=0;index<cars.length;index++)
		{	
			if(num==6)
			{
				System.out.println();
		}
		num++;
		}
}
public static void main(String []args)
{
printAll();
cars[2]="Mercedez";
printAll();
}
}
