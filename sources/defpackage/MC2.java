package defpackage;

import android.os.Handler;
import java.util.Iterator;
import java.util.LinkedList;
import org.chromium.base.Callback;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class MC2 {
    public Object b;
    public Exception d;
    public final Handler f;
    public boolean g;
    public int a = 0;
    public final LinkedList c = new LinkedList();
    public final LinkedList e = new LinkedList();

    public MC2() {
        Thread.currentThread();
        this.f = new Handler();
    }

    public final void g(Callback callback) {
        if (this.g) {
            i(callback);
        } else {
            h(callback, new Callback() { // from class: GC2
                @Override // org.chromium.base.Callback
                public final ZE e0(Object obj) {
                    return new ZE(this, obj);
                }

                @Override // org.chromium.base.Callback
                public final void onResult(Object obj) {
                    throw new LC2((Exception) obj);
                }
            });
            this.g = true;
        }
    }

    public final void h(Callback callback, Callback callback2) {
        i(callback);
        a(callback2);
    }

    public final void i(Callback callback) {
        int i = this.a;
        if (i == 1) {
            this.f.post(callback.e0(this.b));
        } else if (i == 0) {
            this.c.add(callback);
        }
    }

    public final void a(Callback callback) {
        int i = this.a;
        if (i == 2) {
            this.f.post(callback.e0(this.d));
        } else if (i == 0) {
            this.e.add(callback);
        }
    }

    public final MC2 f(final BV0 bv0) {
        final MC2 mc2 = new MC2();
        i(new Callback() { // from class: HC2
            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj) {
                return new ZE(this, obj);
            }

            @Override // org.chromium.base.Callback
            public final void onResult(Object obj) {
                MC2 mc22 = MC2.this;
                try {
                    mc22.b(bv0.apply(obj));
                } catch (Exception e) {
                    mc22.e(e);
                }
            }
        });
        a(new IC2(mc2));
        return mc2;
    }

    public final void b(Object obj) {
        this.a = 1;
        this.b = obj;
        LinkedList linkedList = this.c;
        Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            this.f.post(((Callback) it.next()).e0(obj));
        }
        linkedList.clear();
    }

    public final void e(Exception exc) {
        this.a = 2;
        this.d = exc;
        LinkedList linkedList = this.e;
        Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            this.f.post(((Callback) it.next()).e0(exc));
        }
        linkedList.clear();
    }

    public final boolean d() {
        return this.a == 1;
    }

    public static MC2 c(Object obj) {
        MC2 mc2 = new MC2();
        mc2.b(obj);
        return mc2;
    }
}
