/**
 * @author Drew Donohue //include this tag in your classes with your name
 * 
 * Assignment Instructions:
 * 	- Right click on the src folder and create a new package.
 * 	- Name the package "lastName_firstName", replacing lastName with your last name and firstName with your first name.
 * 	- Inside that package, create a new class "Exercises".
 *    - YOU SHOULD ONLY BE MAKING CHANGES IN THIS PACKAGE
 * 	- Create a javadoc comment at the top with the '@author' tag with your name next to it (do this for all classes you create)
 * 	- Create the following static methods:
 * 		- int threeAndFive() : Returns the sum of all the multiples of 3 or 5 below 1000
 * 		- int evenFibSum() : Returns the sum of the even-valued terms less than 4 million in the Fibonacci Sequence
 * 		- int largestPrimeFactor() : Returns the largest prime factor of the number 600851475143
 * 	- Create a separate Driver class and test your program by outputting the answers to your static methods
 *
 * Submission Instructions:
 *  - Save your saved work on Eclipse - your workspace should be the file location of the cloned repo
 *  - In GitHub Desktop, add your summary and commit your changes
 *  - Then push your commits to GitHub
 *  - Go to your repo on GitHub.com
 *  - Click "New pull request"
 *  - Click "Create pull request"
 *  - In the summary for your request, put your first and last name
 *  - Send the request
 * 
 * 
 */
package Donohue_Drew;
public class Exercises 
{
		public static int threeAndFive()
		{	
			//Returns the sum of all the multiples of 3 or 5 below 1000
			
			int total = 0;
			for(int x = 0; x < 1000; x++)
			{
				if (x % 3 == 0 || x % 5 == 0)
				{
					total += x;
				}
			}
			
			return total;
		}
		
		public static int evenFibSum()
		{
			//Returns the sum of the even-valued terms less than 4 million in the Fibonacci Sequence
			int count = 4000000;
			int total = 0;
			int num1 = 1 , num2 = 0;
			
			 while(num1 < 4000000)
			 {
				  if(num1 % 2 == 0)
				  {
					  total += num1;
				  }
				  
				  int temp = num2;
				  num2 = num1;
				  num1 = num1 + temp;
			 }   
			 return total; 
		}
		
		public static long largestPrimeFactor()
		{
			//Returns the largest prime factor of the number 600851475143
			
			long maxPrime = -1;
			long n = 600851475143L;
			for (int i = 3; i <= Math.sqrt(n); i+=2) 
			{ 
				while (n % i == 0) 
				{ 
					maxPrime = i; 
					n = n/i;
				} 
			}
			
			if (n > 2)
			{
				maxPrime = n;
			}
				 
				return maxPrime; 
		}

}