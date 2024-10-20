package org.chromium.chrome.browser.privacy_sandbox;

import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.StyleSpan;
import android.view.Menu;
import android.view.MenuInflater;
import android.widget.TextView;
import com.android.chrome.R;
import defpackage.AbstractC0123Ay2;
import defpackage.AbstractC9108qg3;
import defpackage.C8765pg3;
import defpackage.L53;
import org.chromium.components.browser_ui.settings.LongSummaryTextMessagePreference;
import org.chromium.ui.widget.ChromeBulletSpan;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class LearnMoreFragment extends AbstractC0123Ay2 {
    @Override // defpackage.AbstractC0123Ay2
    public final void O0(String str, Bundle bundle) {
        getActivity().setTitle(R.string.f83420_resource_name_obfuscated_res_0x7f1408e7);
        L53.a(this, R.xml.f114030_resource_name_obfuscated_res_0x7f180022);
        LongSummaryTextMessagePreference longSummaryTextMessagePreference = (LongSummaryTextMessagePreference) M0("topics_description");
        longSummaryTextMessagePreference.Z = null;
        TextView textView = longSummaryTextMessagePreference.Y;
        if (textView != null) {
            textView.setMovementMethod(null);
        }
        longSummaryTextMessagePreference.P(TextUtils.concat(R0(R.string.f83390_resource_name_obfuscated_res_0x7f1408e4), "\n\n", R0(R.string.f83400_resource_name_obfuscated_res_0x7f1408e5), "\n\n", R0(R.string.f83410_resource_name_obfuscated_res_0x7f1408e6)));
        LongSummaryTextMessagePreference longSummaryTextMessagePreference2 = (LongSummaryTextMessagePreference) M0("fledge_description");
        longSummaryTextMessagePreference2.Z = null;
        TextView textView2 = longSummaryTextMessagePreference2.Y;
        if (textView2 != null) {
            textView2.setMovementMethod(null);
        }
        longSummaryTextMessagePreference2.P(TextUtils.concat(R0(R.string.f83360_resource_name_obfuscated_res_0x7f1408e1), "\n\n", R0(R.string.f83370_resource_name_obfuscated_res_0x7f1408e2), "\n\n", R0(R.string.f83380_resource_name_obfuscated_res_0x7f1408e3)));
        F0();
    }

    public final SpannableString R0(int i) {
        SpannableString a = AbstractC9108qg3.a(K().getString(i), new C8765pg3(new StyleSpan(1), "<b>", "</b>"));
        a.setSpan(new ChromeBulletSpan(K()), 0, a.length(), 0);
        return a;
    }

    @Override // androidx.fragment.app.c
    public final void h0(Menu menu, MenuInflater menuInflater) {
        menu.clear();
    }
}
