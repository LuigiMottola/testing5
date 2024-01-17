import org.junit.jupiter.api.Test;

import java.time.OffsetDateTime;

import static org.junit.jupiter.api.Assertions.*;

class DateHandlerTest {


    DateHandler testing = new DateHandler();

    @Test
    void operazioni() {
        OffsetDateTime dataFinale = OffsetDateTime.parse("2024-02-08T13:00:00Z");
        OffsetDateTime result = testing.modificaData(OffsetDateTime.parse("2023-03-01T13:00:00Z"));


        assertEquals(dataFinale, result);
    }

    void eccezioniOperazioniSeDataNull(){
        OffsetDateTime dateTime = null;
        try{
            testing.modificaData(dateTime);
        } catch (NullPointerException e){
            System.out.println("Se null lancia eccezione perché la funzione non deve ritornare null");
        }
    }

}