package controlador;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.HashSet;
import java.util.Set;
import modelo.Visitas;
import vista.frmVisitas;

//3- Heredar de la clase que detecta las acciones
public class ctrlVisitas implements MouseListener, KeyListener{
    
    
    //1- Mandar a llamar a las otras capas (modelo y vista)
    private Visitas modelo;
    private frmVisitas vista;
   
    //2- Crear el constructor
    public ctrlVisitas(Visitas modelo, frmVisitas vista){
        this.modelo = modelo;
        this.vista = vista;

        vista.btnAgregar.addMouseListener(this);       
        modelo.Mostrar(vista.jtbPacientes);
        vista.btnEliminar.addMouseListener(this);
        vista.jtbPacientes.addMouseListener(this);
        vista.btnActualizar.addMouseListener(this);
        vista.btnLimpiar.addMouseListener(this);
        vista.txtBuscar.addKeyListener(this);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if(e.getSource() == vista.btnAgregar){
            modelo.setNombre(vista.txtNombre.getText());
            modelo.setEdad(Integer.parseInt(vista.txtEdad.getText()));
            modelo.setEspecialidad(vista.txtEspecialidad.getText());
            
            modelo.Guardar();
            modelo.Mostrar(vista.jtbPacientes);
        }
        
        
        if(e.getSource() == vista.btnEliminar){
        modelo.Eliminar(vista.jtbPacientes);
        modelo.Mostrar(vista.jtbPacientes);
       
        }
        
        if(e.getSource() == vista.jtbPacientes){
            modelo.cargarDatosTabla(vista);
        }
        
        if(e.getSource() == vista.btnActualizar){
            modelo.setNombre(vista.txtNombre.getText());
            modelo.setEdad(Integer.parseInt(vista.txtEdad.getText()));
            modelo.setEspecialidad(vista.txtEspecialidad.getText());
            modelo.Actualizar(vista.jtbPacientes);
            modelo.Mostrar(vista.jtbPacientes);
        }
        
        if(e.getSource() == vista.btnLimpiar){
            modelo.Limpiar(vista);
}
        }

    @Override
    public void mousePressed(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void mouseExited(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void keyTyped(KeyEvent e) {
        if(e.getSource() == vista.txtBuscar){
        modelo.Buscar(vista.jtbPacientes, vista.txtBuscar);
        }
    }

    @Override
    public void keyPressed(KeyEvent e) {
       
    }

    @Override
    public void keyReleased(KeyEvent e) {
        
    }
        
    }

   


    
    

