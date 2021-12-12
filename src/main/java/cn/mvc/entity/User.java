package cn.mvc.entity;

import java.util.Arrays;
import java.util.Date;

public class User {
    private Integer id;
    private String Username;
    private Date brithday;
    private Double balance;
    private String[] hobbies;

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", Username='" + Username + '\'' +
                ", brithday=" + brithday +
                ", balance=" + balance +
                ", hobbies=" + Arrays.toString(hobbies) +
                '}';
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

    public Date getBrithday() {
        return brithday;
    }

    public void setBrithday(Date brithday) {
        this.brithday = brithday;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }
}
