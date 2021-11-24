import mail_sender.*;

public class Main {
    public static void main(String[] args) {
        MailBox mailBox = new MailBox();
        MailSender mailSender = new MailSender();
        Client client1 = new Client("Tim", 20, Gender.MALE, "tim.email@gmail.com");
        Client client2 = new Client("Leo", 90, Gender.MALE, "leo.email@gmail.com");


        MailInfo mailInfo1 = new MailInfo(client1, MailCode.GREETINGS);
        MailInfo mailInfo2 = new MailInfo(client2, MailCode.HAPPY_BIRTHDAY);

        mailBox.addMailInfo(mailInfo1);
        mailBox.addMailInfo(mailInfo2);

        mailBox.sendAll(mailSender);

    }
}
