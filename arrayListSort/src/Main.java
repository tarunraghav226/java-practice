import employee.Employee;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Employee> employeeArrayList = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        for(int i=0;i<5;i++) {
            System.out.println("Enter roll no and name");
            Employee employee = new Employee(scan.nextInt(), scan.next().trim());
            employeeArrayList.add(employee);
        }
        Collections.sort(employeeArrayList);
        Iterator<Employee> iterator= employeeArrayList.iterator();
        while(iterator.hasNext())
            System.out.println(iterator.next());
    }
}