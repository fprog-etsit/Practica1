package es.upm.dit.fprg23.p1;

public class PruebaPaciente {

	public static void main(String[] args) {
		Paciente p = new Paciente("23543212B", "Pedro", "Jiménez", 47, 172, 94, "A+");
		
		String dni =p.getDni();
		System.out.println("El dni del paciente es: " + dni);
		
		String nombre = p.getNombre();
		System.out.println("El nombre del paciente es: " + nombre);
		
		String apellidos = p.getApellidos();
		System.out.println("Los apellidos del paciente son: " + apellidos);
		
		p.setApellidos("Jiménez García");
		System.out.println("Los nuevos apellidos del paciente son: " + p.getApellidos());
		
		// TODO: Continue sus pruebas a partir de aquí.
	}

}
