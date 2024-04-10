package ar.edu.unju.fi.ejercicio10.model;

public class Pizza {
    private int diametro;
    private double precio;
    private double area;
    private boolean ingredientesEspeciales;
    private final int adicional_ingredientes_20 = 500;
    private final int adicional_ingredientes_30 = 750;
    private final int adicional_ingredientes_40 = 1000;

    public Pizza() {

    }

    public int getDiametro() {
        return diametro;
    }

    public void setDiametro(int diametro) {
        this.diametro = diametro;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public boolean isIngredientesEspeciales() {
        return ingredientesEspeciales;
    }

    public void setIngredientesEspeciales(boolean ingredientesEspeciales) {
        this.ingredientesEspeciales = ingredientesEspeciales;
    }

    public int getAdicional_ingredientes_20() {
        return adicional_ingredientes_20;
    }

    public int getAdicional_ingredientes_30() {
        return adicional_ingredientes_30;
    }

    public int getAdicional_ingredientes_40() {
        return adicional_ingredientes_40;
}

    public void calcularPrecio() {
        if (diametro == 20) {
            precio = 4500;
            if (ingredientesEspeciales) {
                precio += adicional_ingredientes_20;
            }
        } else if (diametro == 30) {
            precio = 4800;
            if (ingredientesEspeciales) {
                precio += adicional_ingredientes_30;
            }
        } else if (diametro == 40) {
            precio = 5500;
            if (ingredientesEspeciales) {
                precio += adicional_ingredientes_40;
            }
        }
    }

    public void calcularArea() {
        double radio = diametro / 2.0;
        area = Math.PI * Math.pow(radio, 2);
    }
}

