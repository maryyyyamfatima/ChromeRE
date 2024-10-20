package defpackage;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import org.chromium.chrome.browser.contextualsearch.ContextualSearchPreferenceFragment;
import org.chromium.chrome.browser.settings.SettingsActivity;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: b80, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC3773b80 implements Runnable {
    public final /* synthetic */ C4116c80 a;

    @Override // java.lang.Runnable
    public final void run() {
        Context context = this.a.h;
        String name = ContextualSearchPreferenceFragment.class.getName();
        Intent a = AbstractC7459ls0.a(context, SettingsActivity.class);
        if (!(context instanceof Activity)) {
            a.addFlags(268435456);
            a.addFlags(67108864);
        }
        a.putExtra("show_fragment", name);
        ComponentName componentName = AbstractC2281Ro1.a;
        try {
            context.startActivity(a, null);
        } catch (ActivityNotFoundException unused) {
        }
    }

    public RunnableC3773b80(C4116c80 c4116c80) {
        this.a = c4116c80;
    }
}
