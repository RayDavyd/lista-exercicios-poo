public class Arqueiro extends Personagem {

    @Override
    public int atacar() {
        System.out.println("Arqueiro disparou uma flecha!");
        return 15;
    }
}