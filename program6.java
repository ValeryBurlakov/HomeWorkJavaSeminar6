import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.jar.Attributes.Name;
import java.util.stream.Stream;

public class program6 {
    public static void main(String[] args) {
        ArrayList<person> personData = new ArrayList<person>();
        Map<String, ArrayList<person>> persons = new HashMap<>();
        // Collections.addAll(personData,  new person("Ivan", "Sutkin", 23, "male"),  
        //                                 new person("asdad", "Sutkasdsdain", 23, "male"));

        Stream<person> personStream = Stream.of(new person("Safron", "Valeed", 20, "male"), 
                             new person("lidia", "Valeeda", 23, "female"),
                             new person("Andrey", "Michailov", 8, "male"),
                             new person("Bob", "String", 78, "male"));

        personStream.filter(p-> p.getAge()>20).forEach(p->System.out.println("Имя " + p.getName() + " возраст " + p.getAge()));
      
    }
}





// Создать класс Person.
// У класса должны быть поля:
// 1. Имя (String)
// 2. Фамилия (String)
// 3. Возраст (продумать тип)
// 4. Пол
// 5*. Придумать свои собственные поля

// Для этого класса
// 1. Реализовать методы toString, equals и hashCode.
// 2*. Придумать собственные методы и реализовать их

// В мейне создать массив Person'ов. В цикле отобрать Person'ов старше 20 лет и вывести их на экран.
