package day17_customClass;

public class TestEmployeeObject {

    public static void main(String[] args) {


        Employee employee1 = new Employee();
        employee1.setInfo("Hamza", 23, 'M', "Engineer", 145231, "0843rsdr3n");
        System.out.println(employee1);
        employee1.work();


    }
}
