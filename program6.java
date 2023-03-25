import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;

public class program6 {
    public static void main(String[] args) {
        List<person> personData = Arrays.asList(new person("Safron", "Valeed", 20, "male"), 
        new person("lidia", "Valeeda", 23, "female"),
        new person("Bob", "String", 8, "male"),
        new person("Dominik", "Brown", 78, "male"),
        new person("Bob", "String", 45, "male"),
        new person("Bob", "String", 76, "male"),
        new person("Donald", "Trump", 76, "male"),
        new person("Dominik", "Brown", 88, "male"),
        new person("Monica", "Lewinsky", 7, "female"));

        System.out.println("Все персоны");          
        personData.stream()
            .forEach(System.out::println);
            System.out.println("=======================================");
        System.out.println("сориторовка age по возрастанию");
        personData.stream()
                .sorted(Comparator.comparing(person::getAge))
                .forEach(System.out::println);
                System.out.println("=======================================");
        System.out.println("Больше 20 лет");
        personData.stream()
                .filter(p -> (p.getAge() > 10))
                .forEach(System.out::println);
                System.out.println("=======================================");

        System.out.println("только мужчины");
        personData.stream()
                .filter(p -> (p.getSex() == "male"))
                .forEach(System.out::println);
                System.out.println("=======================================");
        System.out.println("Есть ли дети ?");
        boolean isAllAgesGreaterThan6 = personData.stream()
                .anyMatch(user -> user.getAge() < 18);
                if (isAllAgesGreaterThan6 == true) {
                    System.out.println("Дети есть");
                } else {
                    System.out.println("Все взрослые");
                }     
                System.out.println("=======================================");


        System.out.println("Мужики, у которых есть ровесник: ");
        
        ArrayList<person> personDuplicate = new ArrayList<person>();

        for (int index = 0; index < personData.size(); index++) {
            int t = 1;
            // System.out.println(personData.get(index));
            // System.out.println(personData.get(index).hashCode());
            while (t < personData.size()) {
                // System.out.println(personData.get(index).compareTo(personData.get(t)));
                // System.out.print(index);
                if (index == t) {
                    t++;
                    // System.out.println("сравнивает сам с собой");
                } else {
                    if (personData.get(index).hashCode() == personData.get(t).hashCode()) {
                        System.out.println(personData.get(index));
                    }
                    if (personData.get(index).equals(personData.get(t)) == true) {
                        personDuplicate.add(personData.get(t));
                    }
                    t++;
                }
            }
        }

        HashSet<person> personNamesake = new HashSet<person>(personDuplicate);
        System.out.println("=======================================");
        System.out.println("Список персонов у которых есть тёзка:\n" + personNamesake);
    }


        // Map<String, ArrayList<person>> persons = new HashMap<>();
        // Collections.addAll(personData,  new person("Ivan", "Sutkin", 23, "male"),  
        //                                 new person("asdad", "Sutkasdsdain", 23, "male"));

        // Stream<person> personStream = Stream.of(new person("Safron", "Valeed", 20, "male"), 
        //                      new person("lidia", "Valeeda", 23, "female"),
        //                      new person("Andrey", "Michailov", 8, "male"),
        //                      new person("Bob", "String", 78, "male"));

        // personStream.filter(p-> p.getAge()>20).forEach(p->System.out.println("Имя " + p.getName() + " возраст " + p.getAge()));
}





// Создать класс Person.
// У класса должны быть поля:
// 1. Имя (String)
// 2. Фамилия (String)
// 3. Возраст (продумать тип)
// 4. Пол
// 5*. Придумать свои собственные поля

// Для этого класса
// 1. Реализовать методы toString + , equals +  и hashCode.
// 2*. Придумать собственные методы и реализовать их

// В мейне создать массив Person'ов. В цикле отобрать Person'ов старше 20 лет и вывести их на экран.
