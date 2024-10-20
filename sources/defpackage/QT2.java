package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public abstract class QT2 {
    public static int A(Parcel parcel) {
        int readInt = parcel.readInt();
        int y = y(readInt, parcel);
        int dataPosition = parcel.dataPosition();
        if ((65535 & readInt) != 20293) {
            throw new PT2(AbstractC4809e90.a("Expected object header. Got 0x", Integer.toHexString(readInt)), parcel);
        }
        int i = y + dataPosition;
        if (i < dataPosition || i > parcel.dataSize()) {
            throw new PT2(AbstractC0800Ge.a("Size read is invalid start=", dataPosition, " end=", i), parcel);
        }
        return i;
    }

    public static int y(int i, Parcel parcel) {
        return (i & (-65536)) != -65536 ? (i >> 16) & 65535 : parcel.readInt();
    }

    public static void z(int i, Parcel parcel) {
        parcel.setDataPosition(parcel.dataPosition() + y(i, parcel));
    }

    public static void p(Parcel parcel, int i, int i2) {
        int y = y(i, parcel);
        if (y == i2) {
            return;
        }
        String hexString = Integer.toHexString(y);
        StringBuilder sb = new StringBuilder("Expected size ");
        sb.append(i2);
        sb.append(" got ");
        sb.append(y);
        sb.append(" (0x");
        throw new PT2(Y5.a(sb, hexString, ")"), parcel);
    }

    public static void n(Parcel parcel, int i, int i2) {
        if (i == i2) {
            return;
        }
        String hexString = Integer.toHexString(i);
        StringBuilder sb = new StringBuilder("Expected size ");
        sb.append(i2);
        sb.append(" got ");
        sb.append(i);
        sb.append(" (0x");
        throw new PT2(Y5.a(sb, hexString, ")"), parcel);
    }

    public static boolean q(int i, Parcel parcel) {
        p(parcel, i, 4);
        return parcel.readInt() != 0;
    }

    public static int u(int i, Parcel parcel) {
        p(parcel, i, 4);
        return parcel.readInt();
    }

    public static Integer v(int i, Parcel parcel) {
        int y = y(i, parcel);
        if (y == 0) {
            return null;
        }
        n(parcel, y, 4);
        return Integer.valueOf(parcel.readInt());
    }

    public static long w(int i, Parcel parcel) {
        p(parcel, i, 8);
        return parcel.readLong();
    }

    public static Long x(int i, Parcel parcel) {
        int y = y(i, parcel);
        if (y == 0) {
            return null;
        }
        n(parcel, y, 8);
        return Long.valueOf(parcel.readLong());
    }

    public static float s(int i, Parcel parcel) {
        p(parcel, i, 4);
        return parcel.readFloat();
    }

    public static double r(int i, Parcel parcel) {
        p(parcel, i, 8);
        return parcel.readDouble();
    }

    public static String i(int i, Parcel parcel) {
        int y = y(i, parcel);
        int dataPosition = parcel.dataPosition();
        if (y == 0) {
            return null;
        }
        String readString = parcel.readString();
        parcel.setDataPosition(dataPosition + y);
        return readString;
    }

    public static IBinder t(int i, Parcel parcel) {
        int y = y(i, parcel);
        int dataPosition = parcel.dataPosition();
        if (y == 0) {
            return null;
        }
        IBinder readStrongBinder = parcel.readStrongBinder();
        parcel.setDataPosition(dataPosition + y);
        return readStrongBinder;
    }

    public static Parcelable h(Parcel parcel, int i, Parcelable.Creator creator) {
        int y = y(i, parcel);
        int dataPosition = parcel.dataPosition();
        if (y == 0) {
            return null;
        }
        Parcelable parcelable = (Parcelable) creator.createFromParcel(parcel);
        parcel.setDataPosition(dataPosition + y);
        return parcelable;
    }

    public static Bundle a(int i, Parcel parcel) {
        int y = y(i, parcel);
        int dataPosition = parcel.dataPosition();
        if (y == 0) {
            return null;
        }
        Bundle readBundle = parcel.readBundle();
        parcel.setDataPosition(dataPosition + y);
        return readBundle;
    }

    public static byte[] b(int i, Parcel parcel) {
        int y = y(i, parcel);
        int dataPosition = parcel.dataPosition();
        if (y == 0) {
            return null;
        }
        byte[] createByteArray = parcel.createByteArray();
        parcel.setDataPosition(dataPosition + y);
        return createByteArray;
    }

    public static byte[][] c(int i, Parcel parcel) {
        int y = y(i, parcel);
        int dataPosition = parcel.dataPosition();
        if (y == 0) {
            return null;
        }
        int readInt = parcel.readInt();
        byte[][] bArr = new byte[readInt];
        for (int i2 = 0; i2 < readInt; i2++) {
            bArr[i2] = parcel.createByteArray();
        }
        parcel.setDataPosition(dataPosition + y);
        return bArr;
    }

    public static int[] d(int i, Parcel parcel) {
        int y = y(i, parcel);
        int dataPosition = parcel.dataPosition();
        if (y == 0) {
            return null;
        }
        int[] createIntArray = parcel.createIntArray();
        parcel.setDataPosition(dataPosition + y);
        return createIntArray;
    }

    public static long[] f(int i, Parcel parcel) {
        int y = y(i, parcel);
        int dataPosition = parcel.dataPosition();
        if (y == 0) {
            return null;
        }
        long[] createLongArray = parcel.createLongArray();
        parcel.setDataPosition(dataPosition + y);
        return createLongArray;
    }

    public static String[] j(int i, Parcel parcel) {
        int y = y(i, parcel);
        int dataPosition = parcel.dataPosition();
        if (y == 0) {
            return null;
        }
        String[] createStringArray = parcel.createStringArray();
        parcel.setDataPosition(dataPosition + y);
        return createStringArray;
    }

    public static ArrayList e(int i, Parcel parcel) {
        int y = y(i, parcel);
        int dataPosition = parcel.dataPosition();
        if (y == 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int readInt = parcel.readInt();
        for (int i2 = 0; i2 < readInt; i2++) {
            arrayList.add(Integer.valueOf(parcel.readInt()));
        }
        parcel.setDataPosition(dataPosition + y);
        return arrayList;
    }

    public static ArrayList g(int i, Parcel parcel) {
        int y = y(i, parcel);
        int dataPosition = parcel.dataPosition();
        if (y == 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int readInt = parcel.readInt();
        for (int i2 = 0; i2 < readInt; i2++) {
            arrayList.add(Long.valueOf(parcel.readLong()));
        }
        parcel.setDataPosition(dataPosition + y);
        return arrayList;
    }

    public static ArrayList k(int i, Parcel parcel) {
        int y = y(i, parcel);
        int dataPosition = parcel.dataPosition();
        if (y == 0) {
            return null;
        }
        ArrayList<String> createStringArrayList = parcel.createStringArrayList();
        parcel.setDataPosition(dataPosition + y);
        return createStringArrayList;
    }

    public static Object[] l(Parcel parcel, int i, Parcelable.Creator creator) {
        int y = y(i, parcel);
        int dataPosition = parcel.dataPosition();
        if (y == 0) {
            return null;
        }
        Object[] createTypedArray = parcel.createTypedArray(creator);
        parcel.setDataPosition(dataPosition + y);
        return createTypedArray;
    }

    public static ArrayList m(Parcel parcel, int i, Parcelable.Creator creator) {
        int y = y(i, parcel);
        int dataPosition = parcel.dataPosition();
        if (y == 0) {
            return null;
        }
        ArrayList createTypedArrayList = parcel.createTypedArrayList(creator);
        parcel.setDataPosition(dataPosition + y);
        return createTypedArrayList;
    }

    public static void o(int i, Parcel parcel) {
        if (parcel.dataPosition() != i) {
            throw new PT2(AbstractC9076qb1.a("Overread allowed size end=", i), parcel);
        }
    }
}
