package defpackage;

import java.util.Comparator;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class CE3 implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        LE3 a = LE3.a(obj);
        LE3 a2 = LE3.a(obj2);
        return a == a2 ? a.b(obj, obj2) : a.compareTo(a2);
    }
}
