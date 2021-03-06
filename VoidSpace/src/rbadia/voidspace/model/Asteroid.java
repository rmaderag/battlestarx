package rbadia.voidspace.model;

import java.awt.Rectangle;
import java.util.Random;

import rbadia.voidspace.main.GameScreen;

public class Asteroid extends Rectangle {
	private static final long serialVersionUID = 1L;
	
	public static final int DEFAULT_SPEED = 4;
	public static final int DEFAULT_DIRECTION = 0;
	
	private int asteroidWidth = 32;
	private int asteroidHeight = 32;
	private int speed = DEFAULT_SPEED;
	private int direction = DEFAULT_DIRECTION; 

	private boolean newAsteroids = false;
	
	private Random rand = new Random();
	
	/**
	 * Crates a new asteroid at a random x location at the top of the screen 
	 * @param screen the game screen
	 */
	public Asteroid(GameScreen screen){
		this.setLocation(
        		rand.nextInt(screen.getWidth() - asteroidWidth),
        		0);
		this.setSize(asteroidWidth, asteroidHeight);
	}
	
	public int getAsteroidWidth() {
		return asteroidWidth;
	}
	public int getAsteroidHeight() {
		return asteroidHeight;
	}

	/**
	 * Returns the current asteroid speed
	 * @return the current asteroid speed
	 */
	public int getSpeed() {
		return speed;
	}
	
	/**
	 * Set the current asteroid speed
	 * @param speed the speed to set
	 */
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	/**
	 * Returns the default asteroid speed.
	 * @return the default asteroid speed
	 */
	public int getDefaultSpeed(){
		return DEFAULT_SPEED;
	}

	public void setDirection(int direction){//TODO
		this.direction = direction;
	}
	
	public int getDirection() {//TODO
		return direction;
	}
	
	public void generateDirection() {//TODO
		Random generator = new Random();
		int random = generator.nextInt(3)-1;
		setDirection(this.getSpeed()*random);
	}
	
	public synchronized boolean areNewAsteroids() {//TODO
		return newAsteroids;
	}
	
	public synchronized void setNewAsteroids(boolean newAsteroids) {//TODO
		this.newAsteroids = newAsteroids;
	}
}
