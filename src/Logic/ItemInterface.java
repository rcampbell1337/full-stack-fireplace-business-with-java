package src.Logic;

interface ItemInterface {
    
    // Create abstract method for insertion to be overriden
    public abstract void insertIntoDB();

    // Create abstract method for updating to be written
    public abstract void updateRowInDB();

    // Create abstract method for retrieving supplier from db
    public abstract Item getFromDB(int id);

    // Create abstract method for returning all information
    public abstract String[] getAllInfo();

    // Create abstract method for getting the type of class
    public abstract ItemType getItemType();

    // Create abstract method for getting the id
    public abstract int getId();
}