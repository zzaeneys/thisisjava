package ch06.verify.num20;

public class Account {

    //필드 선언
    private String ano;
    private String owner;
    private int balance;

    //생성자 선언
    public Account(String ano, String owner, int balance) {
        this.ano = ano;
        this.owner = owner;
        this.balance = balance;
    }
    //메소드 선언
    public String getAno() { return ano; }
    public void setAno(String ano) { this.ano = ano; }
    public String getOwner() { return owner; }

    public void setOwner(String owner) { this.owner = owner; }
    public int getBalance() { return balance; }

    public void setBalance(int balance) { this.balance = balance; }
}
