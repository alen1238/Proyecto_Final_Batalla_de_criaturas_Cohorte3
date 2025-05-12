public class ComportamientoDiegoFrenetico implements EstrategiaBatalla{
    
    @Override
    public void actuar(Criatura criatura, Criatura enemigo){

        //El comportamiento frenético consiste en atacar de forma aleatoria y activar la esquiva
        int ataque = criatura.getAtaque() + (int)(Math.random()*15);
        System.out.println(criatura.getNombre() + " ataca frenéticamente a " + enemigo.getNombre());
        enemigo.reducirVida(ataque);

        //Segundo ataque frenetico
        ataque = criatura.getAtaque() + (int)(Math.random()*10);
        System.out.println(criatura.getNombre() + " ataca de nuevo, frenéticamente a enemigo " + enemigo.getNombre());
        enemigo.reducirVida(ataque);

        //Por el ataque se baja la defensa
        int defensaMenos = 5 + (int)(Math.random()*5);
        enemigo.reducirDefensa(defensaMenos);
        System.out.println("Debido a los ataques freneticos la defensa de " + enemigo.getNombre() + " ahora es " + enemigo.getDefensa());
    }
}