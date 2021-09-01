/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoparqueadero;
import java.util.*;



/**
 *
 * @author mario castañeda
 */
public class ProyectoParqueadero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //creo variables para programa sea ejecutable y un arraylist para ingresar los autos 
        double pagoMotos = 0, pagoCarro = 0, pagoCamion = 0;
        int eMotos = 0, eCarro = 0, eCamion = 0;
        int exit = 0, opcion = 0;
        int opcionv = 0;
        int opcionp = 0;
       
        ArrayList<vehiculos> EnParqueo = new ArrayList<vehiculos>();
        ArrayList<Motos> pm = new ArrayList<Motos>();
        ArrayList<Carro> pc = new ArrayList<Carro>();
        ArrayList<Camion> pca = new ArrayList<Camion>();
        Scanner entrada = new Scanner(System.in);
        while (exit != 1) {

            menu();
            try {
                opcion = entrada.nextInt();
            } catch (Exception e) {
                System.out.println("Opcion no valida.");
                entrada = new Scanner(System.in);
            }

            switch (opcion) {
                case 1:
                    int exitp = 0;
                    while (exitp != 1) {

                        menup();
                        try {
                            opcionp = entrada.nextInt();
                        } catch (Exception e) {
                            System.out.println("Opcion no valida.");
                            entrada = new Scanner(System.in);
                        }//fin de catch
                        switch (opcionp) {
                            case 1:
                                //ingreso y valido datos de tipo entero y double en un rango de 1 a 10
                                do {
                                    System.out.println("Ingrese Disponibilidad para motos.");
                                    try {
                                        eMotos = entrada.nextInt();
                                    } catch (Exception e) {
                                        System.out.println(" Opcion no valida.");
                                        entrada = new Scanner(System.in);
                                    }//fin de catch

                                } while (eMotos < 1 || eMotos > 10);

                                do {
                                    System.out.println("Ingrese Costo de Parqueo para motos .");

                                    try {
                                        pagoMotos = entrada.nextDouble();
                                    } catch (Exception e) {
                                        System.out.println("Opcion no valida.");
                                        entrada = new Scanner(System.in);
                                    }//fin de catch

                                } while (pagoMotos < 1 || pagoMotos > 100);

                                break;
                            case 2:

                                do {
                                    System.out.println("Ingrese Disponibilidad para carros.");
                                    try {
                                        eCarro = entrada.nextInt();
                                    } catch (Exception e) {
                                        System.out.println("Opcion no valida.");
                                        entrada = new Scanner(System.in);
                                    }

                                } while (eCarro < 1 || eCarro > 10);

                                do {
                                    System.out.println("Ingrese Costo de Parqueo para carros.");

                                    try {
                                        pagoCarro = entrada.nextDouble();
                                    } catch (Exception e) {
                                        System.out.println("Opcion no valida.");
                                        entrada = new Scanner(System.in);
                                    }

                                } while (pagoCarro < 1 || pagoCarro > 100);

                                break;
                            case 3:
                                do {
                                    System.out.println("Ingrese Disponibilidad para camiones.");
                                    try {
                                        eCamion = entrada.nextInt();
                                    } catch (Exception e) {
                                        System.out.println("Opcion no valida.");
                                        entrada = new Scanner(System.in);
                                    }

                                } while (eCamion < 1 || eCamion > 10);

                                do {
                                    System.out.println("Ingrese Costo de Parqueo para camiones.");

                                    try {
                                        pagoCamion = entrada.nextDouble();
                                    } catch (Exception e) {
                                        System.out.println("Opcion no valida.");
                                        entrada = new Scanner(System.in);
                                    }

                                } while (pagoCamion < 1 || pagoCamion > 100);
                                break;

                            case 4:
                                exitp = 1;
                                break;
                            default:
                                System.out.println("");

                        }//fin de switch
                    }//fin de while
                    break;
                case 2:
                    int exitv = 0;
                    while (exitv != 1) {
                        menuv();
                        try {
                            opcionv = entrada.nextInt();
                        } catch (Exception e) {
                            System.out.println("Opcion no valida.");
                            entrada = new Scanner(System.in);
                        }
                        switch (opcionv) {
                            case 1:

                                //verifico datos de moto como placa que sea solo de 5 caracteres
                                System.out.println("Ingresando datos de moto.");
                                int tp = 0;
                                String placa;
                                do {
                                    System.out.println("Ingrese placa de moto.");
                                    placa = entrada.next();
                                    tp = placa.length();
                                } while (tp != 5);
                                //crear y agregra moto
                                Motos m = new Motos(placa);
                                pm.add(m);
                                int TamaMotos = pm.size();
                                //validar espacio de parqueo de motos 
                                // for (Motos temp : pm) {
                                if (TamaMotos <= eMotos) {
                                    Calendar horaIngreso = Calendar.getInstance();
                                    int minuto = horaIngreso.get(Calendar.MINUTE);
                                    m.setmEntrada(minuto);
                                    EnParqueo.add(m);

                                } else {
                                    System.out.println(" Parqueo de motos lleno.");
                                }

                                //}
                                for (vehiculos temp : EnParqueo) {

                                    System.out.println(" lo que hay en el parqueo: " + temp.toString());
                                }

                                break;
                            case 2:

                                //verifico datos del carro  como placa que sea solo de 5 caracteres
                                System.out.println("Ingresando datos del Carro.");
                                int tap = 0;
                                String placaCarro;
                                do {
                                    System.out.println("Ingrese placa del carro.");
                                    placaCarro = entrada.next();
                                    tap = placaCarro.length();
                                } while (tap != 5);
                                //crear y agregra carro
                                Carro c = new Carro(placaCarro);
                                pc.add(c);
                                int TamaCarro = pc.size();
                                //validar espacio de parqueo de carros
                                if (TamaCarro <= eCarro) {
                                    Calendar horaIngreso = Calendar.getInstance();
                                    int minuto = horaIngreso.get(Calendar.MINUTE);
                                    c.setmEntrada(minuto);
                                    EnParqueo.add(c);

                                } else {
                                    System.out.println(" Parqueo de Carros lleno.");
                                }

                                for (vehiculos temp : EnParqueo) {

                                    System.out.println(" lo que hay en el parqueo: " + temp.toString());

                                }

                                break;
                            case 3:
                                //verifico datos del carro  como placa que sea solo de 5 caracteres
                                System.out.println("Ingresando datos del camion.");
                                int tamp = 0;
                                String placaCamion;
                                do {
                                    System.out.println("Ingrese placa del camion.");
                                    placaCamion = entrada.next();
                                    tamp = placaCamion.length();
                                } while (tamp != 5);
                                //crear y agregra camion
                                Camion ca = new Camion(placaCamion);
                                pca.add(ca);
                                int TamaCamion = pc.size();
                                //validar espacio de parqueo de carros
                                if (TamaCamion <= eCamion) {
                                    Calendar horaIngreso = Calendar.getInstance();
                                    int minuto = horaIngreso.get(Calendar.MINUTE);
                                    ca.setmEntrada(minuto);
                                    EnParqueo.add(ca);

                                } else {
                                    System.out.println(" Parqueo de Camiones lleno.");
                                }

                                for (vehiculos temp : EnParqueo) {

                                    System.out.println(" lo que hay en el parqueo: " + temp.toString());

                                }
                                break;

                            case 4:
                                exitv = 1;
                                break;
                            default:
                                System.out.println("");

                        }//fin de switch
                    }//fin de while

                    break;
                case 3:
                    int tp = 0;
                    String placas;
                    do {
                        System.out.println("Ingrese placa del vehiculo a retirar.");
                        placas = entrada.next();
                        tp = placas.length();
                    } while (tp != 5);

                    //busco en el array list lo que se eliminara 
                    for (int i = 0; i < EnParqueo.size(); i++) {
                        vehiculos tempo = EnParqueo.get(i);
                        if (tempo.getPlaca().equalsIgnoreCase(placas)) {
                            System.out.println(" vehiculo saliendo: ");
                            if (tempo instanceof Motos) {
                                Motos mts = (Motos) tempo;
                                Calendar hsMoto = Calendar.getInstance();
                                int minutoss = hsMoto.get(Calendar.MINUTE); 
                                double totalpagar = calculoSalida(mts.getmEntrada(), minutoss, pagoMotos);
                                EnParqueo.remove(i);
                                mts.setPagoMotos(totalpagar);
                                System.out.print(mts.toString());
                                System.out.println(" total a pagar: " + mts.getPagoMotos());
                                System.out.println("");
                                System.out.println("");
                            } else if (tempo instanceof Carro) {
                                Carro car = (Carro) tempo;
                                Calendar hsCarro = Calendar.getInstance();
                                int minutoss = hsCarro.get(Calendar.MINUTE);
                                double totalpagar = calculoSalida(car.getmEntrada(), minutoss, pagoCarro);
                                EnParqueo.remove(i);
                                car.setPagoCarro(totalpagar);
                                System.out.println(car.toString());
                                System.out.println("total a pagar: " + car.getPagoCarro());
                            } else if (tempo instanceof Camion) {
                                Camion cam = (Camion) tempo;
                                Calendar hsCamion = Calendar.getInstance();
                                int minutoss = hsCamion.get(Calendar.MINUTE);
                                double totalpagar = calculoSalida(cam.getmEntrada(), minutoss, pagoCamion);
                                EnParqueo.remove(i);
                                cam.setPagoCamion(totalpagar);
                                System.out.println(cam.toString());
                                System.out.println("total a pagar: " + cam.getPagoCamion());
                            }
                            /* Calendar horaSalida = Calendar.getInstance();
                                    int minutos = horaSalida.get(Calendar.MINUTE);
                                    int segundos = horaSalida.get(Calendar.SECOND);
                            EnParqueo.remove(i);
                             */
                        }
                    }
                    //EnParqueo.remove(indice);   
                    for (vehiculos temp : EnParqueo) {

                        System.out.println("lo que hay en el parqueo: " + temp.toString());

                    }
                    break;

                case 4:
                    exit = 1;
                    break;
                default:
                    System.out.println("");

            }//fin de switch
        }//fin de while

    }

    private static void menu() {
        System.out.println(" Menu:");
        System.out.println(" 1. Administracion de Parqueo ");
        System.out.println(" 2. Ingreso de Vehiculos ");
        System.out.println(" 3. Retiro de vehiculos");
        System.out.println(" 4. Salir");
        System.out.println("Ingrese opcion:");
    }

    private static void menuv() {
        System.out.println(" Ingreso de Vehiculos: ");
        System.out.println(" 1. Motos ");
        System.out.println(" 2. Carros ");
        System.out.println(" 3. Camiones ");
        System.out.println(" 4. regresar ");
        System.out.println("Ingrese opcion: ");
    }

    private static void menup() {
        System.out.println(" Administracion de Parqueo: ");
        System.out.println(" 1. Disponibilidad Para Motos y costo ");
        System.out.println(" 2. Disponibilidad Para Carros y costo ");
        System.out.println(" 3. Disponibilidad Para Camiones y costo ");
        System.out.println(" 4. regresar ");
        System.out.println("Ingrese opcion: ");
    }

    static void ingresarVehiculo(int PagoParqueo, String Placa) {

        vehiculos moto = new vehiculos(Placa);

    }

    private static double calculoSalida(int Minutose, int Minutoss, double Pagos) {
        int minutos = Minutoss - Minutose;
        double totalpagar = Pagos * minutos;
        return totalpagar;
    }

}
