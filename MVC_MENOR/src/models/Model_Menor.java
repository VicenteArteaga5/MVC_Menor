package models;

public class Model_Menor {
    private int n1=1;
    private int n2=2;
    private int n3=3;
    private int m=1;
   

public int getN1(){
return n1;
}
public void setN1(int n1){
    this.n1=n1;
}

public int getN2(){
return n2;
}
public void setN2(int n2){
    this.n2=n2;
}

public int getN3(){
return n3;
}
public void setN3(int n3){
    this.n3=n3;
}


public int getM(){
    return m;
}
public void setmenor(int menor){
    this.m = m;
}
/***************************************************************************************/
public void menor(){
    m=n3;
    if(n2<m){
        m=n2;  
    }
    if(n1<m){
        m=n1;
    }
}
}
