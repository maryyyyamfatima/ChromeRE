package defpackage;

import J.N;
import android.app.Activity;
import android.graphics.Point;
import android.os.Build;
import android.view.MotionEvent;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.View;
import java.util.HashMap;
import java.util.Map;
import org.chromium.chrome.browser.compositor.CompositorView;
import org.chromium.components.webxr.ArCoreJavaUtils;
import org.chromium.content.browser.ScreenOrientationProviderImpl;
import org.chromium.content_public.browser.WebContents;
import org.chromium.ui.base.WindowAndroid;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Lj, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class SurfaceHolderCallback2C1475Lj implements SurfaceHolder.Callback2, View.OnTouchListener, InterfaceC7338lX2 {
    public static final boolean q;
    public ArCoreJavaUtils a;
    public C0695Fj g;
    public Activity h;
    public boolean i;
    public Integer j;
    public boolean k;
    public C1215Jj l;
    public WebContents m;
    public boolean n;
    public HashMap o;
    public Integer p;

    @Override // defpackage.InterfaceC7338lX2
    public final void b() {
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
    }

    @Override // android.view.SurfaceHolder.Callback2
    public final void surfaceRedrawNeeded(SurfaceHolder surfaceHolder) {
    }

    static {
        q = Build.VERSION.SDK_INT < 26;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0 || actionMasked == 1 || actionMasked == 5 || actionMasked == 6 || actionMasked == 3 || actionMasked == 2) {
            if (actionMasked == 0) {
                int pointerId = motionEvent.getPointerId(0);
                Integer valueOf = Integer.valueOf(pointerId);
                this.p = valueOf;
                if (((C1345Kj) this.o.put(valueOf, new C1345Kj(motionEvent.getX(0), motionEvent.getY(0)))) != null) {
                    AbstractC4851eH1.f("ArImmersiveOverlay", AbstractC9307rF1.a("New pointer with ID ", pointerId, " introduced by ACTION_DOWN when old pointer with the same ID already exists."), new Object[0]);
                }
                d(false);
            }
            if (actionMasked == 1 || actionMasked == 3) {
                d(true);
                this.p = null;
                this.o.clear();
            }
            if (actionMasked == 5) {
                int actionIndex = motionEvent.getActionIndex();
                int pointerId2 = motionEvent.getPointerId(actionIndex);
                if (((C1345Kj) this.o.put(Integer.valueOf(pointerId2), new C1345Kj(motionEvent.getX(actionIndex), motionEvent.getY(actionIndex)))) != null) {
                    AbstractC4851eH1.f("ArImmersiveOverlay", AbstractC9307rF1.a("New pointer with ID ", pointerId2, " introduced by ACTION_POINTER_DOWN when old pointer with the same ID already exists."), new Object[0]);
                }
                d(false);
            }
            if (actionMasked == 6) {
                int pointerId3 = motionEvent.getPointerId(motionEvent.getActionIndex());
                if (!this.o.containsKey(Integer.valueOf(pointerId3))) {
                    AbstractC4851eH1.f("ArImmersiveOverlay", AbstractC9307rF1.a("Pointer with ID ", pointerId3, " not found in mPointerIdToData, ignoring ACTION_POINTER_UP for it."), new Object[0]);
                } else {
                    ((C1345Kj) this.o.get(Integer.valueOf(pointerId3))).c = false;
                    d(false);
                    Integer num = this.p;
                    if (num != null && num.intValue() == pointerId3) {
                        this.p = null;
                    }
                    this.o.remove(Integer.valueOf(pointerId3));
                }
            }
            if (actionMasked == 2) {
                for (int i = 0; i < motionEvent.getPointerCount(); i++) {
                    int pointerId4 = motionEvent.getPointerId(i);
                    C1345Kj c1345Kj = (C1345Kj) this.o.get(Integer.valueOf(pointerId4));
                    if (c1345Kj == null) {
                        AbstractC4851eH1.f("ArImmersiveOverlay", "Pointer with ID " + pointerId4 + "(index " + i + ") not found in mPointerIdToData, ignoring ACTION_MOVE for it.", new Object[0]);
                    } else {
                        c1345Kj.a = motionEvent.getX(i);
                        c1345Kj.b = motionEvent.getY(i);
                    }
                }
                d(false);
            }
        }
        if (this.n) {
            this.g.b.dispatchTouchEvent(motionEvent);
        }
        return true;
    }

    public final void d(boolean z) {
        for (Map.Entry entry : this.o.entrySet()) {
            ArCoreJavaUtils arCoreJavaUtils = this.a;
            Integer num = this.p;
            boolean z2 = num != null && num.equals(entry.getKey());
            boolean z3 = z ? false : ((C1345Kj) entry.getValue()).c;
            int intValue = ((Integer) entry.getKey()).intValue();
            float f = ((C1345Kj) entry.getValue()).a;
            float f2 = ((C1345Kj) entry.getValue()).b;
            long j = arCoreJavaUtils.a;
            if (j != 0) {
                N.MDIQ8Jlb(j, arCoreJavaUtils, z2, z3, intValue, f, f2);
            }
        }
    }

    @Override // defpackage.InterfaceC7338lX2
    public final boolean a(Activity activity, int i) {
        if (this.h != activity || this.j == null) {
            return true;
        }
        this.j = Integer.valueOf(i);
        return false;
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        int i4;
        int i5;
        AbstractC1895Op0 abstractC1895Op0 = this.m.Q0().i;
        if (!this.i) {
            ScreenOrientationProviderImpl.getInstance().a = this;
            if (this.j == null) {
                this.j = Integer.valueOf(this.h.getRequestedOrientation());
            }
            this.h.setRequestedOrientation(14);
            Point point = abstractC1895Op0.c;
            int i6 = point.x;
            int i7 = point.y;
            if (i2 < i6 || i3 < i7) {
                i4 = i7;
                i5 = i6;
            } else {
                i5 = i2;
                i4 = i3;
            }
            int i8 = abstractC1895Op0.g;
            ArCoreJavaUtils arCoreJavaUtils = this.a;
            Surface surface = surfaceHolder.getSurface();
            WindowAndroid Q0 = this.m.Q0();
            long j = arCoreJavaUtils.a;
            if (j != 0) {
                N.Mb69SmHW(j, arCoreJavaUtils, surface, Q0, i8, i5, i4);
            }
            this.i = true;
            return;
        }
        abstractC1895Op0.getClass();
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        c();
    }

    public final void c() {
        if (this.k) {
            return;
        }
        this.k = true;
        ArCoreJavaUtils arCoreJavaUtils = this.a;
        long j = arCoreJavaUtils.a;
        if (j != 0) {
            N.MQMjvNKC(j, arCoreJavaUtils);
        }
        C1215Jj c1215Jj = this.l;
        SurfaceHolderCallback2C1475Lj surfaceHolderCallback2C1475Lj = c1215Jj.f;
        surfaceHolderCallback2C1475Lj.m.P(c1215Jj.b);
        if (q && c1215Jj.e) {
            c1215Jj.d = true;
        } else {
            c1215Jj.a();
        }
        CompositorView compositorView = surfaceHolderCallback2C1475Lj.g.c;
        compositorView.t = false;
        if (c1215Jj.c) {
            N.M$Spxfoj(compositorView.k, compositorView, false);
            compositorView.h = false;
            compositorView.g.h(compositorView.b());
        }
        N.MfNGeyza(compositorView.k, compositorView, false);
        compositorView.g.g();
        compositorView.a();
        if (!this.m.isDestroyed()) {
            this.m.h();
        }
        ScreenOrientationProviderImpl.getInstance().a = null;
        Integer num = this.j;
        if (num != null) {
            this.h.setRequestedOrientation(num.intValue());
        }
        this.j = null;
    }
}
