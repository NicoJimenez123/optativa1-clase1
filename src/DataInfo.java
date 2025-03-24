public class DataInfo {
    private final Integer numeroHoja;
    private final String tipoObjeto;
    private final Integer identificadorTramo;
    private final String tipoCamino;
    private final Integer longitud;

    public DataInfo(Integer numeroHoja, String tipoObjeto, Integer identificadorTramo, String tipoCamino, Integer longitud) {
        this.numeroHoja = numeroHoja;
        this.tipoObjeto = tipoObjeto;
        this.identificadorTramo = identificadorTramo;
        this.tipoCamino = tipoCamino;
        this.longitud = longitud;
    }

    public String imprimir() {
        return String.format("Número: %s, Tipo de Objeto: %s, Identificador Tramo: %s, Tipo de Camino: %s, Longitud: %s", numeroHoja, tipoObjeto, identificadorTramo, tipoCamino, longitud);
    }
}