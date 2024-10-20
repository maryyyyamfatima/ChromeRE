package defpackage;

import android.content.Intent;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.googlehelp.GoogleHelp;
import java.lang.ref.WeakReference;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class U21 extends W21 {
    public final /* synthetic */ Intent q;
    public final /* synthetic */ WeakReference r;
    public final /* synthetic */ X21 s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public U21(X21 x21, C6144i21 c6144i21, Intent intent, WeakReference weakReference) {
        super(c6144i21);
        this.s = x21;
        this.q = intent;
        this.r = weakReference;
    }

    @Override // defpackage.W21
    public final void o(InterfaceC10796vc1 interfaceC10796vc1) {
        Intent intent = this.q;
        GoogleHelp googleHelp = (GoogleHelp) intent.getParcelableExtra("EXTRA_GOOGLE_HELP");
        googleHelp.getClass();
        try {
            X21 x21 = this.s;
            WeakReference weakReference = this.r;
            Status status = X21.a;
            x21.getClass();
            V21 v21 = new V21(intent, this, x21, weakReference);
            C10110tc1 c10110tc1 = (C10110tc1) interfaceC10796vc1;
            Parcel a = c10110tc1.a();
            AbstractC11786yV.b(a, googleHelp);
            AbstractC11786yV.b(a, null);
            AbstractC11786yV.c(a, v21);
            c10110tc1.h(2, a);
        } catch (RemoteException e) {
            Log.e("gH_GoogleHelpApiImpl", "Starting help failed!", e);
            f(X21.a);
        }
    }
}
