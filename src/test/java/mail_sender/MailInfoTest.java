package mail_sender;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MailInfoTest {
    public Client client;
    public MailInfo mailInfo;
    @BeforeEach
    void setUp() {
        client = new Client("Tim", 20, Gender.MALE, "tim.email@gmail.com");
        mailInfo = new MailInfo(client, MailCode.HAPPY_BIRTHDAY);
    }

    @Test
    void getMailText() {
        assertEquals(mailInfo.getMailText(), "Tim! Happy birthday!\r\n");
    }

    @Test
    void getClientEmail() {
        assertEquals(mailInfo.getClientEmail(), "tim.email@gmail.com");
    }
}