package defpackage;

import android.app.ApplicationErrorReport;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.data.BitmapTeleporter;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import com.google.android.gms.feedback.FeedbackOptions;
import com.google.android.gms.feedback.FileTeleporter;
import com.google.android.gms.feedback.LogOptions;
import com.google.android.gms.feedback.ThemeSettings;
import com.google.android.libraries.elements.interfaces.JSControllerConfig;
import java.util.ArrayList;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: xL0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11394xL0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int A = QT2.A(parcel);
        String str = null;
        Bundle bundle = null;
        String str2 = null;
        ApplicationErrorReport applicationErrorReport = null;
        String str3 = null;
        BitmapTeleporter bitmapTeleporter = null;
        String str4 = null;
        ArrayList arrayList = null;
        ThemeSettings themeSettings = null;
        LogOptions logOptions = null;
        Bitmap bitmap = null;
        String str5 = null;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        long j = 0;
        while (parcel.dataPosition() < A) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 2:
                    str = QT2.i(readInt, parcel);
                    break;
                case ModuleDescriptor.MODULE_VERSION /* 3 */:
                    bundle = QT2.a(readInt, parcel);
                    break;
                case 4:
                default:
                    QT2.z(readInt, parcel);
                    break;
                case JSControllerConfig.DEFAULT_VM_CONTEXT_LRU_SIZE /* 5 */:
                    str2 = QT2.i(readInt, parcel);
                    break;
                case 6:
                    applicationErrorReport = (ApplicationErrorReport) QT2.h(parcel, readInt, ApplicationErrorReport.CREATOR);
                    break;
                case 7:
                    str3 = QT2.i(readInt, parcel);
                    break;
                case 8:
                    bitmapTeleporter = (BitmapTeleporter) QT2.h(parcel, readInt, BitmapTeleporter.CREATOR);
                    break;
                case 9:
                    str4 = QT2.i(readInt, parcel);
                    break;
                case 10:
                    arrayList = QT2.m(parcel, readInt, FileTeleporter.CREATOR);
                    break;
                case 11:
                    z = QT2.q(readInt, parcel);
                    break;
                case 12:
                    themeSettings = (ThemeSettings) QT2.h(parcel, readInt, ThemeSettings.CREATOR);
                    break;
                case 13:
                    logOptions = (LogOptions) QT2.h(parcel, readInt, LogOptions.CREATOR);
                    break;
                case 14:
                    z2 = QT2.q(readInt, parcel);
                    break;
                case 15:
                    bitmap = (Bitmap) QT2.h(parcel, readInt, Bitmap.CREATOR);
                    break;
                case 16:
                    str5 = QT2.i(readInt, parcel);
                    break;
                case 17:
                    z3 = QT2.q(readInt, parcel);
                    break;
                case 18:
                    j = QT2.w(readInt, parcel);
                    break;
                case 19:
                    z4 = QT2.q(readInt, parcel);
                    break;
            }
        }
        QT2.o(A, parcel);
        return new FeedbackOptions(str, bundle, str2, applicationErrorReport, str3, bitmapTeleporter, str4, arrayList, z, themeSettings, logOptions, z2, bitmap, str5, z3, j, z4);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new FeedbackOptions[i];
    }
}
