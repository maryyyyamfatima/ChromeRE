package defpackage;

import android.app.PendingIntent;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class F62 {
    public final Bundle a;
    public IconCompat b;
    public final C7283lM2[] c;
    public final boolean d;
    public final boolean e;
    public final int f;
    public final boolean g;
    public final int h;
    public final CharSequence i;
    public PendingIntent j;
    public final boolean k;

    public F62(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, C7283lM2[] c7283lM2Arr, C7283lM2[] c7283lM2Arr2, boolean z, int i, boolean z2, boolean z3, boolean z4) {
        this.e = true;
        this.b = iconCompat;
        if (iconCompat != null) {
            int i2 = iconCompat.a;
            if ((i2 == -1 ? AbstractC10820vg1.c(iconCompat.b) : i2) == 2) {
                this.h = iconCompat.c();
            }
        }
        this.i = K62.c(charSequence);
        this.j = pendingIntent;
        this.a = bundle == null ? new Bundle() : bundle;
        this.c = c7283lM2Arr;
        this.d = z;
        this.f = i;
        this.e = z2;
        this.g = z3;
        this.k = z4;
    }
}
