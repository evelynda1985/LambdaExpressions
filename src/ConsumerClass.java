import java.util.function.Consumer;

public class ConsumerClass {

    Consumer<String> printer1 = s -> System.out.println(s);

    Consumer<String> printer2 =  System.out::println;

}
