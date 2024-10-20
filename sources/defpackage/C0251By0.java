package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: By0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0251By0 implements Lq4 {
    public final float a;

    public C0251By0(float f) {
        this.a = f;
    }

    @Override // defpackage.Lq4
    public final boolean a(int i, int i2, int i3) {
        int i4 = (int) (((i3 - i2) + 1) * this.a);
        return i >= i2 - i4 && i <= i3 + i4;
    }

    @Override // defpackage.Lq4
    public final boolean b(int i, int i2, int i3) {
        int i4 = (int) (((i3 - i2) + 1) * this.a);
        return i < i2 - i4 || i > i3 + i4;
    }
}
