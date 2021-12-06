package slg.slgg.responses.message;


public enum CustomSuccessEnum {


    SUCCESS_SLG_ASSIGNMENT_ADD (123305,"Assignment Added Successfully");
    private int messageCode;
    private String message;

    private CustomSuccessEnum(int messageCode, String message) {
        this.messageCode = messageCode;
        this.message = message;
    }

    public int getMessageCode() {
        return messageCode;
    }

    public String getMessage() {
        return message;
    }

    @Override
    public String toString() {
        return "CustomSuccessEnum{" +
                "messageCode=" + messageCode +
                ", message='" + message + '\'' +
                '}';
    }
}
