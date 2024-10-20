package defpackage;

import android.content.DialogInterface;
import android.os.SystemClock;
import com.android.chrome.R;
import org.chromium.chrome.browser.profiles.Profile;
import org.chromium.chrome.browser.site_settings.ManageSpaceActivity;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class JK1 implements DialogInterface.OnClickListener {
    public final /* synthetic */ ManageSpaceActivity a;

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        ManageSpaceActivity manageSpaceActivity = this.a;
        manageSpaceActivity.D = null;
        EI2.h(0, 3, "Android.ManageSpace.ActionTaken");
        manageSpaceActivity.z.setText(R.string.0_resource_name_obfuscated_res_0x7f140a93);
        manageSpaceActivity.y.setText(R.string.0_resource_name_obfuscated_res_0x7f140a93);
        manageSpaceActivity.A.setEnabled(false);
        manageSpaceActivity.B.setEnabled(false);
        MK1 mk1 = new MK1(manageSpaceActivity);
        Profile d = Profile.d();
        mk1.b = SystemClock.elapsedRealtime();
        new Oo4(d, true).c(C7034ke3.c(d, 22), mk1);
    }

    public JK1(ManageSpaceActivity manageSpaceActivity) {
        this.a = manageSpaceActivity;
    }
}
