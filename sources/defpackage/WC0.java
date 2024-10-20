package defpackage;

import android.app.ApplicationErrorReport;
import android.graphics.Bitmap;
import android.graphics.RectF;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.data.BitmapTeleporter;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import com.google.android.gms.feedback.ErrorReport;
import com.google.android.gms.feedback.FileTeleporter;
import com.google.android.gms.feedback.LogOptions;
import com.google.android.gms.feedback.ThemeSettings;
import com.google.android.libraries.elements.interfaces.JSControllerConfig;
import java.util.ArrayList;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class WC0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int A = QT2.A(parcel);
        ApplicationErrorReport applicationErrorReport = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        String str9 = null;
        String str10 = null;
        String str11 = null;
        String str12 = null;
        String str13 = null;
        String[] strArr = null;
        String[] strArr2 = null;
        String[] strArr3 = null;
        String str14 = null;
        String str15 = null;
        byte[] bArr = null;
        String str16 = null;
        String str17 = null;
        String str18 = null;
        Bundle bundle = null;
        String str19 = null;
        String str20 = null;
        String str21 = null;
        String str22 = null;
        String str23 = null;
        String str24 = null;
        String str25 = null;
        String str26 = null;
        String str27 = null;
        BitmapTeleporter bitmapTeleporter = null;
        String str28 = null;
        FileTeleporter[] fileTeleporterArr = null;
        String[] strArr4 = null;
        String str29 = null;
        ThemeSettings themeSettings = null;
        LogOptions logOptions = null;
        String str30 = null;
        Bundle bundle2 = null;
        ArrayList arrayList = null;
        Bitmap bitmap = null;
        String str31 = null;
        ArrayList arrayList2 = null;
        String[] strArr5 = null;
        String[] strArr6 = null;
        String[] strArr7 = null;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        boolean z = false;
        int i7 = 0;
        int i8 = 0;
        boolean z2 = false;
        int i9 = 0;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        int i10 = 0;
        int i11 = 0;
        boolean z6 = false;
        while (parcel.dataPosition() < A) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 2:
                    applicationErrorReport = (ApplicationErrorReport) QT2.h(parcel, readInt, ApplicationErrorReport.CREATOR);
                    break;
                case ModuleDescriptor.MODULE_VERSION /* 3 */:
                    str = QT2.i(readInt, parcel);
                    break;
                case 4:
                    i = QT2.u(readInt, parcel);
                    break;
                case JSControllerConfig.DEFAULT_VM_CONTEXT_LRU_SIZE /* 5 */:
                    str2 = QT2.i(readInt, parcel);
                    break;
                case 6:
                    str3 = QT2.i(readInt, parcel);
                    break;
                case 7:
                    str4 = QT2.i(readInt, parcel);
                    break;
                case 8:
                    str5 = QT2.i(readInt, parcel);
                    break;
                case 9:
                    str6 = QT2.i(readInt, parcel);
                    break;
                case 10:
                    str7 = QT2.i(readInt, parcel);
                    break;
                case 11:
                    str8 = QT2.i(readInt, parcel);
                    break;
                case 12:
                    i2 = QT2.u(readInt, parcel);
                    break;
                case 13:
                    str9 = QT2.i(readInt, parcel);
                    break;
                case 14:
                    str10 = QT2.i(readInt, parcel);
                    break;
                case 15:
                    str11 = QT2.i(readInt, parcel);
                    break;
                case 16:
                    str12 = QT2.i(readInt, parcel);
                    break;
                case 17:
                    str13 = QT2.i(readInt, parcel);
                    break;
                case 18:
                    strArr = QT2.j(readInt, parcel);
                    break;
                case 19:
                    strArr2 = QT2.j(readInt, parcel);
                    break;
                case 20:
                    strArr3 = QT2.j(readInt, parcel);
                    break;
                case 21:
                    str14 = QT2.i(readInt, parcel);
                    break;
                case 22:
                    str15 = QT2.i(readInt, parcel);
                    break;
                case 23:
                    bArr = QT2.b(readInt, parcel);
                    break;
                case 24:
                    i3 = QT2.u(readInt, parcel);
                    break;
                case 25:
                    i4 = QT2.u(readInt, parcel);
                    break;
                case 26:
                    i5 = QT2.u(readInt, parcel);
                    break;
                case 27:
                    i6 = QT2.u(readInt, parcel);
                    break;
                case 28:
                    str16 = QT2.i(readInt, parcel);
                    break;
                case 29:
                    str17 = QT2.i(readInt, parcel);
                    break;
                case 30:
                    str18 = QT2.i(readInt, parcel);
                    break;
                case 31:
                    bundle = QT2.a(readInt, parcel);
                    break;
                case 32:
                    z = QT2.q(readInt, parcel);
                    break;
                case 33:
                    i7 = QT2.u(readInt, parcel);
                    break;
                case 34:
                    i8 = QT2.u(readInt, parcel);
                    break;
                case 35:
                    z2 = QT2.q(readInt, parcel);
                    break;
                case 36:
                    str19 = QT2.i(readInt, parcel);
                    break;
                case 37:
                    str20 = QT2.i(readInt, parcel);
                    break;
                case 38:
                    i9 = QT2.u(readInt, parcel);
                    break;
                case 39:
                    str21 = QT2.i(readInt, parcel);
                    break;
                case 40:
                    str22 = QT2.i(readInt, parcel);
                    break;
                case 41:
                    str23 = QT2.i(readInt, parcel);
                    break;
                case 42:
                    str24 = QT2.i(readInt, parcel);
                    break;
                case 43:
                    str25 = QT2.i(readInt, parcel);
                    break;
                case 44:
                    str26 = QT2.i(readInt, parcel);
                    break;
                case 45:
                    str27 = QT2.i(readInt, parcel);
                    break;
                case 46:
                    bitmapTeleporter = (BitmapTeleporter) QT2.h(parcel, readInt, BitmapTeleporter.CREATOR);
                    break;
                case 47:
                    str28 = QT2.i(readInt, parcel);
                    break;
                case 48:
                    fileTeleporterArr = (FileTeleporter[]) QT2.l(parcel, readInt, FileTeleporter.CREATOR);
                    break;
                case 49:
                    strArr4 = QT2.j(readInt, parcel);
                    break;
                case 50:
                    z3 = QT2.q(readInt, parcel);
                    break;
                case 51:
                    str29 = QT2.i(readInt, parcel);
                    break;
                case 52:
                    themeSettings = (ThemeSettings) QT2.h(parcel, readInt, ThemeSettings.CREATOR);
                    break;
                case 53:
                    logOptions = (LogOptions) QT2.h(parcel, readInt, LogOptions.CREATOR);
                    break;
                case 54:
                    str30 = QT2.i(readInt, parcel);
                    break;
                case 55:
                    z4 = QT2.q(readInt, parcel);
                    break;
                case 56:
                    bundle2 = QT2.a(readInt, parcel);
                    break;
                case 57:
                    arrayList = QT2.m(parcel, readInt, RectF.CREATOR);
                    break;
                case 58:
                    z5 = QT2.q(readInt, parcel);
                    break;
                case 59:
                    bitmap = (Bitmap) QT2.h(parcel, readInt, Bitmap.CREATOR);
                    break;
                case 60:
                    str31 = QT2.i(readInt, parcel);
                    break;
                case 61:
                    arrayList2 = QT2.k(readInt, parcel);
                    break;
                case 62:
                    i10 = QT2.u(readInt, parcel);
                    break;
                case 63:
                    i11 = QT2.u(readInt, parcel);
                    break;
                case 64:
                    strArr5 = QT2.j(readInt, parcel);
                    break;
                case 65:
                    strArr6 = QT2.j(readInt, parcel);
                    break;
                case 66:
                    strArr7 = QT2.j(readInt, parcel);
                    break;
                case 67:
                    z6 = QT2.q(readInt, parcel);
                    break;
                default:
                    QT2.z(readInt, parcel);
                    break;
            }
        }
        QT2.o(A, parcel);
        return new ErrorReport(applicationErrorReport, str, i, str2, str3, str4, str5, str6, str7, str8, i2, str9, str10, str11, str12, str13, strArr, strArr2, strArr3, str14, str15, bArr, i3, i4, i5, i6, str16, str17, str18, bundle, z, i7, i8, z2, str19, str20, i9, str21, str22, str23, str24, str25, str26, str27, bitmapTeleporter, str28, fileTeleporterArr, strArr4, z3, str29, themeSettings, logOptions, str30, z4, bundle2, arrayList, z5, bitmap, str31, arrayList2, i10, i11, strArr5, strArr6, strArr7, z6);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new ErrorReport[i];
    }
}
