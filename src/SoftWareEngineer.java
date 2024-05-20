public class SoftWareEngineer {
    ///attributes
    //syntax type + Name + vale;
    String Name;
    String Programing_language;
    String Fav_coding_pro;

    //constructor
    //syntax of constructor = className + ( pass attributes ) + {this.attributes;}

    SoftWareEngineer(String Name,  String Programing_language, String Fav_coding_pro){
        this.Name= Name;
        this.Programing_language = Programing_language;
        this.Fav_coding_pro = Fav_coding_pro;
    }

    //syntax of method = return type + method Name + () +{}

    //Write
    //Code
    //Run

    void Write(){
        System.out.println("SoftWareEngineer can Write");
    }
    void code(){
        System.out.println("SoftWareEngineer can code");
    }
    void Run(){
        System.out.println("SoftWareEngineer can Run");
    }

    void info(){
        System.out.println();
        System.out.println("Name="+Name);
        System.out.println("Programing_language="+Programing_language);
        System.out.println("Fav_coding_pro"+Fav_coding_pro);
    }
}
