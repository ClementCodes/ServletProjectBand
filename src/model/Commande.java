package model;

public interface Commande {

	public int getIdClient();

	public int getPrixTotal();

	/*
	 * Renvoie une chaine de caract�res repr�sentant la liste de articles et la
	 * quantit� correspondante. La chaine ressemble �
	 * [quantite1-idarticle1;quantite2-idarticle2;...]
	 */
	public String getInfo();

	/*
	 * Cherche dans la liste des articles de la commande et rajoute la quantit�
	 * indiqu�e. Si l'article n'�xiste pas, il le cr��
	 */
	public void ajouterArticle(Article a, int quantite);

	/*
	 * [V1.5] Supprime la quantit� demand�e de l'article
	 */
	public void supprimerArticle(Article a, int quantite);

	/*
	 * [V1.5] Supprime l'article de la commande
	 */
	public void supprimerArticle(Article a);
}
