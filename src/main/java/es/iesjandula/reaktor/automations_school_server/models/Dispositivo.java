package es.iesjandula.reaktor.automations_school_server.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="dispositivo")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class Dispositivo
{
	@Id
    @Column
	private String mac;

	@Column(length = 25)
	private String estado;
	
	@ManyToOne
	@JoinColumn(name = "ubicacion_nombre")
	private Ubicacion ubicacion;
	
}
