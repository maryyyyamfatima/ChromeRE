package org.chromium.webapk.lib.runtime_library;

import android.app.Notification;
import android.app.PendingIntent;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: chromium-webapk8.dex */
/* loaded from: assets/webapk8.dex */
public interface IWebApkApi extends IInterface {
    public static final String DESCRIPTOR = "org.chromium.webapk.lib.runtime_library.IWebApkApi";

    /* compiled from: chromium-webapk8.dex */
    /* loaded from: assets/webapk8.dex */
    public class Default implements IWebApkApi {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // org.chromium.webapk.lib.runtime_library.IWebApkApi
        public void cancelNotification(String str, int i) {
        }

        @Override // org.chromium.webapk.lib.runtime_library.IWebApkApi
        public int checkNotificationPermission() {
            return 0;
        }

        @Override // org.chromium.webapk.lib.runtime_library.IWebApkApi
        public boolean finishAndRemoveTaskSdk23() {
            return false;
        }

        @Override // org.chromium.webapk.lib.runtime_library.IWebApkApi
        public int getSmallIconId() {
            return 0;
        }

        @Override // org.chromium.webapk.lib.runtime_library.IWebApkApi
        public boolean notificationPermissionEnabled() {
            return false;
        }

        @Override // org.chromium.webapk.lib.runtime_library.IWebApkApi
        public void notifyNotification(String str, int i, Notification notification) {
        }

        @Override // org.chromium.webapk.lib.runtime_library.IWebApkApi
        public void notifyNotificationWithChannel(String str, int i, Notification notification, String str2) {
        }

        @Override // org.chromium.webapk.lib.runtime_library.IWebApkApi
        public PendingIntent requestNotificationPermission(String str, String str2) {
            return null;
        }
    }

    void cancelNotification(String str, int i);

    int checkNotificationPermission();

    boolean finishAndRemoveTaskSdk23();

    int getSmallIconId();

    boolean notificationPermissionEnabled();

    void notifyNotification(String str, int i, Notification notification);

    void notifyNotificationWithChannel(String str, int i, Notification notification, String str2);

    PendingIntent requestNotificationPermission(String str, String str2);

    /* compiled from: chromium-webapk8.dex */
    /* loaded from: assets/webapk8.dex */
    public abstract class Stub extends Binder implements IWebApkApi {
        static final int TRANSACTION_cancelNotification = 3;
        static final int TRANSACTION_checkNotificationPermission = 7;
        static final int TRANSACTION_finishAndRemoveTaskSdk23 = 6;
        static final int TRANSACTION_getSmallIconId = 1;
        static final int TRANSACTION_notificationPermissionEnabled = 4;
        static final int TRANSACTION_notifyNotification = 2;
        static final int TRANSACTION_notifyNotificationWithChannel = 5;
        static final int TRANSACTION_requestNotificationPermission = 8;

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        public Stub() {
            attachInterface(this, IWebApkApi.DESCRIPTOR);
        }

        public static IWebApkApi asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(IWebApkApi.DESCRIPTOR);
            if (queryLocalInterface != null && (queryLocalInterface instanceof IWebApkApi)) {
                return (IWebApkApi) queryLocalInterface;
            }
            return new Proxy(iBinder);
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i >= TRANSACTION_getSmallIconId && i <= 16777215) {
                parcel.enforceInterface(IWebApkApi.DESCRIPTOR);
            }
            if (i == 1598968902) {
                parcel2.writeString(IWebApkApi.DESCRIPTOR);
                return true;
            }
            switch (i) {
                case TRANSACTION_getSmallIconId /* 1 */:
                    int smallIconId = getSmallIconId();
                    parcel2.writeNoException();
                    parcel2.writeInt(smallIconId);
                    return true;
                case TRANSACTION_notifyNotification /* 2 */:
                    notifyNotification(parcel.readString(), parcel.readInt(), (Notification) _Parcel.readTypedObject(parcel, Notification.CREATOR));
                    parcel2.writeNoException();
                    return true;
                case 3:
                    cancelNotification(parcel.readString(), parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case TRANSACTION_notificationPermissionEnabled /* 4 */:
                    boolean notificationPermissionEnabled = notificationPermissionEnabled();
                    parcel2.writeNoException();
                    parcel2.writeInt(notificationPermissionEnabled ? 1 : 0);
                    return true;
                case 5:
                    notifyNotificationWithChannel(parcel.readString(), parcel.readInt(), (Notification) _Parcel.readTypedObject(parcel, Notification.CREATOR), parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case TRANSACTION_finishAndRemoveTaskSdk23 /* 6 */:
                    boolean finishAndRemoveTaskSdk23 = finishAndRemoveTaskSdk23();
                    parcel2.writeNoException();
                    parcel2.writeInt(finishAndRemoveTaskSdk23 ? 1 : 0);
                    return true;
                case TRANSACTION_checkNotificationPermission /* 7 */:
                    int checkNotificationPermission = checkNotificationPermission();
                    parcel2.writeNoException();
                    parcel2.writeInt(checkNotificationPermission);
                    return true;
                case TRANSACTION_requestNotificationPermission /* 8 */:
                    PendingIntent requestNotificationPermission = requestNotificationPermission(parcel.readString(), parcel.readString());
                    parcel2.writeNoException();
                    _Parcel.writeTypedObject(parcel2, requestNotificationPermission, TRANSACTION_getSmallIconId);
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }

        /* compiled from: chromium-webapk8.dex */
        /* loaded from: assets/webapk8.dex */
        class Proxy implements IWebApkApi {
            private IBinder mRemote;

            public String getInterfaceDescriptor() {
                return IWebApkApi.DESCRIPTOR;
            }

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            @Override // org.chromium.webapk.lib.runtime_library.IWebApkApi
            public int getSmallIconId() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IWebApkApi.DESCRIPTOR);
                    this.mRemote.transact(Stub.TRANSACTION_getSmallIconId, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // org.chromium.webapk.lib.runtime_library.IWebApkApi
            public void notifyNotification(String str, int i, Notification notification) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IWebApkApi.DESCRIPTOR);
                    obtain.writeString(str);
                    obtain.writeInt(i);
                    _Parcel.writeTypedObject(obtain, notification, 0);
                    this.mRemote.transact(Stub.TRANSACTION_notifyNotification, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // org.chromium.webapk.lib.runtime_library.IWebApkApi
            public void cancelNotification(String str, int i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IWebApkApi.DESCRIPTOR);
                    obtain.writeString(str);
                    obtain.writeInt(i);
                    this.mRemote.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // org.chromium.webapk.lib.runtime_library.IWebApkApi
            public boolean notificationPermissionEnabled() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IWebApkApi.DESCRIPTOR);
                    this.mRemote.transact(Stub.TRANSACTION_notificationPermissionEnabled, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // org.chromium.webapk.lib.runtime_library.IWebApkApi
            public void notifyNotificationWithChannel(String str, int i, Notification notification, String str2) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IWebApkApi.DESCRIPTOR);
                    obtain.writeString(str);
                    obtain.writeInt(i);
                    _Parcel.writeTypedObject(obtain, notification, 0);
                    obtain.writeString(str2);
                    this.mRemote.transact(5, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // org.chromium.webapk.lib.runtime_library.IWebApkApi
            public boolean finishAndRemoveTaskSdk23() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IWebApkApi.DESCRIPTOR);
                    this.mRemote.transact(Stub.TRANSACTION_finishAndRemoveTaskSdk23, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // org.chromium.webapk.lib.runtime_library.IWebApkApi
            public int checkNotificationPermission() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IWebApkApi.DESCRIPTOR);
                    this.mRemote.transact(Stub.TRANSACTION_checkNotificationPermission, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // org.chromium.webapk.lib.runtime_library.IWebApkApi
            public PendingIntent requestNotificationPermission(String str, String str2) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IWebApkApi.DESCRIPTOR);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    this.mRemote.transact(Stub.TRANSACTION_requestNotificationPermission, obtain, obtain2, 0);
                    obtain2.readException();
                    return (PendingIntent) _Parcel.readTypedObject(obtain2, PendingIntent.CREATOR);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }
    }

    /* compiled from: chromium-webapk8.dex */
    /* loaded from: assets/webapk8.dex */
    public class _Parcel {
        /* JADX INFO: Access modifiers changed from: private */
        public static Object readTypedObject(Parcel parcel, Parcelable.Creator creator) {
            if (parcel.readInt() != 0) {
                return creator.createFromParcel(parcel);
            }
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void writeTypedObject(Parcel parcel, Parcelable parcelable, int i) {
            if (parcelable != null) {
                parcel.writeInt(1);
                parcelable.writeToParcel(parcel, i);
            } else {
                parcel.writeInt(0);
            }
        }
    }
}
