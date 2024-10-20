package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public abstract class RT2 {
    public static void f(Parcel parcel, int i, int i2) {
        if (i2 >= 65535) {
            parcel.writeInt(i | (-65536));
            parcel.writeInt(i2);
        } else {
            parcel.writeInt(i | (i2 << 16));
        }
    }

    public static int a(int i, Parcel parcel) {
        parcel.writeInt(i | (-65536));
        parcel.writeInt(0);
        return parcel.dataPosition();
    }

    public static void b(int i, Parcel parcel) {
        int dataPosition = parcel.dataPosition();
        parcel.setDataPosition(i - 4);
        parcel.writeInt(dataPosition - i);
        parcel.setDataPosition(dataPosition);
    }

    public static void j(Parcel parcel, int i, Integer num) {
        if (num == null) {
            return;
        }
        f(parcel, i, 4);
        parcel.writeInt(num.intValue());
    }

    public static void m(Parcel parcel, int i, Long l) {
        if (l == null) {
            return;
        }
        f(parcel, i, 8);
        parcel.writeLong(l.longValue());
    }

    public static void o(Parcel parcel, int i, String str) {
        if (str == null) {
            return;
        }
        int a = a(i, parcel);
        parcel.writeString(str);
        b(a, parcel);
    }

    public static void g(Parcel parcel, int i, IBinder iBinder) {
        if (iBinder == null) {
            return;
        }
        int a = a(i, parcel);
        parcel.writeStrongBinder(iBinder);
        b(a, parcel);
    }

    public static void n(Parcel parcel, int i, Parcelable parcelable, int i2) {
        if (parcelable == null) {
            return;
        }
        int a = a(i, parcel);
        parcelable.writeToParcel(parcel, i2);
        b(a, parcel);
    }

    public static void c(Parcel parcel, int i, Bundle bundle) {
        if (bundle == null) {
            return;
        }
        int a = a(i, parcel);
        parcel.writeBundle(bundle);
        b(a, parcel);
    }

    public static void d(Parcel parcel, int i, byte[] bArr) {
        if (bArr == null) {
            return;
        }
        int a = a(i, parcel);
        parcel.writeByteArray(bArr);
        b(a, parcel);
    }

    public static void e(Parcel parcel, int i, byte[][] bArr) {
        if (bArr == null) {
            return;
        }
        int a = a(i, parcel);
        parcel.writeInt(bArr.length);
        for (byte[] bArr2 : bArr) {
            parcel.writeByteArray(bArr2);
        }
        b(a, parcel);
    }

    public static void h(Parcel parcel, int i, int[] iArr) {
        if (iArr == null) {
            return;
        }
        int a = a(i, parcel);
        parcel.writeIntArray(iArr);
        b(a, parcel);
    }

    public static void k(Parcel parcel, int i, long[] jArr) {
        if (jArr == null) {
            return;
        }
        int a = a(i, parcel);
        parcel.writeLongArray(jArr);
        b(a, parcel);
    }

    public static void p(Parcel parcel, int i, String[] strArr) {
        if (strArr == null) {
            return;
        }
        int a = a(i, parcel);
        parcel.writeStringArray(strArr);
        b(a, parcel);
    }

    public static void i(Parcel parcel, int i, ArrayList arrayList) {
        if (arrayList == null) {
            return;
        }
        int a = a(i, parcel);
        int size = arrayList.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            parcel.writeInt(((Integer) arrayList.get(i2)).intValue());
        }
        b(a, parcel);
    }

    public static void l(Parcel parcel, int i, List list) {
        if (list == null) {
            return;
        }
        int a = a(i, parcel);
        int size = list.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            parcel.writeLong(((Long) list.get(i2)).longValue());
        }
        b(a, parcel);
    }

    public static void q(Parcel parcel, int i, List list) {
        if (list == null) {
            return;
        }
        int a = a(i, parcel);
        parcel.writeStringList(list);
        b(a, parcel);
    }

    public static void r(Parcel parcel, int i, Parcelable[] parcelableArr, int i2) {
        if (parcelableArr == null) {
            return;
        }
        int a = a(i, parcel);
        parcel.writeInt(parcelableArr.length);
        for (Parcelable parcelable : parcelableArr) {
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                s(parcel, parcelable, i2);
            }
        }
        b(a, parcel);
    }

    public static void t(Parcel parcel, int i, List list) {
        if (list == null) {
            return;
        }
        int a = a(i, parcel);
        int size = list.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            Parcelable parcelable = (Parcelable) list.get(i2);
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                s(parcel, parcelable, 0);
            }
        }
        b(a, parcel);
    }

    public static void s(Parcel parcel, Parcelable parcelable, int i) {
        int dataPosition = parcel.dataPosition();
        parcel.writeInt(1);
        int dataPosition2 = parcel.dataPosition();
        parcelable.writeToParcel(parcel, i);
        int dataPosition3 = parcel.dataPosition();
        parcel.setDataPosition(dataPosition);
        parcel.writeInt(dataPosition3 - dataPosition2);
        parcel.setDataPosition(dataPosition3);
    }
}
