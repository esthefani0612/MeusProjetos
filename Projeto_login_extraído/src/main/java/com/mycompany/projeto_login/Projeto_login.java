

package com.mycompany.projeto_login;


import javax.swing.JOptionPane;
import view.Login;



public class Projeto_login {

    public static void main(String[] args) {

        
        Login view = new Login();
        view.setVisible(true);
        
        
        
        
    }
    public void mensagem(){
        JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso!", 
            "Sucesso", JOptionPane.INFORMATION_MESSAGE);
        }
}
