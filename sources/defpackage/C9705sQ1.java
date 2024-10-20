package defpackage;

import android.media.VolumeProvider;
import android.os.Build;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: sQ1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9705sQ1 {
    public final int a;
    public final int b;
    public final String c;
    public int d;
    public VolumeProvider e;
    public final /* synthetic */ C10048tQ1 f;

    public final VolumeProvider a() {
        if (this.e == null) {
            if (Build.VERSION.SDK_INT >= 30) {
                this.e = new C3611ag4(this, this.a, this.b, this.d, this.c);
            } else {
                this.e = new C3955bg4(this, this.a, this.b, this.d);
            }
        }
        return this.e;
    }

    public C9705sQ1(C10048tQ1 c10048tQ1, int i, int i2, int i3, String str) {
        this.f = c10048tQ1;
        this.a = i;
        this.b = i2;
        this.d = i3;
        this.c = str;
    }
}
