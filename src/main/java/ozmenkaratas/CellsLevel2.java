package ozmenkaratas;

public class CellsLevel2 {

    int pozisyon;
    String durum;
    int point;
    int move;
    int temp;

    public CellsLevel2(int pozisyon) {
        this.pozisyon = pozisyon;
        if (temp == this.pozisyon) {
            int R = (int) (Math.random() * 10);
            if (R >= 0 && R < 6) {
                this.durum = "treasure";
            } else if (R >= 6 && R < 8) {
                this.durum = "trap";
            } else if (R >= 8 && R < 9) {
                this.durum = "empty";
            } else if (R >= 9 && R < 10) {
                this.durum = "move forward";
            }

        } else {
            int R = (int) (Math.random() * 10);
            if (R >= 0 && R < 4) {
                this.durum = "treasure";
            } else if (R >= 4 && R < 6) {
                this.durum = "trap";
            } else if (R >= 6 && R < 8) {
                this.durum = "empty";
            } else if (R >= 8 && R < 9) {
                this.durum = "move back";
            } else if (R >= 9 && R < 10) {
                this.durum = "move forward";
            }
        }

        int P = (int) ((Math.random() * 50) + 1);
        if (this.durum.equals("treasure")) {
            this.point = P;
        } else if (this.durum.equals("trap")) {
            this.point = -1 * (P / 2);
        } else if (this.durum.equals("empty")) {
            this.point = 0;
        } else if (this.durum.equals("move back")) {
            this.point = 0;
            if (this.pozisyon < 5) {
                this.durum = "empty";
            } else {
                this.move = (int) (((Math.random() * 5) + 1));
            }
        } else if (this.durum.equals("move forward")) {

            this.point = 0;
            if (this.pozisyon > 25) {
                this.durum = "empty";
            } else {
                this.move = (int) (((Math.random() * 5) + 1));
                temp = this.pozisyon + this.move;
            }

        }

    }

    @Override
    public String toString() {
        return ("[" + this.pozisyon + "|" + this.durum + "|" + this.point + "|" + this.move + "]");
    }

}
