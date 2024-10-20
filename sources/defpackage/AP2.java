package defpackage;

import android.content.res.Resources;
import java.util.Objects;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class AP2 {
    public final Resources a;
    public final Resources.Theme b;

    public AP2(Resources resources, Resources.Theme theme) {
        this.a = resources;
        this.b = theme;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || AP2.class != obj.getClass()) {
            return false;
        }
        AP2 ap2 = (AP2) obj;
        return this.a.equals(ap2.a) && Objects.equals(this.b, ap2.b);
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b);
    }
}
