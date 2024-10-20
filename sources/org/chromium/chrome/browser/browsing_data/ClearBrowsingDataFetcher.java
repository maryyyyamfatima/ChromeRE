package org.chromium.chrome.browser.browsing_data;

import J.N;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.EI2;
import defpackage.QS;
import java.util.Arrays;
import org.chromium.chrome.browser.browsing_data.BrowsingDataBridge;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class ClearBrowsingDataFetcher implements BrowsingDataBridge.ImportantSitesCallback, BrowsingDataBridge.OtherFormsOfBrowsingHistoryListener, Parcelable {
    public static final Parcelable.Creator CREATOR = new QS();
    public final int a;
    public String[] g;
    public int[] h;
    public String[] i;
    public boolean j;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public ClearBrowsingDataFetcher() {
        this.a = N.Mz7sCzLM();
    }

    public ClearBrowsingDataFetcher(Parcel parcel) {
        this.a = parcel.readInt();
        this.g = parcel.createStringArray();
        this.h = parcel.createIntArray();
        this.i = parcel.createStringArray();
        this.j = parcel.readByte() != 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeStringArray(this.g);
        parcel.writeIntArray(this.h);
        parcel.writeStringArray(this.i);
        parcel.writeByte(this.j ? (byte) 1 : (byte) 0);
    }

    @Override // org.chromium.chrome.browser.browsing_data.BrowsingDataBridge.ImportantSitesCallback
    public final void onImportantRegisterableDomainsReady(String[] strArr, String[] strArr2, int[] iArr, boolean z) {
        if (strArr == null || z) {
            return;
        }
        int length = strArr.length;
        int i = this.a;
        EI2.i(length, 1, i + 1, i + 1, "History.ClearBrowsingData.NumImportant");
        this.g = (String[]) Arrays.copyOf(strArr, strArr.length);
        this.h = Arrays.copyOf(iArr, iArr.length);
        this.i = (String[]) Arrays.copyOf(strArr2, strArr2.length);
    }

    @Override // org.chromium.chrome.browser.browsing_data.BrowsingDataBridge.OtherFormsOfBrowsingHistoryListener
    public final void enableDialogAboutOtherFormsOfBrowsingHistory() {
        this.j = true;
    }
}
