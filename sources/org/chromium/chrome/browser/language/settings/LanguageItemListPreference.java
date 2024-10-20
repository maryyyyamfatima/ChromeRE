package org.chromium.chrome.browser.language.settings;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import defpackage.C10230tw1;
import defpackage.InterfaceC11945yw1;
import defpackage.InterfaceC8184ny2;
import java.util.ArrayList;
import org.chromium.components.browser_ui.settings.ChromeBasePreference;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class LanguageItemListPreference extends ChromeBasePreference implements InterfaceC8184ny2 {
    public InterfaceC11945yw1 Y;

    public LanguageItemListPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // defpackage.InterfaceC8184ny2
    public final void c() {
        X();
    }

    public final void X() {
        String join;
        if (this.Y == null) {
            join = null;
        } else {
            ArrayList arrayList = new ArrayList();
            int i = 0;
            for (C10230tw1 c10230tw1 : this.Y.b()) {
                i++;
                if (i > 3) {
                    break;
                } else {
                    arrayList.add(c10230tw1.b);
                }
            }
            join = TextUtils.join(", ", arrayList);
        }
        if (join == null) {
            return;
        }
        P(join);
    }
}
