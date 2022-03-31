public class Produit {
    private int code;
    private String nomAttribut;
    private int stockQte;
    private int prixUnit;
    private int stockMin;
    private Categorie Cat1;


    public Produit(int code, String nomAttribut, int stockQte, int prixUnit, int stockMin, Categorie val) {
        this.code = code;
        this.nomAttribut = nomAttribut;
        this.stockQte = stockQte;
        this.prixUnit = prixUnit;
        this.stockMin = stockMin;
        this.Cat1 = val;

    }


    public String getNomAttribut() {
        return this.nomAttribut;
    }

    public void setNomAttribut(String param) {
        this.nomAttribut = param;
    }

    public int getCode() {
        return this.code;
    }

    public void setCode(int param) {
        this.code = param;
    }


    public int StockUp(int Qte) {
        return stockQte += Qte;
    }

    public int StockDown(int Qte) {
        return stockQte -= Qte;
    }

    public int StockVal() {
        return this.prixUnit * this.stockQte;
    }

    public String StockLimite() {
        if (stockQte < stockMin) {
            String message = "la quantité en stock est inferieur a la limite fixé";
            return message;
        } else {
            String message = "la quantité en stock est a la limite fixé";
            return message;
        }
    }

    public String ProduitInfo() {
        String message = "ProduitInfo: " + this.prixUnit + " " + this.stockQte + " " + this.nomAttribut + " " + this.code;
        return message;
    }

    public boolean ValidityCommande(int NbQte) {
        boolean validity;
        if (this.stockQte - NbQte > this.stockMin) {
            validity = true;
        } else {
            validity = false;
        }
        return validity;
    }

    public int getCodeCat() {
        return this.Cat1.getCode();
    }
    public String getNomCat() {
        return this.Cat1.getNom();
    }
}