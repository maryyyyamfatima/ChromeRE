package defpackage;

import android.content.Context;
import com.android.chrome.R;
import org.chromium.base.Callback;
import org.chromium.chrome.browser.toolbar.adaptive.settings.RadioButtonGroupAdaptiveToolbarPreference;
import org.chromium.components.browser_ui.widget.RadioButtonWithDescription;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final /* synthetic */ class KG2 implements Callback {
    public final /* synthetic */ RadioButtonGroupAdaptiveToolbarPreference a;

    @Override // org.chromium.base.Callback
    public final ZE e0(Object obj) {
        return new ZE(this, obj);
    }

    @Override // org.chromium.base.Callback
    public final void onResult(Object obj) {
        RadioButtonWithDescription radioButtonWithDescription;
        R6 r6 = (R6) obj;
        RadioButtonGroupAdaptiveToolbarPreference radioButtonGroupAdaptiveToolbarPreference = this.a;
        radioButtonGroupAdaptiveToolbarPreference.getClass();
        int i = r6.c;
        radioButtonGroupAdaptiveToolbarPreference.Y = i;
        if (i == 2) {
            radioButtonWithDescription = radioButtonGroupAdaptiveToolbarPreference.V;
        } else if (i == 3) {
            radioButtonWithDescription = radioButtonGroupAdaptiveToolbarPreference.W;
        } else if (i != 4) {
            radioButtonWithDescription = i != 5 ? null : radioButtonGroupAdaptiveToolbarPreference.U;
        } else {
            radioButtonWithDescription = radioButtonGroupAdaptiveToolbarPreference.X;
        }
        if (radioButtonWithDescription != null) {
            radioButtonWithDescription.f(true);
        }
        RadioButtonWithDescription radioButtonWithDescription2 = radioButtonGroupAdaptiveToolbarPreference.U;
        Object[] objArr = new Object[1];
        int i2 = r6.d;
        int i3 = i2 != 2 ? i2 != 3 ? i2 != 4 ? -1 : R.string.f67150_resource_name_obfuscated_res_0x7f1401be : R.string.f67140_resource_name_obfuscated_res_0x7f1401bd : R.string.f67130_resource_name_obfuscated_res_0x7f1401bc;
        Context context = radioButtonGroupAdaptiveToolbarPreference.a;
        objArr[0] = i3 == -1 ? "" : context.getString(i3);
        radioButtonWithDescription2.h(context.getString(R.string.f67120_resource_name_obfuscated_res_0x7f1401bb, objArr));
    }
}
