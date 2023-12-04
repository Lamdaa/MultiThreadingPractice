public class Main {
    public static void main(String[] args) {
        Thread t1 = new Thread(new MultiThreadingTest2());
        t1.setName("LAMDA");
        t1.start();
        Thread t2 = new Thread(new MultiThreadingTest1());
        t2.setName("SURAJ");
        t2.start();
    }
}
