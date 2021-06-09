
package structural.composite;


public class CompositeTest {
    public static void main(String[] args) {
       Component hd = new Leaf(4000,"HHD");
       Component mouse = new Leaf(1400,"Mouse");
       Component ram = new Leaf(2400,"Ram");
       Component cpu = new Leaf(7000,"CPU");
       Component monitor = new Leaf(200,"Monitor");
       Component speaker = new Leaf(1500,"Speaker");
       
       
       Composite deepak = new Composite("Deepak");
       Composite kasyap = new Composite("Kasyap");
       Composite manohar = new Composite("Manohar");
       Composite shanu = new Composite("Shannu");
       
       Composite computer = new Composite("Computer");
       
       deepak.addComponent(hd);
       deepak.addComponent(speaker);
       
       kasyap.addComponent(cpu);
       kasyap.addComponent(monitor);
       
       manohar.addComponent(mouse);
       manohar.addComponent(hd);
       
       shanu.addComponent(ram);
       shanu.addComponent(monitor);
       
       
       computer.addComponent(deepak);
       computer.addComponent(kasyap);
       computer.addComponent(manohar);
       computer.addComponent(shanu);
       
       
       ram.showPrice();
        
    }
    
}
