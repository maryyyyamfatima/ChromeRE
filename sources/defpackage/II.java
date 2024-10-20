package defpackage;

import android.view.ViewGroup;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class II extends AbstractC3898bW3 {
    public boolean a = false;
    public final /* synthetic */ ViewGroup g;

    public II(ViewGroup viewGroup) {
        this.g = viewGroup;
    }

    @Override // defpackage.AbstractC3898bW3, defpackage.KV3
    public final void d() {
        Wc4.a(this.g, false);
        this.a = true;
    }

    @Override // defpackage.KV3
    public final void c(QV3 qv3) {
        if (!this.a) {
            Wc4.a(this.g, false);
        }
        qv3.w(this);
    }

    @Override // defpackage.AbstractC3898bW3, defpackage.KV3
    public final void b() {
        Wc4.a(this.g, false);
    }

    @Override // defpackage.AbstractC3898bW3, defpackage.KV3
    public final void e() {
        Wc4.a(this.g, true);
    }
}
