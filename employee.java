public class employee {
    int emp_id,salary;
    String name;
    public employee(int id,String n,int s){
        emp_id=id;
        name=n;
        salary=s;
    }
    void display(){
        System.out.println("Employee id="+emp_id);
        System.out.println("Name="+name);
        System.out.println("Salary="+salary);
    }
    public static void main(String[] args) {
        employee e=new employee(1, "XYZ", 1000000);
        e.display();
    }
}
