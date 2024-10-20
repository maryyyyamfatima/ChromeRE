package defpackage;

import android.app.Notification;
import android.os.Parcel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: f72, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5143f72 implements InterfaceC6517j72 {
    public final String a;
    public final int b;
    public final String c;
    public final Notification d;

    public C5143f72(int i, Notification notification, String str, String str2) {
        this.a = str;
        this.b = i;
        this.c = str2;
        this.d = notification;
    }

    public final void a(InterfaceC7376le1 interfaceC7376le1) {
        String str = this.a;
        int i = this.b;
        String str2 = this.c;
        C6688je1 c6688je1 = (C6688je1) interfaceC7376le1;
        c6688je1.getClass();
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("android.support.v4.app.INotificationSideChannel");
            obtain.writeString(str);
            obtain.writeInt(i);
            obtain.writeString(str2);
            Notification notification = this.d;
            if (notification != null) {
                obtain.writeInt(1);
                notification.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            c6688je1.a.transact(1, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NotifyTask[packageName:");
        sb.append(this.a);
        sb.append(", id:");
        sb.append(this.b);
        sb.append(", tag:");
        return Y5.a(sb, this.c, "]");
    }
}
