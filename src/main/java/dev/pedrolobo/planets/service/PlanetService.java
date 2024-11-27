package dev.pedrolobo.planets.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dev.pedrolobo.planets.entity.PlanetEntity;
import dev.pedrolobo.planets.repository.IPlanetRepository;

@Service
public class PlanetService {

  @Autowired
  private IPlanetRepository planetRepository;

  public PlanetEntity add(PlanetEntity planet) {
    return planetRepository.save(planet);
  }

  public List<PlanetEntity> getAll() {
    return planetRepository.findAll();
  }

  public Optional<PlanetEntity> getById(Long id) {
    return planetRepository.findById(id);
  }

  public Object update(PlanetEntity planetEntity, Long id) {
    return planetRepository.findById(id).map(record -> {
      record.setName(planetEntity.getName());
      record.setRelativeEarthMass(planetEntity.getRelativeEarthMass());
      record.setRelativeEarthRadius(planetEntity.getRelativeEarthRadius());
      record.setRelativeEarthGravity(planetEntity.getRelativeEarthGravity());
      record.setDescription(planetEntity.getDescription());
      record.setOrbitPosition(planetEntity.getOrbitPosition());
      return planetRepository.save(record);
    });
  }

  public void delete(long id) {
    planetRepository.deleteById(id);
  }

  public boolean existsByName(String name) {
    return planetRepository.existsByName(name);
  }

  public boolean existsPlanetById(long id) {
    if (planetRepository.existsById(id)) {
      return true;
    }
    return false;
  }
}
