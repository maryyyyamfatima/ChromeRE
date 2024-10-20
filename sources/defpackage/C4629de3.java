package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: de3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4629de3 extends AbstractC1472Li1 {
    public final transient Object i;

    @Override // defpackage.AbstractC11861yi1
    public final boolean k() {
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    public C4629de3(Object obj) {
        this.i = obj;
    }

    @Override // defpackage.AbstractC11861yi1, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return this.i.equals(obj);
    }

    @Override // defpackage.AbstractC1472Li1, defpackage.AbstractC11861yi1
    public final AbstractC0562Ei1 a() {
        return AbstractC0562Ei1.r(this.i);
    }

    @Override // defpackage.AbstractC11861yi1
    public final int b(int i, Object[] objArr) {
        objArr[i] = this.i;
        return i + 1;
    }

    @Override // defpackage.AbstractC1472Li1, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.i.hashCode();
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return "[" + this.i.toString() + ']';
    }

    @Override // defpackage.AbstractC11861yi1
    /* renamed from: l */
    public final C14 iterator() {
        return new C2171Qs1(this.i);
    }
}
