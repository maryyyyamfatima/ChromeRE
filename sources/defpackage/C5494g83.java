package defpackage;

import java.util.Collections;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: g83 */
/* loaded from: classes.dex */
public final class C5494g83 {
    public static final Set h;
    public final QB a;
    public final C3776b83 b;
    public final InterfaceC0079Ap3 c;
    public final I73 d;
    public final long e;
    public final int f;
    public final S73 g;

    static {
        Object[] objArr = {"com.android.cts.ctsshim", "com.android.cts.priv.ctsshim"};
        HashSet hashSet = new HashSet(2);
        for (int i = 0; i < 2; i++) {
            Object obj = objArr[i];
            Objects.requireNonNull(obj);
            if (!hashSet.add(obj)) {
                throw new IllegalArgumentException("duplicate element: " + obj);
            }
        }
        h = Collections.unmodifiableSet(hashSet);
    }

    public C5494g83(QB qb, I73 i73, long j, int i, S73 s73, C3776b83 c3776b83, InterfaceC0079Ap3 interfaceC0079Ap3) {
        this.a = qb;
        this.b = c3776b83;
        this.c = interfaceC0079Ap3;
        this.d = i73;
        this.e = j;
        this.f = i;
        this.g = s73;
    }
}
