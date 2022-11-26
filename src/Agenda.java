import java.io.*;
import java.time.LocalDate;

public class Agenda {
    private Appuntamento[]  pippo;

    public Appuntamento[] getPippo() {
        return pippo;
    }

    public void setPippo(Appuntamento[] pippo) {
        this.pippo = pippo;
    }

    public Agenda() {
        pippo = new Appuntamento[100];
    }

    public void aggiungiAppuntamento(Appuntamento a)
    {
        for(int i=0; i <= pippo.length-1; i++)
            if(pippo[i] == null)
            {
                pippo[i] = a;
                break;
            }
    }

    public void modificaAppuntamento(String t,Appuntamento a)
    {
        for(int i=0; i <= pippo.length-1; i++)
            if(pippo[i] != null && pippo[i].getTitolo() == t)
            {
                pippo[i] = a;
                break;
            }
    }

    public void eliminaAppuntamento(String t)
    {
        for(int i=0; i <= pippo.length-1; i++)
            if(pippo[i] != null && pippo[i].getTitolo() == t)
            {
                pippo[i] = null;
                break;
            }
    }

    public void salvaAgenda() throws IOException
    {
        BufferedWriter salva = null;
        try{
            salva = new BufferedWriter(new FileWriter("Agenda.txt"));
            for(int i=0; i <= pippo.length-1; i++)
                if(pippo[i] != null)
                {
                    salva.write(pippo[i].getData().toString());
                    salva.newLine();
                    salva.write(pippo[i].getTitolo());
                    salva.newLine();
                    salva.write(pippo[i].getNote());
                    salva.newLine();
                    salva.flush();
                }
        }finally {
            if(salva != null)
                salva.close();
        }
    }

    public void caricaAgenda() throws IOException
    {
        BufferedReader leggi = null;
        try{
            leggi = new BufferedReader(new FileReader("Agenda.txt"));
            for(int i=0; i <= pippo.length-1 && leggi.readLine() == null; i++)
                    pippo[i] = new Appuntamento(leggi.readLine(), LocalDate.parse(leggi.readLine()), leggi.readLine());
        }finally {
            if(leggi != null)
                leggi.close();
        }
    }
}
