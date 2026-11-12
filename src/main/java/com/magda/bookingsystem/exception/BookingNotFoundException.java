package com.magda.bookingsystem.exception;

public class BookingNotFoundException extends RuntimeException {

    public BookingNotFoundException(Long id) {
        super("Booking with id " + id + " was not found");
    }
}