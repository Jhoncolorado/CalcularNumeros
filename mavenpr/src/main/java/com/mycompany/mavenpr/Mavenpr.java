package com.mycompany.mavenpr;//Este es el programa donde se encuentra la clase principal del programa.

import javax.swing.*;//Aqui se importa la libreria swing para utilizar los dialogos de salida y entrada.

public class Mavenpr {//esta es la clase principal del programa pero pues no tiene codigo.
}

class Numeros {// Esta es la clase que contiene los atributos y metodos. 
    int numer;// Aqui definimos el tipo de dato y el nombre de la variable,ademas, este es un atributo que almacenara el numero ingresado por el usuario. 
    int i, neg = 0, par = 0;//Estos son atrbutos que se inicializan en 0  y se utilizan para contar los numeros negativos y pares respectivamente.

    public void entrada() {//este metodo se utilizan para ingresar los 5 numeros y contar los numeros pares y negativos.
        for (i = 0; i < 5; i++) {//seutiliza un bucle for para iterar 5 veces.
            numer = ingresarDatos("digite 1 numero");//se llama al metodo ingresar datos para ingresar un numero se asigna a la variable numer.
            if (numer % 2 == 0) {
                par++;//si utiliza una condicionl if para verificar si el numero es par(si el resto de dividir numer entee dos es 0).si es par se incrementa el contador par.
                
            }

            if (numer < 0) {
                neg++;//se utiliza otro condiconal if para verificar si el numero es negativo(si numero es menor que o). si es negativo. se incrementa el el contador neg.
            }
        }

        JOptionPane.showMessageDialog(null, "el numero de numeros pares es: " + par + "\n" 
                                      + " y el numero de numeros negativos es: " + neg);//se muestra un mensaje con el numero de numeros pares y negativos utilizando JOptionPane.showMessageDialog
    }

    public static int ingresarDatos(String mensaje) {//este metodo se utiliza para ingresar un numero utilizando un dialogo de entrada.
        String cadena;//se declara la variable cadena para almacenar la entrad del usuario.
        int valor;//se declara una variable valor para almacenar el numero ingresado.
        cadena = JOptionPane.showInputDialog(null, mensaje);//se muestra un dialogo de entrada con el mensaje "digite un numero" utilizando JOptionPane.showInputDialog
        valor = Integer.parseInt(cadena);//se utiliza Integer.parseInt(cadena)para convertir la cadena aun entero y se asigna a la variable valor. 
        return valor;//se retorna el valor ingresado
    }
}