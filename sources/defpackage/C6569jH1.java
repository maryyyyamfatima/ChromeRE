package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: jH1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6569jH1 extends AbstractC10078tW1 {
    public Object[] a = new Object[8];
    public int b = 0;

    @Override // defpackage.AbstractC10078tW1
    public final int d() {
        return this.b;
    }

    @Override // defpackage.AbstractC10078tW1
    public final GW1 b(int i) {
        if (i >= this.b) {
            throw new IndexOutOfBoundsException();
        }
        return (GW1) this.a[i * 2];
    }

    @Override // defpackage.AbstractC10078tW1
    public final Object c(int i) {
        if (i >= this.b) {
            throw new IndexOutOfBoundsException();
        }
        return this.a[(i * 2) + 1];
    }

    public final int e(GW1 gw1) {
        for (int i = 0; i < this.b; i++) {
            if (this.a[i * 2].equals(gw1)) {
                return i;
            }
        }
        return -1;
    }

    @Override // defpackage.AbstractC10078tW1
    public final Object a(GW1 gw1) {
        int e = e(gw1);
        if (e == -1) {
            return null;
        }
        return gw1.b.cast(this.a[(e * 2) + 1]);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Metadata{");
        for (int i = 0; i < this.b; i++) {
            sb.append(" '");
            sb.append(b(i));
            sb.append("': ");
            sb.append(c(i));
        }
        sb.append(" }");
        return sb.toString();
    }
}
