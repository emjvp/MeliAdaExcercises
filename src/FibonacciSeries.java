void main() {
    Scanner sc = new Scanner(System.in);
    int initialNumber = 0;
    int nextNumber = 1;
    System.out.print("Ingresa el límite de la serie de fibonacci: ");
    int fibonacciLimit = sc.nextInt();
    System.out.print(initialNumber + ", ");
    while (nextNumber <= fibonacciLimit) {
        System.out.printf(initialNumber + nextNumber <= fibonacciLimit ? "%d, " : "%d", nextNumber);
        int pivot = initialNumber + nextNumber;
        initialNumber = nextNumber;
        nextNumber = pivot;

    }

    sc.close();
}
