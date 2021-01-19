package com.rmv.posty.repos;

import com.rmv.posty.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Long> {
    User findUserByUsername(String username);
}
