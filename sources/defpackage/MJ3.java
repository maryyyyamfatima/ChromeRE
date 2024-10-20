package defpackage;

import android.content.Intent;
import android.net.Uri;
import android.text.style.ClickableSpan;
import android.view.View;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class MJ3 extends ClickableSpan {
    public final /* synthetic */ String a;
    public final /* synthetic */ NJ3 g;

    public MJ3(NJ3 nj3, String str) {
        this.g = nj3;
        this.a = str;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        this.g.J0(new Intent("android.intent.action.VIEW", Uri.parse(this.a)));
    }
}
