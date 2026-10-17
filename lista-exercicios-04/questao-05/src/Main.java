
void main() {

    Personagem[] turno = {new Guerreiro(), new Mago(), new Arqueiro()};

    int danoTotal = 0;
    System.out.println("=== Turno de combate ===");
    for (Personagem p : turno) {
        danoTotal += p.atacar();
    }
    System.out.println("Dano total no turno: " + danoTotal);
}
