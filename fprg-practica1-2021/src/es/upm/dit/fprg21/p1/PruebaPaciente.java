package es.upm.dit.fprg21.p1;

public class PruebaPaciente {
	public static void main(String[] args) {
		Paciente p = new Paciente("23543212B", "Pedro", "Jimenez", 47, 172, 94, "A+", 36.5, 175, 105);
		
		String dni =p.getDni();
		System.out.println("El dni del paciente es: " + dni);
		
		String nombre = p.getNombre();
		System.out.println("El nombre del paciente es: " + nombre);
		
		String apellidos = p.getApellidos();
		System.out.println("Los apellidos del paciente son: " + apellidos);
		
		String grupoSanguineo = p.getGrupoSanguineo();
		System.out.println("El grupo saguíneo del paciente es: " + grupoSanguineo);
		
		int edad = p.getEdad();
		System.out.println("La edad del paciente es: " + edad);
		
		int altura = p.getAltura();
		System.out.println("La altura del paciente es: " + altura);
		
		int peso = p.getPeso();
		System.out.println("El peso del paciente es: " + peso);
		
		int presionSistolica = p.getPresionSistolica();
		System.out.println("La presión sistólica del paciente es: " + presionSistolica);
		
		int presionDistolica = p.getPresionDistolica();
		System.out.println("La presión distólica del paciente es: " + presionDistolica);
		
		double temperatura = p.getTemperatura();
		System.out.println("La temperatura del paciente es: " + temperatura);

		int edadPaciente = 48;
		p.setEdad(edadPaciente);;
		System.out.println("La edad del paciente ha cambiado a : " + p.getEdad());

		String grupoSanguineoPaciente = "B+";
		p.setGrupoSanguineo(grupoSanguineoPaciente);
		System.out.println("El grupo sanguineo del paciente ha cambiado a : " + p.getGrupoSanguineo());

		double temperaturaPaciente  = 39.5;
		p.setTemperatura(temperaturaPaciente);
		System.out.println("La temperatura del paciente  ha cambiado a: " +p.getTemperatura());

	}

}