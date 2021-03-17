package ru.geekbrains.patterns.builder;

import java.time.LocalDate;

public class Employee {
    private final long id;
    private final String lastName;
    private final String firstName;
    private final String middleName;
    private final String email;
    private final Sex sex;
    private final LocalDate birthday;
    private final LocalDate startWorkDate;
    private final LocalDate finishWorkDate;
    private final Department department;
    private final Double salary;
    private final Double bonusCoef;
    private final Employee manager;
    private final String addressCountry;
    private final String addressCity;
    private final String addressStreet;
    private final String addressHouse;
    private final String addressBuilding;
    private final String addressApartment;
    private final String phone;
    private final Long inn;

     public Employee(Builder builder) {
        this.id = builder.id;
        this.lastName = builder.lastName;
        this.firstName = builder.firstName;
        this.middleName = builder.middleName;
        this.email = builder.email;
        this.sex = builder.sex;
        this.birthday = builder.birthday;
        this.startWorkDate = builder.startWorkDate;
        this.finishWorkDate = builder.finishWorkDate;
        this.department = builder.department;
        this.salary = builder.salary;
        this.bonusCoef = builder.bonusCoef;
        this.manager = builder.manager;
        this.addressCountry = builder.addressCountry;
        this.addressCity = builder.addressCity;
        this.addressStreet = builder.addressStreet;
        this.addressHouse = builder.addressHouse;
        this.addressBuilding = builder.addressBuilding;
        this.addressApartment = builder.addressApartment;
        this.phone = builder.phone;
        this.inn = builder.inn;
    }

    public static class Builder {
        private long id;
        private String lastName;
        private String firstName;
        private String middleName;
        private String email;
        private Sex sex;
        private LocalDate birthday;
        private LocalDate startWorkDate;
        private LocalDate finishWorkDate;
        private Department department;
        private Double salary;
        private Double bonusCoef;
        private Employee manager;
        private String addressCountry;
        private String addressCity;
        private String addressStreet;
        private String addressHouse;
        private String addressBuilding;
        private String addressApartment;
        private String phone;
        private Long inn;

        public Builder() {

        }

        public Builder id(long id) {
            this.id = id;
            return this;
        }

        public Builder lastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public Builder firstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public Builder middleName(String middleName) {
            this.middleName = middleName;
            return this;
        }

        public Builder email(String email) {
            this.email = email;
            return this;
        }

        public Builder sex(Sex sex) {
            this.sex = sex;
            return this;
        }

        public Builder birthday(LocalDate birthday) {
            this.birthday = birthday;
            return this;
        }

        public Builder startWorkDate(LocalDate startWorkDate) {
            this.startWorkDate = startWorkDate;
            return this;
        }

        public Builder finishWorkDate(LocalDate finishWorkDate) {
            this.finishWorkDate = finishWorkDate;
            return this;
        }

        public Builder department(Department department) {
            this.department = department;
            return this;
        }

        public Builder salary(Double salary) {
            this.salary = salary;
            return this;
        }

        public Builder bonusCoef(Double bonusCoef) {
            this.bonusCoef = bonusCoef;
            return this;
        }

        public Builder manager(Employee manager) {
            this.manager = manager;
            return this;
        }

        public Builder addressCountry(String addressCountry) {
            this.addressCountry = addressCountry;
            return this;
        }

        public Builder addressCity(String addressCity) {
            this.addressCity = addressCity;
            return this;
        }

        public Builder addressStreet(String addressStreet) {
            this.addressStreet = addressStreet;
            return this;
        }

        public Builder addressHouse(String addressHouse) {
            this.addressHouse = addressHouse;
            return this;
        }

        public Builder addressBuilding(String addressBuilding) {
            this.addressBuilding = addressBuilding;
            return this;
        }

        public Builder addressApartment(String addressApartment) {
            this.addressApartment = addressApartment;
            return this;
        }

        public Builder phone(String phone) {
            this.phone = phone;
            return this;
        }

        public Builder inn(Long inn) {
            this.inn = inn;
            return this;
        }

        public Employee build() {
            return new Employee(this);
        }
    }
}
