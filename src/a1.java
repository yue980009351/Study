import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;


public class a1 implements ItemListener {

    JFrame frame= new JFrame("www.zbvc.cn");
    JComboBox jcb;
    Container c;
    JList jlist;
    JScrollPane pane;
    JTextArea jta;
    private String items[]={"1","2","3","4"};;
    String stars[] = {"安东尼奥.班德拉斯","来昂纳多.迪卡普尼奥", "桑德拉.布洛克","休.格兰特","朱莉亚.罗伯茨",
            "安东尼奥.班德拉斯","来昂纳多.迪卡普尼奥", "桑德拉.布洛克","休.格兰特","朱莉亚.罗伯茨"};


    public a1() {
        jta= new JTextArea(3,10);
        jcb =new JComboBox(items);
        jlist= new JList(stars);
        c=frame.getContentPane();
        c.setLayout(new FlowLayout());
        c.add(jcb);
        c.add(jta);
        pane= new JScrollPane(jlist);
        c.add(pane);
        frame.setSize(400,400);
        frame.setVisible(true);
        frame.setLocation(100,100);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        System.out.println(jcb.getSelectedItem());
        jcb.insertItemAt("0", 0);
        jcb.addItemListener(this);
        jlist.addListSelectionListener(new ListSelectionListener() {

            @Override
            public void valueChanged(ListSelectionEvent e) {
                // TODO Auto-generated method stub
                jta.setText(jlist.getSelectedValue()+"");
            }
        });
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        new a1();
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        // TODO Auto-generated method stub
        jta.setText((String)jcb.getSelectedItem());
    }

}
