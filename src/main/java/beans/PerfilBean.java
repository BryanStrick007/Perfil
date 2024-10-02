package beans;

import dominio.Perfil;
import jakarta.faces.bean.ManagedBean;

@ManagedBean
public class PerfilBean {
    private Perfil perfil;

    // Constructor
    public PerfilBean() {
        perfil = new Perfil("Bryan Moises Cervantes Barrera", 
                                          "Ingenieria en TIC´s",
                                          "Perfil_img.jpeg",
                                          "c#, java, html",
                                          "Mysql",
                                          "Ninguno",
                                          "9.0");
    }

    public Perfil getPerfil() {
        return perfil;
    }

    public void setPerfil(Perfil perfil) {
        this.perfil = perfil;
    }

    

    
}
