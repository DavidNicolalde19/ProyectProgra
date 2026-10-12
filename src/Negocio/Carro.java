package Negocio;

public class Carro {
     private int potencia;
     private double velocidad;

    public void setPotencia(int potencia){
        //almacenar solo si el dato es correcto
        if (potencia>0) {
        this.potencia= potencia;}
    }

    public void setVelocidad( double velocidad){
        //actualozarr si el dato es correcto sino setear el valor
        if (velocidad<0)
            velocidad=0;
        this.velocidad= velocidad;
    }
    /* sacar informacion
    get()
    siempre retornan valor
    el tipo de retorno generalmente es del mismo tipo del atributo */

    public int getPotencia(){
        return potencia;
    }

    public double getVelocidad(){
        return  velocidad;
    }
    void acelerar(){
        velocidad+= potencia;
    }
    void frenar(){
        velocidad/= 2;
    }
}
