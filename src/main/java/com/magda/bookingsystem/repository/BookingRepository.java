
package com.magda.bookingsystem.repository;

import com.magda.bookingsystem.model.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookingRepository extends JpaRepository<Booking, Long> {
}

