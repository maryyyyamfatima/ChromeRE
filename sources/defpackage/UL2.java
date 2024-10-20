package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class UL2 extends AbstractC1472Li1 {
    public static final Object[] n;
    public static final UL2 o;
    public final transient Object[] i;
    public final transient int j;
    public final transient Object[] k;
    public final transient int l;
    public final transient int m;

    @Override // defpackage.AbstractC11861yi1
    public final int g() {
        return 0;
    }

    @Override // defpackage.AbstractC11861yi1
    public final boolean k() {
        return false;
    }

    static {
        Object[] objArr = new Object[0];
        n = objArr;
        o = new UL2(0, 0, 0, objArr, objArr);
    }

    public UL2(int i, int i2, int i3, Object[] objArr, Object[] objArr2) {
        this.i = objArr;
        this.j = i;
        this.k = objArr2;
        this.l = i2;
        this.m = i3;
    }

    @Override // defpackage.AbstractC11861yi1, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (obj != null) {
            Object[] objArr = this.k;
            if (objArr.length != 0) {
                int b = AbstractC7198l61.b(obj);
                while (true) {
                    int i = b & this.l;
                    Object obj2 = objArr[i];
                    if (obj2 == null) {
                        return false;
                    }
                    if (obj2.equals(obj)) {
                        return true;
                    }
                    b = i + 1;
                }
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.m;
    }

    @Override // defpackage.AbstractC11861yi1
    /* renamed from: l */
    public final C14 iterator() {
        return a().listIterator(0);
    }

    @Override // defpackage.AbstractC11861yi1
    public final Object[] d() {
        return this.i;
    }

    @Override // defpackage.AbstractC11861yi1
    public final int f() {
        return this.m;
    }

    @Override // defpackage.AbstractC11861yi1
    public final int b(int i, Object[] objArr) {
        Object[] objArr2 = this.i;
        int i2 = this.m;
        System.arraycopy(objArr2, 0, objArr, i, i2);
        return i + i2;
    }

    @Override // defpackage.AbstractC1472Li1
    public final AbstractC0562Ei1 q() {
        return AbstractC0562Ei1.m(this.m, this.i);
    }

    @Override // defpackage.AbstractC1472Li1, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.j;
    }
}
