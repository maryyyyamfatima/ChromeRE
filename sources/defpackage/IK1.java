package defpackage;

import com.android.chrome.R;
import org.chromium.chrome.browser.profiles.Profile;
import org.chromium.chrome.browser.site_settings.ManageSpaceActivity;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class IK1 extends AbstractC4815eA0 {
    public final /* synthetic */ ManageSpaceActivity a;

    @Override // defpackage.AbstractC4815eA0, defpackage.LC
    public final void Q(Exception exc) {
        ManageSpaceActivity manageSpaceActivity = this.a;
        manageSpaceActivity.z.setText(R.string.0_resource_name_obfuscated_res_0x7f140a99);
        manageSpaceActivity.y.setText(R.string.0_resource_name_obfuscated_res_0x7f140a99);
    }

    public IK1(ManageSpaceActivity manageSpaceActivity) {
        this.a = manageSpaceActivity;
    }

    @Override // defpackage.AbstractC4815eA0, defpackage.LC
    public final void l() {
        ManageSpaceActivity manageSpaceActivity = this.a;
        manageSpaceActivity.E = true;
        manageSpaceActivity.B.setEnabled(true);
        manageSpaceActivity.A.setEnabled(true);
        FI2.a("Android.ManageSpace");
        Profile d = Profile.d();
        new Oo4(d, false).c(C7034ke3.c(d, 22), new LK1(manageSpaceActivity));
    }
}
