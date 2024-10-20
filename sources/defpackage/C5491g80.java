package defpackage;

import android.app.Activity;
import java.util.regex.Pattern;
import org.chromium.chrome.browser.contextualsearch.ContextualSearchManager;
import org.chromium.chrome.browser.tab.Tab;
import org.chromium.content.browser.selection.SelectionPopupControllerImpl;
import org.chromium.content_public.browser.WebContents;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: g80, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5491g80 {
    public final InterfaceC5835h80 a;
    public final float b;
    public final Pattern c = Pattern.compile("(\\w|\\p{L}|\\p{N})+");
    public final InterfaceC0079Ap3 d;
    public String e;
    public int f;
    public int g;
    public boolean h;
    public C7209l80 i;
    public boolean j;
    public float k;
    public float l;
    public long m;
    public boolean n;
    public boolean o;
    public boolean p;
    public boolean q;
    public boolean r;

    static {
        Pattern.compile("((http|https|file|ftp|ssh)://)([\\w_-]+(?:(?:\\.[\\w_-]+)+))([\\w.,@?^=%&:/~+#-]*[\\w@?^=%&/~+#-])?");
    }

    public C5491g80(Activity activity, InterfaceC5835h80 interfaceC5835h80, C6166i6 c6166i6) {
        this.a = interfaceC5835h80;
        this.d = c6166i6;
        this.b = 1.0f / activity.getResources().getDisplayMetrics().density;
    }

    public final void a() {
        if (this.o) {
            return;
        }
        this.o = true;
        WebContents b = b();
        SelectionPopupControllerImpl k = b != null ? SelectionPopupControllerImpl.k(b) : null;
        if (k != null) {
            k.e();
        }
        this.f = 0;
        this.e = null;
        this.h = false;
        this.p = false;
        this.q = false;
        this.r = false;
        this.o = false;
    }

    public final boolean d(String str) {
        WebContents b = b();
        SelectionPopupControllerImpl k = b != null ? SelectionPopupControllerImpl.k(b) : null;
        return str.length() <= 1000 && this.c.matcher(str).find() && (k == null || !k.v);
    }

    public final void c(int i, String str) {
        Q70 q70;
        boolean d = d(str);
        float f = this.l;
        ContextualSearchManager contextualSearchManager = (ContextualSearchManager) this.a;
        if (contextualSearchManager.k() || str.isEmpty()) {
            return;
        }
        if (d && (q70 = contextualSearchManager.v) != null) {
            q70.k0(f);
            if (!contextualSearchManager.v.a()) {
                contextualSearchManager.v.n().getClass();
            }
            if (contextualSearchManager.j()) {
                contextualSearchManager.v.H(str);
                contextualSearchManager.O = false;
            }
            C9263r70 c9263r70 = contextualSearchManager.u;
            if (i == 2) {
                c9263r70.a(2);
                return;
            } else {
                if (i == 3) {
                    c9263r70.a(15);
                    return;
                }
                return;
            }
        }
        contextualSearchManager.i(5);
    }

    public final WebContents b() {
        Tab tab = (Tab) this.d.get();
        if (tab == null) {
            return null;
        }
        return tab.b();
    }
}
