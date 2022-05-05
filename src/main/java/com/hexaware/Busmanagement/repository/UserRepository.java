package com.hexaware.Busmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hexaware.Busmanagement.entity.User;


@Repository
public interface UserRepository extends JpaRepository<User,Long> {

}
