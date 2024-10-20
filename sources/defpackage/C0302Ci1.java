package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Ci1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0302Ci1 extends AbstractC0562Ei1 {
    public final transient AbstractC0562Ei1 h;

    public C0302Ci1(AbstractC0562Ei1 abstractC0562Ei1) {
        this.h = abstractC0562Ei1;
    }

    @Override // defpackage.AbstractC0562Ei1
    public final AbstractC0562Ei1 t() {
        return this.h;
    }

    @Override // defpackage.AbstractC0562Ei1, defpackage.AbstractC11861yi1, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return this.h.contains(obj);
    }

    @Override // defpackage.AbstractC0562Ei1, java.util.List
    public final int indexOf(Object obj) {
        int lastIndexOf = this.h.lastIndexOf(obj);
        if (lastIndexOf >= 0) {
            return (size() - 1) - lastIndexOf;
        }
        return -1;
    }

    @Override // defpackage.AbstractC0562Ei1, java.util.List
    public final int lastIndexOf(Object obj) {
        int indexOf = this.h.indexOf(obj);
        if (indexOf >= 0) {
            return (size() - 1) - indexOf;
        }
        return -1;
    }

    @Override // defpackage.AbstractC0562Ei1, java.util.List
    /* renamed from: u */
    public final AbstractC0562Ei1 subList(int i, int i2) {
        size();
        return this.h.subList(size() - i2, size() - i).t();
    }

    @Override // java.util.List
    public final Object get(int i) {
        size();
        return this.h.get((size() - 1) - i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.h.size();
    }

    @Override // defpackage.AbstractC11861yi1
    public final boolean k() {
        return this.h.k();
    }
}
