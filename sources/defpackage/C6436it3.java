package defpackage;

import J.N;
import android.content.Context;
import android.view.View;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Iterator;
import org.chromium.base.Callback;
import org.chromium.base.ThreadUtils;
import org.chromium.chrome.browser.profiles.Profile;
import org.chromium.chrome.browser.ui.signin.SyncConsentFragmentBase;
import org.chromium.components.signin.base.AccountInfo;
import org.chromium.components.signin.base.CoreAccountId;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: it3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class C6436it3 implements Callback {
    public final /* synthetic */ SyncConsentFragmentBase a;
    public final /* synthetic */ View g;
    public final /* synthetic */ boolean h;

    public /* synthetic */ C6436it3(SyncConsentFragmentBase syncConsentFragmentBase, View view, boolean z) {
        this.a = syncConsentFragmentBase;
        this.g = view;
        this.h = z;
    }

    @Override // org.chromium.base.Callback
    public final ZE e0(Object obj) {
        return new ZE(this, obj);
    }

    @Override // org.chromium.base.Callback
    public final void onResult(Object obj) {
        int i;
        SyncConsentFragmentBase syncConsentFragmentBase = this.a;
        C8903q40 c8903q40 = syncConsentFragmentBase.e0;
        CoreAccountId id = ((AccountInfo) obj).getId();
        TextView textView = (TextView) this.g;
        View[] viewArr = {syncConsentFragmentBase.d0};
        int i2 = ((C8560p40) c8903q40.b.get(textView)).a;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        C8903q40.a(viewArr[0], arrayList2);
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            View view = (View) it.next();
            if ((view instanceof TextView) && (i = ((C8560p40) c8903q40.b.get((TextView) view)).a) != 0) {
                arrayList.add(Integer.valueOf(i));
            }
        }
        Object obj2 = ThreadUtils.a;
        if (C8217o40.a == null) {
            C8217o40.a = new C8217o40();
        }
        C8217o40 c8217o40 = C8217o40.a;
        c8217o40.getClass();
        int[] iArr = new int[arrayList.size()];
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            iArr[i3] = ((Integer) arrayList.get(i3)).intValue();
        }
        N.MswahTi8(c8217o40, Profile.d(), id, 0, iArr, i2);
        if (syncConsentFragmentBase.a0()) {
            Context B0 = syncConsentFragmentBase.B0();
            syncConsentFragmentBase.J();
            syncConsentFragmentBase.o0 = new C9925t30(new C11640y30(B0, syncConsentFragmentBase.n0), R44.a(Profile.d()).c("google.services.last_username"), syncConsentFragmentBase.g0, new C8843pt3(syncConsentFragmentBase, this.h));
        }
    }
}
