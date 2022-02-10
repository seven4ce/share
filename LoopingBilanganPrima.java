package Code.Numeric;

public class LoopingBilanganPrima {

	public static void main(String[] args) {

		for(int i=2; i<20; i++) {
			
            boolean isPrima = true;
            
            for (int j = 2; j < i; j++) {
            	
//            	System.out.println(" i : "+i);
//            	System.out.println(" j : "+j);
            	
                if(i%j==0){
                    isPrima = false;     
                }
            }
            
            if(isPrima==true){
                System.out.println(i+",");
            }
        }
		// System.out.println ("hasil outputnya");
		System.out.println("perulangan for bil prima");

	}

}
