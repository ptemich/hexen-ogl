package pl.ptemich.hexenogl;

import com.jogamp.opengl.*;
import com.jogamp.opengl.awt.GLCanvas;

import javax.swing.*;

public class App implements GLEventListener {

    public static void main(String[] args) {
        //getting the capabilities object of GL2 profile
        final GLProfile profile = GLProfile.get(GLProfile.GL2);
        GLCapabilities capabilities = new GLCapabilities(profile);

        // The canvas
        final GLCanvas glcanvas = new GLCanvas(capabilities);
        App b = new App();
        glcanvas.addGLEventListener(b);
        glcanvas.setSize(400, 400);

        //creating frame
        final JFrame frame = new JFrame(" Basic Frame");

        //adding canvas to it
        frame.getContentPane().add(glcanvas);
        frame.setSize(frame.getContentPane().getPreferredSize());
        frame.setVisible(true);
    }

    @Override
    public void display(GLAutoDrawable drawable) {
        final GL2 gl = drawable.getGL().getGL2();
        gl.glBegin( GL2.GL_TRIANGLES );

        // Drawing Using Triangles

        gl.glColor3f( 1.0f, 0.0f, 0.0f );   // Red
        gl.glVertex3f( 0.5f,0.7f,0.0f );    // Top

        gl.glColor3f( 0.0f,1.0f,0.0f );     // green
        gl.glVertex3f( -0.2f,-0.50f,0.0f ); // Bottom Left

        gl.glColor3f( 0.0f,0.0f,1.0f );     // blue
        gl.glVertex3f( 0.5f,-0.5f,0.0f );   // Bottom Right

        gl.glEnd();
    }

    @Override
    public void dispose(GLAutoDrawable drawable) {
        //method body
    }

    @Override
    public void init(GLAutoDrawable drawable) {
        // method body
    }

    @Override
    public void reshape(GLAutoDrawable arg0, int arg1, int arg2, int arg3, int arg4) {
        // method body
    }

}
