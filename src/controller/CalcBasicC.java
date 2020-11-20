package controller;

import view.CalcBasicV;

public class CalcBasicC {
    
    public boolean esPrimo(String numero) {
        if (Double.parseDouble(numero) == 0 || Double.parseDouble(numero) == 1 || Double.parseDouble(numero) == 4) {
            return false;
        }
        
        for (int x = 2; x < Double.parseDouble(numero) / 2; x++) {
            if (Double.parseDouble(numero) % x == 0) {
                return false;
            }
        }
        
        return true;
    }
    
    public boolean esPerfecto(String numero) {
        double suma = 0.0;
        boolean resultado;
        
        for (int i = 1; i < Double.parseDouble(numero); i++) {
            if (Double.parseDouble(numero) % i == 0) {//si el resultado da 0 entonces se suma
                suma = suma + i;
            }
        }
        
        resultado = suma == Double.parseDouble(numero);//Si el numero es igual a suma el número es perfecto

        return resultado;
    }
    
    public boolean esCapicua(String numero) {
        int cifra;
        int inverso = 0;
        int n;
        
        n = Integer.valueOf(numero);
        while (n != 0) {
            cifra = (int) (n % 10);
            inverso = (int) (inverso * 10 + cifra);
            n = n / 10;
        }
        
        return Double.valueOf(numero) == inverso;
    }
    
    public int fibonacci(int n) {
        if (n > 1) {
            return fibonacci(n - 1) + fibonacci(n - 2);  //función recursiva
        } else if (n == 1) {  // caso base
            return 1;
        } else if (n == 0) {  // caso base
            return 0;
        } else {
            return -1;
        }
    }
    
    public int factorial(int numero) {
        if (numero == 0) {
            return 1;
        } else {
            return numero * factorial(numero - 1);//Aqui realiza la suma de los numeros factoriales 3! = 3(1)(2)(3)
        }
    }

    /*Imprimimos los numeros en la pantalla1*/
    public void getText(String number) {
        CalcBasicV.txtPantalla1.setText(CalcBasicV.txtPantalla1.getText() + number);
    }

    /*Agregar un punto decimal*/
    public void btnDecimal() {
        /*Obtenemos los datos */
        String number = CalcBasicV.txtPantalla1.getText();

        /*Si no hay un numero entonces imprime "0."*/
        if (number.length() <= 0) {
            CalcBasicV.txtPantalla1.setText("0.");
        } else {
            /*Si hay numeros entonces solo imprime "."*/
            if (!existeUnPunto(number)) {
                CalcBasicV.txtPantalla1.setText(CalcBasicV.txtPantalla1.getText() + ".");
            }
        }
    }
    
    public String calculos(String memoria1, String memoria2, String signo) {
        Double result = 0.0;
        String resultado;
        
        switch (signo) {
            case "+":
                result = Double.parseDouble(memoria1) + Double.parseDouble(memoria2);
                break;
            case "-":
                result = Double.parseDouble(memoria1) - Double.parseDouble(memoria2);
                break;
            case "*":
                result = Double.parseDouble(memoria1) * Double.parseDouble(memoria2);
                break;
            case "/":
                result = Double.parseDouble(memoria1) / Double.parseDouble(memoria2);
                break;
            case "^":
                result = Math.pow(Double.parseDouble(memoria1), Double.parseDouble(memoria2));
                break;
            case "^2":
                result = Math.pow(Double.parseDouble(memoria1), Double.parseDouble(memoria2));
                break;
            case "%":
                result = (Double.parseDouble(memoria1) * Double.parseDouble(memoria2)) / 100;
                break;
            case "log10":
                result = Math.log10(Double.parseDouble(memoria1) + 1);
                break;
            
        }
        
        resultado = result.toString();
        return resultado;
    }


    /*Existe un punto*/
    private boolean existeUnPunto(String number) {
        /*Iniciamos nuestro metodo boolean como falso*/
        boolean result = false;

        /*Haremos un recorrido de los numero que obtenemos*/
        for (int i = 0; i < number.length(); i++) {
            /*Aqui buscaremos si hay un punto*/
            //Que haga un recorrido de nuestros numeros hasta encontrar un punto
            if (number.substring(i, i + 1).equals(".")) {
                /*El resultado es verdadero y se finaliza la busqueda*/
                result = true;
                break;
            }
        }

        /*Retorna el resulta si es verdadero o falso*/
        return result;
    }
    
}
