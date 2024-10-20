package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: pS0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public enum C8686pS0 extends EnumC9714sS0 {
    public C8686pS0() {
        super("CHARACTER", 2, false);
    }

    @Override // defpackage.EnumC9714sS0
    public final boolean a(Object obj) {
        if (obj instanceof Character) {
            return true;
        }
        if ((obj instanceof Integer) || (obj instanceof Byte) || (obj instanceof Short)) {
            return Character.isValidCodePoint(((Number) obj).intValue());
        }
        return false;
    }
}
