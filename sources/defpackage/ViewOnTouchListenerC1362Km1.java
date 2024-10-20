package defpackage;

import android.R;
import android.app.Dialog;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Km1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewOnTouchListenerC1362Km1 implements View.OnTouchListener {
    public final Dialog a;
    public final int g;
    public final int h;
    public final int i;

    public ViewOnTouchListenerC1362Km1(DialogC5834h8 dialogC5834h8, Rect rect) {
        this.a = dialogC5834h8;
        this.g = rect.left;
        this.h = rect.top;
        this.i = ViewConfiguration.get(dialogC5834h8.getContext()).getScaledWindowTouchSlop();
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        View findViewById = view.findViewById(R.id.content);
        int left = findViewById.getLeft() + this.g;
        int width = findViewById.getWidth() + left;
        if (new RectF(left, findViewById.getTop() + this.h, width, findViewById.getHeight() + r4).contains(motionEvent.getX(), motionEvent.getY())) {
            return false;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        if (motionEvent.getAction() == 1) {
            obtain.setAction(4);
        }
        if (Build.VERSION.SDK_INT < 28) {
            obtain.setAction(0);
            int i = this.i;
            obtain.setLocation((-i) - 1, (-i) - 1);
        }
        view.performClick();
        return this.a.onTouchEvent(obtain);
    }
}
