import java.util.Objects;

// import java.util.Objects;

public class person implements Comparable<person>{
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
        return String.format("name: %s %s, age: %d, sex: %s", name, surname, age, sex);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, sex);
    }

    @Override
    public int compareTo(person o)
    {
        if (this.name != o.getName()) {
            return -1;
        }
        return this.name.compareTo(o.getName());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        person that = (person) o;
        return name.equals(that.name) &&
        surname.equals(that.surname);
    }
}
