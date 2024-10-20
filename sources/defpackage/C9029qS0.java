package defpackage;

import java.math.BigInteger;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: qS0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public enum C9029qS0 extends EnumC9714sS0 {
    public C9029qS0() {
        super("INTEGRAL", 3, false);
    }

    @Override // defpackage.EnumC9714sS0
    public final boolean a(Object obj) {
        return (obj instanceof Integer) || (obj instanceof Long) || (obj instanceof Byte) || (obj instanceof Short) || (obj instanceof BigInteger);
    }
}
