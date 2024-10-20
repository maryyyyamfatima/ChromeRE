package defpackage;

import android.os.Bundle;
import android.os.Parcel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class ZX3 {
    public final /* synthetic */ C7688mY3 a;

    public ZX3(C7688mY3 c7688mY3) {
        this.a = c7688mY3;
    }

    public final boolean a(String str) {
        C7688mY3 c7688mY3 = this.a;
        c7688mY3.getClass();
        Bundle bundle = new Bundle();
        bundle.putString("android.support.customtabs.trusted.CHANNEL_NAME", str);
        C1067If1 c1067If1 = (C1067If1) c7688mY3.a;
        c1067If1.getClass();
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("android.support.customtabs.trusted.ITrustedWebActivityService");
            AbstractC1327Kf1.b(obtain, bundle);
            c1067If1.a.transact(6, obtain, obtain2, 0);
            obtain2.readException();
            Bundle bundle2 = (Bundle) AbstractC1327Kf1.a(obtain2, Bundle.CREATOR);
            obtain2.recycle();
            obtain.recycle();
            if (bundle2.containsKey("android.support.customtabs.trusted.NOTIFICATION_SUCCESS")) {
                return bundle2.getBoolean("android.support.customtabs.trusted.NOTIFICATION_SUCCESS");
            }
            throw new IllegalArgumentException("Bundle must contain android.support.customtabs.trusted.NOTIFICATION_SUCCESS");
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            throw th;
        }
    }

    public final Bundle b(String str, Bundle bundle, IX3 ix3) {
        C7688mY3 c7688mY3 = this.a;
        c7688mY3.getClass();
        BinderC7344lY3 binderC7344lY3 = ix3 == null ? null : new BinderC7344lY3(ix3);
        BinderC7344lY3 binderC7344lY32 = binderC7344lY3 != null ? binderC7344lY3 : null;
        C1067If1 c1067If1 = (C1067If1) c7688mY3.a;
        c1067If1.getClass();
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("android.support.customtabs.trusted.ITrustedWebActivityService");
            obtain.writeString(str);
            AbstractC1327Kf1.b(obtain, bundle);
            obtain.writeStrongBinder(binderC7344lY32);
            c1067If1.a.transact(9, obtain, obtain2, 0);
            obtain2.readException();
            return (Bundle) AbstractC1327Kf1.a(obtain2, Bundle.CREATOR);
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }
}
