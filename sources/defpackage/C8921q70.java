package defpackage;

import android.view.animation.PathInterpolator;
import org.chromium.chrome.browser.contextualsearch.ContextualSearchManager;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: q70, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8921q70 {
    public final N70 a;
    public float b;
    public int c;
    public boolean d;
    public String e;
    public boolean f;
    public int g;
    public float h;
    public C4424d20 i;
    public PathInterpolator j;

    public C8921q70(N70 n70) {
        this.a = n70;
    }

    public final void b(boolean z) {
        if ((this.f || this.d) && z) {
            a(false);
            return;
        }
        C4424d20 c4424d20 = this.i;
        if (c4424d20 != null) {
            c4424d20.cancel();
        }
        this.c = 0;
        this.d = false;
        this.e = "";
        this.f = false;
        this.h = 0.0f;
    }

    public final void a(boolean z) {
        if (!z || this.b <= 0.0f) {
            if (this.j == null) {
                this.j = new PathInterpolator(0.4f, 0.0f, 0.6f, 1.0f);
            }
            C4424d20 c4424d20 = this.i;
            if (c4424d20 != null) {
                c4424d20.cancel();
            }
            C4424d20 c = C4424d20.c(this.a.z0(), this.h, z ? 1.0f : 0.0f, 218L, new InterfaceC4080c20() { // from class: o70
                @Override // defpackage.InterfaceC4080c20
                public final void a(C4424d20 c4424d202) {
                    C8921q70 c8921q70 = C8921q70.this;
                    if (c8921q70.b > 0.0f) {
                        return;
                    }
                    c8921q70.h = c4424d202.b();
                }
            });
            this.i = c;
            c.j = this.j;
            c.addListener(new C8578p70(this));
            this.i.start();
        }
    }

    public final void c(int i, float f) {
        ((ContextualSearchManager) this.a.s0).t.getClass();
        if (S70.d() == (i == 4)) {
            if (this.d || this.f) {
                this.h = 1.0f - f;
                this.b = f;
            }
        }
    }
}
