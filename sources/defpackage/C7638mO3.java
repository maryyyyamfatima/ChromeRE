package defpackage;

import java.util.HashSet;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: mO3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C7638mO3 {
    public int a;
    public final HashSet b = new HashSet();
    public final Runnable c;

    public C7638mO3(Runnable runnable) {
        this.c = runnable;
    }

    public final int a() {
        int i = this.a;
        this.a = i + 1;
        HashSet hashSet = this.b;
        hashSet.add(Integer.valueOf(i));
        if (hashSet.size() == 1) {
            this.c.run();
        }
        return i;
    }

    public final void c(int i) {
        HashSet hashSet = this.b;
        if (hashSet.remove(Integer.valueOf(i)) && hashSet.isEmpty()) {
            this.c.run();
        }
    }

    public final boolean b() {
        return !this.b.isEmpty();
    }
}
