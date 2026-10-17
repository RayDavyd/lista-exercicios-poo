public class Mago extends Personagem {

    @Override
    public int atacar() {
        System.out.println("Mago lançou uma magia!");
        return 30;
    }
}
