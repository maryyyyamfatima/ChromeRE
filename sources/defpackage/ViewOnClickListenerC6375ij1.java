package defpackage;

import J.N;
import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import com.android.chrome.R;
import org.chromium.chrome.browser.settings.SettingsActivity;
import org.chromium.chrome.browser.site_settings.CookieControlsServiceBridge;
import org.chromium.components.browser_ui.site_settings.SingleCategorySettings;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: ij1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewOnClickListenerC6375ij1 implements CompoundButton.OnCheckedChangeListener, View.OnClickListener {
    public CookieControlsServiceBridge a;
    public boolean h;
    public boolean i;
    public boolean k;
    public final C12157za2 g = new C12157za2();
    public int j = 0;
    public int l = 0;

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        C7928nE c7928nE = UN.a;
        boolean z2 = true;
        if (!N.M09VlOh_("IncognitoNtpRevamp") ? compoundButton.getId() != R.id.cookie_controls_card_toggle : compoundButton.getId() != R.id.revamped_cookie_controls_card_toggle) {
            z2 = false;
        }
        if (z == this.i || !z2) {
            return;
        }
        N.MIu6BVKt(this.a.a, z);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (view.getId() == R.id.cookie_controls_card_managed_icon) {
            Bundle bundle = new Bundle();
            bundle.putString("category", C7034ke3.m(8));
            Context context = view.getContext();
            String name = SingleCategorySettings.class.getName();
            Intent a = AbstractC7459ls0.a(context, SettingsActivity.class);
            if (!(context instanceof Activity)) {
                a.addFlags(268435456);
                a.addFlags(67108864);
            }
            a.putExtra("show_fragment", name);
            a.putExtra("show_fragment_args", bundle);
            ComponentName componentName = AbstractC2281Ro1.a;
            try {
                context.startActivity(a, null);
            } catch (ActivityNotFoundException unused) {
            }
        }
    }
}
