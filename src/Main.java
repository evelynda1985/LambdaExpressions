import java.util.Comparator;
import java.util.function.Function;

public class Main {

    public static void main(String[] args) {

        Comparator<Person> compareAge = (p1,p2) -> p2.getAge() - p1.getAge();
        Comparator<Person> compareName = (p1,p2) -> p2.getName().compareTo(p1.getName());

        Function<Person, Integer> f1 = person -> person.getAge();
        Function<Person, Integer> f2 = Person::getAge;

        Comparator<Person> comparePersonAge1 = Comparator.comparing(f1);
        Comparator<Person> comparePersonAge2 = Comparator.comparing(person -> person.getAge());
        Comparator<Person> comparePersonAge3 = Comparator.comparing(Person::getAge);
        Comparator<Person> comparePersonName1 = Comparator.comparing(Person::getLastName);

        Comparator<Person> comparePersonNameAndAge = comparePersonAge3.thenComparing(comparePersonName1);

        Comparator<Person> comparePersonLastNameAndNameAndAge = Comparator.comparing(Person::getLastName)
                .thenComparing(Person::getName)
                .thenComparing(Person::getAge);

    }
}
