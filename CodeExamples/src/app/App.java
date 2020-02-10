package app;

public class App {
    public static void main(String[] args) throws Exception {
        
        //MethodReference mr = new MethodReference();
        Speak spk = MethodReference::sayingTruth;
        spk.sayingTruth();
    }
}