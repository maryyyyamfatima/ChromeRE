package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: oK3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8306oK3 extends AbstractC4734dw1 implements AV0 {
    public static final C8306oK3 g = new C8306oK3();

    public C8306oK3() {
        super(2);
    }

    @Override // defpackage.AV0
    public final Object c(Object obj, Object obj2) {
        B90 b90 = (B90) obj2;
        if (!(b90 instanceof InterfaceC7962nK3)) {
            return obj;
        }
        Integer num = obj instanceof Integer ? (Integer) obj : null;
        int intValue = num == null ? 1 : num.intValue();
        return intValue == 0 ? b90 : Integer.valueOf(intValue + 1);
    }
}
