package defpackage;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import androidx.room.MultiInstanceInvalidationService;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class FZ1 extends Binder implements IInterface {
    public final /* synthetic */ MultiInstanceInvalidationService a;

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    public FZ1(MultiInstanceInvalidationService multiInstanceInvalidationService) {
        this.a = multiInstanceInvalidationService;
        attachInterface(this, "androidx.room.IMultiInstanceInvalidationService");
    }

    @Override // android.os.Binder
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i >= 1 && i <= 16777215) {
            parcel.enforceInterface("androidx.room.IMultiInstanceInvalidationService");
        }
        if (i == 1598968902) {
            parcel2.writeString("androidx.room.IMultiInstanceInvalidationService");
            return true;
        }
        int i3 = 0;
        Object obj = null;
        if (i == 1) {
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder != null) {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("androidx.room.IMultiInstanceInvalidationCallback");
                obj = (queryLocalInterface == null || !(queryLocalInterface instanceof InterfaceC0927Hd1)) ? new C0797Gd1(readStrongBinder) : (InterfaceC0927Hd1) queryLocalInterface;
            }
            String readString = parcel.readString();
            AbstractC0087Ar1.e(obj, "callback");
            if (readString != null) {
                MultiInstanceInvalidationService multiInstanceInvalidationService = this.a;
                synchronized (multiInstanceInvalidationService.h) {
                    int i4 = multiInstanceInvalidationService.a + 1;
                    multiInstanceInvalidationService.a = i4;
                    if (multiInstanceInvalidationService.h.register(obj, Integer.valueOf(i4))) {
                        multiInstanceInvalidationService.g.put(Integer.valueOf(i4), readString);
                        i3 = i4;
                    } else {
                        multiInstanceInvalidationService.a--;
                    }
                }
            }
            parcel2.writeNoException();
            parcel2.writeInt(i3);
        } else if (i == 2) {
            IBinder readStrongBinder2 = parcel.readStrongBinder();
            if (readStrongBinder2 != null) {
                IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("androidx.room.IMultiInstanceInvalidationCallback");
                obj = (queryLocalInterface2 == null || !(queryLocalInterface2 instanceof InterfaceC0927Hd1)) ? new C0797Gd1(readStrongBinder2) : (InterfaceC0927Hd1) queryLocalInterface2;
            }
            int readInt = parcel.readInt();
            AbstractC0087Ar1.e(obj, "callback");
            MultiInstanceInvalidationService multiInstanceInvalidationService2 = this.a;
            synchronized (multiInstanceInvalidationService2.h) {
                multiInstanceInvalidationService2.h.unregister(obj);
            }
            parcel2.writeNoException();
        } else {
            if (i != 3) {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            int readInt2 = parcel.readInt();
            String[] createStringArray = parcel.createStringArray();
            AbstractC0087Ar1.e(createStringArray, "tables");
            MultiInstanceInvalidationService multiInstanceInvalidationService3 = this.a;
            synchronized (multiInstanceInvalidationService3.h) {
                String str = (String) multiInstanceInvalidationService3.g.get(Integer.valueOf(readInt2));
                if (str == null) {
                    Log.w("ROOM", "Remote invalidation client ID not registered");
                } else {
                    int beginBroadcast = multiInstanceInvalidationService3.h.beginBroadcast();
                    while (i3 < beginBroadcast) {
                        try {
                            Object broadcastCookie = multiInstanceInvalidationService3.h.getBroadcastCookie(i3);
                            AbstractC0087Ar1.c(broadcastCookie, "null cannot be cast to non-null type kotlin.Int");
                            int intValue = ((Integer) broadcastCookie).intValue();
                            String str2 = (String) multiInstanceInvalidationService3.g.get(Integer.valueOf(intValue));
                            if (readInt2 != intValue && AbstractC0087Ar1.a(str, str2)) {
                                try {
                                    ((C0797Gd1) ((InterfaceC0927Hd1) multiInstanceInvalidationService3.h.getBroadcastItem(i3))).a(createStringArray);
                                } catch (RemoteException e) {
                                    Log.w("ROOM", "Error invoking a remote callback", e);
                                }
                            }
                            i3++;
                        } finally {
                            multiInstanceInvalidationService3.h.finishBroadcast();
                        }
                    }
                }
            }
        }
        return true;
    }
}
