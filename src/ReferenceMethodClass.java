import java.util.function.Function;

public class ReferenceMethodClass {

    Function<Person, Integer> f1 = person -> person.getAge();

    Function<Person, Integer> f2 = Person::getAge;
}
