import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;

public class GUItype extends JFrame implements ActionListener{

    private JPanel panelCar = new JPanel();
    private JLabel carLabel;
    Car car;
    private JComboBox<Object> carColors;
    private JComboBox<Object> carEngine;
    private JComboBox<Object> carTires;
    private JComboBox<Object> carOption1;
    private JComboBox<Object> carOption2;
    int num;




    public GUItype(String title, Car carIn){
        super(title);
        this.car = carIn;
        System.out.println(title);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setSize(930, 600);

        panelCar.setBackground(Color.black);

        carColors = new JComboBox<>(car.options.get(0).toArray());
        carEngine = new JComboBox<>(car.options.get(1).toArray());
        carTires = new JComboBox<>(car.options.get(2).toArray());
        carOption1 = new JComboBox<>(car.options.get(3).toArray());
        carOption2 = new JComboBox<>(car.options.get(4).toArray());


        carColors.addActionListener(this);
        carEngine.addActionListener(this);
        carTires.addActionListener(this);
        carOption1.addActionListener(this);
        carOption2.addActionListener(this);

        carColors.setActionCommand("color");
        carEngine.setActionCommand("engine");
        carTires.setActionCommand("tires");
        carOption1.setActionCommand("option1");
        carOption2.setActionCommand("option2");

        car.setColor(car.options.get(0).get(0));
        car.setEngine(car.options.get(1).get(0));
        car.setTires(car.options.get(2).get(0));
        car.setOption1(car.options.get(3).get(0));
        car.setOption2(car.options.get(4).get(0));


        this.setLayout(new GridLayout(3, 4));
        carLabel = new JLabel(car.displayResult(), SwingConstants.CENTER);
        carLabel.setHorizontalAlignment(JLabel.CENTER);

        initPanel(title);
        initType(title);

    }

    private void initPanel(String title) {
        changePanel(panelCar);
    }

    private void initType(String title){
        add(carColors);
        add(carEngine);
        add(carTires);
        add(carOption1);
        add(carOption2);
        add(carLabel);
        carLabel.setHorizontalAlignment(JLabel.CENTER);

    }

    public void changePanel(JPanel panel) {
        getContentPane().removeAll();
        getContentPane().add(panel);
        setLayout(new GridLayout(4,4));
        getContentPane().doLayout();
        update(getGraphics());

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String origin = e.getActionCommand();
        System.out.print(origin);
        num = 0;
        switch (origin) {
            case "color":
                num = carColors.getSelectedIndex();
                int[] rgbColors = car.colorToRGB(car.options.get(0).get(num));
                panelCar.setBackground(new Color(rgbColors[0], rgbColors[1], rgbColors[2]));
                car.setColor(car.options.get(0).get(num));
                break;
            case "engine":
                num = carEngine.getSelectedIndex();
                car.setEngine(car.options.get(1).get(num));
                break;
            case "tires":
                num = carTires.getSelectedIndex();
                car.setTires(car.options.get(2).get(num));
                break;
            case "option1":
                num = carOption1.getSelectedIndex();
                car.setOption1(car.options.get(3).get(num));
                break;
            case "option2":
                num = carOption2.getSelectedIndex();
                car.setOption2(car.options.get(4).get(num));
                break;
        }
        carLabel.setText(car.displayResult());

    }

    public static void main(String args[]){
        GUItype type = new GUItype("SUV", new SUV());
        type.setLocationRelativeTo(null);
        type.setVisible(true);

    }


}