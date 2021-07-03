package day57_abstraction_polymorphism.abstract_class_vs_interface;
// used to achieve abstraction in java

import java.io.Serializable;

public interface InterfaceB extends InterfaceA, Serializable, Cloneable {

    /* interface can extend multiple other interfaces --> multi inheritance
    * when it extends other interface, child interface is not responsible
    * to override any methods
    * concrete sub is responsible for overriding */

     /* MARKER INTERFACE --> interface without any methods or variables
    Marker can be used for polymorphism or to mark class as capable
    of whatever interface claims */

}
