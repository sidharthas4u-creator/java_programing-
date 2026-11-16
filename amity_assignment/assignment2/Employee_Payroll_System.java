public class Employee_Payroll_System {
    public static void main(String[] args) {
        Employee emp= new Employee("Ravi","E101",30000 );
        Manager mag= new Manager("Seema","M202",40000,5000 );
        System.out.println(emp);
        System.out.println(mag);
    }
}
class Employee
{
    private String name, id;
    private int basicSalary;
    public Employee(String name, String id, int basicSalary)
    {
        this.name = name;
        this.id = id;
        this.basicSalary = basicSalary;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public int getBasicSalary() {
        return basicSalary;
    }

    public int calculateSalary()
    {
    return basicSalary;
    }
    @Override
    public String toString() {
        return "Employee " +name+" "+id+" "+ basicSalary;
    }
}
class Manager extends Employee
{
    private int bonus;
    public Manager(String name, String id, int basicSalary, int bonus) {
        super(name, id, basicSalary);
        this.bonus = bonus;
    }

    public int calculateSalary(int bonus) {
        return super.calculateSalary()+bonus;
    }

    @Override
    public String toString() {
        return "Manager "+super.getName()+" "+super.getId()+" Salary: "+calculateSalary(bonus);
    }
}
