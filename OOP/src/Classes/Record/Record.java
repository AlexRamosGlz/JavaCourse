package Classes.Record;

/**
 * Records
 *
 * Record is a spcial class that contains data, that's not meant to be altered
 */
public record Record(int field1, String field2, boolean field3) {
    /*
     *  the part that's in parentheses, is called the record header.
     *
     *  The Record Header consist of record components, a comma delimited list
     *  of components.
     *
     *  For each component in the header, Java generates:
     *
     *      -> A field with the same name and declared type as the record component
     *      -> The field is declared private field
     *      -> The field is sometimes referred to as a component field.
     *
     *  In addition to creating a private field for each component, Java generates a public accessor method
     *  for each component.  This method has the same name and type of the component, but it doesn't have any kind
     *  of special prefix, no get, or is, for example.
     *
     */
}

