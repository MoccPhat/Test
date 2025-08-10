package BTABS;
public abstract class Employee {
    protected Staff staff;

    public Employee (Staff staff){
        this.staff = staff;
    }

    public Staff getStaff(){
        return this.staff;
    }
    public void setStaff(Staff staff){
        this.staff = staff;
    }

    public void Input(){
        System.err.print("Nhan Vien da nhap: ");
        System.err.println();
        System.err.println(staff.getName()+"\n"+staff.getAge()+"\n"+staff.getSex()+"\n"+staff.getAddress());
    }
    public void Output(){
        System.err.println("----------------------------");
        System.err.print("Xuat nhan vien: ");
        System.err.println();
        System.err.println(staff.getName()+"\n"+staff.getAge()+"\n"+staff.getSex()+"\n"+staff.getAddress());
    }
    public abstract float Salary();
}
