import java.io.Serializable;

class Customer implements Serializable {
    private String name;
    private int id;
    private int age;
    private String contact;

    Customer(String name, int id, int age, String contact) {
        this.name = name;
        this.id = id;
        this.age = age;
        this.contact = contact;
    }

    String getName() {
        return name;
    }

    int getId() {
        return id;
    }

    int getAge() {
        return age;
    }

    String getContact() {
        return contact;
    }
}
