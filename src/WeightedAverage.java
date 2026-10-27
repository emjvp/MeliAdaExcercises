void main() {

    double[][] grades = {
        {7, 8, 6},
        {9, 5, 7},
        {6, 6, 9}
    };

    double[] weights = {0.2, 0.3, 0.5};

    for (int i = 0; i < grades.length; i++) {
        double average = 0.0;
        for (int j = 0; j < grades[i].length; j++) {
            average += grades[i][j] * weights[j];
        }
        System.out.println("Estudiante "+ (i+1) +" Promedio: "+average);
        System.out.println(average > 6 ? "Aprobó" : "Reprobó");
        System.out.println("----------------------------------");
    }

}
