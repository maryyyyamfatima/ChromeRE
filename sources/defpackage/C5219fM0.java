package defpackage;

import java.util.Collections;
import java.util.Map;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: fM0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5219fM0 {
    public final String a;
    public final Map b;

    public C5219fM0(Map map, String str) {
        this.a = str;
        this.b = map;
    }

    public static C5219fM0 a(String str) {
        return new C5219fM0(Collections.emptyMap(), str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5219fM0)) {
            return false;
        }
        C5219fM0 c5219fM0 = (C5219fM0) obj;
        return this.a.equals(c5219fM0.a) && this.b.equals(c5219fM0.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "FieldDescriptor{name=" + this.a + ", properties=" + String.valueOf(this.b.values()) + "}";
    }
}
