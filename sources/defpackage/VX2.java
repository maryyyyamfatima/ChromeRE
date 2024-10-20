package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class VX2 extends View {
    public final ViewGroup a;
    public final int g;
    public final NX2 h;

    public VX2(Context context, ViewGroup viewGroup, int i, TX2 tx2) {
        super(context);
        this.a = viewGroup;
        setFocusable(false);
        setImportantForAccessibility(2);
        this.g = i;
        this.h = tx2;
        setAlpha(0.0f);
        setVisibility(8);
        setBackgroundColor(i);
        setLayoutParams(new ViewGroup.MarginLayoutParams(-1, -1));
    }

    @Override // android.view.View
    public final void setBackgroundColor(int i) {
        if (i == 0) {
            i = this.g;
        }
        super.setBackgroundColor(i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0036, code lost:            if (((android.view.GestureDetector) r0.f.i(r3)).onTouchEvent(r1) == false) goto L16;     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onTouchEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            NX2 r0 = r5.h
            TX2 r0 = (defpackage.TX2) r0
            boolean r1 = r0.i
            r2 = 0
            if (r1 == 0) goto La
            goto L47
        La:
            org.chromium.ui.modelutil.PropertyModel r1 = r0.f
            java.util.ArrayList r1 = r1.b()
            PD2 r3 = defpackage.UX2.j
            boolean r1 = r1.contains(r3)
            if (r1 != 0) goto L19
            goto L47
        L19:
            boolean r1 = r0.h
            if (r1 == 0) goto L39
            int r1 = r6.getActionMasked()
            if (r1 == 0) goto L39
            android.view.MotionEvent r1 = android.view.MotionEvent.obtain(r6)
            r1.setAction(r2)
            org.chromium.ui.modelutil.PropertyModel r4 = r0.f
            java.lang.Object r4 = r4.i(r3)
            android.view.GestureDetector r4 = (android.view.GestureDetector) r4
            boolean r1 = r4.onTouchEvent(r1)
            if (r1 != 0) goto L39
            goto L47
        L39:
            r0.h = r2
            org.chromium.ui.modelutil.PropertyModel r0 = r0.f
            java.lang.Object r0 = r0.i(r3)
            android.view.GestureDetector r0 = (android.view.GestureDetector) r0
            boolean r2 = r0.onTouchEvent(r6)
        L47:
            if (r2 == 0) goto L4b
            r6 = 1
            return r6
        L4b:
            boolean r6 = super.onTouchEvent(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.VX2.onTouchEvent(android.view.MotionEvent):boolean");
    }
}
