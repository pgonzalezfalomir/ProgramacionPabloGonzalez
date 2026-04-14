package tema7.EjercicioFunko;

import java.io.*;
import java.util.*;

public class GestionFunkos {
    private List<Funko> lista;

    public GestionFunkos() {
        this.lista = new ArrayList<>();
    }

    public List<Funko> getLista() {
        return lista;
    }

    public void setLista(List<Funko> lista) {
        this.lista = lista;
    }

    public void anadir(Funko funko1) {
        lista.add(funko1);
    }

    public boolean borrar(String nombre) {
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).getNombre().equalsIgnoreCase(nombre)) {
                lista.remove(i);
                return true;
            }
        }
        return false;
    }

    public Funko obtenerMasCaro() {
        if (lista.isEmpty()) {
            return null;
        }
        Funko caro = lista.get(0);
        for (Funko funko1 : lista) {
            if (funko1.getPrecio() > caro.getPrecio()) {
                caro = funko1;
            }
        }
        return caro;
    }

    public double obtenerMediaPrecio() {
        if (lista.isEmpty()) {
            return 0;
        }
        double suma = 0;
        for (Funko funko1 : lista) {
            suma = suma + funko1.getPrecio();
        }
        return suma / lista.size();
    }

    public Map<String, List<Funko>> agruparPorModelos() {
        Map<String, List<Funko>> mapa = new HashMap<>();
        for (Funko funko1 : lista) {
            String modelo = funko1.getModelo();
            if (!mapa.containsKey(modelo)) {
                mapa.put(modelo, new ArrayList<>());
            }
            mapa.get(modelo).add(funko1);
        }
        return mapa;
    }

    public List<Funko> obtenerFunkos2023() {
        List<Funko> filtrados = new ArrayList<>();
        for (Funko funko1 : lista) {
            if (funko1.getFechaLanzamiento().contains("2023")) {
                filtrados.add(funko1);
            }
        }
        return filtrados;
    }

    public void cargarDatos() {
        File f = new File("C:\\Users\\pablo\\Downloads\\funkos.csv");

        if (!f.exists()) {
            System.err.println("El archivo no existe en: " + f.getAbsolutePath());
            System.err.println("El programa se cerrará porque no hay datos para trabajar.");
            System.exit(0);
        }

        try (BufferedReader br = new BufferedReader(new FileReader(f))) {
            String linea;
            br.readLine();
            while ((linea = br.readLine()) != null) {
                if (linea.trim().isEmpty()) continue;

                String[] d = linea.split(",");
                if (d.length >= 5) {
                    lista.add(new Funko(d[0].trim(), d[1].trim(), d[2].trim(),
                            Double.parseDouble(d[3].trim()), d[4].trim()));
                }
            }
        } catch (IOException | NumberFormatException ex) {
            System.err.println("Error al leer el archivo: " + ex.getMessage());
            System.exit(0);
        }


        try (BufferedReader br = new BufferedReader(new FileReader(f))) {
            br.readLine();
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] d = linea.split(",");
                Funko funko = new Funko(d[0], d[1], d[2], Double.parseDouble(d[3]), d[4]);
                lista.add(funko);
            }
        } catch (IOException ex) {
            System.err.println("Error al leer el CSV: " + ex.getMessage());
        }
    }

    public void guardarDatos() {
        // guardar los datos en un archivo csv
        try (PrintWriter pw = new PrintWriter(new FileWriter("funkos.csv"))) {
            pw.println("CODIGO,NOMBRE,MODELO,PRECIO,FECHA_LANZAMIENTO");
            for (Funko funko1 : lista) {
                pw.println(funko1.getCodigo() + "," + funko1.getNombre() + "," + funko1.getModelo() + "," + funko1.getPrecio() + "," + funko1.getFechaLanzamiento());
            }
        } catch (IOException ex) {
            System.err.println("Error al guardar CSV: " + ex.getMessage());
        }

        // guardar los datos en un archivo binario
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("funkos.dat"))) {
            oos.writeObject(lista);
        } catch (IOException ex) {
            System.err.println("Error al serializar datos: " + ex.getMessage());
        }
    }
}