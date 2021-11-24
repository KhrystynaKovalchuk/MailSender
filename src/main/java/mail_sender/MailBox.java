package mail_sender;

import java.util.ArrayList;

public class MailBox {
    ArrayList<MailInfo> infos;

    public MailBox() {
        infos = new ArrayList<MailInfo>();
    }

    public void addMailInfo(MailInfo mailInfo) {
        infos.add(mailInfo);
    }

    public ArrayList<MailInfo> getInfos() {
        return infos;
    }

    public void sendAll(MailSender mailSender) {
        for (int i = 0; i < infos.size(); i++) {
            mailSender.sendMail(infos.get(i));
        }
    }
}
