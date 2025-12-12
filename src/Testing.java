public class Testing {
    public static void main(String [] args){

                Room guestRoom = new Room("Guest Room", 3, 40.0);

                Building blueHotel = new Building("BlueHotel", guestRoom, 50);


                System.out.println("Total area of BlueHotel: " + blueHotel.getTotalArea() + " m2");


                Owner owner1 = new Owner("Emir", 123);
                Owner owner2 = new Owner("Zeynep", 456);

                Owner[] ownerList = new Owner[2];
                ownerList[0] = owner1;
                ownerList[1] = owner2;


                Building b2 = new Building("Hotel XYZ", guestRoom, 25, ownerList);




                System.out.println("\nOwners of Hotel XYZ:");
                b2.DisplayAllOwners();




                System.out.println("\nFirst owner information:");
                System.out.println("Name: " + ownerList[0].getName());
                System.out.println("Date: " + ownerList[0].getDate());


                Owner[] copiedOwners = b2.getOwners();

                System.out.println("\nCopied owners array:");
                for (Owner o : copiedOwners) {
                    System.out.println(o);
                }
            }
        }

