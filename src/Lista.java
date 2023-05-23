
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javafx.scene.layout.Border;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dangmoz
 */
public class Lista extends JFrame {
    private JLabel creditos;
    private JTable tablaProductos;
    private JScrollPane scrollTable;
    
    public Lista() {
        super("Registro de nuevos licores");
        getContentPane().setLayout(null);
        tablaProductos = new JTable();
        tablaProductos.setBounds(10, 30, 600, 400);
        getContentPane().add(tablaProductos);
        
        scrollTable= new JScrollPane(tablaProductos);
        getContentPane().add(scrollTable, BorderLayout.CENTER);
       
        
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
        setSize(640,480);
    }
    
    
}
