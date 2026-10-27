void main() {

    Scanner input = new Scanner(System.in);
    double[] grades = new double[3];

    for(int i = 0; i < grades.length; i++){
        System.out.printf("Ingresa la nota nro # %d \n", i+1);
        grades[i] = input.nextDouble();
    }

    double sum = 0.0;
    for (double grade : grades) {
        sum += grade;
    }

    double average = sum / grades.length;

    System.out.printf("El promedio de las notas es: %.2f%n", average);
    input.close();

}
