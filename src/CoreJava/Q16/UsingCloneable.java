package CoreJava.Q16;

public class UsingCloneable implements Cloneable{
        int rollno;
        String name;

        UsingCloneable(String name,int rollno){
            this.rollno=rollno;
            this.name=name;
        }

        public Object clone()throws CloneNotSupportedException{
            return super.clone();
        }

        public static void main(String args[]){
            try{
                UsingCloneable o1=new UsingCloneable("Vaishali",37);
                System.out.println("Details of Student1:"+o1.name+" "+o1.rollno);

                //Cloning o1 in o2 using clone method
                UsingCloneable o2=(UsingCloneable)o1.clone();

                System.out.println("Details of Student2:"+o1.name+" "+o1.rollno);

            }catch(CloneNotSupportedException c){}

        }

}
