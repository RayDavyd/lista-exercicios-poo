void main() {
    Scanner sc = new Scanner(System.in);
    int a = 0;
    int b = 1;
    int n = sc.nextInt();

    for (int i = 0; i < n; i++) {
        System.out.print(a + " ");
        int aux = a + b;
        a = b;
        b = aux;

    }

    sc.close();
}