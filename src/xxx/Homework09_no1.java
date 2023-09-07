package homework;

class Bank{
    private int account =0; //存款額度
    synchronized public void deposit(int money){

        while (account >3000){
            System.out.println("媽媽看到餘額在3000以上，暫停匯款");
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        if(account ==0){
            System.out.println("媽媽被熊大要求匯款");
        }
        account +=money;
        System.out.println("媽媽存了"+money+",帳戶共有:"+account+"元");
        if (account > 3000){
            // System.out.println("雄大被媽媽告知帳戶已經有錢");
            notify();
        }
    }

    synchronized public void draw (int money){
        while(account < money){
            System.out.println("雄大看到帳戶沒錢，暫停提款");;
          try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        if(account >3000){
            System.out.println("雄大被媽媽告知帳戶已經有錢");
        }
        account -= money;
        System.out.println("雄大領了"+money+",帳戶共有:"+account);
        if(account < 2000){
            System.out.println("雄大看到餘額在2000以下，要求匯款");
            notify();
        }
    }
}

class Producer extends Thread{
    Bank bank;
    public Producer (Bank bank){
        this.bank =bank;
    }
    
    public void run(){
        for(int i = 0 ; i<10 ;i++){
            bank.deposit(2000);
        }
    }
}

class Consumer extends Thread{
    Bank bank;
    public Consumer(Bank bank){
        this.bank=bank;
    }
    public void run(){
        for (int i =0 ;i <10 ;i++){
            bank.draw(1000);
        }
    }
}

public class Homework09_1 {
    public static void main(String[] args) {
        Bank bank  = new Bank();
        Producer producer = new Producer(bank);
        Consumer consumer = new Consumer(bank);
        producer.start();
        consumer.start();
    }
}
