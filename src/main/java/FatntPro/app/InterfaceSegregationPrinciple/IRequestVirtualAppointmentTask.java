package FatntPro.app.InterfaceSegregationPrinciple;

import java.util.Map;

/*
 * 
 * Sólo algunos usuarios pueden solicitar citas con profesionales de la salud, por lo que esta función tiene una interfaz propia.
 * 
 */
public interface IRequestVirtualAppointmentTask {
	
	public Map<String, Map<String, Object>> requestVirtualAppointment(String id, String name);

}
