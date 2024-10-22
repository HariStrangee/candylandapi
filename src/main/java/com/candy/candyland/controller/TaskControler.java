package com.candy.candyland.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.candy.candyland.model.Candyy;
import com.candy.candyland.repository.CandyRepository;

@RestController
@CrossOrigin
@RequestMapping("/candy/allcandy")
public class TaskControler {
		
		@Autowired
		private CandyRepository candyRepository;

		@PostMapping("/add")
		public Candyy createCandy(@RequestBody Candyy candy){
			candyRepository.save(candy);
			return candy;
		}
		
		@GetMapping
		public List<Candyy> getAllCandy() {
			return candyRepository.findAll();
		}
		
		@PutMapping("/{id}")
		public Candyy updateCandy(@PathVariable Long id,@RequestBody Candyy candy) {
			candy.setId(id);
			return candyRepository.save(candy);
		}
		
		@DeleteMapping("/{id}")
		public void deleteMapping(@PathVariable Long id) {
			candyRepository.deleteById(id);
		}
}
