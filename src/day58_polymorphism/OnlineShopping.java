package day58_polymorphism;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public abstract class OnlineShopping {
    public abstract void buy();
    public abstract void sell();
    public void ship(){
        System.out.println("Shipping purchased items");
    }

}
