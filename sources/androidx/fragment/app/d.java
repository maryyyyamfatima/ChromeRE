package androidx.fragment.app;

import android.util.Log;
import defpackage.NT0;
import defpackage.S5;
import java.util.ArrayList;
import java.util.Map;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class d implements S5 {
    public final /* synthetic */ h a;

    public d(h hVar) {
        this.a = hVar;
    }

    @Override // defpackage.S5
    public final void a(Object obj) {
        Map map = (Map) obj;
        ArrayList arrayList = new ArrayList(map.values());
        int[] iArr = new int[arrayList.size()];
        for (int i = 0; i < arrayList.size(); i++) {
            iArr[i] = ((Boolean) arrayList.get(i)).booleanValue() ? 0 : -1;
        }
        h hVar = this.a;
        FragmentManager$LaunchedFragmentInfo fragmentManager$LaunchedFragmentInfo = (FragmentManager$LaunchedFragmentInfo) hVar.D.pollFirst();
        if (fragmentManager$LaunchedFragmentInfo == null) {
            Log.w("FragmentManager", "No permissions were requested for " + this);
            return;
        }
        NT0 nt0 = hVar.c;
        String str = fragmentManager$LaunchedFragmentInfo.a;
        if (nt0.c(str) == null) {
            Log.w("FragmentManager", "Permission request result delivered for unknown Fragment " + str);
        }
    }
}
