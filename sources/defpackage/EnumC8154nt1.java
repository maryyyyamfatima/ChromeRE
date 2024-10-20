package defpackage;

import java.io.Serializable;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: nt1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public enum EnumC8154nt1 {
    VOID(Void.class, null),
    INT(Integer.class, 0),
    LONG(Long.class, 0L),
    FLOAT(Float.class, Float.valueOf(0.0f)),
    DOUBLE(Double.class, Double.valueOf(0.0d)),
    BOOLEAN(Boolean.class, Boolean.FALSE),
    STRING(String.class, ""),
    BYTE_STRING(AbstractC4147cE.class, AbstractC4147cE.g),
    ENUM(Integer.class, null),
    MESSAGE(Object.class, null);

    public final Object a;

    EnumC8154nt1(Class cls, Serializable serializable) {
        this.a = serializable;
    }
}
