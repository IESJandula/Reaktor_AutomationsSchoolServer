package es.iesjandula.reaktor.automations_school_server.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import es.iesjandula.reaktor.automations_school_server.models.SensorBooleano;

/**
 * Repositorio JPA para la entidad SensorBooleano.
 */
public interface ISensorBooleanoRepository extends JpaRepository<SensorBooleano, String>
{
	
}
