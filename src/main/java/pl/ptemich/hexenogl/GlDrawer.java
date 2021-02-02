package pl.ptemich.hexenogl;

import com.jogamp.opengl.GL2;
import com.jogamp.opengl.GLAutoDrawable;
import com.jogamp.opengl.GLEventListener;

public class GlDrawer implements GLEventListener {

    float scale =  0.5f;
    float rotation = 0.5f;


    @Override
    public void display(GLAutoDrawable drawable) {
        final GL2 gl = drawable.getGL().getGL2();
        gl.glClear(GL2.GL_COLOR_BUFFER_BIT |  GL2.GL_DEPTH_BUFFER_BIT );
        gl.glLoadIdentity();  // Reset The View

        Maze maze = new Maze();

        maze.draw(gl);
        gl.glScalef(0.75f, 0.75f, 0.75f);
        gl.glRotatef(rotation, 0.0f, 1.0f, 0.0f );
        maze.draw(gl);


        gl.glFlush();
        rotation += 0.1f;
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
