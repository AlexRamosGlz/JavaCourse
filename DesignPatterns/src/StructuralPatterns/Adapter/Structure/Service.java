package StructuralPatterns.Adapter.Structure;

/**
 * 3 Service
 *
 * The Service is some useful class (usually 3rd-party or legacy).
 *
 * The client can't use this class directly because it has an incompatible
 * interface.
 */
public class Service {
    public String serviceMethod(Object data){
        //Some logic business and then returns something
        return "something";
    }
}
