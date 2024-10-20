package org.chromium.chrome.browser.language.settings;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import defpackage.C10230tw1;
import defpackage.C9549rx1;
import org.chromium.components.browser_ui.settings.ChromeBasePreference;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class LanguageItemPickerPreference extends ChromeBasePreference {
    public C10230tw1 Y;
    public boolean Z;

    public LanguageItemPickerPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public final void X(String str) {
        C10230tw1 c;
        if (TextUtils.equals(str, null)) {
            c = C10230tw1.a();
        } else {
            c = C9549rx1.b().c(str);
        }
        this.Y = c;
        Y();
    }

    public final void Y() {
        C10230tw1 c10230tw1 = this.Y;
        if (c10230tw1 == null) {
            return;
        }
        String str = c10230tw1.b;
        if (this.Z) {
            R(str);
            String str2 = this.Y.c;
            if (TextUtils.equals(str, str2)) {
                P("");
                return;
            } else {
                P(str2);
                return;
            }
        }
        P(str);
    }
}
