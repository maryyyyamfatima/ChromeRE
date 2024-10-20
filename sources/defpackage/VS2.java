package defpackage;

import android.app.Activity;
import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityManager;
import android.widget.LinearLayout;
import com.google.research.ink.core.jni.HostControllerImpl;
import com.google.research.ink.core.jni.NativeEngine;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArraySet;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes5.dex */
public final class VS2 extends LinearLayout implements View.OnTouchListener, InterfaceC10034tN2, View.OnHoverListener {
    public final BK3 a;
    public final View g;
    public final float h;
    public final float i;
    public final HostControllerImpl j;
    public final AccessibilityManager k;
    public final IS0 l;
    public boolean m;
    public final GF n;
    public final CopyOnWriteArraySet o;
    public final CopyOnWriteArraySet p;
    public final Object q;
    public boolean r;
    public final C3877bS2 s;
    public final C5439fz2 t;
    public final C0330Co u;
    public boolean v;

    public final void a() {
        int i = AbstractC4508dH1.a;
        Iterator it = this.o.iterator();
        while (it.hasNext()) {
            ((VS2) ((InterfaceC10034tN2) it.next())).a();
        }
        this.a.n();
        this.m = true;
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [android.view.View, AW0] */
    /* JADX WARN: Type inference failed for: r0v13, types: [android.view.View, AW0] */
    /* JADX WARN: Type inference failed for: r0v14, types: [android.view.View, AW0] */
    /* JADX WARN: Type inference failed for: r0v15, types: [android.view.View, AW0] */
    /* JADX WARN: Type inference failed for: r0v16, types: [android.view.View, AW0] */
    /* JADX WARN: Type inference failed for: r1v3, types: [android.view.View, AW0] */
    /* JADX WARN: Type inference failed for: r1v4, types: [android.view.View, AW0] */
    public VS2(Activity activity, C0330Co c0330Co) {
        super(activity, null, 0);
        this.m = false;
        this.n = new GF();
        this.o = new CopyOnWriteArraySet();
        this.p = new CopyOnWriteArraySet();
        this.q = new Object();
        C3877bS2 c3877bS2 = new C3877bS2();
        this.s = c3877bS2;
        this.v = false;
        this.u = c0330Co;
        int i = c0330Co.c;
        AbstractC4508dH1.c(String.format("Creating SEngineView with task runner = %d, and view transparency = %s", Integer.valueOf(AbstractC2373Sg3.b(c0330Co.a)), AbstractC4220cS2.b(i)));
        boolean z = i == 2;
        if (z) {
            TextureViewSurfaceTextureListenerC11449xW0 textureViewSurfaceTextureListenerC11449xW0 = new TextureViewSurfaceTextureListenerC11449xW0(activity);
            textureViewSurfaceTextureListenerC11449xW0.setOpaque(false);
            addView(textureViewSurfaceTextureListenerC11449xW0);
            this.g = textureViewSurfaceTextureListenerC11449xW0;
        } else {
            View surfaceHolderCallbackC11106wW0 = new SurfaceHolderCallbackC11106wW0(activity);
            addView(surfaceHolderCallbackC11106wW0);
            this.g = surfaceHolderCallbackC11106wW0;
            setVisibility(4);
        }
        this.g.j(new C3306Zl1(z));
        IS0 is0 = new IS0(activity, this.g);
        this.l = is0;
        BK3 bk3 = new BK3(is0);
        this.a = bk3;
        this.j = new HostControllerImpl(bk3, is0, c3877bS2, new C8987qJ3(activity), c0330Co.e);
        CopyOnWriteArraySet copyOnWriteArraySet = c3877bS2.a;
        copyOnWriteArraySet.add(bk3);
        DisplayMetrics displayMetrics = new DisplayMetrics();
        ((WindowManager) getContext().getSystemService("window")).getDefaultDisplay().getMetrics(displayMetrics);
        float f = displayMetrics.density;
        this.h = f;
        this.i = f * 160.0f;
        this.k = (AccessibilityManager) getContext().getSystemService("accessibility");
        this.g.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        this.g.n();
        this.g.k(this);
        this.g.c();
        this.g.l();
        this.t = new C5439fz2(activity);
        copyOnWriteArraySet.add(new US2(this));
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x007e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(javax.microedition.khronos.opengles.GL10 r7) {
        /*
            r6 = this;
            java.util.concurrent.CopyOnWriteArraySet r0 = r6.o
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L18
            java.lang.Object r1 = r0.next()
            tN2 r1 = (defpackage.InterfaceC10034tN2) r1
            VS2 r1 = (defpackage.VS2) r1
            r1.b(r7)
            goto L6
        L18:
            java.lang.Object r7 = r6.q
            monitor-enter(r7)
            BK3 r0 = r6.a     // Catch: java.lang.Throwable -> Lba
            r0.k()     // Catch: java.lang.Throwable -> Lba
            r0 = 1
            r6.r = r0     // Catch: java.lang.Throwable -> Lba
            java.lang.Object r1 = r6.q     // Catch: java.lang.Throwable -> Lba
            r1.notifyAll()     // Catch: java.lang.Throwable -> Lba
            monitor-exit(r7)     // Catch: java.lang.Throwable -> Lba
            android.graphics.Matrix r7 = new android.graphics.Matrix
            r7.<init>()
            BK3 r1 = r6.a
            java.lang.Object r2 = r1.g
            monitor-enter(r2)
            ne3 r3 = r1.f     // Catch: java.lang.Throwable -> Lb7
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Lb7
            int r2 = r3.a
            r4 = 0
            if (r2 == 0) goto L76
            int r2 = r3.b
            if (r2 != 0) goto L40
            goto L76
        L40:
            com.google.research.ink.core.jni.EngineState r3 = new com.google.research.ink.core.jni.EngineState
            r3.<init>()
            java.lang.Object r5 = r1.e
            monitor-enter(r5)
            com.google.research.ink.core.jni.EngineState r1 = r1.d     // Catch: java.lang.Throwable -> L73
            if (r1 != 0) goto L54
            java.lang.String r1 = "lastFrameEngineState not yet available."
            defpackage.AbstractC4508dH1.a(r1)     // Catch: java.lang.Throwable -> L73
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L73
            r1 = r4
            goto L59
        L54:
            r1.a(r3)     // Catch: java.lang.Throwable -> L73
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L73
            r1 = r0
        L59:
            if (r1 != 0) goto L61
            java.lang.String r0 = "Failed to get engine state in getScreenToWorldTransform."
            defpackage.AbstractC4508dH1.a(r0)
            goto L7b
        L61:
            android.graphics.Matrix r1 = r3.a
            r7.set(r1)
            float r1 = (float) r2
            r2 = 0
            r7.preTranslate(r2, r1)
            r1 = 1065353216(0x3f800000, float:1.0)
            r2 = -1082130432(0xffffffffbf800000, float:-1.0)
            r7.preScale(r1, r2)
            goto L7c
        L73:
            r7 = move-exception
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L73
            throw r7
        L76:
            java.lang.String r0 = "The viewport is degenerate in getScreenToWorldTransform."
            defpackage.AbstractC4508dH1.a(r0)
        L7b:
            r0 = r4
        L7c:
            if (r0 == 0) goto Laf
            GF r0 = r6.n
            boolean r1 = r0.f
            android.graphics.Matrix r2 = r0.d
            if (r1 != 0) goto L8c
            boolean r1 = r7.equals(r2)
            if (r1 != 0) goto Lad
        L8c:
            java.util.concurrent.CopyOnWriteArraySet r1 = r0.b
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto Laa
            T82 r1 = r0.c
            java.lang.Object r1 = r1.a()
            FF r1 = (defpackage.FF) r1
            ne3 r3 = r0.e
            r1.a = r3
            android.graphics.Matrix r3 = new android.graphics.Matrix
            r3.<init>(r7)
            android.os.Handler r3 = r0.a
            r3.post(r1)
        Laa:
            r2.set(r7)
        Lad:
            r0.f = r4
        Laf:
            android.opengl.EGLDisplay r7 = android.opengl.EGL14.eglGetCurrentDisplay()
            android.opengl.EGL14.eglSwapInterval(r7, r4)
            return
        Lb7:
            r7 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Lb7
            throw r7
        Lba:
            r0 = move-exception
            monitor-exit(r7)     // Catch: java.lang.Throwable -> Lba
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.VS2.b(javax.microedition.khronos.opengles.GL10):void");
    }

    public final void d(GL10 gl10, EGLConfig eGLConfig) {
        if (this.m && (getContext() instanceof Activity)) {
            final Activity activity = (Activity) getContext();
            Objects.requireNonNull(activity);
            post(new Runnable() { // from class: TS2
                @Override // java.lang.Runnable
                public final void run() {
                    activity.recreate();
                }
            });
        } else {
            this.v = true;
        }
        this.a.n();
        Iterator it = this.o.iterator();
        while (it.hasNext()) {
            ((VS2) ((InterfaceC10034tN2) it.next())).d(gl10, eGLConfig);
        }
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int i;
        BK3 bk3;
        C5439fz2 c5439fz2;
        int i2;
        int i3;
        Iterator it = this.p.iterator();
        while (it.hasNext()) {
            ((View.OnTouchListener) it.next()).onTouch(view, motionEvent);
        }
        int i4 = 0;
        while (true) {
            int historySize = motionEvent.getHistorySize();
            i = 8;
            int i5 = 4;
            int i6 = 3;
            bk3 = this.a;
            c5439fz2 = this.t;
            if (i4 >= historySize) {
                break;
            }
            int i7 = 0;
            while (i7 < motionEvent.getPointerCount()) {
                C3988bm1 c3988bm1 = (C3988bm1) C3988bm1.j.a();
                int toolType = motionEvent.getToolType(i7);
                if (toolType == 0 || toolType == 1) {
                    i3 = 2;
                } else {
                    if (toolType != 2) {
                        if (toolType == i6) {
                            i3 = 1;
                        } else if (toolType != i5) {
                            i3 = 0;
                        }
                    }
                    i3 = i6;
                }
                c3988bm1.a = i3;
                c3988bm1.b = motionEvent.getPointerId(i7);
                c3988bm1.c = 1;
                c3988bm1.d = motionEvent.getHistoricalEventTime(i4) / 1000.0d;
                c3988bm1.e = motionEvent.getHistoricalX(i7, i4);
                c3988bm1.f = motionEvent.getHistoricalY(i7, i4);
                if (motionEvent.getToolType(i7) == 1) {
                    c3988bm1.g = c5439fz2.a(motionEvent.getHistoricalPressure(i7, i4));
                } else {
                    c3988bm1.g = motionEvent.getHistoricalPressure(i7, i4);
                }
                if (motionEvent.getToolType(i7) == 2) {
                    c3988bm1.h = motionEvent.getHistoricalAxisValue(25, i7, i4);
                    c3988bm1.i = (-1.5707964f) - motionEvent.getHistoricalAxisValue(8, i7, i4);
                }
                bk3.getClass();
                C4675dm1 c4675dm1 = (C4675dm1) C4675dm1.b.a();
                c4675dm1.a = c3988bm1;
                bk3.a.a(c4675dm1);
                i7++;
                i5 = 4;
                i6 = 3;
            }
            i4++;
        }
        int i8 = 0;
        while (i8 < motionEvent.getPointerCount()) {
            C3988bm1 c3988bm12 = (C3988bm1) C3988bm1.j.a();
            int toolType2 = motionEvent.getToolType(i8);
            if (toolType2 == 0 || toolType2 == 1) {
                i2 = 2;
            } else {
                if (toolType2 != 2) {
                    if (toolType2 == 3) {
                        i2 = 1;
                    } else if (toolType2 != 4) {
                        i2 = 0;
                    }
                }
                i2 = 3;
            }
            c3988bm12.a = i2;
            c3988bm12.b = motionEvent.getPointerId(i8);
            if (motionEvent.getToolType(i8) == 2) {
                c3988bm12.h = motionEvent.getAxisValue(25, i8);
                c3988bm12.i = (-1.5707964f) - motionEvent.getAxisValue(i, i8);
            }
            if (motionEvent.getToolType(i8) == 1) {
                c3988bm12.g = c5439fz2.a(motionEvent.getPressure(i8));
            } else {
                c3988bm12.g = motionEvent.getPressure(i8);
            }
            if (motionEvent.getActionMasked() == 3) {
                c3988bm12.c = 144;
            } else if (i8 == motionEvent.getActionIndex()) {
                int actionMasked = motionEvent.getActionMasked();
                if (actionMasked != 0) {
                    if (actionMasked != 1) {
                        if (actionMasked != 2) {
                            if (actionMasked != 5) {
                                if (actionMasked != 6) {
                                    if (actionMasked != 7) {
                                        if (actionMasked != 9) {
                                            if (actionMasked != 10) {
                                                AbstractC4508dH1.a("Unhandled action mask");
                                                c3988bm12.c = 144;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        c3988bm12.c = 1;
                    }
                    c3988bm12.c = 16;
                }
                c3988bm12.c = 9;
            } else {
                c3988bm12.c = 1;
            }
            if (motionEvent.getToolType(i8) == 4) {
                c3988bm12.c |= 1024;
            }
            c3988bm12.d = motionEvent.getEventTime() / 1000.0d;
            c3988bm12.e = motionEvent.getX(i8);
            c3988bm12.f = motionEvent.getY(i8);
            bk3.getClass();
            C4675dm1 c4675dm12 = (C4675dm1) C4675dm1.b.a();
            c4675dm12.a = c3988bm12;
            bk3.a.a(c4675dm12);
            i8++;
            i = 8;
        }
        return true;
    }

    @Override // android.view.View.OnHoverListener
    public final boolean onHover(View view, MotionEvent motionEvent) {
        if (!this.k.isTouchExplorationEnabled()) {
            return false;
        }
        onTouch(view, motionEvent);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        return super.dispatchHoverEvent(motionEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.View
    public final void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [android.view.View, AW0] */
    /* JADX WARN: Type inference failed for: r0v9, types: [android.view.View, AW0] */
    public final void c(GL10 gl10, int i, int i2) {
        QS2 qs2 = (QS2) RS2.p.j();
        if (qs2.h) {
            qs2.l();
            qs2.h = false;
        }
        RS2 rs2 = (RS2) qs2.g;
        rs2.j |= 1;
        rs2.k = i;
        if (qs2.h) {
            qs2.l();
            qs2.h = false;
        }
        RS2 rs22 = (RS2) qs2.g;
        rs22.j |= 2;
        rs22.l = i2;
        float f = this.i;
        if (qs2.h) {
            qs2.l();
            qs2.h = false;
        }
        RS2 rs23 = (RS2) qs2.g;
        rs23.j |= 4;
        rs23.m = f;
        float f2 = this.h;
        if (qs2.h) {
            qs2.l();
            qs2.h = false;
        }
        RS2 rs24 = (RS2) qs2.g;
        rs24.j |= 16;
        rs24.o = f2;
        RS2 rs25 = (RS2) qs2.j();
        if (!(this.a.b != null)) {
            NativeEngine nativeEngine = new NativeEngine(this.j, rs25, this.u);
            BK3 bk3 = this.a;
            if (bk3.b != null) {
                throw new RuntimeException("setNativeEngine() should not be called twice");
            }
            bk3.b = nativeEngine;
            T02 t02 = bk3.n;
            if (t02 != null) {
                bk3.n = t02;
                bk3.a.a(new U43(t02));
            }
            C2597Tz2 c2597Tz2 = bk3.o;
            if (c2597Tz2 != null) {
                bk3.q(c2597Tz2);
            }
            C2195Qx0 c2195Qx0 = bk3.p;
            if (c2195Qx0 != null) {
                bk3.p = c2195Qx0;
                FS2 fs2 = (FS2) GS2.l.j();
                C2195Qx0 c2195Qx02 = bk3.p;
                if (fs2.h) {
                    fs2.l();
                    fs2.h = false;
                }
                GS2 gs2 = (GS2) fs2.g;
                gs2.getClass();
                c2195Qx02.getClass();
                gs2.k = c2195Qx02;
                gs2.j |= 1;
                GS2 gs22 = (GS2) fs2.j();
                C6969kS2 c6969kS2 = (C6969kS2) C7313lS2.l.j();
                if (c6969kS2.h) {
                    c6969kS2.l();
                    c6969kS2.h = false;
                }
                C7313lS2 c7313lS2 = (C7313lS2) c6969kS2.g;
                c7313lS2.getClass();
                gs22.getClass();
                c7313lS2.k = gs22;
                c7313lS2.j = 16;
                bk3.o((C7313lS2) c6969kS2.j());
            }
        }
        BK3 bk32 = this.a;
        synchronized (bk32.g) {
            bk32.f = new C8066ne3(rs25.k, rs25.l);
        }
        C6969kS2 c6969kS22 = (C6969kS2) C7313lS2.l.j();
        if (c6969kS22.h) {
            c6969kS22.l();
            c6969kS22.h = false;
        }
        C7313lS2 c7313lS22 = (C7313lS2) c6969kS22.g;
        c7313lS22.getClass();
        c7313lS22.k = rs25;
        c7313lS22.j = 1;
        bk32.o((C7313lS2) c6969kS22.j());
        GF gf = this.n;
        gf.getClass();
        gf.e = new C8066ne3(i, i2);
        gf.f = true;
        this.g.setOnTouchListener(this);
        this.g.setOnHoverListener(this);
        Iterator it = this.o.iterator();
        while (it.hasNext()) {
            ((VS2) ((InterfaceC10034tN2) it.next())).c(gl10, i, i2);
        }
    }
}
