package tema6.POO3.ej5;

public class PublicacionFoto implements IPublicacion, IAbrirPublicacion{
    private String foto;

    private final String FOTO_DEFAULT = "1234.jpg";

    public PublicacionFoto () {
        this.foto = FOTO_DEFAULT;
    }

    public PublicacionFoto (String foto) {
        this.foto = foto;
    }

    @Override
    public void publicar() {
        System.out.println("Has publicado: " + foto);
    }

    @Override
    public void compartir() {
        System.out.println("Has compartido esta foto: " + foto);
    }

    @Override
    public void abrirContenido() {
        System.out.println("Foto abierta correctamente.");
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }
}
