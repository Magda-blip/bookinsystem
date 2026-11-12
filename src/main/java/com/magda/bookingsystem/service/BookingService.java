
package com.magda.bookingsystem.service;

import com.magda.bookingsystem.model.Booking;
import com.magda.bookingsystem.repository.BookingRepository;
import com.magda.bookingsystem.exception.BookingNotFoundException;

import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class BookingService {

    private final BookingRepository bookingRepository;

    public BookingService(BookingRepository newBookingRepository) {
        this.bookingRepository = newBookingRepository;
    }

    public List<Booking> getAllBookings() {
        return bookingRepository.findAll();
    }
    public Booking getBookingById(Long id) {
        return bookingRepository.findById(id)
                .orElseThrow(() -> new BookingNotFoundException(id));
    }

    public Booking createBooking(Booking newBooking) {
        return bookingRepository.save(newBooking);
    }

    public Booking updateBooking(Long id, Booking updatedBooking) {

        Booking existingBooking = bookingRepository.findById(id)
                .orElseThrow(() -> new BookingNotFoundException(id));

        existingBooking.setName(updatedBooking.getName());
        existingBooking.setEmail(updatedBooking.getEmail());
        existingBooking.setDateTime(updatedBooking.getDateTime());
        existingBooking.setNumberOfPeople(updatedBooking.getNumberOfPeople());
        existingBooking.setStatus(updatedBooking.getStatus());

        return bookingRepository.save(existingBooking);
    }

    public void deleteBooking(Long id) {
        if (!bookingRepository.existsById(id)) {
            throw new BookingNotFoundException(id);
        }

        bookingRepository.deleteById(id);
    }

}