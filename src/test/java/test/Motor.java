package test;
public class Motor {
    public int numeroCilindros;
    public String tipo;
    public int registro;
    
    public void cambiarRegistro(int registro){
        this.registro = registro;
    }

    public void asignarTipo(String tipo){
        if (tipo.equalsIgnoreCase("gasolina") || tipo.equalsIgnoreCase("electrico")){
            this.tipo = tipo;
        }
    }
}