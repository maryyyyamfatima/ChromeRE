package defpackage;

import android.accounts.Account;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.appdatasearch.GlobalSearchCorpusConfig;
import com.google.android.gms.appdatasearch.RegisterCorpusIMEInfo;
import com.google.android.gms.appdatasearch.RegisterCorpusInfo;
import com.google.android.gms.appdatasearch.RegisterSectionInfo;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import com.google.android.libraries.elements.interfaces.JSControllerConfig;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: hL2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5904hL2 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int A = QT2.A(parcel);
        String str = null;
        Uri uri = null;
        RegisterSectionInfo[] registerSectionInfoArr = null;
        GlobalSearchCorpusConfig globalSearchCorpusConfig = null;
        Account account = null;
        RegisterCorpusIMEInfo registerCorpusIMEInfo = null;
        String str2 = null;
        String str3 = "0";
        boolean z = true;
        boolean z2 = false;
        int i = 0;
        while (parcel.dataPosition() < A) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 1:
                    str = QT2.i(readInt, parcel);
                    break;
                case 2:
                    str3 = QT2.i(readInt, parcel);
                    break;
                case ModuleDescriptor.MODULE_VERSION /* 3 */:
                    uri = (Uri) QT2.h(parcel, readInt, Uri.CREATOR);
                    break;
                case 4:
                    registerSectionInfoArr = (RegisterSectionInfo[]) QT2.l(parcel, readInt, RegisterSectionInfo.CREATOR);
                    break;
                case JSControllerConfig.DEFAULT_VM_CONTEXT_LRU_SIZE /* 5 */:
                case 6:
                default:
                    QT2.z(readInt, parcel);
                    break;
                case 7:
                    globalSearchCorpusConfig = (GlobalSearchCorpusConfig) QT2.h(parcel, readInt, GlobalSearchCorpusConfig.CREATOR);
                    break;
                case 8:
                    z = QT2.q(readInt, parcel);
                    break;
                case 9:
                    account = (Account) QT2.h(parcel, readInt, Account.CREATOR);
                    break;
                case 10:
                    registerCorpusIMEInfo = (RegisterCorpusIMEInfo) QT2.h(parcel, readInt, RegisterCorpusIMEInfo.CREATOR);
                    break;
                case 11:
                    str2 = QT2.i(readInt, parcel);
                    break;
                case 12:
                    z2 = QT2.q(readInt, parcel);
                    break;
                case 13:
                    i = QT2.u(readInt, parcel);
                    break;
            }
        }
        QT2.o(A, parcel);
        return new RegisterCorpusInfo(str, str3, uri, registerSectionInfoArr, globalSearchCorpusConfig, z, account, registerCorpusIMEInfo, str2, z2, i);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new RegisterCorpusInfo[i];
    }
}
