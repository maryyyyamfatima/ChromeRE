package defpackage;

import java.util.WeakHashMap;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: fU3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5262fU3 extends ThreadLocal {
    @Override // java.lang.ThreadLocal
    public final Object initialValue() {
        HK3.a();
        C5950hU3 c5950hU3 = new C5950hU3();
        Thread currentThread = Thread.currentThread();
        WeakHashMap weakHashMap = AbstractC6294iU3.a;
        synchronized (weakHashMap) {
            weakHashMap.put(currentThread, c5950hU3);
        }
        return c5950hU3;
    }
}
