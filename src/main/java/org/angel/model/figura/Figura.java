package org.angel.model.figura;

import org.angel.vista.SolicitaDatos;

/**
 * 
 */
public abstract class Figura extends org.gerdoc.figura.Figura implements SolicitaDatos
{

    /**
     * Default constructor
     */


    public Figura()
    {
    }

    /**
     * @return
     */
    public abstract double area( );

    /**
     * @return
     */
    public abstract double perimetro();

    @Override
    public void leeDatos() {

    }
}