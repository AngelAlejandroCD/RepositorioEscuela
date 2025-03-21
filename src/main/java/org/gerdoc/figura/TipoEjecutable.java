package org.gerdoc.figura;

import org.gerdoc.vista.Consola;
import org.gerdoc.vista.Ejecutable;
import org.gerdoc.vista.Ventana;

public enum TipoEjecutable
{
    CONSOLA( 1, Consola.getInstance() ),
    VENTANA( 2, Ventana.getInstance() ),
    SALIR( 4, null ),
    OPCION_ERRONEA( 5, null ),
    HISTORIAL(3, null );
    private Integer id;
    private Ejecutable ejecutable;

    TipoEjecutable(Integer id, Ejecutable ejecutable)
    {
        this.id = id;
        this.ejecutable = ejecutable;
    }

    public Integer getId()
    {
        return id;
    }

    public static TipoEjecutable getTipoEjecutableById( int opcion )
    {
        switch( opcion )
        {
            case 1:
                return CONSOLA;
            case 2:
                return VENTANA;
            case 3:
                return HISTORIAL;
            case 4:
                return SALIR;
            default:
                return OPCION_ERRONEA;
        }
    }

    public Ejecutable getEjecutable()
    {
        return ejecutable;
    }
}
