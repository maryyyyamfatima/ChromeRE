package defpackage;

import com.google.common.util.concurrent.v;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: nr4 */
/* loaded from: classes.dex */
public final class C8145nr4 implements InterfaceC2909Wk {
    public List a;
    public final /* synthetic */ C5869hE2 b;

    public C8145nr4(C5869hE2 c5869hE2) {
        this.b = c5869hE2;
    }

    @Override // defpackage.InterfaceC2909Wk
    public final RD1 call() {
        C5869hE2 c5869hE2 = this.b;
        RunnableC9793sg3 a = c5869hE2.i.a("Initialize " + c5869hE2.a);
        try {
            synchronized (this.b.h) {
                if (this.a == null) {
                    C5869hE2 c5869hE22 = this.b;
                    this.a = c5869hE22.j;
                    c5869hE22.j = Collections.emptyList();
                }
            }
            ArrayList arrayList = new ArrayList(this.a.size());
            C8832pr4 c8832pr4 = new C8832pr4(this.b);
            Iterator it = this.a.iterator();
            while (it.hasNext()) {
                try {
                    arrayList.add(((InterfaceC3299Zk) it.next()).apply(c8832pr4));
                } catch (Exception e) {
                    arrayList.add(new v(e));
                }
            }
            C7335lX c7335lX = new C7335lX(AbstractC0562Ei1.n(arrayList), true, (Executor) EnumC6747jo0.a, new Callable() { // from class: mr4
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    C8145nr4 c8145nr4 = C8145nr4.this;
                    synchronized (c8145nr4.b.h) {
                        c8145nr4.a = null;
                    }
                    return null;
                }
            });
            a.b(c7335lX);
            a.close();
            return c7335lX;
        } catch (Throwable th) {
            if (a != null) {
                try {
                    a.close();
                } catch (Throwable unused) {
                }
            }
            throw th;
        }
    }
}
