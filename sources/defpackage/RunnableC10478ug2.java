package defpackage;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import org.chromium.chrome.browser.privacy_sandbox.AdPersonalizationFragment;
import org.chromium.chrome.browser.settings.SettingsActivity;
import org.chromium.components.page_info.PageInfoController;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: ug2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class RunnableC10478ug2 implements Runnable {
    public final /* synthetic */ C11164wg2 a;

    public /* synthetic */ RunnableC10478ug2(C11164wg2 c11164wg2) {
        this.a = c11164wg2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C11164wg2 c11164wg2 = this.a;
        ((PageInfoController) c11164wg2.h).g(31);
        WO wo = (WO) c11164wg2.a;
        wo.getClass();
        String name = AdPersonalizationFragment.class.getName();
        Intent intent = new Intent();
        Context context = wo.j;
        intent.setClass(context, SettingsActivity.class);
        if (!(context instanceof Activity)) {
            intent.addFlags(268435456);
            intent.addFlags(67108864);
        }
        intent.putExtra("show_fragment", name);
        ComponentName componentName = AbstractC2281Ro1.a;
        try {
            context.startActivity(intent, null);
        } catch (ActivityNotFoundException unused) {
        }
    }
}
