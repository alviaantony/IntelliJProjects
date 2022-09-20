public class RunnableExample {
    public static void main(String[] args){
        //Anonymous class
        Thread myThread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread from Runnable interface");
            }
        });
        myThread.start();

        //Lambda
        Thread myThreadLambda = new Thread(() -> System.out.println("Thread from Runnable interface using Lambda"));
        myThreadLambda.start();
    }
}
