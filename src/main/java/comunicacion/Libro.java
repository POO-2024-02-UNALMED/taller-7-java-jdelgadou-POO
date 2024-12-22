package comunicacion;

public class Libro extends Escrito{
    private String co_autor;
    private String editorial;
    private String edicion;
    private String interpretacion;
    public Libro(String origen, String titulo, String autor, int paginas, String co,String edi,String edicion,String inter){
        super(origen, titulo, autor, paginas);
        this.co_autor=co;
        this.editorial=edi;
        this.edicion=edicion;
        this.interpretacion=inter;
    }
    @Override
    public String getOrigen() {
        // TODO Auto-generated method stub
        return super.getOrigen();
    }
    @Override
    public void setOrigen(String origen) {
        // TODO Auto-generated method stub
        super.setOrigen(origen);
    }
    @Override
    public String getTitulo() {
        // TODO Auto-generated method stub
        return super.getTitulo();
    }
    @Override
    public void setTitulo(String titulo) {
        // TODO Auto-generated method stub
        super.setTitulo(titulo);
    }
    @Override
    public String getAutor() {
        // TODO Auto-generated method stub
        return super.getAutor();
    }
    @Override
    public void setAutor(String autor) {
        // TODO Auto-generated method stub
        super.setAutor(autor);
    }
    @Override
    public int getPaginas() {
        // TODO Auto-generated method stub
        return super.getPaginas();
    }
    @Override
    public void setPaginas(int paginas) {
        // TODO Auto-generated method stub
        super.setPaginas(paginas);
    }
    public String getCo_autor() {
        return co_autor;
    }
    public void setCo_autor(String co_autor) {
        this.co_autor = co_autor;
    }
    public String getEditorial() {
        return editorial;
    }
    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }
    public String getEdicion() {
        return edicion;
    }
    public void setEdicion(String edicion) {
        this.edicion = edicion;
    }
    public String getInterpretacion() {
        return interpretacion;
    }
    public void setInterpretacion(String interpretacion) {
        this.interpretacion = interpretacion;
    }
    public int palabrasTotales(int palabrasPagina){
        return getPaginas()*palabrasPagina*2;
    }
    public String interpretacion(){
        return interpretacion;
    }
    @Override
    public String toString() {
        return super.resumen()+ "\n"+
        co_autor+ "\n"+
        editorial+"\n"+
        edicion;
    }
}
