package com.vasiliska.HystrixTest.repository;

import com.vasiliska.HystrixTest.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
