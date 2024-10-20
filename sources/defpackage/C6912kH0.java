package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import com.google.android.gms.vision.face.internal.client.ContourParcel;
import com.google.android.gms.vision.face.internal.client.FaceParcel;
import com.google.android.gms.vision.face.internal.client.LandmarkParcel;
import com.google.android.libraries.elements.interfaces.JSControllerConfig;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: kH0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6912kH0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int A = QT2.A(parcel);
        int i = 0;
        int i2 = 0;
        float f = 0.0f;
        float f2 = 0.0f;
        float f3 = 0.0f;
        float f4 = 0.0f;
        float f5 = 0.0f;
        float f6 = 0.0f;
        float f7 = 0.0f;
        float f8 = Float.MAX_VALUE;
        float f9 = Float.MAX_VALUE;
        float f10 = Float.MAX_VALUE;
        LandmarkParcel[] landmarkParcelArr = null;
        ContourParcel[] contourParcelArr = null;
        float f11 = -1.0f;
        while (parcel.dataPosition() < A) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 1:
                    i = QT2.u(readInt, parcel);
                    break;
                case 2:
                    i2 = QT2.u(readInt, parcel);
                    break;
                case ModuleDescriptor.MODULE_VERSION /* 3 */:
                    f = QT2.s(readInt, parcel);
                    break;
                case 4:
                    f2 = QT2.s(readInt, parcel);
                    break;
                case JSControllerConfig.DEFAULT_VM_CONTEXT_LRU_SIZE /* 5 */:
                    f3 = QT2.s(readInt, parcel);
                    break;
                case 6:
                    f4 = QT2.s(readInt, parcel);
                    break;
                case 7:
                    f8 = QT2.s(readInt, parcel);
                    break;
                case 8:
                    f9 = QT2.s(readInt, parcel);
                    break;
                case 9:
                    landmarkParcelArr = (LandmarkParcel[]) QT2.l(parcel, readInt, LandmarkParcel.CREATOR);
                    break;
                case 10:
                    f5 = QT2.s(readInt, parcel);
                    break;
                case 11:
                    f6 = QT2.s(readInt, parcel);
                    break;
                case 12:
                    f7 = QT2.s(readInt, parcel);
                    break;
                case 13:
                    contourParcelArr = (ContourParcel[]) QT2.l(parcel, readInt, ContourParcel.CREATOR);
                    break;
                case 14:
                    f10 = QT2.s(readInt, parcel);
                    break;
                case 15:
                    f11 = QT2.s(readInt, parcel);
                    break;
                default:
                    QT2.z(readInt, parcel);
                    break;
            }
        }
        QT2.o(A, parcel);
        return new FaceParcel(i, i2, f, f2, f3, f4, f8, f9, f10, landmarkParcelArr, f5, f6, f7, contourParcelArr, f11);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new FaceParcel[i];
    }
}
