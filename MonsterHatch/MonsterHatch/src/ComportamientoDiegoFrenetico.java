public class ComportamientoDiegoFrenetico implements EstrategiaBatalla{
    
    @Override
    public void actuar(Criatura criatura, Criatura enemigo){

        // El ataque frenetico se calcula segun la energia de la criatura

        do {

            int puntosAtaque = (int)(criatura.getEnergia() * 0.2);
            // System.out.println((int)(criatura.getEnergia() * 0.2));
            enemigo.reducirVida(puntosAtaque);
            System.out.println(criatura.getNombre() + " ataca frenéticamente a " + enemigo.getNombre());
            criatura.reducirEnergia(25);

            //Por el ataque se baja la defensa
            int defensaMenos = 5 + (int)(Math.random()*5);
            enemigo.reducirDefensa(defensaMenos);
            System.out.println("Debido a los ataques freneticos la defensa de " + enemigo.getNombre() + " ahora es " + enemigo.getDefensa());
            System.out.println("La energia de " + criatura.getNombre() + " es " + criatura.getEnergia());

        } while (criatura.getEnergia() > 50);   
    }
}