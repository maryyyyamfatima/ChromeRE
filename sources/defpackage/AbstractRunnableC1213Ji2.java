package defpackage;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Ji2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractRunnableC1213Ji2 extends AtomicInteger implements QQ0, InterfaceC0724Fo3, Runnable {
    public final int a;
    public final int g;
    public final C7058ki3 h;
    public final AbstractC10079tW2 i;
    public InterfaceC0724Fo3 j;
    public volatile boolean k;
    public Throwable l;
    public final AtomicLong m = new AtomicLong();
    public volatile boolean n;
    public int o;

    public AbstractRunnableC1213Ji2(int i, C7058ki3 c7058ki3, AbstractC10079tW2 abstractC10079tW2) {
        this.a = i;
        this.h = c7058ki3;
        this.g = i - (i >> 2);
        this.i = abstractC10079tW2;
    }

    @Override // defpackage.InterfaceC0334Co3
    public final void d(Object obj) {
        if (this.k) {
            return;
        }
        if (!this.h.offer(obj)) {
            this.j.cancel();
            onError(new DX1("Queue is full?!"));
        } else if (getAndIncrement() == 0) {
            this.i.b(this);
        }
    }

    @Override // defpackage.InterfaceC0334Co3
    public final void onError(Throwable th) {
        if (this.k) {
            MR2.b(th);
            return;
        }
        this.l = th;
        this.k = true;
        if (getAndIncrement() == 0) {
            this.i.b(this);
        }
    }

    @Override // defpackage.InterfaceC0334Co3
    public final void b() {
        if (this.k) {
            return;
        }
        this.k = true;
        if (getAndIncrement() == 0) {
            this.i.b(this);
        }
    }

    @Override // defpackage.InterfaceC0724Fo3
    public final void a(long j) {
        if (EnumC0854Go3.d(j)) {
            AbstractC0355Ct.a(this.m, j);
            if (getAndIncrement() == 0) {
                this.i.b(this);
            }
        }
    }

    @Override // defpackage.InterfaceC0724Fo3
    public final void cancel() {
        if (this.n) {
            return;
        }
        this.n = true;
        this.j.cancel();
        this.i.dispose();
        if (getAndIncrement() == 0) {
            this.h.clear();
        }
    }
}
