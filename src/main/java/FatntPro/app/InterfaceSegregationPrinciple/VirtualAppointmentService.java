package FatntPro.app.InterfaceSegregationPrinciple;

import java.util.HashMap;
import java.util.Map;

/*
*
* Clase para consultar el progreso mensual en el Interface Segregation Principle 
*
*/
public class VirtualAppointmentService {
	
	public Map<String, Map<String, Object>> consultProgress(String id, String name) {
		// Código que realiza la petición para solicitar citas virtuales con profesionales de la salud por el ID del usuario
		// Se recrea respuesta para retornar un ejemplo 
		
		// Ejemplo respuesta:
		// Crear el objeto con la estructura deseada
		Map<String, Map<String, Object>> response = new HashMap<>();
		
		// Crear el mapa interno para el usuario
		Map<String, Object> user = new HashMap<>();
		user.put("id", id);
		user.put("name", name);
		response.put("user", user);
   
		// Crear el mapa interno para el especialista
		Map<String, Object> specialist = new HashMap<>();
		specialist.put("name", "Doc. Andres Felipe Ramirez");
		specialist.put("specialism", "Fisioterapeuta");
		response.put("specialist", specialist);
   
		// Crear el mapa interno para el detalle de la consulta
		Map<String, Object> detail = new HashMap<>();
		detail.put("day", "16");
		detail.put("month", "Abril");
		detail.put("hour", "1:30 pm");
		detail.put("url", "https://teams.microsoft.com/l/team/19%3aUDxkphQZ0_F39ju74-HE15ii9gv8iw-DfcsmE7XIJRE1%40thread.tacv2/conversations?groupId=78bb3e8e-787a-4169-9b05-e40fc58b264c&tenantId=a2ba4345-7764-4d22-b6a1-7cf528f3b3a5");
		detail.put("code", "2Lg0j15");
		response.put("detailConsultation", detail);
   
		return response;
	}

}
