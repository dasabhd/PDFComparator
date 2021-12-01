package com.utilities;

/**
 * The type Get file name.
 */
public class GetFileName {

	/**
	 * Gets file name.
	 *
	 * @param path the path
	 * @return the file name
	 */
	public static String getFileName(String path) {
		
		//path = "D:\\Miscellaneous\\Durgapur Govt Collage.pdf";
		
		int dot_location = 0;
		
		for(int i=0;i<path.length();i++)
		{
			if(path.charAt(i)=='.') {
				dot_location = i;
			}
		}
		
		int slash_location = 0;
		
		for(int i=0;i<path.length();i++) {
			
			if(path.charAt(i)=='\\') {
				slash_location = i;
			}
			
		}
		
//		System.out.println(path.length());
//		System.out.println(slash_location);
		
		char[] n = new char[50];
		
		for(int i=slash_location+1;i<dot_location;i++) {
			
			n[i-(slash_location+1)] = path.charAt(i);
			
		}
		
		String FileName = String.valueOf(n).trim();
		System.out.println(FileName);
		return FileName;
	}
	
	/*
	public static void main(String args[]) {
		GetFileName name = new GetFileName();
		name.getFileName(null);
	}
	*/
}
