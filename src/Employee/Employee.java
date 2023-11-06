package Employee;

import java.util.ArrayList;
import java.util.Scanner;

public class Employee {
    public String name, email;
    public int hourRate, capacity, freeDays;

    public Employee(String name, String email, int hourRate, int capacity, int freeDays) {
        this.name = name;
        this.email = email;
        this.hourRate = hourRate;
        this.capacity = capacity;
        this.freeDays = freeDays;
    }

    public int calculateDailyIncome(){
        return hourRate*capacity;
    }

    public int calculateMonthlyIncome(){
        return (20-freeDays)*calculateDailyIncome();
    }

    public static void main(String[] args){
        ArrayList<Employee> employeeList = new ArrayList<Employee>();

        Scanner scanner0 = new Scanner(System.in);
        System.out.print("Cati introduceti: ");
        int n = scanner0.nextInt();

        for(int i=0;i<n;i++){
            Scanner scanner = new Scanner(System.in);
            System.out.print("Introduceti numele: ");
            String name = scanner.nextLine();

            Scanner scanner1 = new Scanner(System.in);
            System.out.print("Introduceti emailul: ");
            String email = scanner1.nextLine();

            Scanner scanner2 = new Scanner(System.in);
            System.out.print("Introduceti hourRate: ");
            int hourRate = scanner2.nextInt();

            Scanner scanner3 = new Scanner(System.in);
            System.out.print("Introduceti capacity: ");
            int capacity = scanner3.nextInt();

            Scanner scanner4 = new Scanner(System.in);
            System.out.print("Introduceti freeDays: ");
            int freeDays = scanner4.nextInt();

            Employee employee = new Employee(name, email, hourRate, capacity, freeDays);
            employeeList.add(employee);
        }

        for(Employee em : employeeList){
            em.calculateMonthlyIncome();
            System.out.println("Venitul lunar este: " + em.calculateMonthlyIncome());
        }

    }
}
