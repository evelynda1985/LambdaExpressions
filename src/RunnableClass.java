public class RunnableClass {

    Runnable oldRunnable = new Runnable() {
        public void run() {
            int i = 0;
            while (i++ < 0){
                System.out.println("It works!");
            }
        }
    };

    Runnable lambdaRunnable  = () -> {
        int i = 0;
        while (i++ < 0){
            System.out.println("It works!");
        }
    };
}
