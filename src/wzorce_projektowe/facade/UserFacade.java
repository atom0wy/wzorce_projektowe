package wzorce_projektowe.facade;

public class UserFacade {
    private final RegisterService registerService;
    private final SendNotificationService sendNotificationService;

    public UserFacade(RegisterService registerService, SendNotificationService sendNotificationService) {
        this.registerService = registerService;
        this.sendNotificationService = sendNotificationService;
    }

    public void register(String firstName, String lastName) {
        User user = new User();
        user.setFirstName(firstName);
        user.setLastName(lastName);

        this.registerService.register(user);
        this.sendNotificationService.sendMail();
    }
}