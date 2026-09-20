import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class University_Department_Professor {
    public static void main(String[] args) {
    System.out.print("Enter Department details (deptName,hodName):");
        Scanner sc=new Scanner(System.in);
        String detail=sc.nextLine();
        String[] detaillist=detail.split(",");
        Department dep=new Department(detaillist[0],detaillist[1]);
        System.out.print("Enter number of professors:");
        int loop= sc.nextInt();
        sc.nextLine();
        for(int i=0;i<loop;i++){
            System.out.print("Enter professor details (name,employeeId,specialization):");
            detail=sc.nextLine();
            detaillist=detail.split(",");
            Professor professor= new Professor(detaillist[0],detaillist[1],detaillist[2]);
            dep.addProfessor(professor);
        }
        System.out.print(dep);
    }
}
class Department
{
    private String deptName,hodName;
    private List<Professor> professor= new ArrayList<>();
    public Department(String deptName, String hodName) {
        this.deptName = deptName;
        this.hodName = hodName;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public String getHodName() {
        return hodName;
    }

    public void setHodName(String hodName) {
        this.hodName = hodName;
    }
    public void addProfessor(Professor p)
    {
        this.professor.add(p);
    }

    @Override
    public String toString() {
        StringBuilder sb=new StringBuilder();
        sb.append("Department:"+deptName+"\nHOD:"+hodName);
        for (int i=0;i<professor.size();i++)
            sb.append(professor.get(i).toString());
        return sb.toString();
    }
}
class Professor
{
    private String name,employeeId,specialization;

    public Professor(String name, String employeeId, String specialization) {
        this.name = name;
        this.employeeId = employeeId;
        this.specialization = specialization;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    @Override
    public String toString() {
        return "Professor:" +
                "Name:"+ name +",ID: "+ employeeId +",Specialization: "+specialization+"\n";
    }
}
