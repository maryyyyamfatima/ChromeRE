package androidx.fragment.app;

import android.util.Log;
import androidx.activity.result.ActivityResult;
import defpackage.NT0;
import defpackage.S5;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class f implements S5 {
    public final /* synthetic */ h a;

    public f(h hVar) {
        this.a = hVar;
    }

    @Override // defpackage.S5
    public final void a(Object obj) {
        ActivityResult activityResult = (ActivityResult) obj;
        h hVar = this.a;
        FragmentManager$LaunchedFragmentInfo fragmentManager$LaunchedFragmentInfo = (FragmentManager$LaunchedFragmentInfo) hVar.D.pollFirst();
        if (fragmentManager$LaunchedFragmentInfo == null) {
            Log.w("FragmentManager", "No IntentSenders were started for " + this);
            return;
        }
        NT0 nt0 = hVar.c;
        String str = fragmentManager$LaunchedFragmentInfo.a;
        c c = nt0.c(str);
        if (c != null) {
            c.d0(fragmentManager$LaunchedFragmentInfo.g, activityResult.a, activityResult.g);
        } else {
            Log.w("FragmentManager", "Intent Sender result delivered for unknown Fragment " + str);
        }
    }
}
