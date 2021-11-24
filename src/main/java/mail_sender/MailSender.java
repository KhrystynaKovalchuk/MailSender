package mail_sender;

public class MailSender {
    public void sendMail(MailInfo mailInfo) {
        // any type of message sending could be implemented (e.g. SendGrid)
        System.out.println("Message has been send to " + mailInfo.getClientEmail());
        System.out.println("Mail content:\n" + mailInfo.getMailText());
    }
}
