package com.company;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

class Car {
    int price;

    public Car(int price) {
        this.price = price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
}

class Employee {
    int employeeSalary;
    String employeeName;

    public Employee(int employeeId, String employeeName) {
        this.employeeSalary = employeeId;
        this.employeeName = employeeName;
    }

    public int getEmployeeSalary() {
        return employeeSalary;
    }

    public void setEmployeeSalary(int employeeSalary) {
        this.employeeSalary = employeeSalary;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }
}

interface interface1<T> {
    boolean betterElement(T A, T B);
}

public class Main<E> {

    private static final Logger logger = LoggerFactory.getLogger(Main.class);
    public static void main(String[] args) {
        // write your code here
        Car car1 = new Car(5);
        Car car2 = new Car(10);

        Employee worker1 = new Employee(500, "Tulesh");
        Employee worker2 = new Employee(100, "patel");

        String str1 = "Good";
        String str2 = "Morning";

        interface1<Employee> betterElement = (Employee w1, Employee w2) -> w1.getEmployeeSalary() > w2.getEmployeeSalary();
        interface1<Car> betterElementCar = (Car c1, Car c2) -> c1.getPrice() > c2.getPrice();

        interface1<Employee> emplyeeInterface = (Employee w1, Employee w2) -> w1.getEmployeeSalary() > w2.getEmployeeSalary();
        interface1<Car> carInterface = (Car c1, Car c2) -> c1.getPrice() > c2.getPrice();
        interface1<String> stringInterface = (String s1, String s2) -> {
            if (s1.length() < s2.length()) {
                logger.info("String 2 is larger than s1");
                return true;
            } else if (s1.length() > s2.length()) {
                logger.info("String 1 is larger than string 2");
                return false;
            } else {
                logger.info("Both are same");
                return false;
            }

        };

        if (emplyeeInterface.betterElement(worker1, worker2)) {
            logger.info("Worker1 salary is higher than worker 2");
        } else {
            logger.info("Worker2 salary is higher than worker 1");
        }

        if (carInterface.betterElement(car1, car2)) {
            logger.info("car1's price higher than car2");
        } else {
            logger.info("car2's price higher than car1");
        }

        stringInterface.betterElement(str1, str2);

    }

}
