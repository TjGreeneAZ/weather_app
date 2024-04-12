import javax.swing.*;

public class AppLauncher {
    public static void main(String[] args) {
        // invokeLater makes gui updates more thread safe
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                //display the weatherapp gui
                new WeatherAppGui().setVisible(true);

                //System.out.println(WeatherApp.getLocationData("Tokyo"));
                //System.out.println(WeatherApp.getCurrentTime());
            }
        });
    }
}
