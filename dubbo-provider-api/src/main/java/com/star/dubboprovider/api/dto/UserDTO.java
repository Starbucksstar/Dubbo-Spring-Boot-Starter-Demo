package com.star.dubboprovider.api.dto;

public class UserDTO extends UserKeyDTO {
    private String name;
    private String password;
    private int age;
    private String address;
    private String phone;
    private int sex;

    public UserDTO() {
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return this.phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getSex() {
        return this.sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public String toString() {
        return "User{name='" + this.name + '\'' + ", password='" + this.password + '\'' + ", age=" + this.age + ", address='" + this.address + '\'' + ", phone='" + this.phone + '\'' + ", sex=" + this.sex + '}';
    }
}