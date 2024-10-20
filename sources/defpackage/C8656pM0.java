package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import org.chromium.base.process_launcher.FileDescriptorInfo;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: pM0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8656pM0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        return new FileDescriptorInfo(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new FileDescriptorInfo[i];
    }
}
