import javax.swing.*;
import java.util.Objects;

public class ConversionTemperatura extends ConversionDinero {
    public static String formatter(double value) {
        return String.format("%.2f", value);
    }
    @Override
    public void getOption(String option) {
        if (Objects.equals(super.options[0], option)) {
            String totalGF = super.getNumeroConvertir() + " grados celsius son " +
                    formatter(((super.getNumeroConvertir() * 1.8000) + 32.00)) + " grados Fahrenheit";

            JOptionPane.showMessageDialog(null, totalGF);
        } else if (Objects.equals(super.options[1], option)) {
            String totalK = super.getNumeroConvertir() + " grados celsius son " +
                    formatter((super.getNumeroConvertir() + 273.15)) + " kelvin";

            JOptionPane.showMessageDialog(null, totalK);
        } else if(Objects.equals(super.options[2], option)) {
            String totalFAC = super.getNumeroConvertir() + " grados fahrenheit son " +
                    formatter(((super.getNumeroConvertir() - 32) / 1.8)) + " grados celsius";

            JOptionPane.showMessageDialog(null, totalFAC);
        } else if (Objects.equals(super.options[3], option)) {
            String totalKAC = super.getNumeroConvertir() + " kelvin son " +
                    formatter((super.getNumeroConvertir() - 273)) + " grados celsius";

            JOptionPane.showMessageDialog(null, totalKAC);
        } else if (Objects.equals(super.options[4], option)) {
            String totalFAK = super.getNumeroConvertir() + " grados fahrenheit son " +
                    formatter(((super.getNumeroConvertir() - 32) / 1.8 + 273.15)) + " kelvin";

            JOptionPane.showMessageDialog(null, totalFAK);
        } else if (Objects.equals(super.options[5], option)) {
            String totalKAF = super.getNumeroConvertir() + " kelvin son " +
                    formatter((1.8 * (super.getNumeroConvertir() - 273) + 32)) + " grados fahrenheit";

            JOptionPane.showMessageDialog(null, totalKAF);
        }
    }
}
