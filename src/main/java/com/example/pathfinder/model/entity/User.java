package com.example.pathfinder.model.entity;

import com.example.pathfinder.model.entity.enums.LevelEnum;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "users")
public class User extends BaseEntity {

    private String fullName;
    private String username;
    private Integer age;
    private String password;
    private String email;
    private Set<Role> role;
    private LevelEnum level;

    @Column(nullable = false)
    public String getFullName() {
        return fullName;
    }

    public User setFullName(String username) {
        this.fullName = username;
        return this;
    }

    @Column(nullable = false)
    public String getPassword() {
        return password;
    }

    public User setPassword(String password) {
        this.password = password;
        return this;
    }

    @Column()
    public String getEmail() {
        return email;
    }

    public User setEmail(String email) {
        this.email = email;
        return this;
    }

    @ManyToMany
    public Set<Role> getRole() {
        return role;
    }

    public User setRole(Set<Role> role) {
        this.role = role;
        return this;
    }

    @Enumerated(EnumType.STRING)
    public LevelEnum getLevel() {
        return level;
    }

    public User setLevel(LevelEnum level) {
        this.level = level;
        return this;
    }

    @Column(unique = true, nullable = false)
    public String getUsername() {
        return username;
    }

    public User setUsername(String username) {
        this.username = username;
        return this;
    }

    @Column
    public Integer getAge() {
        return age;
    }

    public User setAge(Integer age) {
        this.age = age;
        return this;
    }
}
