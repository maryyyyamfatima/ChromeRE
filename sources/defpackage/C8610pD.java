package defpackage;

import android.graphics.drawable.Drawable;
import android.view.View;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: pD, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C8610pD {
    public boolean a;
    public boolean b;
    public C8267oD c;

    public C8610pD() {
    }

    public C8610pD(boolean z, Drawable drawable, View.OnClickListener onClickListener, int i, boolean z2, C12180ze1 c12180ze1, int i2) {
        this.a = z;
        this.b = true;
        this.c = new C8267oD(drawable, onClickListener, null, i, z2, c12180ze1, i2, 0);
    }

    public final void a(int i) {
        C8267oD c8267oD = this.c;
        this.c = new C8267oD(c8267oD.a, c8267oD.b, c8267oD.c, c8267oD.d, c8267oD.e, c8267oD.f, c8267oD.g, i);
    }

    public final void b(C12180ze1 c12180ze1) {
        C8267oD c8267oD = this.c;
        this.c = new C8267oD(c8267oD.a, c8267oD.b, c8267oD.c, c8267oD.d, c8267oD.e, c12180ze1, c8267oD.g, c8267oD.i);
    }
}
