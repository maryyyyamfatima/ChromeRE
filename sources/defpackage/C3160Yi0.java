package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Yi0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3160Yi0 extends AbstractC8269oD1 implements InterfaceC7581mD1, InterfaceC2608Ub3 {
    public final PC1 g;
    public final ArrayList h = new ArrayList();

    @Override // defpackage.InterfaceC7581mD1
    public final /* synthetic */ void f(int i, int i2) {
    }

    @Override // defpackage.InterfaceC7581mD1
    public final void p(InterfaceC7925nD1 interfaceC7925nD1, int i, int i2, Object obj) {
        o((Void) obj, this.h.size() + i, i2);
    }

    public C3160Yi0(PC1 pc1) {
        this.g = pc1;
        pc1.l(this);
    }

    @Override // defpackage.InterfaceC2608Ub3, java.lang.Iterable
    public final Iterator iterator() {
        return new C2478Tb3(this);
    }

    @Override // defpackage.InterfaceC2608Ub3
    public final int size() {
        return this.h.size() + this.g.size();
    }

    @Override // defpackage.InterfaceC2608Ub3
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public final OC1 get(int i) {
        ArrayList arrayList = this.h;
        if (i < arrayList.size()) {
            return (OC1) arrayList.get(i);
        }
        return (OC1) this.g.get(i - arrayList.size());
    }

    @Override // defpackage.InterfaceC7581mD1
    public final void k(int i, int i2) {
        r(this.h.size() + i, i2);
    }

    @Override // defpackage.InterfaceC7581mD1
    public final void m(InterfaceC7925nD1 interfaceC7925nD1, int i, int i2) {
        q(this.h.size() + i, i2);
    }
}
