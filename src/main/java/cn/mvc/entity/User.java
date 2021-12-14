package cn.mvc.entity;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.NumberFormat;

import java.util.Arrays;
import java.util.Date;

public class User {
    private Integer id;
    private String Username;
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date birthday;
    @NumberFormat(style = NumberFormat.Style.CURRENCY)//货币
    private Double balance;//
    private String[] hobbies;
    @NumberFormat(pattern = "#,###.##")
    private Double salary;//工资
    @NumberFormat(style = NumberFormat.Style.PERCENT)
    private Double taskCount;//任务完成百分比

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", Username='" + Username + '\'' +
                ", brithday=" + birthday +
                ", balance=" + balance +
                ", hobbies=" + Arrays.toString(hobbies) +
                ", salary=" + salary +
                ", taskCount=" + taskCount +
                '}';
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public Double getTaskCount() {
        return taskCount;
    }

    public void setTaskCount(Double taskCount) {
        this.taskCount = taskCount;
    }

    public String[] getHobbies() {
        return hobbies;
    }

    public void setHobbies(String[] hobbies) {
        this.hobbies = hobbies;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String username) {
        Username = username;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }
}
