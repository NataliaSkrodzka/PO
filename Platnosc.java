public class Platnosc {
    private double kwota;
    private String statusPlatnosci;
    public Platnosc(Zamowienie zamowienie) {
        this.kwota = zamowienie.kosztZamowienia;
        this.statusPlatnosci = "Nieopłacone";
    }

    public double getKwota() {
        return kwota;
    }
    public void setKwota(double kwota) {
        this.kwota = kwota;
    }
    public String getStatusPlatnosci() {
        return statusPlatnosci;
    }
    public void setStatusPlatnosci(String statusPlatnosci) {
        this.statusPlatnosci = statusPlatnosci;
    }

    public void zaplac(Zamowienie zamowienie) {
        zamowienie.platnosc = "Opłacone";
        this.kwota = 0;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Platnosc other = (Platnosc) obj;
        if (statusPlatnosci == null) {
            if (other.statusPlatnosci != null)
                return false;
        } else if (!statusPlatnosci.equals(other.statusPlatnosci))
            return false;
        if (Double.doubleToLongBits(kwota) != Double.doubleToLongBits(other.kwota))
            return false;
        return true;
    }
}
