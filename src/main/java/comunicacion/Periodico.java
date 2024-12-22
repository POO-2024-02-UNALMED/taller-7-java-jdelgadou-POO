package comunicacion;

public class Periodico extends Escrito{
    private String fecha;
    private String primicia;
    private String interpretacion;
    public Periodico(String origen, String titulo, String autor, int paginas, String fe,String pri,String inter){
        super(origen, titulo, autor, paginas);
        this.fecha=fe;
        this.primicia=pri;
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
    public String getFecha() {
        return fecha;
    }
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    public String getPrimicia() {
        return primicia;
    }
    public void setPrimicia(String primicia) {
        this.primicia = primicia;
    }
    public String getInterpretacion() {
        return interpretacion;
    }
    public void setInterpretacion(String interpretacion) {
        this.interpretacion = interpretacion;
    }
    public int palabrasTotales(int palabrasPagina){
        return getPaginas()*palabrasPagina*10;
    }
    public String interpretacion(){
        return interpretacion;
    }
    @Override
    public String toString() {
        return super.resumen()+ "\n"+
        fecha+ "\n"+
        primicia;
    }
}
