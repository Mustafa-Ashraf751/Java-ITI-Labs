package exception;

public class ItemNotFoundException extends RuntimeException {
    private String resourceName;
    private Long resourceId;

    public ItemNotFoundException() {
    }

    public ItemNotFoundException(String message) {
        super(message);
    }

    public ItemNotFoundException(String resourceName,Long id){
        super(String.format("%s with ID %d is not found",resourceName,id));
        this.resourceName = resourceName;
        this.resourceId = id;
    }

}
