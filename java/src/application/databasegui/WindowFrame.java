package application.databasegui;

import javax.swing.*;
import java.awt.event.ActionListener;

/**
 * @author Joseph Pariseau
 */
public class WindowFrame extends JFrame {
    final private JPanel CONTAINER = new JPanel();
    final ContentPanel CONTENT = new ContentPanel();
    final JScrollPane CONTENT_SCROLL = new JScrollPane(CONTENT);
    final ActionPanel ACTION_FRAME = new ActionPanel();

    WindowFrame() {
        setTitle("SCBS Repair Tracker");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public void initialize() {
        CONTAINER.removeAll();

        CONTAINER.add(ACTION_FRAME);
        CONTAINER.add(CONTENT_SCROLL);

        CONTAINER.setLayout(new BoxLayout(CONTAINER, BoxLayout.PAGE_AXIS));
        setContentPane(CONTAINER);
    }

    void setActionListeners(ActionListener[] listeners) {
        ACTION_FRAME.setActionBarListeners(listeners);
    }

    public void setContent(Object array) {
        CONTENT.setContent(array);
    }
}
