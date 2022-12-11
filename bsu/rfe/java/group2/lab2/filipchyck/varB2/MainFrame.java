package bsu.rfe.java.group2.lab2.filipchyck.varB2;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import java.lang.Math;

@SuppressWarnings("serial")
public class MainFrame extends JFrame {
	private static final int WIDTH = 500;
    private static final int HEIGHT = 520;
   
    private JTextField textFieldX;
    private JTextField textFieldY;
    private JTextField textFieldZ;
    private JTextField textFieldmem1;
    private JTextField textFieldmem2;
    private JTextField textFieldmem3;
    private JTextField textFieldResult;
   
    private ButtonGroup radioButtons = new ButtonGroup();
    private ButtonGroup radioButtons1 = new ButtonGroup();
    
    private Box hboxFormulaType = Box.createHorizontalBox();
    private Box hboxmemType = Box.createHorizontalBox();
    private int memid=3;
    private int formulaId = 1;
 
    public Double calculate1(Double x, Double y, Double z){
        return  Math.sqrt(Math.sqrt( Math.log(z) + x*x*Math.PI ))/Math.pow((y*y+Math.pow(Math.E,Math.cos(x))+Math.sin(y)),Math.sin(y));
    }
	public Double calculate2(Double x, Double y, Double z) {
        return Math.sqrt(y)*3*Math.pow(z, x)/Math.sqrt(1+Math.pow(y,3));
    }
    private void addRadioButton(String buttonName, final int formulaId) {
        JRadioButton button = new JRadioButton(buttonName);
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ev) {
                MainFrame.this.formulaId = formulaId;
           
               
            }
        });

        radioButtons.add(button);
        hboxFormulaType.add(button);
        
        
    }
    private void addRadioButton1(String buttonName1,final int memid) {
        JRadioButton button1 = new JRadioButton(buttonName1);
        button1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ev) {
        
                MainFrame.this.memid = memid;
               
            }
        });
        radioButtons1.add(button1);
        hboxmemType.add(button1);}
	public MainFrame() {
	        setSize(WIDTH, HEIGHT);
	        Toolkit kit = Toolkit.getDefaultToolkit();
	        setLocation((kit.getScreenSize().width - WIDTH)/2,
	                (kit.getScreenSize().height - HEIGHT)/2);
	        hboxFormulaType.add(Box.createHorizontalGlue());
	        addRadioButton("Формула 1", 1);
	        addRadioButton("Формула 2", 2);
	        radioButtons.setSelected(
	                radioButtons.getElements().nextElement().getModel(), true);
	        hboxFormulaType.add(Box.createHorizontalGlue());
	        hboxFormulaType.setBorder(
	                BorderFactory.createLineBorder(Color.YELLOW));
	        JLabel labelForX = new JLabel("X:");
	        textFieldX = new JTextField("0", 15);
	        textFieldX.setMaximumSize(textFieldX.getPreferredSize());
	        JLabel labelForY = new JLabel("Y:");
	        textFieldY = new JTextField("0", 15);
	        textFieldY.setMaximumSize(textFieldY.getPreferredSize());
	        JLabel labelForZ = new JLabel("Z:");
	        textFieldZ = new JTextField("0", 15);
	        textFieldZ.setMaximumSize(textFieldZ.getPreferredSize());
	        
	        Box hboxVariables = Box.createHorizontalBox();
	        hboxVariables.setBorder(
	                BorderFactory.createLineBorder(Color.RED));
	        hboxVariables.add(labelForX);
	        hboxVariables.add(Box.createHorizontalStrut(10));
	        hboxVariables.add(textFieldX);
	        hboxVariables.add(Box.createHorizontalStrut(100));
	        hboxVariables.add(Box.createHorizontalGlue());
	        hboxVariables.add(labelForY);
	        hboxVariables.add(Box.createHorizontalStrut(10));
	        hboxVariables.add(textFieldY);
	        hboxVariables.add(Box.createHorizontalStrut(100));
	        hboxVariables.add(Box.createHorizontalGlue());
	        hboxVariables.add(labelForZ);
	        hboxVariables.add(Box.createHorizontalStrut(10));
	        hboxVariables.add(textFieldZ);
	        
	        JLabel labelFormem1 = new JLabel("mem1:");
	        textFieldmem1 = new JTextField("0", 15);
	        textFieldmem1.setMaximumSize(textFieldmem1.getPreferredSize());
	        JLabel labelFormem2 = new JLabel("mem2:");
	        textFieldmem2 = new JTextField("0", 15);
	        textFieldmem2.setMaximumSize(textFieldmem2.getPreferredSize());
	        JLabel labelFormem3 = new JLabel("mem3:");
	        textFieldmem3 = new JTextField("0", 15);
	        textFieldmem3.setMaximumSize(textFieldmem3.getPreferredSize());
	        Box hboxmem = Box.createHorizontalBox();
	        hboxmem.setBorder(
	                BorderFactory.createLineBorder(Color.BLACK));
	    	        addRadioButton1("память 1", 3);
	    	        hboxmemType.add(Box.createHorizontalGlue());
	    	        addRadioButton1("память 2", 4);
	    	        hboxmemType.add(Box.createHorizontalGlue());
	    	        addRadioButton1("память 3", 5);
	    	        radioButtons1.setSelected(
	    	                radioButtons1.getElements().nextElement().getModel(), true);
	    	        hboxmemType.setBorder(BorderFactory.createLineBorder(Color.GREEN));
	
	        hboxmem.add(labelFormem1);
	        hboxmem.add(Box.createHorizontalStrut(10));
	        hboxmem.add(textFieldmem1);
	        hboxmem.add(Box.createHorizontalStrut(100));
	        hboxmem.add(Box.createHorizontalGlue());
	        hboxmem.add(labelFormem2);
	        hboxmem.add(Box.createHorizontalStrut(10));
	        hboxmem.add(textFieldmem2);
	        hboxmem.add(Box.createHorizontalStrut(100));
	        hboxmem.add(Box.createHorizontalGlue());
	        hboxmem.add(labelFormem3);
	        hboxmem.add(Box.createHorizontalStrut(10));
	        hboxmem.add(textFieldmem3);
	       
	        hboxmem.setBorder(
	                BorderFactory.createLineBorder(Color.BLACK));
	        JLabel labelForResult = new JLabel("Результат:");
	        textFieldResult = new JTextField("0", 20);
	        textFieldResult.setMaximumSize(
	                textFieldResult.getPreferredSize());
	        Box hboxResult = Box.createHorizontalBox();
	        hboxResult.add(Box.createHorizontalGlue());
	        hboxResult.add(labelForResult);
	        hboxResult.add(Box.createHorizontalStrut(10));
	        hboxResult.add(textFieldResult);
	        hboxResult.add(Box.createHorizontalGlue());
	        hboxResult.setBorder(BorderFactory.createLineBorder(Color.BLUE));
	        JButton buttonCalc = new JButton("Вычистлить");
	        buttonCalc.addActionListener(new ActionListener() {  
	            public void actionPerformed(ActionEvent ev) {
	                try {
	                    Double x = Double.parseDouble(textFieldX.getText());
	                    Double y = Double.parseDouble(textFieldY.getText());
	                    Double z = Double.parseDouble(textFieldZ.getText());
	                    Double scale= Math.pow(10, 3);
	                    Double result;
	                    if (formulaId==1) 
	                    	
	                        result =Math.ceil(calculate1(x, y,z)*scale)/scale;
	                    else
                        result =Math.ceil(calculate2(x, y,z)*scale)/scale;
	                   
	                   
	                    textFieldResult.setText(result.toString());
	                } catch (NumberFormatException ex) {
	                    JOptionPane.showMessageDialog(MainFrame.this,
	                            "Ошибка в формате записи числа с плавающей точкой", "Ошибочный формат числа",
	                            JOptionPane.WARNING_MESSAGE);
	                }
	            }
	        });
	        JButton buttonCalcplus = new JButton("M+");
	        buttonCalcplus.addActionListener(new ActionListener() {  Double result=0.0, mem1=0.0,mem2=0.0,mem3=0.0;
	            public void actionPerformed(ActionEvent ev) {
	                try {
	                    Double x = Double.parseDouble(textFieldX.getText());
	                    Double y = Double.parseDouble(textFieldY.getText());
	                    Double z = Double.parseDouble(textFieldZ.getText());
	                    Double scale= Math.pow(10, 3);
	                    if (formulaId==1) 
	                    	
	                        result =Math.ceil(calculate1(x, y,z)*scale)/scale;
	                    else
                        result =Math.ceil(calculate2(x, y,z)*scale)/scale;
	                   
	                    if (memid==3)
	                    {
	                       mem1+= result ;
	                    textFieldmem1.setText(mem1.toString());
	                    }
	                    else if(memid==4)
	                    {
	                        mem2 +=result;
	                        textFieldmem2.setText(mem2.toString());
	                    }
	                    else
	                    {
	                    	 mem3 +=result;
	                    textFieldmem3.setText( mem3.toString());
	                    }
	                    textFieldResult.setText(result.toString());
	                } catch (NumberFormatException ex) {
	                    JOptionPane.showMessageDialog(MainFrame.this,
	                            "Ошибка в формате записи числа с плавающей точкой", "Ошибочный формат числа",
	                            JOptionPane.WARNING_MESSAGE);
	                }
	            }
	        });
	        JButton buttonReset = new JButton("Очистить поля");
	        buttonReset.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent ev) {
	                textFieldX.setText("0");
	                textFieldY.setText("0");
	                textFieldZ.setText("0");
	                if (memid==3)
                    {
                    textFieldmem1.setText("0");
                    }
                    else if(memid==4)
                    {
                        textFieldmem2.setText("0");
                    }
                    else
                    {
                    textFieldmem3.setText("0");
                    }
	                textFieldResult.setText("0");
	            }
	        });
	        JButton buttonMC = new JButton("MC");
	        buttonMC.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent ev) {
	                if (memid==3)
                    {
                    textFieldmem1.setText("0");
                    }
                    else if(memid==4)
                    {
                        textFieldmem2.setText("0");
                    }
                    else
                    {
                    textFieldmem3.setText("0");
                    }
	               
	            }
	        });
	        Box hboxButtons = Box.createHorizontalBox();
	     
	        hboxButtons.add(buttonCalc);
	        hboxButtons.add(buttonReset);
	        hboxButtons.add(Box.createHorizontalGlue());
	        hboxButtons.add(buttonCalcplus);
	        hboxButtons.add(buttonMC);
	       
	        hboxButtons.setBorder(
	                BorderFactory.createLineBorder(Color.GREEN));
	        Box contentBox = Box.createVerticalBox();
	        contentBox.add(Box.createVerticalGlue());
	        contentBox.add(hboxFormulaType);
	       
	        contentBox.add(hboxVariables);
	        contentBox.add(hboxmemType);
	        contentBox.add(hboxmem);
	        
	        
	        
	        contentBox.add(hboxButtons);
	        contentBox.add(hboxResult);
	        contentBox.add(Box.createVerticalGlue());
	        
	        getContentPane().add(contentBox, BorderLayout.CENTER);
	    }
	    public static void main(String[] args) {
	        MainFrame frame = new MainFrame();
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        frame.setVisible(true);
	    }
	}

