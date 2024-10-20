package org.chromium.components.media_router;

import J.N;
import defpackage.AbstractC1015Hv;
import defpackage.C11415xP1;
import defpackage.C6614jQ1;
import defpackage.CH;
import defpackage.DialogInterfaceOnCancelListenerC7423lm0;
import defpackage.NM2;
import defpackage.RP1;
import defpackage.UR1;
import org.chromium.content_public.browser.WebContents;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public class BrowserMediaRouterDialogController {
    public final long a;
    public AbstractC1015Hv b;
    public final WebContents c;

    public static BrowserMediaRouterDialogController create(long j, WebContents webContents) {
        return new BrowserMediaRouterDialogController(j, webContents);
    }

    public void openRouteChooserDialog(String[] strArr) {
        if (isShowingDialog()) {
            return;
        }
        UR1 ur1 = null;
        for (String str : strArr) {
            CH e = CH.e(str);
            ur1 = e == null ? NM2.d(str) : e;
            if (ur1 != null) {
                break;
            }
        }
        C6614jQ1 b = ur1 != null ? ur1.b() : null;
        if (b != null) {
            C11415xP1 c11415xP1 = new C11415xP1(ur1.c(), b, this);
            this.b = c11415xP1;
            c11415xP1.a();
            return;
        }
        N.MY1J7b0i(this.a, this);
    }

    public void openRouteControllerDialog(String str, String str2) {
        if (isShowingDialog()) {
            return;
        }
        UR1 e = CH.e(str);
        if (e == null) {
            e = NM2.d(str);
        }
        C6614jQ1 b = e == null ? null : e.b();
        if (b != null) {
            RP1 rp1 = new RP1(e.c(), b, str2, this);
            this.b = rp1;
            rp1.a();
            return;
        }
        N.MY1J7b0i(this.a, this);
    }

    public void closeDialog() {
        if (isShowingDialog()) {
            AbstractC1015Hv abstractC1015Hv = this.b;
            DialogInterfaceOnCancelListenerC7423lm0 dialogInterfaceOnCancelListenerC7423lm0 = abstractC1015Hv.e;
            if (dialogInterfaceOnCancelListenerC7423lm0 != null) {
                dialogInterfaceOnCancelListenerC7423lm0.L0(false, false);
                abstractC1015Hv.e = null;
            }
            this.b = null;
        }
    }

    public boolean isShowingDialog() {
        AbstractC1015Hv abstractC1015Hv = this.b;
        if (abstractC1015Hv == null) {
            return false;
        }
        DialogInterfaceOnCancelListenerC7423lm0 dialogInterfaceOnCancelListenerC7423lm0 = abstractC1015Hv.e;
        return dialogInterfaceOnCancelListenerC7423lm0 != null && dialogInterfaceOnCancelListenerC7423lm0.b0();
    }

    public final void a() {
        if (this.b == null) {
            return;
        }
        this.b = null;
        N.MsJMWxq0(this.a, this);
    }

    public BrowserMediaRouterDialogController(long j, WebContents webContents) {
        this.a = j;
        this.c = webContents;
    }
}
