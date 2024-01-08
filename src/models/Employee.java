package models;

public class Employee extends Person {
    private String position;
    private double salary;

    @Override
    public String toString() {
        return "Employee:" + super.toString();
    }

    public int getId() {
        return super.getId();
    }

    public String getName() {
        return super.getName();
    }

    public void setName(String name) {
        super.setName(name);
    }


    public String getSurname() {
        return super.getSurname();
    }

    public void setSurname(String surname) {
        super.setSurname(surname);
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getPosition() {
        return position;
    }
    public void setPosition(String position) {
        this.position = position;
    }

    public Employee(String name, String surname, String position, double salary) {
        super();
        this.position = position;
        this.salary = salary;
    }
@Override
    public double getPaymentAmount() {
        return salary;
    }

    @Override
    public int compareTo(Person person) {
        int result;
        if (salary == person.getPaymentAmount()) {
            result = 0;
        } else if (salary > person.getPaymentAmount()) {
            result = 1;
        } else {
            result = -1;
        }
        return result;
    }

}


