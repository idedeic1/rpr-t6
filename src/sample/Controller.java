package sample;


import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import org.controlsfx.validation.ValidationSupport;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.Event;
import org.controlsfx.validation.Validator;


public class Controller {
    public TextArea imeField, prezimeField, indeks, JMBG, datum, konAdresa, konTel, godina, mailAdresa, odsjek, ciklus;
    public RadioButton dugmeDa1, dugmeNe2, dugmeNe1, dugmeDa2;
    public ComboBox<String> mjesto;

    public ValidationSupport validationSupport, validationSupport1, validationSupport2, validationSupport3, validationSupport4, validationSupport5, validationSupport6, validationSupport7, validationSupport8;
    public boolean provjera11, provjera1, provjera2, provjera3, provjera4, provjera5, provjera6, provjera7, provjera8, provjera9, provjera10;

    public void onBtnClick(javafx.event.ActionEvent actionEvent) {
        if( provjera11 && provjera1 && provjera2 && provjera3 && provjera4 && provjera5 && provjera6 && provjera7 && provjera8 && provjera9 && provjera10){
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
            odsjek.getStyleClass().add("poljeIsprazni");
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
    public void prikazi(Event event) {
        ObservableList<String> opcije = FXCollections.observableArrayList("Sarajevo", "Mostar", "Tuzla", "Banja Luka");
        mjesto.getItems().clear();
        mjesto.getItems().addAll(opcije);
    }

    public void unosImena(KeyEvent keyEvent) {
        imeField.textProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observableValue, String o, String n) {
                Provjera e = new Provjera();
                if (e.provjeriImePrezime(n)) {
                    imeField.getStyleClass().removeAll("poljeNijeIspravno");
                    imeField.getStyleClass().add("poljeIspravno");
                    provjera1 = true;
                } else {
                    imeField.getStyleClass().removeAll("poljeIspravno");
                    imeField.getStyleClass().add("poljeNijeIspravno");
                    provjera1 = false;
                }
            }
        });

    }

    public void unosPrezimena(KeyEvent keyEvent) {
        prezimeField.textProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observableValue, String o, String n) {
                Provjera e = new Provjera();
                if (e.provjeriImePrezime(n)) {
                    prezimeField.getStyleClass().removeAll("poljeNijeIspravno");
                    prezimeField.getStyleClass().add("poljeIspravno");
                    provjera2 = true;
                } else {
                    prezimeField.getStyleClass().removeAll("poljeIspravno");
                    prezimeField.getStyleClass().add("poljeNijeIspravno");
                    provjera2 = false;
                }
            }
        });
    }

    public void unosIndeksa(KeyEvent keyEvent) {
        indeks.textProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observableValue, String o, String n) {
                Provjera e = new Provjera();
                if (e.provjeriIndeks(n)) {
                    indeks.getStyleClass().removeAll("poljeNijeIspravno");
                    indeks.getStyleClass().add("poljeIspravno");
                    provjera3 = true;
                } else {
                    indeks.getStyleClass().removeAll("poljeIspravno");
                    indeks.getStyleClass().add("poljeNijeIspravno");
                    provjera3 = false;
                }
            }
        });
    }

    public void unosTelefona(KeyEvent keyEvent) {
        konTel.textProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observableValue, String o, String n) {
                Provjera e = new Provjera();
                if (e.provjeriTelefon(n)) {
                    konTel.getStyleClass().removeAll("poljeNijeIspravno");
                    konTel.getStyleClass().add("poljeIspravno");
                    provjera4 = true;
                } else {
                    konTel.getStyleClass().removeAll("poljeIspravno");
                    konTel.getStyleClass().add("poljeNijeIspravno");
                    provjera4 = false;
                }
            }
        });
    }

    public void unosOdsjeka(KeyEvent keyEvent) {
        odsjek.textProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observableValue, String o, String n) {
                Provjera e = new Provjera();
                if (e.provjeriOdsjek(n)) {
                    odsjek.getStyleClass().removeAll("poljeNijeIspravno");
                    odsjek.getStyleClass().add("poljeIspravno");

                    provjera5 = true;
                } else {
                    odsjek.getStyleClass().removeAll("poljeIspravno");
                    odsjek.getStyleClass().add("poljeNijeIspravno");

                    provjera5 = false;
                }
            }
        });
    }

    public void unosGodine(KeyEvent keyEvent) {
        godina.textProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observableValue, String o, String n) {
                Provjera e = new Provjera();
                if (e.provjeriGodine(n)) {
                    godina.getStyleClass().removeAll("poljeNijeIspravno");
                    godina.getStyleClass().add("poljeIspravno");
                    provjera6 = true;
                } else {
                    godina.getStyleClass().removeAll("poljeIspravno");
                    godina.getStyleClass().add("poljeNijeIspravno");
                    provjera6 = false;
                }
            }
        });
    }

    public void unosCiklusa(KeyEvent keyEvent) {
        ciklus.textProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observableValue, String o, String n) {
                Provjera e = new Provjera();
                if (e.provjeriCiklus(n)) {
                    ciklus.getStyleClass().removeAll("poljeNijeIspravno");
                    ciklus.getStyleClass().add("poljeIspravno");
                    provjera7 = true;
                } else {
                    ciklus.getStyleClass().removeAll("poljeIspravno");
                    ciklus.getStyleClass().add("poljeNijeIspravno");
                    provjera7 = false;
                }
            }
        });
    }

    public void unosMaila(KeyEvent keyEvent) {
        mailAdresa.textProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observableValue, String o, String n) {
                Provjera e = new Provjera();
                if (e.provjeriMail(n)) {
                    mailAdresa.getStyleClass().removeAll("poljeNijeIspravno");
                    mailAdresa.getStyleClass().add("poljeIspravno");
                    provjera8 = true;
                } else {
                    mailAdresa.getStyleClass().removeAll("poljeIspravno");
                    mailAdresa.getStyleClass().add("poljeNijeIspravno");
                    provjera8 = false;
                }
            }
        });
    }

    public void unosJMBG(KeyEvent keyEvent) {
        JMBG.textProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observableValue, String o, String n) {
                Provjera e = new Provjera();
                if (e.provjeriJMBG(n)) {
                    JMBG.getStyleClass().removeAll("poljeNijeIspravno");
                    JMBG.getStyleClass().add("poljeIspravno");
                    provjera9 = true;
                } else {
                    JMBG.getStyleClass().removeAll("poljeIspravno");
                    JMBG.getStyleClass().add("poljeNijeIspravno");

                    provjera9 = false;
                }
            }
        });
    }

    public void unosRodjenja(KeyEvent keyEvent) {
        datum.textProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observableValue, String o, String n) {
                Provjera e = new Provjera();
                if (e.provjeriDatumRodjenja(n, JMBG.getText())) {
                    datum.getStyleClass().removeAll("poljeNijeIspravno");
                    datum.getStyleClass().add("poljeIspravno");
                    provjera10 = true;
                } else {
                    datum.getStyleClass().removeAll("poljeIspravno");
                    datum.getStyleClass().add("poljeNijeIspravno");
                    provjera10 = false;
                }
            }
        });
    }

    public void unosAdrese(KeyEvent keyEvent) {
        ciklus.textProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observableValue, String o, String n) {
                Provjera e = new Provjera();
                if (e.provjeriAdresu(n)) {
                    konAdresa.getStyleClass().removeAll("poljeNijeIspravno");
                    konAdresa.getStyleClass().add("poljeIspravno");
                    provjera11 = true;
                } else {
                    konAdresa.getStyleClass().removeAll("poljeIspravno");
                    konAdresa.getStyleClass().add("poljeNijeIspravno");
                    provjera11 = false;
                }
            }
        });
    }

    public void clickRadBtnDa1(MouseEvent mouseEvent) {
        if(dugmeNe1.isSelected()) dugmeNe1.setSelected(false);
    }

    public void clickTadBtnNe1(MouseEvent mouseEvent) {
        if(dugmeDa1.isSelected()) dugmeDa1.setSelected(false);
    }

    public void clickRadBtnDa2(MouseEvent mouseEvent) {
        if(dugmeNe2.isSelected()) dugmeNe2.setSelected(false);
    }

    public void clickTadBtnNe2(MouseEvent mouseEvent) {
        if(dugmeDa2.isSelected()) dugmeDa2.setSelected(false);
    }

    public void misIme(MouseEvent mouseEvent) {
        validationSupport = new ValidationSupport();
        validationSupport.registerValidator(imeField, Validator.createEmptyValidator("Text is Required!"));
        validationSupport.setErrorDecorationEnabled(!provjera1);
    }

    public void oslobodiIme(MouseEvent mouseEvent) {
        validationSupport.setErrorDecorationEnabled(false);
    }

    public void misPrezime(MouseEvent mouseEvent) {
        validationSupport1 = new ValidationSupport();
        validationSupport1.registerValidator(prezimeField, Validator.createEmptyValidator("Text is Required!"));
        validationSupport1.setErrorDecorationEnabled(!provjera2);
    }

    public void oslobodiPrezime(MouseEvent mouseEvent) {
        validationSupport1.setErrorDecorationEnabled(false);
    }

    public void misIndeks(MouseEvent mouseEvent) {
        validationSupport2 = new ValidationSupport();
        validationSupport2.registerValidator(indeks, Validator.createEmptyValidator("Text is Required!"));
        validationSupport2.setErrorDecorationEnabled(!provjera3);
    }

    public void oslobodiIndeks(MouseEvent mouseEvent) {
        validationSupport2.setErrorDecorationEnabled(false);
    }

    public void misJMBG(MouseEvent mouseEvent) {
        validationSupport3 = new ValidationSupport();
        validationSupport3.registerValidator(JMBG, Validator.createEmptyValidator("Text is Required!"));
        validationSupport3.setErrorDecorationEnabled(!provjera4);
    }

    public void oslobodiJMBG(MouseEvent mouseEvent) {
        validationSupport3.setErrorDecorationEnabled(false);
    }

    public void misTel(MouseEvent mouseEvent) {
        validationSupport4 = new ValidationSupport();
        validationSupport4.registerValidator(konTel, Validator.createEmptyValidator("Text is Required!"));
        validationSupport4.setErrorDecorationEnabled(!provjera4);
    }

    public void oslobodiTel(MouseEvent mouseEvent) {
        validationSupport4.setErrorDecorationEnabled(false);
    }

    public void misMail(MouseEvent mouseEvent) {
        validationSupport5 = new ValidationSupport();
        validationSupport5.registerValidator(mailAdresa, Validator.createEmptyValidator("Text is Required!"));
        validationSupport5.setErrorDecorationEnabled(!provjera8);
    }

    public void oslobodiMail(MouseEvent mouseEvent) {
        validationSupport5.setErrorDecorationEnabled(false);
    }

    public void misOdsjek(MouseEvent mouseEvent) {
        validationSupport6 = new ValidationSupport();
        validationSupport6.registerValidator(odsjek, Validator.createEmptyValidator("Text is Required!"));
        validationSupport6.setErrorDecorationEnabled(!provjera5);
    }

    public void oslobodiOdsjek(MouseEvent mouseEvent) {
        validationSupport6.setErrorDecorationEnabled(false);
    }

    public void misGodina(MouseEvent mouseEvent) {
        validationSupport7 = new ValidationSupport();
        validationSupport7.registerValidator(godina, Validator.createEmptyValidator("Text is Required!"));
        validationSupport7.setErrorDecorationEnabled(!provjera6);
    }

    public void oslobodiGodinu(MouseEvent mouseEvent) {
        validationSupport7.setErrorDecorationEnabled(false);
    }

    public void misCiklus(MouseEvent mouseEvent) {
        validationSupport8 = new ValidationSupport();
        validationSupport8.registerValidator(ciklus, Validator.createEmptyValidator("Text is Required!"));
        validationSupport8.setErrorDecorationEnabled(!provjera7);
    }

    public void oslobodiCiklus(MouseEvent mouseEvent) {
        validationSupport8.setErrorDecorationEnabled(false);
    }


}
