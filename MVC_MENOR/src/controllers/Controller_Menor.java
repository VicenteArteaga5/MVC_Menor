package controllers;
import models.Model_Menor;
import views.View_Menor;

public class Controller_Menor {
    Model_Menor model_menor;
    View_Menor view_menor;
   
public Controller_Menor(Model_Menor model_menor,View_Menor view_menor){ //view_mayor****
this.model_menor = model_menor;
this.view_menor = view_menor;
this.view_menor.jbtn_calcular.addActionListener(e->jbtn_calcular_click());
this.view_menor.jbtn_limpiar.addActionListener(e->jbtn_limpiar_click());
InitView();
}



public void jbtn_limpiar_click(){
view_menor.jtf_numero1.setText("");
view_menor.jtf_numero2.setText("");
view_menor.jtf_numero3.setText("");
view_menor.jtf_menor.setText("");
}
        
        
public void InitView(){
    view_menor.jtf_numero1.setText(String.valueOf(model_menor.getN1()));
    view_menor.jtf_numero2.setText(String.valueOf(model_menor.getN2()));
    view_menor.jtf_numero3.setText(String.valueOf(model_menor.getN3()));
    view_menor.jtf_menor.setText(String.valueOf(model_menor.getM()));
    view_menor.setVisible(true);
 
    
}
public void jbtn_calcular_click(){
    model_menor.setN1(Integer.parseInt(view_menor.jtf_numero1.getText()));
    model_menor.setN2(Integer.parseInt(view_menor.jtf_numero2.getText()));
    model_menor.setN3(Integer.parseInt(view_menor.jtf_numero3.getText()));
    model_menor.menor();
    view_menor.jtf_menor.setText(String.valueOf(model_menor.getM()));
}

}