package defpackage;

import android.os.SystemClock;
import java.util.Collection;
import java.util.Iterator;
import org.chromium.chrome.browser.profiles.Profile;
import org.chromium.chrome.browser.site_settings.ManageSpaceActivity;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class MK1 implements No4, InterfaceC6065ho4 {
    public int a;
    public long b;
    public final /* synthetic */ ManageSpaceActivity c;

    public MK1(ManageSpaceActivity manageSpaceActivity) {
        this.c = manageSpaceActivity;
    }

    @Override // defpackage.InterfaceC6065ho4
    public final void b() {
        int i = this.a - 1;
        this.a = i;
        if (i <= 0) {
            EI2.n(SystemClock.elapsedRealtime() - this.b, "Android.ManageSpace.ClearUnimportantTime");
            ManageSpaceActivity manageSpaceActivity = this.c;
            manageSpaceActivity.A.setEnabled(true);
            manageSpaceActivity.B.setEnabled(true);
        }
    }

    @Override // defpackage.No4
    public final void a(Collection collection) {
        Iterator it = collection.iterator();
        long j = 0;
        while (it.hasNext()) {
            C6408io4 c6408io4 = (C6408io4) it.next();
            C4498dF1 c4498dF1 = c6408io4.j;
            if (c4498dF1 == null || !c4498dF1.h) {
                this.a++;
                c6408io4.a(Profile.d(), this);
            } else {
                j += c6408io4.h();
            }
        }
        if (this.a == 0) {
            b();
        }
        ManageSpaceActivity.n0(this.c, j, 0L);
    }
}
