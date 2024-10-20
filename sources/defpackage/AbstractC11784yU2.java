package defpackage;

import android.content.Context;
import android.widget.TextView;
import com.android.chrome.R;
import org.chromium.chrome.browser.safety_check.SafetyCheckSettingsFragment;
import org.chromium.ui.modelutil.PropertyModel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: yU2 */
/* loaded from: classes.dex */
public abstract class AbstractC11784yU2 {
    public static void a(PropertyModel propertyModel, SafetyCheckSettingsFragment safetyCheckSettingsFragment) {
        String quantityString;
        ED2 ed2 = (ED2) propertyModel.b.get(AbstractC10412uU2.i);
        long j = ed2 == null ? 0L : ed2.a;
        long currentTimeMillis = System.currentTimeMillis();
        TextView textView = safetyCheckSettingsFragment.k0;
        Context K = safetyCheckSettingsFragment.K();
        if (j == 0) {
            quantityString = "";
        } else {
            long j2 = currentTimeMillis - j;
            if (j2 < 60000) {
                quantityString = K.getString(R.string.0_resource_name_obfuscated_res_0x7f140996);
            } else if (j2 < 3600000) {
                int i = (int) (j2 / 60000);
                quantityString = K.getResources().getQuantityString(R.plurals.0_resource_name_obfuscated_res_0x7f120034, i, Integer.valueOf(i));
            } else if (j2 < 86400000) {
                int i2 = (int) (j2 / 3600000);
                quantityString = K.getResources().getQuantityString(R.plurals.0_resource_name_obfuscated_res_0x7f120033, i2, Integer.valueOf(i2));
            } else if (j2 < 172800000) {
                quantityString = K.getString(R.string.0_resource_name_obfuscated_res_0x7f140997);
            } else {
                int i3 = (int) (j2 / 86400000);
                quantityString = K.getResources().getQuantityString(R.plurals.0_resource_name_obfuscated_res_0x7f120032, i3, Integer.valueOf(i3));
            }
        }
        textView.setText(quantityString);
    }
}
