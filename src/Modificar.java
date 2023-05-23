
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dangmoz
 */
public class Modificar extends JFrame{
    private JLabel nombre, cantidad, precio, creditos;
    private JTextField cuadroNombre, cuadroCantidad, cuadroPrecio;
    private JButton guardar;
    public Modificar() {
       super("Registro de nuevos licores");
        getContentPane().setLayout(null);
        
        nombre= new JLabel("Digite el nombre del producto:");
        nombre.setBounds(20,80,200,30);
        getContentPane().add(nombre);
        
        cuadroNombre=new JTextField(25);
        cuadroNombre.setBounds(20,120,200,30);
        getContentPane().add(cuadroNombre);
        
        cantidad= new JLabel("Digite cantidades del producto:");
        cantidad.setBounds(20,160,200,30);
        getContentPane().add(cantidad);
        
        cuadroCantidad=new JTextField(25);
        cuadroCantidad.setBounds(20,200,200,30);
        getContentPane().add(cuadroCantidad);
        
        precio= new JLabel("Digite el precio $ del producto:");
        precio.setBounds(20,240,200,30);
        getContentPane().add(precio);
        
        cuadroPrecio=new JTextField(25);
        cuadroPrecio.setBounds(20,280,200,30);
        getContentPane().add(cuadroPrecio);
        
        guardar= new JButton("Registrar");
        guardar.setBounds(20,360,200,30);
        guardar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,"Producto Modificado.");
            }
        });
        getContentPane().add(guardar);
        
        creditos= new JLabel("Creado por Darwin Garcia ADSI 1694493");
        creditos.setForeground(Color.blue);
        creditos.setBounds(20, 400, 480, 30);
        getContentPane().add(creditos);
        
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e){
                new MenuPri();
                dispose();
            }
        });
        setVisible(true);
        setSize(300,480);
    }
    
    
}
