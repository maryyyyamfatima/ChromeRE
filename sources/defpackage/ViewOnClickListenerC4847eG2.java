package defpackage;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.view.View;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: eG2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewOnClickListenerC4847eG2 implements View.OnClickListener {
    public final /* synthetic */ C5191fG2 a;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C5191fG2 c5191fG2 = this.a;
        String packageName = c5191fG2.a.getPackageName();
        c5191fG2.getClass();
        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.setData(new Uri.Builder().scheme("package").opaquePart(packageName).build());
        ((Activity) c5191fG2.a).startActivity(intent);
    }

    public ViewOnClickListenerC4847eG2(C5191fG2 c5191fG2) {
        this.a = c5191fG2;
    }
}
