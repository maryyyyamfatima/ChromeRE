package defpackage;

import com.google.common.util.concurrent.SettableFuture;
import com.google.common.util.concurrent.n;
import com.google.common.util.concurrent.u;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: wd2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11146wd2 {
    public final RunnableC10117td2 a;
    public final AtomicLong b;
    public final AtomicReference c = new AtomicReference(null);
    public final AtomicReference d = new AtomicReference(null);
    public final X33 e;
    public final SettableFuture f;

    public C11146wd2(InterfaceC2909Wk interfaceC2909Wk, Executor executor) {
        long j = Integer.MIN_VALUE;
        this.b = new AtomicLong((j & 4294967295L) | (j << 32));
        EnumC6747jo0 enumC6747jo0 = EnumC6747jo0.a;
        this.e = new X33(enumC6747jo0);
        SettableFuture settableFuture = new SettableFuture();
        this.f = settableFuture;
        RunnableC10117td2 runnableC10117td2 = new RunnableC10117td2(interfaceC2909Wk, executor);
        this.a = runnableC10117td2;
        settableFuture.f(runnableC10117td2, enumC6747jo0);
    }

    public final n a() {
        AtomicLong atomicLong;
        long j;
        final int i;
        RD1 rd1;
        SettableFuture settableFuture = this.f;
        if (settableFuture.isDone()) {
            return settableFuture;
        }
        do {
            atomicLong = this.b;
            j = atomicLong.get();
            i = (int) (j >>> 32);
        } while (!atomicLong.compareAndSet(j, ((((int) j) + 1) & 4294967295L) | (i << 32)));
        final SettableFuture settableFuture2 = new SettableFuture();
        RD1 rd12 = (RD1) this.d.getAndSet(settableFuture2);
        EnumC6747jo0 enumC6747jo0 = EnumC6747jo0.a;
        if (rd12 == null) {
            RunnableFutureC9399rX3 runnableFutureC9399rX3 = new RunnableFutureC9399rX3(AbstractC4575dU3.a(new InterfaceC2909Wk() { // from class: rd2
                @Override // defpackage.InterfaceC2909Wk
                public final RD1 call() {
                    return C11146wd2.this.b(i);
                }
            }));
            enumC6747jo0.execute(runnableFutureC9399rX3);
            rd1 = runnableFutureC9399rX3;
        } else {
            rd1 = AbstractC5957hW0.a(rd12, Throwable.class, AbstractC4575dU3.b(new InterfaceC3299Zk() { // from class: sd2
                @Override // defpackage.InterfaceC3299Zk
                public final RD1 apply(Object obj) {
                    return C11146wd2.this.b(i);
                }
            }), this.e);
        }
        settableFuture2.v(rd1);
        final C10460ud2 c10460ud2 = new C10460ud2(this, i);
        settableFuture2.f(new Runnable() { // from class: qd2
            @Override // java.lang.Runnable
            public final void run() {
                SettableFuture settableFuture3 = settableFuture2;
                C10460ud2 c10460ud22 = c10460ud2;
                C11146wd2 c11146wd2 = C11146wd2.this;
                c11146wd2.getClass();
                try {
                    settableFuture3.isDone();
                    Object a = AbstractC7515m14.a(settableFuture3);
                    SettableFuture settableFuture4 = c11146wd2.f;
                    settableFuture4.t(a);
                    c10460ud22.v(settableFuture4);
                } catch (Throwable unused) {
                    c10460ud22.v(settableFuture3);
                }
            }
        }, enumC6747jo0);
        return c10460ud2;
    }

    public final n b(int i) {
        AtomicReference atomicReference;
        boolean z;
        AtomicLong atomicLong = this.b;
        if (((int) (atomicLong.get() >>> 32)) <= i) {
            C10803vd2 c10803vd2 = new C10803vd2(i);
            do {
                atomicReference = this.c;
                C10803vd2 c10803vd22 = (C10803vd2) atomicReference.get();
                if (c10803vd22 != null && c10803vd22.j > i) {
                    u uVar = u.j;
                    return uVar != null ? uVar : new u();
                }
                while (true) {
                    if (atomicReference.compareAndSet(c10803vd22, c10803vd2)) {
                        z = true;
                        break;
                    }
                    if (atomicReference.get() != c10803vd22) {
                        z = false;
                        break;
                    }
                }
            } while (!z);
            if (((int) (atomicLong.get() >>> 32)) > i) {
                c10803vd2.cancel(true);
                while (!atomicReference.compareAndSet(c10803vd2, null) && atomicReference.get() == c10803vd2) {
                }
                return c10803vd2;
            }
            RunnableC10117td2 runnableC10117td2 = this.a;
            InterfaceC2909Wk interfaceC2909Wk = runnableC10117td2.a;
            Executor executor = runnableC10117td2.g;
            if (interfaceC2909Wk != null && executor != null) {
                RunnableFutureC9399rX3 runnableFutureC9399rX3 = new RunnableFutureC9399rX3(AbstractC4575dU3.a(interfaceC2909Wk));
                executor.execute(runnableFutureC9399rX3);
                c10803vd2.v(runnableFutureC9399rX3);
            } else {
                c10803vd2.v(this.f);
            }
            return c10803vd2;
        }
        u uVar2 = u.j;
        return uVar2 != null ? uVar2 : new u();
    }
}
