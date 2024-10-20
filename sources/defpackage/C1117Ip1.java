package defpackage;

import java.util.AbstractList;
import java.util.List;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Ip1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1117Ip1 extends AbstractList {
    public final List a;
    public final InterfaceC0987Hp1 g;

    public C1117Ip1(InterfaceC0857Gp1 interfaceC0857Gp1, InterfaceC0987Hp1 interfaceC0987Hp1) {
        this.a = interfaceC0857Gp1;
        this.g = interfaceC0987Hp1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        return this.g.a(this.a.get(i));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.a.size();
    }
}
