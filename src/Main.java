public class Main {
    public static void main(String[] args) {
        ComplexNumber cn1 = new ComplexNumber(2.3412, 7.2434);
        ComplexNumber cn2 = new ComplexNumber(2.3412, 7.2434);
        ComplexNumber cn3 = new ComplexNumber(3.23124, 1435.23);
        System.out.println("equals cn1 & cn2 true // " + cn1.equals(cn2));
        System.out.println("equals cn2 & cn1 true // " + cn2.equals(cn1));
        System.out.println("equals cn2 & cn3 false // " + cn2.equals(cn3));
        System.out.println("equals cn3 & cn1 false // " + cn3.equals(cn1));
        System.out.println("hash cn1 & cn2 true // " + (cn1.hashCode() == cn2.hashCode()));
        System.out.println("hash cn2 & cn1 true // " + (cn2.hashCode() == cn1.hashCode()));
        System.out.println("hash cn3 & cn1 false // " + (cn3.hashCode() == cn1.hashCode()));
        System.out.println("hash cn3 & cn2 false // " + (cn3.hashCode() == cn2.hashCode()));

    }

    public static class ComplexNumber {
        private double re;
        private double im;

        public ComplexNumber() {
        }

        public ComplexNumber(double re, double im) {
            this.re = re;
            this.im = im;
        }

        public double getRe() {
            return re;
        }

        public double getIm() {
            return im;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            } else if (obj == null) {
                return false;
            } else if (getClass() != obj.getClass()) {
                return false;
            }

            ComplexNumber other = (ComplexNumber) obj;
            if (Double.compare(re, other.getRe()) != 0) {

                return false;
            } else if (Double.compare(im, other.getIm()) != 0) {
                return false;
            }
            return true;
        }

        @Override
        public int hashCode() {
            int result = 17;

            long reLong = Double.doubleToLongBits(re);
            result = 31 * result + (int) (reLong ^ (reLong >>> 32));

            long imLong = Double.doubleToLongBits(im);
            result = 31 * result + (int) (imLong ^ (imLong >>> 32));


            return result;
        }

    }
}
