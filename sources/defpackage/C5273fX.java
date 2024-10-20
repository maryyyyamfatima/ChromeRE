package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: fX, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5273fX extends AbstractC4734dw1 implements AV0 {
    public static final C5273fX g = new C5273fX();

    public C5273fX() {
        super(2);
    }

    @Override // defpackage.AV0
    public final Object c(Object obj, Object obj2) {
        String str = (String) obj;
        B90 b90 = (B90) obj2;
        AbstractC0087Ar1.e(str, "acc");
        AbstractC0087Ar1.e(b90, "element");
        if (str.length() == 0) {
            return b90.toString();
        }
        return str + ", " + b90;
    }
}
