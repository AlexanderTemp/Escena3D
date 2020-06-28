package com.example.escenapoblado;

import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

import android.content.Context;
import android.opengl.GLSurfaceView.Renderer;
import android.opengl.GLSurfaceView;
import android.opengl.GLU;
import android.view.MotionEvent;

public class Renderiza extends GLSurfaceView implements Renderer{
	
	
	private CasaPersonal casa;
	private CasaPersonal2 casa1;
	private CasaPersonal3 casa2;
	private CasaPersonal4 casa3;
	private float trazoHorizontal;
	private float trazoVertical;
	private float antX;
	private float antY;
	private Cesped cesped;
	private Carretera carretera;
	private Rio rio;
	private FranjasCarretera franjas;
	private Arbusto arbusto;
	private Arbol arbol;
	private Montania monta;
	private RioDeMontania riomon;
	private Vehiculo auto;
	private Vehiculo2 auto1;
	private Vehiculo3 auto2;
	
	public Renderiza(Context contexto) {
		super(contexto);
		this.setRenderer(this);
		this.requestFocus();
		this.setFocusableInTouchMode(true);
		this.setRenderMode(GLSurfaceView.RENDERMODE_WHEN_DIRTY);
	}
	
	@Override
	public void onSurfaceCreated(GL10 gl, EGLConfig arg1) {
		// TODO Auto-generated method stub
		casa=new CasaPersonal();
		casa1=new CasaPersonal2();
		casa2=new CasaPersonal3();
		casa3=new CasaPersonal4();
		
		cesped=new Cesped();
		carretera=new Carretera();
		rio=new Rio();
		franjas=new FranjasCarretera();
		arbusto=new Arbusto();
		arbol=new Arbol();
		monta=new Montania();
		riomon=new RioDeMontania();
		auto=new Vehiculo();
		auto1=new Vehiculo2();
		auto2=new Vehiculo3();
		gl.glEnable(GL10.GL_DEPTH_TEST);
		gl.glClearColor(1, 1, 1, 0);
	}
	
	@Override
	public void onDrawFrame(GL10 gl) {
		// TODO Auto-generated method stub
		gl.glClear(GL10.GL_COLOR_BUFFER_BIT | GL10.GL_DEPTH_BUFFER_BIT);
		gl.glLoadIdentity();
		gl.glTranslatef(0,0,-30);
		gl.glScalef(0.4f, 0.4f, 0.4f);
		gl.glRotatef(20, 1.0f, 0.0f, 0.0f);

		gl.glRotatef(trazoHorizontal, 0.0f, 1.0f, 0.0f);
		gl.glRotatef(trazoVertical, 1.0f, 0.0f, 0.0f);

		gl.glPushMatrix();
		gl.glTranslatef(0,-1.01f,0);
		cesped.dibuja(gl);
		carretera.dibuja(gl);
		franjas.dibuja(gl);
		rio.dibuja(gl);
		gl.glPopMatrix();
		
		// Casas
		//casa.dibuja(gl);
		gl.glPushMatrix();
		gl.glTranslatef(-34, 0, 26);
		arbusto.dibuja(gl);
		gl.glPopMatrix();
		gl.glPushMatrix();
		gl.glTranslatef(-14, 0, 30);
		arbusto.dibuja(gl);
		gl.glPopMatrix();
		gl.glPushMatrix();
		gl.glTranslatef(-25, 0, 12);
		arbusto.dibuja(gl);
		gl.glPopMatrix();
		gl.glPushMatrix();
		gl.glTranslatef(-42, 0, 22);
		arbusto.dibuja(gl);
		gl.glPopMatrix();
		gl.glPushMatrix();
		gl.glTranslatef(-8, 0, 44);
		arbusto.dibuja(gl);
		gl.glPopMatrix();
		gl.glPushMatrix();
		gl.glTranslatef(-28, 0, 39);
		arbusto.dibuja(gl);
		gl.glPopMatrix();
		gl.glPushMatrix();
		gl.glTranslatef(-15, 0, 27);
		arbusto.dibuja(gl);
		gl.glPopMatrix();
		gl.glPushMatrix();
		gl.glTranslatef(-17, 0, 16);
		arbusto.dibuja(gl);
		gl.glPopMatrix();
		gl.glPushMatrix();
		gl.glTranslatef(-20, 0, 35);
		arbusto.dibuja(gl);
		gl.glPopMatrix();
		gl.glPushMatrix();
		gl.glTranslatef(-42, 0, 36);
		arbusto.dibuja(gl);
		gl.glPopMatrix();
		////fin primer cuadrante
		
		gl.glPushMatrix();
		gl.glTranslatef(44, 0, 40);
		arbusto.dibuja(gl);
		gl.glPopMatrix();
		gl.glPushMatrix();
		gl.glTranslatef(28, 0, 21);
		arbusto.dibuja(gl);
		gl.glPopMatrix();
		gl.glPushMatrix();
		gl.glTranslatef(14, 0, 20);
		arbusto.dibuja(gl);
		gl.glPopMatrix();
		gl.glPushMatrix();
		gl.glTranslatef(39, 0, 32);
		arbusto.dibuja(gl);
		gl.glPopMatrix();
		gl.glPushMatrix();
		gl.glTranslatef(22, 0, 24);
		arbusto.dibuja(gl);
		gl.glPopMatrix();
		gl.glPushMatrix();
		gl.glTranslatef(23, 0, 41);
		arbusto.dibuja(gl);
		gl.glPopMatrix();
		gl.glPushMatrix();
		gl.glTranslatef(22, 0, 26);
		arbusto.dibuja(gl);
		gl.glPopMatrix();
		gl.glPushMatrix();
		gl.glTranslatef(33, 0, 39);
		arbusto.dibuja(gl);
		gl.glPopMatrix();
		gl.glPushMatrix();
		gl.glTranslatef(11, 0, 37);
		arbusto.dibuja(gl);
		gl.glPopMatrix();
		gl.glPushMatrix();
		gl.glTranslatef(16, 0, 11);
		arbusto.dibuja(gl);
		gl.glPopMatrix();
		
		///fin otrocuadrante
		gl.glPushMatrix();
		gl.glTranslatef(12, 0, -35);
		arbusto.dibuja(gl);
		gl.glPopMatrix();
		gl.glPushMatrix();
		gl.glTranslatef(29, 0, -19);
		arbusto.dibuja(gl);
		gl.glPopMatrix();
		gl.glPushMatrix();
		gl.glTranslatef(34, 0, -42);
		arbusto.dibuja(gl);
		gl.glPopMatrix();
		gl.glPushMatrix();
		gl.glTranslatef(40, 0, -28);
		arbusto.dibuja(gl);
		gl.glPopMatrix();
		gl.glPushMatrix();
		gl.glTranslatef(12, 0, -42);
		arbusto.dibuja(gl);
		gl.glPopMatrix();
		gl.glPushMatrix();
		gl.glTranslatef(33, 0, -34);
		arbusto.dibuja(gl);
		gl.glPopMatrix();
		gl.glPushMatrix();
		gl.glTranslatef(16, 0, -38);
		arbusto.dibuja(gl);
		gl.glPopMatrix();
		gl.glPushMatrix();
		gl.glTranslatef(13, 0, -49);
		arbusto.dibuja(gl);
		gl.glPopMatrix();
		gl.glPushMatrix();
		gl.glTranslatef(15, 0, -24);
		arbusto.dibuja(gl);
		gl.glPopMatrix();
		gl.glPushMatrix();
		gl.glTranslatef(32, 0, -24);
		arbusto.dibuja(gl);
		gl.glPopMatrix();
		///////fin de otro cuadrante
		
		gl.glPushMatrix();
		gl.glTranslatef(-38, 0, -47);
		arbusto.dibuja(gl);
		gl.glPopMatrix();
		gl.glPushMatrix();
		gl.glTranslatef(-27, 0, -38);
		arbusto.dibuja(gl);
		gl.glPopMatrix();
		gl.glPushMatrix();
		gl.glTranslatef(-44, 0, -24);
		arbusto.dibuja(gl);
		gl.glPopMatrix();
		gl.glPushMatrix();
		gl.glTranslatef(-16, 0, -40);
		arbusto.dibuja(gl);
		gl.glPopMatrix();
		gl.glPushMatrix();
		gl.glTranslatef(-39, 0, -19);
		arbusto.dibuja(gl);
		gl.glPopMatrix();
		gl.glPushMatrix();
		gl.glTranslatef(-22, 0, -29);
		arbusto.dibuja(gl);
		gl.glPopMatrix();
		gl.glPushMatrix();
		gl.glTranslatef(-13, 0, -33);
		arbusto.dibuja(gl);
		gl.glPopMatrix();
		gl.glPushMatrix();
		gl.glTranslatef(-41, 0, -41);
		arbusto.dibuja(gl);
		gl.glPopMatrix();
		gl.glPushMatrix();
		gl.glTranslatef(-17, 0, -39);
		arbusto.dibuja(gl);
		gl.glPopMatrix();
		gl.glPushMatrix();
		gl.glTranslatef(-38, 0, -46);
		arbusto.dibuja(gl);
		gl.glPopMatrix();
		
		///fin cuadrante negativo
		///cadrante de arboles
		///z=-15,- 50  x=-7 -50
		for (int i = -15; i > -50; i-=8) {
			for (int j = -7; j > -50; j-=8) {
				gl.glPushMatrix();
				gl.glTranslatef(j, 0, i);
				arbol.dibuja(gl);
				gl.glPopMatrix();
			}
		}
		gl.glPushMatrix();
		gl.glTranslatef(-40, 0, 40);
		monta.dibuja(gl);
		gl.glPopMatrix();
		gl.glPushMatrix();
		gl.glTranslatef(-32, 0, 39);
		monta.dibuja(gl);
		gl.glPopMatrix();
		gl.glPushMatrix();
		gl.glTranslatef(-24, 0, 38);
		monta.dibuja(gl);
		gl.glPopMatrix();
		gl.glPushMatrix();
		riomon.dibuja(gl);
		gl.glPopMatrix();
		gl.glPushMatrix();
		gl.glTranslatef(1.5f, 3, 0);
		auto.dibuja(gl);
		gl.glPopMatrix();
		
		gl.glPushMatrix();
		gl.glTranslatef(-1.5f, 0.1f, 35);
		auto1.dibuja(gl);
		gl.glPopMatrix();
		
		gl.glPushMatrix();
		gl.glTranslatef(-1.2f, 0.1f, -30);
		auto2.dibuja(gl);
		gl.glPopMatrix();
		
		
		gl.glPushMatrix();
		gl.glTranslatef(20, 0, 25);
		casa.dibuja(gl);
		gl.glPopMatrix();
		
		gl.glPushMatrix();
		gl.glTranslatef(20, 0, 40);
		casa1.dibuja(gl);
		gl.glPopMatrix();
		
		gl.glPushMatrix();
		gl.glTranslatef(40, 0, 25);
		casa2.dibuja(gl);
		gl.glPopMatrix();
		
		gl.glPushMatrix();
		gl.glTranslatef(40, 0, 40);
		casa3.dibuja(gl);
		gl.glPopMatrix();
		
		for (int i = -15; i > -50; i-=8) {
			for (int j = 7; j < 50; j+=8) {
				gl.glPushMatrix();
				gl.glTranslatef(j, 0, i);
				arbol.dibuja(gl);
				gl.glPopMatrix();
			}
		}
		gl.glFlush();
		
	}

	@Override
	public void onSurfaceChanged(GL10 gl, int w, int h) {
		// TODO Auto-generated method stub
		gl.glViewport(0, 0, w, h);
		gl.glMatrixMode(GL10.GL_PROJECTION);
		gl.glLoadIdentity();
		GLU.gluPerspective(gl, 40, (float)w / h, 0.5f, 80f);
		gl.glMatrixMode(GL10.GL_MODELVIEW);
		gl.glLoadIdentity();
	}
	
	
	/**
	 * Maneja los eventos del movimiento en la pantalla táctil.
	 */
	@Override
	public boolean onTouchEvent(MotionEvent e) {
		float x = e.getX();
		float y = e.getY();
		switch (e.getAction()) {
		case MotionEvent.ACTION_MOVE:
			float dx = x - antX;
			float dy = y - antY;
			trazoHorizontal = trazoHorizontal + dx * 0.28125f;
			trazoVertical = trazoVertical + dy * 0.1875f; 
			requestRender();
		}
		antX = x;
		antY = y;
		return true;
	}


}
