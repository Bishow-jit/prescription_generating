package com.cmed.prescription.repository;

import com.cmed.prescription.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface usersRepository extends JpaRepository<Users,Long> {
}
