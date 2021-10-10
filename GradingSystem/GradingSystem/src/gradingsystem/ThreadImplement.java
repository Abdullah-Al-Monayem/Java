package gradingsystem;

import gradingsystem.ThreadImplement.ThreadA;
import gradingsystem.ThreadImplement.ThreadB;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ThreadImplement {

    synchronized static public void Method(int n) throws InterruptedException {

        if (n == 50) {
            for (int i = 1; i <= n; i++) {
                System.out.println("A : " + i);
                Thread.sleep(500);
            }
        } else if (n == 100) {
            for (int i = n; i >=50; i--) {
                System.out.println("B : " + i);
                Thread.sleep(1000);
            }

        }

    }

   
   static  class ThreadA extends Thread {

       
        @Override
        public void run() {
            try {
                // Displaying the thread that is running
                Method(50);

            } catch (Exception e) {
                // Throwing an exception
                System.out.println("Exception is caught");
            }
        }

    }

  static  class ThreadB extends Thread {

         @Override
        public void run() {
            try {

                Method(100);
                // Displaying the thread that is running
                /* 
                
                 */
            } catch (Exception e) {
                // Throwing an exception
                System.out.println("Exception is caught");
            }
        }

    }

}

class Main extends ThreadImplement{

    public static void main(String[] args) {

        ThreadA a = new ThreadA();
        ThreadB b = new ThreadB();
      //  a.setPriority(Thread.MAX_PRIORITY);
      //  b.setPriority(Thread.MIN_PRIORITY);
         a.setPriority(10);
         b.setPriority(5);
        a.start();
        b.start();
    }

}
