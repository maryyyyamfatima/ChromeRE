package org.chromium.components.browser_ui.settings;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;
import defpackage.C1812Ny2;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public class LongSummaryTextMessagePreference extends TextMessagePreference {
    public LongSummaryTextMessagePreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // org.chromium.components.browser_ui.settings.TextMessagePreference, org.chromium.components.browser_ui.settings.ChromeBasePreference, androidx.preference.Preference
    public final void v(C1812Ny2 c1812Ny2) {
        super.v(c1812Ny2);
        ((TextView) c1812Ny2.v(R.id.summary)).setMaxLines(100);
    }
}
