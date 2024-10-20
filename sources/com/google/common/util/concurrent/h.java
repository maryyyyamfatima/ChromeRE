package com.google.common.util.concurrent;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
final class h extends a {
    @Override // com.google.common.util.concurrent.a
    public final void g(m mVar, Thread thread) {
        mVar.thread = thread;
    }

    @Override // com.google.common.util.concurrent.a
    public final void f(m mVar, m mVar2) {
        mVar.next = mVar2;
    }

    @Override // com.google.common.util.concurrent.a
    public final boolean c(n nVar, m mVar, m mVar2) {
        m mVar3;
        synchronized (nVar) {
            mVar3 = nVar.waiters;
            if (mVar3 != mVar) {
                return false;
            }
            nVar.waiters = mVar2;
            return true;
        }
    }

    @Override // com.google.common.util.concurrent.a
    public final boolean a(n nVar, e eVar, e eVar2) {
        e eVar3;
        synchronized (nVar) {
            eVar3 = nVar.listeners;
            if (eVar3 != eVar) {
                return false;
            }
            nVar.listeners = eVar2;
            return true;
        }
    }

    @Override // com.google.common.util.concurrent.a
    public final e d(n nVar, e eVar) {
        e eVar2;
        synchronized (nVar) {
            eVar2 = nVar.listeners;
            if (eVar2 != eVar) {
                nVar.listeners = eVar;
            }
        }
        return eVar2;
    }

    @Override // com.google.common.util.concurrent.a
    public final m e(n nVar, m mVar) {
        m mVar2;
        synchronized (nVar) {
            mVar2 = nVar.waiters;
            if (mVar2 != mVar) {
                nVar.waiters = mVar;
            }
        }
        return mVar2;
    }

    @Override // com.google.common.util.concurrent.a
    public final boolean b(n nVar, Object obj, Object obj2) {
        Object obj3;
        synchronized (nVar) {
            obj3 = nVar.value;
            if (obj3 != obj) {
                return false;
            }
            nVar.value = obj2;
            return true;
        }
    }
}
