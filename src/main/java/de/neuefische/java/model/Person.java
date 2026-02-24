package de.neuefische.java.model;

import java.util.Objects;

public class Person extends Object {

    protected String name = null;
    private int age;
    private boolean isFullAge;
    private Category userType;

    public Person() {
        this.userType = Category.GUEST;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person(int age, boolean isFullAge, String name, Category userType) {
        this.age = age;
        this.isFullAge = isFullAge;
        this.name = name;
        this.userType = userType;
    }

    public boolean isFullAge() {
        return isFullAge;
    }

    public void setFullAge(boolean fullAge) {
        isFullAge = fullAge;
    }

    public Category getUserType() {
        return userType;
    }

    public void setUserType(Category userType) {
        this.userType = userType;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {

        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && isFullAge == person.isFullAge && Objects.equals(name, person.name) && userType == person.userType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, isFullAge, userType);
    }

    @Override
    public String toString() {
        return "Person{" +
               "age=" + age +
               ", name='" + name + '\'' +
               ", isFullAge=" + isFullAge +
               ", userType=" + userType +
               '}';
    }
}
