package UI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GeometryUI
{
    JFrame frame=new JFrame("UI.Geometry");
    JButton areaOfSqBtn=new JButton("Area of Square");
    JButton areaOfTriangleBtn=new JButton("Area of Triangle");
    JButton areaOfRectangleBtn=new JButton("Area of Rectangle");

    public void mainUI()
    {
        //adding the components
        frame.add(areaOfSqBtn);
        frame.add(areaOfTriangleBtn);
        frame.add(areaOfRectangleBtn);

        //setting the frame size-width,height
        frame.setSize(150, 200);

        //setting the layout(GridLayout) based on rows and columns
        frame.setLayout(new GridLayout(3, 1));

        //setting the frame visibility
        frame.setVisible(true);



        areaOfSqBtn.addActionListener(
                new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e) {

                drawAreaOfSquareUI();


            }
        });

    }

        JFrame areaOfSquareFrame=new JFrame("Area of Square");
        JTextField enterLengthOfSquare=new JTextField(("Enter Length:"));
        JButton calculateAreaOfSquare=new JButton("Calculate");

        public void drawAreaOfSquareUI(){
            Geometry geo = new Geometry();
            areaOfSquareFrame.add(enterLengthOfSquare);
            areaOfSquareFrame.add(calculateAreaOfSquare);
            areaOfSquareFrame.setSize(150,200);
            areaOfSquareFrame.setLayout(new GridLayout(2,1));
            areaOfSquareFrame.setVisible(true);

//            frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            calculateAreaOfSquare.addActionListener(new ActionListener()
            {
                @Override
                public void actionPerformed(ActionEvent e) {
                    try {
                        float area=geo.areaOfSquare(Float.parseFloat(enterLengthOfSquare.getText()));
                        JOptionPane.showMessageDialog(null,area);
                        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

                    }
                    catch(Exception eme){
                        System.out.println("Error!!");
                    }

                }
            });
        }


    }

