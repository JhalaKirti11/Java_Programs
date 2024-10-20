import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return name + " (" + age + ")";
    }
}

public class CollectionGroupByAge {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Alice", 30));
        people.add(new Person("Bob", 25));
        people.add(new Person("Charlie", 30));
        people.add(new Person("David", 25));

        Map<Integer, List<Person>> groupedByAge = people.stream()
            .collect(Collectors.groupingBy(person -> person.age));

        System.out.println("Grouped by Age: " + groupedByAge);
    }
}
