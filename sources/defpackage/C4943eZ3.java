package defpackage;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.chromium.chrome.browser.browserservices.verification.OriginVerifier;
import org.chromium.chrome.browser.tab.Tab;
import org.chromium.content_public.browser.WebContents;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: eZ3 */
/* loaded from: classes.dex */
public final class C4943eZ3 implements B84, InterfaceC0186Bl0 {
    public final PC a;
    public final OriginVerifier g;
    public HashSet h;
    public boolean i;
    public final HashSet j = new HashSet();

    public C4943eZ3(I5 i5, PC pc, C1582Me2 c1582Me2, C4620dd0 c4620dd0, FU fu, C4502dG0 c4502dG0) {
        this.a = pc;
        Tab tab = c4620dd0.b;
        WebContents b = tab != null ? tab.b() : null;
        String str = fu.a;
        c1582Me2.getClass();
        A84 a84 = A84.a;
        this.g = new OriginVerifier(str, 2, b, c4502dG0);
        i5.b(this);
    }

    @Override // defpackage.InterfaceC0186Bl0
    public final void onDestroy() {
        this.i = true;
    }

    @Override // defpackage.B84
    public final MC2 h(String str) {
        boolean z;
        final C1193Je2 b = C1193Je2.b(str);
        if (b == null) {
            return MC2.c(Boolean.FALSE);
        }
        final MC2 mc2 = new MC2();
        boolean contains = ((HashSet) j()).contains(b);
        OriginVerifier originVerifier = this.g;
        if (contains) {
            originVerifier.b(new InterfaceC1323Ke2() { // from class: dZ3
                @Override // defpackage.InterfaceC1323Ke2
                public final void a(String str2, C1193Je2 c1193Je2, boolean z2, Boolean bool) {
                    C4943eZ3 c4943eZ3 = C4943eZ3.this;
                    if (c4943eZ3.i) {
                        return;
                    }
                    HashSet hashSet = (HashSet) c4943eZ3.j();
                    C1193Je2 c1193Je22 = b;
                    hashSet.remove(c1193Je22);
                    if (z2) {
                        c4943eZ3.j.add(c1193Je22);
                    }
                    mc2.b(Boolean.valueOf(z2));
                }
            }, b);
        } else {
            originVerifier.getClass();
            Set set = A84.b;
            String str2 = originVerifier.a;
            int i = originVerifier.c;
            if (!set.contains(A84.b(str2, b, i))) {
                if (!A84.a().contains(str2 + "," + b + "," + i + "," + originVerifier.b)) {
                    z = false;
                    mc2.b(Boolean.valueOf(z));
                }
            }
            z = true;
            mc2.b(Boolean.valueOf(z));
        }
        return mc2;
    }

    @Override // defpackage.B84
    public final String a(String str) {
        C1193Je2 b = C1193Je2.b(str);
        if (b == null) {
            return null;
        }
        return b.toString();
    }

    @Override // defpackage.B84
    public final boolean b(String str) {
        C1193Je2 b = C1193Je2.b(str);
        if (b == null) {
            return false;
        }
        return ((HashSet) j()).contains(b) || this.j.contains(b);
    }

    @Override // defpackage.B84
    public final boolean d(String str) {
        C1193Je2 b = C1193Je2.b(str);
        if (b == null) {
            return false;
        }
        OriginVerifier originVerifier = this.g;
        originVerifier.getClass();
        Set set = A84.b;
        String str2 = originVerifier.a;
        int i = originVerifier.c;
        if (!set.contains(A84.b(str2, b, i))) {
            if (!A84.a().contains(str2 + "," + b + "," + i + "," + originVerifier.b)) {
                return false;
            }
        }
        return true;
    }

    public final Set j() {
        if (this.h == null) {
            this.h = new HashSet();
            PC pc = this.a;
            C1193Je2 b = C1193Je2.b(pc.D());
            if (b != null) {
                this.h.add(b);
            }
            List z = pc.z();
            if (z != null) {
                Iterator it = z.iterator();
                while (it.hasNext()) {
                    C1193Je2 b2 = C1193Je2.b((String) it.next());
                    if (b2 != null) {
                        this.h.add(b2);
                    }
                }
            }
        }
        return this.h;
    }
}
