package calculadora3;
import java.lang.Math;
import static calculadora3.Calculadora3.*;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.StringTokenizer;
/**
 *
 * @author SQL-2014056
 */
public class Operar{
       
    static void Operaciones(){
                st = new StringTokenizer(evaluaexpresion, "√^abcdefghjklm*/%+–", true); 
        	evaluaexpresion2="";
		resultado = Double.parseDouble(st.nextToken()); 
		anterior=Double.toString(resultado); 
		siguiente=""; 
		while (st.hasMoreTokens()) { 
		String a = st.nextToken();
		if (a.equals("*")){ 
		resultado *= Double.parseDouble(st.nextToken()); 
		anterior=Double.toString 
		(resultado); 
		siguiente=""; 
                } 
		if (a.equals("/")){ 
		resultado /= Double.parseDouble(st.nextToken()); 
		anterior=Double.toString 
		(resultado); 
		siguiente=""; 
		} 
                if (a.equals("^")){ 
                resultado = Math.pow((Double.parseDouble(anterior)),(Double.parseDouble(st.nextToken()))); 
                anterior = Double.toString(resultado); 
                siguiente=""; 
                }
                if (a.equals("√")){ 
                resultado = Math.pow((Double.parseDouble(st.nextToken())),(1/(Double.parseDouble(anterior)))); 
                anterior = Double.toString(resultado); 
                siguiente=""; 
                }
                if (a.equals("a")){
                resultado = Math.cosh(Double.parseDouble(st.nextToken())); 
                anterior = Double.toString(resultado); 
                siguiente=""; 
                }
                if (a.equals("b")){
                resultado = Math.sinh(Double.parseDouble(st.nextToken())); 
                anterior = Double.toString(resultado); 
                siguiente=""; 
                }
                if (a.equals("c")){
                resultado = Math.tanh(Double.parseDouble(st.nextToken())); 
                anterior = Double.toString(resultado); 
                siguiente=""; 
                }
                if (a.equals("d")){
                    if(v==1){
                resultado = Math.sin(Math.toRadians(Double.parseDouble(st.nextToken()))); 
                anterior = Double.toString(resultado); 
                siguiente=""; 
                }else if(v==2){
                    resultado = Math.sin((Double.parseDouble(st.nextToken()))); 
                    anterior = Double.toString(resultado); 
                    siguiente="";     
                    }else if(v==3){
                    resultado = Math.sin((Double.parseDouble(st.nextToken()))/Math.toRadians(63.661977236758)); 
                    anterior = Double.toString(resultado); 
                    siguiente="";      
                    }
                }
                if (a.equals("e")){
                    if(v==1){
                resultado = Math.cos(Math.toRadians(Double.parseDouble(st.nextToken()))); 
                anterior = Double.toString(resultado); 
                siguiente=""; 
                }else if(v==2){
                    resultado = Math.cos((Double.parseDouble(st.nextToken()))); 
                    anterior = Double.toString(resultado); 
                    siguiente="";     
                    }else if(v==3){
                    resultado = Math.cos((Double.parseDouble(st.nextToken()))/Math.toRadians(63.661977236758)); 
                    anterior = Double.toString(resultado); 
                    siguiente="";      
                    }
                }
                if (a.equals("f")){
                    if(v==1){
                resultado = Math.tan(Math.toRadians(Double.parseDouble(st.nextToken()))); 
                anterior = Double.toString(resultado); 
                siguiente=""; 
                }else if(v==2){
                    resultado = Math.tan((Double.parseDouble(st.nextToken()))); 
                    anterior = Double.toString(resultado); 
                    siguiente="";     
                    }else if(v==3){
                    resultado = Math.tan((Double.parseDouble(st.nextToken()))/Math.toRadians(63.661977236758)); 
                    anterior = Double.toString(resultado); 
                    siguiente="";      
                    }
                }
                if (a.equals("g")){
                double x= Double.parseDouble(st.nextToken());     
                resultado = Math.sinh(x)/Math.cosh(x); 
                anterior = Double.toString(resultado); 
                siguiente=""; 
                }
                if (a.equals("h")){    
                resultado = 1/Math.cosh(Double.parseDouble(st.nextToken())); 
                anterior = Double.toString(resultado); 
                siguiente=""; 
                }
                if (a.equals("j")){    
                resultado = 1/Math.sinh(Double.parseDouble(st.nextToken())); 
                anterior = Double.toString(resultado); 
                siguiente=""; 
                }
                if (a.equals("k")){
                    if(v==1){
                resultado = Math.asin(Math.toRadians(Double.parseDouble(st.nextToken()))); 
                anterior = Double.toString(resultado); 
                siguiente=""; 
                }else if(v==2){
                    resultado = Math.asin((Double.parseDouble(st.nextToken()))); 
                    anterior = Double.toString(resultado); 
                    siguiente="";     
                    }else if(v==3){
                    resultado = Math.asin((Double.parseDouble(st.nextToken()))/Math.toRadians(63.661977236758)); 
                    anterior = Double.toString(resultado); 
                    siguiente="";      
                    }
                }
                if (a.equals("l")){
                    if(v==1){
                resultado = Math.acos(Math.toRadians(Double.parseDouble(st.nextToken()))); 
                anterior = Double.toString(resultado); 
                siguiente=""; 
                }else if(v==2){
                    resultado = Math.acos((Double.parseDouble(st.nextToken()))); 
                    anterior = Double.toString(resultado); 
                    siguiente="";     
                    }else if(v==3){
                    resultado = Math.acos((Double.parseDouble(st.nextToken()))/Math.toRadians(63.661977236758)); 
                    anterior = Double.toString(resultado); 
                    siguiente="";      
                    }
                }
                if (a.equals("m")){
                    if(v==1){
                resultado = Math.atan(Math.toRadians(Double.parseDouble(st.nextToken()))); 
                anterior = Double.toString(resultado); 
                siguiente=""; 
                }else if(v==2){
                    resultado = Math.atan((Double.parseDouble(st.nextToken()))); 
                    anterior = Double.toString(resultado); 
                    siguiente="";     
                    }else if(v==3){
                    resultado = Math.atan((Double.parseDouble(st.nextToken()))/Math.toRadians(63.661977236758)); 
                    anterior = Double.toString(resultado); 
                    siguiente="";      
                    }
                }
	if (a.equals("%")){ 
	resultado = (Double.parseDouble(anterior))/100; 
	anterior = Double.toString (resultado); 
	siguiente=""; 
	}  
	evaluaexpresion2= evaluaexpresion2+siguiente; 
		if (a.equals("+")){ 
	evaluaexpresion2= evaluaexpresion2+anterior+"+"; 
	siguiente=st.nextToken(); 
	resultado = Double.parseDouble(siguiente); 
	anterior=""; 
	} 
		if (a.equals("–")){ 
		evaluaexpresion2= evaluaexpresion2 +anterior+"–"; 
		siguiente=st.nextToken(); 
		resultado = Double.parseDouble(siguiente); 
		anterior=""; 
	} 
	
	} 
	evaluaexpresion2= evaluaexpresion2+ anterior+siguiente; 
	st = new StringTokenizer(evaluaexpresion2, "√^abcdefghjklm/*%+–", true); 
	resultado = Double.parseDouble(st.nextToken()); 
	while (st.hasMoreTokens()) { 
	String a = st.nextToken(); //a es un operando ( signo) guarda los tokens en un string para identificarlos. 
		if (a.equals("+")){ 
		resultado += Double.parseDouble(st.nextToken()); 
	} 
	if (a.equals("–")){ 
	resultado -= Double.parseDouble(st.nextToken()); 
	}
		
    }
   
}
      public static void resultado(){
        try{
        cambio1 = cadena.replace("Raiz","(0z");
        combio2 = cambio1.replace("cosh", "0a");
        cambio3 = combio2.replace("+0z","0.1+0z");
        cambio4 = cambio3.replace("y","y");
        cambio5 = ("0.0+("+cambio4+")+0.0"); 
        cambio6 = cambio5.replace("sinh", "0b");
        cambio7 = cambio6.replace("tanh", "0c");
        cambio8 = cambio7.replace("π","3.141592654");
        cambio9 = cambio8.replace("sin","0d");
        cambio10 = cambio9.replace("cos","0e");
        cambio11 = cambio10.replace("tan","0f");
        cambio12 = cambio11.replace("SinhI", "0g");
        cambio13 = cambio12.replace("CoshI","0h");
        cambio14 = cambio13.replace("TanhI", "0j");
        cambio15 = cambio14.replace("SinI", "0k");
        cambio16 = cambio15.replace("CosI", "0l");
        cambio17 = cambio16.replace("TanI", "0m");
        expresion = cambio17;
	yanohayparentesis=0; 
	while(yanohayparentesis==0){ 
	yanohayparentesis=1; 
	for(int x=0;x<expresion.length();x++){ 
	if(expresion.substring(x,x+1).toString().equalsIgnoreCase("(")){ 
		ultimoparentesis=x; 
		yanohayparentesis=0; 
		} 
	} 
		if(yanohayparentesis==0){ 
		for(int x=ultimoparentesis; 
		x<expresion.length();x++){ 
		if(expresion.substring(x,x+1).toString().equalsIgnoreCase(")")){ 
		ultimoparentesis2=x; 
		x=expresion.length(); 
		} 
	} 
	evaluaexpresion = expresion.substring(ultimoparentesis+1,ultimoparentesis2); 
	Operaciones(); 
	evaluaexpresion = Double.toString(resultado); 
	bandera=0; 
	try{ 
	valor = Integer.parseInt(expresion.substring(ultimoparentesis-1, ultimoparentesis).toString()); 
	} 
		catch (NumberFormatException nfe){ 	
		bandera=1; 
	} 
	newexpresion=expresion.substring(0,ultimoparentesis); 
	if(ultimoparentesis2!=(expresion.length()-1)){ 
		ultimoparentesis2= 
	ultimoparentesis2+1; 
	} 
	if(expresion.substring( ultimoparentesis2,expresion.length()).equalsIgnoreCase(")")){ 
	if(bandera==1) 
	newexpresion=newexpresion+ evaluaexpresion+expresion.substring(ultimoparentesis2,expresion.length()-1); 
	else 
	newexpresion= newexpresion+ "*"+evaluaexpresion+expresion.substring(ultimoparentesis2,expresion.length()-1); 
		}else{ 
		if(bandera==1)
		newexpresion=newexpresion+ evaluaexpresion+expresion.substring(ultimoparentesis2,expresion.length()); 
			else 
			newexpresion=newexpresion+"*"+evaluaexpresion+expresion.substring(ultimoparentesis2,expresion.length());
			} 
			expresion=newexpresion; 
			}else{ 
			evaluaexpresion=expresion; 
			Operaciones(); 
			evaluaexpresion=Double.toString(resultado); 
                        label1.setText(tex1.getText());
                        tex1.setText(evaluaexpresion);
                        
		} 

		}
                }catch(Exception dd){
                    label1.fontProperty();
                    label1.setText("Error.Recomendacion use parentesis en:"+ "(n%)");
                }
                }
        
}

    
