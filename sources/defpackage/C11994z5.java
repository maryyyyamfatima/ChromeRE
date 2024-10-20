package defpackage;

import java.lang.ref.ReferenceQueue;
import java.util.HashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: z5, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11994z5 {
    public final boolean a;
    public final HashMap b;
    public final ReferenceQueue c;
    public InterfaceC11687yB0 d;

    public C11994z5() {
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor(new ThreadFactoryC10965w5());
        this.b = new HashMap();
        this.c = new ReferenceQueue();
        this.a = false;
        newSingleThreadExecutor.execute(new RunnableC11308x5(this));
    }

    public final synchronized void a(InterfaceC6098hu1 interfaceC6098hu1, C12030zB0 c12030zB0) {
        C11651y5 c11651y5 = (C11651y5) this.b.put(interfaceC6098hu1, new C11651y5(interfaceC6098hu1, c12030zB0, this.c, this.a));
        if (c11651y5 != null) {
            c11651y5.c = null;
            c11651y5.clear();
        }
    }

    public final void b(C11651y5 c11651y5) {
        JO2 jo2;
        synchronized (this) {
            this.b.remove(c11651y5.a);
            if (c11651y5.b && (jo2 = c11651y5.c) != null) {
                ((C6538jB0) this.d).c(c11651y5.a, new C12030zB0(jo2, true, false, c11651y5.a, this.d));
            }
        }
    }
}
