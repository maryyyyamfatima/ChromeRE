package org.chromium.chrome.browser.about_settings;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.preference.Preference;
import defpackage.JG2;
import defpackage.V60;
import org.chromium.chrome.browser.customtabs.CustomTabActivity;
import org.chromium.ui.base.LocalizationUtils;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class HyperlinkPreference extends Preference {
    public final int T;

    public HyperlinkPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, JG2.a0, 0, 0);
        this.T = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.recycle();
        N();
    }

    @Override // androidx.preference.Preference
    public final void w() {
        Context context = this.a;
        CustomTabActivity.W1(V60.a(context), LocalizationUtils.a(context.getString(this.T)));
    }
}
