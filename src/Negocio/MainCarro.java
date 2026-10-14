package Negocio;

public class MainCarro {
    static void main(){
        System.out.println("El numero de objetos de tipo Carro creados son: " +Carro.getNumCarros());
        System.out.println("El IVA de los vehiculos es: "+Carro.getIva());
        Carro c1 = new Carro(2,60);
        Carro c2 = new Carro(-5,-100);
        Carro c3 = new Carro();
        System.out.println("El numero de objetos de tipo Carro creados son:" +Carro.getNumCarros());
        System.out.println("El precio de venta al publico del carro 1 es:"+c1.calcularPrecioTotal(21599));

        /*
        c1.potencia =2;
        c1.velocidad = 60;
        c2.potencia = 5;
        c2.velocidad = 100;
        c3.potencia = 2;
        c3.velocidad = 50;

        c1.setPotencia(2);
        c1.setVelocidad(60);
        c2.setPotencia(-5);
        c2.setVelocidad(-100);
        c3.setPotencia(2);
        c3.setVelocidad(50); */

        /*System.out.println("La velocidad del carro es " +c1.velocidad+ " y la potencia es"
         +c1.velocidad); */

        System.out.println("La velocidad del carro 1 es "+c1.getVelocidad()+ " y la potencia es " +c1.getPotencia());
        System.out.println("La velocidad del carro 2 es "+c2.getVelocidad()+ " y la potencia es " +c2.getPotencia());
        System.out.println("La velocidad del carro 3 es "+c3.getVelocidad()+ " y la potencia es " +c2.getPotencia());
        c1.acelerar();
        c1.frenar();
    }


}
