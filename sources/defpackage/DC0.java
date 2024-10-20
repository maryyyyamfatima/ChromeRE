package defpackage;

import android.view.View;
import com.android.chrome.R;
import org.chromium.components.browser_ui.bottomsheet.m;
import org.chromium.content_public.browser.WebContents;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class DC0 extends AbstractC4472dA0 {
    public final /* synthetic */ GC0 a;

    @Override // defpackage.AbstractC4472dA0, defpackage.InterfaceC4481dC
    public final void a(float f) {
        GC0 gc0 = this.a;
        PC0 pc0 = gc0.p;
        if (pc0 != null && gc0.l) {
            View findViewById = pc0.l.findViewById(R.id.open_in_new_tab);
            if (f <= 0.5f) {
                if (findViewById.getVisibility() != 8) {
                    findViewById.setVisibility(8);
                }
            } else {
                if (findViewById.getVisibility() != 0) {
                    findViewById.setVisibility(0);
                }
                findViewById.setAlpha((f - 0.5f) * 2.0f);
            }
        }
    }

    @Override // defpackage.AbstractC4472dA0, defpackage.InterfaceC4481dC
    public final void b(PB pb) {
        GC0 gc0 = this.a;
        if (pb != gc0.p) {
            gc0.p = null;
            gc0.u = false;
            gc0.v = false;
            WebContents webContents = gc0.n;
            if (webContents != null) {
                webContents.destroy();
                gc0.n = null;
                gc0.o = null;
            }
            LC0 lc0 = gc0.m;
            if (lc0 != null) {
                IC0 ic0 = lc0.f;
                if (ic0 != null) {
                    ic0.destroy();
                    lc0.f = null;
                }
                lc0.getClass();
                lc0.d = null;
                lc0.e = null;
                lc0.g = null;
            }
            gc0.h.removeOnLayoutChangeListener(gc0);
            DC0 dc0 = gc0.q;
            if (dc0 != null) {
                ((m) gc0.k).o(dc0);
            }
        }
    }

    @Override // defpackage.AbstractC4472dA0, defpackage.InterfaceC4481dC
    public final void h(int i, int i2) {
        GC0 gc0 = this.a;
        if (gc0.p == null) {
            return;
        }
        if (i == 1) {
            if (gc0.u) {
                return;
            }
            gc0.u = true;
        } else if (i == 3 && !gc0.v) {
            gc0.v = true;
        }
    }

    public DC0(GC0 gc0) {
        this.a = gc0;
    }
}
