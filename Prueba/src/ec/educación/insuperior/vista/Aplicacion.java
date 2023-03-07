 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.educación.insuperior.vista;

import java.util.Scanner;

/**
 *
 * @author l94
 */
public class Aplicacion {
      public static void main(String[] args) {
       kilometros();
    }
     
  public static void ContarNumeros(){
         Scanner sc = new Scanner(System.in);
        int n, contador = 0;
        System.out.print("Introduce un número entero (0 para acabar): ");
        n = sc.nextInt();      //se introduce el primer número
        while (n != 0) {       //mientras el número introducido no sea 0
            contador++;        //esta variable contendrá cuántos números se han leído.                            
            System.out.print("Introduce un número entero (0 para acabar): ");
            n = sc.nextInt();  //se introduce el siguiente número
        }
        System.out.println("Se han introducido " + contador + " números");
    }
  public static void kilometros(){
       Scanner sc = new Scanner(System.in);
        int millas;
        double km;
        System.out.println("Convertir Millas a Kilometros");
        do {

            System.out.print("Introduce millas (0 para finalizar): ");
            millas = sc.nextInt();

            if (millas != 0) {
                km = millas * 1.6093;
                System.out.printf("%d millas equivalen a %.2f KM %n", millas, km);                      
            }

        } while (millas != 0);
    }
  public static void numerosenteros(){
     System.out.println ("Insert a number");
Scanner sc = new Scanner (System.in);

int number1;

number1= sc.nextInt ();


if (number1<0){
System.out.println ("Error");
}else {
double a= Math.sqrt (number1);
double b= Math.pow (number1, 2);
System.out.println ("Al cuadrado es "+b+" y la raiz es "+a);
}

}
  public static void suerte(){
     Scanner sc= new Scanner (System.in);
System.out.println("año");
int a=sc.nextInt();
System.out.println("mes ");
int m=sc.nextInt();
System.out.println("dia");
int d=sc.nextInt();
int s=a+m+d;

String v=Integer.toString(s);
int sum=0;
for (int i = 0; i <v.length(); i++) {
sum=sum+Integer.parseInt(v.charAt(i)+"");

}
System.out.println("nUMERO DE LA SUERTE "+sum);


}
  public static void velocidad(){
       
         Scanner sc = new Scanner(System.in);
         double gradosC, gradosF;
         System.out.println("Introduce grados Centígrados:");
         gradosC = sc.nextDouble();
         gradosF = 32 + (9 * gradosC / 5);
         System.out.println(gradosC +" ºC = " + gradosF + " ºF");                                                 
  }
  public static void circunferencia(){
         Scanner sc = new Scanner(System.in);
           double radio, longitud, area;
           System.out.println("Introduce radio de la circunferencia:");
           radio = sc.nextDouble();
           longitud = 2 * Math.PI * radio;
           area = Math.PI * Math.pow(radio, 2);
           System.out.println("Longitud de la circunferencia -> " + longitud);                                    
           System.out.println("Area de la circunferencia -> " + area);
    }
  public static void facturacion(){
      Scanner input  = new Scanner(System.in);

		int totaldeFacturas=0, contador = 0;
		double importeFactura= 0, importeTotal =0, costo_mayor = 0, numeroDeFactura = 0;
		int num_factura = 0;

		System.out.print("¿Cuantas Facturas desea Capturar:? ");
		num_factura = input.nextInt();
		double array[][] = new double[num_factura][4];
		double array2[][] = new double[num_factura][2];
 
		for(int i = 0; i < num_factura; i++){

			System.out.println(""); 
			System.out.println("Factura n." + (i+1));
			System.out.println("Ingrese el codigo(en N°) : ");
			array[i][0] = input.nextInt();

			System.out.println("cuantos kilos fueron: ");
			array[i][1] = input.nextInt();

			System.out.println("ingrese el precio por kilo: ");
			array[i][2] = input.nextInt();

			System.out.println(" ");
			array[i][3] = array[i][1] * array[i][2];
			importeFactura = (array[i][3]);

			System.out.println("El total a pagar de la factura N." + (i + 1) + " es: $ " + importeFactura);
			importeTotal = importeTotal + importeFactura;
			contador++;

			if(contador == 5){
				
				System.out.println("sen han impreso 5 facturas");
				System.out.println("El total de las 5 facturas es: " + importeTotal);
				contador = 0;
				importeTotal = 0;
			}

			if(array[i][3] >= 1000){
				array2[i][0] = array[i][3];
				array2[i][1] = i + 1;
			}

		}

		for(int i = 0; i < array2.length; i++){
				for(int j = 1; j < 2; j++){

					costo_mayor = array2[i][0];
					numeroDeFactura = array2[i][1];
					
			}
				
			if(costo_mayor > 0 && numeroDeFactura > 0){
					System.out.print("La factura N. "+numeroDeFactura+ " tiene un importe          mayor o igual a $1,000: " + "$"+costo_mayor);


					

			System.out.println("");

			}

		}

	}
  public static void hipotenusa(){
  Scanner sc = new Scanner(System.in);
    System.out.print("Introduzca longitud del primer cateto: ");
    cateto1 = sc.nextDouble();
    System.out.print("Introduzca longitud del segundo cateto: ");
    cateto2 = sc.nextDouble();
    System.out.println("Hipotenusa -> " + Math.sqrt(Math.pow(cateto1,2)+ Math.pow(cateto2, 2)));
}
  public static void volumenEsfera(){
        Scanner sc = new Scanner(System.in);
        double radio, volumen;
        System.out.print("Introduzca radio de la esfera: ");
        radio = sc.nextDouble();
        System.out.println("Volumen de la esfera de radio " + radio + " = " + (4.0/3)* Math.PI * Math.pow(radio, 3));  
    }
  public static void areatriangulo(){
         Scanner sc = new Scanner(System.in);
        double a,b,c,p;

        System.out.print("Introduzca longitud del primer lado del triángulo: ");
        a = sc.nextDouble();

        System.out.print("Introduzca longitud del segundo lado del triángulo: ");
        b = sc.nextDouble();

        System.out.print("Introduzca longitud del tercer lado del triángulo: ");
        c = sc.nextDouble();

        p = (a+b+c)/2;
        
        System.out.println("Area -> " +  Math.sqrt(p*(p-a)*(p-b)*(p-c)));
    }  
  public static void numero3sifras(){
        Scanner sc = new Scanner(System.in);
        int N;

        System.out.print("Introduzca valor de N: ");
        N = sc.nextInt(); //supondremos que el número introducido tiene 3 cifras
        
        System.out.println("Primera cifra de " + N + " -> " + (N/100));
        System.out.println("Cifra central de " + N + " -> " + (N/10)%10);
        System.out.println("Última cifra  de " + N + " -> " + (N%10));
        
    }     
  public static void añobisiesto(){
       Scanner sc = new Scanner(System.in);
        int año;

        System.out.print("Introduzca año: ");
        año = sc.nextInt();

        if (año % 4 == 0 && año % 100 != 0 || año % 400 == 0) {                                                 
            System.out.println("Es un año bisiesto");
        } else {
            System.out.println("No es un año bisiesto");
        }
    }
  public static void tiempo(){
      int H,M,S;
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca hora: ");
        H =  sc.nextInt();
        System.out.print("Introduzca minutos: ");
        M =  sc.nextInt();
        System.out.print("Introduzca segundos: ");
        S =  sc.nextInt();
        if(H>=0 && H<24 && M>=0 && M<60 && S>=0 && S<60)                                                          
           System.out.println("Hora correcta");
        else
            System.out.println("Hora incorrecta");
    }
  public static void meses(){
        Scanner sc = new Scanner(System.in);
        int mes;
        System.out.print("Introduzca número de mes: ");
        mes =  sc.nextInt();
        if(mes < 1 || mes > 12) //se comprueba que el valor del mes es correcto                                   
            System.out.println("Mes incorrecto");
        else{  //si el mes es correcto
            switch(mes){  //se muestra el nombre mediante una instrucción switch                                  
                case 1: System.out.print("Enero");
                        break;
                case 2: System.out.print("Febrero");
                        break;
                case 3: System.out.print("Marzo");
                        break;
                case 4: System.out.print("Abril");
                        break;
                case 5: System.out.print("Mayo");
                        break;
                case 6: System.out.print("Junio");
                        break;
                case 7: System.out.print("Julio");
                        break;
                case 8: System.out.print("Agosto");
                        break;
                case 9: System.out.print("Septiembre");
                        break;
                case 10: System.out.print("Octubre");
                        break;
                case 11: System.out.print("Noviembre");
                        break;
                case 12: System.out.print("Diciembre");
                        break;
            }
            // mostrar si es un mes de 30, 31 0 28 días
            if(mes == 4 || mes == 6 || mes == 9 || mes == 11)       
               System.out.println(" es un mes de 30 días");
            else if(mes == 2)
                     System.out.println(" es un mes de 28 días");
                   else
                      System.out.println(" es un mes de 31 días");
        }
    }
  public static void intercambio(){
        Scanner sc = new Scanner(System.in);
        int A, B, AUX;
        System.out.print("Introduzca valor de A: ");
        A = sc.nextInt();
        System.out.print("Introduzca Valor de B: ");
        B = sc.nextInt();
        System.out.println("Valores iniciales: A = " + A + "   B = " + B);                                        
        //instrucciones para hacer el intercambio
        //se utiliza una variable auxiliar
        AUX = A;
        A = B;
        B = AUX;      
        System.out.println("Valores intercambiados: A = " + A + "   B = " + B);                                   
    }
  public static void temperatura(){
       
       Scanner teclado=new Scanner(System.in);
int c,k;
char repetir;
do{
System.out.println("Introduce los grados centígrados: ");
c=teclado.nextInt();
k=c+273;
System.out.println(+c +" grados centígrados son " +k +" grados kelvin.");

do{
System.out.println("Repetir proceso? S/N");
repetir=teclado.next().charAt(0);
repetir=Character.toLowerCase(repetir);}
while(repetir!='s' && repetir!='n');

}while(repetir=='s');

}
  public static void matrices(){
 
        Scanner sc = new Scanner(System.in);
        int filas, columnas;

        //lectura del número de filas y columnas de las matrices
        do {
            System.out.print("Número de filas: ");
            filas = sc.nextInt();
        } while (filas < 1);
        do {
            System.out.print("Número de columnas: ");
            columnas = sc.nextInt();
        } while (columnas < 1);

        //crear las matrices A, B y C
        int[][] A = new int[filas][columnas];
        int[][] B = new int[filas][columnas];
        int[][] C = new int[filas][columnas];

        //Introducir los datos en las matrices A y B
        System.out.println("matriz A:");
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                System.out.print("Elemento[" + i + "][" + j + "] = ");                                            
                A[i][j] = sc.nextInt();
            }
        }

        System.out.println("matriz B:");
        for (int i = 0; i < B.length; i++) {
            for (int j = 0; j < B[i].length; j++) {
                System.out.print("Elemento[" + i + "][" + j + "] = ");
                B[i][j] = sc.nextInt();
            }
        }

        //obtener la matriz C como suma de las matrices A y B
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                C[i][j] = A[i][j] + B[i][j];
            }
        }

        //mostrar por pantalla las matrices A y B
        System.out.println("matriz A:");
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                System.out.printf("%3d", A[i][j]);
            }
            System.out.println();
        }
        System.out.println("\nmatriz B:");
        for (int i = 0; i < B.length; i++) {
            for (int j = 0; j < B[i].length; j++) {
                System.out.printf("%3d", B[i][j]);
            }
            System.out.println();
        }

        //mostrar la matriz suma de A + B
        System.out.println("\nmatriz Suma:");
        for (int i = 0; i < C.length; i++) {
            for (int j = 0; j < C[i].length; j++) {
                System.out.printf("%3d", C[i][j]);
            }
            System.out.println();
        }
    }
  public static void numeromayor(){
           Scanner sc = new Scanner(System.in);
        int[] numeros = new int[5];

        int total = numeros.length;
        for (int i = 0; i < total; i++) {
            System.out.print("Ingresa el N°" + (i + 1) + ": ");
            numeros[i] = sc.nextInt();
        }

        int mayor = 0;
        for (int i = 0; i < total; i++) {
            mayor = numeros[mayor] > numeros[i] ? mayor : i;
        }

        System.out.println("El mayor es = " + numeros[mayor]);
    }
  public static void descuento (){
     Scanner s =new Scanner (System.in);

   int cantpieza;
   double precio=5.0;
   float total;
       
        System.out.println("digite la cantidad de piezas que desea comprar");
        cantpieza=s.nextInt();
       
        if (cantpieza>50) {
            precio=4.50;
        }  if (cantpieza>100) {
            precio=4.00;
        }
     total=(float) (cantpieza*precio);
        
        System.out.println("la cantidad de piezas que usted compro fue "+cantpieza);
        System.out.println("el total a pagar es "+total);
       
    }
    }