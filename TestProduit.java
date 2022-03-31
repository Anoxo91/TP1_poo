public class TestProduit {
    public static void main(String[] args) {
        Categorie testCategorie = new Categorie("Sucre",3);

        Produit testProduit = new Produit(12, "bonbon", 60, 5, 25,testCategorie);{
            System.out.println("stock aprés ajout: "+testProduit.StockUp(15));
            System.out.println("stock aprés vente: "+testProduit.StockDown(35));
            System.out.println("valeur du stock: "+testProduit.StockVal());
            System.out.println("conformité du stock: "+testProduit.StockLimite());
            System.out.println("la commande est t'elle valide: "+testProduit.ValidityCommande(20));
            System.out.println("reference de la categorie: "+testProduit.getCodeCat());
            System.out.println("nom de la categorie: "+testProduit.getNomCat());
    }

    }
}