/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ti.umy.project.dua;

import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author Administrator
 */
@Controller
public class RequestController {
    
    public String addMessage(String text){
        return text + " Saja";
    }
    
    public int getSum(String a, String b){
        int ai = Integer.parseInt(a);
        int bi = Integer.parseInt(b);
        return ai + bi;
    }
        
    @RequestMapping("/input")
    @ResponseBody
    public String getInput(HttpServletRequest data){
        String vara = data.getParameter("vara");
        String varb = data.getParameter("varb");
        int hasil_jumlah = getSum(vara, varb);
        
        return "Hasil_dari " + vara + " + " + varb +" = " + hasil_jumlah;
    }
}
