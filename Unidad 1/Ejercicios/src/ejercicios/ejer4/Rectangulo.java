package ejercicios.ejer4;

public class Rectangulo {
    private Long Alto;
    private Long Ancho;
    private Long Area;
    private Long Perimetro;

    public Rectangulo(Long alto, Long ancho) {
        Alto = alto;
        Ancho = ancho;
        Area =this.Alto*this.Ancho;
        Perimetro=(this.Alto*2)+(this.Ancho*2);
    }

    public Long calcularArea(){
        this.Area=this.Alto*this.Ancho;
        return Area;
    }
    public Long calcularPerimetro(){
        this.Perimetro=(this.Alto*2)+(this.Ancho*2);
        return Perimetro;
    }
}
