package com.example.Greek.model;

import jakarta.persistence.*;
import java.util.Set;

@Entity
@Table(name = "members")
public class Member {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;

    @Enumerated(EnumType.STRING)
    private Status status;

    // Many Members can have meals with many Brothers
    @ManyToMany(mappedBy = "members")
    private Set<Brother> brothers;

    // Constructors, Getters, and Setters
    public Member() {}

    public Member(String firstName, String lastName, String email, String phoneNumber, Status status) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.status = status;
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Set<Brother> getBrothers() {
        return brothers;
    }

    public void setBrothers(Set<Brother> brothers) {
        this.brothers = brothers;
    }

    public enum Status {
        INTERESTED, INTERVIEWED, ACCEPTED, DECLINED
    }
}
