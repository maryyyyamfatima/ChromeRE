package defpackage;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: gi3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5684gi3 {
    public double e;
    public final C5340fi3 b = new C5340fi3();
    public final C5340fi3 c = new C5340fi3();
    public final C5340fi3 d = new C5340fi3();
    public boolean f = true;
    public double g = 0.0d;
    public final CopyOnWriteArraySet h = new CopyOnWriteArraySet();
    public C6028hi3 a = C6028hi3.c;

    public final void b(double d) {
        if (this.e == d && a()) {
            return;
        }
        double d2 = this.b.a;
        this.e = d;
        Iterator it = this.h.iterator();
        if (it.hasNext()) {
            X5.a(it.next());
            throw null;
        }
    }

    public final boolean a() {
        C5340fi3 c5340fi3 = this.b;
        return Math.abs(c5340fi3.b) <= 0.005d && (Math.abs(this.e - c5340fi3.a) <= 0.005d || this.a.b == 0.0d);
    }
}
