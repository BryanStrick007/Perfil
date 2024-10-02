
package dominio;


public class Perfil {
    private String nombre; 
    private String carrera;
    private String foto;
    private String lenguajes; 
    private String base;
    private String proyectos ;
    private String promedio;
    
    public Perfil(String nombre, String carrera, String foto, String lenguajes, String base, String proyectos, String promedio) {
        this.nombre = nombre;
        this.carrera = carrera;
        this.foto = foto;
        this.lenguajes = lenguajes;
        this.base = base;
        this.proyectos = proyectos;
        this.promedio = promedio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public String getLenguajes() {
        return lenguajes;
    }

    public void setLenguajes(String lenguajes) {
        this.lenguajes = lenguajes;
    }

    public String getBase() {
        return base;
    }

    public void setBase(String base) {
        this.base = base;
    }

    public String getProyectos() {
        return proyectos;
    }

    public void setProyectos(String proyectos) {
        this.proyectos = proyectos;
    }

    public String getPromedio() {
        return promedio;
    }

    public void setPromedio(String promedio) {
        this.promedio = promedio;
    }
    
    
}


