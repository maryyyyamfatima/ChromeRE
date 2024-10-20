package defpackage;

import android.content.Context;
import android.media.MediaRouter;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: uu3 */
/* loaded from: classes.dex */
public final class C10563uu3 extends C0104Au3 {
    public C10563uu3(Context context, C11420xQ1 c11420xQ1) {
        super(context, c11420xQ1);
    }

    @Override // defpackage.C0104Au3, defpackage.AbstractC12278zu3, defpackage.AbstractC11935yu3
    public final void o(C11249wu3 c11249wu3, SP1 sp1) {
        int deviceType;
        super.o(c11249wu3, sp1);
        deviceType = ((MediaRouter.RouteInfo) c11249wu3.a).getDeviceType();
        sp1.a.putInt("deviceType", deviceType);
    }
}
