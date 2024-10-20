package defpackage;

import android.transition.AutoTransition;
import android.transition.TransitionManager;
import android.util.Pair;
import com.android.chrome.R;
import org.chromium.chrome.browser.signin.services.FREMobileIdentityConsistencyFieldTrial;
import org.chromium.chrome.browser.ui.signin.fre.SigninFirstRunView;
import org.chromium.ui.modelutil.PropertyModel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: db3 */
/* loaded from: classes2.dex */
public abstract class AbstractC4611db3 {
    public static void a(SigninFirstRunView signinFirstRunView, PropertyModel propertyModel) {
        Pair pair;
        boolean j = propertyModel.j(AbstractC4267cb3.h);
        if (j) {
            signinFirstRunView.getClass();
            int a = FREMobileIdentityConsistencyFieldTrial.a();
            if (a == 0) {
                pair = new Pair(Integer.valueOf(R.string.0_resource_name_obfuscated_res_0x7f1404c6), 0);
            } else if (a == 1) {
                pair = new Pair(Integer.valueOf(R.string.0_resource_name_obfuscated_res_0x7f1404c6), Integer.valueOf(R.string.0_resource_name_obfuscated_res_0x7f140a62));
            } else if (a == 2) {
                pair = new Pair(Integer.valueOf(R.string.0_resource_name_obfuscated_res_0x7f1404c6), Integer.valueOf(R.string.0_resource_name_obfuscated_res_0x7f140a63));
            } else if (a == 3) {
                pair = new Pair(Integer.valueOf(R.string.0_resource_name_obfuscated_res_0x7f1404c6), Integer.valueOf(R.string.0_resource_name_obfuscated_res_0x7f140a64));
            } else if (a == 4) {
                pair = new Pair(Integer.valueOf(R.string.0_resource_name_obfuscated_res_0x7f140a65), 0);
            } else if (a == 5) {
                pair = new Pair(Integer.valueOf(R.string.0_resource_name_obfuscated_res_0x7f140a66), 0);
            } else {
                pair = new Pair(Integer.valueOf(R.string.0_resource_name_obfuscated_res_0x7f1404c6), 0);
            }
            signinFirstRunView.a.setText(((Integer) pair.first).intValue());
            signinFirstRunView.a.setVisibility(0);
            if (((Integer) pair.second).intValue() != 0) {
                signinFirstRunView.g.setText(((Integer) pair.second).intValue());
                signinFirstRunView.g.setVisibility(0);
            }
        }
        LD2 ld2 = AbstractC4267cb3.j;
        int i = (j && propertyModel.i(AbstractC4267cb3.b) != null && propertyModel.j(ld2)) ? 0 : 8;
        signinFirstRunView.j.setVisibility(i);
        boolean j2 = propertyModel.j(AbstractC4267cb3.c);
        signinFirstRunView.k.setVisibility((i == 0 && j2) ? 4 : 0);
        signinFirstRunView.m.setVisibility((j && propertyModel.j(ld2) && !j2) ? 0 : 8);
        int i2 = j ? 0 : 8;
        signinFirstRunView.l.setVisibility(i2);
        signinFirstRunView.n.setVisibility(i2);
    }

    public static void b(SigninFirstRunView signinFirstRunView, boolean z, boolean z2) {
        if (z) {
            TransitionManager.beginDelayedTransition(signinFirstRunView, new AutoTransition().setStartDelay(300L).setDuration(300L));
        }
        int i = z ? 4 : 0;
        signinFirstRunView.j.setVisibility(i);
        signinFirstRunView.m.setVisibility(i);
        signinFirstRunView.l.setVisibility(i);
        signinFirstRunView.n.setVisibility(i);
        signinFirstRunView.o.setVisibility(z ? 0 : 8);
        signinFirstRunView.p.setVisibility(z2 ? 0 : 8);
    }
}
