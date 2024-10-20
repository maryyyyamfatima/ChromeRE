package defpackage;

import android.content.Context;
import android.graphics.PointF;
import android.view.GestureDetector;
import android.view.MotionEvent;
import com.android.chrome.R;
import org.chromium.base.ThreadUtils;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: vs3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC10894vs3 extends GestureDetector.SimpleOnGestureListener {
    public final GestureDetector a;
    public final PointF b = new PointF();
    public int c = 0;
    public final InterfaceC10551us3 d;
    public final int e;
    public final int f;

    public boolean b(MotionEvent motionEvent) {
        return true;
    }

    public AbstractC10894vs3(Context context, InterfaceC10551us3 interfaceC10551us3) {
        this.a = new GestureDetector(context, this, ThreadUtils.b());
        this.e = context.getResources().getDimensionPixelOffset(R.dimen.f40930_resource_name_obfuscated_res_0x7f080778);
        this.f = context.getResources().getDimensionPixelOffset(R.dimen.f40910_resource_name_obfuscated_res_0x7f080776);
        this.d = interfaceC10551us3;
    }

    public final boolean a(MotionEvent motionEvent) {
        boolean onTouchEvent = this.a.onTouchEvent(motionEvent);
        InterfaceC10551us3 interfaceC10551us3 = this.d;
        if (interfaceC10551us3 == null) {
            return onTouchEvent;
        }
        int action = motionEvent.getAction();
        if ((action != 1 && action != 3) || this.c == 0) {
            return onTouchEvent;
        }
        interfaceC10551us3.V();
        this.c = 0;
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        InterfaceC10551us3 interfaceC10551us3 = this.d;
        if (interfaceC10551us3 != null && motionEvent != null && motionEvent2 != null) {
            int i = this.c;
            PointF pointF = this.b;
            if (i == 0 && b(motionEvent)) {
                float rawX = motionEvent2.getRawX() - motionEvent.getRawX();
                float rawY = motionEvent2.getRawY() - motionEvent.getRawY();
                if (Math.abs(rawX) < this.f && Math.abs(rawY) < this.e) {
                    return false;
                }
                int i2 = Math.abs(rawX) > Math.abs(rawY) ? rawX > 0.0f ? 2 : 1 : rawY > 0.0f ? 4 : 3;
                if (i2 != 0 && interfaceC10551us3.X(i2)) {
                    this.c = i2;
                    interfaceC10551us3.s0(i2);
                    pointF.set(motionEvent2.getRawX(), motionEvent2.getRawY());
                }
            }
            if (this.c != 0) {
                this.d.O(motionEvent2, motionEvent2.getRawX() - pointF.x, motionEvent2.getRawY() - pointF.y, -f, -f2);
                return true;
            }
        }
        return false;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        InterfaceC10551us3 interfaceC10551us3 = this.d;
        if (interfaceC10551us3 == null || this.c == 0) {
            return false;
        }
        float rawX = motionEvent2.getRawX();
        PointF pointF = this.b;
        interfaceC10551us3.J(motionEvent2, rawX - pointF.x, motionEvent2.getRawY() - pointF.y, f, f2);
        return true;
    }
}
