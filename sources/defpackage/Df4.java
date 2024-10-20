package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.data.BitmapTeleporter;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import com.google.android.gms.instantapps.internal.ContentRating;
import com.google.android.gms.instantapps.internal.VisitedApplication;
import com.google.android.libraries.elements.interfaces.JSControllerConfig;
import java.util.ArrayList;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class Df4 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int A = QT2.A(parcel);
        BitmapTeleporter bitmapTeleporter = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        ArrayList arrayList = null;
        ContentRating contentRating = null;
        while (parcel.dataPosition() < A) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 2:
                    bitmapTeleporter = (BitmapTeleporter) QT2.h(parcel, readInt, BitmapTeleporter.CREATOR);
                    break;
                case ModuleDescriptor.MODULE_VERSION /* 3 */:
                    str = QT2.i(readInt, parcel);
                    break;
                case 4:
                    str2 = QT2.i(readInt, parcel);
                    break;
                case JSControllerConfig.DEFAULT_VM_CONTEXT_LRU_SIZE /* 5 */:
                    str3 = QT2.i(readInt, parcel);
                    break;
                case 6:
                    str4 = QT2.i(readInt, parcel);
                    break;
                case 7:
                    arrayList = QT2.k(readInt, parcel);
                    break;
                case 8:
                    contentRating = (ContentRating) QT2.h(parcel, readInt, ContentRating.CREATOR);
                    break;
                default:
                    QT2.z(readInt, parcel);
                    break;
            }
        }
        QT2.o(A, parcel);
        return new VisitedApplication(bitmapTeleporter, str, str2, str3, str4, arrayList, contentRating);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new VisitedApplication[i];
    }
}
