package defpackage;

import java.util.Arrays;
import java.util.Objects;
import java.util.Set;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: zf4, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C12189zf4 {
    public final C11846yf4 a;
    public final C11503xf4 b;
    public final Set c;
    public final Set d;

    public C12189zf4(C11846yf4 c11846yf4, C11503xf4 c11503xf4, Set set, Set set2) {
        this.a = c11846yf4;
        this.b = c11503xf4;
        this.c = set;
        this.d = set2;
    }

    public final boolean a() {
        Set set;
        Set set2;
        return this.a == null && this.b == null && ((set = this.c) == null || set.size() == 0) && ((set2 = this.d) == null || set2.size() == 0);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C12189zf4)) {
            return false;
        }
        C12189zf4 c12189zf4 = (C12189zf4) obj;
        return Objects.equals(this.a, c12189zf4.a) && Objects.equals(this.b, c12189zf4.b) && Objects.equals(this.c, c12189zf4.c) && Objects.equals(this.d, c12189zf4.d);
    }

    public final int hashCode() {
        Object[] objArr = new Object[4];
        objArr[0] = this.a;
        objArr[1] = this.b;
        Set set = this.c;
        objArr[2] = Integer.valueOf(set != null ? set.hashCode() : 0);
        Set set2 = this.d;
        objArr[3] = Integer.valueOf(set2 != null ? set2.hashCode() : 0);
        return Arrays.hashCode(objArr);
    }
}
