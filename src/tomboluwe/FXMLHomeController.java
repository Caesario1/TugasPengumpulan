package tomboluwe;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXCheckBox;
import com.jfoenix.controls.JFXRadioButton;
import com.jfoenix.controls.JFXTextArea;
import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ToggleGroup;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;

public class FXMLHomeController {

    @FXML
    private Label hargaMakanan;
    @FXML
    private Label hargaMakanan1;
    @FXML
    private Label hargaMakanan11;
    @FXML
    private Label hargaMakanan13;
    @FXML
    private Label hargaMakanan12;
    @FXML
    private Label hargaMakanan121;
    @FXML
    private Label hargaMakanan1211;
    @FXML
    private Label hargaMakanan12111;
    @FXML
    private JFXTextField jumlah1;
    @FXML
    private JFXTextField jumlah6;
    @FXML
    private JFXTextField jumlah7;
    @FXML
    private JFXTextField jumlah8;
    @FXML
    private JFXTextField jumlah2;
    @FXML
    private JFXTextField jumlah3;
    @FXML
    private JFXTextField jumlah4;
    @FXML
    private JFXTextField jumlah5;
    @FXML
    private JFXTextField inAn;
    @FXML
    private JFXTextField jumlahUang;
    @FXML
    private Label total;
    @FXML
    private JFXButton btnCetak;
    @FXML
    private JFXTextArea hasilPesanan;
    @FXML
    private JFXRadioButton radio1;
    @FXML
    private JFXRadioButton radio2;
    @FXML
    private JFXCheckBox mak1;
    @FXML
    private JFXCheckBox mak2;
    @FXML
    private JFXCheckBox mak3;
    @FXML
    private JFXCheckBox mak4;
    @FXML
    private JFXCheckBox mak5;
    @FXML
    private JFXCheckBox mak6;
    @FXML
    private JFXCheckBox mak7;
    @FXML
    private JFXCheckBox mak8;
    @FXML
    private JFXButton btnCetak1;
    @FXML
    private ToggleGroup keterangan;
            
    int jumlahmakan, jumlahminum;
    int hagatotal1,hagatotal2,hagatotal3,hagatotal4,hagatotal5,hagatotal6,hagatotal7,hagatotal8;
    String menu1, menu2, menu3, menu4,menu5,menu6,menu7,menu8;
    String menu="";
    String kasir="";
    String atasnama, tampilTotalBayar, ket;
    int harga, kembalian;
    int totalbayar, jmlUangBayar;
   
    @FXML
    private void CetakPemesan(ActionEvent event) {
        if (radio1.isSelected()) {
            ket = "Dibungkus";
        } else if (radio2.isSelected()) {
            ket = "Makan Sini";
        } else {
            ket = "";
        }
        atasnama = inAn.getText();
        jmlUangBayar = Integer.parseInt(jumlahUang.getText());
        kembalian = jmlUangBayar - totalbayar;
        
        hasilPesanan.setText("Nama Pemesanan: " + atasnama + "\n" + "Menu yang Dipesan : "  + menu +"\n" + "Keterangan : " + ket + "\n" + "Total Pembayaran : Rp. " + totalbayar + "\n" + "Jumlah Uang yang Dibayar : Rp. "
                + jmlUangBayar + "\n" + "Uang Kembali : Rp. " + kembalian+ "Kasir : " + kasir);
        
    }

    @FXML
    private void nasiAnget(ActionEvent event) {
    }

    @FXML
    private void bebekgoreng(ActionEvent event) {
    }

    @FXML
    private void Hitung(ActionEvent event) {
        if(mak1.isSelected()){     
            harga = 12000;
            menu += mak1.getText()+", ";
            jumlahmakan=Integer.parseInt(jumlah1.getText());
            hagatotal1=harga*jumlahmakan;
            System.out.println(hagatotal1);
        }
        if(mak2.isSelected()){     
            harga = 25000;
            menu += mak2.getText()+", ";
            jumlahmakan=Integer.parseInt(jumlah2.getText());
            hagatotal2=harga*jumlahmakan;
            System.out.println(hagatotal2);
        }
        if(mak3.isSelected()){     
            harga = 15000;
            menu += mak3.getText()+", ";
            jumlahmakan=Integer.parseInt(jumlah3.getText());
            hagatotal3=harga*jumlahmakan;
            System.out.println(hagatotal3);
        }
        if(mak4.isSelected()){     
            harga = 15000;
            menu += mak4.getText()+", ";
            jumlahmakan=Integer.parseInt(jumlah4.getText());
            hagatotal4=harga*jumlahmakan;
            System.out.println(hagatotal4);
        }
        if(mak5.isSelected()){     
            harga = 30000;
            menu += mak5.getText()+", ";
            jumlahmakan=Integer.parseInt(jumlah5.getText());
            hagatotal5=harga*jumlahmakan;
            System.out.println(hagatotal5);
        }
        if(mak6.isSelected()){     
            harga = 7000;
            menu += mak6.getText()+", ";
            jumlahmakan=Integer.parseInt(jumlah6.getText());
            hagatotal6=harga*jumlahmakan;
            System.out.println(hagatotal6);
        }
        if(mak7.isSelected()){     
            harga = 5000;
            menu += mak7.getText()+", ";
            jumlahmakan=Integer.parseInt(jumlah7.getText());
            hagatotal7=harga*jumlahmakan;
            System.out.println(hagatotal7);
        }
        if(mak8.isSelected()){     
            harga = 8000;
            menu += mak8.getText()+", ";
            jumlahmakan=Integer.parseInt(jumlah8.getText());
            hagatotal8=harga*jumlahmakan;
            System.out.println(hagatotal8);
        }
        totalbayar = hagatotal1+hagatotal2+hagatotal3+hagatotal4+hagatotal5+hagatotal6+hagatotal7+hagatotal8;
        tampilTotalBayar=String.valueOf(totalbayar);
        total.setText(tampilTotalBayar);
    }
}
