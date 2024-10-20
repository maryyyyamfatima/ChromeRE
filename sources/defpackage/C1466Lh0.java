package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Lh0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1466Lh0 extends RK2 {
    public final C3160Yi0 k;

    public C1466Lh0(C3160Yi0 c3160Yi0, C1206Jh0 c1206Jh0, C0166Bh0 c0166Bh0) {
        super(c1206Jh0, c0166Bh0);
        this.k = c3160Yi0;
        K(true);
    }

    @Override // defpackage.AbstractC8305oK2
    public final long r(int i) {
        if (this.g) {
            return this.k.get(i).a;
        }
        return -1L;
    }
}
