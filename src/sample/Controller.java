package sample;


import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import org.controlsfx.validation.ValidationSupport;
import org.controlsfx.validation.Validator;

public class Controller {
    public TextArea imeField, prezimeField, indeks, JMBG, datum, konAdresa, konTel, godina, mjesto, mailAdresa, odsjek, ciklus;
    public RadioButton dugmeDa1, dugmeNe2, dugmeNe1, dugmeDa2;


    public ValidationSupport validationSupport, validationSupport1, validationSupport2, validationSupport3, validationSupport4, validationSupport5, validationSupport6, validationSupport7, validationSupport8;
    public boolean provjera1, provjera2, provjera3, provjera4, provjera5, provjera6, provjera7, provjera8, provjera9, provjera10;

    public void onBtnClick(javafx.event.ActionEvent actionEvent) {
        if( provjera1 && provjera2 && provjera3 && provjera4 && provjera5 && provjera6 && provjera7 && provjera8 && provjera9 && provjera10){
        System.out.println("Ime: " + imeField.getText() + "\n" + "Prezime: " + prezimeField.getText() + "\n" + "Broj indeksa: " + indeks.getText() + "\n");
            System.out.println("JMBG: " + JMBG.getText() + "\n" + "Datum rodjenja: " + datum.getText() + "\n" + "Mjesto rodjenja: " + mjesto.getValue() + "\n");
            System.out.println("Kontakt adresa: " + konAdresa.getText() + "\n" + "KontaktTelefon: " + konTel.getText() + "\n" + "E-mail adresa: " + mailAdresa.getText() + "\n");
            System.out.println("Odjsek: " + odsjek.getText() + "\n" + "Godina: " + godina.getText() + "\n" + "Ciklus: " + ciklus.getText() + "\n");
            System.out.println("Da li je student redovan ili redovan samofinansirajući? ");
            if(dugmeDa1.isSelected()) System.out.println("Jeste\n");
            if(dugmeNe1.isSelected()) System.out.println("Nije\n");

            System.out.println("Da li student pripada posebnim boračkim kategorijama? ");
            if(dugmeDa2.isSelected()) System.out.println("Jeste\n");
            if(dugmeNe2.isSelected()) System.out.println("Nije\n");

            imeField.setText("");
            prezimeField.setText("");
            indeks.setText("");
            JMBG.setText("");
            datum.setText("");
            konAdresa.setText("");
            konTel.setText("");
            mailAdresa.setText("");
            odsjek.setText("");
            godina.setText("");
            ciklus.setText("");

            imeField.getStyleClass().add("poljeIsprazni");
            prezimeField.getStyleClass().add("poljeIsprazni");
            indeks.getStyleClass().add("poljeIsprazni");
            JMBG.getStyleClass().add("poljeIsprazni");
            datum.getStyleClass().add("poljeIsprazni");
            konTel.getStyleClass().add("poljeIsprazni");
            mailAdresa.getStyleClass().add("poljeIsprazni");
            odjesk.getStyleClass().add("poljeIsprazni");
            godina.getStyleClass().add("poljeIsprazni");
            ciklus.getStyleClass().add("poljeIsprazni");

        } else {
            Alert alert = new Alert(Alert.AlertType.WARNING, "File already exists. Do you want to override?");
            alert.setTitle("Upozorenje!");
            alert.setContentText("Provjerite unos podataka!");
            alert.getDialogPane().setPrefSize(350, 100);
            alert.show();
        }
    }

}
