package Ex10;

public class Maquina implements Maquinas, Processo{
    @Override
    public void ligar() {
        System.out.println("Máquina manual ligada.");
    }

    @Override
    public void processarMaterial(){
        System.out.println("Maquina processando");
    }

}
