// Exercise Section 2.1
public class one implements Runnable{
    //2.1.a and 2.1.b
    // public void run() {
    //     System.out.println("Hello World!");
    // }

    //2.1.c
    public void run() {
        System.out.println("Hello World!" + "    | printed from thread: " + Thread.currentThread().getName());
    }


    public static void main(String[] args) {
        //2.1.a
        //new Thread(new one()).start();

        //2.1.b and 2.1.c
        for (int i = 0; i < 5; i++){
            new Thread(new one()).start();
        }
    }
}