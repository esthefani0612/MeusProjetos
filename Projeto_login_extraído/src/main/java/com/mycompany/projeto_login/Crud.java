
package com.mycompany.projeto_login;
import java.util.List;
import javax.persistence.TypedQuery;
import model.Usuario;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class Crud {
    public static void main(String[] args){
        
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();


        TypedQuery<Usuario> query = session.createQuery(" FROM Usuario", Usuario.class);
        List<Usuario> nutric = query.getResultList();
        for (Usuario user : nutric) {
            
            System.out.println("\nNome de usuário: "+user.getUsuario() + "\nTelefone: " + user.getTelefone());
        }
         session.close();
        
    }
}
