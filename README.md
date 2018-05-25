# multithreading
Operation
•	This application simulates a race between two or more runners. The runners differ in their speed and how often they need to rest. One of the runners, named “Tortoise,” is slow but never rests. The other runner, named “Hare,” is ten times as fast but rests 90% of the time.
•	There is a random element to the runners’ performance, so the outcome of the race is different each time the application is run.
•	The race is run over a course of 1000 meters. Each time one of the runners moves, the application displays the runner’s new position on the course. The first runner to reach 1000 wins the race.
•	When one of the runners finishes the race, the application declares that runner to be the winner and the other runner concedes.
Specifications
•	Each runner should be implemented as a separate thread using a class named ThreadRunner. The ThreadRunner class should include a constructor that accepts three parameters: a string representing the name of the runner, an int value from 1 to 100 indicating the likelihood that on any given move the runner will rest instead of run, and an int value that indicates the runners speed—that is, how many meters the runner travels in each move.
•	The run method of the ThreadRunner class should consist of a loop that repeats until the runner has reached 1000 meters. Each time through the loop, the thread should decide whether it should run or rest based on a random number and the percentage passed to the constructor. If this random number indicates that the runner should run, the class should add the speed value passed to the constructor. The run method should sleep for 100 milliseconds on each repetition of the loop.
•	If the run method is interrupted, it should display a message that concedes the race and quits.
•	The main method of the application’s main class should create two runner threads and start them. One of the threads should be named “Tortoise.” It runs only 10 meters each move, but plods along without ever resting. The other thread should be named “Hare.” It should run 100 meters each move, but should rest 90% of the time.
•	This class should also include a method named finished that one of the threads can call when it finishes the race. That method should declare the thread that calls it to be the winner and should interrupt the other thread so it can concede the race.
•	The finished method should provide for the possibility that the two threads will finish the race at almost the same time. If that happens, it should ensure that only one of the threads is declared the winner. (There are no ties!

