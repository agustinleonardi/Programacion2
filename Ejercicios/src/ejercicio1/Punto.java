package ejercicio1;

public class Punto {
    private Long X;
    private Long Y;

    public Long getX() {
        return X;
    }

    public void setX(Long x) {
        X = x;
    }

    public Long getY() {
        return Y;
    }

    public void setY(Long y) {
        Y = y;
    }
    public Long distancia(Long num1, Long num2){
        this.X=num1;
        this.Y=num2;
        if (X>=Y){
            return X-Y;
        }else{
            return Y-X;
        }
    }
}
