package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class RL2 extends AbstractC1472Li1 {
    public final transient AbstractC0952Hi1 i;
    public final transient AbstractC0562Ei1 j;

    @Override // defpackage.AbstractC11861yi1
    public final boolean k() {
        return true;
    }

    @Override // defpackage.AbstractC11861yi1
    /* renamed from: l */
    public final C14 iterator() {
        return this.j.listIterator(0);
    }

    public RL2(AbstractC0952Hi1 abstractC0952Hi1, SL2 sl2) {
        this.i = abstractC0952Hi1;
        this.j = sl2;
    }

    @Override // defpackage.AbstractC11861yi1
    public final int b(int i, Object[] objArr) {
        return this.j.b(i, objArr);
    }

    @Override // defpackage.AbstractC1472Li1, defpackage.AbstractC11861yi1
    public final AbstractC0562Ei1 a() {
        return this.j;
    }

    @Override // defpackage.AbstractC11861yi1, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return this.i.get(obj) != null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return ((TL2) this.i).k;
    }
}
