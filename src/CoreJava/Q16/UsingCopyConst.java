package CoreJava.Q16;

public class UsingCopyConst {
        int rollno;
        String name;

        UsingCopyConst(String name,int rollno){
            this.rollno=rollno;
            this.name=name;
        }

        //creating a copy constructor
        UsingCopyConst(UsingCopyConst object)
        {
            System.out.println("\nAfter invoking the Copy Constructor:\n");
            name=object.name;
            rollno=object.rollno;
        }


        public static void main(String args[])
        {
            UsingCopyConst ob1=new UsingCopyConst("Vaishali",37);
            System.out.println("Name of the first Student: "+ob1.name);
            System.out.println("Roll number of the first Stduent: "+ob1.rollno );

            //passing the parameters to the copy constructor
            UsingCopyConst ob2 = new UsingCopyConst(ob1);
            System.out.println("Name of the Second Student: "+ob2.name);
            System.out.println("Roll number of the Second Stduent: "+ob2.rollno );
        }

}
