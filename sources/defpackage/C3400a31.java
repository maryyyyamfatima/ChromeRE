package defpackage;

import android.accounts.Account;
import android.app.PendingIntent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import com.google.android.gms.feedback.ErrorReport;
import com.google.android.gms.feedback.ThemeSettings;
import com.google.android.gms.googlehelp.FRDProductSpecificDataEntry;
import com.google.android.gms.googlehelp.GoogleHelp;
import com.google.android.gms.googlehelp.ND4CSettings;
import com.google.android.gms.googlehelp.OfflineSuggestion;
import com.google.android.gms.googlehelp.internal.common.OverflowMenuItem;
import com.google.android.gms.googlehelp.internal.common.TogglingData;
import com.google.android.libraries.elements.interfaces.JSControllerConfig;
import java.util.ArrayList;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: a31 */
/* loaded from: classes.dex */
public final class C3400a31 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int A = QT2.A(parcel);
        int i = 0;
        boolean z = false;
        boolean z2 = false;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        boolean z3 = false;
        int i5 = 0;
        int i6 = 0;
        boolean z4 = false;
        boolean z5 = false;
        int i7 = 0;
        boolean z6 = false;
        boolean z7 = false;
        boolean z8 = false;
        String str = null;
        Account account = null;
        Bundle bundle = null;
        String str2 = null;
        String str3 = null;
        Bitmap bitmap = null;
        ArrayList arrayList = null;
        Bundle bundle2 = null;
        Bitmap bitmap2 = null;
        byte[] bArr = null;
        String str4 = null;
        Uri uri = null;
        ArrayList arrayList2 = null;
        ThemeSettings themeSettings = null;
        ArrayList arrayList3 = null;
        ErrorReport errorReport = null;
        TogglingData togglingData = null;
        PendingIntent pendingIntent = null;
        String str5 = null;
        String str6 = null;
        ND4CSettings nD4CSettings = null;
        ArrayList arrayList4 = null;
        while (parcel.dataPosition() < A) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 1:
                    i = QT2.u(readInt, parcel);
                    break;
                case 2:
                    str = QT2.i(readInt, parcel);
                    break;
                case ModuleDescriptor.MODULE_VERSION /* 3 */:
                    account = (Account) QT2.h(parcel, readInt, Account.CREATOR);
                    break;
                case 4:
                    bundle = QT2.a(readInt, parcel);
                    break;
                case JSControllerConfig.DEFAULT_VM_CONTEXT_LRU_SIZE /* 5 */:
                    z = QT2.q(readInt, parcel);
                    break;
                case 6:
                    z2 = QT2.q(readInt, parcel);
                    break;
                case 7:
                    arrayList = QT2.k(readInt, parcel);
                    break;
                case 8:
                case 9:
                case 12:
                case 13:
                case 24:
                case 26:
                case 27:
                case 29:
                case 30:
                default:
                    QT2.z(readInt, parcel);
                    break;
                case 10:
                    bundle2 = QT2.a(readInt, parcel);
                    break;
                case 11:
                    bitmap2 = (Bitmap) QT2.h(parcel, readInt, Bitmap.CREATOR);
                    break;
                case 14:
                    str4 = QT2.i(readInt, parcel);
                    break;
                case 15:
                    uri = (Uri) QT2.h(parcel, readInt, Uri.CREATOR);
                    break;
                case 16:
                    arrayList2 = QT2.m(parcel, readInt, OverflowMenuItem.CREATOR);
                    break;
                case 17:
                    i4 = QT2.u(readInt, parcel);
                    break;
                case 18:
                    arrayList3 = QT2.m(parcel, readInt, OfflineSuggestion.CREATOR);
                    break;
                case 19:
                    bArr = QT2.b(readInt, parcel);
                    break;
                case 20:
                    i2 = QT2.u(readInt, parcel);
                    break;
                case 21:
                    i3 = QT2.u(readInt, parcel);
                    break;
                case 22:
                    z3 = QT2.q(readInt, parcel);
                    break;
                case 23:
                    errorReport = (ErrorReport) QT2.h(parcel, readInt, ErrorReport.CREATOR);
                    break;
                case 25:
                    themeSettings = (ThemeSettings) QT2.h(parcel, readInt, ThemeSettings.CREATOR);
                    break;
                case 28:
                    str2 = QT2.i(readInt, parcel);
                    break;
                case 31:
                    togglingData = (TogglingData) QT2.h(parcel, readInt, TogglingData.CREATOR);
                    break;
                case 32:
                    i5 = QT2.u(readInt, parcel);
                    break;
                case 33:
                    pendingIntent = (PendingIntent) QT2.h(parcel, readInt, PendingIntent.CREATOR);
                    break;
                case 34:
                    str3 = QT2.i(readInt, parcel);
                    break;
                case 35:
                    bitmap = (Bitmap) QT2.h(parcel, readInt, Bitmap.CREATOR);
                    break;
                case 36:
                    i6 = QT2.u(readInt, parcel);
                    break;
                case 37:
                    z4 = QT2.q(readInt, parcel);
                    break;
                case 38:
                    z5 = QT2.q(readInt, parcel);
                    break;
                case 39:
                    i7 = QT2.u(readInt, parcel);
                    break;
                case 40:
                    str5 = QT2.i(readInt, parcel);
                    break;
                case 41:
                    z6 = QT2.q(readInt, parcel);
                    break;
                case 42:
                    str6 = QT2.i(readInt, parcel);
                    break;
                case 43:
                    z7 = QT2.q(readInt, parcel);
                    break;
                case 44:
                    nD4CSettings = (ND4CSettings) QT2.h(parcel, readInt, ND4CSettings.CREATOR);
                    break;
                case 45:
                    z8 = QT2.q(readInt, parcel);
                    break;
                case 46:
                    arrayList4 = QT2.m(parcel, readInt, FRDProductSpecificDataEntry.CREATOR);
                    break;
            }
        }
        QT2.o(A, parcel);
        return new GoogleHelp(i, str, account, bundle, str2, str3, bitmap, z, z2, arrayList, bundle2, bitmap2, bArr, i2, i3, str4, uri, arrayList2, i4, themeSettings, arrayList3, z3, errorReport, togglingData, i5, pendingIntent, i6, z4, z5, i7, str5, z6, str6, z7, nD4CSettings, z8, arrayList4);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new GoogleHelp[i];
    }
}
