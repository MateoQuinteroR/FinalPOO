package FinalPOO;

public class PacienteNoApto extends Paciente{


    public PacienteNoApto(String nombre, int edad, boolean necesitaCirugia) {
        super(nombre, edad, necesitaCirugia);
    }

    @Override
    public String toString() {
        return "Paciente {" +
                "nombre = " + this.getNombre() + " edad = " + this.getEdad() +
                '}';
    }

    @Override
    public void operar() {

    }

}
