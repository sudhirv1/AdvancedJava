package AdvancedJava.Multithreading;
//Exercise Section 2.2.a
// public class two{
//     private static int num = 0;

//     public void inc(){
//         num++;
//     }

//     public static void main(String[] args){
//         two Two = new two();
//         for(int i = 0; i < 1000000; i++){
//             Thread thread = new Thread(Two::inc);
//             thread.start();
//         }
//         System.out.println(num);
//     }
// }

// Exercise Section 2.2.b
public class two {
    private static int num = 0;

    public void inc() {
        synchronized(this){ // Only changed line from a to b
            num++;
        }
    }
    public static void main(String[] args) {

        two Two = new two();
        for (int i = 0; i < 1000000; i++) {
            Thread thread = new Thread(Two::inc);
            thread.start();
        }
        System.out.println(num);
    }
}
