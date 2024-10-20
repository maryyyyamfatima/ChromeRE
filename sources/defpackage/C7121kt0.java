package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: kt0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7121kt0 extends AbstractC7809mt0 {
    @Override // defpackage.AbstractC7809mt0
    public final float b(int i, int i2, int i3, int i4) {
        if (AbstractC7809mt0.g) {
            return Math.min(i3 / i, i4 / i2);
        }
        if (Math.max(i2 / i4, i / i3) == 0) {
            return 1.0f;
        }
        return 1.0f / Integer.highestOneBit(r2);
    }

    @Override // defpackage.AbstractC7809mt0
    public final int a(int i, int i2, int i3, int i4) {
        return AbstractC7809mt0.g ? 2 : 1;
    }
}
