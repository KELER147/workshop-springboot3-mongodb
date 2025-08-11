package com.github.keler147.workshopmongo.domain;
import java.io.Serializable;
import java.security.InvalidParameterException;
import java.util.Objects;


public class User implements Serializable {

    private String id;
    private String name;
    private String email;

    public User() {
    }
    public User(String id, String name, String email) {
        this.id = id;
        this.name = name;
        if (!email.contains("@")) {
            throw new InvalidParameterException("Email invalid!");
        } else { this.email = email; }
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;
        return Objects.equals(id, user.id);
    }
    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "User{" + "id=" + id + ", name=" + name + ", email=" + email + '}';
    }
}
