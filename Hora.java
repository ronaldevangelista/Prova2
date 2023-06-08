import java.util.Scanner;

// Isabela Luisa e Ronald Pereira

public class Hora{
    Scanner ler = new Scanner(System.in);
    private int hora;
    private int min;
    private int seg;


    // CONSTRUTORES
    public Hora (){

    };

    public Hora (int h, int m, int s){
        setHor(h);
        setMin(m);
        setSeg(s);
    }


    // METÓDOS SETTER COM VALIDAÇÃO
    public void setHor(int h){
        while(h < 0 || h > 23){
            System.out.println("Valor inválido, por favor digite um valor entre 0 e 23");
            System.out.print("Insira um valor válido para horas: ");
            h = ler.nextInt();
        }

        hora = h;
    }

    public void setMin(int m){
        while(m < 0 || m > 59){
            System.out.println("Valor inválido, por favor digite um valor superior a 0 e inferior a 60");
            System.out.print("Insira um valor válido para minutos: ");
            m = ler.nextInt();
        }
        min = m;
    }

    public void setSeg(int s){
        while(s < 0 || s > 59){
            System.out.println("Valor inválido, por favor digite um valor superior a 0 e inferior a 60");
            System.out.print("Insira um valor válido para segundos: ");
            s = ler.nextInt();
        }

        seg = s;
    }


    // METÓDOS SETTER VAZIOS
    public void setHor(){
        int h;
        System.out.print("Insira um valor para horas: ");
        h = ler.nextInt();
        setHor(h);
    }

    public void setMin(){
        int m;
        System.out.print("Insira um valor para minutos: ");
        m = ler.nextInt();
        setMin(m);
    }

    public void setSeg(){
        int s;
        System.out.print("Insira um valor para segundos: ");
        s = ler.nextInt();

        setSeg(s);
    }


    // MÉTODOS GETTER
    public int getHor (){
        return hora;
    }

    public int getMin (){
        return min;
    }

    public int getSeg (){
        return seg;
    }

    public String getHora1 (){
        String h;
        if(hora >= 9){h = "" + hora;} 
        else{h = "0" + hora;}

        String m;
        if(min >= 9){m = "" + min;}
        else{m = "0" + min;}

        String s;
        if(seg >= 9){s = "" + seg;}
        else{s = "0" + seg;}

        return (h + ":" + m + ":" + s);
    }

    public String getHora2 (){
        String sig = "AM";
        int valorHoras = hora;

        if (hora > 11){
            valorHoras = hora - 12;
            sig = "PM";
        }

        String h;
        if(valorHoras >= 9){h = "" + valorHoras;} 
        else{h = "0" + valorHoras;}

        String m;
        if(min >= 9){m = "" + min;}
        else{m = "0" + min;}

        String s;
        if(seg >= 9){s = "" + seg;}
        else{s = "0" + seg;}

        h = valorHoras + ":" + m + ":" + s + " " + sig;
        return h;
    }

    public int getSegundos(){
        int h;
        h = hora * 3600;
        h = h + (min * 60);
        h = h + seg;
        return h; 
    }
}