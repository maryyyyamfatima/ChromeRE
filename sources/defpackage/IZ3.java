package defpackage;

import java.util.Objects;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class IZ3 {
    public final String a;
    public final int b;

    public IZ3(String str, int i) {
        this.a = str;
        this.b = i;
    }

    public final String a() {
        String str = this.a;
        int lastIndexOf = str.lastIndexOf(" Condensed");
        int i = this.b;
        return lastIndexOf != -1 ? String.format(null, "name=%s&weight=%d&width=%d", str.substring(0, lastIndexOf), Integer.valueOf(i), 75) : String.format(null, "name=%s&weight=%d", str, Integer.valueOf(i));
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof IZ3) {
            return a().equalsIgnoreCase(((IZ3) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(a());
    }
}
