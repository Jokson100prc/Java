package tarr.app.ver2;

public enum Events {
  ROCZNICA("Pamiętaj o rocznicy"),
  WIZYTA_LEKARSKA("Wizyta u lekarza"),
  TELEFON("Pamiętaj o telefonie"),
  STANDARD("Dodaje treść zadania"),
  PRZEGLAD_SAMOCHODU("Pamietaj o przeglądzie");

  private String content;

  Events (String content){
    this.content = content;
  }

  public String getContent() {
    return content;
  }
}
