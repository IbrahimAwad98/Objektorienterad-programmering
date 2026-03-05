package TEN20230314;

import java.util.Arrays;
import java.util.List;

public class Person {

    private final String name;
    private final int birthYear;
    private final Gender gender;

    public Person(String name, int birthYear, Gender gender) {
        this.name = name;
        this.birthYear = birthYear;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public Gender getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return "{" + name + ", " + gender + ", dob=" + birthYear + '}';
    }

    public static List<Person> getSomePersons() {
        return Arrays.asList(
                new Person("Anna", 1960, Gender.MALE),
                new Person("Bartosz", 1990, Gender.FEMALE),
                new Person("Carl", 2010, Gender.MALE),
                new Person("Desiree", 2000, Gender.FEMALE),
                new Person("Earvin", 2016, Gender.MALE)
        );
    }
}
