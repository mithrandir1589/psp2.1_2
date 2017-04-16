import javax.swing.JOptionPane;
/**
 * Clase encargada de solicitar los datos de entrada al programa, y realizar el llamado de los métodos de la clase Calculos para 
 * mostrar el valor calculado de X en pantalla.
 * @author Miguel Angel Quintero P
 * Versión: 13/04/2017
 */
public class Interfaz {
	
	/**
	 * Metodo main, encargado de pedir los datos para el calculo de p
	 * @param args
	 */
	public static void main(String[] args) {//Declaracion metodo
		double cS = 0;
		double e = 0;
		double gL = 0;
		double xInicial = 0;
		double p = 0;
		
		String cantidadSegmentos = JOptionPane.showInputDialog("Ingrese cantidad de segmentos");
		if(cantidadSegmentos == null){
			System.exit(0);
		}else if (cantidadSegmentos.isEmpty()) {
			JOptionPane.showMessageDialog(null,"Debe ingresar un valor en el campo");
			System.exit(0);
		}
		
		String error = JOptionPane.showInputDialog("Ingrese tolerancia");
		if(error == null){
			System.exit(0);
		}else if (error.isEmpty()) {
			JOptionPane.showMessageDialog(null,"Debe ingresar un valor en el campo");
			System.exit(0);
		}
		
		String gradosLibertad = JOptionPane.showInputDialog("Ingrese grados de libertad");
		if(gradosLibertad == null){
			System.exit(0);
		}else if (gradosLibertad.isEmpty()) {
			JOptionPane.showMessageDialog(null,"Debe ingresar un valor en el campo");
			System.exit(0);
		}
		
		String xIni = JOptionPane.showInputDialog("Ingrese Xi");
		if(xIni == null){
			System.exit(0);
		}else if (xIni.isEmpty()) {
			JOptionPane.showMessageDialog(null,"Debe ingresar un valor en el campo");
			System.exit(0);
		}
		
		String pString = JOptionPane.showInputDialog("Ingrese p");
		if(pString == null){
			System.exit(0);
		}else if (pString.isEmpty()) {
			JOptionPane.showMessageDialog(null,"Debe ingresar un valor en el campo");
			System.exit(0);
		}
		
		try {
			cS = Double.parseDouble(cantidadSegmentos);
			e = Double.parseDouble(error);
			gL = Double.parseDouble(gradosLibertad);
			xInicial = Double.parseDouble(xIni);
			p = Double.parseDouble(pString);
		} catch (Exception ex) {
			JOptionPane.showMessageDialog(null, "Los valores ingresados deben ser numeros, no se aceptan letras");
			System.exit(0);
		}
		
		Calculos calculos = new Calculos(cS, e, gL, xInicial, p);
		System.out.println("El valor de X es: " + calculos.getX());
	}
	/**Fin metodo**/
	

}
