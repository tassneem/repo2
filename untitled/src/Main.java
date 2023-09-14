import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");


        ArrayList<Employee> employeeList = new ArrayList<Employee>();

        Department d = new Department(1,"engneer",employeeList);

        Employee e = new Employee("tassem",1,4000.0,d);

        Employee e1 = new Employee("tassem2",1,5000.0,d);
         d.add(e);
         d.add(e1,1);
        // employeeList.add(e);
        //employeeList.add(e1);
        d.remove(e1);
        employeeList=d.getEmployeeList();


        System.out.println( employeeList.size() );
        //  System.out.println("All elements: " + employeeList);   // السطر ده مفروض يطبع ال ele ال اراي
      /* for ( int i=0 ;i<employeeList.size();i++) {
          System.out.println(employeeList.get(i)+ " ");

        }*/
        System.out.println("+++++++");
        //employeeList.remove(e);
        for (Employee i:employeeList) {
            i.printEmploy();

        }

       // e.printEmploy();



    }
}