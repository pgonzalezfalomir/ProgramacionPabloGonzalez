package tema4;

public class Reloj { // Inicialización variables
    int hora;
    int minutos;
    int segundos;
    boolean formato24;
    boolean AMPM;

    public Reloj() { // Constructor vacío
        this.hora = 0;
        this.minutos = 0;
        this.segundos = 0;
        this.formato24 = true;
    }

    public Reloj(boolean formato24, int hora, int minutos, int segundos) { // Constructor con parámetros
        this.formato24 = formato24;
        this.hora = hora;
        this.minutos = minutos;
        this.segundos = segundos;
    }

    public void horaFinal() {
        if (formato24) {
            System.out.println("Son las " + hora + ":" + minutos + ":" + segundos);
        } else {
            if (AMPM) {
                System.out.println("Son las " + hora + ":" + minutos + ":" + segundos + " AM");
            } else {
                System.out.println("Son las " + hora + ":" + minutos + ":" + segundos + " PM");
            }
        }
    }

    public int getHora() { // Getter Hora
        return hora;
    }

    public int getMinutos() { // Getter Minutos
        return minutos;
    }

    public int getSegundos() { // Getter Segundos
        return segundos;
    }

    public boolean isFormato24() { // Getter Formato
        return formato24;
    }

    public boolean isAMPM() { // Getter AMPM
        return AMPM;
    }

    public void setHora(int hora) { // Setter Hora
        if (formato24) {
            if (hora >= 0 && hora <= 24) {
                this.hora = hora;
            } else {
                this.hora = 0;
            }
        } else {
            if (hora >= 12 && hora <= 24) {
                this.hora = hora - 12;
                this.AMPM = false;
            } else {
                this.hora = hora;
                this.AMPM = true;
            }
        }
    }

    public void setMinutos(int minutos) { // Setter Minutos
        if (minutos >= 0 && minutos <= 60) {
            this.minutos = minutos;
        } else  {
            this.minutos = 0;
        }
    }

    public void setSegundos(int segundos) { // Setter Segundos
        if (segundos >= 0 && segundos <= 60) {
            this.segundos = segundos;
        } else {
            this.segundos = 0;
        }
    }

    public void setFormato24(boolean formato24) { // Setter Formato
        if (!formato24) {
            if (hora >= 12) {
                this.hora = hora - 12;
            }
        }
    }

    public void setAMPM (boolean AMPM) { // Setter AMPM
        if (this.hora < 12) {
            this.AMPM = true;
        } else {
            this.AMPM = false;
        }
    }

    public String toString() {
        if (formato24) {
            return "Son las " + hora + ":" + minutos + ":" + segundos;
        } else {
            if (AMPM) {
                return "Son las " + hora + ":" + minutos + ":" + segundos + " AM";
            } else {
                return "Son las " + hora + ":" + minutos + ":" + segundos + " PM";
            }
        }
    }
}
