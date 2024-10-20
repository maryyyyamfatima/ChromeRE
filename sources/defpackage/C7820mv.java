package defpackage;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: mv */
/* loaded from: classes.dex */
public final class C7820mv extends AbstractC5414fv {
    public final /* synthetic */ BaseGmsClient g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7820mv(BaseGmsClient baseGmsClient, int i) {
        super(baseGmsClient, i, null);
        this.g = baseGmsClient;
    }

    @Override // defpackage.AbstractC5414fv
    public final void b(ConnectionResult connectionResult) {
        BaseGmsClient baseGmsClient = this.g;
        baseGmsClient.getClass();
        baseGmsClient.o.a(connectionResult);
        baseGmsClient.s(connectionResult);
    }

    @Override // defpackage.AbstractC5414fv
    public final boolean c() {
        this.g.o.a(ConnectionResult.j);
        return true;
    }
}
