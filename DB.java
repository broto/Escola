/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package escola;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Anaclaudia
 */
public class DB {
     private static List<Aluno> alunos = new ArrayList<Aluno>();
  
    /*
     * Aposentos
     */
 
    public static List<Aluno> getAlunos() {
        return alunos;
    }
 
    public static void addAluno(Aluno aluno){
        alunos.add(aluno);
    }
 
    public static void atualizarAluno(int linhaSelecionada, Aluno aluno){
        alunos.set(linhaSelecionada, aluno);
    }
 
    public static void removerAluno(Aluno aluno){
        alunos.remove(aluno);
    }
}
