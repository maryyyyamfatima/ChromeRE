package defpackage;

import java.util.Collection;
import java.util.Iterator;
import org.chromium.chrome.browser.site_settings.ManageSpaceActivity;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class LK1 implements No4 {
    public final /* synthetic */ ManageSpaceActivity a;

    public LK1(ManageSpaceActivity manageSpaceActivity) {
        this.a = manageSpaceActivity;
    }

    @Override // defpackage.No4
    public final void a(Collection collection) {
        Iterator it = collection.iterator();
        long j = 0;
        long j2 = 0;
        while (it.hasNext()) {
            C6408io4 c6408io4 = (C6408io4) it.next();
            j += c6408io4.h();
            C4498dF1 c4498dF1 = c6408io4.j;
            if (c4498dF1 != null && c4498dF1.h) {
                j2 = c6408io4.h() + j2;
            }
        }
        ManageSpaceActivity.n0(this.a, j, j - j2);
    }
}
