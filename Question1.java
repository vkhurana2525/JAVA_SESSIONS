
    public  class Question1{
        static String firstname="Vaishnavi";
        static String lastname="Khurana";
        static int age=21;
        public static void print(){
            System.out.println(firstname+" "+lastname+" "+age);
        }
        //Code written in static block will get executed first even before main method
        static{
            System.out.println(firstname+" "+lastname+" "+age+" in static block");
        }
        public static void main(String[] args){
            Question1 q1=new Question1();
            q1.print();
        }
    }
