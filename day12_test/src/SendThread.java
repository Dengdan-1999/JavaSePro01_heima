import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class SendThread extends Thread{
    String name;
    List<String> giftList=new ArrayList<>();

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    int count;

    public SendThread(List<String> giftList,String username){
        super(username);
        this.giftList=giftList;
    }


    @Override
    public void run() {
            Random r=new Random();
            while (true) {
                synchronized (giftList) {
                    name = Thread.currentThread().getName();
                    if (this.giftList.size() < 10) {
                        break;
                    }
                    String gift = this.giftList.remove(r.nextInt(giftList.size()));
                    System.out.println(name + "送出礼物:" + gift);
                    count++;
            }
        }
    }
}
