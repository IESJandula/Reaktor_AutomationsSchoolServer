package es.iesjandula.reaktor.automations_school_server.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import es.iesjandula.reaktor.automations_school_server.dtos.AccionResponseDto;
import es.iesjandula.reaktor.automations_school_server.models.Accion;

public interface IAccionRepository extends JpaRepository<Accion, Long>
{
    @Query("SELECT new es.iesjandula.reaktor.automations_school_server.dtos.AccionResponseDto(" +
            "a.id, a.resultado, a.actuador.mac, a.orden.id) " +
            "FROM Accion a")
     List<AccionResponseDto> buscarAcciones();
}
