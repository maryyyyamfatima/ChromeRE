package defpackage;

import android.media.MediaRouter;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: vu3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10906vu3 extends AbstractC4896eQ1 {
    public final Object a;

    @Override // defpackage.AbstractC4896eQ1
    public final void f(int i) {
        ((MediaRouter.RouteInfo) this.a).requestSetVolume(i);
    }

    @Override // defpackage.AbstractC4896eQ1
    public final void i(int i) {
        ((MediaRouter.RouteInfo) this.a).requestUpdateVolume(i);
    }

    public C10906vu3(Object obj) {
        this.a = obj;
    }
}
