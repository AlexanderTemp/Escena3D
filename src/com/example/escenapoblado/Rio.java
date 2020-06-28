package com.example.escenapoblado;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.nio.ShortBuffer;

import javax.microedition.khronos.opengles.GL10;

public class Rio {
	private float vertices[] = new float[] {
			-50, 0.1f, -8,
			50,0.1f,-8,
			50,0.1f,8,
			-50,0.1f,8,        
		};
		
		private short indices[] = new short [] { 
			 0, 1, 2, 0, 2, 3
		};
		
		FloatBuffer bufVertices;
		ShortBuffer bufIndices;
		
		public Rio(){
			
			/* Lee los v�rtices */
			ByteBuffer bufByte = ByteBuffer.allocateDirect(vertices.length * 4);
			bufByte.order(ByteOrder.nativeOrder());
			bufVertices = bufByte.asFloatBuffer();
			bufVertices.put(vertices).rewind();

			/* Lee los indices */
			bufByte = ByteBuffer.allocateDirect(indices.length * 2);
			bufByte.order(ByteOrder.nativeOrder());
			bufIndices = bufByte.asShortBuffer();
			bufIndices.put(indices).rewind();
			
		}
		
		public void dibuja(GL10 gl) {
			gl.glEnableClientState(GL10.GL_VERTEX_ARRAY);
			gl.glVertexPointer(3, GL10.GL_FLOAT, 0, bufVertices);
			gl.glColor4f(153/255f, 217/255f, 234/255f, 1);
			
			/* Dibuja el piso */
			gl.glDrawElements(GL10.GL_TRIANGLES, indices.length,
					GL10.GL_UNSIGNED_SHORT, bufIndices);
			gl.glDisableClientState(GL10.GL_VERTEX_ARRAY);
		}
}
