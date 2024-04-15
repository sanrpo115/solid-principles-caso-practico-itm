package FatntPro.app.InterfaceSegregationPrinciple;

import java.util.HashMap;
import java.util.Map;

/*
 *
 * Clase para consultar el progreso mensual en el Interface Segregation Principle 
 *
 */
public class IspProgressService {
	
	public Map<String, Map<String, Object>> consultProgress(String id) {
		// Código que consulta el progreso mensual por el ID del usuario
		// Se recrea respuesta para retornar un ejemplo 
		
		// Ejemplo respuesta:
		// Crear el objeto con la estructura deseada
		Map<String, Map<String, Object>> progress = new HashMap<>();
		
		// Crear el mapa interno para el mes de marzo
		Map<String, Object> lastMonth = new HashMap<>();
		lastMonth.put("calories", 3425.23);
   
		// Crear el mapa interno para las actividades
		Map<String, Map<String, Object>> activities = new HashMap<>();
   
		// Agregar la actividad de Cardio
		Map<String, Object> cardio = new HashMap<>();
		cardio.put("duration", 320.5);
		cardio.put("intensity", 15);
		activities.put("cardio", cardio);
   
		// Agregar la actividad de Pesas
		Map<String, Object> strength = new HashMap<>();
		strength.put("avgWeight", 45.5);
		strength.put("unit", "Kg");
		activities.put("strength", strength);
   
		// Agregar el mapa de actividades al mapa de marzo
		lastMonth.put("activities", activities);
   
		// Agregar el mapa de marzo al objeto estadisticas
		progress.put("marzo", lastMonth);
		return progress;
	}
}
