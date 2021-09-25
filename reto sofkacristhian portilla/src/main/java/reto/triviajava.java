package reto;
//SE IMPORTAN TANTO LA CLASE DONDE ESTÁN LAS PREGUNTAS COMO UNA LIBRERIA NECESARIA PARA ACEPTAR DATOS POR TECLADO

import reto.Cat1;
import java.util.Scanner;

/**
 *
 * @author CRISTHIAN JULIAN PORTILLA DELGADO CC:1017184244 CEL 3043932750
 * EMAIL:CRISCORREO@ZOHO.COM
 */
public class triviajava {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

//        SE PIDE EL NOMBRE DEL JUGADOR PARA GUARDARLO EN UNA VARIABLE
        System.out.println("ingresa tu nombre");

        String jugador = teclado.next();
//        SE CREAN VARIABLES PARA ALMACENAR LOS PUNTOS DEL JUGADOR Y LA RESPUESTA DIGITADA POR EL JUGADOR
        int puntos;
        System.out.println("ingresa la categoría de pregunta 1 para arte 2 para matemáticas, 3 para ciencias, 4 para geografía y 5 para tecnología");
        int ingreso;
        int respuesta;
        ingreso = teclado.nextInt();

//        SE COMPRUEBA LA SELECCION DE CATEGORÍA PARA CARGAR LAS PREGUNTAS CORRESPONDIENTES
        if (ingreso == 1) {

//            creamos una variable para invocar la clase donde estan las preguntas
            Cat1 pc1;

            pc1 = new Cat1();

            System.out.println(jugador + " tu preguntade nivel 1 es :" + pc1.pregunta1c1);

//            SE IMPRIMEN LAS POSIBLES RESPUESTAS
            System.out.println("");

            System.out.println(pc1.respuesta1p1c1);
            System.out.println(pc1.respuesta2p1c1);
            System.out.println(pc1.respuesta3p1c1);
            System.out.println(pc1.respuesta4p1c1);
//            SE PIDE EL INGRESO DE LA RESPUESTA
            System.out.println("");
            System.out.println("digita tu respuesta");
            respuesta = teclado.nextInt();

              if (respuesta == pc1.respuestacp1c1) {
                puntos = 1;
                System.out.println("muy bien " + jugador + " tienes " + puntos + " punto");

                System.out.println("");

                System.out.println(jugador + " tu preguntade nivel 2 es :" + pc1.pregunta2c1);
                System.out.println("");
                System.out.println(pc1.respuesta1p2c1);
                System.out.println(pc1.respuesta2p2c1);
                System.out.println(pc1.respuesta3p2c1);
                System.out.println(pc1.respuesta4p2c1);
                System.out.println("digita tu respuesta");
                respuesta = teclado.nextInt();

                if (respuesta == pc1.respuestacp2c1) {
                    puntos = 2;
                    System.out.println("muy bien " + jugador + " tienes " + puntos + " puntos");

                    System.out.println("");
                    System.out.println(jugador + " tu preguntade nivel 3 es :" + pc1.pregunta3c1);
                    System.out.println("");
                    System.out.println(pc1.respuesta1p3c1);
                    System.out.println(pc1.respuesta2p3c1);
                    System.out.println(pc1.respuesta3p3c1);
                    System.out.println(pc1.respuesta4p3c1);
                    System.out.println("digita tu respuesta");
                    respuesta = teclado.nextInt();

                    if (respuesta == pc1.respuestacp3c1) {
                        puntos = 3;
                        System.out.println("muy bien " + jugador + " tienes " + puntos + " puntos");

                        System.out.println("");
                        System.out.println(jugador + " tu preguntade nivel 4 es :" + pc1.pregunta4c1);
                        System.out.println("");
                        System.out.println(pc1.respuesta1p4c1);
                        System.out.println(pc1.respuesta2p4c1);
                        System.out.println(pc1.respuesta3p4c1);
                        System.out.println(pc1.respuesta4p4c1);
                        System.out.println("digita tu respuesta");
                        respuesta = teclado.nextInt();
                        
                        
                          if (respuesta == pc1.respuestacp4c1) {
                        puntos = 4;
                        System.out.println("muy bien " + jugador + " tienes " + puntos + " puntos");

                        System.out.println("");
                        System.out.println(jugador + " tu preguntade nivel 5 es :" + pc1.pregunta5c1);
                        System.out.println("");
                        System.out.println(pc1.respuesta1p5c1);
                        System.out.println(pc1.respuesta2p5c1);
                        System.out.println(pc1.respuesta3p5c1);
                        System.out.println(pc1.respuesta4p5c1);
                        System.out.println("digita tu respuesta");
                        respuesta = teclado.nextInt();
                        
                           if (respuesta == pc1.respuestacp5c1) {
                        puntos = 5;
                        System.out.println("muy bien has ganado el juego " + jugador + " tienes " + puntos + " puntos , puedes jugar nuevamente e intentar otra categoría.");

                      

                    }else{
                               System.out.println("respuesta equivocada, "+jugador+" terminaste con "+puntos+" puntos");
                           }

                    }else{
                    System.out.println("respuesta equivocada, "+jugador+" terminaste con "+puntos+" puntos");
                    }

                } else {
                    System.out.println("respuesta equivocada, "+jugador+" terminaste con "+puntos+" puntos");
                }

            } else {
               System.out.println("respuesta equivocada, "+jugador+" terminaste con "+puntos+" puntos");
            }
        } 
              else {
                    puntos = 0;
                 System.out.println("respuesta equivocada, "+jugador+" terminaste con "+puntos+" puntos");
            }

     }else if (ingreso == 2) {
            Cat1 pc1;
            pc1 = new Cat1();
            {

//            creamos una variable para invocar la clase donde estan las preguntas   
            System.out.println(jugador + " tu preguntade nivel 1 es :" + pc1.pregunta1c2);

//            SE IMPRIMEN LAS POSIBLES RESPUESTAS
            System.out.println("");

            System.out.println(pc1.respuesta1p1c2);
            System.out.println(pc1.respuesta2p1c2);
            System.out.println(pc1.respuesta3p1c2);
            System.out.println(pc1.respuesta4p1c2);
//            SE PIDE EL INGRESO DE LA RESPUESTA
            System.out.println("");
            System.out.println("digita tu respuesta");
            respuesta = teclado.nextInt();

              if (respuesta == pc1.respuestacp1c2) {
                puntos = 1;
                System.out.println("muy bien " + jugador + " tienes " + puntos + " punto");

                System.out.println("");

                System.out.println(jugador + " tu preguntade nivel 2 es :" + pc1.pregunta2c2);
                System.out.println("");
                System.out.println(pc1.respuesta1p2c2);
                System.out.println(pc1.respuesta2p2c2);
                System.out.println(pc1.respuesta3p2c2);
                System.out.println(pc1.respuesta4p2c2);
                System.out.println("digita tu respuesta");
                respuesta = teclado.nextInt();

                if (respuesta == pc1.respuestacp2c2) {
                    puntos = 2;
                    System.out.println("muy bien " + jugador + " tienes " + puntos + " puntos");

                    System.out.println("");
                    System.out.println(jugador + " tu preguntade nivel 3 es :" + pc1.pregunta3c2);
                    System.out.println("");
                    System.out.println(pc1.respuesta1p3c2);
                    System.out.println(pc1.respuesta2p3c2);
                    System.out.println(pc1.respuesta3p3c2);
                    System.out.println(pc1.respuesta4p3c2);
                    System.out.println("digita tu respuesta");
                    respuesta = teclado.nextInt();

                    if (respuesta == pc1.respuestacp3c2) {
                        puntos = 3;
                        System.out.println("muy bien " + jugador + " tienes " + puntos + " puntos");

                        System.out.println("");
                        System.out.println(jugador + " tu preguntade nivel 4 es :" + pc1.pregunta4c2);
                        System.out.println("");
                        System.out.println(pc1.respuesta1p4c2);
                        System.out.println(pc1.respuesta2p4c2);
                        System.out.println(pc1.respuesta3p4c2);
                        System.out.println(pc1.respuesta4p4c2);
                        System.out.println("digita tu respuesta");
                        respuesta = teclado.nextInt();
                        
                        
                          if (respuesta == pc1.respuestacp4c2) {
                        puntos = 4;
                        System.out.println("muy bien " + jugador + " tienes " + puntos + " puntos");

                        System.out.println("");
                        System.out.println(jugador + " tu preguntade nivel 5 es :" + pc1.pregunta5c2);
                        System.out.println("");
                        System.out.println(pc1.respuesta1p5c2);
                        System.out.println(pc1.respuesta2p5c2);
                        System.out.println(pc1.respuesta3p5c2);
                        System.out.println(pc1.respuesta4p5c2);
                        System.out.println("digita tu respuesta");
                        respuesta = teclado.nextInt();
                        
                           if (respuesta == pc1.respuestacp5c2) {
                        puntos = 5;
                        System.out.println("muy bien has ganado el juego " + jugador + " tienes " + puntos + " puntos , puedes jugar nuevamente e intentar otra categoría.");

                      

                    }else{
                                 System.out.println("respuesta equivocada, "+jugador+" terminaste con "+puntos+" puntos");
                           }

                    }else{
                     System.out.println("respuesta equivocada, "+jugador+" terminaste con "+puntos+" puntos");
                    }

                } else {
                    System.out.println("respuesta equivocada, "+jugador+" terminaste con "+puntos+" puntos");
                }

            } else {
               System.out.println("respuesta equivocada, "+jugador+" terminaste con "+puntos+" puntos");
            }
        } 
              else {
                    puntos = 0;
              System.out.println("respuesta equivocada, "+jugador+" terminaste con "+puntos+" puntos");
            }

     }
            

        }else if(ingreso==3){
            Cat1 pc1;
            pc1 = new Cat1();
            {

//            creamos una variable para invocar la clase donde estan las preguntas   
            System.out.println(jugador + " tu preguntade nivel 1 es :" + pc1.pregunta1c3);

//            SE IMPRIMEN LAS POSIBLES RESPUESTAS
            System.out.println("");

            System.out.println(pc1.respuesta1p1c3);
            System.out.println(pc1.respuesta2p1c3);
            System.out.println(pc1.respuesta3p1c3);
            System.out.println(pc1.respuesta4p1c3);
//            SE PIDE EL INGRESO DE LA RESPUESTA
            System.out.println("");
            System.out.println("digita tu respuesta");
            respuesta = teclado.nextInt();

              if (respuesta == pc1.respuestacp1c3) {
                puntos = 1;
                System.out.println("muy bien " + jugador + " tienes " + puntos + " punto");

                System.out.println("");

                System.out.println(jugador + " tu preguntade nivel 2 es :" + pc1.pregunta2c3);
                System.out.println("");
                System.out.println(pc1.respuesta1p2c3);
                System.out.println(pc1.respuesta2p2c3);
                System.out.println(pc1.respuesta3p2c3);
                System.out.println(pc1.respuesta4p2c3);
                System.out.println("digita tu respuesta");
                respuesta = teclado.nextInt();

                if (respuesta == pc1.respuestacp2c3) {
                    puntos = 2;
                    System.out.println("muy bien " + jugador + " tienes " + puntos + " puntos");

                    System.out.println("");
                    System.out.println(jugador + " tu preguntade nivel 3 es :" + pc1.pregunta3c3);
                    System.out.println("");
                    System.out.println(pc1.respuesta1p3c3);
                    System.out.println(pc1.respuesta2p3c3);
                    System.out.println(pc1.respuesta3p3c3);
                    System.out.println(pc1.respuesta4p3c3);
                    System.out.println("digita tu respuesta");
                    respuesta = teclado.nextInt();

                    if (respuesta == pc1.respuestacp3c3) {
                        puntos = 3;
                        System.out.println("muy bien " + jugador + " tienes " + puntos + " puntos");

                        System.out.println("");
                        System.out.println(jugador + " tu preguntade nivel 4 es :" + pc1.pregunta4c3);
                        System.out.println("");
                        System.out.println(pc1.respuesta1p4c3);
                        System.out.println(pc1.respuesta2p4c3);
                        System.out.println(pc1.respuesta3p4c3);
                        System.out.println(pc1.respuesta4p4c3);
                        System.out.println("digita tu respuesta");
                        respuesta = teclado.nextInt();
                        
                        
                          if (respuesta == pc1.respuestacp4c3) {
                        puntos = 4;
                        System.out.println("muy bien " + jugador + " tienes " + puntos + " puntos");

                        System.out.println("");
                        System.out.println(jugador + " tu preguntade nivel 5 es :" + pc1.pregunta5c3);
                        System.out.println("");
                        System.out.println(pc1.respuesta1p5c3);
                        System.out.println(pc1.respuesta2p5c3);
                        System.out.println(pc1.respuesta3p5c3);
                        System.out.println(pc1.respuesta4p5c3);
                        System.out.println("digita tu respuesta");
                        respuesta = teclado.nextInt();
                        
                           if (respuesta == pc1.respuestacp5c3) {
                        puntos = 5;
                        System.out.println("muy bien has ganado el juego " + jugador + " tienes " + puntos + " puntos , puedes jugar nuevamente e intentar otra categoría.");

                      

                    }else{
                                  System.out.println("respuesta equivocada, "+jugador+" terminaste con "+puntos+" puntos");
                           }

                    }else{
                  System.out.println("respuesta equivocada, "+jugador+" terminaste con "+puntos+" puntos");
                    }

                } else {
                    System.out.println("respuesta equivocada, "+jugador+" terminaste con "+puntos+" puntos");
                }

            } else {
               System.out.println("respuesta equivocada, "+jugador+" terminaste con "+puntos+" puntos");
            }
        } 
              else {
                    puntos = 0;
                System.out.println("respuesta equivocada, "+jugador+" terminaste con "+puntos+" puntos");
            }

     }
            

        }else if(ingreso==4){
            Cat1 pc1;
            pc1 = new Cat1();
            {

//            creamos una variable para invocar la clase donde estan las preguntas   
            System.out.println(jugador + " tu preguntade nivel 1 es :" + pc1.pregunta1c4);

//            SE IMPRIMEN LAS POSIBLES RESPUESTAS
            System.out.println("");

            System.out.println(pc1.respuesta1p1c4);
            System.out.println(pc1.respuesta2p1c4);
            System.out.println(pc1.respuesta3p1c4);
            System.out.println(pc1.respuesta4p1c4);
//            SE PIDE EL INGRESO DE LA RESPUESTA
            System.out.println("");
            System.out.println("digita tu respuesta");
            respuesta = teclado.nextInt();

              if (respuesta == pc1.respuestacp1c4) {
                puntos = 1;
                System.out.println("muy bien " + jugador + " tienes " + puntos + " punto");

                System.out.println("");

                System.out.println(jugador + " tu preguntade nivel 2 es :" + pc1.pregunta2c4);
                System.out.println("");
                System.out.println(pc1.respuesta1p2c4);
                System.out.println(pc1.respuesta2p2c4);
                System.out.println(pc1.respuesta3p2c4);
                System.out.println(pc1.respuesta4p2c4);
                System.out.println("digita tu respuesta");
                respuesta = teclado.nextInt();

                if (respuesta == pc1.respuestacp2c4) {
                    puntos = 2;
                    System.out.println("muy bien " + jugador + " tienes " + puntos + " puntos");

                    System.out.println("");
                    System.out.println(jugador + " tu preguntade nivel 3 es :" + pc1.pregunta3c4);
                    System.out.println("");
                    System.out.println(pc1.respuesta1p3c4);
                    System.out.println(pc1.respuesta2p3c4);
                    System.out.println(pc1.respuesta3p3c4);
                    System.out.println(pc1.respuesta4p3c4);
                    System.out.println("digita tu respuesta");
                    respuesta = teclado.nextInt();

                    if (respuesta == pc1.respuestacp3c4) {
                        puntos = 3;
                        System.out.println("muy bien " + jugador + " tienes " + puntos + " puntos");

                        System.out.println("");
                        System.out.println(jugador + " tu preguntade nivel 4 es :" + pc1.pregunta4c4);
                        System.out.println("");
                        System.out.println(pc1.respuesta1p4c4);
                        System.out.println(pc1.respuesta2p4c4);
                        System.out.println(pc1.respuesta3p4c4);
                        System.out.println(pc1.respuesta4p4c4);
                        System.out.println("digita tu respuesta");
                        respuesta = teclado.nextInt();
                        
                        
                          if (respuesta == pc1.respuestacp4c4) {
                        puntos = 4;
                        System.out.println("muy bien " + jugador + " tienes " + puntos + " puntos");

                        System.out.println("");
                        System.out.println(jugador + " tu preguntade nivel 5 es :" + pc1.pregunta5c4);
                        System.out.println("");
                        System.out.println(pc1.respuesta1p5c4);
                        System.out.println(pc1.respuesta2p5c4);
                        System.out.println(pc1.respuesta3p5c4);
                        System.out.println(pc1.respuesta4p5c4);
                        System.out.println("digita tu respuesta");
                        respuesta = teclado.nextInt();
                        
                           if (respuesta == pc1.respuestacp5c4) {
                        puntos = 5;
                        System.out.println("muy bien has ganado el juego " + jugador + " tienes " + puntos + " puntos , puedes jugar nuevamente e intentar otra categoría.");

                      

                    }else{
                                   System.out.println("respuesta equivocada, "+jugador+" terminaste con "+puntos+" puntos");
                           }

                    }else{
                       System.out.println("respuesta equivocada, "+jugador+" terminaste con "+puntos+" puntos");
                    }

                } else {
                    System.out.println("respuesta equivocada, "+jugador+" terminaste con "+puntos+" puntos");
                }

            } else {
                System.out.println("respuesta equivocada, "+jugador+" terminaste con "+puntos+" puntos");
            }
        } 
              else {
                    puntos = 0;
              System.out.println("respuesta equivocada, "+jugador+" terminaste con "+puntos+" puntos");
            }

     }
            

        }else if(ingreso==5){
            Cat1 pc1;
            pc1 = new Cat1();
            {

//            creamos una variable para invocar la clase donde estan las preguntas   
            System.out.println(jugador + " tu preguntade nivel 1 es :" + pc1.pregunta1c5);

//            SE IMPRIMEN LAS POSIBLES RESPUESTAS
            System.out.println("");

            System.out.println(pc1.respuesta1p1c5);
            System.out.println(pc1.respuesta2p1c5);
            System.out.println(pc1.respuesta3p1c5);
            System.out.println(pc1.respuesta4p1c5);
//            SE PIDE EL INGRESO DE LA RESPUESTA
            System.out.println("");
            System.out.println("digita tu respuesta");
            respuesta = teclado.nextInt();

              if (respuesta == pc1.respuestacp1c5) {
                puntos = 1;
                System.out.println("muy bien " + jugador + " tienes " + puntos + " punto");

                System.out.println("");

                System.out.println(jugador + " tu preguntade nivel 2 es :" + pc1.pregunta2c5);
                System.out.println("");
                System.out.println(pc1.respuesta1p2c5);
                System.out.println(pc1.respuesta2p2c5);
                System.out.println(pc1.respuesta3p2c5);
                System.out.println(pc1.respuesta4p2c5);
                System.out.println("digita tu respuesta");
                respuesta = teclado.nextInt();

                if (respuesta == pc1.respuestacp2c5) {
                    puntos = 2;
                    System.out.println("muy bien " + jugador + " tienes " + puntos + " puntos");

                    System.out.println("");
                    System.out.println(jugador + " tu preguntade nivel 3 es :" + pc1.pregunta3c5);
                    System.out.println("");
                    System.out.println(pc1.respuesta1p3c5);
                    System.out.println(pc1.respuesta2p3c5);
                    System.out.println(pc1.respuesta3p3c5);
                    System.out.println(pc1.respuesta4p3c5);
                    System.out.println("digita tu respuesta");
                    respuesta = teclado.nextInt();

                    if (respuesta == pc1.respuestacp3c5) {
                        puntos = 3;
                        System.out.println("muy bien " + jugador + " tienes " + puntos + " puntos");

                        System.out.println("");
                        System.out.println(jugador + " tu preguntade nivel 4 es :" + pc1.pregunta4c5);
                        System.out.println("");
                        System.out.println(pc1.respuesta1p4c5);
                        System.out.println(pc1.respuesta2p4c5);
                        System.out.println(pc1.respuesta3p4c5);
                        System.out.println(pc1.respuesta4p4c5);
                        System.out.println("digita tu respuesta");
                        respuesta = teclado.nextInt();
                        
                        
                          if (respuesta == pc1.respuestacp4c5) {
                        puntos = 4;
                        System.out.println("muy bien " + jugador + " tienes " + puntos + " puntos");

                        System.out.println("");
                        System.out.println(jugador + " tu preguntade nivel 5 es :" + pc1.pregunta5c5);
                        System.out.println("");
                        System.out.println(pc1.respuesta1p5c5);
                        System.out.println(pc1.respuesta2p5c5);
                        System.out.println(pc1.respuesta3p5c5);
                        System.out.println(pc1.respuesta4p5c5);
                        System.out.println("digita tu respuesta");
                        respuesta = teclado.nextInt();
                        
                           if (respuesta == pc1.respuestacp5c5) {
                        puntos = 5;
                        System.out.println("muy bien has ganado el juego " + jugador + " tienes " + puntos + " puntos , puedes jugar nuevamente e intentar otra categoría.");

                      

                    }else{
                                 System.out.println("respuesta equivocada, "+jugador+" terminaste con "+puntos+" puntos");
                           }

                    }else{
                      System.out.println("respuesta equivocada, "+jugador+" terminaste con "+puntos+" puntos");
                    }

                } else {
                  System.out.println("respuesta equivocada, "+jugador+" terminaste con "+puntos+" puntos");
                }

            } else {
               System.out.println("respuesta equivocada, "+jugador+" terminaste con "+puntos+" puntos");
            }
        } 
              else {
                    puntos = 0;
               System.out.println("respuesta equivocada, "+jugador+" terminaste con "+puntos+" puntos");
            }

     }
            

        }
        
    }
    

}
