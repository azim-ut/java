import java.util.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;



import static java.awt.SystemColor.text;

class Solution {
    public static void main(String []args){
        ButtonFrame frame= new ButtonFrame();//создаем фрейм
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//операция отвечающая за окончание программы после закрытия фрейма
        frame.setVisible(true);//делаем фрейм видимым
    }
}
class ButtonFrame extends JFrame{//создаем класс отвечающий за фрейм
    public ButtonFrame(){//конструктор данного класа
        setSize(DEFAULT_WIDTH,DEFAULT_HEIGHE);//размеры фрейма
        setTitle("Button");//название фрейма
        ButtonPanel panel=new ButtonPanel();//создаем панель
        add(panel);//добавляем панель на фрейм

    }
    public static final  int DEFAULT_WIDTH=800;
    public static final  int DEFAULT_HEIGHE=600;
}
class ButtonPanel extends JPanel{//класс отвечающий за фрейм
    JLabel Amount = new JLabel("Amount");
    JTextField textField=new JTextField(10);
    JTextArea textArea=new JTextArea("Description",10,200);
    JButton Save = new JButton("Save");
    public ButtonPanel(){ //конструктор панели add(textField);
        setLayout(new FlowLayout(FlowLayout.CENTER));//Центрируем
        add(Amount);
        add(textField);
        add(textArea);
        add(Save);}


    //textArea.append(s+"\n");
        /*textArea.setLineWrap(true);/* автоматический перенос слов на следующую
        строку, когда количество допустимых символов закончится*/
    class PushTheButton implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            ActionListener actionListener = new PushTheButton();
            Save.addActionListener(actionListener);
        }}}
            /*if (e.target instanceof Button) {
                if (evt.target.equals(Save)) {
                    textArea.append(textField.getText() + "\n");
                    return true;
                }

            }
            return false;*/
