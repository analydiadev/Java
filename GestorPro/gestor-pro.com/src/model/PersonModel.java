package model;

public abstract class PersonModel {

    private String fullName;
    private String surname;
    private int age;

    public PersonModel(String fullName, int age) {
        this.fullName = fullName;
        setAge(age);
    }

    public String getName() {
        return fullName;
    }

    public void setName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Please, provide a valid age");
        }
        this.age = age;
    }

    public abstract void showInformation();
}