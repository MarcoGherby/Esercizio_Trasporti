import java.util.Date;
import java.text.SimpleDateFormat; 

public class gestioneDate{
    public Date conversioneDate(String data){
        String pattern = "dd-MM-yyyy";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        Date date = new SimpleDateFormat("dd/MM/yyyy").parse(data);
        return date;
    }
}