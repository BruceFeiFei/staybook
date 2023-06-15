package com.laioffer.staybooking.repository;

import com.laioffer.staybooking.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, String> {
}
