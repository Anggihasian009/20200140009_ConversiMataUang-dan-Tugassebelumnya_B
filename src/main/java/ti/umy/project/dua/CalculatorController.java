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
public class CalculatorController {
    
    
    @RequestMapping("/tambah")
    @ResponseBody
    public String kerjakanTambah () {
        
        int a = 4;
        int b = 5;
        int c = a+b;
        
        return "Hasil penjumlahan = " + c;
    }
    @RequestMapping("/kurang")
    @ResponseBody
    public String kerjakanPengurangan() {
        
        int a = 4;
        int b = 5;
        int c = a-b;
        
        return "Hasil pengurangan " + a + " - " + b + " = " + c;
    }
    @RequestMapping("/kali")
    @ResponseBody
    public String kerjakanPerkalian() {
        
        int a = 4;
        int b = 5;
        int c = a*b;
        
        return "Hasil pengurangan " + a + " x " + b + " = " + c;
    }
    @RequestMapping("/bagi")
    @ResponseBody
    public String kerjakanPembagian() {
        
        int a = 20;
        int b = 5;
        int c = a/b;
        
        return "Hasil pengurangan " + a + " : " + b + " = " + c;
    }
}
