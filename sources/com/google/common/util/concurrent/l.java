package com.google.common.util.concurrent;

import defpackage.AbstractC10934w;
import java.security.AccessController;
import java.security.PrivilegedActionException;
import sun.misc.Unsafe;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
final class l extends a {
    static final Unsafe a;
    static final long b;
    static final long c;
    static final long d;
    static final long e;
    static final long f;

    static {
        Unsafe unsafe;
        try {
            try {
                unsafe = Unsafe.getUnsafe();
            } catch (SecurityException unused) {
                unsafe = (Unsafe) AccessController.doPrivileged(new k());
            }
            try {
                c = unsafe.objectFieldOffset(n.class.getDeclaredField("waiters"));
                b = unsafe.objectFieldOffset(n.class.getDeclaredField("listeners"));
                d = unsafe.objectFieldOffset(n.class.getDeclaredField("value"));
                e = unsafe.objectFieldOffset(m.class.getDeclaredField("thread"));
                f = unsafe.objectFieldOffset(m.class.getDeclaredField("next"));
                a = unsafe;
            } catch (NoSuchFieldException e2) {
                throw new RuntimeException(e2);
            } catch (RuntimeException e3) {
                throw e3;
            }
        } catch (PrivilegedActionException e4) {
            throw new RuntimeException("Could not initialize intrinsics", e4.getCause());
        }
    }

    @Override // com.google.common.util.concurrent.a
    public final void g(m mVar, Thread thread) {
        a.putObject(mVar, e, thread);
    }

    @Override // com.google.common.util.concurrent.a
    public final void f(m mVar, m mVar2) {
        a.putObject(mVar, f, mVar2);
    }

    @Override // com.google.common.util.concurrent.a
    public final boolean c(n nVar, m mVar, m mVar2) {
        return AbstractC10934w.a(a, nVar, c, mVar, mVar2);
    }

    @Override // com.google.common.util.concurrent.a
    public final boolean a(n nVar, e eVar, e eVar2) {
        return AbstractC10934w.a(a, nVar, b, eVar, eVar2);
    }

    @Override // com.google.common.util.concurrent.a
    public final e d(n nVar, e eVar) {
        e eVar2;
        do {
            eVar2 = nVar.listeners;
            if (eVar == eVar2) {
                return eVar2;
            }
        } while (!a(nVar, eVar2, eVar));
        return eVar2;
    }

    @Override // com.google.common.util.concurrent.a
    public final m e(n nVar, m mVar) {
        m mVar2;
        do {
            mVar2 = nVar.waiters;
            if (mVar == mVar2) {
                return mVar2;
            }
        } while (!c(nVar, mVar2, mVar));
        return mVar2;
    }

    @Override // com.google.common.util.concurrent.a
    public final boolean b(n nVar, Object obj, Object obj2) {
        return AbstractC10934w.a(a, nVar, d, obj, obj2);
    }
}
