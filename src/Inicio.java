import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author Darwin Garcia
 */
public class Inicio extends JFrame{
    private JLabel labelUsuario, labelClave, mensajeBienvenida;
    private JTextField textUsuario;
    private JPasswordField textClave;
    private JButton botonInicio;
    public static void main(String[]args){
        new Inicio();      
    }
    public Inicio(){
        super("Tienda de Licores. Inicio de Sesion");
        getContentPane().setLayout(null);
        getContentPane().setBackground(Color.black);
        labelUsuario = new JLabel("Usuario");
        labelUsuario.setForeground(Color.white);
        labelUsuario.setBounds(20, 50, 150, 30);
        getContentPane().add(labelUsuario);
        textUsuario=new JTextField(21);
        textUsuario.setBounds(80, 50, 200, 30);
        getContentPane().add(textUsuario);
        textClave=new JPasswordField(21);
        textClave.setBounds(80, 100, 200, 30);
        getContentPane().add(textClave);
        labelClave = new JLabel("Clave");
        labelClave.setForeground(Color.red);
        labelClave.setBounds(20, 100, 150, 30);
        getContentPane().add(labelClave);
        mensajeBienvenida=new JLabel("Bienvenidos al sistema de Licores Mis Amigos!!");
        mensajeBienvenida.setForeground(Color.green);
        mensajeBienvenida.setBounds(20, 140, 300, 40);
        getContentPane().add(mensajeBienvenida);
        //Boton para iniciar
        botonInicio = new JButton("Inicio");
        botonInicio.setBounds(100, 180, 150, 30);
        botonInicio.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nombre=textUsuario.getText();
                String clave=textClave.getText();
                if(nombre.equals("sena") && clave.equals("sena1234")){
                    JOptionPane.showMessageDialog(null, "Bienvenido "+nombre);
                    new MenuPri();
                    dispose();
                }
                else{
                    if(nombre.equals("") || clave.equalsIgnoreCase("")){
                        JOptionPane.showMessageDialog(null, "Los campos no pueden estar vacios");
                    }
                    else{
                        JOptionPane.showMessageDialog(null, "Usuario y/o contraseña incorrecta: "+nombre);
                    }                    
                }
            }
        });
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e){
                System.exit(0);
            }
        });
        getContentPane().add(botonInicio);
        
        
        setSize(480,270);
        setVisible(true);
    }    
}
