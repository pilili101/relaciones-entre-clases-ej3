/*
Realizar una baraja de cartas españolas orientada a objetos. Una carta tiene un número entre 1
y 12 (el 8 y el 9 no los incluimos) y un palo (espadas, bastos, oros y copas). Esta clase debe
contener un método toString() que retorne el número de carta y el palo. La baraja estará
compuesta por un conjunto de cartas, 40 exactamente.
Las operaciones que podrá realizar la baraja son:
• barajar(): cambia de posición todas las cartas aleatoriamente.
• siguienteCarta(): devuelve la siguiente carta que está en la baraja, cuando no haya más o
se haya llegado al final, se indica al usuario que no hay más cartas.
• cartasDisponibles(): indica el número de cartas que aún se puede repartir.
• darCartas(): dado un número de cartas que nos pidan, le devolveremos ese número de
cartas. En caso de que haya menos cartas que las pedidas, no devolveremos nada, pero
debemos indicárselo al usuario.
• cartasMonton(): mostramos aquellas cartas que ya han salido, si no ha salido ninguna
indicárselo al usuario
• mostrarBaraja(): muestra todas las cartas hasta el final. Es decir, si se saca una carta y
luego se llama al método, este no mostrara esa primera carta.
 */
package BarajaService;

import Entidad.Baraja;
import Entidad.Carta;
import Enums.Palo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class BarajaService {
    
    private Baraja mazoInicial = new Baraja();
    private Baraja cartasEntregadas = new Baraja();
    private Scanner scn = new Scanner (System.in);
    private Collections c;
    
    public Baraja crearBaraja(){
        System.out.println("SE BARAJA");
        
        ArrayList <Carta> mazoInic = new ArrayList();
        ArrayList <Carta> cartasEntrgad = new ArrayList();
        
        cartasEntregadas.setCartas(cartasEntrgad);
       
        for(Palo aux: Palo.values()){
            for (int i = 0; i < 12; i++) {
                if(i+1==8||i+1==9){
                    
                }else{
                    Carta carta = new Carta(i+1,aux);
                    //System.out.println("carta "+carta.toString()+" añadida");
                    mazoInic.add(carta);
                }
            }
        }
        mazoInicial.setCartas(mazoInic);
        //System.out.println(mazoInicial.toString());
        return mazoInicial;
    }
    
    
    
    
    
}
