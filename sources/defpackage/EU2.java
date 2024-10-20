package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.safetynet.SafeBrowsingData;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class EU2 extends AbstractBinderC11621y0 {
    public final /* synthetic */ FU2 a;

    public EU2(FU2 fu2) {
        this.a = fu2;
    }

    @Override // defpackage.AbstractBinderC11621y0, defpackage.InterfaceC4633df1
    public final void D(Status status, SafeBrowsingData safeBrowsingData) {
        this.a.a(new GU2(status, safeBrowsingData));
    }
}
