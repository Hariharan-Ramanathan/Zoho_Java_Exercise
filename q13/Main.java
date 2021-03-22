//13. Write a simple thread program that starts two threads(producer and consumer), where the producer thread enques a random number in a Queue and the consumer thread de-queues the queue and prints whether the number is prime or not.

package q13;

import java.util.Random;

public class Main {
    public static boolean isPrime(int val){
            int count =0;
            for(int j=1;j<=Math.sqrt(val);j++){
                if(val%j == 0)
                    count++;
            }
            if(count == 1)
                return true;
            return false;
    }
    public static void main(String[] args) {
        queue product = new queue();

        Runnable producer = () -> { 
                    Random r = new Random();
                    for(int i=0;i<10;i++){
                        product.Enqueue(r.nextInt(100));
                        System.out.println("Enqeued");
                }
            };

        Runnable consumer =()->{
                    int val = 0;
                    for(int i=0;i<10;i++){
                        if(!product.isEmpty())
                            val = product.Dequeue();
                            System.out.println("Deqeued");
                        if(isPrime(val))
                            System.out.println(val+" Prime_number");
                        else
                            System.out.println(val+" Not a prime number");
                }

        };

        Thread t1 = new Thread(producer);
        Thread t2 = new Thread(consumer);

        t1.start();
        t2.start();

    }
}
