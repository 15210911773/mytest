package ioc;

public class ShiyanlouImpl implements Shiyanlou {

	@Override
	public String toUp(String s) {
		if(s != null && !s.equals("")) {
			try {
				s = s.toUpperCase();
				return s;
			} catch (Exception e) {
				e.printStackTrace();
			} 
		}
		return null;
	}

}
