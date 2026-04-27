package tema8;

import javax.xml.transform.Result;
import java.sql.*;

public class RepasoSQL {
    public static void main(String[] args) {
        String endpoint = "ad-postgres.czvemab3mwkb.us-east-1.rds.amazonaws.com";
        String puerto = "5432";
        String bd = "hogwarts";
        String usuario = "postgres";
        String password = "12345678";

        String url = "jdbc:postgresql://" + endpoint + ":" + puerto + "/" + bd;

        String sentenciaSQL ="SELECT nombre, apellido FROM Profesor";
        String sentenciaSQL2 ="SELECT nombre, apellido FROM Estudiante where fecha_nacimiento > '1980-01-01'";
        String sentenciaSQL3 ="SELECT nombre, apellido FROM Estudiante order by fecha_nacimiento ASC";
        String sentenciaSQL4 ="SELECT Casa.nombre_casa, COUNT(id_estudiante) AS contador FROM Estudiante inner join Casa on Casa.id_casa = Estudiante.id_casa GROUP BY Casa.nombre_casa";
        String sentenciaSQL5 ="SELECT AVG(calificacion) as nota_media, max(calificacion) as nota_maxima from Estudiante_Asignatura inner join Asignatura on Estudiante_Asignatura.id_asignatura = Asignatura.id_asignatura where Asignatura.nombre_asignatura = 'Pociones'";
        String sentenciaSQL6 ="SELECT DISTINCT anyo_curso FROM Estudiante";
        String sentenciaSQL7 ="SELECT nombre from Estudiante where apellido like 'P%'";
        String sentenciaSQL8 ="SELECT nombre, apellido from Estudiante where anyo_curso in (4, 5)";
        String sentenciaSQL9 ="SELECT nombre, apellido from Estudiante inner join Casa on Casa.id_casa = Estudiante.id_casa where Estudiante.anyo_curso = 5 AND (Casa.nombre_casa = 'Gryffindor' OR Casa.nombre_casa = 'Slytherin')";
        String sentenciaSQL10="SELECT nombre, apellido from Estudiante order by fecha_nacimiento ASC Limit 5";
        String sentenciaSQL11="SELECT Estudiante.nombre FROM Estudiante JOIN Estudiante_Asignatura ON Estudiante.id_estudiante = Estudiante_Asignatura.id_estudiante JOIN Asignatura ON Estudiante_Asignatura.id_asignatura = Asignatura.id_asignatura WHERE Asignatura.nombre_asignatura = 'Vuelo' AND Estudiante_Asignatura.calificacion >= 8;";
        String sentenciaSQL12="INSERT INTO Estudiante (nombre, apellido, id_casa, anyo_curso, fecha_nacimiento) values ('Nymphadora', 'Tonks', 4, 7, '1973-11-25')";
        String sentenciaSQL13="UPDATE Casa SET id_jefe = (SELECT id_profesor FROM Profesor where nombre = 'Pomona' AND apellido = 'Sprout') WHERE nombre_casa = 'Hufflepuff'";
        String sentenciaSQL14="DELETE FROM Estudiante where nombre = 'Tom' AND apellido = 'Riddle'";
        String sentenciaSQL15="SELECT Estudiante.nombre, Estudiante.apellido, Casa.nombre_casa FROM Estudiante inner join Casa ON Casa.id_casa = Estudiante.id_casa";
        String sentenciaSQL16="SELECT Estudiante.nombre, Mascota.nombre_mascota, Asignatura.nombre_asignatura FROM Estudiante left join Mascota on Mascota.id_estudiante = Estudiante.id_estudiante inner join Estudiante_Asignatura on Estudiante_Asignatura.id_estudiante = Estudiante.id_estudiante inner join Asignatura on Estudiante_Asignatura.id_asignatura = Asignatura.id_asignatura";
        String sentenciaSQL17="SELECT Estudiante.nombre FROM Estudiante JOIN Estudiante_Asignatura ON Estudiante.id_estudiante = Estudiante_Asignatura.id_estudiante JOIN Asignatura ON Estudiante_Asignatura.id_asignatura = Asignatura.id_asignatura WHERE Asignatura.nombre_asignatura = 'Encantamientos' AND Estudiante_Asignatura.calificacion > (SELECT AVG(Estudiante_Asignatura.calificacion) FROM Estudiante_Asignatura JOIN Asignatura ON Estudiante_Asignatura.id_asignatura = Asignatura.id_asignatura WHERE Asignatura.nombre_asignatura = 'Encantamientos')";
        String sentenciaSQL18="SELECT Casa.nombre_casa FROM Casa JOIN Estudiante ON Casa.id_casa = Estudiante.id_casa JOIN Estudiante_Asignatura ON Estudiante.id_estudiante = Estudiante_Asignatura.id_estudiante GROUP BY Casa.nombre_casa HAVING AVG(Estudiante_Asignatura.calificacion) > 7";
        try (Connection con1 = DriverManager.getConnection(url, usuario, password)) {
            System.out.println("Conectado a Hogwarts en AWS");
            // 1
            PreparedStatement sentencia = con1.prepareStatement(sentenciaSQL); {
                ResultSet resultados = sentencia.executeQuery();
                System.out.println("\n 1.");
                while (resultados.next()) {
                    String nombre = resultados.getString("nombre");
                    String apellido = resultados.getString("apellido");
                    System.out.println("Profesores: " + nombre + ", " + apellido);
                }
            }

            // 2
            PreparedStatement sentencia2 = con1.prepareStatement(sentenciaSQL2); {
                ResultSet resultados2 = sentencia2.executeQuery();
                System.out.println("\n 2.");
                while (resultados2.next()) {
                    String nombre = resultados2.getString("nombre");
                    String apellido = resultados2.getString("apellido");
                    System.out.println("Alumnos nacidos después del 01-01-1980: " + nombre + ", " + apellido);
                }
            }

            // 3
            PreparedStatement sentencia3 = con1.prepareStatement(sentenciaSQL3); {
                ResultSet resultados3 = sentencia3.executeQuery();
                System.out.println("\n 3.");
                while (resultados3.next()) {
                    String nombre = resultados3.getString("nombre");
                    String apellido = resultados3.getString("apellido");
                    System.out.println("Alumnos nacidos ordenados de forma ascendente: " + nombre + ", " + apellido);
                }
            }

            // 4
            PreparedStatement sentencia4 = con1.prepareStatement(sentenciaSQL4); {
                ResultSet resultados4 = sentencia4.executeQuery();
                System.out.println("\n 4.");
                while (resultados4.next()) {
                    int contador = resultados4.getInt("contador");
                    String nombreCasa = resultados4.getString("nombre_casa");
                    System.out.println("Hay " + contador + " en la casa " + nombreCasa);
                }
            }

            // 5
            PreparedStatement sentencia5 = con1.prepareStatement(sentenciaSQL5); {
                ResultSet resultados5 = sentencia5.executeQuery();
                System.out.println("\n 5.");
                while (resultados5.next()) {
                    double notaMaxima = resultados5.getDouble("nota_maxima");
                    double notaMedia = resultados5.getDouble("nota_media");
                    System.out.println("La nota máxima de la asginatura Pociones es: " + notaMaxima + ", mientras que la nota media es: " + notaMedia);
                }
            }

            // 6
            PreparedStatement sentencia6 = con1.prepareStatement(sentenciaSQL6); {
                ResultSet resultados6 = sentencia6.executeQuery();
                System.out.println("\n 6.");
                while (resultados6.next()) {
                    int anyo_curso = resultados6.getInt("anyo_curso");
                    System.out.println("Los años de curso sin duplicados son: " + anyo_curso);
                }
            }

            // 7
            PreparedStatement sentencia7 = con1.prepareStatement(sentenciaSQL7); {
                ResultSet resultados7 = sentencia7.executeQuery();
                System.out.println("\n 7.");
                while (resultados7.next()) {
                    String nombreEmpiezaPorP = resultados7.getString("nombre");
                    System.out.println("Los nombres que empiezan por P son: " + nombreEmpiezaPorP);
                }
            }

            // 8
            PreparedStatement sentencia8 = con1.prepareStatement(sentenciaSQL8); {
                ResultSet resultados8 = sentencia8.executeQuery();
                System.out.println("\n 8.");
                while (resultados8.next()) {
                    String nombre = resultados8.getString("nombre");
                    String apellido = resultados8.getString("apellido");
                    System.out.println("Los nombres y apellidos de los alumnos que van por el 4to o 5to año son: " + nombre + " " + apellido);
                }
            }

            // 9
            PreparedStatement sentencia9 = con1.prepareStatement(sentenciaSQL9); {
                ResultSet resultados9 = sentencia9.executeQuery();
                System.out.println("\n 9.");
                while (resultados9.next()) {
                    String nombre = resultados9.getString("nombre");
                    String apellido = resultados9.getString("apellido");
                    System.out.println("Los nombres y apellidos de los alumnos que van por el 5to año y que estan en la casa Gryffindor o Slytherin son : " + nombre + " " + apellido);
                }
            }

            // 10
            PreparedStatement sentencia10 = con1.prepareStatement(sentenciaSQL10); {
                ResultSet resultados10 = sentencia10.executeQuery();
                System.out.println("\n 10.");
                while (resultados10.next()) {
                    String nombre = resultados10.getString("nombre");
                    String apellido = resultados10.getString("apellido");
                    System.out.println("Los nombres y apellidos de los alumnos que van por el 5to año y que estan en la casa Gryffindor o Slytherin son : " + nombre + " " + apellido);
                }
            }

            // 11
            PreparedStatement sentencia11 = con1.prepareStatement(sentenciaSQL11); {
                ResultSet resultados11 = sentencia11.executeQuery();
                System.out.println("\n 11.");
                while (resultados11.next()) {
                    String nombre = resultados11.getString("nombre");
                    System.out.println("Los nombres y apellidos de los alumnos que van por el 5to año y que estan en la casa Gryffindor o Slytherin son : " + nombre);
                }
            }

            // 12
            try {
                System.out.println("\n 12");
                PreparedStatement sentencia12 = con1.prepareStatement(sentenciaSQL12);
                    int resultados12 = sentencia12.executeUpdate();

                if (resultados12 > 0) {
                    System.out.println("Estudiante insertado: Nymphadora Tonks");
                }
            } catch (SQLException ex) {
                if (ex.getSQLState().equals("23505")) {
                    System.out.println("La persona ya esta en la base de datos");
                } else {
                    System.err.println("Error en insert: " + ex.getMessage());
                }
            }


            // 13
            PreparedStatement sentencia13 = con1.prepareStatement(sentenciaSQL13); {
                int resultados13 = sentencia13.executeUpdate();
                System.out.println("\n 13.");
                System.out.println("Nombre del jefe actualizado: Pomona Sprout");
            }

            // 14
            PreparedStatement sentencia14 = con1.prepareStatement(sentenciaSQL14); {
                int resultados14 = sentencia14.executeUpdate();
                System.out.println("\n 14.");
                System.out.println("Se ha eliminado a Tom Riddle");
            }

            // 15
            PreparedStatement sentencia15 = con1.prepareStatement(sentenciaSQL15);
            ResultSet resultados15 = sentencia15.executeQuery();
            System.out.println("\n 15.");
            while (resultados15.next()) {
                String nombre = resultados15.getString("nombre");
                String apellido = resultados15.getString("apellido");
                String nombreCasa = resultados15.getString("nombre_casa");
                System.out.println("El nombre es: " + nombre + ", apellido: " + apellido + ", está en la casa: " + nombreCasa);
            }

            // 16
            PreparedStatement sentencia16 = con1.prepareStatement(sentenciaSQL16);
            ResultSet resultados16 = sentencia16.executeQuery();
            System.out.println("\n 16.");
            while (resultados16.next()) {
                String nombre = resultados16.getString("nombre");
                String nombreMascota = resultados16.getString("nombre_mascota");
                String nombreAsignatura = resultados16.getString("nombre_asignatura");
                System.out.println("El nombre es: " + nombre + ", Mascota: " + nombreMascota + ", Asignatura: " + nombreAsignatura);
            }

            // 17
            PreparedStatement sentencia17 = con1.prepareStatement(sentenciaSQL17);
            ResultSet resultados17 = sentencia17.executeQuery();
            System.out.println("\n 17.");
            while (resultados17.next()) {
                String nombre = resultados17.getString("nombre");
                System.out.println("Los nombres de los estudiantes que tienen más nota que el promedio en la asginatura Encantamientos son: " + nombre);
            }

            // 18
            PreparedStatement sentencia18 = con1.prepareStatement(sentenciaSQL18);
            ResultSet resultados18 = sentencia18.executeQuery();
            System.out.println("\n 18.");
            while (resultados18.next()) {
                String nombreCasa = resultados18.getString("nombre_casa");
                System.out.println("Casa: " + nombreCasa);
            }
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }
}

