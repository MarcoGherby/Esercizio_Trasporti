import java.util.Date;
public class Viaggio {

    public String codice;
    public String origine;
    public String destinazione;
    public String tipologia;
    public double quantita;
    public Date dataPartenza;
    public Date dataArrivo;
    public String tipologiaAutocarro;
    public int quantitaAutocarri;

    public void Viaggio(String cittaOrigine, String cittaDestinazione, String tipologiaMerce, double quantitaMerce, String dt-partenza, String dt-arrivo){
        
        codice = origine + destinazione;
        origine = cittaOrigine;
        destinazione = cittaDestinazione;
        tipologia = tipologiaMerce;
        quantita = quantitaMerce;
        dataPartenza = gestioneDate.conversioneDate(dt_partenza);
        dataArrivo = gestioneDate.conversioneDate(dt_arrivo); 
        tipologiaAutocarro = gestioneAutocarri.tipologiaAutocarri(tipologiaMerce);
        numeroAutocarri = gestioneAutocarri.numeroAutocarri(quantitaMerce, tipologiaAutocarro);
     }
}