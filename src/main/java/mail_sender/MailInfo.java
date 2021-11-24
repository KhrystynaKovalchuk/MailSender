package mail_sender;

import java.util.HashMap;

public class MailInfo {
    private MailCode mailCode;
    private Client client;

    public MailInfo(Client clientInfo, MailCode mailCodeInfo) {
        client = clientInfo;
        mailCode = mailCodeInfo;
    }

    public String getMailText(){
        String text = mailCode.generateText();
        HashMap<String, String> templates = new HashMap<String, String>();
        templates.put("%NAME%", client.getName());
        // iterate over all keys and replace a specific template
        for (String key: templates.keySet()){
            text = text.replace(key, templates.get(key));
        }
        return text;
    }

    public String getClientEmail() {
        return client.getEmail();
    }
}
