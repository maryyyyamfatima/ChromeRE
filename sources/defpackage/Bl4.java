package defpackage;

import J.N;
import android.os.Bundle;
import android.os.Parcel;
import android.os.ParcelUuid;
import android.os.Parcelable;
import org.chromium.content.browser.webcontents.WebContentsImpl;
import org.chromium.content_public.browser.WebContents;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class Bl4 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        Bundle readBundle = parcel.readBundle();
        if (readBundle.getLong("version", -1L) != 0) {
            return null;
        }
        if (WebContentsImpl.r.compareTo(((ParcelUuid) readBundle.getParcelable("processguard")).getUuid()) != 0) {
            return null;
        }
        return (WebContents) N.M$eaBDjM(readBundle.getLong("webcontents"));
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new WebContents[i];
    }
}
