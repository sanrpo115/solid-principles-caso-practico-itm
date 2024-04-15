package FatntPro.app.InterfaceSegregationPrinciple;

import java.util.Map;

/*
 * 
 * Esta es una clase de tareas para usuario general que puede consultar el progreso mensual y solicitar citas virtuales a profesionales de la salud.
 * Entonces implementa las interfaces ICheckProgressTask y IRequestVistualAppointmentTask.
 * 
 */

public class GeneralUserTasks implements ICheckProgressTask, IRequestVirtualAppointmentTask {

	@Override
	public Map<String, Map<String, Object>> requestVirtualAppointment(String id, String name) {
		VirtualAppointmentService virtualAppointmentService = new VirtualAppointmentService();
		return virtualAppointmentService.consultProgress(id, name);
	}

	@Override
	public Map<String, Map<String, Object>> checkProgress(String id) {
		IspProgressService progressService = new IspProgressService();
		return progressService.consultProgress(id);
	}
	
	

}
