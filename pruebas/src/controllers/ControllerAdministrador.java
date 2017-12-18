
package controllers;

import views.*;
import models.*;


public final class ControllerAdministrador {
    
    private final ModelAdministrador model_admnistrador;
    private final ViewAdministrador view_administrador;
    private final ViewRegistroCargo view_registro_cargo;
    private final ViewRegistroEmpleados view_registro_empleados;
    private final ViewRegistroProductos view_registro_productos;
    
    public ControllerAdministrador(Object[] models, Object[] views){
        this.model_admnistrador = (ModelAdministrador) models[1];
        this.view_administrador = (ViewAdministrador)views[1];
        this.view_registro_cargo = (ViewRegistroCargo) views[4];
        this.view_registro_empleados = (ViewRegistroEmpleados) views[5];
        this.view_registro_productos = (ViewRegistroProductos) views[6];
        initView();
    }
    
    public void initView(){
        view_administrador.setTitle("Administrador");
        view_administrador.jmi_registro_productos.addActionListener(e -> jmi_productosMouseClicked());
        view_administrador.jmi_registro_empleados.addActionListener(e -> jmi_empleadosMouseClicked());
        view_administrador.jmi_registro_cargo.addActionListener(e -> jmi_cargoMouseClicked());
        view_administrador.setLocationRelativeTo(null);
        view_administrador.setVisible(true);

    } 
    
    public void jmi_productosMouseClicked(){
        view_administrador.setContentPane(view_registro_productos);
        view_administrador.revalidate();
        view_administrador.repaint();
    }
    
    public void jmi_cargoMouseClicked(){
        view_administrador.setContentPane(view_registro_cargo);
        view_administrador.revalidate();
        view_administrador.repaint();
    }
    
    public void jmi_empleadosMouseClicked(){
        view_administrador.setContentPane(view_registro_empleados);
        view_administrador.revalidate();
        view_administrador.repaint();
    }
    
}
