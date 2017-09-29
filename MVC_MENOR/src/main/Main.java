package main;

import models.Model_Menor;
import views.View_Menor;
import controllers.Controller_Menor;
/**
 *
 * @author Vicente Arteaga
 */
public class Main {
    public static void main (String bevi[]){
    Model_Menor model_menor = new Model_Menor();
    View_Menor view_menor = new View_Menor();
    Controller_Menor controller_menor = new Controller_Menor(model_menor,view_menor);
}
}

