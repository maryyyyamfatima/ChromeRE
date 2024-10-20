package defpackage;

import android.view.GestureDetector;
import android.view.MotionEvent;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class E12 extends GestureDetector.SimpleOnGestureListener {
    public final /* synthetic */ F12 a;

    public E12(F12 f12) {
        this.a = f12;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        this.a.h = 1;
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x006a  */
    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onScroll(android.view.MotionEvent r9, android.view.MotionEvent r10, float r11, float r12) {
        /*
            r8 = this;
            F12 r0 = r8.a
            int r1 = r0.h
            r2 = 0
            r3 = 1
            if (r1 != 0) goto La
            r1 = r3
            goto Lb
        La:
            r1 = r2
        Lb:
            if (r1 == 0) goto Le
            return r3
        Le:
            float r9 = r9.getX()
            float r1 = r10.getX()
            float r10 = r10.getY()
            int r4 = r0.h
            if (r4 == 0) goto L85
            boolean r4 = r0.a()
            if (r4 != 0) goto L26
            goto L85
        L26:
            int r4 = r0.h
            r5 = 3
            r6 = 2
            if (r4 != r3) goto L6c
            float r4 = java.lang.Math.abs(r11)
            float r12 = java.lang.Math.abs(r12)
            r7 = 1071476900(0x3fdd70a4, float:1.73)
            float r12 = r12 * r7
            int r12 = (r4 > r12 ? 1 : (r4 == r12 ? 0 : -1))
            if (r12 <= 0) goto L50
            float r12 = r0.a
            int r4 = (r9 > r12 ? 1 : (r9 == r12 ? 0 : -1))
            if (r4 < 0) goto L4e
            android.view.ViewGroup r4 = r0.b
            int r4 = r4.getWidth()
            float r4 = (float) r4
            float r4 = r4 - r12
            int r9 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r9 >= 0) goto L50
        L4e:
            r9 = r3
            goto L51
        L50:
            r9 = r2
        L51:
            if (r9 == 0) goto L5e
            r9 = 0
            int r9 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
            if (r9 <= 0) goto L5a
            r9 = r3
            goto L5b
        L5a:
            r9 = r2
        L5b:
            r0.c(r1, r10, r9)
        L5e:
            int r9 = r0.h
            if (r9 == r6) goto L67
            if (r9 != r5) goto L65
            goto L67
        L65:
            r9 = r2
            goto L68
        L67:
            r9 = r3
        L68:
            if (r9 != 0) goto L6c
            r0.h = r2
        L6c:
            float r9 = -r11
            float r10 = r0.j
            float r10 = r10 + r9
            r0.j = r10
            int r9 = r0.h
            org.chromium.ui.modelutil.PropertyModel r11 = r0.i
            if (r9 != r6) goto L7e
            MD2 r9 = defpackage.AbstractC10087tY0.d
            r11.l(r9, r10)
            goto L85
        L7e:
            if (r9 != r5) goto L85
            MD2 r9 = defpackage.AbstractC10087tY0.e
            r11.l(r9, r10)
        L85:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.E12.onScroll(android.view.MotionEvent, android.view.MotionEvent, float, float):boolean");
    }
}
