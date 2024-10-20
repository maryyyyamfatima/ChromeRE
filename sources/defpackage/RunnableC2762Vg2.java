package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import org.chromium.chrome.browser.settings.SettingsActivity;
import org.chromium.components.browser_ui.site_settings.SingleCategorySettings;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Vg2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class RunnableC2762Vg2 implements Runnable {
    public final /* synthetic */ AbstractC2242Rg2 a;

    public /* synthetic */ RunnableC2762Vg2(AbstractC2242Rg2 abstractC2242Rg2) {
        this.a = abstractC2242Rg2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        WO wo = (WO) this.a;
        wo.getClass();
        Bundle bundle = new Bundle();
        bundle.putString("category", C7034ke3.m(8));
        Context context = wo.j;
        bundle.putString("title", context.getResources().getString(N50.c(C7034ke3.b(8)).b));
        String name = SingleCategorySettings.class.getName();
        Intent a = AbstractC7459ls0.a(context, SettingsActivity.class);
        if (!(context instanceof Activity)) {
            a.addFlags(268435456);
            a.addFlags(67108864);
        }
        a.putExtra("show_fragment", name);
        a.putExtra("show_fragment_args", bundle);
        C7432ln3 c = C7432ln3.c();
        try {
            context.startActivity(a);
            c.close();
        } catch (Throwable th) {
            try {
                c.close();
            } catch (Throwable unused) {
            }
            throw th;
        }
    }
}
