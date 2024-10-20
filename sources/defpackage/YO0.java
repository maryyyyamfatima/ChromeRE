package defpackage;

import android.app.Activity;
import android.os.Bundle;
import android.os.SystemClock;
import org.chromium.base.Callback;
import org.chromium.base.ThreadUtils;
import org.chromium.chrome.browser.firstrun.FirstRunActivity;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class YO0 extends AbstractC6952kP0 {
    public final /* synthetic */ FirstRunActivity f;

    @Override // defpackage.AbstractC6952kP0
    public final void e(Bundle bundle) {
        FirstRunActivity firstRunActivity = this.f;
        firstRunActivity.e0 = bundle;
        EI2.n(SystemClock.elapsedRealtime() - firstRunActivity.h0, "MobileFre.FromLaunch.ChildStatusAvailable");
        firstRunActivity.Y0();
        firstRunActivity.Z0(((Integer) firstRunActivity.j0.get(0)).intValue());
        final long elapsedRealtime = SystemClock.elapsedRealtime();
        EI2.n(elapsedRealtime - firstRunActivity.h0, "MobileFre.FromLaunch.FirstFragmentInflatedV2");
        Callback callback = new Callback() { // from class: XO0
            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj) {
                return new ZE(this, obj);
            }

            @Override // org.chromium.base.Callback
            public final void onResult(Object obj) {
                Long l = (Long) obj;
                long longValue = l.longValue();
                long j = elapsedRealtime;
                if (longValue > j) {
                    EI2.n(l.longValue() - j, "MobileFre.FragmentInflationSpeed.FasterThanAppRestriction");
                } else {
                    EI2.n(j - l.longValue(), "MobileFre.FragmentInflationSpeed.SlowerThanAppRestriction");
                }
            }
        };
        C5578gP0 c5578gP0 = firstRunActivity.U;
        c5578gP0.getClass();
        Object obj = ThreadUtils.a;
        if (c5578gP0.a) {
            callback.onResult(Long.valueOf(c5578gP0.c));
        } else {
            c5578gP0.e.add(callback);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public YO0(FirstRunActivity firstRunActivity, Activity activity, C8297oJ c8297oJ) {
        super(activity, c8297oJ);
        this.f = firstRunActivity;
    }
}
