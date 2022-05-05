package com.hexaware.Busmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;


import com.hexaware.Busmanagement.entity.Bus;

@Repository
public interface BusRepository extends JpaRepository<Bus,Long> {

}
