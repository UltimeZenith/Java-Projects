public class Conditional3{
	public static void main(String[] args){
		System.out.println("Calificación final del estudiante Nicolás Ramírez: \n");
		int Calificacion = 97;
		
		if (Calificacion >= 0 && Calificacion < 60){
			System.out.println("Su calificación fue de: " + Calificacion + " puntos \n Usted Perdio");
		}else if(Calificacion >= 60 && Calificacion < 70){
			System.out.println("Su calificación fue de: " + Calificacion + " puntos \n Rango Bajo");
		}else if(Calificacion >= 70 && Calificacion < 80){
			System.out.println("Su calificación fue de: " + Calificacion + " puntos \n Rango Medio");
		}else if(Calificacion >= 80 && Calificacion < 90){
			System.out.println("Su calificación fue de: " + Calificacion + " puntos \n Rango Alto");
		}else if(Calificacion >= 90 && Calificacion < 100){
			System.out.println("Su calificación fue de: " + Calificacion + " puntos \n Rango Excelente");
		}else if(Calificacion == 100){
			System.out.println("Su calificación fue de: " + Calificacion + " puntos \n PERFECTO!!!");
		}else {
			System.out.println("Calificación invalida. La nota: " + Calificacion + " esta fuera del rango. Solo se admite de 0 a 100 puntos");
		}
	}
}