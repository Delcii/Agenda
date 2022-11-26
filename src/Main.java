import java.io.IOException;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) throws IOException {
        Agenda agenda = new Agenda();
        agenda.caricaAgenda();
        agenda.eliminaAppuntamento("aassef");
        agenda.aggiungiAppuntamento(new Appuntamento("bo",LocalDate.of(2022,4,1),"help"));
        agenda.salvaAgenda();
    }
}