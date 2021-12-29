class Hotel{
	static String[] food={"idli","vada","uppit","pulav","puri","biriyani"};
		static void SaiSagar(){
			for(int index=0;index<food.length;index++){
				System.out.println(food[index]+"\t");
			}
		}
		static void newline()
		{
		int num=1;
		for(int index=0;index<food.length;index++)
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
SaiSagar();
food[1]="idlivada";
newline();
SaiSagar();
}
}
