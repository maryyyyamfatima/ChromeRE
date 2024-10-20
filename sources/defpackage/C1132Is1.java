package defpackage;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.d;
import java.util.WeakHashMap;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Is1 */
/* loaded from: classes.dex */
public final class C1132Is1 extends GestureDetector.SimpleOnGestureListener {
    public boolean a = true;
    public final /* synthetic */ C1521Ls1 b;

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    public C1132Is1(C1521Ls1 c1521Ls1) {
        this.b = c1521Ls1;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
        C1521Ls1 c1521Ls1;
        View o;
        d K;
        int i;
        if (!this.a || (o = (c1521Ls1 = this.b).o(motionEvent)) == null || (K = c1521Ls1.w.K(o)) == null) {
            return;
        }
        RecyclerView recyclerView = c1521Ls1.w;
        AbstractC1002Hs1 abstractC1002Hs1 = c1521Ls1.r;
        int c = abstractC1002Hs1.c(recyclerView, K);
        WeakHashMap weakHashMap = Ec4.a;
        int layoutDirection = recyclerView.getLayoutDirection();
        int i2 = c & 3158064;
        if (i2 != 0) {
            int i3 = c & (~i2);
            if (layoutDirection == 0) {
                i = i2 >> 2;
            } else {
                int i4 = i2 >> 1;
                i3 |= (-3158065) & i4;
                i = (i4 & 3158064) >> 2;
            }
            c = i3 | i;
        }
        if ((16711680 & c) != 0) {
            int pointerId = motionEvent.getPointerId(0);
            int i5 = c1521Ls1.q;
            if (pointerId == i5) {
                int findPointerIndex = motionEvent.findPointerIndex(i5);
                float x = motionEvent.getX(findPointerIndex);
                float y = motionEvent.getY(findPointerIndex);
                c1521Ls1.i = x;
                c1521Ls1.j = y;
                c1521Ls1.n = 0.0f;
                c1521Ls1.m = 0.0f;
                if (abstractC1002Hs1.f()) {
                    c1521Ls1.t(K, 2);
                }
            }
        }
    }
}
