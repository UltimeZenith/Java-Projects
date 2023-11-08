public class TestAbstractas {

    public static void main(String[] args) {
        FiguraGeometrica figura = new Rectangle("Rectangulo1");
        
        System.out.println(figura);
        figura.dibujar();
        
        figura = new Square("Cuadrado1");
        figura.dibujar();
    }
    
}
