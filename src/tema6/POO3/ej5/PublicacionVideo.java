package tema6.POO3.ej5;

import tema6.POO3.ej6.IPublicacionConReaccion;

public class PublicacionVideo implements IPublicacion, IAbrirPublicacion, IPublicacionConReaccion {
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
        System.out.println("Has publicado: " + video);
    }

    @Override
    public void compartir() {
        System.out.println("Has compartido este vídeo: " + video);
    }

    @Override
    public void abrirContenido() {
        System.out.println("Vídeo abierto correctamente.");
    }

    @Override
    public void comentar() {
        System.out.println("Has comentado en este vídeo: " + video);
    }

    public String getVideo() {
        return video;
    }

    public void setVideo(String video) {
        this.video = video;
    }
}
