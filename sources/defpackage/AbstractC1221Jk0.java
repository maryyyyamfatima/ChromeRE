package defpackage;

import java.util.HashSet;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Jk0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1221Jk0 {
    public final C1983Pg3 a;
    public final QF b;

    public final void a() {
        C1983Pg3 c1983Pg3 = this.a;
        HashSet hashSet = c1983Pg3.e;
        if (hashSet.remove(this.b) && hashSet.isEmpty()) {
            c1983Pg3.b();
        }
    }

    public AbstractC1221Jk0(C1983Pg3 c1983Pg3, QF qf) {
        this.a = c1983Pg3;
        this.b = qf;
    }

    public final boolean b() {
        C1983Pg3 c1983Pg3 = this.a;
        int c = AbstractC2503Tg3.c(c1983Pg3.c.L);
        int i = c1983Pg3.a;
        return c == i || !(c == 2 || i == 2);
    }
}
