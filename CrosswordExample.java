import java.awt.*;
import java.util.ArrayList;

import javax.swing.*;
class CrosswordExample {

     Crossword getPuzzle(){

	Crossword c;
	String title = "An example puzzle";
	int size = 11;
	ArrayList<Clue> acrossClues = new ArrayList<Clue>();
	ArrayList<Clue> downClues = new ArrayList<Clue>();
	
        acrossClues.add( new Clue( 1, 1, 0, "Eager Involvement", "enthusiasm") );
        acrossClues.add( new Clue( 8, 0, 2, "Stream of water", "river") );
        acrossClues.add( new Clue( 9, 6, 2, "Take as one's own", "adopt") );
        acrossClues.add( new Clue( 10, 0, 4, "Ball game", "golf") );
        acrossClues.add( new Clue( 12, 5, 4, "Guard", "sentry") );
        acrossClues.add( new Clue( 14, 0, 6, "Language communication", "speech") );
        acrossClues.add( new Clue( 17, 7, 6, "Fruit", "plum") );
        acrossClues.add( new Clue( 21, 0, 8, "In addition", "extra") );
        acrossClues.add( new Clue( 22, 6, 8, "Boundary", "limit") );
        acrossClues.add( new Clue( 23, 0, 10, "Executives", "management") );
        downClues.add( new Clue( 2, 2, 0, "Pertaining to warships", "naval") );
        downClues.add( new Clue( 3, 4, 0, "Solid", "hard") );
        downClues.add( new Clue( 4, 6, 0, "Apportion", "share") );
        downClues.add( new Clue( 5, 8, 0, "Concerning", "about") );
        downClues.add( new Clue( 6, 10, 0, "Friendly", "matey") );
        downClues.add( new Clue( 7, 0, 1, "Boast", "brag") );
        downClues.add( new Clue( 11, 3, 4, "Enemy", "foe") );
        downClues.add( new Clue( 13, 7, 4, "Doze", "nap") );
        downClues.add( new Clue( 14, 0, 6, "Water vapour", "steam") );
        downClues.add( new Clue( 15, 2, 6, "Consumed", "eaten") );
        downClues.add( new Clue( 16, 4, 6, "Loud, resonant sound", "clang") );
        downClues.add( new Clue( 18, 8, 6, "Yellowish, citrus fruit", "lemon") );
        downClues.add( new Clue( 19, 10, 6 , "Mongrel dog", "mutt") );
        downClues.add( new Clue( 20, 6, 7, "Shut with force", "slam") );

	c = new Crossword(title,size,acrossClues,downClues);

	return c;
    }
     
    /* public static void main(String[] args)
     {
    	 CrosswordExample a = new CrosswordExample();
    	 JFrame test = new JFrame();
    	 a.getPuzzle();
    	 test.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	 test.setSize(300, 300);
    	 Container p = test.getContentPane();
    	 GridLayout grid = new GridLayout(11, 11, 2, 2);
    	 p.setLayout(grid);
    	 JPanel cell = new JPanel();
    	 cell.setLayout(new BorderLayout());
    	 cell.add(new JLabel("1"), BorderLayout.NORTH);
    	 cell.add(new JLabel("A"), BorderLayout.CENTER);
    	 for(int i = 0; i < 11; i++)
    		 for(int j = 0; j < 11; j++)
    			 p.add(new CellPanel());
    	 test.setVisible(true);
     }*/

}

