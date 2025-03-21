package org.gerdoc.historial;

import org.gerdoc.figura.Figura;

import java.util.ArrayList;
import java.util.List;

public class Historia implements Historiales
{
    private static Historia historia;
    private List<Figura> list;

    private Historia()
    {
    }

    public static Historia getInstance( )
    {
        if( historia == null )
        {
            historia = new Historia( );
        }
        return historia;
    }

    @Override
    public void imprimir()
    {
        if( list == null || list.isEmpty( ) )
        {
            System.out.println( "lista vacia");
            return;
        }
        list.forEach( f -> {
            System.out.println( "el perimetro es:" + f.perimetro( ) );
            System.out.println( "el area es:" + f.area( ) );
        });
    }

    @Override
    public void addFigura(Object figura)
    {
        if( list == null)
        {
            list = new ArrayList<>( );
        }
        list.add((Figura) figura);
    }
}
