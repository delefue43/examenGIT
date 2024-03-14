package evf.javadoc.original;

public class Artista {
    String nombreArtista;
    String apellidoArtista;

    public Artista(String nombreArtista) {
        this.nombreArtista = nombreArtista;
    }

    @Override
    public String toString() {
        return "Artista{" +
                "nombreArtista='" + nombreArtista + '\'' +
                '}';
    }

    public String getNombreArtista() {
        return nombreArtista;
	//Esto es un comentario
    }

    public String getApellidoArtista() {
	return apellidoArtista;
	//Domingo Miguel Elena Fuentes
    } 
}


