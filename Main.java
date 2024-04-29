/// use english button 



import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main  implements ActionListener {
    JButton farsi,english,enter1,change_pass,acc_balance,deposit,withdraw,cansel,enter2,aa,bb,cc,dd,start,enter3;
    JPanel lan,pass,menu,new_pass,balance,dep_card,cash,last;
    Font font = new Font("serif",Font.BOLD,30);
    Font bfont = new Font("SansSerif",Font.BOLD,20);
    JFrame frame = new JFrame("ATM");

    Main(){
        frame.setDefaultCloseOperation(3);
        frame.setSize(1000,600);
        frame.setLayout(null);
        ///////////////////////////////////////////////////
        lan = new JPanel();
        lan.setBounds(0,0,1000,600);
        lan.setBackground(Color.LIGHT_GRAY);
        lan.setLayout(null);

        JLabel lan_label = new JLabel("Enter your language / زبان خود را انتخاب کنید");
        lan_label.setFont(font);
        lan_label.setBounds(200,50,550,50);
        lan.add(lan_label);

        farsi = new JButton("فارسی");
        english = new JButton("English");
        farsi.setBounds(475,250,150,50);
        farsi.setFont(bfont);
        lan.add(farsi);

        english.setBounds(325,250,150,50);
        english.setFont(bfont);
        english.addActionListener(this);
        lan.add(english);

        frame.add(lan);
        ///////////////////////////////////////////////////
        pass = new JPanel();
        pass.setBounds(0,0,1000,600);
        pass.setBackground(Color.LIGHT_GRAY);
        pass.setLayout(null);

        JLabel pass_label = new JLabel("Enter your password");
        pass_label.setFont(font);
        pass_label.setBounds(350,50,300,50);
        pass.add(pass_label);

        JPasswordField pass_text = new JPasswordField();
        pass_text.setBounds(400,275,200,50);
        pass.add(pass_text);

        enter1 = new JButton("Enter");
        enter1.setBounds(425,450,150,50);
        enter1.setFont(bfont);
        enter1.addActionListener(this);
        pass.add(enter1);
        //////////////////////////////////////////////////
        menu = new JPanel();
        menu.setBounds(0,0,1000,600);
        menu.setBackground(Color.LIGHT_GRAY);
        menu.setLayout(null);

        change_pass = new JButton("Change Password");
        change_pass.setBounds(200,200,250,50);
        change_pass.setFont(bfont);
        change_pass.addActionListener(this);
        menu.add(change_pass);

        acc_balance = new JButton("Account Balance");
        acc_balance.setBounds(550,200,250,50);
        acc_balance.setFont(bfont);
        acc_balance.addActionListener(this);
        menu.add(acc_balance);

        deposit = new JButton("Deposit");
        deposit.setBounds(200,270,250,50);
        deposit.setFont(bfont);
        deposit.addActionListener(this);
        menu.add(deposit);

        withdraw = new JButton("Withdraw");
        withdraw.setBounds(550,270,250,50);
        withdraw.setFont(bfont);
        withdraw.addActionListener(this);
        menu.add(withdraw);

        cansel = new JButton("Cansel");
        cansel.setBounds(425,350,150,50);
        cansel.setFont(bfont);
        cansel.addActionListener(this);
        menu.add(cansel);
        /////////////////////////////////////////////////
        balance = new JPanel();
        balance.setBounds(0,0,1000,600);
        balance.setBackground(Color.LIGHT_GRAY);
        balance.setLayout(null);
        JLabel show_amount = new JLabel("Your Account Balance Is : 5000 USD");
        show_amount.setFont(bfont);
        show_amount.setBounds(200,225,700,50);
        balance.add(show_amount);
        ////////////////////////////////////////////////
        new_pass = new JPanel();
        new_pass.setBounds(0,0,1000,600);
        new_pass.setBackground(Color.LIGHT_GRAY);
        new_pass.setLayout(null);

        JLabel show_pass = new JLabel("Enter New Password");
        show_pass.setFont(bfont);
        show_pass.setBounds(400,50,300,50);
        new_pass.add(show_pass);

        JPasswordField NewPassField = new JPasswordField();
        NewPassField.setBounds(400,275,200,50);
        new_pass.add(NewPassField);

        enter2 = new JButton("Enter");
        enter2.setBounds(425,450,150,50);
        enter2.setFont(bfont);
        enter2.addActionListener(this);
        new_pass.add(enter2);
        /////////////////////////////////////////////////
        cash = new JPanel();
        cash.setBounds(0,0,1000,600);
        cash.setBackground(Color.LIGHT_GRAY);
        cash.setLayout(null);

        aa = new JButton("100$");
        aa.setBounds(200,200,250,50);
        aa.setFont(bfont);
        aa.addActionListener(this);
        cash.add(aa);

        bb = new JButton("50$");
        bb.setBounds(550,200,250,50);
        bb.setFont(bfont);
        bb.addActionListener(this);
        cash.add(bb);

        cc = new JButton("25$");
        cc.setBounds(200,270,250,50);
        cc.setFont(bfont);
        cc.addActionListener(this);
        cash.add(cc);

        dd = new JButton("150$");
        dd.setBounds(550,270,250,50);
        dd.setFont(bfont);
        dd.addActionListener(this);
        cash.add(dd);

        cash.add(cansel);
        ////////////////////////////////////////////////
        dep_card = new JPanel();
        dep_card.setBounds(0,0,1000,600);
        dep_card.setBackground(Color.LIGHT_GRAY);
        dep_card.setLayout(null);

        JLabel dep_text = new JLabel("Enter Card Number");
        dep_text.setFont(font);
        dep_text.setBounds(350,50,300,50);
        dep_card.add(dep_text);

        JTextField card = new JTextField();
        card.setFont(bfont);
        card.setBounds(400,275,200,50);
        dep_card.add(card);

        enter3 = new JButton("Enter");
        enter3.setBounds(425,450,150,50);
        enter3.setFont(bfont);
        enter3.addActionListener(this);
        dep_card.add(enter3);
        ///////////////////////////////////////////////
        last = new JPanel();
        last.setBounds(0,0,1000,600);
        last.setBackground(Color.LIGHT_GRAY);
        last.setLayout(null);

        JLabel done = new JLabel("DONE!");
        done.setFont(font);
        done.setBounds(425,50,150,50);
        last.add(done);

        start = new JButton("Start");
        start.setBounds(425,450,150,50);
        start.setFont(bfont);
        start.addActionListener(this);
        last.add(start);
        /////////////////////////////////////////////////

        frame.setVisible(true);
    }

    public static void main(String[] args) {
        Main ATM = new Main();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==english){
            frame.remove(lan);
            frame.repaint();
            frame.add(pass);
        }
        else if (e.getSource()==enter1) {
            frame.remove(pass);
            frame.repaint();
            frame.add(menu);

        }
        else if (e.getSource()==change_pass){
            frame.remove(menu);
            frame.repaint();
            frame.add(new_pass);
        }
        else if (e.getSource()==acc_balance){
            frame.remove(menu);
            frame.repaint();
            frame.add(balance);
        }
        else if (e.getSource()==deposit){
            frame.remove(menu);
            frame.repaint();
            frame.add(dep_card);
        }
        else if (e.getSource()==withdraw){
            frame.remove(menu);
            frame.repaint();
            frame.add(cash);
        }
        else if(e.getSource()==enter2 || e.getSource()==enter3 ||e.getSource()==aa ||e.getSource()==bb ||e.getSource()==cc ||e.getSource()==dd ){
            frame.remove(balance);
            frame.remove(cash);
            frame.remove(new_pass);
            frame.remove(dep_card);
            frame.repaint();
            frame.add(last);
        }
        else if(e.getSource()==start ||e.getSource()==cansel){
            frame.remove(balance);
            frame.remove(new_pass);
            frame.remove(dep_card);
            frame.remove(cash);
            frame.remove(pass);
            frame.remove(menu);
            frame.remove(last);
            frame.repaint();
            frame.add(lan);
        }


    }
}