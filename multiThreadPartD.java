package multithread11;

import java.util.Random;
import java.util.Scanner;

//Create multiple threads.

class RunnerThread extends Thread implements Runnable {
			String name; // name of thread
		    private Thread t;
		    private int j;
		    private int m;
		    private int n;
		    
//creating object instance
		    
RunnerThread(String threadname, int i, int k, int a) {
			name = threadname;
			j=i;
			m=k;
			n=a;
			t = new Thread(this, name);
			


}

//Running thread methods

	public void run() {
	int b[]= new int [9];
			
		try {
					
				for(b[m]=0; b[m] <=1000; b[m]+=n) {
					System.out.println(name +" " +(m+1) +": " + b[m]);
					if(b[m]==1000)
					{
						break;
					}
					Thread.sleep(j);	
					}
					} 
			catch (InterruptedException e) {
					System.out.println(name + "Interrupted");
					}
		}
		

}

//main class

public class multiThreadPartD {

		//@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter no of Racers in the game");
		
		Scanner scanner = new Scanner(System.in);
		
		int input = Integer.parseInt(scanner.nextLine());
		
		Random rando = new Random();
		
		int sleepTime[]=new int [input];
		int number[]=new int [input];
		int stepSize[]= new int[input];
		
		//assigning random step_size and sleep_time
		for(int i=0;i<input;i++)
		{
				number[i]=i;
				sleepTime[i] = rando.nextInt(9) + 1; 
		}
		
		//passing the parameters to the thread constructor
		
		Thread t[]= new RunnerThread [input]; 
		for(int i=0;i<input;i++)
		{
		t[i]=new RunnerThread("Racer",sleepTime[i]*500,number[i],sleepTime[i]*10); 
		}

		// start threads
		
		for(int i=0;i<input;i++)
		{
		t[i].start();
		}
		
		//checking the whether thread is alive or not
		
	   boolean x= true; 
	    while(x) {
    	for(int j=0;j<input;j++)
    	{
        if (t[j].isAlive()==false ) 
        {
        	x= false;
        	System.out.println("Racer "+(j+1)+ " Wins the Race.");
        	for(int k=0;k<input;k++)
        	{
        	t[k].stop();
        	}
        	
        break;	
        	}
    	}
    } 


	 	try {
			// wait for other threads to end
	 			Thread.sleep(10000);
			}
	 	catch (InterruptedException e) 
	 		{
	 			System.out.println("Race abandoned");
			}
				System.out.println("Congratulations to the winner.");

	}

}
