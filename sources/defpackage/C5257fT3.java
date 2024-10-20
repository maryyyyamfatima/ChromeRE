package defpackage;

import android.graphics.Rect;
import android.view.TouchDelegate;
import com.facebook.litho.ComponentHost;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: fT3 */
/* loaded from: classes.dex */
public final class C5257fT3 extends TouchDelegate {
    public static final Rect c = new Rect();
    public final C1593Mg3 a;
    public C1593Mg3 b;

    public C5257fT3(ComponentHost componentHost) {
        super(c, componentHost);
        this.a = new C1593Mg3();
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x008c  */
    @Override // android.view.TouchDelegate
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onTouchEvent(android.view.MotionEvent r14) {
        /*
            r13 = this;
            Mg3 r0 = r13.a
            int r1 = r0.i()
            r2 = 1
            int r1 = r1 - r2
        L8:
            r3 = 0
            if (r1 < 0) goto Lb0
            java.lang.Object r4 = r0.j(r1)
            eT3 r4 = (defpackage.C4913eT3) r4
            if (r4 == 0) goto Lac
            float r5 = r14.getX()
            int r5 = (int) r5
            float r6 = r14.getY()
            int r6 = (int) r6
            wZ1 r7 = r4.b
            qN2 r7 = r7.d
            sE1 r7 = r7.b
            vy1 r7 = r7.j
            Ad4 r7 = r7.h
            r8 = 0
            if (r7 != 0) goto L2b
            goto L38
        L2b:
            android.graphics.Rect r9 = r7.d
            if (r9 == 0) goto L38
            boolean r9 = r9.isEmpty()
            if (r9 == 0) goto L36
            goto L38
        L36:
            android.graphics.Rect r8 = r7.d
        L38:
            if (r8 != 0) goto L3c
            goto La9
        L3c:
            android.view.View r7 = r4.a
            android.content.Context r9 = r7.getContext()
            android.view.ViewConfiguration r9 = android.view.ViewConfiguration.get(r9)
            int r9 = r9.getScaledTouchSlop()
            android.graphics.Rect r10 = new android.graphics.Rect
            r10.<init>()
            r10.set(r8)
            int r11 = -r9
            r10.inset(r11, r11)
            int r11 = r14.getAction()
            r12 = 2
            if (r11 == 0) goto L82
            if (r11 == r2) goto L6c
            if (r11 == r12) goto L6c
            r5 = 3
            if (r11 == r5) goto L67
            r5 = r2
            r8 = r3
            goto L8a
        L67:
            boolean r5 = r4.c
            r4.c = r3
            goto L88
        L6c:
            boolean r8 = r4.c
            if (r8 == 0) goto L78
            boolean r5 = r10.contains(r5, r6)
            if (r5 != 0) goto L78
            r5 = r3
            goto L79
        L78:
            r5 = r2
        L79:
            int r6 = r14.getAction()
            if (r6 != r2) goto L8a
            r4.c = r3
            goto L8a
        L82:
            boolean r5 = r8.contains(r5, r6)
            r4.c = r5
        L88:
            r8 = r5
            r5 = r2
        L8a:
            if (r8 == 0) goto La9
            if (r5 == 0) goto L9e
            int r3 = r7.getWidth()
            int r3 = r3 / r12
            float r3 = (float) r3
            int r4 = r7.getHeight()
            int r4 = r4 / r12
            float r4 = (float) r4
            r14.setLocation(r3, r4)
            goto La5
        L9e:
            int r9 = r9 * 2
            int r3 = -r9
            float r3 = (float) r3
            r14.setLocation(r3, r3)
        La5:
            boolean r3 = r7.dispatchTouchEvent(r14)
        La9:
            if (r3 == 0) goto Lac
            return r2
        Lac:
            int r1 = r1 + (-1)
            goto L8
        Lb0:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C5257fT3.onTouchEvent(android.view.MotionEvent):boolean");
    }
}
