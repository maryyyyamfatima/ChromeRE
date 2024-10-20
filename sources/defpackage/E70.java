package defpackage;

import J.N;
import android.text.TextUtils;
import java.util.regex.Pattern;
import org.chromium.chrome.browser.contextualsearch.ContextualSearchContext;
import org.chromium.chrome.browser.contextualsearch.ContextualSearchManager;
import org.chromium.content.browser.selection.SelectionPopupControllerImpl;
import org.chromium.content_public.browser.WebContents;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class E70 implements InterfaceC6152i33 {
    public final /* synthetic */ ContextualSearchManager a;

    @Override // defpackage.InterfaceC6152i33
    public final /* synthetic */ InterfaceC7870n33 b() {
        return null;
    }

    @Override // defpackage.InterfaceC6152i33
    public final boolean d(boolean z) {
        return false;
    }

    @Override // defpackage.InterfaceC6152i33
    public final void e() {
    }

    @Override // defpackage.InterfaceC6152i33
    public final void a(int i, float f, float f2) {
        String str;
        C5491g80 c5491g80 = this.a.r;
        boolean z = true;
        if (i != 0) {
            if (i == 2) {
                c5491g80.q = false;
                c5491g80.r = false;
                ((ContextualSearchManager) c5491g80.a).h();
                c5491g80.f = 0;
                c5491g80.e = null;
                c5491g80.h = false;
                c5491g80.p = false;
                c5491g80.q = false;
                c5491g80.r = false;
                c5491g80.i = null;
                c5491g80.m = 0L;
                c5491g80.j = false;
            } else if (i == 3) {
                c5491g80.r = true;
            } else if (i == 4) {
                c5491g80.r = false;
                c5491g80.p = true;
                String str2 = c5491g80.e;
                Pattern pattern = AbstractC8584p80.a;
                if (!TextUtils.isEmpty(str2)) {
                    if (!AbstractC8584p80.a.matcher(str2.trim()).find()) {
                        FI2.a("ContextualSearch.ManualRefineSingleWord");
                    } else {
                        FI2.a("ContextualSearch.ManualRefineMultiWord");
                    }
                }
            }
            z = false;
        } else {
            c5491g80.q = true;
            c5491g80.r = false;
            c5491g80.h = false;
            c5491g80.f = 3;
            WebContents b = c5491g80.b();
            SelectionPopupControllerImpl k = b != null ? SelectionPopupControllerImpl.k(b) : null;
            if (k != null) {
                c5491g80.e = k.A;
            }
            c5491g80.p = false;
            Pattern pattern2 = AbstractC8584p80.a;
            FI2.a("ContextualSearch.SelectionEstablished");
        }
        c5491g80.k = f;
        c5491g80.l = f2;
        if (!z || (str = c5491g80.e) == null) {
            return;
        }
        c5491g80.c(c5491g80.f, str);
    }

    @Override // defpackage.InterfaceC6152i33
    public final void c(C8551p23 c8551p23) {
        int i;
        int i2;
        ContextualSearchManager contextualSearchManager = this.a;
        int i3 = contextualSearchManager.S;
        if (i3 > 0) {
            contextualSearchManager.S = i3 - 1;
        }
        if (contextualSearchManager.S <= 0) {
            C9263r70 c9263r70 = contextualSearchManager.u;
            if (c9263r70.d == 11) {
                if (c8551p23 == null) {
                    contextualSearchManager.i(0);
                    return;
                }
                ContextualSearchContext contextualSearchContext = contextualSearchManager.I;
                int i4 = contextualSearchContext.d;
                int i5 = c8551p23.a;
                contextualSearchContext.d = i4 + i5;
                int i6 = contextualSearchContext.e;
                int i7 = c8551p23.b;
                contextualSearchContext.e = i6 + i7;
                N.M2pdefbB(contextualSearchContext.getNativePointer(), contextualSearchContext, i5, i7);
                contextualSearchContext.a();
                ContextualSearchContext contextualSearchContext2 = contextualSearchManager.I;
                String substring = (TextUtils.isEmpty(contextualSearchContext2.c) || (i = contextualSearchContext2.e) < (i2 = contextualSearchContext2.d) || i2 < 0 || i > contextualSearchContext2.c.length()) ? "" : contextualSearchContext2.c.substring(contextualSearchContext2.d, contextualSearchContext2.e);
                boolean isEmpty = TextUtils.isEmpty(substring);
                C5491g80 c5491g80 = contextualSearchManager.r;
                if (!isEmpty) {
                    c5491g80.e = substring;
                }
                String str = c5491g80.e;
                if (contextualSearchManager.j()) {
                    contextualSearchManager.v.H(str);
                    contextualSearchManager.O = false;
                }
                c9263r70.b(11);
            }
        }
    }

    @Override // defpackage.InterfaceC6152i33
    public final void f(String str) {
        ContextualSearchManager contextualSearchManager = this.a;
        if (contextualSearchManager.v != null) {
            C5491g80 c5491g80 = contextualSearchManager.r;
            if (c5491g80.j) {
                c5491g80.e = str;
                c5491g80.j = false;
            } else {
                boolean isEmpty = TextUtils.isEmpty(str);
                InterfaceC5835h80 interfaceC5835h80 = c5491g80.a;
                if (isEmpty && !TextUtils.isEmpty(c5491g80.e)) {
                    c5491g80.e = str;
                    ((ContextualSearchManager) interfaceC5835h80).u.a(4);
                    if (c5491g80.f == 1) {
                        c5491g80.f = 0;
                        c5491g80.e = null;
                        c5491g80.h = false;
                        c5491g80.p = false;
                        c5491g80.q = false;
                        c5491g80.r = false;
                    }
                }
                c5491g80.e = str;
                if (c5491g80.h) {
                    c5491g80.c(c5491g80.f, str);
                    c5491g80.h = false;
                } else if (c5491g80.r) {
                    boolean d = c5491g80.d(str);
                    ContextualSearchManager contextualSearchManager2 = (ContextualSearchManager) interfaceC5835h80;
                    if (!contextualSearchManager2.k() && contextualSearchManager2.j()) {
                        if (d) {
                            contextualSearchManager2.v.H(str);
                            contextualSearchManager2.v.A();
                            if (contextualSearchManager2.L != null) {
                                contextualSearchManager2.L = new C4803e80(str, contextualSearchManager2.t.g());
                            }
                            contextualSearchManager2.O = false;
                        } else {
                            contextualSearchManager2.i(5);
                        }
                    }
                } else {
                    c5491g80.c(c5491g80.f, str);
                }
                c5491g80.g = c5491g80.f;
            }
            contextualSearchManager.v.o0(true);
        }
    }

    public E70(ContextualSearchManager contextualSearchManager) {
        this.a = contextualSearchManager;
    }
}
