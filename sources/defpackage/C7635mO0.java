package defpackage;

import android.os.Parcel;
import android.util.Log;
import com.google.firebase.appindexing.internal.CallStatus;
import com.google.firebase.appindexing.internal.MutateRequest;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: mO0 */
/* loaded from: classes.dex */
public final class C7635mO0 extends AbstractC5875hF3 {
    public final /* synthetic */ C7979nO0 d;

    @Override // defpackage.AbstractC5875hF3
    public final void b(InterfaceC3129Yc interfaceC3129Yc, C6905kF3 c6905kF3) {
        InterfaceC8040na1 interfaceC8040na1 = (InterfaceC8040na1) ((C9452rh) interfaceC3129Yc).m();
        BinderC7291lO0 binderC7291lO0 = new BinderC7291lO0(this, c6905kF3);
        MutateRequest mutateRequest = this.d.a;
        C7352la1 c7352la1 = (C7352la1) interfaceC8040na1;
        Parcel a = c7352la1.a();
        AbstractC11786yV.c(a, binderC7291lO0);
        AbstractC11786yV.b(a, mutateRequest);
        Parcel e = c7352la1.e(8, a);
        CallStatus callStatus = (CallStatus) AbstractC11786yV.a(e, CallStatus.CREATOR);
        e.recycle();
        int i = callStatus == null ? 2 : callStatus.a;
        C7979nO0 c7979nO0 = null;
        if (i == 3) {
            if (Log.isLoggable("FirebaseAppIndex", 4) ? true : Log.isLoggable("FirebaseAppIndex", 4)) {
                Log.i("FirebaseAppIndex", "Queue was full. API call will be retried.");
            }
            if (c6905kF3.d(null)) {
                synchronized (this.d.c.h) {
                    ExecutorC8323oO0 executorC8323oO0 = this.d.c;
                    if (executorC8323oO0.i == 0) {
                        c7979nO0 = (C7979nO0) executorC8323oO0.h.peek();
                    } else {
                        executorC8323oO0.i = 2;
                    }
                }
            }
        } else {
            if (i != 1) {
                String a2 = AbstractC9076qb1.a("API call failed. Status code: ", i);
                if (Log.isLoggable("FirebaseAppIndex", 6) ? true : Log.isLoggable("FirebaseAppIndex", 6)) {
                    Log.e("FirebaseAppIndex", a2);
                }
                if (c6905kF3.d(null)) {
                    this.d.b.a(new C9694sO0("Indexing error."));
                }
            }
            synchronized (this.d.c.h) {
                c7979nO0 = (C7979nO0) this.d.c.h.peek();
                this.d.c.i = 0;
            }
        }
        if (c7979nO0 != null) {
            c7979nO0.a();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7635mO0(C7979nO0 c7979nO0) {
        super(null, false, 9002);
        this.d = c7979nO0;
    }
}
