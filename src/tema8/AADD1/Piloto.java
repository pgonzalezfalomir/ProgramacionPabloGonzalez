package tema8.AADD1;

public class Piloto {
    // inicialización variables
    private int driverid;
    private String code;
    private String forename;
    private String surname;
    private String dob;
    private String nationality;
    private String url;

    // variables default
    private final int DRIVER_ID_DEFAULT = 2;
    private final String CODE_DEFAULT = "PGS";
    private final String FORENAME_DEFAULT = "Pablo";
    private final String SURNAME_DEFAULT = "Gonzalez";
    private final String DOB_DEFAULT = "2006-12-05";
    private final String NATIONALITY_DEFAULT = "Spanish";
    private final String URL_DEFAULT = "http://en.wikipedia.org/wiki/Pablo_Gonzalez";

    // constructores
    public Piloto (int driverID, String code, String forename, String surname, String dob, String nationality, String url) {
        this.driverid = driverID;
        this.code = code;
        this.forename = forename;
        this.surname = surname;
        this.dob = dob;
        this.nationality = nationality;
        this.url = url;
    }

    public Piloto () {
        this.driverid = DRIVER_ID_DEFAULT;
        this.code = CODE_DEFAULT;
        this.forename = FORENAME_DEFAULT;
        this.surname = SURNAME_DEFAULT;
        this.dob = DOB_DEFAULT;
        this.nationality = NATIONALITY_DEFAULT;
        this.url = URL_DEFAULT;
    }

    // toString
    @Override
    public String toString() {
        return "ID Piloto: " + driverid + ", Code: " + code + ", Forename: " + forename + ", Surname: " + surname + ", Date of birth: " + dob + ", Nationality: " + nationality + ", URL: " + url;
    }

    // getters y setters
    public int getDriverID() {
        return driverid;
    }

    public void setDriverID(int driverID) {
        this.driverid = driverID;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getForename() {
        return forename;
    }

    public void setForename(String forename) {
        this.forename = forename;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
