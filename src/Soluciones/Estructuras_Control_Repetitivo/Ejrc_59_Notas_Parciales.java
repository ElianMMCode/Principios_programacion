import java.util.Scanner;

public static void main(){
    Scanner  t = new Scanner(System.in);
    System.out.println("Ingreses el numero de estudiantes");
    int total_estudiantes = t.nextInt();
int [][] examenes = new int [total_estudiantes][3];

for(int i =0; i< examenes.length; i++){
    System.out.println("Ingrese las notas del alumno "+(i+1)+" de 1 a 5");
    for(int j =0; j < examenes[0].length; j++){
        if (j==0){
            System.out.println("Matematicas");
            examenes[i][j]= t.nextInt();
        }else if (j==1){
            System.out.println("Programacion");
            examenes[i][j]= t.nextInt();
        }else if (j==2){
            System.out.println("Ingles");
            examenes[i][j]= t.nextInt();
        }
    }
}
//nota menor de programacion
int menor_programacion = 0;
int estudiante = 0;
int promedio = 0;
        for(int i =0; i< examenes.length; i++) {
int j = 1;
            if (examenes[i][j]<examenes[i+1][j]){
                menor_programacion=examenes[i][j];
                estudiante=i;
                promedio = examenes [i][j]+promedio;
            }
        }
    System.out.println("Nota menor de progrmacion\n"+menor_programacion+"\nEstudiante "+estudiante);


}



