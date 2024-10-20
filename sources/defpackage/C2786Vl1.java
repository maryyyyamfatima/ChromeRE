package defpackage;

import android.content.Context;
import android.graphics.RectF;
import android.view.MotionEvent;
import com.android.chrome.R;
import com.google.research.ink.core.jni.EngineState;
import org.chromium.chrome.browser.image_editor.OverlayFragment;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Vl1 */
/* loaded from: classes5.dex */
public final class C2786Vl1 {
    public final OverlayFragment a;
    public final Context b;
    public InterfaceC11344xB0 c;
    public int f;
    public int g;
    public int h;
    public final int j;
    public int k;
    public VR3 d = VR3.l;
    public float e = 0.4f;
    public int i = 2;

    public C2786Vl1(Context context, OverlayFragment overlayFragment) {
        this.a = overlayFragment;
        this.b = context;
        this.f = context.getResources().getColor(R.color.0_resource_name_obfuscated_res_0x7f070105);
        this.g = context.getResources().getColor(R.color.0_resource_name_obfuscated_res_0x7f070105);
        this.h = context.getResources().getColor(R.color.0_resource_name_obfuscated_res_0x7f070105);
        this.j = context.getResources().getColor(R.color.0_resource_name_obfuscated_res_0x7f0700da);
    }

    public final void i(VR3 vr3) {
        WR3 c;
        C8066ne3 c8066ne3;
        int ordinal = vr3.ordinal();
        if (ordinal == 1) {
            c = c(this.f, this.e);
        } else if (ordinal == 5) {
            TR3 tr3 = (TR3) WR3.p.j();
            if (tr3.h) {
                tr3.l();
                tr3.h = false;
            }
            WR3 wr3 = (WR3) tr3.g;
            wr3.getClass();
            wr3.m = 5;
            wr3.j = 1 | wr3.j;
            c = (WR3) tr3.j();
        } else if (ordinal == 7) {
            TR3 tr32 = (TR3) WR3.p.j();
            if (tr32.h) {
                tr32.l();
                tr32.h = false;
            }
            WR3 wr32 = (WR3) tr32.g;
            wr32.getClass();
            wr32.m = 8;
            wr32.j |= 1;
            c = (WR3) tr32.j();
            C2467Sz2 c2467Sz2 = (C2467Sz2) C2597Tz2.l.j();
            if (c2467Sz2.h) {
                c2467Sz2.l();
                c2467Sz2.h = false;
            }
            C2597Tz2 c2597Tz2 = (C2597Tz2) c2467Sz2.g;
            c2597Tz2.j |= 1;
            c2597Tz2.k = this.j;
            C2597Tz2 c2597Tz22 = (C2597Tz2) c2467Sz2.j();
            C7657mS2 c7657mS2 = (C7657mS2) C8001nS2.l.j();
            if (c7657mS2.h) {
                c7657mS2.l();
                c7657mS2.h = false;
            }
            C8001nS2 c8001nS2 = (C8001nS2) c7657mS2.g;
            c8001nS2.getClass();
            c2597Tz22.getClass();
            c8001nS2.k = c2597Tz22;
            c8001nS2.j = 1;
            C8001nS2 c8001nS22 = (C8001nS2) c7657mS2.j();
            BK3 bk3 = (BK3) this.c;
            bk3.getClass();
            C6969kS2 c6969kS2 = (C6969kS2) C7313lS2.l.j();
            if (c6969kS2.h) {
                c6969kS2.l();
                c6969kS2.h = false;
            }
            C7313lS2 c7313lS2 = (C7313lS2) c6969kS2.g;
            c7313lS2.getClass();
            c8001nS22.getClass();
            c7313lS2.k = c8001nS22;
            c7313lS2.j = 50;
            bk3.o((C7313lS2) c6969kS2.j());
        } else if (ordinal == 12) {
            c = e(this.g);
            final OverlayFragment overlayFragment = this.a;
            overlayFragment.h0 = true;
            C11653y51 c11653y51 = overlayFragment.e0;
            BK3 bk32 = overlayFragment.b0;
            synchronized (bk32.g) {
                c8066ne3 = bk32.f;
            }
            C11996z51 c11996z51 = c11653y51.a;
            c11996z51.getClass();
            c11996z51.j = c8066ne3.b;
            c11996z51.a.o(B51.b, c8066ne3);
            overlayFragment.b0.m(new Runnable() { // from class: jf2
                @Override // java.lang.Runnable
                public final void run() {
                    C8066ne3 c8066ne32;
                    OverlayFragment overlayFragment2 = OverlayFragment.this;
                    BK3 bk33 = overlayFragment2.b0;
                    synchronized (bk33.g) {
                        c8066ne32 = bk33.f;
                    }
                    float f = c8066ne32.b / 2.0f;
                    MotionEvent obtain = MotionEvent.obtain(0L, 0L, 0, c8066ne32.a / 2.0f, f, 0);
                    MotionEvent obtain2 = MotionEvent.obtain(0L, 0L, 1, c8066ne32.a / 2.0f, f, 0);
                    VS2 vs2 = overlayFragment2.c0;
                    vs2.onTouch(vs2, obtain);
                    VS2 vs22 = overlayFragment2.c0;
                    vs22.onTouch(vs22, obtain2);
                }
            });
        } else if (ordinal != 18) {
            return;
        } else {
            c = d(this.h, this.i);
        }
        ((BK3) this.c).s(c);
        if (vr3 == VR3.l) {
            ((BK3) this.c).p(0);
        } else {
            ((BK3) this.c).p(this.b.getResources().getColor(R.color.0_resource_name_obfuscated_res_0x7f070099));
        }
        this.d = vr3;
        this.k = 0;
    }

    public final void a() {
        VR3 vr3 = this.d;
        VR3 vr32 = VR3.s;
        if (vr3 == vr32 || vr3 == VR3.h || vr3 == VR3.y) {
            for (int i = 0; i < this.k; i++) {
                j();
            }
            if (this.d == vr32) {
                this.a.N0(true);
            }
        }
        i(VR3.l);
    }

    public final void b() {
        VR3 vr3 = this.d;
        if (vr3 == VR3.s) {
            this.a.N0(false);
        } else if (vr3 == VR3.n) {
            BK3 bk3 = (BK3) this.c;
            bk3.getClass();
            C6969kS2 c6969kS2 = (C6969kS2) C7313lS2.l.j();
            C12117zS2 c12117zS2 = C12117zS2.j;
            if (c6969kS2.h) {
                c6969kS2.l();
                c6969kS2.h = false;
            }
            C7313lS2 c7313lS2 = (C7313lS2) c6969kS2.g;
            c7313lS2.getClass();
            c7313lS2.k = c12117zS2;
            c7313lS2.j = 27;
            bk3.o((C7313lS2) c6969kS2.j());
        }
        i(VR3.l);
    }

    public final void f(InterfaceC11001wB0 interfaceC11001wB0) {
        boolean z;
        RectF rectF;
        int i;
        BK3 bk3 = (BK3) this.c;
        bk3.getClass();
        EngineState engineState = new EngineState();
        synchronized (bk3.e) {
            EngineState engineState2 = bk3.d;
            if (engineState2 == null) {
                AbstractC4508dH1.a("lastFrameEngineState not yet available.");
                z = false;
            } else {
                engineState2.a(engineState);
                z = true;
            }
        }
        if (z) {
            rectF = new RectF(engineState.b);
        } else {
            AbstractC4508dH1.a("Engine state not available for getPageBounds()");
            rectF = null;
        }
        int i2 = 2048;
        if (rectF != null) {
            float f = 2048;
            if (rectF.height() > f || rectF.width() > f) {
                i2 = (int) Math.ceil(Math.max(rectF.height(), rectF.width()));
            }
        }
        BK3 bk32 = (BK3) this.c;
        bk32.getClass();
        C9373rS2 c9373rS2 = C9373rS2.p;
        C9031qS2 c9031qS2 = (C9031qS2) c9373rS2.j();
        if (c9031qS2.h) {
            c9031qS2.l();
            c9031qS2.h = false;
        }
        C9373rS2 c9373rS22 = (C9373rS2) c9031qS2.g;
        c9373rS22.k = 1;
        c9373rS22.l = Integer.valueOf(i2);
        C5939hS2 c5939hS2 = (C5939hS2) C6283iS2.n.j();
        if (c5939hS2.h) {
            c5939hS2.l();
            c5939hS2.h = false;
        }
        C6283iS2 c6283iS2 = (C6283iS2) c5939hS2.g;
        C9373rS2 c9373rS23 = (C9373rS2) c9031qS2.j();
        c6283iS2.getClass();
        c9373rS23.getClass();
        c6283iS2.k = c9373rS23;
        c6283iS2.j |= 1;
        if (c5939hS2.h) {
            c5939hS2.l();
            c5939hS2.h = false;
        }
        C6283iS2 c6283iS22 = (C6283iS2) c5939hS2.g;
        c6283iS22.j |= 2;
        c6283iS22.l = 1.0f;
        if (c5939hS2.h) {
            c5939hS2.l();
            c5939hS2.h = false;
        }
        C6283iS2 c6283iS23 = (C6283iS2) c5939hS2.g;
        c6283iS23.j |= 4;
        c6283iS23.m = 1;
        C6283iS2 c6283iS24 = (C6283iS2) c5939hS2.j();
        AK3 ak3 = new AK3(interfaceC11001wB0);
        synchronized (bk32.m) {
            i = bk32.l;
            bk32.l = i + 1;
            bk32.k.put(Integer.valueOf(i), ak3);
        }
        C6969kS2 c6969kS2 = (C6969kS2) C7313lS2.l.j();
        PX0 px0 = PX0.NEW_BUILDER;
        JX0 jx0 = (JX0) c6283iS24.l(px0);
        jx0.m(c6283iS24);
        C5939hS2 c5939hS22 = (C5939hS2) jx0;
        C9373rS2 c9373rS24 = c6283iS24.k;
        if (c9373rS24 != null) {
            c9373rS2 = c9373rS24;
        }
        JX0 jx02 = (JX0) c9373rS2.l(px0);
        jx02.m(c9373rS2);
        C9031qS2 c9031qS22 = (C9031qS2) jx02;
        if (c9031qS22.h) {
            c9031qS22.l();
            c9031qS22.h = false;
        }
        C9373rS2 c9373rS25 = (C9373rS2) c9031qS22.g;
        c9373rS25.j |= 4096;
        c9373rS25.o = i;
        if (c5939hS22.h) {
            c5939hS22.l();
            c5939hS22.h = false;
        }
        C6283iS2 c6283iS25 = (C6283iS2) c5939hS22.g;
        C9373rS2 c9373rS26 = (C9373rS2) c9031qS22.j();
        c6283iS25.getClass();
        c9373rS26.getClass();
        c6283iS25.k = c9373rS26;
        c6283iS25.j |= 1;
        if (c6969kS2.h) {
            c6969kS2.l();
            c6969kS2.h = false;
        }
        C7313lS2 c7313lS2 = (C7313lS2) c6969kS2.g;
        C6283iS2 c6283iS26 = (C6283iS2) c5939hS22.j();
        c7313lS2.getClass();
        c6283iS26.getClass();
        c7313lS2.k = c6283iS26;
        c7313lS2.j = 43;
        bk32.o((C7313lS2) c6969kS2.j());
    }

    public final void g() {
        BK3 bk3 = (BK3) this.c;
        bk3.getClass();
        C6969kS2 c6969kS2 = (C6969kS2) C7313lS2.l.j();
        C12117zS2 c12117zS2 = C12117zS2.j;
        if (c6969kS2.h) {
            c6969kS2.l();
            c6969kS2.h = false;
        }
        C7313lS2 c7313lS2 = (C7313lS2) c6969kS2.g;
        c7313lS2.getClass();
        c7313lS2.k = c12117zS2;
        c7313lS2.j = 24;
        bk3.o((C7313lS2) c6969kS2.j());
    }

    public final void j() {
        BK3 bk3 = (BK3) this.c;
        bk3.getClass();
        C6969kS2 c6969kS2 = (C6969kS2) C7313lS2.l.j();
        C12117zS2 c12117zS2 = C12117zS2.j;
        if (c6969kS2.h) {
            c6969kS2.l();
            c6969kS2.h = false;
        }
        C7313lS2 c7313lS2 = (C7313lS2) c6969kS2.g;
        c7313lS2.getClass();
        c7313lS2.k = c12117zS2;
        c7313lS2.j = 23;
        bk3.o((C7313lS2) c6969kS2.j());
    }

    public final void h(int i) {
        if (i == 0) {
            throw null;
        }
        int i2 = i - 1;
        if (this.d != VR3.y) {
            return;
        }
        this.i = i2;
        ((BK3) this.c).s(d(this.h, i2));
    }

    public static WR3 c(int i, float f) {
        TR3 tr3 = (TR3) WR3.p.j();
        if (tr3.h) {
            tr3.l();
            tr3.h = false;
        }
        WR3 wr3 = (WR3) tr3.g;
        wr3.getClass();
        wr3.m = 1;
        wr3.j |= 1;
        int i2 = ((i >>> 24) & 255) | ((i << 8) & (-256));
        if (tr3.h) {
            tr3.l();
            tr3.h = false;
        }
        WR3 wr32 = (WR3) tr3.g;
        wr32.j |= 2;
        wr32.n = i2;
        JR3 jr3 = (JR3) KR3.l.j();
        if (jr3.h) {
            jr3.l();
            jr3.h = false;
        }
        KR3 kr3 = (KR3) jr3.g;
        kr3.getClass();
        kr3.k = 3;
        kr3.j = 1;
        if (tr3.h) {
            tr3.l();
            tr3.h = false;
        }
        WR3 wr33 = (WR3) tr3.g;
        KR3 kr32 = (KR3) jr3.j();
        wr33.getClass();
        kr32.getClass();
        wr33.l = kr32;
        wr33.k = 5;
        XR3 xr3 = (XR3) ZR3.m.j();
        if (xr3.h) {
            xr3.l();
            xr3.h = false;
        }
        ZR3 zr3 = (ZR3) xr3.g;
        zr3.j = 1 | zr3.j;
        zr3.k = f;
        if (xr3.h) {
            xr3.l();
            xr3.h = false;
        }
        ZR3 zr32 = (ZR3) xr3.g;
        zr32.getClass();
        zr32.l = 4;
        zr32.j |= 2;
        if (tr3.h) {
            tr3.l();
            tr3.h = false;
        }
        WR3 wr34 = (WR3) tr3.g;
        ZR3 zr33 = (ZR3) xr3.j();
        wr34.getClass();
        zr33.getClass();
        wr34.o = zr33;
        wr34.j |= 4;
        return (WR3) tr3.j();
    }

    public static WR3 d(int i, int i2) {
        TR3 tr3 = (TR3) WR3.p.j();
        if (tr3.h) {
            tr3.l();
            tr3.h = false;
        }
        WR3 wr3 = (WR3) tr3.g;
        wr3.getClass();
        wr3.m = 19;
        wr3.j |= 1;
        int i3 = ((i >>> 24) & 255) | ((i << 8) & (-256));
        if (tr3.h) {
            tr3.l();
            tr3.h = false;
        }
        WR3 wr32 = (WR3) tr3.g;
        wr32.j |= 2;
        wr32.n = i3;
        OR3 or3 = (OR3) PR3.m.j();
        int i4 = i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? 0 : 4 : 3 : 2 : 1;
        if (i4 == 0) {
            i4 = 1;
        }
        if (or3.h) {
            or3.l();
            or3.h = false;
        }
        PR3 pr3 = (PR3) or3.g;
        pr3.getClass();
        pr3.k = AbstractC2373Sg3.b(i4);
        pr3.j |= 1;
        char c = i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? (char) 0 : (char) 4 : (char) 3 : (char) 2 : (char) 1;
        if (c == 0) {
            c = 1;
        }
        int i5 = c != 4 ? 1 : 3;
        if (or3.h) {
            or3.l();
            or3.h = false;
        }
        PR3 pr32 = (PR3) or3.g;
        pr32.getClass();
        pr32.l = AbstractC2373Sg3.b(i5);
        pr32.j |= 8;
        if (tr3.h) {
            tr3.l();
            tr3.h = false;
        }
        WR3 wr33 = (WR3) tr3.g;
        PR3 pr33 = (PR3) or3.j();
        wr33.getClass();
        pr33.getClass();
        wr33.l = pr33;
        wr33.k = 8;
        XR3 xr3 = (XR3) ZR3.m.j();
        if (xr3.h) {
            xr3.l();
            xr3.h = false;
        }
        ZR3 zr3 = (ZR3) xr3.g;
        zr3.j |= 1;
        zr3.k = 0.4f;
        if (xr3.h) {
            xr3.l();
            xr3.h = false;
        }
        ZR3 zr32 = (ZR3) xr3.g;
        zr32.getClass();
        zr32.l = 4;
        zr32.j |= 2;
        if (tr3.h) {
            tr3.l();
            tr3.h = false;
        }
        WR3 wr34 = (WR3) tr3.g;
        ZR3 zr33 = (ZR3) xr3.j();
        wr34.getClass();
        zr33.getClass();
        wr34.o = zr33;
        wr34.j |= 4;
        return (WR3) tr3.j();
    }

    public static WR3 e(int i) {
        TR3 tr3 = (TR3) WR3.p.j();
        if (tr3.h) {
            tr3.l();
            tr3.h = false;
        }
        WR3 wr3 = (WR3) tr3.g;
        wr3.getClass();
        wr3.m = 13;
        wr3.j |= 1;
        int i2 = ((i >>> 24) & 255) | ((i << 8) & (-256));
        if (tr3.h) {
            tr3.l();
            tr3.h = false;
        }
        WR3 wr32 = (WR3) tr3.g;
        wr32.j |= 2;
        wr32.n = i2;
        RR3 rr3 = (RR3) SR3.l.j();
        if (rr3.h) {
            rr3.l();
            rr3.h = false;
        }
        SR3 sr3 = (SR3) rr3.g;
        sr3.getClass();
        sr3.k = 2;
        sr3.j |= 2;
        if (tr3.h) {
            tr3.l();
            tr3.h = false;
        }
        WR3 wr33 = (WR3) tr3.g;
        SR3 sr32 = (SR3) rr3.j();
        wr33.getClass();
        sr32.getClass();
        wr33.l = sr32;
        wr33.k = 7;
        XR3 xr3 = (XR3) ZR3.m.j();
        if (xr3.h) {
            xr3.l();
            xr3.h = false;
        }
        ZR3 zr3 = (ZR3) xr3.g;
        zr3.j |= 1;
        zr3.k = 0.03f;
        if (xr3.h) {
            xr3.l();
            xr3.h = false;
        }
        ZR3 zr32 = (ZR3) xr3.g;
        zr32.getClass();
        zr32.l = 4;
        zr32.j = 2 | zr32.j;
        if (tr3.h) {
            tr3.l();
            tr3.h = false;
        }
        WR3 wr34 = (WR3) tr3.g;
        ZR3 zr33 = (ZR3) xr3.j();
        wr34.getClass();
        zr33.getClass();
        wr34.o = zr33;
        wr34.j |= 4;
        return (WR3) tr3.j();
    }
}
