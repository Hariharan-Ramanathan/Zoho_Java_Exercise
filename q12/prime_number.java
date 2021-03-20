package q12;

import java.lang.Math;

public class prime_number extends Thread {
        public void run(){
            for(int i=1;i<100;i++){
                int count = 0;

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }


                for(int j=1;j<=Math.sqrt(i);j++){
                    if(i%j == 0)
                        count++;
                }
                if(count == 1)
                    System.out.println(i);
            }
        }
}
