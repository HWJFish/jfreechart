package org.jfree.chart.annotations;

import org.jfree.chart.internal.Args;

public abstract class AbstractXYAnnotationWithXY extends AbstractXYAnnotation{
    /**
     * The x-coordinate (in data space).
     */
    protected double x;

    /**
     * The y-coordinate (in data space).
     */
    protected double y;

    /**
     * Creates a new instance that has no tool tip or URL specified.
     * @param x x coordinate not finite
     * @param y y coordinate not finite
     */
    protected AbstractXYAnnotationWithXY(double x, double y) {
        super();
        Args.requireFinite(x, "x");
        Args.requireFinite(y, "y");
        this.x = x;
        this.y = y;
    }


    /**
     * Returns the x-coordinate (in data space) for the annotation.
     *
     * @return The x-coordinate.
     */
    public double getX() {
        return this.x;
    }

    /**
     * Returns the y-coordinate (in data space) for the annotation.
     *
     * @return The y-coordinate.
     */
    public double getY() {
        return this.y;
    }
}
