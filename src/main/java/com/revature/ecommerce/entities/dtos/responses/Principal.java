package com.revature.ecommerce.entities.dtos.responses;

import com.revature.ecommerce.entities.enums.Role;

import java.time.Year;
import java.time.YearMonth;
import java.util.Date;

public class Principal {
    private String id;
    private String email;
    private String givenName;
    private String surname;
    private Role role;
    private String cardNumber;
    private Date expirationDate;
    private String token;

    public Principal() {
        super();
    }

    

    

    public Principal(String id, String email, String givenName, String surname, Role role, String cardNumber,
            Date expirationDate) {
        this.id = id;
        this.email = email;
        this.givenName = givenName;
        this.surname = surname;
        this.role = role;
        this.cardNumber = cardNumber;
        this.expirationDate = expirationDate;
    }





    public Principal(String id, String email, String givenName, String surname, Role role, String cardNumber,
            Date expirationDate, String token) {
        this.id = id;
        this.email = email;
        this.givenName = givenName;
        this.surname = surname;
        this.role = role;
        this.cardNumber = cardNumber;
        this.expirationDate = expirationDate;
        this.token = token;
    }

    
    public String getId() {
        return id;
    }



    public void setId(String id) {
        this.id = id;
    }


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGivenName() {
        return givenName;
    }

    public void setGivenName(String givenName) {
        this.givenName = givenName;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public Date getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }



    @Override
    public String toString() {
        return "Principal [id=" + id + ", email=" + email + ", givenName=" + givenName + ", surname=" + surname
                + ", role=" + role + ", cardNumber=" + cardNumber + ", expirationDate=" + expirationDate + ", token="
                + token + "]";
    }

    



}
