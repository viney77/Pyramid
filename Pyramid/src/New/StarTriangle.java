package New;

public class StarTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   int i, j;
   for(i=1; i<=5; i++)
   {
   for(j=1; j<=i; j++)
   {
   System.out.print(i + " ");
   }
    System.out.println();
   }
  
   for (i = 4; i >0; i--) 
   {
   for (j = i; j>0; j--) 
   {
	System.out.print(i + " ");
    }
    System.out.println();

   }
   } 
}
