package defpackage;

import java.util.Arrays;
import org.json.JSONObject;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: kR1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6963kR1 {
    public final long a;
    public final int b;
    public final JSONObject c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6963kR1)) {
            return false;
        }
        C6963kR1 c6963kR1 = (C6963kR1) obj;
        return this.a == c6963kR1.a && this.b == c6963kR1.b && W82.a(this.c, c6963kR1.c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.a), Integer.valueOf(this.b), Boolean.FALSE, this.c});
    }

    public C6963kR1(long j, int i, JSONObject jSONObject) {
        this.a = j;
        this.b = i;
        this.c = jSONObject;
    }
}
