import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Department {
    private Integer id;
    private String name;
    private ArrayList<Employee> employeeList = new ArrayList<Employee>();

    public Department() {
    }

    public Department(Integer id, String name, ArrayList<Employee> employeeList) {
        this.id = id;
        this.name = name;
        this.employeeList = employeeList;

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Employee> getEmployeeList() {
        return employeeList;
    }

    public void setEmployeeList(ArrayList<Employee> employeeList) {
        this.employeeList = employeeList;
    }
   public void  add(Employee e1){
       this.employeeList.add(e1);
   }
    public void  add(Employee e1,Integer id){
        this.employeeList.add(id , e1);
    }
    public void  remove(Employee e1){
        this.employeeList.remove(e1);
    }



}
