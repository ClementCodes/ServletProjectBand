package model;

public interface LigneCommande {

	public void ajouter(int quantite);

	/*
	 * [V1.5] R�duit la quantit� de l'article
	 */
	public void enlever(int quantite);
}
