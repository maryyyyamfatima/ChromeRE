package com.google.common.util.concurrent;

import defpackage.AbstractC0562Ei1;
import defpackage.AbstractC11861yi1;
import defpackage.AbstractC7515m14;
import defpackage.C14;
import defpackage.C7335lX;
import defpackage.EnumC6747jo0;
import defpackage.RD1;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Level;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public abstract class p extends q {
    public AbstractC11861yi1 k;
    public final boolean l;
    public final boolean m;

    public p(AbstractC0562Ei1 abstractC0562Ei1, boolean z) {
        super(abstractC0562Ei1.size());
        this.k = abstractC0562Ei1;
        this.l = z;
        this.m = false;
    }

    @Override // com.google.common.util.concurrent.n
    public final void k() {
        AbstractC11861yi1 abstractC11861yi1 = this.k;
        C7335lX c7335lX = (C7335lX) this;
        c7335lX.k = null;
        c7335lX.n = null;
        if (isCancelled() && (abstractC11861yi1 != null)) {
            boolean w = w();
            C14 it = abstractC11861yi1.iterator();
            while (it.hasNext()) {
                ((Future) it.next()).cancel(w);
            }
        }
    }

    @Override // com.google.common.util.concurrent.n
    public final String r() {
        AbstractC11861yi1 abstractC11861yi1 = this.k;
        if (abstractC11861yi1 != null) {
            return "futures=" + abstractC11861yi1;
        }
        return super.r();
    }

    public final void F() {
        Objects.requireNonNull(this.k);
        if (this.k.isEmpty()) {
            r rVar = ((C7335lX) this).n;
            if (rVar != null) {
                try {
                    rVar.h.execute(rVar);
                    return;
                } catch (RejectedExecutionException e) {
                    rVar.i.u(e);
                    return;
                }
            }
            return;
        }
        EnumC6747jo0 enumC6747jo0 = EnumC6747jo0.a;
        if (this.l) {
            C14 it = this.k.iterator();
            final int i = 0;
            while (it.hasNext()) {
                final RD1 rd1 = (RD1) it.next();
                final C7335lX c7335lX = (C7335lX) this;
                rd1.f(new Runnable(c7335lX, rd1, i) { // from class: com.google.common.util.concurrent.o
                    public final /* synthetic */ p a;
                    public final /* synthetic */ RD1 g;

                    @Override // java.lang.Runnable
                    public final void run() {
                        RD1 rd12 = this.g;
                        p pVar = this.a;
                        pVar.getClass();
                        try {
                            if (rd12.isCancelled()) {
                                pVar.k = null;
                                pVar.cancel(false);
                            } else {
                                try {
                                    rd12.isDone();
                                    AbstractC7515m14.a(rd12);
                                } catch (Error e2) {
                                    e = e2;
                                    pVar.E(e);
                                } catch (RuntimeException e3) {
                                    e = e3;
                                    pVar.E(e);
                                } catch (ExecutionException e4) {
                                    pVar.E(e4.getCause());
                                }
                            }
                        } finally {
                            pVar.D(null);
                        }
                    }
                }, enumC6747jo0);
                i++;
            }
            return;
        }
        final AbstractC11861yi1 abstractC11861yi1 = this.m ? this.k : null;
        final C7335lX c7335lX2 = (C7335lX) this;
        Runnable runnable = new Runnable() { // from class: R7
            @Override // java.lang.Runnable
            public final void run() {
                c7335lX2.D(abstractC11861yi1);
            }
        };
        C14 it2 = this.k.iterator();
        while (it2.hasNext()) {
            ((RD1) it2.next()).f(runnable, enumC6747jo0);
        }
    }

    public final void D(AbstractC11861yi1 abstractC11861yi1) {
        if (q.j.b(this) == 0) {
            if (abstractC11861yi1 != null) {
                C14 it = abstractC11861yi1.iterator();
                while (it.hasNext()) {
                    Future future = (Future) it.next();
                    if (!future.isCancelled()) {
                        try {
                            future.isDone();
                            AbstractC7515m14.a(future);
                        } catch (Error e) {
                            e = e;
                            E(e);
                        } catch (RuntimeException e2) {
                            e = e2;
                            E(e);
                        } catch (ExecutionException e3) {
                            E(e3.getCause());
                        }
                    }
                }
            }
            B();
            C7335lX c7335lX = (C7335lX) this;
            r rVar = c7335lX.n;
            if (rVar != null) {
                try {
                    rVar.h.execute(rVar);
                } catch (RejectedExecutionException e4) {
                    rVar.i.u(e4);
                }
            }
            c7335lX.k = null;
        }
    }

    public final void E(Throwable th) {
        boolean z;
        if (this.l && !u(th)) {
            Set C = C();
            Throwable th2 = th;
            while (true) {
                if (th2 == null) {
                    z = true;
                    break;
                } else {
                    if (!C.add(th2)) {
                        z = false;
                        break;
                    }
                    th2 = th2.getCause();
                }
            }
            if (z) {
                boolean z2 = th instanceof Error;
                Level level = Level.SEVERE;
                throw null;
            }
        }
        if (th instanceof Error) {
            Level level2 = Level.SEVERE;
            throw null;
        }
    }

    @Override // com.google.common.util.concurrent.q
    public final void A(Set set) {
        if (isCancelled()) {
            return;
        }
        Throwable a = a();
        Objects.requireNonNull(a);
        while (a != null && set.add(a)) {
            a = a.getCause();
        }
    }
}
