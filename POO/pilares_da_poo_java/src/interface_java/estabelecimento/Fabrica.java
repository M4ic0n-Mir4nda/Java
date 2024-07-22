package interface_java.estabelecimento;

import interface_java.equipamentos.copiadora.Copiadora;
import interface_java.equipamentos.digitalizadora.Digitalizadora;
import interface_java.equipamentos.digitalizadora.Scanner;
import interface_java.equipamentos.impressora.Deskjet;
import interface_java.equipamentos.impressora.Impressora;
import interface_java.equipamentos.impressora.LaserJet;
import interface_java.equipamentos.multifuncional.EquipamentoMultifuncional;

public class Fabrica {
    public static void main(String[] args) {
        EquipamentoMultifuncional em = new EquipamentoMultifuncional();

        // Deskjet deskjet = new Deskjet();

        Scanner scanner = new Scanner();

        Impressora impressora = em;
        Digitalizadora digitalizadora = scanner;
        Copiadora copiadora = em;

        impressora.imprimir();
        digitalizadora.digitalizar();
        copiadora.copiar();
    }
}
