package defpackage;

import android.os.IBinder;
import android.os.IInterface;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class Du4 implements Gu4, IInterface {
    public final IBinder a;

    public Du4(IBinder iBinder) {
        this.a = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.a;
    }
}
