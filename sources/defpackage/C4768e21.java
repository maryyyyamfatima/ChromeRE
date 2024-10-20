package defpackage;

import com.google.android.gms.common.Feature;
import java.util.Arrays;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: e21, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4768e21 {
    public final C0540Ee a;
    public final Feature b;

    public final String toString() {
        U82 u82 = new U82(this);
        u82.a(this.a, "key");
        u82.a(this.b, "feature");
        return u82.toString();
    }

    public C4768e21(C0540Ee c0540Ee, Feature feature) {
        this.a = c0540Ee;
        this.b = feature;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C4768e21)) {
            return false;
        }
        C4768e21 c4768e21 = (C4768e21) obj;
        return W82.a(this.a, c4768e21.a) && W82.a(this.b, c4768e21.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }
}
