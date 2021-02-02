package pl.ptemich.hexenogl;

import com.jogamp.opengl.GL2;

public class Maze {

    public void draw(GL2 gl) {
        gl.glBegin( GL2.GL_LINE_STRIP );
        gl.glColor3f(1f,0f,0f);
        gl.glVertex3f(0.0f, 0.0f, 0.0f);

        gl.glColor3f(1f,0.1f,0f);
        gl.glVertex3f(0.2f, 0.0f, 0.0f);

        gl.glColor3f(1f,0.2f,0f);
        gl.glVertex3f(0.2f, 0.2f, 0.0f);

        gl.glColor3f(1f,0.3f,0f);
        gl.glVertex3f(-0.2f, 0.2f, 0.0f);

        gl.glColor3f(1f,0.4f,0f);
        gl.glVertex3f(-0.2f, -0.2f, 0.0f);

        gl.glColor3f(1f,0.5f,0f);
        gl.glVertex3f(0.4f, -0.2f, 0.0f);

        gl.glColor3f(1f,0.6f,0f);
        gl.glVertex3f(0.4f, 0.4f, 0.0f);

        gl.glColor3f(1f,0.8f,0f);
        gl.glVertex3f(-0.8f, 0.4f, 0.0f);

        gl.glColor3f(1f,1.0f,0f);
        gl.glVertex3f(-0.8f, -0.8f, 0.0f);

        gl.glEnd();
    }
}
