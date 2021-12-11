package com.company;
class Car{
    int price;

    public Car(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
}
class Employee{
    int employeeSalary;
    String  employeeName;

    public Employee(int employeeId, String employeeName) {
        this.employeeSalary = employeeId;
        this.employeeName = employeeName;
    }

    public int getEmployeeId() {
        return employeeSalary;
    }

    public String getEmployeeName() {
        return employeeName;
    }
}
interface interface1 <T>
{
    boolean betterElement(T A, T B);

}

public class Main <E>{

    public static void main(String[] args) {
	// write your code here
        Car car1 = new Car(5);
        Car car2 = new Car(10);

        Employee worker1 = new Employee(50, "Tulesh");
        Employee worker2 = new Employee(100, "patel");

        String str1 = "Good";
        String str2 = "Morning";

        interface1<Employee> betterElement = (Employee w1,Employee w2) -> w1.getEmployeeId() > w2.getEmployeeId();
        interface1<Car> betterElementCar = (Car c1,Car c2) -> c1.getPrice() > c2.getPrice();

        interface1<Employee> emplyeeInterface=(Employee w1,Employee w2) -> w1.getEmployeeId() > w2.getEmployeeId();
        interface1<Car> carInterface=(Car c1,Car c2) -> c1.getPrice() > c2.getPrice();
        interface1<String> stringInterface=(String s1,String s2) -> {
            if (s1.length() < s2.length()) {
                System.out.println("String 2 is larger than s1");
                return true;
            } else if (s1.length() > s2.length()) {
                System.out.println("String 1 is larger than string 2");
                return false;
            } else {
                System.out.println("Both are same");
                return false;
            }

        };

        if(emplyeeInterface.betterElement(worker1, worker2)){
            System.out.println("Worker1 salary is higher than worker 2");
        }else {
            System.out.println("Worker2 salary is higher than worker 1");
        }

        if(carInterface.betterElement(car1, car2)){
            System.out.println("car1's price higher than car2");
        }else {
            System.out.println("car2's price higher than car1");
        }

        stringInterface.betterElement(str1,str2);

    }

}
