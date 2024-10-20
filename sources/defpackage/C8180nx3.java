package defpackage;

import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: nx3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8180nx3 {
    public static final Object c = new Object();
    public static C8180nx3 d;
    public final AtomicInteger a;
    public final Q83 b;

    public static C8180nx3 a() {
        synchronized (c) {
            if (d == null) {
                d = new C8180nx3();
            }
        }
        return d;
    }

    public C8180nx3() {
        AtomicInteger atomicInteger = new AtomicInteger();
        this.a = atomicInteger;
        Q83 q83 = O83.a;
        this.b = q83;
        atomicInteger.set(q83.f(0, "org.chromium.chrome.browser.tab.TabIdManager.NEXT_ID"));
    }
}
