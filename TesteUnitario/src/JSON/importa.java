/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JSON;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import java.io.BufferedReader;
import java.io.FileReader;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import Objeto.Numero;

/**
 *
 * @author debor
 */
public class importa {

    public List<Numero> importaJson() {
        
        List<Numero> lista = new ArrayList<Numero>();
        
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("ArquivosJson/GrupoNumero.json"));
            Type listType = new TypeToken<ArrayList<Numero>>() {
            }.getType();
            lista = new Gson().fromJson(bufferedReader, listType);
            return lista;

        } catch (java.io.FileNotFoundException e) {
            return lista;
        }
    }
}
