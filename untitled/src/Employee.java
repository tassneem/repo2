public class Employee {
    private String name;
    private Integer id;
    private Double salary;

     Department d1 = new Department();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }





    public Employee() {
    }  //

    public Employee(String name, Integer id, Double salary, Department d1) {
        this.name = name;
        this.id = id;
        this.salary = salary;
        this.d1 = d1;
    }

    public void printEmploy(){
        System.out.println(this.name +" " + this.id +" "+ this.salary +" "+ this.d1.getId()+" "+ this.d1.getName());
    }

}
