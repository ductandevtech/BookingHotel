package com.project.bookinghotel.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.bookinghotel.model.BookedRoom;

import java.util.List;
import java.util.Optional;

/**
 * @author Simpson Alfred
 */

public interface BookingRepository extends JpaRepository<BookedRoom, Long> {

    List<BookedRoom> findByRoomId(Long roomId);

 Optional<BookedRoom> findByBookingConfirmationCode(String confirmationCode);

    List<BookedRoom> findByGuestEmail(String email);
}
