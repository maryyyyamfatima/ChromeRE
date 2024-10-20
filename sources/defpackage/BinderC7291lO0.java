package defpackage;

import com.google.android.gms.common.api.Status;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: lO0 */
/* loaded from: classes.dex */
public final class BinderC7291lO0 extends AbstractBinderC0417Df1 {
    public final /* synthetic */ C6905kF3 a;
    public final /* synthetic */ C7635mO0 g;

    public BinderC7291lO0(C7635mO0 c7635mO0, C6905kF3 c6905kF3) {
        this.g = c7635mO0;
        this.a = c6905kF3;
    }

    @Override // defpackage.InterfaceC0547Ef1
    public final void b(Status status) {
        if (this.a.d(null)) {
            boolean r1 = status.r1();
            C7635mO0 c7635mO0 = this.g;
            if (r1) {
                c7635mO0.d.b.b(null);
            } else {
                c7635mO0.d.b.a(B74.a(status, "Indexing error, please try again."));
            }
        }
    }
}
