public class Clients {

    public static void main(String[] args) {
        Client client1 = new Client (29, false, "a@aaa.pl", "name", "surname","+483271923");
        System.out.println("client1.id = " + client1.id);

        Client client2 = new Client (35, true, "jajh@iaus.pl", "jan", "Kowalski", "+4865781612");
        System.out.println("client2.id = " + client2.id);

        Client client3= new Client (10, true, "Kid@gmail.com", "Kid", "Kidowski", "no phone");
        System.out.println("client3.id = " + client3.id);

        int clientNumber = 3;
        String [] regularClientsEmails = new String [clientNumber];
        Client [] clients = new Client [clientNumber];
        clients[0]=client1;
        clients[1]=client2;
        clients[2]=client3;
        for ( int i=0; i<clientNumber; i++){
            System.out.println("clients[" +i+ "] discount = " + clients[i].getDiscount());
        }

        for ( int i=0; i<clientNumber; i++){
            if (clients[i].isRegular){
                regularClientsEmails[i]=clients[i].email;
            }
        }

        System.out.println("Regular clients:");
        for ( int i=0; i<clientNumber; i++){
            if (regularClientsEmails[i] != null){
                System.out.println(regularClientsEmails[i]);
            }
        }
        int averageDiscout = 0;
        int sum=0;
        for ( int i=0; i<clientNumber; i++){
            sum += clients[i].getDiscount();
        }
        averageDiscout=sum/clientNumber;

        System.out.println("averageDiscout = " + averageDiscout);


    }
}


// Static means that it can be used in (one field for all objects in class