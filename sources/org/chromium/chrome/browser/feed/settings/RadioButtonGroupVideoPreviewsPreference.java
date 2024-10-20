package org.chromium.chrome.browser.feed.settings;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.RadioGroup;
import androidx.preference.Preference;
import com.android.chrome.R;
import defpackage.C1812Ny2;
import defpackage.EI2;
import java.util.ArrayList;
import java.util.Collections;
import org.chromium.components.browser_ui.widget.RadioButtonWithDescription;
import org.chromium.components.browser_ui.widget.RadioButtonWithDescriptionLayout;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class RadioButtonGroupVideoPreviewsPreference extends Preference implements RadioGroup.OnCheckedChangeListener {
    public int T;
    public final ArrayList U;

    public RadioButtonGroupVideoPreviewsPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.K = R.layout.0_resource_name_obfuscated_res_0x7f0e0244;
        this.U = new ArrayList(Collections.nCopies(3, null));
    }

    @Override // androidx.preference.Preference
    public final void v(C1812Ny2 c1812Ny2) {
        super.v(c1812Ny2);
        ArrayList arrayList = this.U;
        arrayList.set(0, (RadioButtonWithDescription) c1812Ny2.v(R.id.video_previews_option_never_radio_button));
        arrayList.set(1, (RadioButtonWithDescription) c1812Ny2.v(R.id.video_previews_option_wifi_radio_button));
        arrayList.set(2, (RadioButtonWithDescription) c1812Ny2.v(R.id.video_previews_option_wifi_and_mobile_data_radio_button));
        RadioButtonWithDescription radioButtonWithDescription = (RadioButtonWithDescription) arrayList.get(this.T);
        radioButtonWithDescription.f(true);
        ((RadioButtonWithDescriptionLayout) radioButtonWithDescription.getParent()).g = this;
    }

    @Override // android.widget.RadioGroup.OnCheckedChangeListener
    public final void onCheckedChanged(RadioGroup radioGroup, int i) {
        int i2 = 0;
        while (true) {
            if (i2 >= 3) {
                break;
            }
            if (((RadioButtonWithDescription) this.U.get(i2)).e()) {
                this.T = i2;
                break;
            }
            i2++;
        }
        EI2.h(this.T, 3, "FeedVideoPreviewsPreferenceUserActions");
        f(Integer.valueOf(this.T));
    }
}
