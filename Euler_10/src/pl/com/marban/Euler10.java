package pl.com.marban;

public class Euler10 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		long startTime = System.currentTimeMillis();
		
		//jakis tam komentarz
		sitoEratostenesa(2000000);
		
		long endTime = System.currentTimeMillis();
		
		
		System.out.print(" czas zajety na obliczenia :" +(endTime-startTime) + " [miliseconds] ,  "+(endTime-startTime)/1000+" [seconds]");
	}


	private static void sitoEratostenesa(int base) {
		int N = base;
        boolean[] numbersTable = new boolean[N+1];
        for(int i = 2; i*i <= N; i++)
        {
            if (numbersTable[i] == true)
                continue;
            for (int j = 2 * i ; j <= N; j += i)
                numbersTable[j] = true;
 
        }
        System.out.println("Liczby pierwsze z przedzia³u od 2 do " + N + ":");
        long sum = 0;
        for (int i = 2; i <= N; i++)
            if (numbersTable[i] == false){
            	sum = sum + i;
            }
 
		
		System.out.print(" suma pierwszych dla "+base+" wynosi "+sum);
	}
}
