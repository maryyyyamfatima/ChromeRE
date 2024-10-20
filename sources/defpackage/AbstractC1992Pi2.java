package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Pi2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1992Pi2 {
    public final int a;
    public final C7655mS0 b;

    public abstract void a(C1275Jv c1275Jv, Object obj);

    public AbstractC1992Pi2(C7655mS0 c7655mS0, int i) {
        if (c7655mS0 == null) {
            throw new IllegalArgumentException("format options cannot be null");
        }
        if (i < 0) {
            throw new IllegalArgumentException(AbstractC9076qb1.a("invalid index: ", i));
        }
        this.a = i;
        this.b = c7655mS0;
    }
}
