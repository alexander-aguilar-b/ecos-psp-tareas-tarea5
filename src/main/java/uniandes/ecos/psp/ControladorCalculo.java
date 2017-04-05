/******************************************************************/
/* Autor: Edgar Alexander Aguilar Bolaños
/* Fecha de Creación: 04/04/2017
/* Propósito: Controlador encargado de orquestar  el flujo del programa.
/* Notas especiales:
/******************************************************************/
package uniandes.ecos.psp;

/**
 * Clase que hace las veces de Controlador dentro de la aplicación
 * Created by edgaguil on 4/04/2017.
 */
public class ControladorCalculo
{
    /**
     * Metodo encargado manejar la solicitud de calculo del valor integral
     * @param testPSP5 Test solicitado
     * @return Resultado de los calculos
     */
    public ModeloCalculoIntegral calcularValorIntegral(TestPSP5 testPSP5)
    {
        CalculoIntegral calculoIntegral = new CalculoIntegral();
        int numeroSegmentosBase = 2;
        double valorErrorAceptable = 0.00001;

        ModeloCalculoIntegral modeloCalculoIntegral;

        switch (testPSP5)
        {
            case Test1:
                modeloCalculoIntegral = new ModeloCalculoIntegral(1.1, 9,  numeroSegmentosBase, valorErrorAceptable, 0.35006 );
                break;

            case Test2:
                modeloCalculoIntegral = new ModeloCalculoIntegral(1.1812, 10,  numeroSegmentosBase, valorErrorAceptable, 0.36757 );
                break;

            case Test3:
                modeloCalculoIntegral = new ModeloCalculoIntegral(2.750, 30,  numeroSegmentosBase, valorErrorAceptable, 0.49500 );
                break;

                default:
                    modeloCalculoIntegral = null;

        }

        calculoIntegral.calcularValorIntegral(modeloCalculoIntegral);
        return modeloCalculoIntegral;
    }
}
