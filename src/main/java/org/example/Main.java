package org.example;

import ManipularCsv.ManipularCSV;
import com.opencsv.CSVReader;

import java.io.FileReader;
import java.io.IOException;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    static String  ARCHIVEROUTE ="ruta/al/archivo/datos.csv";

    public static void main(String[] args) {

        ManipularCSV mpCsv = new ManipularCSV();
        mpCsv.leerArchivo(ARCHIVEROUTE);

    }
}