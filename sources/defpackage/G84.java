package defpackage;

import android.os.Parcel;
import android.util.SparseIntArray;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class G84 extends F84 {
    public final SparseIntArray d;
    public final Parcel e;
    public final int f;
    public final int g;
    public final String h;
    public int i;
    public int j;
    public int k;

    public G84(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new C1439Lb3(), new C1439Lb3(), new C1439Lb3());
    }

    public G84(Parcel parcel, int i, int i2, String str, C1439Lb3 c1439Lb3, C1439Lb3 c1439Lb32, C1439Lb3 c1439Lb33) {
        super(c1439Lb3, c1439Lb32, c1439Lb33);
        this.d = new SparseIntArray();
        this.i = -1;
        this.k = -1;
        this.e = parcel;
        this.f = i;
        this.g = i2;
        this.j = i;
        this.h = str;
    }

    @Override // defpackage.F84
    public final boolean e(int i) {
        while (this.j < this.g) {
            int i2 = this.k;
            if (i2 == i) {
                return true;
            }
            if (String.valueOf(i2).compareTo(String.valueOf(i)) > 0) {
                return false;
            }
            int i3 = this.j;
            Parcel parcel = this.e;
            parcel.setDataPosition(i3);
            int readInt = parcel.readInt();
            this.k = parcel.readInt();
            this.j += readInt;
        }
        return this.k == i;
    }

    @Override // defpackage.F84
    public final void i(int i) {
        int i2 = this.i;
        SparseIntArray sparseIntArray = this.d;
        Parcel parcel = this.e;
        if (i2 >= 0) {
            int i3 = sparseIntArray.get(i2);
            int dataPosition = parcel.dataPosition();
            parcel.setDataPosition(i3);
            parcel.writeInt(dataPosition - i3);
            parcel.setDataPosition(dataPosition);
        }
        this.i = i;
        sparseIntArray.put(i, parcel.dataPosition());
        parcel.writeInt(0);
        parcel.writeInt(i);
    }

    @Override // defpackage.F84
    public final G84 a() {
        Parcel parcel = this.e;
        int dataPosition = parcel.dataPosition();
        int i = this.j;
        if (i == this.f) {
            i = this.g;
        }
        return new G84(parcel, dataPosition, i, Y5.a(new StringBuilder(), this.h, "  "), this.a, this.b, this.c);
    }
}
