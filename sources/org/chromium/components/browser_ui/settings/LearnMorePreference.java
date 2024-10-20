package org.chromium.components.browser_ui.settings;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import androidx.preference.Preference;
import com.android.chrome.R;
import defpackage.AbstractC9771sd;
import defpackage.C1812Ny2;
import org.chromium.components.browser_ui.settings.LearnMorePreference;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public class LearnMorePreference extends Preference {
    public LearnMorePreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Q(R.string.f76160_resource_name_obfuscated_res_0x7f1405af);
        M();
        N();
    }

    @Override // androidx.preference.Preference
    public final void v(C1812Ny2 c1812Ny2) {
        super.v(c1812Ny2);
        TextView textView = (TextView) c1812Ny2.v(android.R.id.title);
        AbstractC9771sd.i(R.style.f102570_resource_name_obfuscated_res_0x7f15043e, textView);
        textView.setClickable(true);
        textView.setOnClickListener(new View.OnClickListener() { // from class: lz1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LearnMorePreference learnMorePreference = LearnMorePreference.this;
                learnMorePreference.k.p(learnMorePreference);
            }
        });
    }
}
