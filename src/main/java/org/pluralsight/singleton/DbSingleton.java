package org.pluralsight.singleton;

public class DbSingleton {
    private static DbSingleton dbsingleton=null;
	public static DbSingleton getInstance() {
		if(dbsingleton==null)
			synchronized (DbSingleton.class) {
			
				if(dbsingleton==null)
				{
					dbsingleton=new DbSingleton();
				}
				
			}
			
			return dbsingleton;
	}
	private DbSingleton() {
		
	}
	
	

}
