package dev.pedrolobo.planets.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND)
public class PlanetNotFoundException extends RuntimeException {

  public PlanetNotFoundException(Long id) {
    super(String.format("Planet with id %s not found.", id));
  }
}
