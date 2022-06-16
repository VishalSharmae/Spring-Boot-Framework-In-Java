package com.spring.collections;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Employees {

    private String name;
    private List<String> phones;
    private Set<String> address;
    private Map<String, String> course;
    private Properties properties;


    public Employees() {
        super();
    }


    public Employees(String name, List<String> phones, Set<String> address, Map<String, String> course, Properties properties) {
        this.name = name;
        this.phones = phones;
        this.address = address;
        this.course = course;
        this.properties = properties;
    }


    public Properties getProperties() {
        return properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getPhones() {
        return phones;
    }

    public void setPhones(List<String> phones) {
        this.phones = phones;
    }

    public Set<String> getAddress() {
        return address;
    }

    public void setAddress(Set<String> address) {
        this.address = address;
    }

    public Map<String, String> getCourse() {
        return course;
    }

    public void setCourse(Map<String, String> course) {
        this.course = course;
    }

    @Override
    public String toString() {
        return "Employees{" +
                "name='" + name + '\'' +
                ", phones=" + phones +
                ", address=" + address +
                ", course=" + course +
                '}';
    }
}
