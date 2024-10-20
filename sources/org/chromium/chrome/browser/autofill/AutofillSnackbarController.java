package org.chromium.chrome.browser.autofill;

import J.N;
import defpackage.AbstractC1329Kf3;
import defpackage.C12188zf3;
import defpackage.InterfaceC0679Ff3;
import defpackage.ViewOnClickListenerC1069If3;
import org.chromium.ui.base.WindowAndroid;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class AutofillSnackbarController implements InterfaceC0679Ff3 {
    public final long a;
    public final ViewOnClickListenerC1069If3 g;

    public AutofillSnackbarController(long j, ViewOnClickListenerC1069If3 viewOnClickListenerC1069If3) {
        this.a = j;
        this.g = viewOnClickListenerC1069If3;
    }

    public static AutofillSnackbarController create(long j, WindowAndroid windowAndroid) {
        return new AutofillSnackbarController(j, AbstractC1329Kf3.a(windowAndroid));
    }

    public void show(String str, String str2) {
        C12188zf3 a = C12188zf3.a(str, this, 0, 44);
        a.d = str2;
        a.e = null;
        a.i = false;
        a.j = 10000;
        this.g.c(a);
    }

    public void dismiss() {
        this.g.a(this);
    }

    @Override // defpackage.InterfaceC0679Ff3
    public final void b(Object obj) {
        N.MoSp9aMr(this.a);
    }

    @Override // defpackage.InterfaceC0679Ff3
    public final void a(Object obj) {
        N.M$TZFnb$(this.a);
    }
}
