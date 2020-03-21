import java.util.function.BinaryOperator;

public class BinaryOperatorClass {

    BinaryOperator<Integer> sum1 = (i1, i2 ) -> i1 + i2;

    BinaryOperator<Integer> sum2 = (i1, i2 ) -> Integer.sum(i1,i2);

    BinaryOperator<Integer> sum3 = Integer::sum;

    BinaryOperator<Integer> max = Integer::max;
}
