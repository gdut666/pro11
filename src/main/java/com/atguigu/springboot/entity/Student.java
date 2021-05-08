package com.atguigu.springboot.entity;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.Date;
import java.util.Map;

// 当前类存放读取yml配置文件的数据，要求当前类也在IOC容器中
@Component
@ConfigurationProperties(prefix = "student")
public class Student {
    private Integer stuId;
    private String stuName;
    private Boolean graduated;
    private String[] subject;
    private Date birthday;
    private Map<String, String> teachers;
    private Address address;

    public Student() {
    }

    public Integer getStuId() {
        return stuId;
    }

    public void setStuId(Integer stuId) {
        this.stuId = stuId;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public Boolean getGraduated() {
        return graduated;
    }

    public void setGraduated(Boolean graduated) {
        this.graduated = graduated;
    }

    public String[] getSubject() {
        return subject;
    }

    public void setSubject(String[] subject) {
        this.subject = subject;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Map<String, String> getTeachers() {
        return teachers;
    }

    public void setTeachers(Map<String, String> teachers) {
        this.teachers = teachers;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student{" +
                "stuId=" + stuId +
                ", stuName='" + stuName + '\'' +
                ", graduated=" + graduated +
                ", subject=" + Arrays.toString(subject) +
                ", birthday=" + birthday +
                ", teachers=" + teachers +
                ", address=" + address +
                '}';
    }

    public Student(Integer stuId, String stuName, Boolean graduated, String[] subject, Date birthday, Map<String, String> teachers, Address address) {
        this.stuId = stuId;
        this.stuName = stuName;
        this.graduated = graduated;
        this.subject = subject;
        this.birthday = birthday;
        this.teachers = teachers;
        this.address = address;
    }
}
