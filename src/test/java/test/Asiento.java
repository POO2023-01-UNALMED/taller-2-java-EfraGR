package test;
public class Asiento {
    public String color;
    public int precio;
    public int registro;

    public void cambiarColor(String color){
        String[] allowColor = {"rojo","verde","amarillo","negro","blanco"}; 

        for (int i=0;i<allowColor.length;i++){
            if (color.equalsIgnoreCase(allowColor[i])){
                this.color = color;
            }
        }
    } 
}
