package tema6.POO3.ej5;

public class PublicacionVideo implements IPublicacion, IAbrirPublicacion {
    private String video;

    private final String VIDEO_DEFAULT = "1234.mp4";

    public PublicacionVideo () {
        this.video = VIDEO_DEFAULT;
    }

    public PublicacionVideo (String video) {
        this.video = video;
    }

    @Override
    public void publicar() {
        System.out.println(video);
    }

    @Override
    public void compartir() {
        System.out.println("Has compartido este video: " + video);
    }

    @Override
    public void abrirContenido() {
        System.out.println("Video abierto correctamente.");
    }

    public String getVideo() {
        return video;
    }

    public void setVideo(String video) {
        this.video = video;
    }
}
