package defpackage;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import org.chromium.base.ThreadUtils;
import org.chromium.chrome.browser.usage_stats.idl.ParcelableWellbeingResponse;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: dg1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractBinderC4639dg1 extends Binder implements IInterface {
    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    public AbstractBinderC4639dg1() {
        attachInterface(this, "org.chromium.chrome.browser.usage_stats.idl.IWellbeingCallback");
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i >= 1 && i <= 16777215) {
            parcel.enforceInterface("org.chromium.chrome.browser.usage_stats.idl.IWellbeingCallback");
        }
        if (i == 1598968902) {
            parcel2.writeString("org.chromium.chrome.browser.usage_stats.idl.IWellbeingCallback");
            return true;
        }
        if (i == 1) {
            final ParcelableWellbeingResponse parcelableWellbeingResponse = (ParcelableWellbeingResponse) (parcel.readInt() != 0 ? ParcelableWellbeingResponse.CREATOR.createFromParcel(parcel) : null);
            final BinderC0716Fn0 binderC0716Fn0 = (BinderC0716Fn0) this;
            ThreadUtils.e(new Runnable() { // from class: En0
                @Override // java.lang.Runnable
                public final void run() {
                    BinderC0716Fn0 binderC0716Fn02 = BinderC0716Fn0.this;
                    binderC0716Fn02.getClass();
                    ParcelableWellbeingResponse parcelableWellbeingResponse2 = parcelableWellbeingResponse;
                    parcelableWellbeingResponse2.getClass();
                    binderC0716Fn02.a.b((Wo4) parcelableWellbeingResponse2.a.b(Wo4.j));
                }
            });
            return true;
        }
        return super.onTransact(i, parcel, parcel2, i2);
    }
}
