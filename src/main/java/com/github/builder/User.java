package com.github.builder;

public class User {

    private String name;
    private String address;
    private String email;
    private int age;

    private User(Builder builder) {
        this.name = builder.name;
        this.address = builder.address;
        this.email = builder.email;
        this.age = builder.age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                '}';
    }

    public static class Builder{

        private String name;
        private String address;
        private String email;
        private int age;

        public static Builder aUser(){
            return new Builder();
        }

        public Builder withName(String name){
            this.name = name;
            return this;
        }

        public Builder withAge(int age){
            this.age = age;
            return this;
        }

        public Builder withEmail(String email){
            this.email = email;
            return this;
        }

        public Builder withAddress(String address){
            this.address = address;
            return this;
        }

        public User build(){
            return new User(this);
        }

    }

}
