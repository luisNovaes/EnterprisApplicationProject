/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aplicacao.servico;

import javax.ejb.Stateless;

/**
 *
 * @author luis.silva
 */
@Stateless
public class Calculadora implements CalculadoraRemote {

    @Override
    public int somar(int valor1, int valor2) {
        return valor1 + valor2;
    }

}
