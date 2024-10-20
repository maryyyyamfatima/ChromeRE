package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Di1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0432Di1 extends AbstractC0562Ei1 {
    public final transient int h;
    public final transient int i;
    public final /* synthetic */ AbstractC0562Ei1 j;

    @Override // defpackage.AbstractC11861yi1
    public final boolean k() {
        return true;
    }

    public C0432Di1(AbstractC0562Ei1 abstractC0562Ei1, int i, int i2) {
        this.j = abstractC0562Ei1;
        this.h = i;
        this.i = i2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.i;
    }

    @Override // defpackage.AbstractC11861yi1
    public final Object[] d() {
        return this.j.d();
    }

    @Override // defpackage.AbstractC11861yi1
    public final int g() {
        return this.j.g() + this.h;
    }

    @Override // defpackage.AbstractC11861yi1
    public final int f() {
        return this.j.g() + this.h + this.i;
    }

    @Override // java.util.List
    public final Object get(int i) {
        return this.j.get(i + this.h);
    }

    @Override // defpackage.AbstractC0562Ei1, java.util.List
    /* renamed from: u */
    public final AbstractC0562Ei1 subList(int i, int i2) {
        int i3 = this.h;
        return this.j.subList(i + i3, i2 + i3);
    }
}
