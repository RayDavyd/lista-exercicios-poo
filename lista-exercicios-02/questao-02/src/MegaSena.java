void main() {
    Scanner sc = new Scanner(System.in);
    int[] numeros = new int[6];
    int num;

    for (int i = 0; i < numeros.length; i++) {
        System.out.printf("Informe o %d numero: ", i + 1);
        num = sc.nextInt();

        boolean repetido = false;

        for (int j = 0; j < i; j++) {
            if (numeros[j] == num) {
                repetido = true;
            }
        }

        if (num >= 1 && num <= 60 && !repetido) {
            numeros[i] = num;
        } else {
            System.out.println("Invalido ou repetido!");
            i--;
        }

    }

    Arrays.sort(numeros);
    System.out.println(Arrays.toString(numeros));

}