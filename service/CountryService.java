package com.DevApp.DevTah.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.DevApp.DevTah.entity.Country;
import  com.DevApp.DevTah.repository.CountryRepository;
@Transactional
@Service
public class CountryService {
	@Autowired
	CountryRepository CountryRepository;
	
	public Optional<Country> findOne(String codeCountry) {
		return CountryRepository.findById(codeCountry);
	}
	public List<Country> findAll() {
		return CountryRepository.findAll();
	}
	public void save(Country Country) {
		CountryRepository.save(Country);
	}
	public void update(Country Country) {
		Country = CountryRepository.save(Country);
	}
	
	public void delete(String codeCountry) {
		CountryRepository.deleteById(codeCountry);
	}
	
}
