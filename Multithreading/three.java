package AdvancedJava.Multithreading;
//Exercise section 2.3
public class three {
    private static int num = 0;
    private boolean done = false;

    // Exercise section 2.3.a
    // public void inc() {
    //     for (int i = 0; i < 1000000; i++) {
    //         num++;
    //     }
    // }

    // Exercise section 2.3.b
    public synchronized void inc() {
        for (int i = 0; i < 1000000; i++) {
            num++;
        }
        done = true;
        notifyAll();
    }

    // Exercise section 2.3.a
    // public void getNum() {
    //     System.out.println(num);
    // }

    // Exercise section 2.3.b
    public synchronized void getNum(){
        while(!done){
            try{
                wait();
            }
            catch(InterruptedException e){};
        }
        System.out.println(num);
    }

    //main for both a & b
    public static void main(String[] args) {
        three Three = new three();
        Thread thread = new Thread(Three::inc);
        Thread threadTwo = new Thread(Three::getNum);
        thread.start();
        threadTwo.start();
    }
}
