package com.vivek;

import java.util.Map;

/**
 * Created by Vivek on 14/9/14.
 */
public class Person {

    String firstName;
    String lastName;
    Integer age;
    Address address;

    public Person(){}
    public Person(Map<String, Object> map) {
        this.firstName = String.valueOf(map.get("firstName"));
        this.lastName = String.valueOf(map.get("lastName"));
        this.age = (Integer) (map.get("age"));
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
