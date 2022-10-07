/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Vitor
 */
public class Sorteio {
    public int numsort1;
    public int numsort2;
    public int numsort3;
    public int numsort4;
    public int numusuario1;
    public int numusuario2;
    public int numusuario3;
    public int numusuario4;
    public int numeroacertos;
    
    public void SortearNumeros() {
        numsort1=(int)(Math.random()*20);
        numsort2=(int)(Math.random()*20);
        numsort3=(int)(Math.random()*20);
        numsort4=(int)(Math.random()*20);
    }
    
    
    public int VerficaAcertos() {
        if(this.numsort1 == numusuario1 && this.numsort2 == numusuario2 && this.numsort3 == numusuario3 && this.numsort4 == numusuario4) {            
            numeroacertos = 4;       
        } else if (this.numsort1 == numusuario1 && this.numsort2 == numusuario2 && this.numsort3 == numusuario3 || this.numsort1 == numusuario1 && this.numsort2 == numusuario2 && this.numsort4 == numusuario4 || this.numsort1 == numusuario1 && this.numsort3 == numusuario3 && this.numsort4 == numusuario4 || this.numsort2 == numusuario2 && this.numsort3 == numusuario3 && this.numsort4 == numusuario4) {
            numeroacertos=3;
        } else if (this.numsort1 == numusuario1 && this.numsort2 == numusuario2 || this.numsort1 == numusuario1 && this.numsort3 == numusuario3 || this.numsort1 == numusuario1 && this.numsort4 == numusuario4 || this.numsort2 == numusuario2 && this.numsort3 == numusuario3 || this.numsort2 == numusuario2 && this.numsort4 == numusuario4 || this.numsort3 == numusuario3 && this.numsort4 == numusuario4) {
            numeroacertos=2;
        } else if (this.numsort1 == numusuario1 || this.numsort2 == numusuario2 || this.numsort3 == numusuario3 || this.numsort4 == numusuario4) {
            numeroacertos=1;
        }
        else {
            numeroacertos=0;
        }
        return numeroacertos;
    }
    
    
    public double VerificaPremiacao(int numacertos){
        numacertos=numeroacertos;
        int premiacao=0;
        if(numacertos==4){
            premiacao=10000 * 4;
        } else if(numacertos==3) {
            premiacao=10000 * 3;
        } else if(numacertos==2) {
            premiacao=10000 * 2;
        } else if (numacertos==1) {
            premiacao=10000;
        }
        
        return premiacao;
    }
    }
    

