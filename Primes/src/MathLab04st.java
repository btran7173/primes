// MathLab0404st.java
// The "Sieve of Eratosthenes" Program
// This is the student, starting version of the MathLab04 assignment.



import java.text.DecimalFormat;
import java.util.Scanner;


 
public class MathLab04st
{
	static int max;
	public static void main(String args[]) 
	{
		// This main method needs additions for the 100 point version.
		Scanner input = new Scanner(System.in); 
		System.out.println("\nMathLab04\n");
		final int MAX = input.nextInt();
		max = MAX;
		boolean primes[];
		primes = new boolean[MAX];
		computePrimes(primes);
		displayPrimes(primes);
	}

	public static void computePrimes(boolean primes[])
	{
		System.out.println("\nCOMPUTING PRIME NUMBERS");
		for(int k=1; k < max; k++){
			primes[k]=true;
		}
		for(int i=2; i < max/2; i++)
		{
			if(primes[i])
			{
				for(int j = i*2; j < max; j+=i)
				{
					primes[j]= false;
				}
			}
		}
	}

	public static void displayPrimes(boolean primes[])
	{
		System.out.println("\n\nPRIMES BETWEEN 1 AND "+ primes.length);
				for(int i = 0; i < max; i++)
				{
					if(primes[i]==true)
					{
						System.out.print(i + " ");
					}
				}
	}
	
}



