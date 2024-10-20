package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: vK */
/* loaded from: classes2.dex */
public final class C10702vK implements Iterator {
    public int a;
    public final /* synthetic */ C11045wK g;

    @Override // java.util.Iterator
    public final Object next() {
        ArrayList arrayList = this.g.h;
        int i = this.a;
        this.a = i - 1;
        return ((C10016tK) arrayList.get(i)).a;
    }

    public C10702vK(C11045wK c11045wK) {
        this.g = c11045wK;
        this.a = c11045wK.h.size() - 1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.a >= 0;
    }
}
