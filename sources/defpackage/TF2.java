package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.View;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class TF2 implements View.OnClickListener {
    public final /* synthetic */ Context a;
    public final /* synthetic */ UF2 g;

    public TF2(UF2 uf2, Activity activity) {
        this.g = uf2;
        this.a = activity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Context context = this.a;
        String packageName = context.getPackageName();
        this.g.getClass();
        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.setData(new Uri.Builder().scheme("package").opaquePart(packageName).build());
        ((Activity) context).startActivity(intent);
    }
}
