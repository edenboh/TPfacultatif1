package sio.tpfacultatif;

import javafx.collections.FXCollections;
import javafx.collections.ObservableArray;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class TpFactultatifController implements Initializable
{

    @FXML
    private Button btnExemple1;
    @FXML
    private Button btnExemple2;
    @FXML
    private Button btnExemple3;
    @FXML
    private Label lblContactsbu;
    @FXML
    private Button btnAjouter;
    @FXML
    private Button btnModifier;
    @FXML
    private Button btnSupprimer;
    @FXML
    private TableView tblPersonne;
    ObservableList<Personnes>lesPersonnes;
    @FXML
    private TableColumn tcNom;
    @FXML
    private TableColumn tcPrenom;
    @FXML
    private TableColumn tcAge;
    @FXML
    private BorderPane image1;
    @FXML
    private AnchorPane ancEx1;
    @FXML
    private AnchorPane AncPersonne1;
    @FXML
    private Text txtPersonne1;
    @FXML
    private Text txtPersonne2;
    @FXML
    private AnchorPane anchPersonne3;
    @FXML
    private Label lblTitre;
    @FXML
    private AnchorPane anchPersonne2;
    @FXML
    private AnchorPane ancExemple2;
    @FXML
    private Text txtPersonne3;
    @FXML
    private ImageView imgPersonne2;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
       lesPersonnes = FXCollections.observableArrayList();
        Personnes p1=new Personnes("Fortain","Francois","50");
        Personnes p2=new Personnes("Annonier","Eric","49");
        Personnes p3=new Personnes("Cousinol","Sebastien","51");
        lesPersonnes.add(p1);lesPersonnes.add(p2);lesPersonnes.add(p3);
        tcNom.setCellValueFactory(new PropertyValueFactory<Personnes,String>("nom"));
        tcPrenom.setCellValueFactory(new PropertyValueFactory<Personnes,String>("prenom"));
        tcAge.setCellValueFactory(new PropertyValueFactory<Personnes,String>("age"));

        tblPersonne.setItems(lesPersonnes);

    }


    @FXML
    public void colorChange(ActionEvent actionEvent)
    {
        btnAjouter.setStyle("-fx-background-color: green;");
    }

    @FXML
    public void colorChangeM(ActionEvent actionEvent) {
        btnModifier.setStyle("-fx-background-color: green;");
    }

    @FXML
    public void colorChangeS(ActionEvent actionEvent) {
        btnSupprimer.setStyle("-fx-background-color: green;");
    }

    @FXML
    public void tvPersonnesClicked(Event event) throws IOException {
        FXMLLoader fxmlLoader=new FXMLLoader(getClass().getResource("modif-view.fxml"));
        Parent root=fxmlLoader.load();
        Scene scene=new Scene(root);
        ModifController modifController1=fxmlLoader.getController();
        modifController1.initDatas(((Personnes)tblPersonne.getSelectionModel().getSelectedItem()));
        Stage stage=new Stage();
        stage.setTitle("modification d'un contacte");
        stage.show();
        //
    }

    @FXML
    public void cmdExempleClicked(Event event) {
    }

    @FXML
    public void cmdExemple2Clicked(Event event) {
    }

    @FXML
    public void cmdexemple3Clicked(Event event) {
    }


    /*@FXML
    public void cmdExemple2Clicked(Event event) {
         lblTitre.setText("TP1 : Les bases / Exemple n°2");
         ancExemple2.toFront();
         /*txtPersonne1.setText(lesPersonnes.get(0).getNom()+"\n"+lesPersonnes.get(0).getAge()+" ans");
         txtPersonne2.setText(lesPersonnes.get(1).getNom()+"\n"+lesPersonnes.get(1).getAge()+" ans");
         txtPersonne3.setText(lesPersonnes.get(2).getNom()+"\n"+lesPersonnes.get(2).getAge()+" ans");
    }


    @FXML
    public void cmdexemple3Clicked(Event event) {
    }


    @FXML
    public void cmdExempleClicked(Event event) {
    }*/
}