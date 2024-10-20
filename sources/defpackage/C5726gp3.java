package defpackage;

import android.graphics.drawable.Drawable;
import java.util.Objects;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: gp3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5726gp3 {
    public final Drawable a;
    public final boolean b;
    public final boolean c;
    public final boolean d;

    public C5726gp3(Drawable drawable, boolean z, boolean z2, boolean z3) {
        this.a = drawable;
        this.c = z;
        this.d = z2;
        this.b = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5726gp3)) {
            return false;
        }
        C5726gp3 c5726gp3 = (C5726gp3) obj;
        return this.d == c5726gp3.d && this.c == c5726gp3.c && this.b == c5726gp3.b && Objects.equals(this.a, c5726gp3.a);
    }
}
