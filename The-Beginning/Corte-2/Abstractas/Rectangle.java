public class Rectangle extends FiguraGeometrica {
    
    public Rectangle(String tipoFigura){
        super(tipoFigura);
    }
    
    @Override
    public void dibujar(){
        System.out.println("Se dibuja un: " + this.getClass().getSimpleName());
    }
}
