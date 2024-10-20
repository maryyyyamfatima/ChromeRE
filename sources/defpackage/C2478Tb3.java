package defpackage;

import java.util.Iterator;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Tb3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2478Tb3 implements Iterator {
    public int a;
    public final /* synthetic */ InterfaceC2608Ub3 g;

    public C2478Tb3(InterfaceC2608Ub3 interfaceC2608Ub3) {
        this.g = interfaceC2608Ub3;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.a < this.g.size();
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.a;
        this.a = i + 1;
        return this.g.get(i);
    }
}
