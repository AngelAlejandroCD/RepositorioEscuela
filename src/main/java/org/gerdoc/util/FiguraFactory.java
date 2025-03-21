package org.gerdoc.util;

import org.gerdoc.figura.Cuadrado;
import org.gerdoc.figura.Equilatero;
import org.gerdoc.figura.FiguraEnum;
import org.leslydoc.model.figura.figura2.Escaleno;
import org.gerdoc.model.figura.figura2.Isosceles;

public class FiguraFactory
{

    public static Object getFiguraByFiguraEnum(FiguraEnum figuraEnum )
    {
        switch (figuraEnum)
        {
            case CUADRADO:
                return new Cuadrado( );
            case ESCALENO:
                return new Escaleno( );
            case ISOSCELES:
                return new Isosceles( );
            case EQUILATERO:
                return new Equilatero( );
            case OPCION_ERRONEA:
            case SALIR:
            default:
                return null;
        }
    }
}
