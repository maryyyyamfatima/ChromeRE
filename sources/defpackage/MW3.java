package defpackage;

import org.chromium.chrome.browser.infobar.TranslateCompactInfoBar;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class MW3 implements InterfaceC0679Ff3 {
    public final int a;
    public final /* synthetic */ TranslateCompactInfoBar g;

    @Override // defpackage.InterfaceC0679Ff3
    public final void a(Object obj) {
        TranslateCompactInfoBar translateCompactInfoBar = this.g;
        translateCompactInfoBar.z = null;
        translateCompactInfoBar.w(this.a);
    }

    @Override // defpackage.InterfaceC0679Ff3
    public final void b(Object obj) {
        TranslateCompactInfoBar translateCompactInfoBar = this.g;
        translateCompactInfoBar.z = null;
        int i = this.a;
        if (i == 0) {
            TranslateCompactInfoBar.y(16);
            return;
        }
        if (i == 1) {
            TranslateCompactInfoBar.y(17);
            return;
        }
        if (i == 2) {
            TranslateCompactInfoBar.y(18);
            return;
        }
        if (i == 3) {
            TranslateCompactInfoBar.y(23);
        } else {
            if (i != 4) {
                return;
            }
            TranslateCompactInfoBar.y(24);
            translateCompactInfoBar.u(false);
        }
    }

    public MW3(TranslateCompactInfoBar translateCompactInfoBar, int i) {
        this.g = translateCompactInfoBar;
        this.a = i;
    }
}
