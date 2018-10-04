// Assignment #: 11
// Name:	Dean Styx
// StudentID: 1208950336
// Lecture:		TuesThurs 10:30-11:45
// Description: TO BE COMPLETED


//We will be using LinkedList as a Queue
import java.util.LinkedList;
import java.util.Queue;

public class PrimeComputing 
 {
  private int n, lastPrime, primeCount;
  private LinkedList<Integer> originalQueue;
  private LinkedList<Integer> primeQueue;
  private LinkedList<Integer> backupQueue;
  

  //Constructor to initialize all queues
  public PrimeComputing(int enteredNum)
   {
      originalQueue = new LinkedList<Integer>();
      primeQueue = new LinkedList<Integer>();
      backupQueue = new LinkedList<Integer>();
      n = enteredNum;
      
      
      for(int i = 2; i<=n; i++ ) {
    	  
    	  originalQueue.add(i);//initialize queue to contain all integers up to n
    	  
      }
   }

  // computes all prime numbers up to some n
  public void computePrimesUpToN() 
   {
       int nextPrime = 2;
       lastPrime = 2;
       
       
       
       System.out.println("\nProcessing......");
       
       do {
           //1. Remove the first element in the original queue of integers
           //and set the next prime "nextPrime" to be the number
           
    	   
    	   nextPrime = originalQueue.getFirst();
           originalQueue.removeFirst();
           
           System.out.println("The next prime to divide: " + nextPrime);
           

           //2. Enqueue the next Prime into the primeQueue.
           
           primeQueue.add(nextPrime);
           

           
           
           //3. Go through the integers in the original queue,
           //and eliminate any number that is divisible by the next prime
           //HINT: you will need to remove each integer from the original queue
           //to examine them, and put back the integers that are NOT
           //divisible by the next prime.
           //This is where you will need a back up queue.
           //Also, you will need to keep track of the last such prime
           //that is used to divide other integers in the original queue.

           while(!originalQueue.isEmpty()) {//while the original queue is not empty, go through and add each prime number to backup then add all values of back up to original
        	   
        	   if(originalQueue.getFirst() % nextPrime ==0) {//if the first value is divisible by next prime
        		   
        		   
        		   originalQueue.removeFirst();
        	   }// end of if statement
        	   else {//if the first value is not divisble by next prime
        		   backupQueue.add(originalQueue.getFirst());
        		   
        		   
        		   originalQueue.removeFirst();//removes the value from the original queue 
        		   
        			   
        	   }// end of else statement
        	   
        	   
           }//end of while original queue is not empty loop
           
           
           while(!backupQueue.isEmpty()) {//start of while back up is not empty, this while loop puts all values back into the original list to run through again during the do loop
        	   
        	   
        	   originalQueue.add(backupQueue.getFirst());
        	   backupQueue.removeFirst();
        	   
           }//end of while back up is not empty
           
           //make it so lastPrime is the value of the next prime before nextprime changes
           lastPrime = nextPrime;
           
       } while (nextPrime <= Math.sqrt(n));
    
       
       //4. Transfer all remaining integers in the original queue
       //to the prime queue.
 
       while(!originalQueue.isEmpty()) {//transfer all remaining prime numbers
    	   primeQueue.add(originalQueue.getFirst());
    	   originalQueue.removeFirst();
       }
       
   }

  //It prints out all primes up to N, by displaying 10 prime numbers
  //in each line.
  public void printResults()
     {
         System.out.println("\n-----------------------");
         System.out.println("The prime(s) up to " + n);
         System.out.println("-----------------------");
         
         int count = 0;
         primeCount = 0;
         
         while (primeQueue.isEmpty() == false)
         {
             int primeNum = primeQueue.remove();
             System.out.print(primeNum + "\t");
             
             count++;
             //displaying 10 primes in each line
             if (count%10 == 0)
                 System.out.print("\n");
         }
         System.out.println("\n-----------------------");
         primeCount = count;
     }
     
  // It returns the largest prime that was used to divide other integers
  // in the original queue. Note that this is not the largest prime found.
  public int getMaxPrime()
     {
         return lastPrime;
     }
    
  // It return the count of prime numbers up to n
  public int getCount()
     {
         return primeCount;
     }
}
