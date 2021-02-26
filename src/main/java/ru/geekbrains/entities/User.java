package ru.geekbrains.entities;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import lombok.Setter;

import java.util.*;

@Setter
@Getter
public class User{

    private Long id;

    private String username;

    private String password;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
    private Date birthday;

    private String address;

    private String name;

    private String email;

    private String phone;

    private List<Order> orders;

    private Collection<Role> roles = new ArrayList<>();

    public User() {
    }

    public User(String name, String email, String phone, Date birthday, String address) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.birthday = birthday;
        this.address = address;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return id.equals(user.id) && username.equals(user.username) && password.equals(user.password) && name.equals(user.name) && Objects.equals(email, user.email) && Objects.equals(phone, user.phone);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, username, password, name);
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", birthday=" + birthday +
                ", address='" + address + '\'' +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", orders=" + orders +
                ", roles=" + roles +
                '}';
    }
}
