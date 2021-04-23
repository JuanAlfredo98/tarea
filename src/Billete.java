import java.util.Date;
import java.util.List;

public class Billete {
    //Atributos
    int idBillete;
    Date fechaEmision;
    double precioTotal;
    Cliente cliente;
    Ciudad origen;
    Ciudad destino;
    Categoria categoria;
    List <Vuelo> vuelos;

    //Metodo constructor por defecto
    public Billete(){

    }
    /*//Sobecarga de constructores
    public Billete(List <Vuelo>){
        this.vuelos = vuelos;
    }
    //Sobecarga de constructores
    public Billete(int idBillete,Date fechaEmision,double precioTotal,Cliente cliente,Ciudad origen,Ciudad destino,Categoria categoria,List<Vuelo> vuelos){
        this.idBillete = idBillete;
        this.fechaEmision = fechaEmision;
        this.precioTotal = precioTotal;
        this.cliente = cliente;
        this.Ciudad  = origen;
        this.Ciudad = destino;
        this.categoria = categoria;
        this.vuelos = vuelos;
    }*/

}
