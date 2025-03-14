package Animal;

public class Main {
    public static void main(String[] args) {
        Animal gato = new Gato();
        Animal cachorro = new Cachorro();

        System.out.print("Animal gato emitindo som: ");
        System.out.println(gato.emitirSom());

        System.out.print("Animal cachorro emitindo som: ");
        System.out.println(cachorro.emitirSom());
    }


}
