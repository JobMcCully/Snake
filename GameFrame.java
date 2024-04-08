import javax.swing.JFrame;

public class GameFrame extends JFrame
{
	//Constructor, Initializes a new GameFrame
	GameFrame()
	{
		this.add(new GamePanel());
		this.setTitle("Snake");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.pack();	//Added components to the JFrame will be added to the GameFrame
		this.setVisible(true);
		this.setLocationRelativeTo(null); //Sets location of GameFrame to the
										  //middle of the screen
	}
}
