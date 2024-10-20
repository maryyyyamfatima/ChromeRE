package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.style.ClickableSpan;
import android.view.View;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: ok2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8445ok2 extends ClickableSpan {
    public final /* synthetic */ Context a;

    public C8445ok2(Activity activity) {
        this.a = activity;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("https://www.google.com/settings/chrome/sync"));
        intent.setPackage(V60.a.getPackageName());
        AbstractC2281Ro1.x(intent, null);
        this.a.startActivity(intent);
    }
}
