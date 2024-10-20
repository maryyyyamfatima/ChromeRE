package defpackage;

import android.view.GestureDetector;
import android.view.MotionEvent;
import org.chromium.chrome.browser.compositor.bottombar.OverlayPanelContent;
import org.chromium.content.browser.webcontents.WebContentsImpl;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: zf2 */
/* loaded from: classes.dex */
public final class C12187zf2 extends GestureDetector.SimpleOnGestureListener {
    public final /* synthetic */ C0158Bf2 a;

    /* JADX WARN: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002c  */
    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onShowPress(android.view.MotionEvent r5) {
        /*
            r4 = this;
            Bf2 r0 = r4.a
            qf2 r1 = r0.p
            float r2 = r5.getX()
            float r0 = r0.a
            float r2 = r2 * r0
            float r5 = r5.getY()
            float r5 = r5 * r0
            N70 r1 = (defpackage.N70) r1
            boolean r0 = r1.O0(r2, r5)
            if (r0 == 0) goto L29
            float r0 = r1.w
            int r3 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r3 < 0) goto L29
            float r3 = r1.R0()
            float r3 = r3 + r0
            int r5 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r5 > 0) goto L29
            r5 = 1
            goto L2a
        L29:
            r5 = 0
        L2a:
            if (r5 == 0) goto L36
            h70 r5 = r1.b0()
            float r0 = r5.m
            float r2 = r2 * r0
            r5.c(r2)
        L36:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C12187zf2.onShowPress(android.view.MotionEvent):void");
    }

    public C12187zf2(C0158Bf2 c0158Bf2) {
        this.a = c0158Bf2;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        float f3;
        C0158Bf2 c0158Bf2 = this.a;
        AbstractC9101qf2 abstractC9101qf2 = c0158Bf2.p;
        if (abstractC9101qf2.o != 2) {
            if (!c0158Bf2.z) {
                float x = motionEvent2.getX() - motionEvent.getX();
                float y = motionEvent2.getY() - motionEvent.getY();
                if ((y * y) + (x * x) > c0158Bf2.s) {
                    c0158Bf2.A = Math.abs(motionEvent2.getY() - motionEvent.getY()) * 1.25f > Math.abs(motionEvent2.getX() - motionEvent.getX()) ? 2 : 1;
                    c0158Bf2.z = true;
                }
            }
            boolean z = c0158Bf2.y && motionEvent2.getPointerCount() == 1;
            if (c0158Bf2.z && (!c0158Bf2.v || z)) {
                boolean z2 = c0158Bf2.A == 2;
                if (abstractC9101qf2.y) {
                    boolean z3 = f2 < 0.0f;
                    if (z2 && z3) {
                        OverlayPanelContent overlayPanelContent = abstractC9101qf2.e0;
                        if (overlayPanelContent != null) {
                            f3 = overlayPanelContent.e != null ? ((WebContentsImpl) r8).m.c() : -1.0f;
                        } else {
                            f3 = 0.0f;
                        }
                        if (f3 == 0.0f) {
                            z2 = true;
                        }
                    }
                    z2 = false;
                } else if (!z2) {
                    c0158Bf2.y = false;
                }
                int i = z2 ? 1 : 2;
                int i2 = c0158Bf2.t;
                if (i != i2) {
                    c0158Bf2.w = i2;
                    c0158Bf2.t = i;
                    c0158Bf2.u = false;
                    c0158Bf2.v = true;
                    c0158Bf2.x = (i == i2 || i2 == 0) ? false : true;
                }
            }
        }
        return false;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        C0158Bf2 c0158Bf2 = this.a;
        AbstractC9101qf2 abstractC9101qf2 = c0158Bf2.p;
        if (abstractC9101qf2.o != 2) {
            float x = motionEvent.getX();
            float f = c0158Bf2.a;
            float y = motionEvent.getY() * f;
            c0158Bf2.t = abstractC9101qf2.O0(x * f, y) && (y > abstractC9101qf2.I0() ? 1 : (y == abstractC9101qf2.I0() ? 0 : -1)) > 0 ? 2 : 1;
            c0158Bf2.u = false;
            c0158Bf2.v = true;
        }
        return false;
    }
}
