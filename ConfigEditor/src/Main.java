import javax.swing.SwingUtilities;

public class Main
{
    public static void main(String args[])
    {
        SwingUtilities.invokeLater(new Runnable()
        {
            @Override
            public void run()
            {
                MainWindow.setStyle();
                
                MainWindow w = new MainWindow();
                
                w.setVisible(true);
            }
        });
    }
}
