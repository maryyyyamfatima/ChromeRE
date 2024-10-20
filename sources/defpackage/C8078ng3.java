package defpackage;

import android.os.SystemClock;
import android.util.Log;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: ng3 */
/* loaded from: classes.dex */
public final class C8078ng3 implements InterfaceC3607ag0, InterfaceC3275Zf0 {
    public final C0171Bi0 a;
    public final InterfaceC3275Zf0 g;
    public volatile int h;
    public volatile C1585Mf0 i;
    public volatile Object j;
    public volatile C7686mY1 k;
    public volatile C1715Nf0 l;

    public C8078ng3(C0171Bi0 c0171Bi0, InterfaceC3275Zf0 interfaceC3275Zf0) {
        this.a = c0171Bi0;
        this.g = interfaceC3275Zf0;
    }

    @Override // defpackage.InterfaceC3607ag0
    public final boolean c() {
        if (this.j != null) {
            Object obj = this.j;
            this.j = null;
            try {
                if (!e(obj)) {
                    return true;
                }
            } catch (IOException unused) {
            }
        }
        if (this.i != null && this.i.c()) {
            return true;
        }
        this.i = null;
        this.k = null;
        boolean z = false;
        while (!z) {
            if (!(this.h < this.a.b().size())) {
                break;
            }
            ArrayList b = this.a.b();
            int i = this.h;
            this.h = i + 1;
            this.k = (C7686mY1) b.get(i);
            if (this.k != null) {
                if (!this.a.p.c(this.k.c.e())) {
                    if (this.a.c(this.k.c.a()) != null) {
                    }
                }
                this.k.c.c(this.a.o, new C7734mg3(this, this.k));
                z = true;
            }
        }
        return z;
    }

    public final boolean e(Object obj) {
        int i = UH1.a;
        SystemClock.elapsedRealtimeNanos();
        boolean z = false;
        try {
            InterfaceC8075ng0 f = this.a.c.a().f(obj);
            Object a = f.a();
            LA0 e = this.a.e(a);
            C1845Of0 c1845Of0 = new C1845Of0(e, a, this.a.i);
            InterfaceC6098hu1 interfaceC6098hu1 = this.k.a;
            C0171Bi0 c0171Bi0 = this.a;
            C1715Nf0 c1715Nf0 = new C1715Nf0(interfaceC6098hu1, c0171Bi0.n);
            InterfaceC4691dp0 a2 = c0171Bi0.h.a();
            a2.a(c1715Nf0, c1845Of0);
            if (Log.isLoggable("SourceGenerator", 2)) {
                String.valueOf(c1715Nf0);
                String.valueOf(obj);
                String.valueOf(e);
                SystemClock.elapsedRealtimeNanos();
            }
            if (a2.b(c1715Nf0) != null) {
                this.l = c1715Nf0;
                this.i = new C1585Mf0(Collections.singletonList(this.k.a), this.a, this);
                this.k.c.b();
                return true;
            }
            if (Log.isLoggable("SourceGenerator", 3)) {
                String.valueOf(this.l);
                String.valueOf(obj);
            }
            try {
                this.g.d(this.k.a, f.a(), this.k.c, this.k.c.e(), this.k.a);
                return false;
            } catch (Throwable th) {
                th = th;
                z = true;
                if (!z) {
                    this.k.c.b();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    @Override // defpackage.InterfaceC3607ag0
    public final void cancel() {
        C7686mY1 c7686mY1 = this.k;
        if (c7686mY1 != null) {
            c7686mY1.c.cancel();
        }
    }

    @Override // defpackage.InterfaceC3275Zf0
    public final void a() {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.InterfaceC3275Zf0
    public final void d(InterfaceC6098hu1 interfaceC6098hu1, Object obj, InterfaceC3145Yf0 interfaceC3145Yf0, EnumC9447rg0 enumC9447rg0, InterfaceC6098hu1 interfaceC6098hu12) {
        this.g.d(interfaceC6098hu1, obj, interfaceC3145Yf0, this.k.c.e(), interfaceC6098hu1);
    }

    @Override // defpackage.InterfaceC3275Zf0
    public final void b(InterfaceC6098hu1 interfaceC6098hu1, Exception exc, InterfaceC3145Yf0 interfaceC3145Yf0, EnumC9447rg0 enumC9447rg0) {
        this.g.b(interfaceC6098hu1, exc, interfaceC3145Yf0, this.k.c.e());
    }
}
