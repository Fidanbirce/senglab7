public class Building {
    private String name;
    private Room roomType;
    private int numofrooms;
    private Owner[] owners;

    public Building(String name,Room roomType,int numofrooms){
        this.name=name;
        this.roomType=roomType;
        this.numofrooms=numofrooms;
    }
    public Building(String name,Room roomType,int numofrooms,Owner[] owners){
        this.name=name;
        this.roomType=roomType;
        this.numofrooms=numofrooms;
        this.owners=owners;
    }
    public String getName(){return name;}
    public void  setName(){ this.name=name;}
    public Room getRoomType(){return roomType;}
    public void setRoomType(){this.roomType=roomType;}
    public int getNumofrooms(){return numofrooms;}
    public void setNumofrooms(){this.numofrooms=numofrooms;}
    public Owner[] getOwners() {return owners;}
    public void setOwners(Owner[] owners){this.owners=owners;}

    public double getTotalArea(){
        return roomType.getSizeM2()*numofrooms;
    }
    public void DisplayAllOwners(){
        if(owners==null){
            System.out.println("no owner.");
            return;
        }
        for(Owner o:owners){
            System.out.println(o);
        }
    }
}
