package com.clases;

import javax.swing.*;
import java.util.ArrayList;
import java.util.InputMismatchException;


public class MenuClientes extends Clientes {

    ArrayList<Personas> listapersonas = new ArrayList<>();
    ArrayList<Clientes> vectorClientes = new ArrayList<>();
    ArrayList<Producto> productos = new ArrayList<>();

    public MenuClientes() {
        super();
        menu();
    }

    private void menu() {
        boolean salir = false;
        Clientes clientes = null;
        Personas persona=null;

        while (!salir) {

            try {
                String menuOpcion = JOptionPane.showInputDialog("Inrese su opción: \n"
                        + " - 1 Agregar cliente\n"
                        + " - 2 Editar cliente\n"
                        + " - 3 Eliminar cliente\n"
                        + " - 4 Agregar productos\n"
                        + " - 5 Consultar clientes por documento y tipo de documento \n"
                        + " - 0 salir de la aplicacion");

                int opcion = Integer.parseInt(menuOpcion);
                switch (opcion) {
                    case 1:

                        String nombre = JOptionPane.showInputDialog("Nombre del cliente");
                        String telefono = JOptionPane.showInputDialog("Telefono del cliente");
                        String direccion = JOptionPane.showInputDialog("Direccion del cliente");


                        clientes = new Clientes(nombre, telefono, direccion, productos);
                        vectorClientes.add(clientes);
                        break;
                    case 2:
                        String nombreBusqueda = JOptionPane.showInputDialog("ingrese el nombre a buscar");
                        String nombrenuevo = JOptionPane.showInputDialog("ingrese el nombre nuevo");

                        for (int i = 0; i < vectorClientes.size(); i++) {
                            if (vectorClientes.get(i).getNombre().equals(nombreBusqueda)) {
                                vectorClientes.get(i).setNombre(nombrenuevo);
                            }
                        }
                        break;
                    case 3:

                        System.out.println("ingrese nombre a eliminar");
                        String nombreeliminar = JOptionPane.showInputDialog("ingrese nombre a eliminar");
                        clientes.getNombre();
                        Clientes clientesEliminar = null;

                        for (int i = 0; i < vectorClientes.size(); i++) {
                            if (vectorClientes.get(i).getNombre().equals(nombreeliminar)) {
                                clientesEliminar = vectorClientes.get(i);
                            }
                        }
                        int indice2 = vectorClientes.indexOf(clientesEliminar);
                        if (indice2 != -1) {
                            vectorClientes.remove(indice2);
                            System.out.println("cliente eliminado");

                        } else System.out.println("cliente no encontrado");


                        break;
                    case 4:

                        String nombreProducto = JOptionPane.showInputDialog("Nombre Del Producto");
                        String carateristicas = JOptionPane.showInputDialog("Caracteristicas Del producto");
                        String idProducto = JOptionPane.showInputDialog("ID Del Producto");
                        String condiciones = JOptionPane.showInputDialog("Condiciones Del Producto");

                        Producto producto = new Producto(nombreProducto, carateristicas, idProducto, condiciones);
                        productos.add(producto);
                        break;
                    case 5:

                        String celular= JOptionPane.showInputDialog("Ingrese celular");
                        String cedula=JOptionPane.showInputDialog("Ingrese cedula");;
                        persona = new Personas(cedula,celular);
                        listapersonas.add(persona);

                        System.out.println("ingrese Nummero CC a buscar");
                        String ccAbuscar = JOptionPane.showInputDialog("ingrese Numero CC a buscar");
                        clientes.getCedula();
                        Personas ccCliente=null;

                        for (int i = 0; i < listapersonas.size(); i++) {
                            if (listapersonas.get(i).getCedula().equals(ccAbuscar)) {
                                ccCliente = listapersonas.get(i);
                            }
                        }
                        for (int i = 0; i <vectorClientes.size() ; i++) {
                            System.out.println(vectorClientes.get(i).getNombre()+" "+listapersonas.get(i).getCedula()+
                                    " "+productos.get(i).getNombreProducto()+" "+productos.get(i).getIdProducto()+" "
                                    +productos.get(i).getCarateristicas()+ " "+productos.get(i).getCondiciones());

                        }
                        break;
                    case 0:
                        salir = true;
                        System.out.println("Muchas gracias por usar nuestra app, hasta luego");
                        break;
                    default:

                        JOptionPane.showMessageDialog(null, "El valor ingresado no es una opcion de menu",
                                "Error", JOptionPane.WARNING_MESSAGE);
                        break;
                }

            } catch (InputMismatchException | NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "El valor no es numerico",
                        "Error", JOptionPane.ERROR_MESSAGE);

            }
        }
    }
}

