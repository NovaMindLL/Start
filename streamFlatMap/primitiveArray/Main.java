package streamFlatMap.primitiveArray;

import java.util.stream.Collector;

public class Main {
   public static void main(String[] args) {
    List<Person> persons = Data.getPersons(); 
     
    List<Person> persons2 = persons.stream()
    .map(p-> new Person(p.getFirstName(), "Ivanov", p.getAge() + 100))
    .collect(Collector.toList());

Optional  <Person> person = persons.stream()
.filter(p-> p.getAge()>30)
.findFirst();
.findAny();//Ищет любого больше 30

long count = person.stream()
.filter(p->p.getAge()>30)
.count(); //Количество лиц старше 30 

persons.forEach(System.out::println);


System.out.println(person.get());
   }
}
