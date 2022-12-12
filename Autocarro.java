import java.util.Vector;
public class Autocarro{
    /*
     * metodo che identifica la tipologia di autocarro compatibile con la tipologia di merce;
     * metodo che calcola il numero di autocarri compatibili necessari per trasportare una determinata quantità di merce;
     */

    /*
     * Penso agli oggetti autocarro come oggetti contenenti 2 caratteristiche:
     * -tipologiaMerce: indica che tipologia di merce possono trasportare
     * -portataMerce: indica la quantità di merce che possono trasportare
     */
    public String tipologia;
    public double portata;
    private Vector<Autocarro> listaAutocarri; //lista completa delle tipologie di autocarri disponibili
    private vector<Autocarro> listaAutocarriAdeguati;

    public void Autocarro(String tipologiaMerce, double portataMerce){
        tipologia = tipologiaMerce;
        portata = portataMerce;
     }

     public Autocarro tipologiaAutocarro(String tipologiaMerce, double portataMerce){

      //ricerco nel database le tipologie di autocarri adeguati al viaggio e li inserisco in una lista
      for(int i = 0; i < listaAutocarri.size(); i = i+1){
         if( listaAutocarri.get(i).tipologia == tipologiaMerce){
            listaAutocarriAdeguati.add(listaAutocarri.get(i));
         }
      }
      //se la lista contiene una sola tipologia allora ritorno quella
      if(listaAutocarriAdeguati.size() == 1){
         return listaAutocarriAdeguati.lastElement();
      }

      /*
       * se no calcolo qual è la tipologia che ha una capienza più simile 
       * alla quantità di merce da trasportare cosi da utilizzare meno autocarri 
       */

      double minorDifferenza = abs(portataMerce - listaAutocarriAdeguati.get(0).portata); //inizializzo la minor differenza di portata utilizzando la prima tipologia
      int indice = 0; //inizializzo l'indice a zero in quanto ho calcolato la minor differenza di portata utilizzando il primo elemento
                      //poi utilizzerò questo indice per ritornare la tipologia di autocarri con la portata più adeguata
      double differenza; //variabile per salvare la differenza calcolata ad ogni ciclo del for
      for(int i = 1; i < listaAutocarriAdeguati.size(); i = i+1){
        differenza = abs(portataMerce - listaAutocarriAdeguati.get(i).portata);
        if(differenza < minorDifferenza){
           minorDifferenza = differenza;
           indice = i;
        }
      }
      return listaAutocarriAdeguati.get(indice); //restituisco la tipoliga di autocarro più adeguata al viaggio  
     }

     /*
      * Metodo che calcola il numero di autocarri compatibili necessari per trasportare una determinata quantità di merce;
      */
     public int numeroAutocarri(String quantitaMerce, Autocarro aut){
        private int numeroAutocarriNecessari = ceil(quantitaMerce/aut.portataMerce);
        return numeroAutocarriNecessari;
     }
}