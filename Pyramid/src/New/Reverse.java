package New;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int i, j;
        
        for(i=1; i<=5; i++){
        	for(j=0; j<i; j++){
        		System.out.print(j+1 + " ");
        		}
        	System.out.println("");
        }
        	
        for(i=4; i>0 ;i--){
            
            for(j=0; j < i; j++){
                    System.out.print(j+1 + " ");
            }
           
            System.out.println("");
    }
}
}
