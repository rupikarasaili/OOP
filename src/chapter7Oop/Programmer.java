package chapter7Oop;

class Employee {
    float salary = 40000;
    float DashainBonus = 4000;

}
//child class
class Programmer extends Employee{
    int bonus = 10000;
    float total = salary+bonus+DashainBonus;

    public static void main(String[] args) {
        Programmer p = new Programmer();
        System.out.println("Programmer salary is " + p.salary);
        System.out.println("Bonus of programmer is " + p.bonus);
        System.out.println("Dashain bonus is " + p.DashainBonus);
        System.out.println("Total salary is " + p.total);

    }
}
