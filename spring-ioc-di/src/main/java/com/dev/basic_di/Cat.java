package com.dev.basic_di;

public class Cat {
    private String name;
    private Person master;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Person getMaster() {
        return master;
    }

    public void setMaster(Person master) {
        this.master = master;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", master=" + master +
                '}';
    }
}
