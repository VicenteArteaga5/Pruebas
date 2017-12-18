package main;

import models.*;
import views.*;
import controllers.*;

/**
 *
 * @author Vicente Arteaga
 */
public class Main {
    public static void main (String VAR[]){
        ModelAdministrador model_administrador = new ModelAdministrador();
        ModelRegistroCargo model_registro_cargo = new ModelRegistroCargo();
        ModelRegistroEmpleados model_registro_empleados = new ModelRegistroEmpleados();
        ModelRegistroProductos model_registro_productos = new ModelRegistroProductos();
        
    
        ViewAdministrador view_administrador = new ViewAdministrador();
        ViewRegistroCargo view_registro_cargo = new ViewRegistroCargo();
        ViewRegistroEmpleados view_registro_empleados = new ViewRegistroEmpleados();
        ViewRegistroProductos view_registro_productos = new ViewRegistroProductos();
        

        
        Object[] models = new Object[9];
        Object[] views = new Object[9];
        Object[] controller = new Object[9];
        
        models[1] = model_administrador;
        models[4] = model_registro_cargo;
        models[5] = model_registro_empleados;
        models[6] = model_registro_productos;
        

        
        views[1] = view_administrador;
        views[4] = view_registro_cargo;
        views[5] = view_registro_empleados;
        views[6] = view_registro_productos;

        
        ControllerAdministrador controller_administrador = new ControllerAdministrador(models, views);
        controller[1] = controller_administrador;
        
        ControllerRegistroCargo controller_registro_cargo = new ControllerRegistroCargo();
        controller[4] = controller_registro_cargo;
        
        ControllerRegistroEmpleados controller_registro_empleados = new ControllerRegistroEmpleados();
        controller[5] = controller_registro_empleados;
        
        ControllerRegistroProductos controller_registro_productos = new ControllerRegistroProductos();
        controller[6] = controller_registro_productos;
        }
}
