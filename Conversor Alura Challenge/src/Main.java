import javax.swing.*;
import java.util.Objects;

public class Main {
    public static boolean isNumeric(String cadena) {
        boolean resultado;

        try {
            Double.parseDouble(cadena);
            resultado = true;
        } catch (NumberFormatException exception) {
            resultado = false;
        }

        return resultado;
    }

    public static void main(String[] args) {
        ConversionDinero conversionDinero = new ConversionDinero();
        conversionDinero.setOptionContinue(true);
        ConversionTemperatura conversionTemperatura = new ConversionTemperatura();

        while (conversionDinero.getOptionContinue()) {
            String[] options = {"Conversor de Moneda", "Conversor de Temperatura"};
            String seleccionConversion = (String)JOptionPane.showInputDialog(null,
                    "Selecciona una opcion de conversion", "Menu",
                    JOptionPane.QUESTION_MESSAGE, null, options, options[0]);

            if (Objects.equals(seleccionConversion, options[0])) {
                String preguntaDineroConv = JOptionPane.showInputDialog(
                        "Ingrese la cantidad de dinero que deasea convertir:"
                );

                if (preguntaDineroConv == null) {
                    JOptionPane.showMessageDialog(null, "Programa terminado");
                    break;
                }

                if (isNumeric(preguntaDineroConv) && Double.parseDouble(preguntaDineroConv) > 0) {
                    double dineroConvertir = Double.parseDouble(preguntaDineroConv);
                    String[] optionsMoneda = {
                            "De Pesos a Dolar", "De Pesos a Euro", "De Pesos a Libras", "De Pesos a Yen",
                            "De Pesos a Won surcoreano", "De Dolar a Pesos", "De Euro a Pesos",
                            "De Libras a Pesos", "De Yen a Pesos", "De Won surcoreano a Pesos"
                    };
                    String seleccionMoneda = (String)JOptionPane.showInputDialog(null,
                            "Elige la moneda a la que deseas convertir tu dinero",
                            "Monedas", JOptionPane.QUESTION_MESSAGE, null, optionsMoneda,
                            optionsMoneda[0]
                    );

                    conversionDinero.setNumeroConvertir(dineroConvertir);
                    conversionDinero.setOptions(optionsMoneda);
                    conversionDinero.getOption(seleccionMoneda);

                    // 0 -> yes, 1 -> no, 2 -> cancelar
                    int optionContinue = JOptionPane.showConfirmDialog(
                            null, "Deseas continuar?",
                            "Selecciona una opcion", JOptionPane.YES_NO_CANCEL_OPTION,
                            JOptionPane.INFORMATION_MESSAGE
                    );

                    conversionDinero.terminar(optionContinue);
                } else {
                    JOptionPane.showMessageDialog(null, "Valor no valido");
                }

            } else if (Objects.equals(seleccionConversion, options[1])){
                String preguntaTempConv = JOptionPane.showInputDialog(
                        "Ingrese el valor de la temperatura que desea convertir:"
                );

                if (preguntaTempConv == null) {
                    JOptionPane.showMessageDialog(null, "Programa terminado");
                    break;
                }

                if (isNumeric(preguntaTempConv)) {
                    double temperaturaConvertir = Double.parseDouble(preguntaTempConv);
                    String[] optionsTemp = {
                            "De Celsius a Grados Fahrenheit", "De Celsius a Kelvin",
                            "De Grados Fahrenheit a Celsius", "De Kelvin a Celsius",
                            "De Grados Fahrenheit a Kelvin", "De Kelvin a Grados Fahrenheit"
                    };
                    String seleccionConv = (String)JOptionPane.showInputDialog(null, "Elige la conversion que desea realizar",
                            "Temperatura", JOptionPane.QUESTION_MESSAGE, null, optionsTemp, optionsTemp[0]);

                    conversionTemperatura.setNumeroConvertir(temperaturaConvertir);
                    conversionTemperatura.setOptions(optionsTemp);
                    conversionTemperatura.getOption(seleccionConv);

                    // 0 -> yes, 1 -> no, 2 -> cancelar
                    int optionContinue = JOptionPane.showConfirmDialog(
                            null, "Deseas continuar?",
                            "Selecciona una opcion", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE
                    );
                    conversionDinero.terminar(optionContinue);
                } else {
                    JOptionPane.showMessageDialog(null, "Valor no valido");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Programa terminado");
                break;
            }
        }

    }
}