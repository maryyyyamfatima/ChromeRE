package defpackage;

import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class F5 implements InterfaceC12026zA1 {
    public final Set a = Collections.newSetFromMap(new WeakHashMap());
    public boolean b;
    public boolean c;

    @Override // defpackage.InterfaceC12026zA1
    public final void b(GA1 ga1) {
        this.a.add(ga1);
        if (this.c) {
            ga1.onDestroy();
        } else if (this.b) {
            ga1.b();
        } else {
            ga1.a();
        }
    }

    @Override // defpackage.InterfaceC12026zA1
    public final void a(GA1 ga1) {
        this.a.remove(ga1);
    }

    public final void d() {
        this.b = true;
        Iterator it = AbstractC10296u74.d(this.a).iterator();
        while (it.hasNext()) {
            ((GA1) it.next()).b();
        }
    }

    public final void e() {
        this.b = false;
        Iterator it = AbstractC10296u74.d(this.a).iterator();
        while (it.hasNext()) {
            ((GA1) it.next()).a();
        }
    }

    public final void c() {
        this.c = true;
        Iterator it = AbstractC10296u74.d(this.a).iterator();
        while (it.hasNext()) {
            ((GA1) it.next()).onDestroy();
        }
    }
}
