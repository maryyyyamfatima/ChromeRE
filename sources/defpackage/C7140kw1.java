package defpackage;

import java.util.Comparator;
import java.util.LinkedHashSet;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: kw1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7140kw1 implements Comparator {
    public final /* synthetic */ LinkedHashSet a;
    public final /* synthetic */ C9202qw1 g;

    public C7140kw1(C9202qw1 c9202qw1, LinkedHashSet linkedHashSet) {
        this.g = c9202qw1;
        this.a = linkedHashSet;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i;
        C10230tw1 c10230tw1 = (C10230tw1) obj;
        C10230tw1 c10230tw12 = (C10230tw1) obj2;
        String str = c10230tw1.a;
        LinkedHashSet linkedHashSet = this.a;
        boolean contains = linkedHashSet.contains(str);
        int i2 = -1;
        C9202qw1 c9202qw1 = this.g;
        if (contains) {
            i = -2;
        } else {
            i = c9202qw1.h.contains(c10230tw1.a) ? -1 : 0;
        }
        if (linkedHashSet.contains(c10230tw12.a)) {
            i2 = -2;
        } else if (!c9202qw1.h.contains(c10230tw12.a)) {
            i2 = 0;
        }
        return i - i2;
    }
}
