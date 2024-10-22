package com.candy.candyland.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.candy.candyland.model.Candyy;

public interface CandyRepository extends JpaRepository<Candyy,Long> {

}
