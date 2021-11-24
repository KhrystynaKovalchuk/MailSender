package mail_sender;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter @ToString
public class Client {
    private String name;
    private int age;
    private int id;
    private Gender sex;
    private String email;

    public Client(String clientName, int clientAge, Gender clientSex, String clientEmail){
        id = ClientIDGenerator.generateID();
        name = clientName;
        age = clientAge;
        sex = clientSex;
        email = clientEmail;
    }

    public static class ClientIDGenerator {
        private static int counter = 0;

        public static int generateID(){
            counter++;
            return counter;
        }
    }
}
