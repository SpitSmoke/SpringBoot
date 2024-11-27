package dev.pedrolobo.planets.entity;

import jakarta.annotation.Nonnull;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "tb_planet")
public class PlanetEntity {

  @GeneratedValue(strategy = GenerationType.AUTO)
  @Id
  Long id;

  @Nonnull
  @Column(length = 30)
  String name;

  @Column(length = 250)
  String description;

  @Nonnull
  @Column(name = "relative_earth_radius", length = 8)
  Float relativeEarthRadius;

  @Nonnull
  @Column(name = "relative_earth_mass", length = 8)
  Float relativeEarthMass;

  @Nonnull
  @Column(name = "relative_earth_gravity", length = 8)
  Float relativeEarthGravity;

  @Nonnull
  @Column(length = 4)
  Integer orbitPosition;

}
