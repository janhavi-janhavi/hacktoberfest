package com.Encapsulation;
pulic class A{
private int id;
  private int name;

public void setid(int a){
this.id=a;
}
  public void getid(){
    return id;
  }
  public void setName(String b){
   this.name=b;
  }
  public void getName(){
    return name;
  }
}
public class test{
public static void main(String arge[]){
 A sc=new A();
  sc.setId(1);
  system.out.println(sc.getId());
  sc.setName("yami");
  system.out.println(sc.getName());
}
}
