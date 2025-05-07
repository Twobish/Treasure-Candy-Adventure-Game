package ozmenkaratas;

public class CellsLevel1 {

    int konum;
    String durumları;
    int point;

    public CellsLevel1(int konum) {
        this.konum = konum;
        int A = (int) (Math.random() * 10);
        if (A >= 0 && A < 6) {  //%60 olasılıkla hazine
            this.durumları = "treasure";
        } else if (A >= 6 && A < 9) { //%30 ile tuzak çıkıyor
            this.durumları = "trap";
        } else if (A >= 9) { //%10 boş olur
            this.durumları = "empty";
        }
        int B = (int) ((Math.random() * 100) + 1); //100 dahil olsun diye +1 verdik yani 1 ile 100 arası her şeyi alabiliyor
        if (this.durumları.equals("treasure")) {
            this.point = B;
        } else if (this.durumları.equals("trap")) {
            this.point = -1 * (B); //aldığı puanı eksi ile çarpılıyor
        } else if (this.durumları.equals("empty")) {
            this.point = 0;

        }

    }


    @Override
    public String toString() {
        return ("[" + this.konum + "|" + this.durumları + "|" + this.point + "]");
    }
}
