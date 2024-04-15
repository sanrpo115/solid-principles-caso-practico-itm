package FatntPro.app.SingleResponsibilityPrinciple;

import java.text.MessageFormat;

/* 
 * La clase ProgressService solo tiene la responsabilidad de acumular el progreso y persistir información en DB
 */
public class ProgressService implements IProgressService {

	@Override
	public String accumulatedProgress(Activity activity) {
		// Código para acumular el progreso y almacenar info en la DB
		return MessageFormat.format("Se ha registrado la actividad: `{0}` correctamente en tu progreso mensual", activity.name);
	}

}
