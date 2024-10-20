package defpackage;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Hi2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0953Hi2 extends AbstractC0823Gi2 {
    public C0953Hi2(InterfaceC0334Co3 interfaceC0334Co3, int i, int i2) {
        super(interfaceC0334Co3, i, i2);
    }

    @Override // defpackage.AbstractC0823Gi2
    public final void g(C0693Fi2 c0693Fi2, Object obj) {
        int i = get();
        AtomicInteger atomicInteger = this.k;
        C0965Hl c0965Hl = this.h;
        if (i == 0 && compareAndSet(0, 1)) {
            AtomicLong atomicLong = this.i;
            if (atomicLong.get() != 0) {
                this.a.d(obj);
                if (atomicLong.get() != Long.MAX_VALUE) {
                    atomicLong.decrementAndGet();
                }
                long j = c0693Fi2.i + 1;
                if (j >= c0693Fi2.h) {
                    c0693Fi2.i = 0L;
                    ((InterfaceC0724Fo3) c0693Fi2.get()).a(j);
                } else {
                    c0693Fi2.i = j;
                }
            } else if (!((C7058ki3) c0693Fi2.a()).offer(obj)) {
                EnumC0854Go3.b(c0693Fi2);
                c0965Hl.a(new DX1("Queue full?!"));
                atomicInteger.decrementAndGet();
                h();
                return;
            }
            if (decrementAndGet() == 0) {
                return;
            }
        } else {
            if (!((C7058ki3) c0693Fi2.a()).offer(obj) && EnumC0854Go3.b(c0693Fi2)) {
                c0965Hl.a(new DX1("Queue full?!"));
                atomicInteger.decrementAndGet();
            }
            if (getAndIncrement() != 0) {
                return;
            }
        }
        h();
    }

    @Override // defpackage.AbstractC0823Gi2
    public final void f(Throwable th) {
        this.h.a(th);
        this.k.decrementAndGet();
        d();
    }

    @Override // defpackage.AbstractC0823Gi2
    public final void e() {
        this.k.decrementAndGet();
        d();
    }

    @Override // defpackage.AbstractC0823Gi2
    public final void d() {
        if (getAndIncrement() != 0) {
            return;
        }
        h();
    }

    /* JADX WARN: Code restructure failed: missing block: B:73:0x004b, code lost:            if (r12 == false) goto L80;     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x004d, code lost:            if (r15 == false) goto L81;     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0057, code lost:            if (((java.lang.Throwable) r18.h.get()) == null) goto L30;     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0059, code lost:            r3.onError(r18.h.b());     */
    /* JADX WARN: Code restructure failed: missing block: B:79:?, code lost:            return;     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0063, code lost:            r3.b();     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0066, code lost:            return;     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0067, code lost:            if (r15 == false) goto L82;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void h() {
        /*
            Method dump skipped, instructions count: 213
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C0953Hi2.h():void");
    }
}
