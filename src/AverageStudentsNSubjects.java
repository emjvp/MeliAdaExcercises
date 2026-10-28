void main() {

    double[][] grades = {
            {7, 8, 6},
            {9, 5, 7},
            {6, 6, 9},
    };

    int allStudentsApproved = 0;
    boolean approved = true;
    for(int j = 0; j < grades.length; j++) {
        double sum = 0;
        for(int i = 0; i < grades[j].length; i++) {
            sum += grades[i][j];
            approved = grades[i][j] >= 6.0;
            if(!approved) { allStudentsApproved--; }
        }
        if(approved) { allStudentsApproved++; }
        double average = sum / grades.length;
        System.out.printf("Promedio estudiante %d: %.2f \n",(j + 1), average);
        System.out.println("-----------------------------------------------");
    }

    System.out.println("Estudiantes que aprobaron todas las materias: "+allStudentsApproved);
}