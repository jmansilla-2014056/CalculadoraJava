package calculadora3;
import calculadora3.Operar;
import java.awt.event.KeyEvent;
import java.io.File;
import java.lang.Math;
import java.util.StringTokenizer;
import java.math.BigDecimal;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.effect.InnerShadow;
import static javafx.scene.input.KeyCode.ENTER;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;


/**
 *
 * @author admin
 */
public class Calculadora3 extends Application {
public static int p=0, v=1;
public static String expresion2; 
public static Stage ventana; 
public static String expresion= " "; 
public static String anterior,siguiente; 
public static int ultimoparentesis,ultimoparentesis2, yanohayparentesis; 
public static String cadena, cambio1, combio2, cambio3, cambio4, cambio5, cambio6, cambio7, cambio8, cambio9, cambio10, cambio11, cambio12, cambio13, cambio14, cambio15; 
public static String evaluaexpresion, evaluaexpresion2, filtro, filtro2, filtro3, filtro4, filtro5, filtro6,cambio16, cambio17, cambio18, cambio19, cambio20, cambio21; ;
public static String newexpresion; 
public static int valor; 
public static int bandera=0; 
public static StringTokenizer st,st2; 
public static double resultado,resultado2; 
public static Label label1; 
public static TextField tex1;
public static KeyEvent tecl;
public static MenuBar menu;
public static Menu ver;
public static Menu edicion;
public static Menu ayuda;
public static Menu hiden;
public static FlowPane ventana2;
public static Button btn1; 
public static Button btn2; 
public static Button btn3; 
public static Button btn4; 
public static Button btn5; 
public static Button btn6; 
public static Button btn7; 
public static Button btn8; 
public static Button btn9; 
public static Button btn10; 
public static Button btn11; 
public static Button btn12; 
public static Button btn13; 
public static Button btn14; 
public static Button btn15; 
public static Button btn16; 
public static Button btn17; 
public static Button btn18; 
public static Button btn19; 
public static Button btn20; 
public static Button btn21; 
public static Button btn22; 
public static Button btn23;
public static Button btn24; 
public static Button btn25; 
public static Button btn26; 
public static Button btn27; 
public static Button btn28; 
public static Label btn6c; 
public static Button btn7c; 
public static Button btn8c; 
public static Button btn9c; 
public static Button btn10c; 
public static Button btn11c; 
public static Button btn12c; 
public static Button btn13c; 
public static Button btn14c; 
public static Button btn15c; 
public static Button btn16c; 
public static Button btn17c; 
public static Button btn18c; 
public static Button btn19c; 
public static Button btn20c; 
public static Button btn21c; 
public static Button btn22c; 
public static Button btn23c;
public static Button btn24c; 
public static Button btn25c; 
public static Button btn26c; 
public static Button btn27c; 
public static Button btn28c; 
public static Button btn30c; 
public static Button btn31c; 
public static HBox a;       
public static HBox bc;
public static HBox h;
public static HBox h1;
public static HBox h2;
public static HBox h3;
public static HBox h4;
public static HBox h5;
public static VBox h6;
public static HBox h7;
public static VBox b;
public static VBox b1;
public static VBox b2;
public static VBox b3;
public static VBox b4;
public static VBox b5;
public static VBox b6;
public static VBox b7;
public static HBox hh;
public static HBox h12;
public static HBox h22;
public static HBox h32;
public static HBox h42;
public static HBox h52;
public static VBox h62;
public static HBox h72;
public static VBox bb;
public static VBox b12;
public static VBox b22;
public static VBox b32;
public static VBox b42;
public static VBox b52;
public static VBox b62;
public static VBox b72;
public static RadioButton btn1c;
public static RadioButton btn2c;
public static RadioButton btn3c;
public static Scene scene2;

   static void Operacion() {
       Operar operar = new Operar();
       operar.resultado();
   }
    
    @Override
    public void start(Stage primaryStage) { 
        a = new HBox();
        bc = new HBox ();
        h = new HBox();
        h1 = new HBox();
        h2 = new HBox();
        h3 = new HBox();
        h4 = new HBox();
        h5 = new HBox();
        h6 = new VBox();
        h7 = new HBox();
        b = new VBox();
        b1 = new VBox();
        b2 = new VBox();
        b3 = new VBox();
        b4 = new VBox();
        b5 = new VBox();
        b7 = new VBox();
        hh = new HBox();
        h12 = new HBox();
        h22 = new HBox();
        h32 = new HBox();
        h42 = new HBox();
        h52 = new HBox();
        h62 = new VBox();
        h72 = new HBox();
        bb = new VBox();
        b12 = new VBox();
        b22 = new VBox();
        b32 = new VBox();
        b42 = new VBox();
        b52 = new VBox();
        b72 = new VBox();
    
            btn1 = new Button("MC");
              btn1.setPrefSize(38.5,25);
            btn2 = new Button("MR");
               btn2.setPrefSize(38.5,25);
            btn3 = new Button("MS");
               btn3.setPrefSize(38.5,25);
            btn4 = new Button("M+");
               btn4.setPrefSize(38.5,25);
            btn5 = new Button("M-");
              btn5.setPrefSize(38.5,25);
            btn6 = new Button("←");
               btn6.setPrefSize(38.5,25);
            btn7 = new Button("CE");
               btn7.setPrefSize(38.5,25);
            btn8 = new Button("C");
               btn8.setPrefSize(38.5,25);
            btn9 = new Button("±");
                btn9.setPrefSize(38.5,25);
            btn10 = new Button("√");
                btn10.setPrefSize(38.5,25);
            btn11 = new Button("7");
                btn11.setPrefSize(38.5,25);
            btn12 = new Button("8");
                btn12.setPrefSize(38.5,25);
            btn13 = new Button("9");
                btn13.setPrefSize(38.5,25);
            btn14 = new Button("/");
                btn14.setPrefSize(38.5,25);
            btn15 = new Button("%");
                btn15.setPrefSize(38.5,25);
            btn16 = new Button("4");
                btn16.setPrefSize(38.5,25);
            btn17 = new Button("5");
                btn17.setPrefSize(38.5,25);
            btn18 = new Button("6");
                btn18.setPrefSize(38.5,25);
            btn19 = new Button("*");
                btn19.setPrefSize(38.5,25);
            btn20 = new Button("1/x");
                btn20.setPrefSize(38.5,25);
            btn21 = new Button("1");
                btn21.setPrefSize(38.5,25);
            btn22 = new Button("2");
                btn22.setPrefSize(38.5,25);
            btn23 = new Button("3");
                btn23.setPrefSize(38.5,25);
            btn24 = new Button("-");
                btn24.setPrefSize(38.5,25);
            btn26 = new Button("0 ");
                btn26.setPrefSize(81,25);
            btn27 = new Button(".");
                btn27.setPrefSize(38.5,25);
            btn28 = new Button("+");
                btn28.setPrefSize(38.5,25);
            btn25 = new Button("=");
                btn25.setPrefSize(33.5, 62);
                
            //CIENTIFICOS//
            btn1c = new RadioButton("Sexages.");
                btn1c.setPrefSize(74.5,25);
                btn1c.setSelected(true);
            btn2c = new RadioButton("Radianes");
                btn2c.setPrefSize(79.5,25);
            btn3c = new RadioButton("Cent.");
                btn3c.setPrefSize(50.5, 25);
            btn6c = new Label(" ");
               btn6c.setPrefSize(38.5,25);
            btn7c = new Button("Inv");
               btn7c.setPrefSize(39.7,25);
            btn8c = new Button("In");
               btn8c.setPrefSize(38.5,25);
            btn9c = new Button("(");
                btn9c.setPrefSize(38.5,25);
            btn10c = new Button(")");
                btn10c.setPrefSize(38.5,25);
            btn11c = new Button("Int");
                btn11c.setPrefSize(38.5,25);
            btn12c = new Button("sinh");
                btn12c.setPrefSize(39.7 ,25);
            btn13c = new Button("sin");
                btn13c.setPrefSize(38.5,25);
            btn14c = new Button("χ²");
                btn14c.setPrefSize(38.5,25);
            btn15c = new Button("n!");
                btn15c.setPrefSize(38.5,25);
            btn16c = new Button("dms");
                btn16c.setPrefSize(38.5,25);
            btn17c = new Button("cosh");
                btn17c.setPrefSize(39.7,25);
            btn18c = new Button("cos");
                btn18c.setPrefSize(38.5,25);
            btn19c = new Button("xⁿ");
                btn19c.setPrefSize(38.5,25);
            btn20c = new Button("y√x");
                btn20c.setPrefSize(38.5,25);
            btn21c = new Button("π");
                btn21c.setPrefSize(38.5,25);
            btn22c = new Button("tanh");
                btn22c.setPrefSize(39.7,25);
            btn23c = new Button("tan");
                btn23c.setPrefSize(38.5,25);
            btn24c = new Button("x³");
                btn24c.setPrefSize(38.5,25);
            btn26c = new Button("F-E");
                btn26c.setPrefSize(38.5,25);
            btn27c = new Button("Exp");
                btn27c.setPrefSize(39.7,25);
            btn28c = new Button("Mod");
                btn28c.setPrefSize(38.5,25);
            btn25c = new Button("∛x");
                btn25c.setPrefSize(38.5, 25);
            btn30c = new Button("log");
                btn30c.setPrefSize(38.5, 25);
            btn31c = new Button("10ⁿ");
                btn31c.setPrefSize(38.5, 25);
           
                
                //TEXTFILED//
                tex1 = new TextField();
                tex1.setPrefSize(215, 25);    
              
                tex1.setStyle("-fx-border-width: 1;"
                      +"-fx-border-style: solid; -fx-border-color: black");
              /*  label1.setTextAlignment(TextAlignment.CENTER);*/
                 tex1.setAlignment(Pos.CENTER_RIGHT);              
                 
                 //LABEL//
                 label1 = new Label(" ");
                 label1.setPrefSize(213, 20);   
                 label1.setAlignment(Pos.CENTER_RIGHT);  
                
                 //MENU//
                 menu = new MenuBar();
                 ver = new Menu("Ver");
                 edicion = new Menu("Edicion");
                 ayuda = new Menu("Ayuda");
                 hiden = new Menu("                                                                                           ");
                 menu.getMenus().addAll(ver, edicion, ayuda, hiden);
                 hiden.setDisable(true);
                 
                 MenuItem estandar = new MenuItem("Estandar");
                 MenuItem cientifica = new MenuItem("Cientifica");
                 ver.getItems().addAll(estandar, cientifica);
                 
                 MenuItem copiar = new MenuItem("Copiar Ctrl+C");
                 MenuItem pegar = new MenuItem("Copiar Ctrl+V");
                 edicion.getItems().addAll(copiar, pegar);
                 
                 //BOTONES//
            btn24c.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                tex1.setText("("+tex1.getText() + "^3)");
            }
            });          
            
            btn14c.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                tex1.setText("("+tex1.getText() + "^2)");
            }
            });   
                 
            btn31c.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                tex1.setText("(10^"+tex1.getText() + ")");
            }
            });   
       
            btn13c.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if(btn13c.getText().equals("sin")){
                tex1.setText(tex1.getText() + "sin");
                }
                else{
                 tex1.setText(tex1.getText() + "SinI");    
                }
            }
            });    
            
            btn18c.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if(btn18c.getText().equals("cos")){
                tex1.setText(tex1.getText() + "cos");
                }else{
                tex1.setText(tex1.getText() + "CosI");    
                }
            }
            });   
            
            btn23c.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if(btn23c.getText().equals("tan")){
                tex1.setText(tex1.getText() + "tan");
                }else{
                tex1.setText(tex1.getText() + "TanI");    
                }
            }
            });  
            
                    
            btn21c.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if(btn21c.getText().equals("π")){
                tex1.setText(tex1.getText() + "(π)");
                }else{
                tex1.setText(tex1.getText() + "(2*π)");    
                }
                }
            });       
                
            btn10.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                tex1.setText(tex1.getText() + "2√");
                }
            });   
            
            btn20c.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                tex1.setText(tex1.getText() + "√");
                }
            });   
              
            btn25c.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                tex1.setText(tex1.getText() + "3√");
                }
            });   
            
            
            btn19c.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                tex1.setText(tex1.getText() + "^");
                }
            });   
            
            btn28.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                tex1.setText(tex1.getText() + "+");
                }
            }); 
            
            btn17c.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if(btn17c.getText().equals("cosh")){
                tex1.setText(tex1.getText() + "cosh");
                }else{
                tex1.setText(tex1.getText()+"CoshI");    
                }
            }
            });     
              
            btn12c.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if(btn12c.getText().equals("sinh")){
                tex1.setText(tex1.getText() + "sinh");
                }
                else{
                tex1.setText(tex1.getText() + "SinhI");    
                }
            }
            });     
              
            btn22c.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if(btn22c.getText().equals("tanh")){
                tex1.setText(tex1.getText() + "tanh");
                }else{
                tex1.setText(tex1.getText() + "TanhI");    
                }
            }
            });    
            
            btn14.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                tex1.setText(tex1.getText() + "/");
                }
            });     
              
            btn19.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                tex1.setText(tex1.getText() + "*");
                }
            });     
              
            btn24.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                tex1.setText(tex1.getText() + "– ");
                }
            });    
             
            btn27.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                tex1.setText(tex1.getText() + ".");
                }
            });   
            
            btn15.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                tex1.setText(tex1.getText() + "%");
                }
            });    
              
            btn20.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                tex1.setText("1/("+tex1.getText()+")");
                }
            });  
              
            btn26.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                tex1.setText(tex1.getText() + "0");
                }
            });  
              
             
             btn21.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                tex1.setText(tex1.getText() + "1");
                }
            });  
              
            btn22.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                tex1.setText(tex1.getText() + "2");
            }
            });  
            
            btn23.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                tex1.setText(tex1.getText() + "3");
            }
            });  
            
            btn16.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                tex1.setText(tex1.getText() + "4");
                }
            });  
              
            btn17.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                tex1.setText(tex1.getText() + "5");
            }
            });  
            
            btn18.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                tex1.setText(tex1.getText() + "6");
            }
            });  
           
            btn11.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                tex1.setText(tex1.getText() + "7");
                }
            });  
              
            btn12.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                tex1.setText(tex1.getText() + "8");
            }
            });  
            
            btn13.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                tex1.setText(tex1.getText() + "9");
            }
            });  
            
            //Space -1//
            btn6.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
            if(tex1.getText().endsWith("(")){
            p--;
            btn6c.setText("(="+String.valueOf(p));
            }
            else if(tex1.getText().endsWith(")")){
            p++;
            btn6c.setText("(="+String.valueOf(p));
            }
            tex1.setText(tex1.getText().substring(0, tex1.getText().length()-1));
            if(p==0){
              btn6c.setText("");  
            }
            }
            });  
            
            //CE//
            btn7.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if(label1.getText().equals("Error.Recomendacion use parentesis en:"+ "(n%)")){
                
            }else{
                tex1.setText(label1.getText());
                label1.setText(" "); 
                }
            }
            }); 
            
            //Borrar//
            btn8.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                tex1.setText(" ");
                label1.setText(" ");
                p=0;
                btn6c.setText("");
            }
            });  
            
            //Mas Menos//
            btn9.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) { 
            if(tex1.getText().endsWith("-")){
            tex1.setText(tex1.getText().substring(0, tex1.getText().length()-1));
            }
            else{
                tex1.setText(tex1.getText() + "-");  
            }
            }
            });
            
            
            //Total//
            btn25.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
              String xa= tex1.getText();  
              xa.replace("Rai","0");
              cadena = (xa);     
              Operacion();
            }
            }); 
            
            //Radio//
            btn1c.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
            btn2c.setSelected(false);
            btn3c.setSelected(false);
            v=1;
            }
            }); 
            
            btn2c.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
            btn1c.setSelected(false);
            btn3c.setSelected(false);
            v=2;
            }
            }); 
            
            btn3c.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
            btn1c.setSelected(false);
            btn2c.setSelected(false);
            v=3;
            }
            }); 
            
            //Acciones de Cientifca//
            Font redu = new Font("Calibri", 9.5);
            Font maxi = new Font("Calibri", 11.5);
            
            InnerShadow sombra = new InnerShadow();
            
            
            //Inversa//
            btn7c.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
            if(btn8c.getText().toString().equals("In")){
            btn7c.setEffect(sombra);
            btn22c.setFont(maxi);
            btn17c.setFont(maxi);
            btn12c.setFont(redu);
            btn13c.setFont(redu);
            btn11c.setFont(redu);
            btn16c.setFont(redu);
            btn17c.setFont(redu);
            btn18c.setFont(redu);
            btn21c.setFont(redu);
            btn22c.setFont(redu);
            btn23c.setFont(redu);
            btn8c.setText("e^x");
            btn11c.setText("Frac");
            btn12c.setText("sinh⁻¹");
            btn13c.setText("sin⁻¹");
            btn16c.setText("Deg");
            btn17c.setText("cosh⁻¹");
            btn18c.setText("cos⁻¹");
            btn21c.setText("2*π");
            btn22c.setText("tanh⁻¹");
            btn23c.setText("tan⁻¹");
            }
            else if(btn8c.getText().toString().equals("e^x")){
            btn7c.setEffect(null);
            btn12c.setFont(maxi);
            btn13c.setFont(maxi);
            btn11c.setFont(maxi);
            btn16c.setFont(maxi);
            btn17c.setFont(maxi);
            btn18c.setFont(maxi);
            btn21c.setFont(maxi);
            btn22c.setFont(maxi);
            btn23c.setFont(maxi);
            btn8c.setText("In");
            btn12c.setText("sinh");
            btn13c.setText("sin");
            btn11c.setText("Int");
            btn16c.setText("dms");
            btn17c.setText("cosh");
            btn18c.setText("cos");
            btn21c.setText("π");
            btn22c.setText("tanh");
            btn23c.setText("tan");
            }
            }
            }); 
            
            //Parentesis//
            btn9c.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                tex1.setText(tex1.getText() + "(");
                p++;
                if(p>0){
                btn6c.setText("(="+String.valueOf(p));
                }else{
                btn6c.setText("(= !");
                }
            }
            });  
                        
            btn10c.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                tex1.setText(tex1.getText() + ")");
                p--;
                btn6c.setText("(="+String.valueOf(p));
                if(p==0){
                   btn6c.setText(" "); 
                }else if(p<0){
                   btn6c.setText("(= !");
                }else{
                   btn6c.setText("(="+String.valueOf(p));
                }
            }
            });  
            
            
            //Cientifica//
          
                a.getChildren().addAll(label1);
                
                bc.getChildren().addAll(tex1);
                bc.setPadding(new Insets (5));
              
                   h.getChildren().addAll(btn1, btn2, btn3, btn4, btn5);
                   h.setSpacing(5);
                   h.setPadding(new Insets (5));
                
                        h1.getChildren().addAll(btn6, btn7, btn8, btn9, btn10);
                        h1.setSpacing(5);
                        h1.setPadding(new Insets (5));
                
                            h2.getChildren().addAll(btn11, btn12, btn13, btn14, btn15);
                            h2.setSpacing(5);
                            h2.setPadding(new Insets (5));
                
                                h3.getChildren().addAll(btn16, btn17, btn18, btn19, btn20);
                                h3.setSpacing(5);
                                h3.setPadding(new Insets (5));
               
                                h4.getChildren().addAll(btn21, btn22, btn23, btn24);
                                h4.setSpacing(5);
                                h4.setPadding(new Insets (4.9));
            
                                h5.getChildren().addAll(btn26, btn27, btn28);
                                h5.setSpacing(5);
                                h5.setPadding(new Insets (4.9));
                
                            b.getChildren().add(h1);
                            b.setSpacing(5);
                
                            b1.getChildren().add(h2);
                            b1.setSpacing(5);
                
                        b2.getChildren().add(h3);
                        b2.setSpacing(5);
                
                        b3.getChildren().add(h4);
                        b3.setSpacing(5);
                
                    b4.getChildren().add(h5);
                    b4.setSpacing(5);
             
                h6.getChildren().addAll(b3, b4);
                b7.getChildren().add(btn25); 
                b7.setPadding(new Insets (4));
                
                
                               //CIENTIFICA//
                hh.getChildren().addAll(btn1c, btn2c, btn3c);
                   hh.setSpacing(5);
                   hh.setPadding(new Insets (5));
                
                        h12.getChildren().addAll(btn6c, btn7c, btn8c, btn9c, btn10c);
                        h12.setSpacing(5);
                        h12.setPadding(new Insets (5));
                
                            h22.getChildren().addAll(btn11c, btn12c, btn13c, btn14c, btn15c);
                            h22.setSpacing(5);
                            h22.setPadding(new Insets (5));
                
                                h32.getChildren().addAll(btn16c, btn17c, btn18c, btn19c, btn20c);
                                h32.setSpacing(5);
                                h32.setPadding(new Insets (5));
               
                                h42.getChildren().addAll(btn21c, btn22c, btn23c, btn24c, btn25c);
                                h42.setSpacing(5);
                                h42.setPadding(new Insets (4.9));
            
                                h52.getChildren().addAll(btn26c, btn27c, btn28c, btn30c, btn31c);
                                h52.setSpacing(5);
                                h52.setPadding(new Insets (4.9));
                
                            bb.getChildren().add(h12);
                            bb.setSpacing(5);
                
                            b12.getChildren().add(h22);
                            b12.setSpacing(5);
                
                        b22.getChildren().add(h32);
                        b22.setSpacing(5);
                
                        b32.getChildren().add(h42);
                        b32.setSpacing(5);
                
                    b42.getChildren().add(h52);
                    b42.setSpacing(5);
             
                h62.getChildren().addAll(b32, b42);
         
                
                     
            FlowPane root = new FlowPane();
            root.getChildren().addAll(menu, a, bc, h, b, b1, b2, h6, b7);
           
        Scene scene = new Scene(root, 225, 295);
        primaryStage.setResizable(false); 
        scene.getStylesheets().add(getClass().getResource("newCascadeStyleSheet.css").toString());
        primaryStage.setTitle("Calculadora");
        primaryStage.setScene(scene);
        primaryStage.show();
        
       tex1.setEditable(false); 
         tex1.setOnKeyPressed( event ->{
           String validar= event.getText(); 
            switch (validar) {
                case "1":
                case "2":
                case "3":
                case "4":
                case "5":
                case "6":
                case "7":
                case "8":
                case "9":
                case "0":
                case "+":
                case "/":
                case "*":
                case ".":
                
                case "%":
                    tex1.setText(tex1.getText()+validar);
                    break;
                case "-":
                    tex1.setText(tex1.getText()+"–");
                    break;  
                 case "(":
                    tex1.setText(tex1.getText() + "(");
                    p++;
                    if(p>0){
                    btn6c.setText("(="+String.valueOf(p));
                    }else{
                    btn6c.setText("(= !");
                    }
                    break;
                  case ")":   
                    tex1.setText(tex1.getText() + ")");
                    p--;
                    btn6c.setText("(="+String.valueOf(p));
                    if(p==0){
                    btn6c.setText(" "); 
                    }else if(p<0){
                    btn6c.setText("(= !");
                    }else{
                    btn6c.setText("(="+String.valueOf(p));
                    }
                    break;
                default:
                    tex1.setEditable(false);
                    break;
            }
            switch(event.getCode()){
                case BACK_SPACE: 
                                if(tex1.getText().endsWith("(")){
                                p--;
                                btn6c.setText("(="+String.valueOf(p));
                                }
                                else if(tex1.getText().endsWith(")")){
                                p++;
                                btn6c.setText("(="+String.valueOf(p));
                                }
                                tex1.setText(tex1.getText().substring(0, tex1.getText().length()-1));
                                if(p==0){
                                btn6c.setText("");  
                                }
                                break;
                case ENTER: 
                           String xax= tex1.getText();  
                            xax.replace("Rai","0");
                            cadena = ("0+"+xax+"+0");     
                            Operacion();
                                break;
                case LEFT: 
                         tex1.setText(tex1.getText() + "(");
                         p++;
                         if(p>0){
                         btn6c.setText("(="+String.valueOf(p));
                         }else{
                         btn6c.setText("(= !");
                         }
                         break;
                case RIGHT: 
                           tex1.setText(tex1.getText()+")");
                           p--;
                           btn6c.setText("(="+String.valueOf(p));
                           if(p==0){
                           btn6c.setText(" "); 
                           }else if(p<0){
                           btn6c.setText("(= !");
                           }else{
                           btn6c.setText("(="+String.valueOf(p));
                           }
                    break;   
                     }
                 });
         
         
      cientifica.setOnAction(new EventHandler<ActionEvent>() {
          @Override
          public void handle(ActionEvent event) {
          Ventanas();
          ventana.show();
          ventana.setResizable(false); 
          scene2.getStylesheets().add(getClass().getResource("newCascadeStyleSheet.css").toString());
          primaryStage.close();
          cientifica.setDisable(true);
                }
                });    
       
      estandar.setOnAction(new EventHandler<ActionEvent>() {
          @Override
          public void handle(ActionEvent event) {
          ventana.close();
          cientifica.setDisable(false);
          label1.setPrefSize(213, 20);   
          tex1.setPrefSize(215, 25); 
          scene.getStylesheets().add(getClass().getResource("newCascadeStyleSheet.css").toString());
          root.getChildren().addAll(menu, a, bc, h, b, b1, b2, h6, b7);
          primaryStage.setScene(scene);
          primaryStage.show();
                }
                });    
              
       
        
        
    }
        static void Ventanas() {       
        tex1.setPrefSize(440, 25); 
        label1.setPrefSize(440, 20);
        ventana = new Stage();
        ventana2 = new FlowPane();
        ventana2.getChildren().addAll(menu, a, bc, hh, h, bb, b, b12, b1, b22, b2, h62, h6, b7);
        scene2 = new Scene(ventana2, 450, 295);
        ventana.setScene(scene2);   
        }
        
        static void metodo(){ 
            tex1.setEditable(true);
            String remplazo = tex1.getText(); 
            String replace = remplazo.replaceAll("-" ,"–");
            tex1.setText(tex1.getText() + replace);
        }

     
    /**
     * @param args the command line arguments
     */

public static void main(String[] args) {
        launch(args);
        }
}