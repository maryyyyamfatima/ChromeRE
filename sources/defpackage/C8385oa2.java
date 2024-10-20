package defpackage;

import android.os.Handler;
import java.util.Iterator;
import org.chromium.base.Callback;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: oa2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C8385oa2 implements InterfaceC7697ma2 {
    public final Handler a;
    public Object g;
    public final C12157za2 h;

    @Override // defpackage.InterfaceC0079Ap3
    public final /* synthetic */ boolean i() {
        return AbstractC12248zp3.a(this);
    }

    public C8385oa2() {
        Thread.currentThread();
        this.a = new Handler();
        this.h = new C12157za2();
    }

    public final Object m(final Callback callback) {
        this.h.a(callback);
        final Object obj = this.g;
        if (obj != null) {
            this.a.post(new Runnable() { // from class: na2
                @Override // java.lang.Runnable
                public final void run() {
                    C8385oa2 c8385oa2 = C8385oa2.this;
                    if (c8385oa2.g == obj) {
                        C12157za2 c12157za2 = c8385oa2.h;
                        Callback callback2 = callback;
                        if (c12157za2.b(callback2)) {
                            callback2.onResult(c8385oa2.g);
                        }
                    }
                }
            });
        }
        return this.g;
    }

    public final void n(Callback callback) {
        this.h.d(callback);
    }

    public void p(Object obj) {
        if (obj == this.g) {
            return;
        }
        this.g = obj;
        Iterator it = this.h.iterator();
        while (true) {
            C11814ya2 c11814ya2 = (C11814ya2) it;
            if (!c11814ya2.hasNext()) {
                return;
            } else {
                ((Callback) c11814ya2.next()).onResult(this.g);
            }
        }
    }

    @Override // defpackage.InterfaceC0079Ap3
    public final Object get() {
        return this.g;
    }
}
