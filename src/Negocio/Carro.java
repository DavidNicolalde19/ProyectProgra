package Negocio;

public class Carro {
    int potencia;
    double velocidad;


    void acelerar(){
        velocidad+= potencia;
    }

    void frenar(){
        velocidad/= 2;
    }
}
