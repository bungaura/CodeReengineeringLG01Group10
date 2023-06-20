
class emailHandler {
	String targetEmail;
	EmailService emailService;

	public emailHandler(String targetEmail) {
		this.targetEmail = targetEmail;
		this.emailService = new EmailService();
	}

	public void sendEmail(String subject, String message) {
		emailService.sendEmail(targetEmail, subject, message);
	}
}

public class Main {
	 public static void main(String[] args) {
		EmailService emailService = new EmailService();
		emailService.sendEmail("john.doe@example.com", "Hello", "This is a test email.");
	}
}
