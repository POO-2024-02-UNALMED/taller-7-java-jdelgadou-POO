package comunicacion;

public class Tesis extends Escrito{
    private String idea;
    private String[] argumentos;
    private String conclusion;
    private String referencias;
    private String interpretacion;
    public Tesis(String origen, String titulo, String autor, int paginas, String ide,String[] arg,String con,String ref,String inter){
        super(origen, titulo, autor, paginas);
        this.idea=ide;
        this.argumentos=arg;
        this.conclusion=con;
        this.referencias=ref;
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
    public String[] getArgumentos() {
        return argumentos;
    }
    public void setArgumentos(String[] argumentos) {
        this.argumentos = argumentos;
    }
    public String getConclusion() {
        return conclusion;
    }
    public void setConclusion(String conclusion) {
        this.conclusion = conclusion;
    }
    public String getIdea() {
        return idea;
    }
    public void setIdea(String idea) {
        this.idea = idea;
    }
    public String getReferencias() {
        return referencias;
    }
    public void setReferencias(String referencias) {
        this.referencias = referencias;
    }
    public String getInterpretacion() {
        return interpretacion;
    }
    public void setInterpretacion(String interpretacion) {
        this.interpretacion = interpretacion;
    }
    public int palabrasTotales(int palabrasPagina){
        return getPaginas()*palabrasPagina*5;
    }
    public String interpretacion(){
        return interpretacion;
    }
    @Override
    public String toString() {
        return super.resumen()+ "\n"+
        idea+ "\n"+
        argumentos +"\n"+
        conclusion + "\n"+
        referencias +"\n"+
        interpretacion;
    }
}
