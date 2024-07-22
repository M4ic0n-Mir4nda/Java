package interface_java.equipamentos.impressora;

public class LaserJet implements Impressora {
    @Override
    public void imprimir() {
        System.out.println("IMPRIMINDO LASERJET");
    }
}
