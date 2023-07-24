import javax.swing.*;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Objects;

public class ConversionDinero {
   private double numeroConvertir;
   protected String[] options;
   private boolean optionContinue;

   public static String currencyFormat(double value, Locale locale) {
       NumberFormat nf = NumberFormat.getCurrencyInstance(locale);
       return nf.format(value);
   }

   public void getOption(String option) {
      if (Objects.equals(this.options[0], option)) {
          double valueD = (this.numeroConvertir * 0.00024);
          String totalD = "Tienes " + currencyFormat(valueD, new Locale("en", "US"))  + " Dolares";
          JOptionPane.showMessageDialog(null, totalD);
      } else if (Objects.equals(this.options[1], option)) {
          double valueE = (this.numeroConvertir * 0.00022);
          String totalE = "Tienes " + currencyFormat(valueE, new Locale("en", "FR"))  + " Euros";
          JOptionPane.showMessageDialog(null, totalE);
      } else if (Objects.equals(this.options[2], option)) {
          double valueL = (this.numeroConvertir * 0.00019);
          String totalL = "Tienes " + currencyFormat(valueL, new Locale("en", "GB")) + " Libras";
          JOptionPane.showMessageDialog(null, totalL);
      } else if (Objects.equals(this.options[3], option)) {
          double valueY = (this.numeroConvertir * 0.034);
          String totalY = "Tienes " + currencyFormat(valueY, new Locale("en", "JP"))  + " Yenes";
          JOptionPane.showMessageDialog(null, totalY);
      } else if (Objects.equals(this.options[4], option)) {
          double valueW = (this.numeroConvertir * 0.31);
          String totalW = "Tienes " + currencyFormat(valueW, new Locale("en", "KR")) + " Won surcoreano";
          JOptionPane.showMessageDialog(null, totalW);
      } else if (Objects.equals(this.options[5], option)) {
          double valueDAP = (this.numeroConvertir * 4195.73);
          String totalDAP = "Tienes " + currencyFormat(valueDAP, new Locale("en", "CO"))  + " Pesos";
          JOptionPane.showMessageDialog(null, totalDAP);
      } else if (Objects.equals(this.options[6], option)) {
          double valueEAP = (this.numeroConvertir * 4604.62);
          String totalEAP = "Tienes " + currencyFormat(valueEAP, new Locale("en", "CO"))  + " Pesos";
          JOptionPane.showMessageDialog(null, totalEAP);
      } else if (Objects.equals(this.options[7], option)) {
          double valueLAP = (this.numeroConvertir * 5386.68);
          String totalLAP = "Tienes " + currencyFormat(valueLAP, new Locale("en", "CO"))  + " Pesos";
          JOptionPane.showMessageDialog(null, totalLAP);
      } else if (Objects.equals(this.options[8], option)) {
          double valueYAP = (this.numeroConvertir * 29.52);
          String totalYAP = "Tienes " + currencyFormat(valueYAP, new Locale("en", "CO"))  + " Pesos";
          JOptionPane.showMessageDialog(null, totalYAP);
      } else if (Objects.equals(this.options[9], option)) {
          double valueWAP = (this.numeroConvertir * 3.20);
          String totalWAP = "Tienes " + currencyFormat(valueWAP, new Locale("en", "CO"))  + " Pesos";
          JOptionPane.showMessageDialog(null, totalWAP);
      }
   }

   public void terminar(int option) {
       if (option == 1 || option == 2) {
           JOptionPane.showMessageDialog(null, "Programa terminado");
           this.optionContinue = false;
       }
   }

    public void setNumeroConvertir(double numeroConvertir) {
        this.numeroConvertir = numeroConvertir;
    }

    public void setOptionContinue(boolean optionContinue) {
        this.optionContinue = optionContinue;
    }

    public void setOptions(String[] options) {
        this.options = options;
    }

    public double getNumeroConvertir() {
        return numeroConvertir;
    }

    public boolean getOptionContinue() {
        return this.optionContinue;
    }

    /*public String[] getOptions() {
        return this.options;
    } */
}
