package ludo;
import java.util.*;

public class Jogador implements java.io.Serializable{
  private String corDoPe�o;
  private ArrayList qtdNaBase = new ArrayList();
  private ArrayList qtdNoJogo = new ArrayList();
  private String nome;
  private int chances;

  public Jogador(String nome,String cor,int qt) {
    this.nome=nome;
    this.corDoPe�o=cor;
    for(int i=0;i<qt;i++){
      Peao aux=new Peao(corDoPe�o,i);
      qtdNaBase.add(aux);
    }
    chances=0;
  }

  public String getNome(){
    return nome;
  }

  public ArrayList getNaBase(){
    return qtdNaBase;
  }

  public void tiraPeaoDoJogo(Peao p){
    qtdNoJogo.remove(p);
  }
  public int getQtBase(){
    return qtdNaBase.size();
  }
  public int getQtEmJogo(){
    return qtdNoJogo.size();
  }
  public String getCor(){
    return corDoPe�o;
  }
  public void colocaPeaoNaBase(Peao p){
    qtdNaBase.add((Peao)qtdNoJogo.remove(qtdNoJogo.indexOf(p)));
    p.voltaBase();
  }
  public void colocaPeaoNoJogo(Peao p){
    qtdNoJogo.add((Peao)qtdNaBase.remove(qtdNaBase.indexOf(p)));
    p.vaiProJogo();
  }

  public int getChances(){
    return chances;
  }
  public void incChance(){
    chances++;
  }
  public void decChance(){
    chances--;
  }
}

