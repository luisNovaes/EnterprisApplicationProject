/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aplicacao.servico;

import javax.ejb.Remote;

/**
 *
 * @author luis.silva
 */
@Remote
public interface CalculadoraRemote {

    int somar(int valor1, int valor2);

}
