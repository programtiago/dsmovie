package com.tiagodeveloper.dsmovie.repository;

import com.tiagodeveloper.dsmovie.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

    User findByEmail(String email);
}
