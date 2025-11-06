import java.util.Scanner;

public class Ejercicio2ExamenPabloG {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Dime las horas");
        int horas = in.nextInt();
        System.out.println("Dime los minutos");
        int minutos = in.nextInt();
        System.out.println("Dime los segundos");
        int segundos = in.nextInt();
        System.out.println("¿Qué día de la semana es? L (Lunes),M (Martes),X (Miércoles),J (Jueves),V (Viernes),S (Sábado),D (Domingo)");
        String dia = in.next();

        System.out.println("¿Eres de España o de Japón? Escribe 'E' para España o 'J' para Japón");
        char pais = in.next().charAt(0);

        switch (pais) {
            case 'E':
                if (horas == 16) {
                    horas = 00;
                } else if (minutos == 59 && segundos == 59) {
                    horas = horas + 1;
                    minutos = 00;
                    segundos = 00;
                    if (horas == 17) {
                        horas = 01;
                    } else if (minutos == 59 && segundos == 59) {
                        horas = horas + 1;
                        minutos = 00;
                        segundos = 00;
                        if (horas == 18) {
                            horas = 02;
                        } else if (minutos == 59 && segundos == 59) {
                            horas = horas + 1;
                            minutos = 00;
                            segundos = 00;
                            if (horas == 19) {
                                horas = 03;
                            } else if (minutos == 59 && segundos == 59) {
                                horas = horas + 1;
                                minutos = 00;
                                segundos = 00;
                                if (horas == 20) {
                                    horas = 04;
                                } else if (minutos == 59 && segundos == 59) {
                                    horas = horas + 1;
                                    minutos = 00;
                                    segundos = 00;
                                    if (horas == 21) {
                                        horas = 05;
                                    } else if (minutos == 59 && segundos == 59) {
                                        horas = horas + 1;
                                        minutos = 00;
                                        segundos = 00;
                                        if (horas == 22) {
                                            horas = 06;
                                        } else if (minutos == 59 && segundos == 59) {
                                            horas = horas + 1;
                                            minutos = 00;
                                            segundos = 00;
                                            if (horas == 23) {
                                                horas = 07;
                                            } else if (minutos == 59 && segundos == 59) {
                                                horas = horas + 1;
                                                minutos = 00;
                                                segundos = 00;
                                                if (horas == 24) {
                                                    horas = 8;
                                                } else if (minutos == 59 && segundos == 59) {
                                                    horas = horas + 1;
                                                    minutos = 00;
                                                    segundos = 00;
                                                } else {
                                                    horas = horas + 8;
                                                    if (minutos == 59 && segundos == 59) ;
                                                    horas = horas + 1;
                                                    minutos = 00;
                                                    segundos = 00;
                                                }

                                                if (horas >= 16) {
                                                    System.out.println("Si es Lunes en España será Martes en Japón");
                                                    System.out.println("Si es Martes en España será Miércoles en Japón");
                                                    System.out.println("Si es Miércoles en España será Jueves en Japón");
                                                    System.out.println("Si es Jueves en España será Viernes en Japón");
                                                    System.out.println("Si es Viernes en España será Sábado en Japón");
                                                    System.out.println("Si es Sábado en España será Domingo en Japón");
                                                    System.out.println("Si es Domingo en España será Lunes en Japón");
                                                }
                                            }
                                            System.out.println("La hora en Japón es: " + horas + ":" + minutos + ":" + segundos);


                                        }
                                    }
                                }
                            }
                        }
                    }
                }

        }
    }
}
