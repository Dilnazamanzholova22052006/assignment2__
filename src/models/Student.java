package models;
public class Student extends Person{
    private double gpa;
    public Student() {
        super();
    }
    public Student(String name,String surname,double gpa){
        super(name,surname);
        this.gpa=gpa;
    }
    @Override public String toString() {
        return "Student:"+super.toString();
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
    public String getPosition() {
        return "Student";
    }

    public double getGpa() {
        return gpa;
    }
    public void setGpa(double gpa){
        this.gpa = gpa;
    }
   @Override public double getPaymentAmount() {
        return gpa > 2.67 ? 36660.0 : 0;
    }

   @Override public int compareTo(Person person){
        if(getPaymentAmount() == person.getPaymentAmount()) return 0;
        else if (getPaymentAmount() > person.getPaymentAmount()) return 1;
        else return -1;
    }
}

