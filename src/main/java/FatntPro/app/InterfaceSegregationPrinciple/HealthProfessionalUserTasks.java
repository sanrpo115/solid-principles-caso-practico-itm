package FatntPro.app.InterfaceSegregationPrinciple;

import java.util.Map;

/*
 * 
 * Esta es una clase de tareas para usuario profesional de la salud que solamente puede consultar el progreso mensual.
 * Solamente implementa la interfaz ICheckProgressTask.
 * 
 */
public class HealthProfessionalUserTasks implements ICheckProgressTask {

	@Override
	public Map<String, Map<String, Object>> checkProgress(String id) {
		IspProgressService progressService = new IspProgressService();
		return progressService.consultProgress(id);
	}
	
	
}
