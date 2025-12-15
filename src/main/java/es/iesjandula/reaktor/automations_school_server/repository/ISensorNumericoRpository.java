package es.iesjandula.reaktor.automations_school_server.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import es.iesjandula.reaktor.automations_school_server.models.SensorNumerico;

/**
 * Repositorio JPA para la entidad SensorNumerico.
 */
public interface ISensorNumericoRpository extends JpaRepository<SensorNumerico, String>
{

}
