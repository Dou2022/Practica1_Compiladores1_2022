package com.example.practica1.domain ;

import com.example.practica1.analizadores.cup.*;
import com.example.practica1.analizadores.flex.*;
import java.io.StringReader;

public class Separador {


  public static String[] arregloTexto(String[] textos, String nuevo){
      String[] enviar = new String[textos.length+1];
      for (int i = 0; i < textos.length ; i++) {
          enviar[i] = textos[i];
      }
      enviar[textos.length] = nuevo;

      return enviar;
  }
  public static Double[] arregloEntero(Double[] enteros,Double nuevo){
      Double[] enviar = new Double[enteros.length+1];
      for (int i = 0; i < enteros.length; i++) {
          enviar[i] = enteros[i];
      }
      enviar[enteros.length] = nuevo;

      return enviar;
  }
  public static Double[][] arregloUnir(Double[][] unir, Double[] nuevo){
      Double[][] enviar = new Double[unir.length+1][nuevo.length];
      for (int i = 0; i < enviar.length; i++) {
          for (int j = 0; j < enviar[i].length; j++) {
              enviar[i][j] = unir[i][j];
          }
      }
      enviar[unir.length][0] = nuevo[0];
      enviar[unir.length][1] = nuevo[1];

      return enviar;
  }
}
