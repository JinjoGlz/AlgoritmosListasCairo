/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package algoritmos;
import java.util.Scanner;
       

/**
 *
 * @author Jinjo
 */
public class Algoritmos<T> {
    Scanner tec= new Scanner(System.in);
    private Nodo<T> nodo;
    
    public void CrearInicio(){
        nodo=new Nodo<>();
        nodo.setLiga(null);
        int res=1;
        System.out.println("¿Desea Ingresar mas nodos?\t 1=si   2=no");
        res=tec.nextInt();
        while(res==1){
            Nodo<T> q=new Nodo<>();
            q.setLiga(nodo);
            nodo=q;
            System.out.println("¿Desea Ingresar mas nodos?\t 1=si   2=no");
        res=tec.nextInt();
        }
    }
    
    public void CreaFinal(){
        nodo=new Nodo<>();
        Nodo<T> t=nodo;
        nodo.setLiga(null);
        int res=1;
        System.out.println("¿Desea Ingresar mas nodos?\t 1=si   2=no");
        res=tec.nextInt();
        while(res==1){
            Nodo<T> q=new Nodo<>();
            q.setLiga(null);
            t.setLiga(q);
            t=q;
            System.out.println("¿Desea Ingresar mas nodos?\t 1=si   2=no");
        res=tec.nextInt();
        }
    }
    
    public void Recorrer(){
        Nodo<T> q=nodo;
        while(q!=null){
            System.out.println(q.getInfo());
            q=q.getLiga();
        }
    }
    
    public void RecorrerRecursivo(Nodo<T> p){
        if(p!=null){
            System.out.println(p.getInfo());
            RecorrerRecursivo(p.getLiga());
        }
    }
    
    public void InsertarInicio(Nodo<T> p, T dato){
        Nodo<T> q= new Nodo<>();
        q.setInfo(dato);
        q.setLiga(p);
        p=q;
    }
}
