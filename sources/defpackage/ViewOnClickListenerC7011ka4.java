package defpackage;

import android.content.Intent;
import android.net.Uri;
import android.view.View;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: ka4 */
/* loaded from: classes.dex */
public final class ViewOnClickListenerC7011ka4 implements View.OnClickListener {
    public final /* synthetic */ C7355la4 a;

    public ViewOnClickListenerC7011ka4(C7355la4 c7355la4) {
        this.a = c7355la4;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C7355la4 c7355la4 = this.a;
        C7017kb4 c7017kb4 = c7355la4.c0.k;
        if (c7017kb4 == null) {
            c7017kb4 = C7017kb4.r;
        }
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(c7017kb4.o));
        c7355la4.L0(12);
        c7355la4.J0(intent);
    }
}
