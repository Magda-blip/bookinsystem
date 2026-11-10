package com.magda.bookingsystem.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "bookings")
public class Booking {

    //Id ******************************************
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    public Long getId() {
        return id;
    }
    public void setId(Long newId) {
        this.id=newId;
    }

    //Name *****************************************
    private String name;

    public String getName(){
        return name;
    }
    public void setName(String newName) {
        this.name=newName;
    }
    //Email ******************************************
    private String email;

    public String getEmail(){
        return email;
    }

    public void setEmail(String newEmail){
        this.email=newEmail;
    }

    //DateTime *************************************
    @Column(name = "date_time")
    private LocalDateTime dateTime;

    public LocalDateTime getDateTime(){
        return dateTime;
    }

    public void setDateTime(LocalDateTime newDateTime){
        this.dateTime=newDateTime;
    }

    //Nr of people ***********************************
    @Column(name = "number_of_people")
    private Integer numberOfPeople;

    public Integer getNumberOfPeople(){
        return numberOfPeople;
    }

    public void setNumberOfPeople(Integer newNumberOfPeople){
        this.numberOfPeople=newNumberOfPeople;
    }

    //BookingStatus *********************************
    @Enumerated(EnumType.STRING)
    private BookingStatus status;

    public BookingStatus getStatus(){
        return status;
    }

    public void setStatus(BookingStatus newStatus){
        this.status=newStatus;
    }

    //************************************************

    public Booking() {
    }
}
