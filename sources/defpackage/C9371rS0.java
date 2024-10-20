package defpackage;

import java.math.BigDecimal;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: rS0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public enum C9371rS0 extends EnumC9714sS0 {
    public C9371rS0() {
        super("FLOAT", 4, true);
    }

    @Override // defpackage.EnumC9714sS0
    public final boolean a(Object obj) {
        return (obj instanceof Double) || (obj instanceof Float) || (obj instanceof BigDecimal);
    }
}
