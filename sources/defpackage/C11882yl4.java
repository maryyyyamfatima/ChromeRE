package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;
import org.chromium.chrome.browser.night_mode.settings.ThemeSettingsFragment;
import org.chromium.components.browser_ui.settings.SettingsLauncher;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: yl4, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11882yl4 extends ClickableSpan {
    public final Context a;
    public final SettingsLauncher g;

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("theme_settings_entry", 2);
        this.g.b(this.a, ThemeSettingsFragment.class, bundle);
    }

    public C11882yl4(Context context, I53 i53) {
        this.a = context;
        this.g = i53;
    }
}
