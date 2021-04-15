package com.dvsuperior.dsclient.repositories;

import com.dvsuperior.dsclient.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {
}
