package es.iesjandula.reaktor.automations_school_server.rest;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import es.iesjandula.reaktor.automations_school_server.models.SensorBooleano;
import es.iesjandula.reaktor.automations_school_server.models.SensorNumerico;
import es.iesjandula.reaktor.automations_school_server.repository.ISensorBooleanoRepository;
import es.iesjandula.reaktor.automations_school_server.repository.ISensorNumericoRpository;
import es.iesjandula.reaktor.automations_school_server.utils.AutomationSchoolServerException;
import es.iesjandula.reaktor.automations_school_server.utils.Constants;
import es.iesjandula.reaktor.base.utils.BaseConstants;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("/automations_school/admin/actualizacion")
public class ActualizacionesSensoresRestController
{
	@Autowired
	private ISensorBooleanoRepository sensorBooleanoRepo;

	@Autowired
	private ISensorNumericoRpository sensorNumericoRepo;

	
	@PreAuthorize("hasRole('" + BaseConstants.ROLE_ADMINISTRADOR + "')")
	@PostMapping(value = "/sensor/booleano")
	public ResponseEntity<?> actualizarSensorBooleano(@RequestHeader Boolean valorActual, String mac)
	{
		try
		{
			Optional<SensorBooleano> optionalSensorBooleano = sensorBooleanoRepo.findById(mac);
			if (!optionalSensorBooleano.isPresent())
			{
				log.error(Constants.ERR_SENSOR_NO_EXISTE);
				throw new AutomationSchoolServerException(Constants.ERR_SENSOR_CODE, Constants.ERR_SENSOR_NO_EXISTE);
			}

			SensorBooleano sensorBooleano = optionalSensorBooleano.get();
			sensorBooleano.setValorActual(valorActual);

			sensorBooleanoRepo.saveAndFlush(sensorBooleano);

			log.info(Constants.ELEMENTO_MODIFICADO);

			return ResponseEntity.ok().build();

		} 
		catch (AutomationSchoolServerException automationSchoolServerException)
		{
			return ResponseEntity.badRequest().body(automationSchoolServerException);
		}
		catch (Exception exception) 
		{
			AutomationSchoolServerException automationSchoolServerException = new AutomationSchoolServerException(Constants.ERR_SENSOR_CODE, Constants.ERR_CODE);
			return ResponseEntity.status(500).body(automationSchoolServerException); 
		}
		
	}
	@PreAuthorize("hasRole('" + BaseConstants.ROLE_ADMINISTRADOR + "')")
	@PostMapping(value = "/sensor/numerico")
	public ResponseEntity<?> actualizarSensorNumerico(@RequestHeader Double valorActual, String mac)
	{
		try
		{
			Optional<SensorNumerico> optionalSensorNumerico = sensorNumericoRepo.findById(mac);
			if (!optionalSensorNumerico.isPresent())
			{
				log.error(Constants.ERR_SENSOR_NO_EXISTE);
				throw new AutomationSchoolServerException(Constants.ERR_SENSOR_CODE, Constants.ERR_SENSOR_NO_EXISTE);
			}
			
			SensorNumerico sensorNumerico = optionalSensorNumerico.get();
			sensorNumerico.setValorActual(valorActual);
			
			sensorNumericoRepo.saveAndFlush(sensorNumerico);
			
			log.info(Constants.ELEMENTO_MODIFICADO);
			
			return ResponseEntity.ok().build();
			
		} 
		catch (AutomationSchoolServerException automationSchoolServerException)
		{
			return ResponseEntity.badRequest().body(automationSchoolServerException);
		}
		catch (Exception exception) 
		{
			AutomationSchoolServerException automationSchoolServerException = new AutomationSchoolServerException(Constants.ERR_SENSOR_CODE, Constants.ERR_CODE);
			return ResponseEntity.status(500).body(automationSchoolServerException); 
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
