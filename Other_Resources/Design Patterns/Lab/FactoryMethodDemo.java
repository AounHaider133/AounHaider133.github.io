// Factory Method
abstract class Notification {
    abstract void notifyUser();
}

class EmailNotification extends Notification {
    @Override
    void notifyUser() {
        System.out.println("Sending Email Notification.");
    }
}

class SMSNotification extends Notification {
    @Override
    void notifyUser() {
        System.out.println("Sending SMS Notification.");
    }
}

abstract class NotificationFactory {
    abstract Notification createNotification();
}

class EmailFactory extends NotificationFactory {
    @Override
    Notification createNotification() {
        return new EmailNotification();
    }
}

class SMSFactory extends NotificationFactory {
    @Override
    Notification createNotification() {
        return new SMSNotification();
    }
}

public class FactoryMethodDemo {
    public static void main(String[] args) {
        NotificationFactory factory = new EmailFactory();
        Notification notification = factory.createNotification();
        notification.notifyUser(); // Output: Sending Email Notification.
    }
}
