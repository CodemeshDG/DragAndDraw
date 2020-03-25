package com.dommyg.draganddraw;

import android.graphics.Paint;
import android.graphics.PointF;

class Box {
    private PointF origin;
    private PointF current;
    private Paint color;

    Box(PointF origin, int color) {
        this.origin = origin;
        this.current = origin;
        this.color = new Paint();
        this.color.setColor(color);
    }

    PointF getOrigin() {
        return origin;
    }

    PointF getCurrent() {
        return current;
    }

    void setCurrent(PointF current) {
        this.current = current;
    }

    public Paint getColor() {
        return color;
    }
}
