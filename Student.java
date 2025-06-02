class person {
    String name = "Pro";
    int age = 22;
}

public class Student {
    public static void main(String[] args) {
        person obj = new person();
        String name1 = obj.name;
        int age1 = obj.age;
        System.out.println(name1);
        System.out.println(age1);
    }
}
