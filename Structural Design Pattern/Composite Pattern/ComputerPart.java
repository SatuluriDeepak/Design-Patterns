

import java.util.ArrayList;

interface Component{
    void showPrice();
}
class Leaf implements Component{
    int price;
    String name;

    public Leaf(int price, String name) {
        this.price = price;
        this.name = name;
    }
    @Override
    public void showPrice() {
        System.out.println(name +" : "+price);
        
    }
    
    
}
//Class for sub - folders
class Composite implements Component{
    String name;
    ArrayList<Component> components = new ArrayList<>();
    
    public void addComponent(Component com){
        components.add(com);
      
    }

    public Composite(String name) {
        this.name = name;
    }

    @Override
    public void showPrice() {
        System.out.println(name);
        for(Component c:components){
            c.showPrice();
        }
        
    }
    
    
}

