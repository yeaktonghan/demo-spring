package com.demo.Resource;

public class UserResource {
    private int id;
    private int age;
    private String name;
    private String address;

    public UserResource(int id, int age, String name, String address) {
        this.id = id;
        this.age = age;
        this.name = name;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

//    @Override
//    public String toString() {
//        return "UserResource{" +
//                "id=" + id +
//                ", age=" + age +
//                ", name='" + name + '\'' +
//                ", address='" + address + '\'' +
//                '}';
//    }
}
