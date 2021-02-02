package pl.ptemich.hexenogl;

import com.jogamp.opengl.*;
import com.jogamp.opengl.awt.GLCanvas;
import com.jogamp.opengl.util.FPSAnimator;

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class App  {

    public static void main(String[] args) {
        //getting the capabilities object of GL2 profile
        final GLProfile profile = GLProfile.get(GLProfile.GL2);
        GLCapabilities capabilities = new GLCapabilities(profile);

        // The canvas
        final GLCanvas glcanvas = new GLCanvas(capabilities);
        GlDrawer drawer = new GlDrawer();
        glcanvas.addGLEventListener(drawer);
        glcanvas.setSize(600, 600);

        //creating frame
        final JFrame frame = new JFrame(" Basic Frame");

        //adding canvas to it
        frame.getContentPane().add(glcanvas);
        frame.setSize(frame.getContentPane().getPreferredSize());
        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setAlwaysOnTop(true);
        frame.setLocation(100, 100);

        //Instantiating and Initiating Animator
        //final FPSAnimator animator = new FPSAnimator(glcanvas, 300,true);
        //animator.start();
    }

}
