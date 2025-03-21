package org.gerdoc.org.gerdoc.inicio;

import org.gerdoc.historial.Historia;
import org.gerdoc.historial.Historiales;
import org.gerdoc.figura.TipoEjecutable;
import org.gerdoc.util.ReadUtil;
import org.gerdoc.vista.Ejecutable;
import org.gerdoc.vista.Menu;

/**
 *
 */
public class Inicio {

    /**
     * Default constructor
     */
    public Inicio() {
    }

    /**
     * @param args
     */
    public static void main(String[] args)
    {
        boolean flag = true;
        int opcion = 0;
        TipoEjecutable tipoEjecutable = null;
        Historiales historiales = null;
        Ejecutable ejecutable = null;
        historiales = Historia.getInstance( );

        while( flag )
        {
            Menu.principal2( );
            Menu.seleccionaOpcion( );
            opcion = ReadUtil.readInt( );
            tipoEjecutable = TipoEjecutable.getTipoEjecutableById( opcion );
            if( TipoEjecutable.SALIR.equals( tipoEjecutable ) )
            {
                flag = false;
            }
            if( TipoEjecutable.HISTORIAL.equals( tipoEjecutable ) )
            {
                historiales.imprimir( );
            }
            if( TipoEjecutable.OPCION_ERRONEA.equals( tipoEjecutable ) )
            {
                Menu.opcionInvalida( );
            }
            if( tipoEjecutable.getEjecutable( ) != null )
            {
                ejecutable = tipoEjecutable.getEjecutable( );
                ejecutable.addHistoriales( historiales );
                ejecutable.run( );
            }
        }


    }

}