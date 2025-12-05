package es.iesjandula.reaktor.automations_school_server.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import es.iesjandula.reaktor.automations_school_server.models.Dispositivo;


public interface IDispositivoRepository extends JpaRepository<Dispositivo, String>
{

}
