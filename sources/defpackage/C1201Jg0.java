package defpackage;

import java.util.Comparator;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Jg0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1201Jg0 implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        C2370Sg0 c2370Sg0 = (C2370Sg0) obj;
        C2370Sg0 c2370Sg02 = (C2370Sg0) obj2;
        if (c2370Sg0 == c2370Sg02) {
            return 0;
        }
        if (c2370Sg0.c() != c2370Sg02.c()) {
            return c2370Sg0.c() < c2370Sg02.c() ? -1 : 1;
        }
        return AbstractC2630Ug0.M(c2370Sg0.a, c2370Sg02.a);
    }
}
