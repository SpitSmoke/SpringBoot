package dev.pedrolobo.planets.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import dev.pedrolobo.planets.entity.PlanetEntity;

public interface IPlanetRepository extends JpaRepository<PlanetEntity, Long> {

  boolean existsByName(String name);

}
