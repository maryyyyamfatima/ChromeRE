package defpackage;

import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.List;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: wv, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC11251wv {
    public final InterfaceC10222tv c;
    public TJ1 e;
    public final ArrayList a = new ArrayList(1);
    public boolean b = false;
    public float d = 0.0f;
    public Object f = null;
    public float g = -1.0f;
    public float h = -1.0f;

    public abstract Object g(C12282zv1 c12282zv1, float f);

    public AbstractC11251wv(List list) {
        InterfaceC10222tv c10565uv;
        InterfaceC10222tv interfaceC10222tv;
        if (list.isEmpty()) {
            interfaceC10222tv = new C9879sv();
        } else {
            if (list.size() == 1) {
                c10565uv = new C10908vv(list);
            } else {
                c10565uv = new C10565uv(list);
            }
            interfaceC10222tv = c10565uv;
        }
        this.c = interfaceC10222tv;
    }

    public final void a(InterfaceC9536rv interfaceC9536rv) {
        this.a.add(interfaceC9536rv);
    }

    public void j(float f) {
        InterfaceC10222tv interfaceC10222tv = this.c;
        if (interfaceC10222tv.isEmpty()) {
            return;
        }
        if (this.g == -1.0f) {
            this.g = interfaceC10222tv.e();
        }
        float f2 = this.g;
        if (f < f2) {
            if (f2 == -1.0f) {
                this.g = interfaceC10222tv.e();
            }
            f = this.g;
        } else if (f > c()) {
            f = c();
        }
        if (f == this.d) {
            return;
        }
        this.d = f;
        if (interfaceC10222tv.c(f)) {
            i();
        }
    }

    public void i() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.a;
            if (i >= arrayList.size()) {
                return;
            }
            ((InterfaceC9536rv) arrayList.get(i)).a();
            i++;
        }
    }

    public final C12282zv1 b() {
        C12282zv1 b = this.c.b();
        AbstractC2576Tv1.a();
        return b;
    }

    public final float e() {
        if (this.b) {
            return 0.0f;
        }
        C12282zv1 b = b();
        if (b.c()) {
            return 0.0f;
        }
        return (this.d - b.b()) / (b.a() - b.b());
    }

    public final float d() {
        C12282zv1 b = b();
        if (b.c()) {
            return 0.0f;
        }
        return b.d.getInterpolation(e());
    }

    public float c() {
        if (this.h == -1.0f) {
            this.h = this.c.d();
        }
        return this.h;
    }

    public Object f() {
        Object g;
        Interpolator interpolator;
        float e = e();
        if (this.e == null && this.c.a(e)) {
            return this.f;
        }
        C12282zv1 b = b();
        Interpolator interpolator2 = b.e;
        if (interpolator2 != null && (interpolator = b.f) != null) {
            g = h(b, e, interpolator2.getInterpolation(e), interpolator.getInterpolation(e));
        } else {
            g = g(b, d());
        }
        this.f = g;
        return g;
    }

    public final void k(TJ1 tj1) {
        TJ1 tj12 = this.e;
        if (tj12 != null) {
            tj12.getClass();
        }
        this.e = tj1;
    }

    public Object h(C12282zv1 c12282zv1, float f, float f2, float f3) {
        throw new UnsupportedOperationException("This animation does not support split dimensions!");
    }
}
