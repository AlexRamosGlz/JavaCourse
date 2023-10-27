package StructuralPatterns.Adapter.Structure;

/**
 * 4 Adapter
 *
 * The Adapter is a class that's able to work with both the client
 * and the service:
 *
 *      - it implements the client interface, while wrapping the service Object.
 *        The Adapter receives calls from the client via the client interface and translates
 *        them into calls to the wrapped service object in a format it can understand.
 */
public class Adapter implements IClientInterface {
    private Service adaptee;

    @Override
    public String method(String data) {
        // translates data so adaptee can work with it
        var specialData = convertToServiceFormat(data);
        return adaptee.serviceMethod(specialData);
    }

    public String convertToServiceFormat(String data) {
        StringBuilder translatedData = new StringBuilder("Translated Data");
        return translatedData;
    }
}
