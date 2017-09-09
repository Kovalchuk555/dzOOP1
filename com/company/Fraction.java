package com.company;

/**
 * Created by пк on 09.09.2017.
 */
public class Fraction {

        private  int chislitel;
        private int znamenatel ;

        Fraction (int chislitel,int znamenatel){
            this.chislitel=chislitel;
            this.znamenatel=znamenatel;}
        public int getChislitel(){return chislitel;}
        public void setChislitel(){this.chislitel=chislitel;}
        public int getZnamenatel(){return znamenatel;}
        public void setZnamenatel(){this.znamenatel=znamenatel;}

        public Fraction getInverseFraction( ) {
            return new Fraction(this.znamenatel,this.chislitel);
        }




        @Override
        public String toString() {
            return "\nchislitel=" + chislitel +
                    "\n znamenatel=" + znamenatel;


        }

        public Fraction multiply (Fraction f2){
            Fraction result=new Fraction(

                    this.chislitel*f2.chislitel,
                    this.znamenatel*f2.znamenatel);
            return result;}
        public Fraction division  (Fraction f2){

            Fraction  div =new Fraction(

                    this.chislitel*f2.znamenatel,
                    this.znamenatel*f2.chislitel);
            return div;}

        public Fraction addition  (Fraction f2){
            Fraction add=new Fraction(

                    this.chislitel*f2.znamenatel+this.znamenatel*f2.chislitel,
                    this.znamenatel*f2.znamenatel);
            return  add; }
        public Fraction derogation (Fraction f2){
            Fraction der=new Fraction(

                    this.chislitel*f2.znamenatel,
                    this.znamenatel*f2.chislitel);
            return der;}
    }



