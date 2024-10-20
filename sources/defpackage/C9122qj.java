package defpackage;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.cast.ApplicationMetadata;
import com.google.android.gms.common.images.WebImage;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import com.google.android.libraries.elements.interfaces.JSControllerConfig;
import java.util.ArrayList;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: qj, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9122qj implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int A = QT2.A(parcel);
        String str = null;
        String str2 = null;
        ArrayList arrayList = null;
        String str3 = null;
        Uri uri = null;
        String str4 = null;
        String str5 = null;
        while (parcel.dataPosition() < A) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 2:
                    str = QT2.i(readInt, parcel);
                    break;
                case ModuleDescriptor.MODULE_VERSION /* 3 */:
                    str2 = QT2.i(readInt, parcel);
                    break;
                case 4:
                    QT2.m(parcel, readInt, WebImage.CREATOR);
                    break;
                case JSControllerConfig.DEFAULT_VM_CONTEXT_LRU_SIZE /* 5 */:
                    arrayList = QT2.k(readInt, parcel);
                    break;
                case 6:
                    str3 = QT2.i(readInt, parcel);
                    break;
                case 7:
                    uri = (Uri) QT2.h(parcel, readInt, Uri.CREATOR);
                    break;
                case 8:
                    str4 = QT2.i(readInt, parcel);
                    break;
                case 9:
                    str5 = QT2.i(readInt, parcel);
                    break;
                default:
                    QT2.z(readInt, parcel);
                    break;
            }
        }
        QT2.o(A, parcel);
        return new ApplicationMetadata(str, str2, arrayList, str3, uri, str4, str5);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new ApplicationMetadata[i];
    }
}
