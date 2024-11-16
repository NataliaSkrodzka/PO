public class kolokwium1 {
    public static boolean dokladnosc(double x, double y, double k) {
        if (x < 0) {
            x = -x;
        }
        if (y < 0) {
            y = -y;
        }

            return x - y <= Math.pow(10, -k);

    }
    public static int najblizszySasiad(int S){
        int n=0;
        int k=0;
        int pierwiastekM=0;
        int pierwiastekP=0;
        int pierwiastekW;
        for (int i = 0; i < S; i++) {
            for (int j = 0; j < S; j++) {
                if (S - i == j * j) {
                    n = j;
                    pierwiastekM=S-i;
                    break;
                }
            }
        }
        for (int i = 0; i < S; i++) {
            for (int j = 0; j < S; j++) {
                if (S + i == j * j) {
                    k = j;
                    pierwiastekP=S+i;
                    break;
                }
            }
        }
        if ((S-pierwiastekM)<(pierwiastekP-S)) {
            pierwiastekW = n;
        }
        else{
            pierwiastekW=k;
            }
        return pierwiastekW;
    }

    public static double pierwiastek(int S, int n, int k){
        int x=S+1;
        double y=((n-1)*x)+(S/Math.pow(x,n-1));
        if (x<0){
            x=-x;
        }
        if (y<0){
            y=-y;
        }
        while (y-x>Math.pow(10,-k)) {
            x = x + 1;
        }
        return x;
    }
    public static int podciag(int[] tab){
        int k=1;
        int m=1;
        for (int i = 0; i < tab.length-1; i++) {
            if(tab[i]>tab[i+1]) {
                k++;
            }
                if(k>m) {
                    m = k;
                }
            else{
                k=1;
            }
        }
        return m;
    }
    public static int ileCyfr (int n) {
        int ileCyfr=1;
        while (n>9) {
            n=n/10;
            ileCyfr++;
        }
        return ileCyfr;
    }
    public static boolean czyPalindrom (int n) {
        //najpierw sprawdzamy ile ma cyf, potem dzielimy na 2 i to bedzie nasz ogranicznik, nastepnie pierwsza cyfra porownujemy do ostatniacyfra
        boolean czyTakaSama = true;
        int k=0;
        int l;
        int o=0;
        int ostatnia=n;
        int m=1;
        for (int i=0;i<ileCyfr(n)/2;i++) {
            int pierwsza=n;
            while (pierwsza > 9 * m) {
                pierwsza = pierwsza / 10;
                if (pierwsza<10) {
                    k = pierwsza;
                }
                else {
                    k=k%10;}
            }
            l=ostatnia%10;
            if(k!=l) {
                o++;
            }
            czyTakaSama=o==0;
            m=m*10;
            ostatnia=n/10;
        }
        return czyTakaSama;
    }
    public static void palindromLiczbowy(int m){
        int k;
        for(int i = (int) Math.pow(10,m-1); i<(int)Math.pow(10,m); i++) {
            for (int j = (int) Math.pow(10, m - 1); j < (int) Math.pow(10, m); j++) {
                k=i*j;
                if(czyPalindrom(k)==true) {
                    System.out.println(i+"x"+j +"="+k);
                }
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(dokladnosc(2,3,4));
        System.out.println(pierwiastek(2,3,4));
        System.out.println(najblizszySasiad(20));
        System.out.println(podciag(new int[]{1,2,3,5,4}));
        System.out.println(czyPalindrom(11));
        palindromLiczbowy(2);

    }
}
