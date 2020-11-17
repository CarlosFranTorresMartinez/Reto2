package controller;

import static view.CalculadoraV.txtPantalla;

public class CalculadoraBasicaC {

    public boolean existPoint(String number) {
        boolean result;
        result = false;

        for (int i = 0; i < number.length(); i++) {
            if (number.substring(i, i + 1).equals(".")) {
                result = true;
                break;
            }
        }
        return result;
    }

    public String calc(String memory1, String memory2, String sign) {
        Double result = 0.0;
        String reply;

        switch (sign) {
            case "-":
                result = Double.parseDouble(memory1) - Double.parseDouble(memory2);
                break;
            case "+":
                result = Double.parseDouble(memory1) + Double.parseDouble(memory2);
                break;
            case "*":
                result = Double.parseDouble(memory1) * Double.parseDouble(memory2);
                break;
            case "/":
                result = Double.parseDouble(memory1) / Double.parseDouble(memory2);
                break;
            case "√":
                result = Math.sqrt(Double.parseDouble(memory1));
                break;
            case "%":
                result = (Double.parseDouble(memory1) * Double.parseDouble(memory2)) / 100;
                break;
        }

        reply = result.toString();
        return reply;
    }

    public void getText(String number) {
        txtPantalla.setText(txtPantalla.getText() + number);
    }
}
