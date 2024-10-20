package defpackage;

import android.view.DisplayCutout;
import java.util.Objects;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Xp0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3065Xp0 {
    public final DisplayCutout a;

    public C3065Xp0(DisplayCutout displayCutout) {
        this.a = displayCutout;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C3065Xp0.class != obj.getClass()) {
            return false;
        }
        return Objects.equals(this.a, ((C3065Xp0) obj).a);
    }

    public final int hashCode() {
        int hashCode;
        DisplayCutout displayCutout = this.a;
        if (displayCutout == null) {
            return 0;
        }
        hashCode = displayCutout.hashCode();
        return hashCode;
    }

    public final String toString() {
        return "DisplayCutoutCompat{" + this.a + "}";
    }
}
