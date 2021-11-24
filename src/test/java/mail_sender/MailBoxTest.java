package mail_sender;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class MailBoxTest {
    public MailBox mailBox;
    public MailSender mailSender;
    public Client client;
    public MailInfo mailInfo;
    public ArrayList<MailInfo> infosTest;
    @BeforeEach
    void setUp() {
        mailBox = new MailBox();
        mailSender = new MailSender();
        client = new Client("Tim", 20, Gender.MALE, "tim.email@gmail.com");
        mailInfo = new MailInfo(client, MailCode.GREETINGS);

        infosTest = new ArrayList<MailInfo>();
        infosTest.add(mailInfo);
    }

    @Test
    void addMailInfo() {
        mailBox.addMailInfo(mailInfo);
        assertEquals(mailBox.getInfos(), infosTest);
    }
}