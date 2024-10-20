package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class LD1 implements ZJ2 {
    public static final MJ2 f = new LJ2().a();
    public static final MD1 g = new MD1();
    public int a = 1;
    public boolean b = false;
    public int c = Integer.MIN_VALUE;
    public MJ2 d = f;
    public final MD1 e = g;

    @Override // defpackage.ZJ2
    public final ZJ2 a(MJ2 mj2) {
        this.d = mj2;
        return this;
    }

    @Override // defpackage.ZJ2
    public final InterfaceC3493aK2 build() {
        int i = this.a;
        boolean z = this.b;
        int i2 = this.c;
        ND1 nd1 = new ND1(i, z, i2, this.d, this.e);
        nd1.f = Integer.MAX_VALUE;
        nd1.g = 1;
        if (i != 1 || i2 == Integer.MIN_VALUE || i2 == -1) {
            return nd1;
        }
        throw new UnsupportedOperationException("Only snap to start is implemented for vertical lists");
    }
}
