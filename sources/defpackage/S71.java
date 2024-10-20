package defpackage;

import J.N;
import android.util.Pair;
import java.util.Map;
import org.chromium.base.SysUtils;
import org.chromium.chrome.browser.profiles.Profile;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class S71 implements InterfaceC12080zL0 {
    public final boolean a;

    @Override // defpackage.InterfaceC12080zL0
    public final /* synthetic */ Map d() {
        return null;
    }

    public S71(Profile profile) {
        this.a = profile.i();
    }

    @Override // defpackage.InterfaceC12080zL0
    public final Pair c() {
        if (this.a) {
            return null;
        }
        return Pair.create("histograms", N.MvO$oy3r((SysUtils.isLowEndDevice() || SysUtils.amountOfPhysicalMemoryKB() < 2097153 || SysUtils.isCurrentlyLowMemory()) ? 1 : 0));
    }
}
