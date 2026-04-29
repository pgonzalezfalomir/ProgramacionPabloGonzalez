package tema8;

public class Asignatura {
    private int idAsignatura;
    private String nombreAsignatura;
    private String aula;
    private boolean obligatoria;

    private final int ID_ASIGNATURA_DEFAULT = 1;
    private final String NOMBRE_ASIGNATURA_DEFAULT = "Herbologia";
    private final String AULA_DEFAULT = "Invernadero";
    private final boolean OBLIGATORIA_DEFAULT = true;

    public Asignatura (int idAsignatura, String nombreAsignatura, String aula, boolean obligatoria) {
        this.idAsignatura = idAsignatura;
        this.nombreAsignatura = nombreAsignatura;
        this.aula = aula;
        this.obligatoria = obligatoria;
    }

    public Asignatura () {
        this.idAsignatura = ID_ASIGNATURA_DEFAULT;
        this.nombreAsignatura = NOMBRE_ASIGNATURA_DEFAULT;
        this.aula = AULA_DEFAULT;
        this.obligatoria = OBLIGATORIA_DEFAULT;
    }

    @Override
    public String toString() {
        return "Asignatura: " + nombreAsignatura + ", idAsignatura: " + idAsignatura + ", Aula: " + aula + ", Obligatoria: " + obligatoria;
    }

    public int getIdAsignatura() {
        return idAsignatura;
    }

    public void setIdAsignatura(int idAsignatura) {
        this.idAsignatura = idAsignatura;
    }

    public String getNombreAsignatura() {
        return nombreAsignatura;
    }

    public void setNombreAsignatura(String nombreAsignatura) {
        this.nombreAsignatura = nombreAsignatura;
    }

    public String getAula() {
        return aula;
    }

    public void setAula(String aula) {
        this.aula = aula;
    }

    public boolean isObligatoria() {
        return obligatoria;
    }

    public void setObligatoria(boolean obligatoria) {
        this.obligatoria = obligatoria;
    }
}
