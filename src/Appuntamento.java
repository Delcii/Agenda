import java.time.LocalDate;

public class Appuntamento {
    LocalDate data;
    public LocalDate getData() {
        return data;
    }
    public void setData(LocalDate data) {
        this.data = data;
    }
    String titolo,note;
    public String getTitolo() {
        return titolo;
    }
    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }
    public String getNote() {
        return note;
    }
    public void setNote(String note) {
        this.note = note;
    }

    public Appuntamento(String t, LocalDate d, String n) {
        setData(d);
        setTitolo(t);
        setNote(n);
    }


}
