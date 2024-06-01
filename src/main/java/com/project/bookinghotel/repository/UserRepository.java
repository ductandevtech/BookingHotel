package com.project.bookinghotel.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.bookinghotel.model.User;

import java.util.Optional;

/**
 * @author Simpson Alfred
 */

public interface UserRepository extends JpaRepository<User, Long> {
    boolean existsByEmail(String email);

    void deleteByEmail(String email);

   Optional<User> findByEmail(String email);
}
