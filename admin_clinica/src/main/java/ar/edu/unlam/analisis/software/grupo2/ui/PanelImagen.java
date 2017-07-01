package ar.edu.unlam.analisis.software.grupo2.ui;

import java.awt.Dimension;
import java.awt.Graphics;
import java.io.IOException;

import javax.swing.ImageIcon;

import org.springframework.core.io.ClassPathResource;

public class PanelImagen extends javax.swing.JPanel {
	private String cadena;

	
/**
 * Con el path relativo al resources seteo la imagen al panel
 * @param path
 */	
public PanelImagen(){
	this("/img/Hospital_Laurel.jpg");
	this.setSize(720,1330);
}
	
/**
 * Con el path relativo al resources seteo la imagen al panel
 * @param path
 */
public PanelImagen(String imagePath){
	this.setSize(720,1330);
	this.cadena = imagePath;
}
@Override
public void paintComponent (Graphics g){
	
	try {
		System.out.println(new ClassPathResource(cadena).getFile().getAbsolutePath().toString());
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	Dimension tamanio = getSize();
	ImageIcon imagenFondo = new ImageIcon(getClass().getResource(cadena));
	
	g.drawImage(imagenFondo.getImage(),0,0,tamanio.width, tamanio.height, null);
	setOpaque(false);
	super.paintComponent(g);
}
}