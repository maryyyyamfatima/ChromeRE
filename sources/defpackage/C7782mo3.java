package defpackage;

import android.graphics.drawable.Drawable;
import com.google.android.libraries.elements.interfaces.RectCornersProxy;
import java.util.Objects;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: mo3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7782mo3 {
    public RectCornersProxy d;
    public float a = 0.0f;
    public int b = 0;
    public C8257oB c = null;
    public Drawable e = null;

    public final boolean equals(Object obj) {
        if (!(obj instanceof C7782mo3)) {
            return false;
        }
        C7782mo3 c7782mo3 = (C7782mo3) obj;
        if (Objects.equals(this.e, c7782mo3.e)) {
            return ((((long) (Float.valueOf(this.a).floatValue() * 10000.0f)) > ((long) (Float.valueOf(c7782mo3.a).floatValue() * 10000.0f)) ? 1 : (((long) (Float.valueOf(this.a).floatValue() * 10000.0f)) == ((long) (Float.valueOf(c7782mo3.a).floatValue() * 10000.0f)) ? 0 : -1)) == 0) && Objects.equals(this.c, c7782mo3.c) && this.b == c7782mo3.b;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.e, Float.valueOf(this.a), this.c, Integer.valueOf(this.b));
    }

    public final String toString() {
        return "StyleBuilderImpl(backgroundDrawable:" + String.valueOf(this.e) + ", cornerRadiusPx:" + this.a + ", border:" + String.valueOf(this.c) + ", borderColor:" + this.b + ")";
    }
}
