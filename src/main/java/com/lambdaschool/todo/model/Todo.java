package com.lambdaschool.todo.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "todo")
public class Todo
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long todoid;

    private String descrriptopn;
    private double datetime;
    private boolean completed;

    @OneToMany(mappedBy = "todo",
                cascade = CascadeType.ALL)
    @JsonIgnoreProperties("todo")
    private List<Users> userid = new ArrayList<>();

    public Todo() {
    }

    public Todo(String descrriptopn, double datetime, boolean completed, List<Users> userid) {
        this.descrriptopn = descrriptopn;
        this.datetime = datetime;
        this.completed = completed;
        this.userid = userid;
    }

    public long getTodoid() {
        return todoid;
    }

    public void setTodoid(long todoid) {
        this.todoid = todoid;
    }

    public String getDescrriptopn() {
        return descrriptopn;
    }

    public void setDescrriptopn(String descrriptopn) {
        this.descrriptopn = descrriptopn;
    }

    public double getDatetime() {
        return datetime;
    }

    public void setDatetime(double datetime) {
        this.datetime = datetime;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    public List<Users> getUserid() {
        return userid;
    }

    public void setUserid(List<Users> userid) {
        this.userid = userid;
    }
}
