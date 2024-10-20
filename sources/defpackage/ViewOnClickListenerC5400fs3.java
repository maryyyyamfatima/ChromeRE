package defpackage;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.view.View;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: fs3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class ViewOnClickListenerC5400fs3 implements View.OnClickListener {
    public final /* synthetic */ Context a;
    public final /* synthetic */ C5744gs3 g;

    public ViewOnClickListenerC5400fs3(C5744gs3 c5744gs3, Context context) {
        this.g = c5744gs3;
        this.a = context;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Intent intent = new Intent("org.chromium.chrome.browser.usage_stats.action.SHOW_WEBSITE_DETAILS");
        intent.setFlags(268435456);
        intent.putExtra("org.chromium.chrome.browser.usage_stats.extra.FULLY_QUALIFIED_DOMAIN_NAME", this.g.i);
        intent.putExtra("android.intent.extra.PACKAGE_NAME", V60.a.getPackageName());
        try {
            this.a.startActivity(intent);
        } catch (ActivityNotFoundException e) {
            AbstractC4851eH1.a("SuspendedTab", "No activity found for site details intent", e);
        }
    }
}
