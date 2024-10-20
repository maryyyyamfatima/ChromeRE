package defpackage;

import android.util.Base64;
import java.util.Arrays;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Qo, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2149Qo {
    public final String a;
    public final byte[] b;
    public final EnumC7223lA2 c;

    public C2149Qo(String str, byte[] bArr, EnumC7223lA2 enumC7223lA2) {
        this.a = str;
        this.b = bArr;
        this.c = enumC7223lA2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2149Qo)) {
            return false;
        }
        C2149Qo c2149Qo = (C2149Qo) obj;
        return this.a.equals(c2149Qo.a) && Arrays.equals(this.b, c2149Qo.b) && this.c.equals(c2149Qo.c);
    }

    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final String toString() {
        Object[] objArr = new Object[3];
        objArr[0] = this.a;
        objArr[1] = this.c;
        byte[] bArr = this.b;
        objArr[2] = bArr == null ? "" : Base64.encodeToString(bArr, 2);
        return String.format("TransportContext(%s, %s, %s)", objArr);
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.b)) * 1000003) ^ this.c.hashCode();
    }
}
