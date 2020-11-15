package FinalPOO.App;

import FinalPOO.Oftalmologo;

public class OftalmologoApp {

    public static void main(String[] args) {

        Oftalmologo oftalmologo = new Oftalmologo("Juan");

        oftalmologo.revisarPaciente("Mateo",20);
        oftalmologo.revisarPaciente("Gloria",59);
        oftalmologo.revisarPaciente("Laura",21);
        oftalmologo.revisarPaciente("Aura",84);
        oftalmologo.revisarPaciente("Jhon",25);
        oftalmologo.revisarPaciente("Anastasia",38);
        oftalmologo.revisarPaciente("Yenny",23);
        oftalmologo.revisarPaciente("Martha",62);


        oftalmologo.getPacientesAOperar();

        oftalmologo.operarPacientes();

        oftalmologo.getPacientesAOperar();

    }
}
