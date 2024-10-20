package defpackage;

import android.graphics.Bitmap;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import com.google.android.libraries.elements.interfaces.JSControllerConfig;
import com.google.research.ink.core.jni.EngineState;
import com.google.research.ink.core.jni.NativeEngine;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes5.dex */
public final class BK3 extends SR2 implements InterfaceC11344xB0 {
    public final C9593s5 a;
    public U02 b;
    public EngineState d;
    public T02 n;
    public C2597Tz2 o;
    public C2195Qx0 p;
    public int c = 1;
    public final Object e = new Object();
    public C8066ne3 f = new C8066ne3(0, 0);
    public final Object g = new Object();
    public final HashMap h = new HashMap();
    public int i = 1;
    public final Object j = new Object();
    public final HashMap k = new HashMap();
    public int l = 1;
    public final Object m = new Object();
    public final CopyOnWriteArraySet q = new CopyOnWriteArraySet();

    public BK3(IS0 is0) {
        this.a = new C9593s5(is0);
    }

    public final void n() {
        U02 u02 = this.b;
        if (u02 != null) {
            NativeEngine nativeEngine = (NativeEngine) u02;
            long j = nativeEngine.c;
            if (j != 0) {
                int i = AbstractC4508dH1.a;
                nativeEngine.nativeFreeEngine(j);
                nativeEngine.c = 0L;
            }
            this.b = null;
        }
    }

    public final void k() {
        boolean isEmpty;
        InterfaceC6882kB0 interfaceC6882kB0;
        if (this.b == null) {
            throw new IllegalStateException("setNativeEngine must be called before draw");
        }
        while (true) {
            C9593s5 c9593s5 = this.a;
            synchronized (c9593s5) {
                isEmpty = c9593s5.a.isEmpty();
            }
            if (isEmpty) {
                break;
            }
            C9593s5 c9593s52 = this.a;
            synchronized (c9593s52) {
                interfaceC6882kB0 = (InterfaceC6882kB0) c9593s52.a.poll();
                if (c9593s52.a.isEmpty()) {
                    IS0 is0 = c9593s52.b;
                    is0.k = false;
                    if (is0.i.a() > 0 || is0.k) {
                        is0.a();
                    }
                }
            }
            interfaceC6882kB0.b(this.b);
            interfaceC6882kB0.a();
        }
        u();
        Iterator it = this.q.iterator();
        if (it.hasNext()) {
            AbstractC11735yK3.a(it.next());
            throw null;
        }
        NativeEngine nativeEngine = (NativeEngine) this.b;
        nativeEngine.nativeEngineDraw(nativeEngine.c);
        Iterator it2 = this.q.iterator();
        if (it2.hasNext()) {
            AbstractC11735yK3.a(it2.next());
            throw null;
        }
    }

    public final void u() {
        synchronized (this.e) {
            if (this.b == null) {
                AbstractC4508dH1.a("updateEngineState(): delegate == null");
                return;
            }
            if (this.d == null) {
                this.d = new EngineState();
            }
            U02 u02 = this.b;
            NativeEngine nativeEngine = (NativeEngine) u02;
            nativeEngine.nativeEngineGetEngineState(nativeEngine.c, this.d);
        }
    }

    public final void o(C7313lS2 c7313lS2) {
        this.a.a(new C8023nX(c7313lS2));
    }

    public final void s(WR3 wr3) {
        if (wr3 == null) {
            AbstractC4508dH1.a("Attempting to set null tool params");
            return;
        }
        C6969kS2 c6969kS2 = (C6969kS2) C7313lS2.l.j();
        if (c6969kS2.h) {
            c6969kS2.l();
            c6969kS2.h = false;
        }
        C7313lS2 c7313lS2 = (C7313lS2) c6969kS2.g;
        c7313lS2.getClass();
        c7313lS2.k = wr3;
        c7313lS2.j = 2;
        o((C7313lS2) c6969kS2.j());
    }

    public final void i(C10745vS2 c10745vS2, Bitmap bitmap) {
        if (bitmap.getConfig() != Bitmap.Config.ARGB_8888) {
            AbstractC4508dH1.e("Converting bitmap from " + bitmap.getConfig().name() + " to ARGB_8888");
            bitmap = bitmap.copy(Bitmap.Config.ARGB_8888, false);
        }
        this.a.a(new C3422a7(c10745vS2, bitmap));
    }

    public final void p(int i) {
        C2467Sz2 c2467Sz2 = (C2467Sz2) C2597Tz2.l.j();
        if (c2467Sz2.h) {
            c2467Sz2.l();
            c2467Sz2.h = false;
        }
        C2597Tz2 c2597Tz2 = (C2597Tz2) c2467Sz2.g;
        c2597Tz2.j |= 1;
        c2597Tz2.k = i;
        q((C2597Tz2) c2467Sz2.j());
    }

    public final void q(C2597Tz2 c2597Tz2) {
        this.o = c2597Tz2;
        C6969kS2 c6969kS2 = (C6969kS2) C7313lS2.l.j();
        C2597Tz2 c2597Tz22 = this.o;
        if (c6969kS2.h) {
            c6969kS2.l();
            c6969kS2.h = false;
        }
        C7313lS2 c7313lS2 = (C7313lS2) c6969kS2.g;
        c7313lS2.getClass();
        c2597Tz22.getClass();
        c7313lS2.k = c2597Tz22;
        c7313lS2.j = 12;
        o((C7313lS2) c6969kS2.j());
    }

    public final void l(boolean z) {
        C11706yF c11706yF = (C11706yF) C12049zF.o.j();
        if (c11706yF.h) {
            c11706yF.l();
            c11706yF.h = false;
        }
        C12049zF c12049zF = (C12049zF) c11706yF.g;
        c12049zF.j |= 1;
        c12049zF.k = z;
        if (c11706yF.h) {
            c11706yF.l();
            c11706yF.h = false;
        }
        C12049zF c12049zF2 = (C12049zF) c11706yF.g;
        c12049zF2.j |= 2;
        c12049zF2.l = z;
        if (c11706yF.h) {
            c11706yF.l();
            c11706yF.h = false;
        }
        C12049zF c12049zF3 = (C12049zF) c11706yF.g;
        c12049zF3.j |= 4;
        c12049zF3.m = z;
        C12049zF c12049zF4 = (C12049zF) c11706yF.j();
        if (c12049zF4 == null) {
            throw new IllegalArgumentException("You cannot set null camera movement constraints.");
        }
        C6969kS2 c6969kS2 = (C6969kS2) C7313lS2.l.j();
        if (c6969kS2.h) {
            c6969kS2.l();
            c6969kS2.h = false;
        }
        C7313lS2 c7313lS2 = (C7313lS2) c6969kS2.g;
        c7313lS2.getClass();
        c7313lS2.k = c12049zF4;
        c7313lS2.j = 54;
        o((C7313lS2) c6969kS2.j());
    }

    public final void r(C3247Yz2 c3247Yz2) {
        if (c3247Yz2 == null) {
            AbstractC4508dH1.a("Attempting to set null page bounds");
            return;
        }
        C6969kS2 c6969kS2 = (C6969kS2) C7313lS2.l.j();
        if (c6969kS2.h) {
            c6969kS2.l();
            c6969kS2.h = false;
        }
        C7313lS2 c7313lS2 = (C7313lS2) c6969kS2.g;
        c7313lS2.getClass();
        c7313lS2.k = c3247Yz2;
        c7313lS2.j = 5;
        o((C7313lS2) c6969kS2.j());
    }

    public final void m(Runnable runnable) {
        int i;
        synchronized (this.j) {
            i = this.i;
            this.i = i + 1;
            this.h.put(Integer.valueOf(i), runnable);
        }
        AbstractC4508dH1.c("scheduling flush action for sequence point " + i);
        C6969kS2 c6969kS2 = (C6969kS2) C7313lS2.l.j();
        DS2 ds2 = (DS2) ES2.l.j();
        if (ds2.h) {
            ds2.l();
            ds2.h = false;
        }
        ES2 es2 = (ES2) ds2.g;
        es2.j |= 1;
        es2.k = i;
        if (c6969kS2.h) {
            c6969kS2.l();
            c6969kS2.h = false;
        }
        C7313lS2 c7313lS2 = (C7313lS2) c6969kS2.g;
        ES2 es22 = (ES2) ds2.j();
        c7313lS2.getClass();
        es22.getClass();
        c7313lS2.k = es22;
        c7313lS2.j = 15;
        o((C7313lS2) c6969kS2.j());
    }

    @Override // defpackage.SR2
    public final void b(int i, Bitmap bitmap, long j, int i2, int i3, String str) {
        AK3 ak3;
        synchronized (this.m) {
            ak3 = (AK3) this.k.remove(Integer.valueOf(i));
        }
        if (ak3 == null) {
            AbstractC4508dH1.e("unexpected image export #" + i + " discarded");
            return;
        }
        if (str.isEmpty()) {
            if (i2 + 1 >= i3) {
                ak3.a.b(bitmap);
                return;
            }
            synchronized (this.m) {
                this.k.put(Integer.valueOf(i), ak3);
            }
            return;
        }
        AbstractC4508dH1.e("Image export #" + i + " failed: " + str);
        ak3.a.a();
    }

    public final void j() {
        C6969kS2 c6969kS2 = (C6969kS2) C7313lS2.l.j();
        C12117zS2 c12117zS2 = C12117zS2.j;
        if (c6969kS2.h) {
            c6969kS2.l();
            c6969kS2.h = false;
        }
        C7313lS2 c7313lS2 = (C7313lS2) c6969kS2.g;
        c7313lS2.getClass();
        c7313lS2.k = c12117zS2;
        c7313lS2.j = 44;
        o((C7313lS2) c6969kS2.j());
    }

    public final void t() {
        C6969kS2 c6969kS2 = (C6969kS2) C7313lS2.l.j();
        C12117zS2 c12117zS2 = C12117zS2.j;
        if (c6969kS2.h) {
            c6969kS2.l();
            c6969kS2.h = false;
        }
        C7313lS2 c7313lS2 = (C7313lS2) c6969kS2.g;
        c7313lS2.getClass();
        c7313lS2.k = c12117zS2;
        c7313lS2.j = 45;
        o((C7313lS2) c6969kS2.j());
    }

    @Override // defpackage.SR2
    public final void e(OV2 ov2) {
        int i;
        switch (ov2.j) {
            case 0:
                i = 15;
                break;
            case 1:
                i = 1;
                break;
            case 2:
                i = 2;
                break;
            case ModuleDescriptor.MODULE_VERSION /* 3 */:
                i = 3;
                break;
            case 4:
                i = 4;
                break;
            case JSControllerConfig.DEFAULT_VM_CONTEXT_LRU_SIZE /* 5 */:
                i = 5;
                break;
            case 6:
                i = 6;
                break;
            case 7:
                i = 7;
                break;
            case 8:
                i = 8;
                break;
            case 9:
                i = 9;
                break;
            case 10:
                i = 10;
                break;
            case 11:
                i = 11;
                break;
            case 12:
                i = 12;
                break;
            case 13:
                i = 13;
                break;
            case 14:
                i = 14;
                break;
            default:
                i = 0;
                break;
        }
        int b = AbstractC2373Sg3.b(i);
        if (b == 6 || b == 7 || b == 8) {
            this.a.a(new C5078ew1(new Runnable() { // from class: xK3
                @Override // java.lang.Runnable
                public final void run() {
                    BK3.this.u();
                }
            }));
        }
    }
}
