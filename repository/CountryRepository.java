package com.DevApp.DevTah.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.DevApp.DevTah.entity.Country;

public interface CountryRepository extends JpaRepository<Country, String> {

	

}
