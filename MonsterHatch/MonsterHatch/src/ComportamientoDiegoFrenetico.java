public class ComportamientoDiegoFrenetico implements EstrategiaBatalla{
    
    @Override
    public void actuar(Criatura criatura, Criatura enemigo){

        // El ataque frenetico se calcula segun la energia de la criatura

        do {

            int puntosAtaques = (int)(criatura.getEnergia() * 0.15);
            System.out.println(criatura.getNombre() + " ataca frenéticamente a " + enemigo.getNombre());
            criatura.reducirEnergia(criatura.getEnergia() - (int)(criatura.getEnergia() * 0.30));
            enemigo.reducirVida(puntosAtaques);

            //Por el ataque se baja la defensa
            int defensaMenos = 5 + (int)(Math.random()*5);
            enemigo.reducirDefensa(defensaMenos);
            System.out.println("Debido a los ataques freneticos la defensa de " + enemigo.getNombre() + " ahora es " + enemigo.getDefensa());
            System.out.println("La energia de " + criatura.getNombre() + " es " + criatura.getEnergia());

        } while (criatura.getEnergia() > 50);   
    }
}