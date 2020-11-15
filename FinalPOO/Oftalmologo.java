package FinalPOO;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Oftalmologo {

    String nombre;
    private List<Paciente> pacientes;

    public Oftalmologo(String nombre) {

        this.nombre = nombre;
        this.pacientes = new ArrayList<>();
    }

    public Paciente revisarPaciente(String nombre, int edad){

        if (nombre.contains("a") && edad < 40) {

            System.out.println("El señor/a " +nombre+ " Es apto para recibir una cirugía y la necesita.");
            Paciente paciente = new PacienteApto(nombre,edad, true);
            boolean existe = pacientes.stream().anyMatch(p -> p.getNombre().equals(nombre));
            if (!existe) {
                this.pacientes.add(paciente);
            }
            return paciente;

        } else{
            System.out.println("El señor/a " +nombre+ " No es apto para recibir una cirugía.");
            Paciente paciente = new PacienteNoApto(nombre,edad,false);
            boolean existe = pacientes.stream().anyMatch(p -> p.getNombre().equals(nombre));
            if (!existe) {
                this.pacientes.add(paciente);
            }
            return paciente;
        }
    }

    public void operarPacientes() {

        pacientes = pacientes.stream().filter(x -> (x instanceof PacienteApto) && x.isNecesitaCirugia()).collect(Collectors.toList());
        pacientes.forEach(paciente -> paciente.operar());
    }

    public List<Paciente> getPacientesAOperar(){
        pacientes = pacientes.stream().filter(x -> (x instanceof PacienteApto) && x.isNecesitaCirugia()).collect(Collectors.toList());
        System.out.println(pacientes);
        return pacientes;
    }

}
