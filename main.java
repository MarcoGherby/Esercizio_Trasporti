import java.util.Vector;
public class main{
    public static void main(String[] args) {
    
        public Vector<Viaggio> viaggiPrenotati;
        public Vector<Viaggio> risultatiRicerca;
         /* 
          * Metodo che crea un nuovo viaggio e lo inserisce nel vettore contente tutti i viaggi prenotati.
          */
         public void nuovoViaggio(String origine, String destinazione, String tipologiaMerce, double quantitaMerce, String dataPartenza, String dataArrivo){
            Viaggio viaggio = new Viaggio( origine, destinazione, tipologiaMerce, quantitaMerce, dataPartenza, dataArrivo);
            viaggiPrenotati.add(viaggio);
            
         }
        
         /* 
          * Metodo che effettua una ricerca tra i viaggi prenotati in cui bisogna specificare la ricerca che si vuole fare specificando
          * la proprietà che si vuole analizzare e il valore necessitato
          */
         public Vector<Viaggio> ricercaViaggio(String campoRicerca, String ricerca){
            for(int i = 0; i < viaggiPrenotati.size(); i = i+1 ){
                if(viaggio.get(i).campoRicerca == ricerca){
                    risultatiRicerca.add(viaggio.get(i));
                }
            }
         }
    
        /*
         * Metodo che permette di cambiare il percorso di un viaggio prenotato specificando il luogo di partenza, il luogo di arrivo ed 
         * inserendo una città intermedia in modo da far capire al programma quale percorso si voglia intendere 
         */
    
         public void cambioPercorso(String cittaOrigine, String cittaDestinazione, String intermedio){
            
            for(int i = 0; i < viaggiPrenotati.size(); i = i+1 ){
                if(viaggio.origine == cittaOrigine && viaggio.destinazione == cittaDestinazione){
                    //qua cambio modifico il percorso in qualche modo
                }
            }
         }
     }
}
 