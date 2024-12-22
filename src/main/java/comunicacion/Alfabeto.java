package comunicacion;

public class Alfabeto extends Pictograma{ 
    private String[] letras;
    private String interpretacion;
    public Alfabeto(String origen, String[] letras,String inter){
        super(origen);
        this.letras=letras;
        this.interpretacion=inter;
    }
    @Override
    public String getOrigen() {
        return super.getOrigen();
    }
    @Override
    public void setOrigen(String origen) {
        super.setOrigen(origen);
    }
    public String getInterpretacion() {
        return interpretacion;
    }
    public void setInterpretacion(String interpretacion) {
        this.interpretacion = interpretacion;
    }
    public String[] getLetras() {
        return letras;
    }
    public void setLetras(String[] letras) {
        this.letras = letras;
    }
    public int cantidadLetras(){
        return letras.length;
    }
    public String interpretacion(){
        return interpretacion;
    } 
    public String toString(){
        String r="";
        for(int i=0;i<letras.length;i++){
            if (i==letras.length-1){
                r+=letras[i];
            }
            else{
                r+=letras[i]+" ,";
            }
        }
        return r;
    }
}
