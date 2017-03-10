/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package escola;

import javax.swing.JFrame;

/**
 *
 * @author Anaclaudia
 */
public class Main {

    public static void main(String[] args) {
        new DB();

        JFrame manterAluno = new ManterAluno();
        manterAluno.setVisible(true);
    }
}
