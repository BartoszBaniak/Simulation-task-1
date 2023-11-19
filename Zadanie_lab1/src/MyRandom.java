public class MyRandom {
    private int seed;
    private int a;
    private int b;
    private int M;
    private double low;
    private double high;

    public MyRandom(int seed, int a, int b, int M, double low, double high) {
        this.seed = seed;
        this.a = a;
        this.b = b;
        this.M = M;
        this.low = low;
        this.high = high;
    }

    public int nextInt() {
        seed = (a * seed + b) % M;
        return seed;
    }

    public double nextDouble() {
        double random = nextInt();
        random = random / M;
        return random;
    }


    public double nextDouble(double low, double high) {
        double random = nextDouble();
        double seed = low + (high - low) * random;
        return seed;
    }

    public double Exponential(double lambda) {
        double random = nextDouble();
        double seed = -(Math.log(1-random)/lambda);
        return seed;
    }

    public double rozklad1() {
        double random = nextDouble();
        double x;
        if(random >= 0 && random < 0.5) {
            x = 2*random - 1;
            System.out.println("random1: " + random);
            System.out.println("x1: " + x);
        }

        if(random >= 0.5 && random < 1) {
            x = 4*random - 2;
            System.out.println("random2: " + random);
            System.out.println("x2: " + x);
        }
        return random;
    }

    public double dyskret(double[] xx, double[] p) {
        double u = nextDouble();
        double sum = 0;
        for(int i = 0; i < p.length; i++) {
            sum += p[i];
            if(u <= sum) {
                return xx[i];
            }
        }
        throw new RuntimeException();
    }
}
