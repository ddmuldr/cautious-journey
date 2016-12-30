package hello;

@Component
public class MessagePrinter {
    final private MessageService service;

    @Autowired
    public MessagePrinter(MessageService service) {
        this.service = service;
    }

    public voild printMessage() {
        System.out.println(this.service.getMessage());
    }
}