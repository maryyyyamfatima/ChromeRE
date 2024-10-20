package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.chromium.chrome.browser.compositor.bottombar.OverlayPanelContent;
import org.chromium.chrome.browser.contextualsearch.ContextualSearchManager;
import org.chromium.content_public.browser.WebContents;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Bf2 */
/* loaded from: classes.dex */
public final class C0158Bf2 extends AbstractC9059qY0 {
    public int A;
    public boolean B;
    public boolean C;
    public float D;
    public float E;
    public final ArrayList F;
    public float G;
    public boolean H;
    public final AbstractC9101qf2 p;
    public final GestureDetector q;
    public final C0028Af2 r;
    public final float s;
    public int t;
    public boolean u;
    public boolean v;
    public int w;
    public boolean x;
    public boolean y;
    public boolean z;

    public C0158Bf2(Context context, AbstractC9101qf2 abstractC9101qf2) {
        super(context, abstractC9101qf2);
        this.F = new ArrayList();
        this.q = new GestureDetector(context, new C12187zf2(this));
        this.p = abstractC9101qf2;
        this.r = new C0028Af2(this, context);
        float scaledTouchSlop = ViewConfiguration.get(context).getScaledTouchSlop();
        this.s = scaledTouchSlop * scaledTouchSlop;
        e();
    }

    @Override // defpackage.AbstractC5518gD0
    public final boolean b(MotionEvent motionEvent) {
        AbstractC9101qf2 abstractC9101qf2 = this.p;
        if (abstractC9101qf2.a()) {
            float x = motionEvent.getX();
            float f = this.a;
            if (abstractC9101qf2.O0(x * f, motionEvent.getY() * f) || abstractC9101qf2.x()) {
                return true;
            }
        }
        this.F.clear();
        e();
        return false;
    }

    @Override // defpackage.AbstractC9059qY0, defpackage.AbstractC5518gD0
    public final void c(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        AbstractC9101qf2 abstractC9101qf2 = this.p;
        int i = abstractC9101qf2.o;
        GestureDetector gestureDetector = this.q;
        if (i == 2) {
            if (actionMasked == 0) {
                motionEvent.getX();
                OverlayPanelContent J0 = ((N70) abstractC9101qf2).J0();
                if (!J0.n) {
                    J0.n = true;
                    if (!TextUtils.isEmpty(J0.q)) {
                        J0.c(J0.q);
                    }
                    if (J0.e == null) {
                        J0.a();
                    }
                    WebContents webContents = J0.e;
                    if (webContents != null) {
                        webContents.T0();
                    }
                    AbstractC4290cf2 abstractC4290cf2 = J0.o;
                    ContextualSearchManager contextualSearchManager = ((G70) abstractC4290cf2).a;
                    if (!contextualSearchManager.O) {
                        contextualSearchManager.v.d0();
                    }
                    abstractC4290cf2.a();
                }
            }
            this.r.a(motionEvent);
            gestureDetector.onTouchEvent(motionEvent);
            return;
        }
        boolean z = this.u;
        float f = this.a;
        if (!z && actionMasked == 0) {
            this.G = motionEvent.getY();
            float x = motionEvent.getX() * f;
            float f2 = this.G * f;
            if (abstractC9101qf2.O0(x, f2) && f2 > abstractC9101qf2.I0()) {
                this.u = true;
                this.y = true;
            } else {
                this.t = 1;
                this.u = false;
                this.v = true;
                this.y = false;
            }
        }
        gestureDetector.onTouchEvent(motionEvent);
        boolean z2 = this.v;
        ArrayList arrayList = this.F;
        if (!z2) {
            arrayList.add(MotionEvent.obtain(motionEvent));
            this.B = true;
        } else {
            if (this.B) {
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    MotionEvent motionEvent2 = (MotionEvent) arrayList.get(i2);
                    d(motionEvent2, this.t);
                    motionEvent2.recycle();
                }
                arrayList.clear();
                this.B = false;
            }
            if (this.x) {
                MotionEvent obtain = MotionEvent.obtain(motionEvent);
                obtain.setAction(3);
                d(obtain, this.w);
                obtain.recycle();
                MotionEvent obtain2 = MotionEvent.obtain(motionEvent);
                obtain2.setAction(0);
                this.C = true;
                this.D = obtain2.getX();
                this.E = obtain2.getY() - (abstractC9101qf2.I0() / f);
                d(obtain2, this.t);
                obtain2.recycle();
                this.x = false;
            }
            d(motionEvent, this.t);
        }
        if (actionMasked == 1 || actionMasked == 3) {
            e();
        }
    }

    public final void e() {
        this.t = 0;
        this.u = false;
        this.v = false;
        this.w = 0;
        this.x = false;
        this.y = false;
        this.C = false;
        this.A = 0;
        this.z = false;
    }

    public final void d(MotionEvent motionEvent, int i) {
        boolean z;
        boolean z2 = false;
        if (i == 1) {
            if (motionEvent.getActionMasked() == 0) {
                this.H = true;
            }
            if (!this.H) {
                MotionEvent obtain = MotionEvent.obtain(motionEvent);
                obtain.setAction(0);
                super.c(obtain);
                this.H = true;
            }
            super.c(motionEvent);
            return;
        }
        if (i == 2) {
            int actionMasked = motionEvent.getActionMasked();
            int i2 = this.A;
            AbstractC9101qf2 abstractC9101qf2 = this.p;
            if (i2 != 1 || abstractC9101qf2.y) {
                z = false;
            } else {
                if (actionMasked == 6 || actionMasked == 5) {
                    return;
                }
                motionEvent = MotionEvent.obtain(motionEvent.getDownTime(), motionEvent.getEventTime(), motionEvent.getActionMasked(), motionEvent.getX(), this.G, motionEvent.getMetaState());
                z = true;
            }
            float f = abstractC9101qf2.v;
            float f2 = this.a;
            motionEvent.offsetLocation(-(f / f2), -(abstractC9101qf2.I0() / f2));
            abstractC9101qf2.b();
            ViewGroup d = abstractC9101qf2.d();
            if (this.C && actionMasked == 1) {
                float x = motionEvent.getX() - this.D;
                float y = motionEvent.getY() - this.E;
                if (!((y * y) + (x * x) > this.s)) {
                    motionEvent.setAction(3);
                    if (d != null) {
                        d.dispatchTouchEvent(motionEvent);
                    }
                    z2 = true;
                }
            } else if (actionMasked == 0) {
                ((N70) abstractC9101qf2).t0 = true;
            }
            if (!z2 && d != null) {
                d.dispatchTouchEvent(motionEvent);
            }
            if (z) {
                motionEvent.recycle();
            }
        }
    }
}
