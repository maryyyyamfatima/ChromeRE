package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import defpackage.C10547us;
import defpackage.TT0;
import java.util.ArrayList;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
final class BackStackRecordState implements Parcelable {
    public static final Parcelable.Creator CREATOR = new a();
    public final int[] a;
    public final ArrayList g;
    public final int[] h;
    public final int[] i;
    public final int j;
    public final String k;
    public final int l;
    public final int m;
    public final CharSequence n;
    public final int o;
    public final CharSequence p;
    public final ArrayList q;
    public final ArrayList r;
    public final boolean s;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public BackStackRecordState(C10547us c10547us) {
        int size = c10547us.a.size();
        this.a = new int[size * 6];
        if (!c10547us.g) {
            throw new IllegalStateException("Not on back stack");
        }
        this.g = new ArrayList(size);
        this.h = new int[size];
        this.i = new int[size];
        int i = 0;
        int i2 = 0;
        while (i < size) {
            TT0 tt0 = (TT0) c10547us.a.get(i);
            int i3 = i2 + 1;
            this.a[i2] = tt0.a;
            ArrayList arrayList = this.g;
            c cVar = tt0.b;
            arrayList.add(cVar != null ? cVar.k : null);
            int[] iArr = this.a;
            int i4 = i3 + 1;
            iArr[i3] = tt0.c ? 1 : 0;
            int i5 = i4 + 1;
            iArr[i4] = tt0.d;
            int i6 = i5 + 1;
            iArr[i5] = tt0.e;
            int i7 = i6 + 1;
            iArr[i6] = tt0.f;
            iArr[i7] = tt0.g;
            this.h[i] = tt0.h.ordinal();
            this.i[i] = tt0.i.ordinal();
            i++;
            i2 = i7 + 1;
        }
        this.j = c10547us.f;
        this.k = c10547us.i;
        this.l = c10547us.s;
        this.m = c10547us.j;
        this.n = c10547us.k;
        this.o = c10547us.l;
        this.p = c10547us.m;
        this.q = c10547us.n;
        this.r = c10547us.o;
        this.s = c10547us.p;
    }

    public BackStackRecordState(Parcel parcel) {
        this.a = parcel.createIntArray();
        this.g = parcel.createStringArrayList();
        this.h = parcel.createIntArray();
        this.i = parcel.createIntArray();
        this.j = parcel.readInt();
        this.k = parcel.readString();
        this.l = parcel.readInt();
        this.m = parcel.readInt();
        this.n = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.o = parcel.readInt();
        this.p = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.q = parcel.createStringArrayList();
        this.r = parcel.createStringArrayList();
        this.s = parcel.readInt() != 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeIntArray(this.a);
        parcel.writeStringList(this.g);
        parcel.writeIntArray(this.h);
        parcel.writeIntArray(this.i);
        parcel.writeInt(this.j);
        parcel.writeString(this.k);
        parcel.writeInt(this.l);
        parcel.writeInt(this.m);
        TextUtils.writeToParcel(this.n, parcel, 0);
        parcel.writeInt(this.o);
        TextUtils.writeToParcel(this.p, parcel, 0);
        parcel.writeStringList(this.q);
        parcel.writeStringList(this.r);
        parcel.writeInt(this.s ? 1 : 0);
    }
}
