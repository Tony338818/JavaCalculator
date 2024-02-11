/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator1;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
/**
 *
 * @author IGWE TONY
 */
public class ActualOperations {
    
    public Object value ;
    void Calc(String val) {
       
        try {
            ScriptEngineManager manager = new ScriptEngineManager();
            ScriptEngine engine = manager.getEngineByName("js");
            
            // Evaluate the expression
            Object result = engine.eval(val);
            value = result;
        } catch (ScriptException ex) {
            Logger.getLogger(ActualOperations.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
