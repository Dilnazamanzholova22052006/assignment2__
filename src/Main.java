import models.Employee;
import models.Person;
import models.Student;
import java.util.ArrayList;
import java.util.Collections;
public class Main {
    public static void main(String[] args){
        Person e1=new Employee("John","Lennon","Scientist",27045.78);
        Person e2=new Employee("George", "Harrison", "Developer", 50000) ;

        Person s1 = new Student("Ringo", "Starr", 2.12);
        Person s2 = new Student("Paul", "McCartney", 3.9);
        ArrayList<Person> persons=new ArrayList<>();
        persons.add(e1);
        persons.add(e2);
        persons.add(s1);
        persons.add(s2);
        Collections.sort(persons);
        printData(persons);
    }
        static void printData(Iterable<Person> persons){

            for (Person person : persons){
                System.out.println(person.printData());
            }
        }

    }

