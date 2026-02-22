package tema6.POO3.ej5;

public class PublicacionTexto implements IPublicacion {
    private String texto;

    private final String TEXTO_DEFAULT = "Hola";

    public PublicacionTexto () {
        this.texto = TEXTO_DEFAULT;
    }

    public PublicacionTexto (String texto) {
        this.texto = texto;
    }

    @Override
    public void publicar() {
        System.out.println(texto);
    }

    @Override
    public void compartir() {
        System.out.println("Has compartido este texto: " + texto);
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }
}
