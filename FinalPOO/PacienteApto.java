package FinalPOO;

public class PacienteApto extends Paciente implements Operable{


    public PacienteApto(String nombre, int edad, boolean necesitaCirugia) {
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

        if (this.necesitaCirugia = true){

            System.out.println("El paciente "+ nombre +" ha sido operado con éxito");
            this.necesitaCirugia = false;
        }

    }
}
