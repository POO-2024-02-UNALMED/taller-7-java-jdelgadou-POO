package comunicacion;

public class Fabula extends Escrito{
    private String ensenanzas;
    private String interpretacion;
    public Fabula(String origen, String titulo, String autor, int paginas, String en,String inter){
        super(origen, titulo, autor, paginas);
        this.ensenanzas=en;
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
    public String getEnsenanza() {
        return ensenanzas;
    }
    public void setEnsenanza(String ensenanza) {
        this.ensenanzas = ensenanza;
    }
    public String getInterpretacion() {
        return interpretacion;
    }
    public void setInterpretacion(String interpretacion) {
        this.interpretacion = interpretacion;
    }
    public int palabrasTotales(int palabrasPagina){
        return getPaginas()*palabrasPagina;
    }
    public String interpretacion(){
        return interpretacion;
    }
    @Override
    public String toString() {
        return super.resumen()+ "\n"+
        ensenanzas+ "\n"+
        interpretacion;
    }
}
