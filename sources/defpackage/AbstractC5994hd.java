package defpackage;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: hd */
/* loaded from: classes.dex */
public abstract class AbstractC5994hd {
    public final int a;

    public abstract void b(Status status);

    public abstract void c(RuntimeException runtimeException);

    public abstract void d(C4425d21 c4425d21);

    public abstract void e(V30 v30, boolean z);

    public AbstractC5994hd(int i) {
        this.a = i;
    }

    public static Status a(RemoteException remoteException) {
        return new Status(19, remoteException.getClass().getSimpleName() + ": " + remoteException.getLocalizedMessage(), 0);
    }
}
