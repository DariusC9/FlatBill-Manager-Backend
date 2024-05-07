package com.DariusC9.FlatBillManagerBackend.database;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PrivacyData {
    private List<String> data;
    public PrivacyData() {

        String privacyPolicy = "Privacy Policy Summary\n\n"
                + "- Data Collection: We collect personal information, including name, email, and usage data, to improve our services and user experience.\n\n"
                + "- Data Usage: Your information is used for account management, communication, and service personalization purposes.\n\n"
                + "- Data AppConfig: We employ industry-standard security measures to protect your data from unauthorized access or disclosure.\n\n"
                + "- Third-Party Sharing: Your data may be shared with trusted third parties for processing payments, providing services, or legal compliance purposes.\n\n"
                + "- User Rights: You have the right to access, correct, or delete your personal information. Contact us for assistance or inquiries regarding your privacy.\n";
        data = new ArrayList<>(Arrays.asList(privacyPolicy));
    }
    public List<String> getData() { return data; }
}
