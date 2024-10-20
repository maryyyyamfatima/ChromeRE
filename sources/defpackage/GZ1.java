package defpackage;

import android.os.IInterface;
import android.os.RemoteCallbackList;
import androidx.room.MultiInstanceInvalidationService;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class GZ1 extends RemoteCallbackList {
    public final /* synthetic */ MultiInstanceInvalidationService a;

    public GZ1(MultiInstanceInvalidationService multiInstanceInvalidationService) {
        this.a = multiInstanceInvalidationService;
    }

    @Override // android.os.RemoteCallbackList
    public final void onCallbackDied(IInterface iInterface, Object obj) {
        AbstractC0087Ar1.e((InterfaceC0927Hd1) iInterface, "callback");
        AbstractC0087Ar1.e(obj, "cookie");
        this.a.g.remove((Integer) obj);
    }
}
