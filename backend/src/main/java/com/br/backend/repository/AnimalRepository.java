package com.br.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.br.backend.model.Animal;

public interface AnimalRepository extends JpaRepository<Animal, Long> {
}
