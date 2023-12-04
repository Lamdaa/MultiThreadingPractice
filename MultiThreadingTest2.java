public class MultiThreadingTest2 implements Runnable {
    @Override
    public void run() {
        for(int i=1;i<=10;i++){
            if(i%5==0){
                System.out.println(Thread.currentThread().getName()+" with Thread id: "+Thread.currentThread().threadId()+" and "+i+"th iteration is entering Sleep mode");
                try {
                    Thread.sleep(2000);

                } catch (Exception e) {
                }
                System.out.println(Thread.currentThread().getName()+" with Thread id: "+Thread.currentThread().threadId()+" and "+i+"th iteration is exiting Sleep mode");

            }
            System.out.println("Hello there currently I am in Thread "+Thread.currentThread().getName()+" with Thread id: "+Thread.currentThread().threadId()+" and "+i+"th iteration");
        }
    }
}
