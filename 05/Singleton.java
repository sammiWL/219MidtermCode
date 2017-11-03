class Singleton {
    private static Singleton instance = new Singleton(); // eager init
    private Singleton() { }
    public static Singleton getInstance() {
	return instance; //return only this instance
    }
    public synchronized static Singleton getInstanceSync() { // lazy init
	return instance == null ? new Singleton() : instance;
    }
}
