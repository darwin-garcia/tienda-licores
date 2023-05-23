
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Darwin Garcia
 */
public class MenuPri extends JFrame{
    private JLabel titulo, salida, creditos;
    private JButton Registrar, Modificar, Listar;
    String buscar;
    public MenuPri() {
        super("Tienda de Licores Mis Amigos");
        getContentPane().setLayout(null);
        
        titulo= new JLabel("Licores Mis Amigos");
        titulo.setForeground(Color.green);
        titulo.setBounds(20, 20, 200, 30);
        getContentPane().add(titulo);
        
        Registrar=new JButton("Registrar Producto");
        Registrar.setBounds(120, 120, 360, 50);
        Registrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Registro();
                dispose();
            }
        });
        getContentPane().add(Registrar);
        
        Modificar=new JButton("Modificar Producto");
        Modificar.setBounds(120, 180, 360, 50);
        Modificar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                buscar=JOptionPane.showInputDialog("Digite el nombre del producto a buscar:");
                if(buscar.equals("0")){
                    new Modificar();
                    dispose();
                }else{
                    JOptionPane.showMessageDialog(null, "No se ha encontrado el producto.");
                }
                
            }
        });
        getContentPane().add(Modificar);
        
        Listar=new JButton("Listar Productos");
        Listar.setBounds(120, 240, 360, 50);
        Listar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Lista();
                dispose();
            }
        });
        getContentPane().add(Listar);
        
        creditos= new JLabel("Creado por Darwin Garcia ADSI 1694493");
        creditos.setForeground(Color.blue);
        creditos.setBounds(20, 400, 480, 30);
        getContentPane().add(creditos);
        
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e){
                System.exit(0);
            }
        });
        setVisible(true);
        setSize(640,480);
    }   
}
