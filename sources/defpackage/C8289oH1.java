package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.clearcut.LogEventParcelable;
import com.google.android.gms.clearcut.internal.LogVerifierResultParcelable;
import com.google.android.gms.clearcut.internal.PlayLoggerContext;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import com.google.android.gms.phenotype.ExperimentTokens;
import com.google.android.libraries.elements.interfaces.JSControllerConfig;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: oH1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8289oH1 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int A = QT2.A(parcel);
        PlayLoggerContext playLoggerContext = null;
        byte[] bArr = null;
        int[] iArr = null;
        String[] strArr = null;
        int[] iArr2 = null;
        byte[][] bArr2 = null;
        ExperimentTokens[] experimentTokensArr = null;
        LogVerifierResultParcelable logVerifierResultParcelable = null;
        String[] strArr2 = null;
        boolean z = true;
        while (parcel.dataPosition() < A) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 2:
                    playLoggerContext = (PlayLoggerContext) QT2.h(parcel, readInt, PlayLoggerContext.CREATOR);
                    break;
                case ModuleDescriptor.MODULE_VERSION /* 3 */:
                    bArr = QT2.b(readInt, parcel);
                    break;
                case 4:
                    iArr = QT2.d(readInt, parcel);
                    break;
                case JSControllerConfig.DEFAULT_VM_CONTEXT_LRU_SIZE /* 5 */:
                    strArr = QT2.j(readInt, parcel);
                    break;
                case 6:
                    iArr2 = QT2.d(readInt, parcel);
                    break;
                case 7:
                    bArr2 = QT2.c(readInt, parcel);
                    break;
                case 8:
                    z = QT2.q(readInt, parcel);
                    break;
                case 9:
                    experimentTokensArr = (ExperimentTokens[]) QT2.l(parcel, readInt, ExperimentTokens.CREATOR);
                    break;
                case 10:
                default:
                    QT2.z(readInt, parcel);
                    break;
                case 11:
                    logVerifierResultParcelable = (LogVerifierResultParcelable) QT2.h(parcel, readInt, LogVerifierResultParcelable.CREATOR);
                    break;
                case 12:
                    strArr2 = QT2.j(readInt, parcel);
                    break;
            }
        }
        QT2.o(A, parcel);
        return new LogEventParcelable(playLoggerContext, bArr, iArr, strArr, iArr2, bArr2, z, experimentTokensArr, logVerifierResultParcelable, strArr2);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new LogEventParcelable[i];
    }
}
