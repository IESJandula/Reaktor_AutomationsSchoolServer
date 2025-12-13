package es.iesjandula.reaktor.automations_school_server.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Entidad JPA que representa un 'Sensor Numérico' (mide valores continuos o discretos).
 * Hereda las propiedades de la clase abstracta Sensor.
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="sensor_numerico")
public class SensorNumerico extends Sensor
{
    /** Valor mínimo permitido o configurado para la alerta del sensor. */
    @Column
    private Double umbralMinimo;
    
    /** Valor máximo permitido o configurado para la alerta del sensor. */
    @Column
    private Double umbralMaximo;
    
    /** Valor numérico actual reportado por el sensor. */
    @Column
    private Double valorActual;
    
}