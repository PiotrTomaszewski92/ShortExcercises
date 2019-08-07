package equalsAndHashCode;

public class Person implements Comparable<Person>{
    private String imie;
    private String nazwisko;
    private int wiek;
    private double cena;

    public Person(String imie, String nazwisko, int wiek, double cena) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.wiek = wiek;
        this.cena = cena;
    }

    public double getCena() {
        return cena;
    }

    public int getWiek() {
        return wiek;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person that = (Person) o;

        if (wiek != that.wiek) return false;
        if (Double.compare(that.cena, cena) != 0) return false;
        if (imie != null ? !imie.equals(that.imie) : that.imie != null) return false;
        return nazwisko != null ? nazwisko.equals(that.nazwisko) : that.nazwisko == null;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = imie != null ? imie.hashCode() : 0;
        result = 31 * result + (nazwisko != null ? nazwisko.hashCode() : 0);
        result = 31 * result + wiek;
        temp = Double.doubleToLongBits(cena);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public int compareTo(Person o) {
        int compareResult = Double.compare(this.cena,o.cena);
            if(compareResult == 0){
                compareResult = Integer.compare(this.wiek, o.wiek);
                if(compareResult == 0){
                    compareResult = this.imie.compareToIgnoreCase(o.imie);
                    if(compareResult == 0){
                        compareResult = this.nazwisko.compareToIgnoreCase(o.nazwisko);
                    }
                }
            }
        return compareResult;

    }

    @Override
    public String toString() {
        return "Porownanie [ imie='" + imie + ",\tnazwisko='" + nazwisko + ", wiek=" + wiek +", cena=" + cena +" ]";
    }
}
