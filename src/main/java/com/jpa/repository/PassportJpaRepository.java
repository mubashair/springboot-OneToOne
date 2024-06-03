package com.jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jpa.entity.Passport;

public interface PassportJpaRepository extends JpaRepository<Passport, Integer> {

}
