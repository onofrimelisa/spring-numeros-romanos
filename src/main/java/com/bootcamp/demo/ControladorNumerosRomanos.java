package com.bootcamp.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControladorNumerosRomanos {

    @GetMapping("{num}")
    public String convertirANumeroRomano(@PathVariable int num) {
        String unidad = "", decena = "", centena = "", millar = "";
        int uni, dec, cen, mi;

        mi = num / 1000;
        cen = (num % 1000) / 100;
        dec = ((num % 1000) % 100) / 10;
        uni = (((num % 1000) % 100) % 10);

        switch (mi) {
            case 1:
                millar += "M";
                break;
            case 2:
                millar += "MM";
                break;
            case 3:
                millar += "MMM";
                break;
        }

        switch (cen) {
            case 1:
                centena += "C";
                break;
            case 2:
                centena += "CC";
                break;
            case 3:
                centena += "CCC";
                break;
            case 4:
                centena += "CD";
                break;
            case 5:
                centena += "D";
                break;
            case 6:
                centena += "DC";
                break;
            case 7:
                centena += "DCC";
                break;
            case 8:
                centena += "DCCC";
                break;
            case 9:
                centena += "CM";
                break;
        }

        switch (dec) {
            case 1:
                decena += "X";
                break;
            case 2:
                decena += "XX";
                break;
            case 3:
                decena += "XXX";
                break;
            case 4:
                decena += "XL";
                break;
            case 5:
                decena += "L";
                break;
            case 6:
                decena += "LX";
                break;
            case 7:
                decena += "LXX";
                break;
            case 8:
                decena += "LXXX";
                break;
            case 9:
                decena += "XC";
                break;
        }

        switch (uni) {
            case 1:
                unidad += "I";
                break;
            case 2:
                unidad += "II";
                break;
            case 3:
                unidad += "III";
                break;
            case 4:
                unidad += "IV";
                break;
            case 5:
                unidad += "V";
                break;
            case 6:
                unidad += "VI";
                break;
            case 7:
                unidad += "VII";
                break;
            case 8:
                unidad += "VIII";
                break;
            case 9:
                unidad += "IX";
                break;
        }

        return "EL número " +
                num +
                " en números romanos es: " +
                millar +
                centena +
                decena +
                unidad;
    }
}
