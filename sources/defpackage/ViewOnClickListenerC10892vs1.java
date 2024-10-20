package defpackage;

import android.view.View;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: vs1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class ViewOnClickListenerC10892vs1 implements View.OnClickListener {
    public final /* synthetic */ C12264zs1 a;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C1875Ol0 c1875Ol0;
        C12264zs1 c12264zs1 = this.a;
        InterfaceC11921ys1 interfaceC11921ys1 = c12264zs1.d;
        C1745Nl0 c1745Nl0 = c12264zs1.k;
        int i = c1745Nl0.j;
        interfaceC11921ys1.a((i == -1 || (c1875Ol0 = (C1875Ol0) c1745Nl0.getItem(i)) == null) ? "" : c1875Ol0.a);
        c12264zs1.c.setOnDismissListener(null);
        c12264zs1.c.dismiss();
    }

    public ViewOnClickListenerC10892vs1(C12264zs1 c12264zs1) {
        this.a = c12264zs1;
    }
}
