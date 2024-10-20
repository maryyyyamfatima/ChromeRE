package defpackage;

import android.database.CursorWindow;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.data.DataHolder;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: eg0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4981eg0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int A = QT2.A(parcel);
        int i = 0;
        int i2 = 0;
        String[] strArr = null;
        CursorWindow[] cursorWindowArr = null;
        Bundle bundle = null;
        while (parcel.dataPosition() < A) {
            int readInt = parcel.readInt();
            int i3 = 65535 & readInt;
            if (i3 == 1) {
                strArr = QT2.j(readInt, parcel);
            } else if (i3 == 2) {
                cursorWindowArr = (CursorWindow[]) QT2.l(parcel, readInt, CursorWindow.CREATOR);
            } else if (i3 == 3) {
                i2 = QT2.u(readInt, parcel);
            } else if (i3 == 4) {
                bundle = QT2.a(readInt, parcel);
            } else if (i3 == 1000) {
                i = QT2.u(readInt, parcel);
            } else {
                QT2.z(readInt, parcel);
            }
        }
        QT2.o(A, parcel);
        DataHolder dataHolder = new DataHolder(i, strArr, cursorWindowArr, i2, bundle);
        dataHolder.h = new Bundle();
        int i4 = 0;
        while (true) {
            String[] strArr2 = dataHolder.g;
            if (i4 >= strArr2.length) {
                break;
            }
            dataHolder.h.putInt(strArr2[i4], i4);
            i4++;
        }
        CursorWindow[] cursorWindowArr2 = dataHolder.i;
        dataHolder.l = new int[cursorWindowArr2.length];
        int i5 = 0;
        for (int i6 = 0; i6 < cursorWindowArr2.length; i6++) {
            dataHolder.l[i6] = i5;
            i5 += cursorWindowArr2[i6].getNumRows() - (i5 - cursorWindowArr2[i6].getStartPosition());
        }
        dataHolder.m = i5;
        return dataHolder;
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new DataHolder[i];
    }
}
