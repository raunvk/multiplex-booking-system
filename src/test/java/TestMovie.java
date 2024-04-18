

import com.multiplex.dao.*;
import com.multiplex.beans.*;

public class TestMovie {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Movie m = new Movie();
		
		m.setMovieName("RRR");
		
		MovieDAO mDAO = new MovieDAO();
		
		Movie m1 = mDAO.searchMovie(m);
		
		
		
		System.out.println(m1.getMovieName());
		
		

	}

}
