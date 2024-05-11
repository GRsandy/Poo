
package tema_1_2;
//Sandy 
public class PruebaFactura {

  public static void main(String[] args) {

    Factura factura = new Factura("P1234", "Martillo", 2, 15.99);

    imprimirTablaFactura(factura);

    factura.setCantidad(5);
    factura.setPrecioPorArticulo(12.50);

    System.out.println("\n**Informacion actualizada:**");

    imprimirTablaFactura(factura);
  }

  private static void imprimirTablaFactura(Factura factura) {
 
    System.out.println("+-----------+--------------+---------+----------------+------------+");
    System.out.println("| Numero de | Descripcion | Cantidad | Precio por    | Monto total |");
    System.out.println("| pieza      |              |         | articulo       |            |");
    System.out.println("+-----------+--------------+---------+----------------+------------+");

    System.out.printf("| %10s | %15s | %8d | %14.2f | %12.2f |\n", factura.getNumeroPieza(), factura.getDescripcionPieza(), factura.getCantidad(), factura.getPrecioPorArticulo(), factura.obtenerMontoFactura());
    System.out.println("+-----------+--------------+---------+----------------+------------+");
  }

}