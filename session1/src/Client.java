
public class Client {
int clientId;
String clientName;
String clientAddress;

Client(){
	System.out.println(clientId+" "+clientName+" "+clientAddress);

	
}	//default constructor

Client(int i,String n,String a){		//parameterized constructor
	clientId=i;
	clientName=n;
	clientAddress=a;
}
    void display(){
    	
	System.out.println(clientId+" "+clientName+" "+clientAddress);
}
    /*void display(int i,String n,String a){
    	clientId=i;
    	clientName=n;
    	clientAddress=a;
    	System.out.println(clientId+" "+clientName+" "+clientAddress);
    }*/
    
    public static void main(String[] args) {
		Client c1=new Client(101,"Vijay","Mumbai");
		Client c2=new Client(201,"Vinay","Chennai");
		//Client c3=new Client();
		c1.display();
		c2.display();
		//Client c3=new Client();
		//c3.display();
		//c3.display(103,"Vijay","Mumbai");
		//Client c2=new Client();
		//c1.displayClient c1=new Client(101,"Vijay","Mumbai");
		//Client c2=new Client(201,"Vinay","Chennai"););
		//c2.display(201,"Vinay","Chennai");
	}
    
}
