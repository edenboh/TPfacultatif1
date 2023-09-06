package sio.tpfacultatif;

import javafx.event.Event;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class ModifController
{
    @javafx.fxml.FXML
    private Label lblNom;
    @javafx.fxml.FXML
    private TextField txtNom;
    @javafx.fxml.FXML
    private Label text;
    @javafx.fxml.FXML
    private TextField txtPrenomlabel;
    @javafx.fxml.FXML
    private Label lblAQge;
    @javafx.fxml.FXML
    private TextField txtAge;
    @javafx.fxml.FXML
    private Button btnModifier;
    private Personnes laPersonne;

    public void initDatas(Personnes p)
    {
      laPersonne=p;
        txtNom.setText(laPersonne.getNom());
        txtPrenomlabel.setText(laPersonne.getPrenom());
        txtAge.setText(String.valueOf(laPersonne.getAge()));

    }
    @javafx.fxml.FXML
    public void cmdModifierClicked(Event event)
    {
        laPersonne.setNom(txtNom.getText());
        laPersonne.setPrenom(txtPrenomlabel.getText());
        laPersonne.setAge(txtAge.getText());
    }
}
