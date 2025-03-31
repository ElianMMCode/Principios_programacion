import java.util.Scanner;

public static void main(){
    Scanner  t = new Scanner(System.in);
    System.out.println("Ingreses el numero de estudiantes");
    int total_estudiantes = t.nextInt();
int [][] examenes = new int [total_estudiantes][3];

for(int i =0; i< examenes.length; i++){
    System.out.println("Ingrese las notas del alumno "+(i+1)+" de 0 a 5");
    for(int j =0; j < examenes[0].length; j++){
        if (j==0){
            System.out.println("Matematicas");
            examenes[i][0]= t.nextInt();
        }else if (j==1){
            System.out.println("Programacion");
            examenes[i][1]= t.nextInt();
        }else if (j==2){
            System.out.println("Ingles");
            examenes[i][2]= t.nextInt();
        }
    }
}
//nota menor de programacion
int menor_programacion = examenes[0][1];
int estudiante = 0;
int promedio = 0;
        for(int i =0; i<examenes.length; i++) {
            if (examenes[i][1]>menor_programacion){
                menor_programacion=examenes[i][1];
                estudiante=i;
            }
            promedio += examenes[i][1];
        }
    System.out.println("Nota menor de progrmacion\n"+menor_programacion+"\nEstudiante "+estudiante);
    int no_ingles_porcentaje =0;
    for(int i =0; i< examenes.length; i++) {
        if (examenes[i][2]==0){
            no_ingles_porcentaje++;
        }
    }
    System.out.println("El porcentaje de personas que no presentaron la prueba de ingles fue de "+(no_ingles_porcentaje/total_estudiantes));
    int estudiante_aprovado =0;
    int reprobado_matematicas =0;
    for(int i =0; i< examenes.length; i++){
        {
        if (examenes[i][0]>3 && examenes[i][1]>3 && examenes[i][2]>3){
            estudiante_aprovado++;
        }
        else if(examenes[i][0]<=3){
            reprobado_matematicas++;
        }
        }

        }
    System.out.println("El numero de estudiantes que aprobaron todas las materias fue de "+estudiante_aprovado);
    System.out.println("El promedio general en programacion fue de "+(promedio/total_estudiantes));
    System.out.println("Los estudiantes que reprobaron matematicas fueron "+reprobado_matematicas);

}



