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
public class KonversiMataUang {
    
    @RequestMapping("/dolarkerupiah")
    @ResponseBody
    public String kerjakanDolarRupiah () {
        
        int dolar = 100000;
        int satuantukar = 14139;
        int hasilkonversi = dolar*satuantukar;
        
        return "Konversi nilai mata uang rupiah ke dolar " + dolar + " x " + satuantukar + " = " + hasilkonversi + " rupiah ";
    }
    @RequestMapping("/rupiahkedolar")
    @ResponseBody
    public String kerjakanRupiahkeDolar() {
        
        int rupiah = 100000;
        int satuantukar = 14139;
        int hasilkonversi = rupiah/satuantukar;
        
        return "Konversi nilai mata uang rupiah ke dolar " + rupiah + " : " + satuantukar + " = " + hasilkonversi + " dollar ";
    }
    @RequestMapping("/ringgitkedolar")
    @ResponseBody
    public String kerjakanRinggitkeDolar() {
        
        int ringgit = 10000;
        int satuantukar = 24;
        int hasilkonversi = ringgit*satuantukar;
        
        return "Konversi nilai mata uang ringgit ke dolar " + ringgit + " x " + satuantukar + " = " + hasilkonversi + " dolar ";
    }
    @RequestMapping("/dolarkeringgit")
    @ResponseBody
    public String kerjakanDolarkeRinggit() {
        
        int dolar = 10000;
        int satuantukar = 24;
        int hasilkonversi = dolar/satuantukar;
        
        return "Konversi nilai mata uang dolar ke ringgit " + dolar + " : " + satuantukar + " = " + hasilkonversi + " ringgit ";
    }
    
}
