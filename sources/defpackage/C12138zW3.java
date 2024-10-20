package defpackage;

import android.content.Context;
import android.view.OrientationEventListener;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: zW3, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C12138zW3 extends OrientationEventListener {
    public final /* synthetic */ CW3 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12138zW3(CW3 cw3, Context context) {
        super(context);
        this.a = cw3;
    }

    @Override // android.view.OrientationEventListener
    public final void onOrientationChanged(int i) {
        CW3 cw3 = this.a;
        cw3.a = i;
        if (cw3.h) {
            if (!(Math.abs(i + (-270)) < 5)) {
                Math.abs(i - 90);
                return;
            } else {
                cw3.a(false);
                return;
            }
        }
        cw3.b();
    }
}
