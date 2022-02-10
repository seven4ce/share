package Code.String;

public class PintStringkelipatanGanjil {

	public static void main(String[] args) {
		for (int nomor=1; nomor <= 100; nomor++){

		    if(nomor%3 ==0) {
		    	System.out.println("mam");
		    } if (nomor%5 ==0) {
		    	System.out.println("pu");
		    }
		    if(nomor% 15 ==0) {
		    	System.out.println("mampu");
		    }
		    if(nomor% 3 ==0||nomor% 5 ==0||nomor% 15 ==0) {
		    	System.out.print("");
		    }else{
		    	System.out.println(nomor);
		    }
		}
		// System.out.println ("hasil outputnya");
		System.out.println ("perulangan for bil kelipatan 3, 5, 15");

	}

}
