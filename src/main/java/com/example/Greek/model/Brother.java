package com.example.Greek.model;

import jakarta.persistence.*;
import java.util.Set;

@Entity
@Table(name = "brothers")
public class Brother {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;

    // Many Brothers can have meals with many Members
    @ManyToMany
    @JoinTable(
        name = "meals", // Define a join table for meals
        joinColumns = @JoinColumn(name = "brother_id"),
        inverseJoinColumns = @JoinColumn(name = "member_id")
    )
    private Set<Member> members;

    // Constructors, Getters, and Setters
    public Brother() {}

    public Brother(String firstName, String lastName, String email, String phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

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

    public Set<Member> getMembers() {
        return members;
    }

    public void setMembers(Set<Member> members) {
        this.members = members;
    }
}
