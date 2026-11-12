package com.magda.bookingsystem.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Future;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;

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
    @NotBlank(message = "Name is required")
    private String name;

    public String getName(){
        return name;
    }
    public void setName(String newName) {
        this.name=newName;
    }
    //Email ******************************************
    @NotBlank(message = "Email is required")
    @Email(message = "Email must be valid")
    private String email;

    public String getEmail(){
        return email;
    }

    public void setEmail(String newEmail){
        this.email=newEmail;
    }

    //DateTime *************************************
    @NotNull(message = "Date and time are required")
    @Future(message = "Booking date must be in the future")
    @Column(name = "date_time")
    private LocalDateTime dateTime;

    public LocalDateTime getDateTime(){
        return dateTime;
    }

    public void setDateTime(LocalDateTime newDateTime){
        this.dateTime=newDateTime;
    }

    //Nr of people ***********************************
    @NotNull(message = "Number of people is required")
    @Min(value = 1, message = "There must be at least one person")
    @Column(name = "number_of_people")
    private Integer numberOfPeople;

    public Integer getNumberOfPeople(){
        return numberOfPeople;
    }

    public void setNumberOfPeople(Integer newNumberOfPeople){
        this.numberOfPeople=newNumberOfPeople;
    }

    //BookingStatus *********************************
    @NotNull(message = "Booking status is required")
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
