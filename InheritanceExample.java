class person3 {
    String name;
    int age;

    public void displayInfo1(String name, int age) {
        System.out.println(name);
        System.out.println(age);
    }
}

class employee extends person3 {
    int employeeID = 783873;
}

public class InheritanceExample {
    public static void main(String[] args) {
        employee obj = new employee();
        obj.displayInfo1("Rajni", 23);
        int ID = obj.employeeID;
        System.out.println(ID);

    }
}
