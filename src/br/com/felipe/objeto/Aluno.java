/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.felipe.objeto;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author SATC
 */
public class Aluno {
    private String nome;
    private int matricula;
    private List<Nota> notas;

    public Aluno(String nome, int matricula) {
        this.nome = nome;
        this.matricula = matricula;
        notas = new ArrayList<>();
    }
    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public List<Nota> getNotas() {
        return notas;
    }

    public void setNotas(List<Nota> notas) {
        this.notas = notas;
    }

    @Override
    public String toString() {
        String totalNota = "";
        for (Nota nota : notas) {
            
        }
        return "~~Aluno~~" + "\nNome : " + nome + "\nMatrícula : " + matricula + "\nNotas : " + notas;
    }
    
    public double calcularMedia(){
        float somaTotal= 0; 
        for (Nota nota : notas) {
            somaTotal+= nota.getNota();
        }
        return somaTotal/notas.size();
    }
    
}
