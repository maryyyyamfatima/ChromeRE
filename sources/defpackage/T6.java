package defpackage;

import org.chromium.base.Callback;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final /* synthetic */ class T6 implements Callback {
    public final /* synthetic */ String a;

    @Override // org.chromium.base.Callback
    public final ZE e0(Object obj) {
        return new ZE(this, obj);
    }

    @Override // org.chromium.base.Callback
    public final void onResult(Object obj) {
        R6 r6 = (R6) obj;
        int i = r6.c;
        int i2 = 4;
        if (i != 2) {
            if (i == 3) {
                i2 = 5;
            } else if (i != 4) {
                if (i == 5) {
                    int i3 = r6.d;
                    if (i3 == 2) {
                        i2 = 1;
                    } else if (i3 == 3) {
                        i2 = 2;
                    } else if (i3 == 4) {
                        i2 = 3;
                    }
                }
                i2 = 0;
            } else {
                i2 = 6;
            }
        }
        EI2.h(i2, 7, this.a);
    }
}
