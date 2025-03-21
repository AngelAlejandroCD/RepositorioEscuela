package org.gerdoc.model.figura;

public enum FiguraEnum
{
    CUADRADO(1),
    EQUILATERO(2),
    ISOSCELES(3),
    ESCALENO(4),
    SALIR(5),
    OPCION_ERRONEA( 6 );
    private Integer tipo;

    FiguraEnum(Integer tipo)
    {
        this.tipo = tipo;
    }

    public Integer getTipo()
    {
        return tipo;
    }

    public static FiguraEnum getFiguraEnumById( Integer id )
    {
        switch( id )
        {
            case 1:
                return CUADRADO;
            case 2:
                return EQUILATERO;
            case 3:
                return ISOSCELES;
            case 4:
                return ESCALENO;
            case 5:
                return SALIR;
            case 6:
            default:
                return OPCION_ERRONEA;

        }
    }
}
