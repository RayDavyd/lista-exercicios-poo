public class Guerreiro extends Personagem {

    @Override
    public int atacar() {
        System.out.println("Guerreiro atacou com a espada!");
        return 20;
    }
}