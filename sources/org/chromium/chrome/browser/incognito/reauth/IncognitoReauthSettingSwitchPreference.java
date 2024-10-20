package org.chromium.chrome.browser.incognito.reauth;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;
import defpackage.C1812Ny2;
import defpackage.Ge4;
import defpackage.ViewOnClickListenerC6381ik1;
import org.chromium.components.browser_ui.settings.ChromeSwitchPreference;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class IncognitoReauthSettingSwitchPreference extends ChromeSwitchPreference {
    public boolean e0;
    public Runnable f0;

    public IncognitoReauthSettingSwitchPreference(Context context) {
        super(context);
    }

    public IncognitoReauthSettingSwitchPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // org.chromium.components.browser_ui.settings.ChromeSwitchPreference, defpackage.AbstractC2693Us3, androidx.preference.Preference
    public final void v(C1812Ny2 c1812Ny2) {
        super.v(c1812Ny2);
        Ge4.g(c1812Ny2.a, this.e0);
        if (this.e0) {
            return;
        }
        TextView textView = (TextView) c1812Ny2.v(R.id.summary);
        textView.setEnabled(true);
        textView.setOnClickListener(new ViewOnClickListenerC6381ik1(this));
    }

    @Override // org.chromium.components.browser_ui.settings.ChromeSwitchPreference, androidx.preference.g, androidx.preference.Preference
    public final void w() {
        if (this.e0) {
            super.w();
        }
    }
}
