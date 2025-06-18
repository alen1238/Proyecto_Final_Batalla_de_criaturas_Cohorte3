public class ComportamientoReflectivoeACQN implements EstrategiaBatalla {
    boolean campoReflector = false;
    int turno = 0;

    @Override
    public void actuar(Criatura criatura, Criatura enemigo){
        turno ++;
        if(turno == 3){
            campoReflector = true;
            turno = 0;
            System.out.println(criatura.getNombre()+ "ha usado su escudo reflector, devolviendo los "+ enemigo.getAtaque()+ " puntos de daño a " + enemigo.getNombre());
        }else{
            int daño = criatura.getAtaque() + (int)(Math.random()*5);
        }
    }
}
