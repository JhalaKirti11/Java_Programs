/* Employee List
Write a Java program that creates a list of Employee objects with fields like id, name, and salary.
Implement a method getHighSalaryEmployees() that retrieves employees with a salary greater than 50,000.
Calculate the total salary of all employees.
Remove employees whose salary is less than 30,000 using an Iterator.  */


import java.util.ArrayList;
import java.util.Iterator;

class Employee {
    private int id;
    String name;
    int salary;
    
    public Employee(int id, String name, int salary){
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public String getName(){
        return name;
    }
    public int getID(){
        return id;
    }
    public int getSalary(){
        return salary;
    }

    public String toString(){
        return "Employee("+name+","+id+", "+salary+")";
    }
}


public class EmployeeList{
    public static void main(String[] args) {
        ArrayList<Employee> emp = new ArrayList<>();
        emp.add(new Employee(201,"Riya",40000));
        emp.add(new Employee(202,"Ronak",40000));
        emp.add(new Employee(308,"Shahid",20000));
        emp.add(new Employee(205,"Koyal",50000));
        emp.add(new Employee(204,"Mahi",60000));
        emp.add(new Employee(301,"Sneha",15000));
        emp.add(new Employee(302,"Pratik",300000));

        System.out.println("Salary more than 50000 rs.");
        for(Employee employee : emp){
            if(employee.getSalary()>=50000){
                System.out.println(employee);
            }
        }

        System.out.println("\nCalculate total salary: ");
        int total = 0;
        for(Employee e: emp){
            total+=e.getSalary();
        }
        System.out.println("Total salary "+total);

        System.out.println("Remove Employees lower than 30000");
            Iterator<Employee> itr = emp.iterator();
            while(itr.hasNext()){
                if((itr.next()).getSalary()<30000){
                    itr.remove();
                }
            }

        System.out.println("\nPrint result");
        for(Employee e : emp){
            System.out.println(e);
        }
    }
}
