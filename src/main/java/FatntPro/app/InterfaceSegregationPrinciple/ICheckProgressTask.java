package FatntPro.app.InterfaceSegregationPrinciple;

import java.util.Map;

/*
 * 
 * Todos los usuarios pueden consultar el progreso mensual propio o de un usuario por ID si es un profesional de la salud.
 * 
 */
public interface ICheckProgressTask {
	
	public Map<String, Map<String, Object>> checkProgress(String id);

}
