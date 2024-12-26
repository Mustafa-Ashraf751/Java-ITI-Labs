package exception;

public class ItemNotFoundException extends RuntimeException {
    private String resourceName;
    private String resourceId;

    public ItemNotFoundException() {
    }

    public ItemNotFoundException(String message) {
        super(message);
    }

    public ItemNotFoundException(String resourceName,String id){
        super(String.format("%s with ID %s is not found",resourceName,id));
        this.resourceName = resourceName;
        this.resourceId = id;
    }

}
