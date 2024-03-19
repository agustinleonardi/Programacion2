package ejercicio1;

public class Punto {
    private double X;
    private double Y;

    public Punto(double x, double y) {
        X = x;
        Y = y;
    }

    public double getX() {
        return X;
    }

    public void setX(double x) {
        X = x;
    }

    public double getY() {
        return Y;
    }

    public void setY(double y) {
        Y = y;
    }
    public double calcularDistancia(Punto otro){
       double x = this.X - otro.X;
       double y = this.Y - otro.Y;
       return Math.sqrt(x * x + y * y );
    }
}
