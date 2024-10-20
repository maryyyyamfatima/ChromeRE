package defpackage;

import android.content.Context;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: ak0 */
/* loaded from: classes.dex */
public final class C3631ak0 implements InterfaceC9750sZ1 {
    public final int a;
    public final C9550rx2 b;
    public int c = 0;
    public final AtomicInteger d = new AtomicInteger(0);
    public final int e;

    public C3631ak0(int i) {
        this.a = i;
        this.b = new C9893sx2(i);
        this.e = i;
    }

    @Override // defpackage.InterfaceC9750sZ1
    public final Object b(Context context, WZ wz) {
        Object b;
        synchronized (this) {
            b = this.b.b();
            this.c = Math.max(0, this.c - 1);
        }
        if (b != null) {
            return b;
        }
        this.d.incrementAndGet();
        return wz.g(context);
    }

    @Override // defpackage.InterfaceC9750sZ1
    public final void a(Object obj) {
        synchronized (this) {
            this.b.a(obj);
            this.c = Math.min(this.a, this.c + 1);
        }
    }

    @Override // defpackage.InterfaceC9750sZ1
    public final void c(Context context, WZ wz) {
        if ((this.c >= this.a) || this.d.getAndIncrement() >= this.e) {
            return;
        }
        a(wz.g(context));
    }
}
