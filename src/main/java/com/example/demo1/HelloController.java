package com.example.demo1;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.io.*;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ResourceBundle;


public class HelloController implements Initializable {
    private static final String COMMA_DELIMITER = ",";

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        codeValue.setCellValueFactory(new PropertyValueFactory<Lignes, String>("codeValue"));
        alternateName.setCellValueFactory(new PropertyValueFactory<Lignes, String>("alternateName"));
        countryGroup.setCellValueFactory(new PropertyValueFactory<Lignes, String>("countryGroup"));
        nameEn.setCellValueFactory(new PropertyValueFactory<Lignes, String>("nameEn"));
        nameFr.setCellValueFactory(new PropertyValueFactory<Lignes, String>("nameFr"));
        nameDE.setCellValueFactory(new PropertyValueFactory<Lignes, String>("nameDe"));
        latitude.setCellValueFactory(new PropertyValueFactory<Lignes, String>("latitude"));
        longitude.setCellValueFactory(new PropertyValueFactory<Lignes, String>("longitude"));
        File file = new File("students.txt");

        List<List<String>> csv = getCsv();
        for (int i = 1; i < csv.size(); i++) {
            Lignes lignes = new Lignes(csv.get(i).get(0), csv.get(i).get(1), csv.get(i).get(2),
                                        csv.get(i).get(3), csv.get(i).get(4), csv.get(i).get(5),
                                        csv.get(i).get(6), csv.get(i).get(7));
            tableau.getItems().add(lignes);
        }
    }

    @FXML
    private TableView tableau;
    @FXML
    private TableColumn codeValue;
    @FXML
    private TableColumn alternateName;
    @FXML
    private TableColumn countryGroup;
    @FXML
    private TableColumn nameEn;
    @FXML
    private TableColumn nameFr;
    @FXML
    private TableColumn nameDE;
    @FXML
    private TableColumn latitude;
    @FXML
    private TableColumn longitude;




    public static List<List<String>> getCsv(){

        List<List<String>> records = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader("pays.csv"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] values = line.split(COMMA_DELIMITER);
                records.add(Arrays.asList(values));
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return records;
    }
}
