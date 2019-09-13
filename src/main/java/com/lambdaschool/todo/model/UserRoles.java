package com.lambdaschool.todo.model;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.lambdaschool.authenticatedusers.model.User;
import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "userroles")
public class UserRoles {

    @Id
    @ManyToOne(fetch = FetchType.LAZY)
    @JsonIgnoreProperties({"userRoles", "hibernateLazyInitializer"})
    @JoinColumn(name = "userid")
    private User user;

    @Id
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "roleid")
    @JsonIgnoreProperties({"userRoles", "hibernateLazyInitializer"})
    private Role role;

    @OneToMany(mappedBy = "role",
            cascade = CascadeType.ALL)
    @JsonIgnoreProperties("role")
    private List<UserRoles> userRoles = new ArrayList<>();

    public UserRoles() {
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public List<UserRoles> getUserRoles() {
        return userRoles;
    }

    public void setUserRoles(List<UserRoles> userRoles) {
        this.userRoles = userRoles;
    }
}
