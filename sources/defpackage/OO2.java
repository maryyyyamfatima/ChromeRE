package defpackage;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class OO2 implements InterfaceC3607ag0, InterfaceC3015Xf0 {
    public final InterfaceC3275Zf0 a;
    public final C0171Bi0 g;
    public int h;
    public int i = -1;
    public InterfaceC6098hu1 j;
    public List k;
    public int l;
    public volatile C7686mY1 m;
    public File n;
    public PO2 o;

    public OO2(C0171Bi0 c0171Bi0, InterfaceC3275Zf0 interfaceC3275Zf0) {
        this.g = c0171Bi0;
        this.a = interfaceC3275Zf0;
    }

    @Override // defpackage.InterfaceC3607ag0
    public final boolean c() {
        ArrayList a = this.g.a();
        if (a.isEmpty()) {
            return false;
        }
        List d = this.g.d();
        if (d.isEmpty()) {
            if (File.class.equals(this.g.k)) {
                return false;
            }
            throw new IllegalStateException("Failed to find any load path from " + String.valueOf(this.g.d.getClass()) + " to " + String.valueOf(this.g.k));
        }
        while (true) {
            List list = this.k;
            if (list != null) {
                if (this.l < list.size()) {
                    this.m = null;
                    boolean z = false;
                    while (!z) {
                        if (!(this.l < this.k.size())) {
                            break;
                        }
                        List list2 = this.k;
                        int i = this.l;
                        this.l = i + 1;
                        InterfaceC8030nY1 interfaceC8030nY1 = (InterfaceC8030nY1) list2.get(i);
                        File file = this.n;
                        C0171Bi0 c0171Bi0 = this.g;
                        this.m = interfaceC8030nY1.b(file, c0171Bi0.e, c0171Bi0.f, c0171Bi0.i);
                        if (this.m != null) {
                            if (this.g.c(this.m.c.a()) != null) {
                                this.m.c.c(this.g.o, this);
                                z = true;
                            }
                        }
                    }
                    return z;
                }
            }
            int i2 = this.i + 1;
            this.i = i2;
            if (i2 >= d.size()) {
                int i3 = this.h + 1;
                this.h = i3;
                if (i3 >= a.size()) {
                    return false;
                }
                this.i = 0;
            }
            InterfaceC6098hu1 interfaceC6098hu1 = (InterfaceC6098hu1) a.get(this.h);
            Class cls = (Class) d.get(this.i);
            InterfaceC9389rV3 f = this.g.f(cls);
            C0171Bi0 c0171Bi02 = this.g;
            this.o = new PO2(c0171Bi02.c.a, interfaceC6098hu1, c0171Bi02.n, c0171Bi02.e, c0171Bi02.f, f, cls, c0171Bi02.i);
            File b = c0171Bi02.h.a().b(this.o);
            this.n = b;
            if (b != null) {
                this.j = interfaceC6098hu1;
                this.k = this.g.c.a().e(b);
                this.l = 0;
            }
        }
    }

    @Override // defpackage.InterfaceC3607ag0
    public final void cancel() {
        C7686mY1 c7686mY1 = this.m;
        if (c7686mY1 != null) {
            c7686mY1.c.cancel();
        }
    }

    @Override // defpackage.InterfaceC3015Xf0
    public final void f(Object obj) {
        this.a.d(this.j, obj, this.m.c, EnumC9447rg0.RESOURCE_DISK_CACHE, this.o);
    }

    @Override // defpackage.InterfaceC3015Xf0
    public final void d(Exception exc) {
        this.a.b(this.o, exc, this.m.c, EnumC9447rg0.RESOURCE_DISK_CACHE);
    }
}
