package StructuralPatterns.Adapter.Structure;

/**
 * 2 Client Interface
 *
 * The Client Interface describes a protocol that other classes must
 * follow to be able to collaborate with the client code.
 */
public interface IClientInterface {
    public String method(String data);
}
