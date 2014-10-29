package beans;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.persistence.EntityManager;

import persistencia.JpaUseful;
import modelo.Post;

@ManagedBean
public class PostarBean {
	
	private String titulo="egg";
	private String texto;
	
	public PostarBean() {
	//vai no banco
		//pega todos os post
		//listadepost = dsaidjasijdas
	}
	
	public void postar(){
		EntityManager entityManager = JpaUseful.getEntityManager(); 
		entityManager.getTransaction().begin();
		Post post = new Post(titulo,texto);
		System.out.println(post);
		entityManager.persist(post);
		entityManager.getTransaction().commit();
		entityManager.close();
	}

	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getTexto() {
		return texto;
	}
	public void setTexto(String texto) {
		this.texto = texto;
	}
	
	
	
}
