import java.awt.*;
public class LoginForm extends Frame
{
    Label l1,l2;
    TextField t1,t2;
    Button b;
    public LoginForm()
    {
        l1=new Label("Login");
        l2=new Label("Password");
        
        t1=new TextField(20);
        t2=new TextField(20);
        t2.setEchoChar('#');
        
        b=new Button("Login");
        
        add(l1);add(t1);
        add(l2);add(t2);
        add(b);
        
        setLayout(new FlowLayout());
        setSize(200,200);
        setVisible(true);
    }
    public static void main(String args[])
    {
        new LoginForm();
    }
    
}

