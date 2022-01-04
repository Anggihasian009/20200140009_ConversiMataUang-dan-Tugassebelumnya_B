/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ti.umy.project.dua;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author Lenovo
 */
@Controller
public class LoopKelipatanLima {
    
    @RequestMapping("/perulangan")
    @ResponseBody
    public String getloop(){
        
        String result = "";
        for(int jumlah = 13; jumlah <= 100; jumlah++){
            if (jumlah%5==0)
            result += "Angka : "+jumlah + "<br>";
        }
        return result;
    }
    
}
