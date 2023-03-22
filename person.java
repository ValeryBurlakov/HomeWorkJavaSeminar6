// import java.util.Objects;

public class person {
    String name;
    String surname;
    int age;
    String sex;

    person(String name, String surname, int age, String sex) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.sex = sex;
        
    }

    public String getName() {
        return name;
    }
    public String getSurname() {
        return surname;
    }
    public int getAge() {
        return age;
    }
    public String getSex() {
        return sex;
    }
    
    @Override 
    public String toString() {
        // return "{" + "name='" + name + '\'' + " surname='" + surname + '\'' +
        //             ", age='" + age + '\'' + ", sex='" + sex + '\'' +'}';
        return String.format("name: %s %s age: %d sex: %s", name, surname, age, sex);
    }
    // @Override
    // public int compareTo(person o)
    // {
    //     if (this.age != o.getAge()) {
    //         return this.age - o.getAge();
    //     }
    //     return this.name.compareTo(o.getName());
    // }
}
