/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOP;

/**
 *
 * @author Cliftonb
 */
public class CShape {

	public Line longLine;
	public Line shortLine;

	public CShape() {
		longLine = new Line(10, '&');
		shortLine = new Line(2, '*');
	}

	public void draw() {
		longLine.draw();
		for (int i = 0; i < 4; i++) {
			shortLine.draw();
		}
		longLine.draw();
	}
}
